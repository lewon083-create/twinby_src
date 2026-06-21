package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12436a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.w2
    public final void b(tk0 tk0Var, int i, int i10) {
        tk0Var.G(i);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int d(ct1 ct1Var, int i, boolean z5) throws EOFException {
        int iC = ct1Var.C(this.f12436a, 0, Math.min(4096, i));
        if (iC != -1) {
            return iC;
        }
        if (z5) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(jx1 jx1Var) {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c(long j10, int i, int i10, int i11, v2 v2Var) {
    }
}
