package i4;

import com.google.android.gms.internal.ads.xt1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements a0, z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f20921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f20923d;

    public h1(a0 a0Var, long j10) {
        this.f20921b = a0Var;
        this.f20922c = j10;
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        long j11 = this.f20922c;
        return this.f20921b.b(j10 - j11, c1Var) + j11;
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        z zVar = this.f20923d;
        zVar.getClass();
        zVar.d(this);
    }

    @Override // i4.a0
    public final long f(l4.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i = 0;
        while (true) {
            b1 b1Var = null;
            if (i >= b1VarArr.length) {
                break;
            }
            g1 g1Var = (g1) b1VarArr[i];
            if (g1Var != null) {
                b1Var = g1Var.f20909b;
            }
            b1VarArr2[i] = b1Var;
            i++;
        }
        a0 a0Var = this.f20921b;
        long j11 = this.f20922c;
        long jF = a0Var.f(rVarArr, zArr, b1VarArr2, zArr2, j10 - j11);
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var2 = b1VarArr2[i10];
            if (b1Var2 == null) {
                b1VarArr[i10] = null;
            } else {
                b1 b1Var3 = b1VarArr[i10];
                if (b1Var3 == null || ((g1) b1Var3).f20909b != b1Var2) {
                    b1VarArr[i10] = new g1(b1Var2, j11);
                }
            }
        }
        return jF + j11;
    }

    @Override // i4.a0
    public final void g(long j10) {
        this.f20921b.g(j10 - this.f20922c);
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f20921b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f20922c;
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f20921b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f20922c;
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        return this.f20921b.getTrackGroups();
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f20921b.isLoading();
    }

    @Override // i4.z
    public final void j(a0 a0Var) {
        z zVar = this.f20923d;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f20923d = zVar;
        this.f20921b.k(this, j10 - this.f20922c);
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        xt1 xt1Var = new xt1();
        long j10 = h0Var.f32550a;
        xt1Var.f12329b = h0Var.f32551b;
        xt1Var.f12330c = h0Var.f32552c;
        xt1Var.f12328a = j10 - this.f20922c;
        return this.f20921b.l(new s3.h0(xt1Var));
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() {
        this.f20921b.maybeThrowPrepareError();
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        long discontinuity = this.f20921b.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.f20922c;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        this.f20921b.reevaluateBuffer(j10 - this.f20922c);
    }

    @Override // i4.a0
    public final long seekToUs(long j10) {
        long j11 = this.f20922c;
        return this.f20921b.seekToUs(j10 - j11) + j11;
    }
}
