package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f6056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6057e;

    public h9(int i, int i10) {
        switch (i10) {
            case 1:
                this.f6053a = i;
                byte[] bArr = new byte[131];
                this.f6056d = bArr;
                bArr[2] = 1;
                break;
            default:
                this.f6053a = i;
                byte[] bArr2 = new byte[131];
                this.f6056d = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a(byte[] bArr, int i, int i10) {
        if (this.f6054b) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f6056d;
            int length = bArr2.length;
            int i12 = this.f6057e;
            if (length < i12 + i11) {
                this.f6056d = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i, this.f6056d, this.f6057e, i11);
            this.f6057e += i11;
        }
    }

    public boolean b(int i) {
        if (!this.f6054b) {
            return false;
        }
        this.f6057e -= i;
        this.f6054b = false;
        this.f6055c = true;
        return true;
    }

    public void c() {
        this.f6054b = false;
        this.f6055c = false;
    }

    public void d(int i) {
        com.google.android.gms.internal.measurement.h5.r(!this.f6054b);
        boolean z5 = i == this.f6053a;
        this.f6054b = z5;
        if (z5) {
            this.f6057e = 3;
            this.f6055c = false;
        }
    }

    public void e() {
        this.f6054b = false;
        this.f6055c = false;
    }

    public void f(int i) {
        ix.k0(!this.f6054b);
        boolean z5 = i == this.f6053a;
        this.f6054b = z5;
        if (z5) {
            this.f6057e = 3;
            this.f6055c = false;
        }
    }

    public void g(byte[] bArr, int i, int i10) {
        if (this.f6054b) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f6056d;
            int length = bArr2.length;
            int i12 = this.f6057e + i11;
            if (length < i12) {
                this.f6056d = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i, this.f6056d, this.f6057e, i11);
            this.f6057e += i11;
        }
    }

    public boolean h(int i) {
        if (!this.f6054b) {
            return false;
        }
        this.f6057e -= i;
        this.f6054b = false;
        this.f6055c = true;
        return true;
    }
}
