package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q51 extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oz0 f9344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f9345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f9346h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9348k;

    public q51(byte[] bArr) {
        oz0 oz0Var = new oz0(1, bArr);
        super(false);
        this.f9344f = oz0Var;
        ix.o(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f9347j;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f9346h;
        bArr2.getClass();
        System.arraycopy(bArr2, this.i, bArr, i, iMin);
        this.i += iMin;
        this.f9347j -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        if (this.f9348k) {
            this.f9348k = false;
            f();
        }
        this.f9345g = null;
        this.f9346h = null;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws t91 {
        a(db1Var);
        this.f9345g = db1Var.f4544a;
        byte[] bArr = this.f9344f.f8863a;
        this.f9346h = bArr;
        long j10 = db1Var.f4546c;
        int length = bArr.length;
        if (j10 > length) {
            throw new t91();
        }
        int i = (int) j10;
        this.i = i;
        int i10 = length - i;
        this.f9347j = i10;
        long j11 = db1Var.f4547d;
        if (j11 != -1) {
            this.f9347j = (int) Math.min(i10, j11);
        }
        this.f9348k = true;
        b(db1Var);
        return j11 != -1 ? j11 : this.f9347j;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f9345g;
    }
}
