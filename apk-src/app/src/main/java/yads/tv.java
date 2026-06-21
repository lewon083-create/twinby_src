package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tv implements rm1, qm1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm1 f43445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qm1 f43446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sv[] f43447d = new sv[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vv f43451h;

    public tv(rm1 rm1Var, boolean z5, long j10, long j11) {
        this.f43445b = rm1Var;
        this.f43448e = z5 ? j10 : -9223372036854775807L;
        this.f43449f = j10;
        this.f43450g = j11;
    }

    @Override // yads.rm1
    public final long a(long j10, zw2 zw2Var) {
        long j11 = this.f43449f;
        if (j10 == j11) {
            return j11;
        }
        int i = lb3.f40466a;
        long jMax = Math.max(0L, Math.min(zw2Var.f45575a, j10 - j11));
        long j12 = zw2Var.f45576b;
        long j13 = this.f43450g;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != zw2Var.f45575a || jMax2 != zw2Var.f45576b) {
            zw2Var = new zw2(jMax, jMax2);
        }
        return this.f43445b.a(j10, zw2Var);
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        return this.f43445b.continueLoading(j10);
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) {
        this.f43445b.discardBuffer(j10, z5);
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f43445b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f43450g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f43445b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f43450g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        return this.f43445b.getTrackGroups();
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        return this.f43445b.isLoading();
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() throws vv {
        vv vvVar = this.f43451h;
        if (vvVar != null) {
            throw vvVar;
        }
        this.f43445b.maybeThrowPrepareError();
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        long j10 = this.f43448e;
        if (j10 != -9223372036854775807L) {
            this.f43448e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f43445b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (discontinuity2 < this.f43449f) {
            throw new IllegalStateException();
        }
        long j11 = this.f43450g;
        if (j11 == Long.MIN_VALUE || discontinuity2 <= j11) {
            return discontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        this.f43445b.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // yads.rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f43448e = r0
            yads.sv[] r0 = r5.f43447d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f43089c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            yads.rm1 r0 = r5.f43445b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L3a
            long r6 = r5.f43449f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f43450g
            r2 = -9223372036854775808
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L3a
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
            goto L3a
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tv.seekToUs(long):long");
    }

    @Override // yads.tx2
    public final void a(ux2 ux2Var) {
        qm1 qm1Var = this.f43446c;
        qm1Var.getClass();
        qm1Var.a((ux2) this);
    }

    @Override // yads.qm1
    public final void a(rm1 rm1Var) {
        if (this.f43451h != null) {
            return;
        }
        qm1 qm1Var = this.f43446c;
        qm1Var.getClass();
        qm1Var.a((rm1) this);
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        this.f43446c = qm1Var;
        this.f43445b.a(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r11 > r1) goto L32;
     */
    @Override // yads.rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.pp0[] r18, boolean[] r19, yads.ps2[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            int r1 = r8.length
            yads.sv[] r1 = new yads.sv[r1]
            r0.f43447d = r1
            int r1 = r8.length
            yads.ps2[] r4 = new yads.ps2[r1]
            r9 = 0
            r1 = r9
        Le:
            int r2 = r8.length
            r10 = 0
            if (r1 >= r2) goto L23
            yads.sv[] r2 = r0.f43447d
            r3 = r8[r1]
            yads.sv r3 = (yads.sv) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            yads.ps2 r10 = r3.f43088b
        L1e:
            r4[r1] = r10
            int r1 = r1 + 1
            goto Le
        L23:
            yads.rm1 r1 = r0.f43445b
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            long r11 = r1.a(r2, r3, r4, r5, r6)
            long r5 = r0.f43448e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L63
            long r5 = r0.f43449f
            int r1 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r1 != 0) goto L63
            r15 = 0
            int r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r1 == 0) goto L63
            int r1 = r2.length
            r3 = r9
        L4a:
            if (r3 >= r1) goto L63
            r5 = r2[r3]
            if (r5 == 0) goto L60
            yads.nx0 r5 = r5.c()
            java.lang.String r6 = r5.f41375m
            java.lang.String r5 = r5.f41372j
            boolean r5 = yads.jt1.a(r6, r5)
            if (r5 != 0) goto L60
            r13 = r11
            goto L63
        L60:
            int r3 = r3 + 1
            goto L4a
        L63:
            r0.f43448e = r13
            int r1 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r1 == 0) goto L82
            long r1 = r0.f43449f
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 < 0) goto L7c
            long r1 = r0.f43450g
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L82
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L82
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L82:
            int r1 = r8.length
            if (r9 >= r1) goto La8
            r1 = r4[r9]
            if (r1 != 0) goto L8e
            yads.sv[] r1 = r0.f43447d
            r1[r9] = r10
            goto L9f
        L8e:
            yads.sv[] r2 = r0.f43447d
            r3 = r2[r9]
            if (r3 == 0) goto L98
            yads.ps2 r3 = r3.f43088b
            if (r3 == r1) goto L9f
        L98:
            yads.sv r3 = new yads.sv
            r3.<init>(r0, r1)
            r2[r9] = r3
        L9f:
            yads.sv[] r1 = r0.f43447d
            r1 = r1[r9]
            r8[r9] = r1
            int r9 = r9 + 1
            goto L82
        La8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tv.a(yads.pp0[], boolean[], yads.ps2[], boolean[], long):long");
    }
}
