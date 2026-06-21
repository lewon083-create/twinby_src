package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs1 f6039b;

    public /* synthetic */ h60(rs1 rs1Var, int i) {
        this.f6038a = i;
        this.f6039b = rs1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6038a) {
            case 0:
                return new g60(this.f6039b.j());
            case 1:
                return new n60(this.f6039b.j());
            case 2:
                q60 q60Var = new q60(this.f6039b.j());
                q60Var.f9356d = false;
                return q60Var;
            case 3:
                return new u60(this.f6039b.j());
            case 4:
                return new w60(this.f6039b.j());
            case 5:
                return new y60(this.f6039b.j());
            case 6:
                return new a70(this.f6039b.j());
            case 7:
                return new c70(this.f6039b.j());
            case 8:
                return new d70(this.f6039b.j());
            case 9:
                return new f70(this.f6039b.j());
            case 10:
                i70 i70Var = new i70(this.f6039b.j());
                i70Var.f6407d = false;
                return i70Var;
            case 11:
                return new p70(this.f6039b.j());
            case 12:
                return new t70(this.f6039b.j());
            case 13:
                return new v70(this.f6039b.j());
            case 14:
                return new x70(this.f6039b.j());
            case 15:
                return new z70(this.f6039b.j());
            case 16:
                return new b80(this.f6039b.j());
            case 17:
                return new j80(this.f6039b.j());
            case 18:
                return new p80(this.f6039b.j());
            case 19:
                return new q80(this.f6039b.j());
            case 20:
                return new u80(this.f6039b.j());
            case 21:
                return new w80(this.f6039b.j());
            case 22:
                return new y80(this.f6039b.j());
            case 23:
                return new a90(this.f6039b.j());
            case 24:
                return new b90(this.f6039b.j());
            default:
                return new qr0(this.f6039b.j());
        }
    }
}
