package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f8540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8545f;

    public o1(q1 q1Var, long j10, long j11, long j12, long j13, long j14) {
        this.f8540a = q1Var;
        this.f8541b = j10;
        this.f8542c = j11;
        this.f8543d = j12;
        this.f8544e = j13;
        this.f8545f = j14;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        p2 p2Var = new p2(j10, p1.b(this.f8540a.b(j10), 0L, this.f8542c, this.f8543d, this.f8544e, this.f8545f));
        return new n2(p2Var, p2Var);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f8541b;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return true;
    }
}
