package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 implements r6, l5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7403h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f7407m;

    public l6(t6 t6Var, long j10, long j11, long j12, long j13, boolean z5) {
        ix.o(j10 >= 0 && j11 > j10);
        this.f7407m = t6Var;
        this.f7397b = j10;
        this.f7398c = j11;
        if (j12 == j11 - j10 || z5) {
            this.f7400e = j13;
            this.f7399d = 4;
        } else {
            this.f7399d = 0;
        }
        this.f7406l = new q6(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.r6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(com.google.android.gms.internal.ads.a2 r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l6.a(com.google.android.gms.internal.ads.a2):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    @Override // l5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long e(q4.l r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l6.e(q4.l):long");
    }

    @Override // com.google.android.gms.internal.ads.r6
    public void f(long j10) {
        long j11 = this.f7400e - 1;
        String str = cq0.f4293a;
        this.f7402g = Math.max(0L, Math.min(j10, j11));
        this.f7399d = 2;
        this.f7403h = this.f7397b;
        this.i = this.f7398c;
        this.f7404j = 0L;
        this.f7405k = this.f7400e;
    }

    @Override // l5.d
    public q4.t j() {
        if (this.f7400e != 0) {
            return new l5.a(this);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r6
    public /* bridge */ /* synthetic */ o2 l() {
        if (this.f7400e != 0) {
            return new k6(this);
        }
        return null;
    }

    @Override // l5.d
    public void o(long j10) {
        this.f7402g = m3.z.k(j10, 0L, this.f7400e - 1);
        this.f7399d = 2;
        this.f7403h = this.f7397b;
        this.i = this.f7398c;
        this.f7404j = 0L;
        this.f7405k = this.f7400e;
    }

    public l6(t6 t6Var, long j10, long j11, long j12, long j13, boolean z5, boolean z10) {
        com.google.android.gms.internal.measurement.h5.h(j10 >= 0 && j11 > j10);
        this.f7407m = t6Var;
        this.f7397b = j10;
        this.f7398c = j11;
        if (j12 != j11 - j10 && !z5) {
            this.f7399d = 0;
        } else {
            this.f7400e = j13;
            this.f7399d = 4;
        }
        this.f7406l = new q6(1);
    }
}
