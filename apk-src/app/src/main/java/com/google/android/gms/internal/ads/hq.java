package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hq implements eq, sq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sz f6211b;

    public static final void k(Runnable runnable) {
        u9.d dVar = q9.r.f31959g.f31960a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t9.c0.m("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            t9.c0.m("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (t9.g0.f33596l.post(runnable)) {
                return;
            }
            u9.i.h("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.eq, com.google.android.gms.internal.ads.iq
    public final void b(String str) {
        t9.c0.m("invokeJavascript on adWebView from js");
        k(new gq(this, str, 3));
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final void i(String str, vo voVar) {
        sz szVar = this.f6211b;
        if (szVar != null) {
            szVar.a1(str, new ox0(8, voVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final void j(String str, vo voVar) {
        sz szVar = this.f6211b;
        if (szVar != null) {
            szVar.u0(str, new fq(this, voVar));
        }
    }
}
