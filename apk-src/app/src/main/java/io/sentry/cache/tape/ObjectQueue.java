package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ObjectQueue<T> implements Iterable<T>, Closeable {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Converter<T> {
        @Nullable
        T from(byte[] bArr);

        void toStream(T t10, OutputStream outputStream);
    }

    public static <T> ObjectQueue<T> create(QueueFile queueFile, Converter<T> converter) {
        return new FileObjectQueue(queueFile, converter);
    }

    public static <T> ObjectQueue<T> createEmpty() {
        return new EmptyObjectQueue();
    }

    public abstract void add(T t10);

    public List<T> asList() {
        return peek(size());
    }

    public void clear() {
        remove(size());
    }

    @Nullable
    public abstract QueueFile file();

    public boolean isEmpty() {
        return size() == 0;
    }

    @Nullable
    public abstract T peek();

    public List<T> peek(int i) {
        int iMin = Math.min(i, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void remove() {
        remove(1);
    }

    public abstract void remove(int i);

    public abstract int size();
}
