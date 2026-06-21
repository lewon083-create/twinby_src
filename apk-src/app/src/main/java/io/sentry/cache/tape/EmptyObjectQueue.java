package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class EmptyObjectQueue<T> extends ObjectQueue<T> {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class EmptyIterator<T> implements Iterator<T> {
        private EmptyIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    @Nullable
    public QueueFile file() {
        return null;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new EmptyIterator();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    @Nullable
    public T peek() {
        return null;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public int size() {
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void add(T t10) {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove(int i) {
    }
}
