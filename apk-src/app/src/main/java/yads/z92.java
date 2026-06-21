package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z92 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x92 f45285g = new x92();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f45286h = TimeUnit.SECONDS.toMillis(1);
    public static volatile z92 i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f45289c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45292f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45287a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f45288b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u92 f45290d = new u92();

    public z92(Context context) {
        this.f45289c = new w92(context);
    }

    public final void a(od3 od3Var) {
        synchronized (this.f45287a) {
            try {
                this.f45290d.b(od3Var);
                if (!this.f45290d.a()) {
                    this.f45289c.f44312c.getClass();
                    zo2.a("om_sdk_js_request_tag");
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(od3 od3Var) {
        boolean z5;
        synchronized (this.f45287a) {
            try {
                z5 = this.f45292f;
                if (!z5) {
                    this.f45290d.a(od3Var);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            od3Var.a();
        } else {
            a();
        }
    }

    public final void c() {
        synchronized (this.f45287a) {
            this.f45288b.removeCallbacksAndMessages(null);
            this.f45291e = false;
            Unit unit = Unit.f27471a;
        }
    }

    public final void b() {
        this.f45288b.postDelayed(new zl.a1(6, this), f45286h);
    }

    public final void a() {
        boolean z5;
        synchronized (this.f45287a) {
            try {
                if (this.f45291e) {
                    z5 = false;
                } else {
                    z5 = true;
                    this.f45291e = true;
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            b();
            this.f45289c.a(new y92(this));
        }
    }

    public static final void a(z92 z92Var) {
        z92Var.f45289c.f44312c.getClass();
        zo2.a("om_sdk_js_request_tag");
        synchronized (z92Var.f45287a) {
            z92Var.f45292f = true;
            Unit unit = Unit.f27471a;
        }
        z92Var.c();
        z92Var.f45290d.b();
    }
}
