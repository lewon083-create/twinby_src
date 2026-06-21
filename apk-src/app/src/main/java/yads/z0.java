package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f45209f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile z0 f45210g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45211a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f45212b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f45213c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f45214d = new y0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45215e;

    public final void a(Context context, l1 l1Var) {
        synchronized (this.f45211a) {
            try {
                this.f45212b.put(l1Var, null);
                if (!a()) {
                    a(context);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Context context, l1 l1Var) {
        synchronized (this.f45211a) {
            this.f45212b.remove(l1Var);
            b(context);
            Unit unit = Unit.f27471a;
        }
    }

    public final void b(Context context) {
        synchronized (this.f45211a) {
            if (this.f45212b.isEmpty() && this.f45213c.isEmpty()) {
                try {
                    if (a()) {
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f45214d);
                        this.f45215e = false;
                    }
                } catch (Throwable unused) {
                }
            }
            Unit unit = Unit.f27471a;
        }
    }

    public final void a(Context context, d1 d1Var) {
        synchronized (this.f45211a) {
            try {
                this.f45213c.put(d1Var, null);
                if (!a()) {
                    a(context);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        boolean z5;
        synchronized (this.f45211a) {
            z5 = this.f45215e;
        }
        return z5;
    }

    public final void a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f45214d);
            this.f45215e = true;
        } catch (Throwable unused) {
        }
    }
}
