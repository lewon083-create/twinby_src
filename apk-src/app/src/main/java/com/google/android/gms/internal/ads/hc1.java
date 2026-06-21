package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class hc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f6097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f6098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f6099c;

    public hc1(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6097a = jArr;
        this.f6098b = jArr2;
        this.f6099c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(hc1 hc1Var, int i) {
        ix.p(this.f6097a, hc1Var.f6097a, i);
        ix.p(this.f6098b, hc1Var.f6098b, i);
        ix.p(this.f6099c, hc1Var.f6099c, i);
    }

    public hc1() {
        hc1 hc1Var = pn1.C;
        this.f6097a = Arrays.copyOf(hc1Var.f6097a, 10);
        this.f6098b = Arrays.copyOf(hc1Var.f6098b, 10);
        this.f6099c = Arrays.copyOf(hc1Var.f6099c, 10);
    }
}
