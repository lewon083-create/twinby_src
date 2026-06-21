package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12216a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12217b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12218c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12219d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z5) {
        if (!this.f12219d.get()) {
            return z5;
        }
        return this.f12216a;
    }
}
