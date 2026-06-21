package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ns1 implements rm1, qm1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm1 f41345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qm1 f41347d;

    public ns1(rm1 rm1Var, long j10) {
        this.f41345b = rm1Var;
        this.f41346c = j10;
    }

    @Override // yads.rm1
    public final long a(long j10, zw2 zw2Var) {
        return this.f41345b.a(j10 - this.f41346c, zw2Var) + this.f41346c;
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        return this.f41345b.continueLoading(j10 - this.f41346c);
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) {
        this.f41345b.discardBuffer(j10 - this.f41346c, z5);
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f41345b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f41346c;
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f41345b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f41346c;
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        return this.f41345b.getTrackGroups();
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        return this.f41345b.isLoading();
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() {
        this.f41345b.maybeThrowPrepareError();
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        long discontinuity = this.f41345b.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.f41346c;
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        this.f41345b.reevaluateBuffer(j10 - this.f41346c);
    }

    @Override // yads.rm1
    public final long seekToUs(long j10) {
        return this.f41345b.seekToUs(j10 - this.f41346c) + this.f41346c;
    }

    @Override // yads.tx2
    public final void a(ux2 ux2Var) {
        qm1 qm1Var = this.f41347d;
        qm1Var.getClass();
        qm1Var.a((ux2) this);
    }

    @Override // yads.qm1
    public final void a(rm1 rm1Var) {
        qm1 qm1Var = this.f41347d;
        qm1Var.getClass();
        qm1Var.a((rm1) this);
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        this.f41347d = qm1Var;
        this.f41345b.a(this, j10 - this.f41346c);
    }

    @Override // yads.rm1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ps2[] ps2VarArr, boolean[] zArr2, long j10) {
        ps2[] ps2VarArr2 = new ps2[ps2VarArr.length];
        int i = 0;
        while (true) {
            ps2 ps2Var = null;
            if (i >= ps2VarArr.length) {
                break;
            }
            os1 os1Var = (os1) ps2VarArr[i];
            if (os1Var != null) {
                ps2Var = os1Var.f41692b;
            }
            ps2VarArr2[i] = ps2Var;
            i++;
        }
        long jA = this.f41345b.a(pp0VarArr, zArr, ps2VarArr2, zArr2, j10 - this.f41346c);
        for (int i10 = 0; i10 < ps2VarArr.length; i10++) {
            ps2 ps2Var2 = ps2VarArr2[i10];
            if (ps2Var2 == null) {
                ps2VarArr[i10] = null;
            } else {
                ps2 ps2Var3 = ps2VarArr[i10];
                if (ps2Var3 == null || ((os1) ps2Var3).f41692b != ps2Var2) {
                    ps2VarArr[i10] = new os1(ps2Var2, this.f41346c);
                }
            }
        }
        return jA + this.f41346c;
    }
}
