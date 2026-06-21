package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n81 f10029d = n81.f8237c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r81 f10030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f10031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qr0 f10032c;

    public rr0(r81 r81Var, ScheduledExecutorService scheduledExecutorService, qr0 qr0Var) {
        this.f10030a = r81Var;
        this.f10031b = scheduledExecutorService;
        this.f10032c = qr0Var;
    }

    public final hi a(ed.d dVar, Object obj) {
        return new hi(this, obj, null, dVar, Collections.singletonList(dVar), dVar);
    }
}
