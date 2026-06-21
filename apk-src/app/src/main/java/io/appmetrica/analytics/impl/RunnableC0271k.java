package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0271k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f24189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0321m f24190b;

    public RunnableC0271k(C0321m c0321m, Activity activity) {
        this.f24190b = c0321m;
        this.f24189a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24190b.a(this.f24189a);
    }
}
