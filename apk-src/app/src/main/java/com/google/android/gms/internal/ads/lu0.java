package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lu0 implements gu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static lu0 f7627d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cu0 f7629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fu0 f7630c;

    public static lu0 b() {
        if (f7627d == null) {
            lu0 lu0Var = new lu0();
            lu0Var.f7628a = 0.0f;
            f7627d = lu0Var;
        }
        return f7627d;
    }

    @Override // com.google.android.gms.internal.ads.gu0
    public final void a(boolean z5) {
        if (z5) {
            vu0.f11481g.getClass();
            vu0.b();
            return;
        }
        vu0.f11481g.getClass();
        Handler handler = vu0.i;
        if (handler != null) {
            handler.removeCallbacks(vu0.f11484k);
            vu0.i = null;
        }
    }
}
