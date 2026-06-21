package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h8 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8 f6050c;

    public h8(int i, d8 d8Var) {
        this.f6049b = i;
        this.f6050c = d8Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f6049b, ((h8) obj).f6049b);
    }
}
