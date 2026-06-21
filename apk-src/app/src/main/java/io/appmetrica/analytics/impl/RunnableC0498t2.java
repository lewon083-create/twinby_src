package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0498t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f24752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0523u2 f24753c;

    public RunnableC0498t2(C0523u2 c0523u2, Context context, Intent intent) {
        this.f24753c = c0523u2;
        this.f24751a = context;
        this.f24752b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24753c.f24831a.consume(this.f24751a, this.f24752b);
    }
}
