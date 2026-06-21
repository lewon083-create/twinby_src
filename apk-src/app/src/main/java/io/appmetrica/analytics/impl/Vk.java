package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0371o f23156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0352n5 f23157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f23158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f23159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0421q f23160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0321m f23161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23162g;

    public Vk(C0371o c0371o, C0321m c0321m) {
        this(c0371o, c0321m, new C0352n5(), new C0421q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0352n5 c0352n5 = this.f23157b;
            hp hpVar = new hp(this, activity, 1);
            c0352n5.getClass();
            C0071c4.l().f23537c.a().execute(new RunnableC0327m5(c0352n5, hpVar));
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0352n5 c0352n5 = this.f23157b;
            hp hpVar = new hp(this, activity, 0);
            c0352n5.getClass();
            C0071c4.l().f23537c.a().execute(new RunnableC0327m5(c0352n5, hpVar));
        }
    }

    public Vk(C0371o c0371o, C0321m c0321m, C0352n5 c0352n5, C0421q c0421q) {
        this.f23162g = false;
        this.f23156a = c0371o;
        this.f23161f = c0321m;
        this.f23157b = c0352n5;
        this.f23160e = c0421q;
        final int i = 0;
        this.f23158c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.ip

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Vk f24120b;

            {
                this.f24120b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i) {
                    case 0:
                        this.f24120b.a(activity, activityEvent);
                        break;
                    default:
                        this.f24120b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f23159d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.ip

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Vk f24120b;

            {
                this.f24120b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i10) {
                    case 0:
                        this.f24120b.a(activity, activityEvent);
                        break;
                    default:
                        this.f24120b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final void a(Activity activity, C0234ic c0234ic) {
        if (this.f23162g && this.f23160e.a(activity, EnumC0396p.RESUMED)) {
            c0234ic.a(activity);
        }
    }

    public final void b(Activity activity, C0234ic c0234ic) {
        if (this.f23162g && this.f23160e.a(activity, EnumC0396p.PAUSED)) {
            c0234ic.b(activity);
        }
    }

    public final synchronized EnumC0346n a() {
        try {
            if (!this.f23162g) {
                this.f23156a.registerListener(this.f23158c, ActivityEvent.RESUMED);
                this.f23156a.registerListener(this.f23159d, ActivityEvent.PAUSED);
                this.f23162g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f23156a.f24459b;
    }
}
