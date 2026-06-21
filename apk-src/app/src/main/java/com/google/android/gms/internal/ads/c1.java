package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f3992c;

    public /* synthetic */ c1(g1 g1Var, long j10, int i) {
        this.f3991b = 1;
        this.f3992c = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3991b;
        g1 g1Var = this.f3992c;
        g1Var.getClass();
        switch (i) {
            case 0:
                String str = cq0.f4293a;
                bv1 bv1Var = g1Var.f5591b.f6261b.f8792t;
                bv1Var.r(bv1Var.y(), 1016, new jl1(24, (byte) 0));
                break;
            case 1:
                String str2 = cq0.f4293a;
                bv1 bv1Var2 = g1Var.f5591b.f6261b.f8792t;
                bv1Var2.r(bv1Var2.w((hy1) bv1Var2.f3917d.f6145f), 1021, new jl1(27, (byte) 0));
                break;
            case 2:
                String str3 = cq0.f4293a;
                bv1 bv1Var3 = g1Var.f5591b.f6261b.f8792t;
                bv1Var3.r(bv1Var3.y(), 1019, new jl1(25, (byte) 0));
                break;
            case 3:
                String str4 = cq0.f4293a;
                bv1 bv1Var4 = g1Var.f5591b.f6261b.f8792t;
                bv1Var4.r(bv1Var4.y(), 1030, new jl1(28, (byte) 0));
                break;
            default:
                String str5 = cq0.f4293a;
                bv1 bv1Var5 = g1Var.f5591b.f6261b.f8792t;
                bv1Var5.r(bv1Var5.y(), 1015, new jl1(23, (byte) 0));
                break;
        }
    }

    public /* synthetic */ c1(g1 g1Var, Object obj, int i) {
        this.f3991b = i;
        this.f3992c = g1Var;
    }

    public /* synthetic */ c1(g1 g1Var, String str, long j10, long j11) {
        this.f3991b = 0;
        this.f3992c = g1Var;
    }
}
