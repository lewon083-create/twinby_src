package o4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import com.google.android.gms.internal.ads.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f29653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f29654f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f29656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29657d;

    public j(l0 l0Var, SurfaceTexture surfaceTexture, boolean z5) {
        super(surfaceTexture);
        this.f29656c = l0Var;
        this.f29655b = z5;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (((i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? m3.b.l("EGL_EXT_protected_content") : false) {
                return m3.b.l("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (m3.i e3) {
            m3.b.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e3.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f29654f) {
                f29653e = a(context);
                f29654f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29653e != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f29656c) {
            try {
                if (!this.f29657d) {
                    l0 l0Var = this.f29656c;
                    l0Var.f7354c.getClass();
                    l0Var.f7354c.sendEmptyMessage(2);
                    this.f29657d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
