package io.sentry.cache.tape;

import a0.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l7.o;
import org.jetbrains.annotations.Nullable;
import pe.a;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class QueueFile implements Closeable, Iterable<byte[]> {
    static final int INITIAL_LENGTH = 4096;
    private static final int VERSIONED_HEADER = -2147483647;
    private static final byte[] ZEROES = new byte[4096];
    boolean closed;
    int elementCount;
    final File file;
    long fileLength;
    Element first;
    private Element last;
    private final int maxElements;
    RandomAccessFile raf;
    private final boolean zero;
    final int headerLength = 32;
    private final byte[] buffer = new byte[32];
    int modCount = 0;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Builder {
        final File file;
        boolean zero = true;
        int size = -1;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.file = file;
        }

        public QueueFile build() {
            RandomAccessFile randomAccessFileInitializeFromFile = QueueFile.initializeFromFile(this.file);
            try {
                return new QueueFile(this.file, randomAccessFileInitializeFromFile, this.zero, this.size);
            } catch (Throwable th2) {
                randomAccessFileInitializeFromFile.close();
                throw th2;
            }
        }

        public Builder size(int i) {
            this.size = i;
            return this;
        }

        public Builder zero(boolean z5) {
            this.zero = z5;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final long position;

        public Element(long j10, int i) {
            this.position = j10;
            this.length = i;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Element.class.getSimpleName());
            sb2.append("[position=");
            sb2.append(this.position);
            sb2.append(", length=");
            return z.d(this.length, "]", sb2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public final class ElementIterator implements Iterator<byte[]> {
        int expectedModCount;
        int nextElementIndex = 0;
        private long nextElementPosition;

        public ElementIterator() {
            this.nextElementPosition = QueueFile.this.first.position;
            this.expectedModCount = QueueFile.this.modCount;
        }

        private void checkForComodification() {
            if (QueueFile.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            return this.nextElementIndex != QueueFile.this.elementCount;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                QueueFile.this.remove();
                this.expectedModCount = QueueFile.this.modCount;
                this.nextElementIndex--;
            } catch (IOException e3) {
                throw ((Error) QueueFile.getSneakyThrowable(e3));
            }
        }

        @Override // java.util.Iterator
        public byte[] next() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i = this.nextElementIndex;
            QueueFile queueFile = QueueFile.this;
            if (i >= queueFile.elementCount) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    Element element = queueFile.readElement(this.nextElementPosition);
                    byte[] bArr = new byte[element.length];
                    long jWrapPosition = QueueFile.this.wrapPosition(element.position + 4);
                    this.nextElementPosition = jWrapPosition;
                    if (!QueueFile.this.ringRead(jWrapPosition, bArr, 0, element.length)) {
                        this.nextElementIndex = QueueFile.this.elementCount;
                        return QueueFile.ZEROES;
                    }
                    this.nextElementPosition = QueueFile.this.wrapPosition(element.position + 4 + ((long) element.length));
                    this.nextElementIndex++;
                    return bArr;
                } catch (IOException e3) {
                    throw ((Error) QueueFile.getSneakyThrowable(e3));
                } catch (OutOfMemoryError unused) {
                    QueueFile.this.resetFile();
                    this.nextElementIndex = QueueFile.this.elementCount;
                    return QueueFile.ZEROES;
                }
            } catch (IOException e7) {
                throw ((Error) QueueFile.getSneakyThrowable(e7));
            }
        }
    }

    public QueueFile(File file, RandomAccessFile randomAccessFile, boolean z5, int i) throws IOException {
        this.file = file;
        this.raf = randomAccessFile;
        this.zero = z5;
        this.maxElements = i;
        readInitialData();
    }

    private void expandIfNecessary(long j10) throws IOException {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long jRemainingBytes = remainingBytes();
        if (jRemainingBytes >= j13) {
            return;
        }
        long j14 = this.fileLength;
        do {
            jRemainingBytes += j14;
            j14 <<= 1;
        } while (jRemainingBytes < j13);
        setLength(j14);
        Element element = this.last;
        long jWrapPosition = wrapPosition(element.position + 4 + ((long) element.length));
        if (jWrapPosition <= this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            j11 = jWrapPosition - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.last.position;
        long j16 = this.first.position;
        if (j15 < j16) {
            long j17 = (this.fileLength + j15) - 32;
            writeHeader(j14, this.elementCount, j16, j17);
            this.last = new Element(j17, this.last.length);
            j12 = j14;
        } else {
            writeHeader(j14, this.elementCount, j16, j15);
            j12 = j14;
        }
        this.fileLength = j12;
        if (this.zero) {
            ringErase(32L, j11);
        }
    }

    public static RandomAccessFile initializeFromFile(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileOpen = open(file2);
            try {
                randomAccessFileOpen.setLength(4096L);
                randomAccessFileOpen.seek(0L);
                randomAccessFileOpen.writeInt(VERSIONED_HEADER);
                randomAccessFileOpen.writeLong(4096L);
                randomAccessFileOpen.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFileOpen.close();
                throw th2;
            }
        }
        return open(file);
    }

    private static RandomAccessFile open(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void readInitialData() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        this.fileLength = readLong(this.buffer, 4);
        this.elementCount = readInt(this.buffer, 12);
        long j10 = readLong(this.buffer, 16);
        long j11 = readLong(this.buffer, 24);
        if (this.fileLength <= this.raf.length()) {
            if (this.fileLength <= 32) {
                throw new IOException(a.h(new StringBuilder("File is corrupt; length stored in header ("), this.fileLength, ") is invalid."));
            }
            this.first = readElement(j10);
            this.last = readElement(j11);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private static long readLong(byte[] bArr, int i) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    private long remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFile() throws IOException {
        this.raf.close();
        this.file.delete();
        this.raf = initializeFromFile(this.file);
        readInitialData();
    }

    private void ringErase(long j10, long j11) throws IOException {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = ZEROES;
            int iMin = (int) Math.min(j11, bArr.length);
            ringWrite(j12, bArr, 0, iMin);
            long j13 = iMin;
            j11 -= j13;
            j12 += j13;
        }
    }

    private void ringWrite(long j10, byte[] bArr, int i, int i10) throws IOException {
        long jWrapPosition = wrapPosition(j10);
        long j11 = ((long) i10) + jWrapPosition;
        long j12 = this.fileLength;
        if (j11 <= j12) {
            this.raf.seek(jWrapPosition);
            this.raf.write(bArr, i, i10);
            return;
        }
        int i11 = (int) (j12 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.write(bArr, i, i11);
        this.raf.seek(32L);
        this.raf.write(bArr, i + i11, i10 - i11);
    }

    private void setLength(long j10) throws IOException {
        this.raf.setLength(j10);
        this.raf.getChannel().force(true);
    }

    private long usedBytes() {
        if (this.elementCount == 0) {
            return 32L;
        }
        Element element = this.last;
        long j10 = element.position;
        long j11 = this.first.position;
        return j10 >= j11 ? (j10 - j11) + 4 + ((long) element.length) + 32 : (((j10 + 4) + ((long) element.length)) + this.fileLength) - j11;
    }

    private void writeHeader(long j10, int i, long j11, long j12) throws IOException {
        this.raf.seek(0L);
        writeInt(this.buffer, 0, VERSIONED_HEADER);
        writeLong(this.buffer, 4, j10);
        writeInt(this.buffer, 12, i);
        writeLong(this.buffer, 16, j11);
        writeLong(this.buffer, 24, j12);
        this.raf.write(this.buffer, 0, 32);
    }

    private static void writeInt(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) (i10 >> 24);
        bArr[i + 1] = (byte) (i10 >> 16);
        bArr[i + 2] = (byte) (i10 >> 8);
        bArr[i + 3] = (byte) i10;
    }

    private static void writeLong(byte[] bArr, int i, long j10) {
        bArr[i] = (byte) (j10 >> 56);
        bArr[i + 1] = (byte) (j10 >> 48);
        bArr[i + 2] = (byte) (j10 >> 40);
        bArr[i + 3] = (byte) (j10 >> 32);
        bArr[i + 4] = (byte) (j10 >> 24);
        bArr[i + 5] = (byte) (j10 >> 16);
        bArr[i + 6] = (byte) (j10 >> 8);
        bArr[i + 7] = (byte) j10;
    }

    public void add(byte[] bArr) {
        add(bArr, 0, bArr.length);
    }

    public void clear() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        writeHeader(4096L, 0, 0L, 0L);
        if (this.zero) {
            this.raf.seek(32L);
            this.raf.write(ZEROES, 0, 4064);
        }
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096L);
        }
        this.fileLength = 4096L;
        this.modCount++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.raf.close();
    }

    public File file() {
        return this.file;
    }

    public boolean isAtFullCapacity() {
        return this.maxElements != -1 && size() == this.maxElements;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new ElementIterator();
    }

    @Nullable
    public byte[] peek() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        byte[] bArr = new byte[i];
        if (ringRead(element.position + 4, bArr, 0, i)) {
            return bArr;
        }
        return null;
    }

    public Element readElement(long j10) {
        return j10 == 0 ? Element.NULL : !ringRead(j10, this.buffer, 0, 4) ? Element.NULL : new Element(j10, readInt(this.buffer, 0));
    }

    public void remove() {
        remove(1);
    }

    public boolean ringRead(long j10, byte[] bArr, int i, int i10) throws IOException {
        try {
            long jWrapPosition = wrapPosition(j10);
            long j11 = ((long) i10) + jWrapPosition;
            long j12 = this.fileLength;
            if (j11 <= j12) {
                this.raf.seek(jWrapPosition);
                this.raf.readFully(bArr, i, i10);
                return true;
            }
            int i11 = (int) (j12 - jWrapPosition);
            this.raf.seek(jWrapPosition);
            this.raf.readFully(bArr, i, i11);
            this.raf.seek(32L);
            this.raf.readFully(bArr, i + i11, i10 - i11);
            return true;
        } catch (EOFException unused) {
            resetFile();
            return false;
        } catch (IOException e3) {
            throw e3;
        } catch (Throwable unused2) {
            resetFile();
            return false;
        }
    }

    public int size() {
        return this.elementCount;
    }

    public String toString() {
        return "QueueFile{file=" + this.file + ", zero=" + this.zero + ", length=" + this.fileLength + ", size=" + this.elementCount + ", first=" + this.first + ", last=" + this.last + '}';
    }

    public long wrapPosition(long j10) {
        long j11 = this.fileLength;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public void add(byte[] bArr, int i, int i10) {
        long jWrapPosition;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i | i10) < 0 || i10 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        expandIfNecessary(i10);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jWrapPosition = 32;
        } else {
            Element element = this.last;
            jWrapPosition = wrapPosition(element.position + 4 + ((long) element.length));
        }
        Element element2 = new Element(jWrapPosition, i10);
        writeInt(this.buffer, 0, i10);
        ringWrite(element2.position, this.buffer, 0, 4);
        ringWrite(element2.position + 4, bArr, i, i10);
        writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element2.position : this.first.position, element2.position);
        this.last = element2;
        this.elementCount++;
        this.modCount++;
        if (zIsEmpty) {
            this.first = element2;
        }
    }

    public void remove(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(u.k(i, "Cannot remove negative (", ") number of elements."));
        }
        if (i == 0) {
            return;
        }
        if (i == this.elementCount) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i > this.elementCount) {
            throw new IllegalArgumentException(z.d(this.elementCount, ").", o.m(i, "Cannot remove more elements (", ") than present in queue (")));
        }
        Element element = this.first;
        long j10 = element.position;
        int i10 = element.length;
        long j11 = 0;
        int i11 = 0;
        long j12 = j10;
        while (i11 < i) {
            j11 += (long) (i10 + 4);
            long jWrapPosition = wrapPosition(j12 + 4 + ((long) i10));
            if (!ringRead(jWrapPosition, this.buffer, 0, 4)) {
                return;
            }
            i10 = readInt(this.buffer, 0);
            i11++;
            j12 = jWrapPosition;
        }
        writeHeader(this.fileLength, this.elementCount - i, j12, this.last.position);
        this.elementCount -= i;
        this.modCount++;
        this.first = new Element(j12, i10);
        if (this.zero) {
            ringErase(j10, j11);
        }
    }

    public static <T extends Throwable> T getSneakyThrowable(Throwable th2) throws Throwable {
        throw th2;
    }
}
