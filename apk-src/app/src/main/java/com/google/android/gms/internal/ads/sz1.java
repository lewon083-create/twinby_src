package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10456c;

    public sz1(jx1 jx1Var, int i) {
        this.f10455b = 1 == (jx1Var.f6968e & 1);
        this.f10456c = gx1.I(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sz1 sz1Var = (sz1) obj;
        return q41.f9329a.d(this.f10456c, sz1Var.f10456c).d(this.f10455b, sz1Var.f10455b).e();
    }
}
