package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 implements u9, y5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11314h;

    public v9(b2 b2Var, w2 w2Var, x9 x9Var, String str, int i) throws eb {
        this.f11311e = b2Var;
        this.f11312f = w2Var;
        this.f11313g = x9Var;
        int i10 = x9Var.f12079a;
        int i11 = x9Var.f12080b;
        int i12 = x9Var.f12082d * i10;
        int i13 = x9Var.f12081c;
        int i14 = i12 / 8;
        if (i13 != i14) {
            throw eb.a(null, pe.a.g(new StringBuilder(String.valueOf(i14).length() + 28 + String.valueOf(i13).length()), i14, "Expected block size: ", i13, "; got: "));
        }
        int i15 = i11 * i14;
        int i16 = i15 * 8;
        int iMax = Math.max(i14, i15 / 10);
        this.f11307a = iMax;
        ow1 ow1Var = new ow1();
        ow1Var.d("audio/wav");
        ow1Var.e(str);
        ow1Var.f8828g = i16;
        ow1Var.f8829h = i16;
        ow1Var.f8833m = iMax;
        ow1Var.D = i10;
        ow1Var.E = i11;
        ow1Var.F = i;
        this.f11314h = new jx1(ow1Var);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public void a(int i, long j10) {
        ((b2) this.f11311e).U(new y9((x9) this.f11313g, 1, i, j10));
        ((w2) this.f11312f).e((jx1) this.f11314h);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public void b(long j10) {
        this.f11308b = j10;
        this.f11309c = 0;
        this.f11310d = 0L;
    }

    @Override // y5.b
    public void c(long j10) {
        this.f11308b = j10;
        this.f11309c = 0;
        this.f11310d = 0L;
    }

    @Override // com.google.android.gms.internal.ads.u9
    public boolean d(a2 a2Var, long j10) {
        int i;
        int i10;
        long j11 = j10;
        while (j11 > 0 && (i = this.f11309c) < (i10 = this.f11307a)) {
            int iF = ((w2) this.f11312f).f(a2Var, (int) Math.min(i10 - i, j11), true);
            if (iF == -1) {
                j11 = 0;
            } else {
                this.f11309c += iF;
                j11 -= (long) iF;
            }
        }
        x9 x9Var = (x9) this.f11313g;
        int i11 = this.f11309c;
        int i12 = x9Var.f12081c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jU = this.f11308b + cq0.u(this.f11310d, 1000000L, x9Var.f12080b, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.f11309c - i14;
            ((w2) this.f11312f).c(jU, 1, i14, i15, null);
            this.f11310d += (long) i13;
            this.f11309c = i15;
        }
        return j11 <= 0;
    }

    @Override // y5.b
    public void e(int i, long j10) {
        y5.e eVar = new y5.e((x9) this.f11313g, 1, i, j10);
        ((q4.m) this.f11311e).j(eVar);
        q4.a0 a0Var = (q4.a0) this.f11312f;
        a0Var.a((j3.o) this.f11314h);
        a0Var.b(eVar.f36484e);
    }

    @Override // y5.b
    public boolean f(q4.l lVar, long j10) {
        Object obj;
        int i;
        int i10;
        long j11 = j10;
        while (true) {
            obj = this.f11312f;
            if (j11 <= 0 || (i = this.f11309c) >= (i10 = this.f11307a)) {
                break;
            }
            int iC = ((q4.a0) obj).c(lVar, (int) Math.min(i10 - i, j11), true);
            if (iC == -1) {
                j11 = 0;
            } else {
                this.f11309c += iC;
                j11 -= (long) iC;
            }
        }
        x9 x9Var = (x9) this.f11313g;
        int i11 = x9Var.f12081c;
        int i12 = this.f11309c / i11;
        if (i12 > 0) {
            long j12 = this.f11308b;
            long j13 = this.f11310d;
            long j14 = x9Var.f12080b;
            String str = m3.z.f28608a;
            long jU = j12 + m3.z.U(j13, 1000000L, j14, RoundingMode.DOWN);
            int i13 = i12 * i11;
            int i14 = this.f11309c - i13;
            ((q4.a0) obj).f(jU, 1, i13, i14, null);
            this.f11310d += (long) i12;
            this.f11309c = i14;
        }
        return j11 <= 0;
    }

    public v9(q4.m mVar, q4.a0 a0Var, x9 x9Var, String str, int i) throws j3.d0 {
        this.f11311e = mVar;
        this.f11312f = a0Var;
        this.f11313g = x9Var;
        int i10 = x9Var.f12079a;
        int i11 = x9Var.f12080b;
        int i12 = (x9Var.f12082d * i10) / 8;
        int i13 = x9Var.f12081c;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int iMax = Math.max(i12, i14 / 10);
            this.f11307a = iMax;
            j3.n nVar = new j3.n();
            nVar.f26291l = j3.c0.n("audio/wav");
            nVar.f26292m = j3.c0.n(str);
            nVar.f26288h = i15;
            nVar.i = i15;
            nVar.f26293n = iMax;
            nVar.E = i10;
            nVar.F = i11;
            nVar.G = i;
            this.f11314h = new j3.o(nVar);
            return;
        }
        throw j3.d0.a(null, "Expected block size: " + i12 + "; got: " + i13);
    }
}
