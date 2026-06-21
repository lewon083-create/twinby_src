package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f12015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f12016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f12017c = true;

    public x40(gx gxVar, ScheduledExecutorService scheduledExecutorService, or0 or0Var) {
        this.f12015a = gxVar;
        this.f12016b = scheduledExecutorService;
    }
}
