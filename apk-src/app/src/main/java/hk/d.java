package hk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f20651a;

    public d(c[] cVarArr) {
        this.f20651a = cVarArr;
    }

    @Override // hk.i
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f20651a) {
            m0 m0Var = cVar.f20639g;
            if (m0Var == null) {
                Intrinsics.g("handle");
                throw null;
            }
            m0Var.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f20651a + ']';
    }
}
