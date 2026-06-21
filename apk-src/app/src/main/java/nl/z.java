package nl;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f29578d = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29581c;

    public z a() {
        this.f29579a = false;
        return this;
    }

    public z b() {
        this.f29581c = 0L;
        return this;
    }

    public long c() {
        if (this.f29579a) {
            return this.f29580b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j10) {
        this.f29579a = true;
        this.f29580b = j10;
        return this;
    }

    public boolean e() {
        return this.f29579a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f29579a && this.f29580b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(pe.a.d(j10, "timeout < 0: ").toString());
        }
        this.f29581c = unit.toNanos(j10);
        return this;
    }
}
