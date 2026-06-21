package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class df0 extends q9.n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4561b;

    public /* synthetic */ df0(int i) {
        this.f4561b = i;
    }

    @Override // q9.o1
    public final void j0(q9.x1 x1Var) {
        switch (this.f4561b) {
            case 0:
            case 1:
                break;
            default:
                ti.t0 t0Var = q9.k2.d().f31930j;
                if (t0Var != null) {
                    k9.b bVar = x1Var == null ? null : new k9.b(x1Var.f31976b, x1Var.f31977c, x1Var.f31978d, null, 4);
                    hi.g gVar = t0Var.f33898b;
                    if (bVar == null) {
                        gVar.success(null);
                    } else {
                        gVar.b(Integer.toString(bVar.f28098c), (String) bVar.f28099d, (String) bVar.f28100e);
                    }
                }
                break;
        }
    }

    private final void l4(q9.x1 x1Var) {
    }

    private final void m4(q9.x1 x1Var) {
    }
}
