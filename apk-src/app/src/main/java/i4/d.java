package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a0, z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f20866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f20867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c[] f20868d = new c[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20872h;
    public g i;

    public d(a0 a0Var, boolean z5, long j10, long j11) {
        this.f20866b = a0Var;
        this.f20869e = z5 ? j10 : -9223372036854775807L;
        this.f20870f = -9223372036854775807L;
        this.f20871g = j10;
        this.f20872h = j11;
    }

    public final boolean a() {
        return this.f20869e != -9223372036854775807L;
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        long j11 = this.f20871g;
        if (j10 == j11) {
            return j11;
        }
        long jK = m3.z.k(c1Var.f32472a, 0L, j10 - j11);
        long j12 = c1Var.f32473b;
        long j13 = this.f20872h;
        long jK2 = m3.z.k(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (jK != c1Var.f32472a || jK2 != c1Var.f32473b) {
            c1Var = new s3.c1(jK, jK2);
        }
        return this.f20866b.b(j10, c1Var);
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        z zVar = this.f20867c;
        zVar.getClass();
        zVar.d(this);
    }

    @Override // i4.a0
    public final long f(l4.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        this.f20868d = new c[b1VarArr.length];
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        for (int i = 0; i < b1VarArr.length; i++) {
            c[] cVarArr = this.f20868d;
            c cVar = (c) b1VarArr[i];
            cVarArr[i] = cVar;
            b1VarArr2[i] = cVar != null ? cVar.f20858b : null;
        }
        long jF = this.f20866b.f(rVarArr, zArr, b1VarArr2, zArr2, j10);
        long j12 = this.f20872h;
        long jMax = Math.max(jF, j10);
        if (j12 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j12);
        }
        if (a()) {
            if (jF >= j10) {
                if (jF != 0) {
                    for (l4.r rVar : rVarArr) {
                        if (rVar != null) {
                            j3.o oVarL = rVar.l();
                            if (!j3.c0.a(oVarL.f26335n, oVarL.f26332k)) {
                            }
                        }
                    }
                }
                j11 = -9223372036854775807L;
            }
            j11 = jMax;
            break;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f20869e = j11;
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var = b1VarArr2[i10];
            if (b1Var == null) {
                this.f20868d[i10] = null;
            } else {
                c[] cVarArr2 = this.f20868d;
                c cVar2 = cVarArr2[i10];
                if (cVar2 == null || cVar2.f20858b != b1Var) {
                    cVarArr2[i10] = new c(this, b1Var);
                }
            }
            b1VarArr[i10] = this.f20868d[i10];
        }
        return jMax;
    }

    @Override // i4.a0
    public final void g(long j10) {
        this.f20866b.g(j10);
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f20866b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f20872h;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f20866b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f20872h;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        return this.f20866b.getTrackGroups();
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f20866b.isLoading();
    }

    @Override // i4.z
    public final void j(a0 a0Var) {
        if (this.i != null) {
            return;
        }
        z zVar = this.f20867c;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f20867c = zVar;
        this.f20866b.k(this, j10);
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        return this.f20866b.l(h0Var);
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() throws g {
        g gVar = this.i;
        if (gVar != null) {
            throw gVar;
        }
        this.f20866b.maybeThrowPrepareError();
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        if (a()) {
            long j10 = this.f20869e;
            this.f20869e = -9223372036854775807L;
            this.f20870f = j10;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f20866b.readDiscontinuity();
        if (discontinuity2 != -9223372036854775807L) {
            long j11 = this.f20871g;
            long j12 = this.f20872h;
            long jMax = Math.max(discontinuity2, j11);
            if (j12 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j12);
            }
            if (jMax != this.f20870f) {
                this.f20870f = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        this.f20866b.reevaluateBuffer(j10);
    }

    @Override // i4.a0
    public final long seekToUs(long j10) {
        this.f20869e = -9223372036854775807L;
        for (c cVar : this.f20868d) {
            if (cVar != null) {
                cVar.f20859c = false;
            }
        }
        long jSeekToUs = this.f20866b.seekToUs(j10);
        long j11 = this.f20871g;
        long j12 = this.f20872h;
        long jMax = Math.max(jSeekToUs, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }
}
