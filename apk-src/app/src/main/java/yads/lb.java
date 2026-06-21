package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lb implements h32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0 f40461a;

    public lb(jx0 jx0Var) {
        this.f40461a = jx0Var;
    }

    @Override // yads.h32
    public final void a(z51 z51Var) {
        nm2 nm2Var = this.f40461a.f40005a;
        dk.i iVar = jx0.f40004b[0];
        nm2Var.getClass();
        nm2Var.f41294a = new WeakReference(z51Var);
    }
}
