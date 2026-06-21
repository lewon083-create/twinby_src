package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt1 implements td0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu1 f7296c;

    public /* synthetic */ kt1(lu1 lu1Var, int i) {
        this.f7295b = 2;
        this.f7296c = lu1Var;
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo0a(Object obj) {
        int i = this.f7295b;
        lu1 lu1Var = this.f7296c;
        te teVar = (te) obj;
        switch (i) {
            case 0:
                int i10 = ot1.f8771f0;
                boolean z5 = lu1Var.f7638g;
                teVar.c();
                break;
            case 1:
                int i11 = ot1.f8771f0;
                int i12 = lu1Var.f7644n;
                teVar.n();
                break;
            default:
                int i13 = ot1.f8771f0;
                ci ciVar = lu1Var.f7632a;
                teVar.j();
                break;
        }
    }

    public /* synthetic */ kt1(lu1 lu1Var, int i, byte b2) {
        this.f7295b = i;
        this.f7296c = lu1Var;
    }
}
