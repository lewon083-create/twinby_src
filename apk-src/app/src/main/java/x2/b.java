package x2;

import a0.u;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataInputStream f35714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteOrder f35716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f35717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35718f;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f35718f = bArr.length;
    }

    public final void a(int i) throws IOException {
        int i10 = 0;
        while (i10 < i) {
            int i11 = i - i10;
            DataInputStream dataInputStream = this.f35714b;
            int iSkip = (int) dataInputStream.skip(i11);
            if (iSkip <= 0) {
                if (this.f35717e == null) {
                    this.f35717e = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f35717e, 0, Math.min(8192, i11));
                if (iSkip == -1) {
                    throw new EOFException(u.k(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += iSkip;
        }
        this.f35715c += i10;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f35714b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f35715c++;
        return this.f35714b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f35715c++;
        return this.f35714b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f35715c++;
        int i = this.f35714b.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f35715c += 2;
        return this.f35714b.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i10) throws IOException {
        this.f35715c += i10;
        this.f35714b.readFully(bArr, i, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f35715c += 4;
        DataInputStream dataInputStream = this.f35714b;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f35716d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f35716d);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j10;
        long j11;
        this.f35715c += 8;
        DataInputStream dataInputStream = this.f35714b;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f35716d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j10 = (((long) i16) << 56) + (((long) i15) << 48) + (((long) i14) << 40) + (((long) i13) << 32) + (((long) i12) << 24) + (((long) i11) << 16) + (((long) i10) << 8);
            j11 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f35716d);
            }
            j10 = (((long) i) << 56) + (((long) i10) << 48) + (((long) i11) << 40) + (((long) i12) << 32) + (((long) i13) << 24) + (((long) i14) << 16) + (((long) i15) << 8);
            j11 = i16;
        }
        return j10 + j11;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f35715c += 2;
        DataInputStream dataInputStream = this.f35714b;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f35716d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i10 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f35716d);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f35715c += 2;
        return this.f35714b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f35715c++;
        return this.f35714b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f35715c += 2;
        DataInputStream dataInputStream = this.f35714b;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f35716d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i10 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f35716d);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f35714b.read(bArr, i, i10);
        this.f35715c += i11;
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f35715c += bArr.length;
        this.f35714b.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f35714b = dataInputStream;
        dataInputStream.mark(0);
        this.f35715c = 0;
        this.f35716d = byteOrder;
        this.f35718f = inputStream instanceof b ? ((b) inputStream).f35718f : -1;
    }
}
