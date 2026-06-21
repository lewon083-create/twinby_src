package q4;

import com.google.android.gms.internal.ads.p1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f31720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31725f;

    public c(d dVar, long j10, long j11, long j12, long j13, long j14) {
        this.f31720a = dVar;
        this.f31721b = j10;
        this.f31722c = j11;
        this.f31723d = j12;
        this.f31724e = j13;
        this.f31725f = j14;
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // q4.t
    public final s e(long j10) {
        u uVar = new u(j10, p1.a(this.f31720a.b(j10), 0L, this.f31722c, this.f31723d, this.f31724e, this.f31725f));
        return new s(uVar, uVar);
    }

    @Override // q4.t
    public final long g() {
        return this.f31721b;
    }
}
