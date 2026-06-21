package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f7700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f7701f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f7703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7704d;

    public /* synthetic */ m0(l0 l0Var, SurfaceTexture surfaceTexture, boolean z5) {
        super(surfaceTexture);
        this.f7703c = l0Var;
        this.f7702b = z5;
    }

    public static synchronized boolean a(Context context) {
        if (!f7701f) {
            try {
            } catch (rc0 e3) {
                rs.C("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e3.getMessage())));
            }
            int i = fs1.l(context) ? fs1.Q("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
            f7700e = i;
            f7701f = true;
        }
        return f7700e != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        l0 l0Var = this.f7703c;
        synchronized (l0Var) {
            try {
                if (!this.f7704d) {
                    Handler handler = l0Var.f7354c;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f7704d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
