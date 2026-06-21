package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0197h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f23954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23955b;

    public RunnableC0197h1(C0522u1 c0522u1, Activity activity) {
        this.f23955b = c0522u1;
        this.f23954a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1 c0522u1 = this.f23955b;
        Vk vk2 = c0522u1.f24830h;
        Activity activity = this.f23954a;
        Ja ja2 = c0522u1.d().f24229a;
        if (activity != null) {
            vk2.f23161f.a(activity);
        }
        if (vk2.f23160e.a(activity, EnumC0396p.RESUMED)) {
            ja2.a(activity);
        }
    }
}
