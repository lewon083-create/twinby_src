package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 implements h5, o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4462h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4463j;

    public d5(int i, int i10, long j10, long j11) {
        long jMax;
        this.f4455a = j10;
        this.f4456b = j11;
        this.f4457c = i10 == -1 ? 1 : i10;
        this.f4459e = i;
        if (j10 == -1) {
            this.f4458d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f4458d = j12;
            jMax = (Math.max(0L, j12) * 8000000) / ((long) i);
        }
        this.f4460f = jMax;
        this.f4461g = j11;
        this.f4462h = i;
        this.i = i10;
        this.f4463j = j10 == -1 ? -1L : j10;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        long j11 = this.f4458d;
        long j12 = this.f4456b;
        if (j11 == -1) {
            p2 p2Var = new p2(0L, j12);
            return new n2(p2Var, p2Var);
        }
        int i = this.f4459e;
        long j13 = this.f4457c;
        long jMin = (((((long) i) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = (Math.max(0L, jMax - j12) * 8000000) / ((long) i);
        p2 p2Var2 = new p2(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f4455a) {
                return new n2(p2Var2, new p2((Math.max(0L, j14 - j12) * 8000000) / ((long) i), j14));
            }
        }
        return new n2(p2Var2, p2Var2);
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long c() {
        return this.f4463j;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f4460f;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return this.f4458d != -1;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int k() {
        return this.f4462h;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long m(long j10) {
        return (Math.max(0L, j10 - this.f4456b) * 8000000) / ((long) this.f4459e);
    }
}
