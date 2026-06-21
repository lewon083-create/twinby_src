package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0248j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f24126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f24127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24128d;

    public RunnableC0248j1(C0522u1 c0522u1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f24128d = c0522u1;
        this.f24125a = context;
        this.f24126b = startupParamsCallback;
        this.f24127c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0646z0 c0646z0 = this.f24128d.f24823a;
        Context applicationContext = this.f24125a.getApplicationContext();
        c0646z0.getClass();
        C0621y0 c0621y0A = C0621y0.a(applicationContext);
        c0621y0A.f().a(this.f24126b, this.f24127c);
    }
}
