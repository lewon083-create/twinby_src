package nl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements v {

    @NotNull
    private final v delegate;

    public k(v delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final v m624deprecated_delegate() {
        return this.delegate;
    }

    @Override // nl.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final v delegate() {
        return this.delegate;
    }

    @Override // nl.v, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // nl.v
    @NotNull
    public z timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // nl.v
    public void write(g source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j10);
    }
}
