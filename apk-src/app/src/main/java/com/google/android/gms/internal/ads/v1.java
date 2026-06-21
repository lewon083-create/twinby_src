package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ct1 f11177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11179e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11182h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f11180f = new byte[65536];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11176b = new byte[4096];

    static {
        e6.a("media3.extractor");
    }

    public v1(ct1 ct1Var, long j10, long j11) {
        this.f11177c = ct1Var;
        this.f11179e = j10;
        this.f11178d = j11;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        v1 v1Var;
        int i11 = this.f11182h;
        int iH = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f11180f, 0, bArr, i, iMin);
            f(iMin);
            iH = iMin;
        }
        if (iH == 0) {
            v1Var = this;
            iH = v1Var.h(bArr, i, i10, 0, true);
        } else {
            v1Var = this;
        }
        if (iH != -1) {
            v1Var.f11179e += (long) iH;
        }
        return iH;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final void E(byte[] bArr, int i, int i10) {
        R(bArr, i, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final boolean J(byte[] bArr, int i, int i10, boolean z5) throws EOFException, InterruptedIOException {
        int iMin;
        int i11 = this.f11182h;
        if (i11 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i11, i10);
            System.arraycopy(this.f11180f, 0, bArr, i, iMin);
            f(iMin);
        }
        int iH = iMin;
        while (iH < i10 && iH != -1) {
            iH = h(bArr, i, i10, iH, z5);
        }
        if (iH != -1) {
            this.f11179e += (long) iH;
        }
        return iH != -1;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final int K(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        v1 v1Var;
        int iMin;
        c(i10);
        int i11 = this.f11182h;
        int i12 = this.f11181g;
        int i13 = i11 - i12;
        if (i13 == 0) {
            v1Var = this;
            iMin = v1Var.h(this.f11180f, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            v1Var.f11182h += iMin;
        } else {
            v1Var = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(v1Var.f11180f, v1Var.f11181g, bArr, i, iMin);
        v1Var.f11181g += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final boolean R(byte[] bArr, int i, int i10, boolean z5) {
        if (!b(i10, z5)) {
            return false;
        }
        System.arraycopy(this.f11180f, this.f11181g - i10, bArr, i, i10);
        return true;
    }

    public final boolean a(int i, boolean z5) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f11182h, i);
        f(iMin);
        int iH = iMin;
        while (iH < i && iH != -1) {
            iH = h(this.f11176b, -iH, Math.min(i, iH + 4096), iH, z5);
        }
        if (iH != -1) {
            this.f11179e += (long) iH;
        }
        return iH != -1;
    }

    public final boolean b(int i, boolean z5) throws EOFException, InterruptedIOException {
        c(i);
        int iH = this.f11182h - this.f11181g;
        while (iH < i) {
            int i10 = i;
            boolean z10 = z5;
            iH = h(this.f11180f, this.f11181g, i10, iH, z10);
            if (iH == -1) {
                return false;
            }
            this.f11182h = this.f11181g + iH;
            i = i10;
            z5 = z10;
        }
        this.f11181g += i;
        return true;
    }

    public final void c(int i) {
        int i10 = this.f11181g + i;
        int length = this.f11180f.length;
        if (i10 > length) {
            String str = cq0.f4293a;
            this.f11180f = Arrays.copyOf(this.f11180f, Math.max(65536 + i10, Math.min(length + length, i10 + 524288)));
        }
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final void e() {
        this.f11181g = 0;
    }

    public final void f(int i) {
        int i10 = this.f11182h - i;
        this.f11182h = i10;
        this.f11181g = 0;
        byte[] bArr = this.f11180f;
        byte[] bArr2 = i10 < bArr.length + (-524288) ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i10);
        this.f11180f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final int g() throws EOFException, InterruptedIOException {
        v1 v1Var;
        int iMin = Math.min(this.f11182h, 1);
        f(iMin);
        if (iMin == 0) {
            v1Var = this;
            iMin = v1Var.h(this.f11176b, 0, Math.min(1, 4096), 0, true);
        } else {
            v1Var = this;
        }
        if (iMin != -1) {
            v1Var.f11179e += (long) iMin;
        }
        return iMin;
    }

    public final int h(byte[] bArr, int i, int i10, int i11, boolean z5) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iC = this.f11177c.C(bArr, i + i11, i10 - i11);
        if (iC != -1) {
            return i11 + iC;
        }
        if (i11 == 0 && z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final long p() {
        return this.f11179e + ((long) this.f11181g);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final long q() {
        return this.f11179e;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final long r() {
        return this.f11178d;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final void t(int i) throws EOFException, InterruptedIOException {
        a(i, false);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final void v(int i) throws EOFException, InterruptedIOException {
        b(i, false);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public final void w(byte[] bArr, int i, int i10) throws EOFException, InterruptedIOException {
        J(bArr, i, i10, false);
    }
}
