package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t2 f14311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f14312c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f14313a;

    static {
        if (t5.f14316e) {
            f14312c = null;
            f14311b = null;
        } else {
            f14312c = new t2(null);
            f14311b = new t2(null);
        }
    }

    public t2(CancellationException cancellationException) {
        this.f14313a = cancellationException;
    }
}
