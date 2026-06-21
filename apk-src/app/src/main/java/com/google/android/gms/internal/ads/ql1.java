package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements g91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g91 f9549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f9550c = Uri.EMPTY;

    public ql1(g91 g91Var) {
        this.f9549b = g91Var;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) {
        return this.f9549b.C(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void H(em1 em1Var) {
        em1Var.getClass();
        this.f9549b.H(em1Var);
    }

    @Override // com.google.android.gms.internal.ads.g91, com.google.android.gms.internal.ads.zj1
    public final Map d() {
        return this.f9549b.d();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        this.f9549b.g();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) {
        g91 g91Var = this.f9549b;
        this.f9550c = db1Var.f4544a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jK = g91Var.k(db1Var);
            Uri uriL = g91Var.l();
            if (uriL != null) {
                this.f9550c = uriL;
            }
            g91Var.d();
            return jK;
        } catch (Throwable th2) {
            Uri uriL2 = g91Var.l();
            if (uriL2 != null) {
                this.f9550c = uriL2;
            }
            g91Var.d();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f9549b.l();
    }
}
