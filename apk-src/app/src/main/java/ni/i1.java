package ni;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements Application.ActivityLifecycleCallbacks, androidx.lifecycle.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w f29410b = new androidx.lifecycle.w(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29411c;

    public i1(Activity activity) {
        this.f29411c = activity.hashCode();
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        return this.f29410b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.hashCode() != this.f29411c) {
            return;
        }
        this.f29410b.e(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity.hashCode() != this.f29411c) {
            return;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.f29410b.e(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.hashCode() != this.f29411c) {
            return;
        }
        this.f29410b.e(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.hashCode() != this.f29411c) {
            return;
        }
        this.f29410b.e(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity.hashCode() != this.f29411c) {
            return;
        }
        this.f29410b.e(androidx.lifecycle.n.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity.hashCode() != this.f29411c) {
            return;
        }
        this.f29410b.e(androidx.lifecycle.n.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
