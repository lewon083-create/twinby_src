package com.google.android.gms.internal.ads;

import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 implements h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f6719g;

    public j5(long j10, int i, long j11, int i10, long j12, long[] jArr) {
        this.f6713a = j10;
        this.f6714b = i;
        this.f6715c = j11;
        this.f6716d = i10;
        this.f6717e = j12;
        this.f6719g = jArr;
        this.f6718f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        double d10;
        double d11;
        boolean zJ = j();
        int i = this.f6714b;
        long j11 = this.f6713a;
        if (!zJ) {
            p2 p2Var = new p2(0L, j11 + ((long) i));
            return new n2(p2Var, p2Var);
        }
        String str = cq0.f4293a;
        long j12 = this.f6715c;
        long jMax = Math.max(0L, Math.min(j10, j12));
        double d12 = (jMax * 100.0d) / j12;
        double d13 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (d12 <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.f6719g;
            jArr.getClass();
            double d14 = jArr[i10];
            if (i10 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i10 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i10))) + d14;
        }
        long j13 = this.f6717e;
        p2 p2Var2 = new p2(jMax, j11 + Math.max(i, Math.min(Math.round((d13 / d10) * j13), j13 - 1)));
        return new n2(p2Var2, p2Var2);
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long c() {
        return this.f6718f;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f6715c;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return this.f6719g != null;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int k() {
        return this.f6716d;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long m(long j10) {
        if (!j()) {
            return 0L;
        }
        long j11 = j10 - this.f6713a;
        if (j11 <= this.f6714b) {
            return 0L;
        }
        long[] jArr = this.f6719g;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.f6717e;
        int iQ = cq0.q(jArr, (long) d10, true);
        long j12 = this.f6715c;
        long j13 = (((long) iQ) * j12) / 100;
        long j14 = jArr[iQ];
        int i = iQ + 1;
        long j15 = (j12 * ((long) i)) / 100;
        return Math.round((j14 == (iQ == 99 ? 256L : jArr[i]) ? ConfigValue.DOUBLE_DEFAULT_VALUE : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }
}
