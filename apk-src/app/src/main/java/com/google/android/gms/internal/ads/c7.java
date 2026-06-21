package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c7 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f4059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z6 f4060b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a7 f4065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jx1 f4066h;
    public boolean i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4062d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4063e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f4064f = cq0.f4294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f4061c = new tk0();

    public c7(w2 w2Var, z6 z6Var) {
        this.f4059a = w2Var;
        this.f4060b = z6Var;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b(tk0 tk0Var, int i, int i10) {
        if (this.f4065g == null) {
            this.f4059a.b(tk0Var, i, i10);
            return;
        }
        g(i);
        tk0Var.H(this.f4064f, this.f4063e, i);
        this.f4063e += i;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c(long j10, int i, int i10, int i11, v2 v2Var) {
        if (this.f4065g == null) {
            this.f4059a.c(j10, i, i10, i11, v2Var);
            return;
        }
        ix.A("DRM on subtitles is not supported", v2Var == null);
        int i12 = (this.f4063e - i11) - i10;
        try {
            this.f4065g.c(i12, i10, new a4.g(this, j10, i), this.f4064f);
        } catch (RuntimeException e3) {
            if (!this.i) {
                throw e3;
            }
            rs.w("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e3);
        }
        int i13 = i12 + i10;
        this.f4062d = i13;
        if (i13 == this.f4063e) {
            this.f4062d = 0;
            this.f4063e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int d(ct1 ct1Var, int i, boolean z5) throws EOFException {
        if (this.f4065g == null) {
            return this.f4059a.d(ct1Var, i, z5);
        }
        g(i);
        int iC = ct1Var.C(this.f4064f, this.f4063e, i);
        if (iC != -1) {
            this.f4063e += iC;
            return iC;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(jx1 jx1Var) {
        String str = jx1Var.f6975m;
        str.getClass();
        ix.o(ra.f(str) == 3);
        boolean zEquals = jx1Var.equals(this.f4066h);
        z6 z6Var = this.f4060b;
        if (!zEquals) {
            this.f4066h = jx1Var;
            this.f4065g = z6Var.g(jx1Var) ? z6Var.k(jx1Var) : null;
        }
        a7 a7Var = this.f4065g;
        w2 w2Var = this.f4059a;
        if (a7Var == null) {
            w2Var.e(jx1Var);
            return;
        }
        ow1 ow1Var = new ow1(jx1Var);
        ow1Var.e("application/x-media3-cues");
        ow1Var.i = str;
        ow1Var.f8837q = Long.MAX_VALUE;
        ow1Var.J = z6Var.j(jx1Var);
        w2Var.e(new jx1(ow1Var));
    }

    public final void g(int i) {
        int length = this.f4064f.length;
        int i10 = this.f4063e;
        if (length - i10 >= i) {
            return;
        }
        int i11 = i10 - this.f4062d;
        int iMax = Math.max(i11 + i11, i + i11);
        byte[] bArr = this.f4064f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f4062d, bArr2, 0, i11);
        this.f4062d = 0;
        this.f4063e = i11;
        this.f4064f = bArr2;
    }
}
