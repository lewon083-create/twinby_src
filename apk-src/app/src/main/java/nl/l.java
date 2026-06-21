package nl;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f29545e;

    public l(z delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f29545e = delegate;
    }

    @Override // nl.z
    public final z a() {
        return this.f29545e.a();
    }

    @Override // nl.z
    public final z b() {
        return this.f29545e.b();
    }

    @Override // nl.z
    public final long c() {
        return this.f29545e.c();
    }

    @Override // nl.z
    public final z d(long j10) {
        return this.f29545e.d(j10);
    }

    @Override // nl.z
    public final boolean e() {
        return this.f29545e.e();
    }

    @Override // nl.z
    public final void f() throws InterruptedIOException {
        this.f29545e.f();
    }

    @Override // nl.z
    public final z g(long j10) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f29545e.g(j10);
    }
}
