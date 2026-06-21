package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ov extends kv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.v f8813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8814d;

    public /* synthetic */ ov(k9.v vVar, Object obj, int i) {
        this.f8812b = i;
        this.f8813c = vVar;
        this.f8814d = obj;
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void a(q9.x1 x1Var) {
        switch (this.f8812b) {
            case 0:
                ea.b bVar = (ea.b) this.f8813c;
                if (bVar != null) {
                    bVar.d(x1Var.e());
                }
                break;
            default:
                ea.b bVar2 = (ea.b) this.f8813c;
                if (bVar2 != null) {
                    bVar2.d(x1Var.e());
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void i() {
        sv svVar;
        switch (this.f8812b) {
            case 0:
                ea.b bVar = (ea.b) this.f8813c;
                if (bVar != null) {
                    bVar.i((nv) this.f8814d);
                }
                break;
            default:
                ea.b bVar2 = (ea.b) this.f8813c;
                if (bVar2 != null && (svVar = (sv) this.f8814d) != null) {
                    bVar2.i(svVar);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void t(int i) {
        int i10 = this.f8812b;
    }

    private final void l4(int i) {
    }

    private final void m4(int i) {
    }
}
