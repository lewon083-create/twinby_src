package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f22640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f22641b;

    public M0(C0522u1 c0522u1, Intent intent) {
        this.f22641b = c0522u1;
        this.f22640a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653z7 c0653z7 = this.f22641b.d().f24230b;
        Intent intent = this.f22640a;
        c0653z7.getClass();
        if (intent != null) {
            c0653z7.a(intent.getDataString(), false);
        }
    }
}
