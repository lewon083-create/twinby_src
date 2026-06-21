package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gz implements g91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q51 f5982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g91 f5984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f5986f;

    public gz(q51 q51Var, int i, g91 g91Var) {
        this.f5982b = q51Var;
        this.f5983c = i;
        this.f5984d = g91Var;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) {
        int i11;
        long j10 = this.f5985e;
        long j11 = this.f5983c;
        if (j10 < j11) {
            int iC = this.f5982b.C(bArr, i, (int) Math.min(i10, j11 - j10));
            long j12 = this.f5985e + ((long) iC);
            this.f5985e = j12;
            i11 = iC;
            j10 = j12;
        } else {
            i11 = 0;
        }
        if (j10 < j11) {
            return i11;
        }
        int iC2 = this.f5984d.C(bArr, i + i11, i10 - i11);
        int i12 = i11 + iC2;
        this.f5985e += (long) iC2;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.g91, com.google.android.gms.internal.ads.zj1
    public final Map d() {
        return w51.f11648h;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        this.f5982b.g();
        this.f5984d.g();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) {
        db1 db1Var2;
        db1 db1Var3;
        db1 db1Var4;
        Uri uri = db1Var.f4544a;
        long j10 = db1Var.f4547d;
        this.f5986f = uri;
        long j11 = db1Var.f4546c;
        long j12 = this.f5983c;
        if (j11 >= j12) {
            db1Var2 = null;
        } else {
            long jMin = j12 - j11;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            db1Var2 = new db1(uri, j11, jMin);
        }
        if (j10 == -1 || j11 + j10 > j12) {
            db1Var3 = db1Var2;
            db1Var4 = new db1(uri, Math.max(j12, j11), j10 != -1 ? Math.min(j10, (j11 + j10) - j12) : -1L);
        } else {
            db1Var3 = db1Var2;
            db1Var4 = null;
        }
        long jK = db1Var3 != null ? this.f5982b.k(db1Var3) : 0L;
        long jK2 = db1Var4 != null ? this.f5984d.k(db1Var4) : 0L;
        this.f5985e = j11;
        if (jK == -1 || jK2 == -1) {
            return -1L;
        }
        return jK + jK2;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f5986f;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void H(em1 em1Var) {
    }
}
