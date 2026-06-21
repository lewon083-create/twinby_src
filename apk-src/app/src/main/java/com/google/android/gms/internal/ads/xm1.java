package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xm1 extends ym1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f12201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12203f;

    public xm1(byte[] bArr, int i, int i10) {
        bn1.c(i, i + i10, bArr.length);
        this.f12201d = bArr;
        this.f12202e = i;
        this.f12203f = i10;
    }

    @Override // com.google.android.gms.internal.ads.ym1
    public final boolean E(bn1 bn1Var, int i, int i10) {
        if (i10 > bn1Var.n()) {
            int length = String.valueOf(i10).length();
            int i11 = this.f12203f;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(i11).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i + i10;
        if (i12 > bn1Var.n()) {
            int iN = bn1Var.n();
            int length2 = String.valueOf(i).length();
            StringBuilder sb3 = new StringBuilder(length2 + 24 + String.valueOf(i10).length() + 2 + String.valueOf(iN).length());
            om1.u(sb3, "Ran off end of other: ", i, ", ", i10);
            throw new IllegalArgumentException(l7.o.j(iN, ", ", sb3));
        }
        boolean z5 = bn1Var instanceof zm1;
        byte[] bArr = this.f12201d;
        int i13 = this.f12202e;
        if (z5) {
            return bn1.e(i13, i, i10, bArr, ((zm1) bn1Var).f13044d);
        }
        if (!(bn1Var instanceof xm1)) {
            return bn1Var.o(i, i12).equals(o(i13, i10 + i13));
        }
        xm1 xm1Var = (xm1) bn1Var;
        return bn1.e(i13, xm1Var.f12202e + i, i10, bArr, xm1Var.f12201d);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte f(int i) {
        bn1.a(i, this.f12203f);
        return this.f12201d[this.f12202e + i];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte g(int i) {
        return this.f12201d[this.f12202e + i];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int n() {
        return this.f12203f;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final bn1 o(int i, int i10) {
        int iC = bn1.c(i, i10, this.f12203f);
        if (iC == 0) {
            return bn1.f3837c;
        }
        return new xm1(this.f12201d, this.f12202e + i, iC);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void p(int i, int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f12201d, this.f12202e + i, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final ByteBuffer q() {
        return ByteBuffer.wrap(this.f12201d, this.f12202e, this.f12203f).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void r(hn1 hn1Var) {
        hn1Var.o(this.f12201d, this.f12202e, this.f12203f);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean t(bn1 bn1Var) {
        return ((bn1Var instanceof zm1) || (bn1Var instanceof xm1)) ? E(bn1Var, 0, this.f12203f) : bn1Var.t(this);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int v(int i, int i10, int i11) {
        return ao1.a(i, this.f12202e + i10, i11, this.f12201d);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final en1 w() {
        return en1.d(this.f12201d, this.f12202e, this.f12203f);
    }
}
