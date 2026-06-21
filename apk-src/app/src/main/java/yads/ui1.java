package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ui1 implements rm1, qm1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an1 f43675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qe f43677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mo f43678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rm1 f43679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qm1 f43680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43681h = -9223372036854775807L;

    public ui1(an1 an1Var, qe qeVar, long j10) {
        this.f43675b = an1Var;
        this.f43677d = qeVar;
        this.f43676c = j10;
    }

    public final void a(an1 an1Var) {
        long j10 = this.f43676c;
        long j11 = this.f43681h;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        mo moVar = this.f43678e;
        moVar.getClass();
        rm1 rm1VarA = moVar.a(an1Var, this.f43677d, j10);
        this.f43679f = rm1VarA;
        if (this.f43680g != null) {
            rm1VarA.a(this, j10);
        }
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        rm1 rm1Var = this.f43679f;
        return rm1Var != null && rm1Var.continueLoading(j10);
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        rm1Var.discardBuffer(j10, z5);
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.getBufferedPositionUs();
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.getNextLoadPositionUs();
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.getTrackGroups();
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        rm1 rm1Var = this.f43679f;
        return rm1Var != null && rm1Var.isLoading();
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() {
        rm1 rm1Var = this.f43679f;
        if (rm1Var != null) {
            rm1Var.maybeThrowPrepareError();
            return;
        }
        mo moVar = this.f43678e;
        if (moVar != null) {
            moVar.d();
        }
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.readDiscontinuity();
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        rm1Var.reevaluateBuffer(j10);
    }

    @Override // yads.rm1
    public final long seekToUs(long j10) {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.seekToUs(j10);
    }

    @Override // yads.rm1
    public final long a(long j10, zw2 zw2Var) {
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.a(j10, zw2Var);
    }

    @Override // yads.tx2
    public final void a(ux2 ux2Var) {
        qm1 qm1Var = this.f43680g;
        int i = lb3.f40466a;
        qm1Var.a((ux2) this);
    }

    @Override // yads.qm1
    public final void a(rm1 rm1Var) {
        qm1 qm1Var = this.f43680g;
        int i = lb3.f40466a;
        qm1Var.a((rm1) this);
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        this.f43680g = qm1Var;
        rm1 rm1Var = this.f43679f;
        if (rm1Var != null) {
            long j11 = this.f43676c;
            long j12 = this.f43681h;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            rm1Var.a(this, j11);
        }
    }

    public final void a() {
        if (this.f43679f != null) {
            mo moVar = this.f43678e;
            moVar.getClass();
            moVar.a(this.f43679f);
        }
    }

    @Override // yads.rm1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ps2[] ps2VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f43681h;
        if (j12 == -9223372036854775807L || j10 != this.f43676c) {
            j11 = j10;
        } else {
            this.f43681h = -9223372036854775807L;
            j11 = j12;
        }
        rm1 rm1Var = this.f43679f;
        int i = lb3.f40466a;
        return rm1Var.a(pp0VarArr, zArr, ps2VarArr, zArr2, j11);
    }

    public final void a(mo moVar) {
        if (this.f43678e == null) {
            this.f43678e = moVar;
            return;
        }
        throw new IllegalStateException();
    }
}
