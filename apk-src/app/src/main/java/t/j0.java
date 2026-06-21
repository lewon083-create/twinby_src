package t;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements f0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f33122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33123c;

    public j0(m0 m0Var, j0.i iVar, int i) {
        this.f33122b = m0Var;
        this.f33121a = iVar;
        this.f33123c = i;
    }

    @Override // f0.h
    public final ed.d a() {
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "invokePreCapture");
        return k0.j.j(k0.d.b(this.f33122b.a(this.f33123c)), new v7.f(25, new qg.a(21)), this.f33121a);
    }

    @Override // f0.h
    public final ed.d b() {
        return i0.o.w(new s3.q(5, this));
    }
}
