package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9192a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9195d;

    public u3.g a() {
        if (this.f9193b || !(this.f9194c || this.f9195d)) {
            return new u3.g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public qv1 b() {
        if (this.f9193b || !(this.f9194c || this.f9195d)) {
            return new qv1(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
