package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f7743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0 f7744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7745c;

    public m2(long j10, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        ix.o(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f7743a = new lg0(length2, 0);
            this.f7744b = new lg0(length2, 0);
        } else {
            int i = length2 + 1;
            lg0 lg0Var = new lg0(i, 0);
            this.f7743a = lg0Var;
            lg0 lg0Var2 = new lg0(i, 0);
            this.f7744b = lg0Var2;
            lg0Var.d();
            lg0Var2.d();
        }
        this.f7743a.e(jArr);
        this.f7744b.e(jArr2);
        this.f7745c = j10;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        lg0 lg0Var = this.f7744b;
        int i = lg0Var.f7509a;
        if (i == 0) {
            p2 p2Var = p2.f8886c;
            return new n2(p2Var, p2Var);
        }
        String str = cq0.f4293a;
        int i10 = i - 1;
        int i11 = 0;
        int i12 = 0;
        while (i12 <= i10) {
            int i13 = (i12 + i10) >>> 1;
            if (lg0Var.f(i13) < j10) {
                i12 = i13 + 1;
            } else {
                i10 = i13 - 1;
            }
        }
        int i14 = i10 + 1;
        if (i14 < lg0Var.f7509a && lg0Var.f(i14) == j10) {
            i11 = i14;
        } else if (i10 != -1) {
            i11 = i10;
        }
        long jF = lg0Var.f(i11);
        lg0 lg0Var2 = this.f7743a;
        p2 p2Var2 = new p2(jF, lg0Var2.f(i11));
        if (jF == j10 || i11 == lg0Var.f7509a - 1) {
            return new n2(p2Var2, p2Var2);
        }
        int i15 = i11 + 1;
        return new n2(p2Var2, new p2(lg0Var.f(i15), lg0Var2.f(i15)));
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f7745c;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return this.f7744b.f7509a > 0;
    }
}
