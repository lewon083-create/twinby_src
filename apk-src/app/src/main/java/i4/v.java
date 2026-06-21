package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements a0, z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f21019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb.e f21021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f21022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f21023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f21024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21025h = -9223372036854775807L;

    public v(c0 c0Var, bb.e eVar, long j10) {
        this.f21019b = c0Var;
        this.f21021d = eVar;
        this.f21020c = j10;
    }

    public final void a(c0 c0Var) {
        long j10 = this.f21025h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f21020c;
        }
        a aVar = this.f21022e;
        aVar.getClass();
        a0 a0VarB = aVar.b(c0Var, this.f21021d, j10);
        this.f21023f = a0VarB;
        if (this.f21024g != null) {
            a0VarB.k(this, j10);
        }
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.b(j10, c1Var);
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        z zVar = this.f21024g;
        String str = m3.z.f28608a;
        zVar.d(this);
    }

    @Override // i4.a0
    public final long f(l4.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f21025h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f21020c) ? j10 : j11;
        this.f21025h = -9223372036854775807L;
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.f(rVarArr, zArr, b1VarArr, zArr2, j12);
    }

    @Override // i4.a0
    public final void g(long j10) {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        a0Var.g(j10);
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.getBufferedPositionUs();
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.getNextLoadPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.getTrackGroups();
    }

    @Override // i4.d1
    public final boolean isLoading() {
        a0 a0Var = this.f21023f;
        return a0Var != null && a0Var.isLoading();
    }

    @Override // i4.z
    public final void j(a0 a0Var) {
        z zVar = this.f21024g;
        String str = m3.z.f28608a;
        zVar.j(this);
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f21024g = zVar;
        a0 a0Var = this.f21023f;
        if (a0Var != null) {
            long j11 = this.f21025h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f21020c;
            }
            a0Var.k(this, j11);
        }
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        a0 a0Var = this.f21023f;
        return a0Var != null && a0Var.l(h0Var);
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() {
        a0 a0Var = this.f21023f;
        if (a0Var != null) {
            a0Var.maybeThrowPrepareError();
            return;
        }
        a aVar = this.f21022e;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.readDiscontinuity();
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        a0Var.reevaluateBuffer(j10);
    }

    @Override // i4.a0
    public final long seekToUs(long j10) {
        a0 a0Var = this.f21023f;
        String str = m3.z.f28608a;
        return a0Var.seekToUs(j10);
    }
}
