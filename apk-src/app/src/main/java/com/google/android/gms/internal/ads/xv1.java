package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jx1 f12350d;

    public xv1(int i, jx1 jx1Var, boolean z5) {
        super(l7.o.j(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.f12349c = z5;
        this.f12348b = i;
        this.f12350d = jx1Var;
    }
}
