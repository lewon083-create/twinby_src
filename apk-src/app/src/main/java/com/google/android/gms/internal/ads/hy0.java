package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f6297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6298c;

    public hy0(Runnable runnable, long j10) {
        this.f6297b = runnable;
        this.f6298c = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f6298c, ((hy0) obj).f6298c);
    }
}
