package oa;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f29825f = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f29826b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f29827c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f29828d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29829e = false;

    public static void b(Application application) {
        c cVar = f29825f;
        synchronized (cVar) {
            try {
                if (!cVar.f29829e) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f29829e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(b bVar) {
        synchronized (f29825f) {
            this.f29828d.add(bVar);
        }
    }

    public final void c(boolean z5) {
        synchronized (f29825f) {
            try {
                Iterator it = this.f29828d.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f29826b.compareAndSet(true, false);
        this.f29827c.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f29826b.compareAndSet(true, false);
        this.f29827c.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f29826b.compareAndSet(false, true)) {
            this.f29827c.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
