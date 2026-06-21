package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8028c;

    public mv1(int i, boolean z5) {
        super(l7.o.j(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.f8028c = z5;
        this.f8027b = i;
    }
}
