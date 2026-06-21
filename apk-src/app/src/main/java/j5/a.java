package j5;

import q4.s;
import q4.t;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26528h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f26530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f26532m;

    public a(long j10, long j11, int i, int i10, boolean z5, boolean z10) {
        this.f26521a = j10;
        this.f26522b = j11;
        this.f26523c = i10 == -1 ? 1 : i10;
        this.f26525e = i;
        this.f26527g = z5;
        this.f26528h = z10;
        if (j10 == -1) {
            this.f26524d = -1L;
            this.f26526f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f26524d = j12;
            this.f26526f = (Math.max(0L, j12) * 8000000) / ((long) i);
        }
        this.i = j11;
        this.f26529j = i;
        this.f26530k = i10;
        this.f26531l = z5;
        this.f26532m = j10 == -1 ? -1L : j10;
    }

    @Override // q4.t
    public final boolean a() {
        return this.f26524d != -1 || this.f26527g;
    }

    @Override // j5.h
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f26522b) * 8000000) / ((long) this.f26525e);
    }

    @Override // j5.h
    public final long c() {
        return this.f26532m;
    }

    @Override // q4.t
    public final boolean d() {
        return this.f26528h;
    }

    @Override // q4.t
    public final s e(long j10) {
        long j11 = this.f26524d;
        long j12 = this.f26522b;
        if (j11 == -1 && !this.f26527g) {
            u uVar = new u(0L, j12);
            return new s(uVar, uVar);
        }
        int i = this.f26525e;
        long j13 = this.f26523c;
        long jMin = (((((long) i) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = (Math.max(0L, jMax - j12) * 8000000) / ((long) i);
        u uVar2 = new u(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f26521a) {
                return new s(uVar2, new u((Math.max(0L, j14 - j12) * 8000000) / ((long) i), j14));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override // j5.h
    public final int f() {
        return this.f26529j;
    }

    @Override // q4.t
    public final long g() {
        return this.f26526f;
    }
}
