package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hy1 f4341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv1 f4344g;

    public cv1(dv1 dv1Var, String str, int i, hy1 hy1Var) {
        this.f4344g = dv1Var;
        this.f4338a = str;
        this.f4339b = i;
        this.f4340c = hy1Var == null ? -1L : hy1Var.f6302d;
        if (hy1Var == null || !hy1Var.b()) {
            return;
        }
        this.f4341d = hy1Var;
    }

    public final boolean a(ci ciVar, ci ciVar2) {
        hy1 hy1Var;
        int i = this.f4339b;
        if (i < ciVar.a()) {
            dv1 dv1Var = this.f4344g;
            nh nhVar = dv1Var.f4685a;
            ciVar.b(i, nhVar, 0L);
            for (int i10 = nhVar.f8307k; i10 <= nhVar.f8308l; i10++) {
                int iE = ciVar2.e(ciVar.f(i10));
                if (iE != -1) {
                    i = ciVar2.d(iE, dv1Var.f4686b, false).f3786c;
                    break;
                }
            }
            i = -1;
        } else if (i >= ciVar2.a()) {
            i = -1;
        }
        this.f4339b = i;
        return i != -1 && ((hy1Var = this.f4341d) == null || ciVar2.e(hy1Var.f6299a) != -1);
    }

    public final boolean b(xu1 xu1Var) {
        hy1 hy1Var = xu1Var.f12334d;
        if (hy1Var == null) {
            return this.f4339b != xu1Var.f12333c;
        }
        long j10 = this.f4340c;
        if (j10 == -1) {
            return false;
        }
        long j11 = hy1Var.f6302d;
        if (j11 > j10) {
            return true;
        }
        hy1 hy1Var2 = this.f4341d;
        if (hy1Var2 == null) {
            return false;
        }
        ci ciVar = xu1Var.f12332b;
        int iE = ciVar.e(hy1Var.f6299a);
        int iE2 = ciVar.e(hy1Var2.f6299a);
        long j12 = hy1Var2.f6302d;
        int i = hy1Var2.f6300b;
        if (j11 < j12 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!hy1Var.b()) {
            int i10 = hy1Var.f6303e;
            return i10 == -1 || i10 > i;
        }
        int i11 = hy1Var.f6300b;
        int i12 = hy1Var.f6301c;
        if (i11 <= i) {
            return i11 == i && i12 > hy1Var2.f6301c;
        }
        return true;
    }
}
