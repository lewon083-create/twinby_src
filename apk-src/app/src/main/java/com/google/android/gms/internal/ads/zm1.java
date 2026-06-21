package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 extends ym1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13044d;

    public zm1(byte[] bArr) {
        bArr.getClass();
        this.f13044d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ym1
    public final boolean E(bn1 bn1Var, int i, int i10) {
        int iN = bn1Var.n();
        byte[] bArr = this.f13044d;
        if (i10 > iN) {
            int length = String.valueOf(i10).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = i + i10;
        if (i11 > bn1Var.n()) {
            int iN2 = bn1Var.n();
            int length3 = String.valueOf(i).length();
            StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i10).length() + 2 + String.valueOf(iN2).length());
            om1.u(sb3, "Ran off end of other: ", i, ", ", i10);
            throw new IllegalArgumentException(l7.o.j(iN2, ", ", sb3));
        }
        if (bn1Var instanceof zm1) {
            return bn1.e(0, i, i10, bArr, ((zm1) bn1Var).f13044d);
        }
        if (!(bn1Var instanceof xm1)) {
            return bn1Var.o(i, i11).equals(o(0, i10));
        }
        xm1 xm1Var = (xm1) bn1Var;
        return bn1.e(0, xm1Var.f12202e + i, i10, bArr, xm1Var.f12201d);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte f(int i) {
        return this.f13044d[i];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final byte g(int i) {
        return this.f13044d[i];
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int n() {
        return this.f13044d.length;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final bn1 o(int i, int i10) {
        byte[] bArr = this.f13044d;
        int iC = bn1.c(i, i10, bArr.length);
        return iC == 0 ? bn1.f3837c : new xm1(bArr, i, iC);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void p(int i, int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f13044d, i, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final ByteBuffer q() {
        return ByteBuffer.wrap(this.f13044d).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void r(hn1 hn1Var) {
        byte[] bArr = this.f13044d;
        hn1Var.o(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final boolean t(bn1 bn1Var) {
        boolean z5 = bn1Var instanceof zm1;
        byte[] bArr = this.f13044d;
        return z5 ? Arrays.equals(bArr, ((zm1) bn1Var).f13044d) : bn1Var instanceof xm1 ? E(bn1Var, 0, bArr.length) : bn1Var.t(this);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final int v(int i, int i10, int i11) {
        return ao1.a(i, i10, i11, this.f13044d);
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final en1 w() {
        byte[] bArr = this.f13044d;
        return en1.d(bArr, 0, bArr.length);
    }
}
