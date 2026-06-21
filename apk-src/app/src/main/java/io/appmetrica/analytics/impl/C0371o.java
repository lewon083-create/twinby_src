package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0371o extends A7 implements ActivityLifecycleRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f24458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EnumC0346n f24459b = EnumC0346n.f24387d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0432qa f24460c = new C0432qa(true);

    public final synchronized void a(@NonNull Context context) {
        if (this.f24458a == null) {
            try {
                this.f24458a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC0346n enumC0346n = this.f24459b;
        EnumC0346n enumC0346n2 = EnumC0346n.f24385b;
        if (enumC0346n != enumC0346n2 && !this.f24460c.f24625a.isEmpty()) {
            if (this.f24458a == null) {
                this.f24459b = EnumC0346n.f24386c;
            } else {
                this.f24459b = enumC0346n2;
                this.f24458a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.f24459b == EnumC0346n.f24385b && this.f24460c.f24625a.isEmpty()) {
            this.f24459b = EnumC0346n.f24387d;
            Application application = this.f24458a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        a(activity, ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        a(activity, ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        a(activity, ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        a(activity, ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        a(activity, ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        a(activity, ActivityEvent.STOPPED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    public final synchronized void registerListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                    activityEventArr = ActivityEvent.values();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            activityEventArr = ActivityEvent.values();
        }
        for (ActivityEvent activityEvent : activityEventArr) {
            this.f24460c.a(activityEvent, activityLifecycleListener);
        }
        b();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    public final synchronized void unregisterListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                    activityEventArr = ActivityEvent.values();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            activityEventArr = ActivityEvent.values();
        }
        for (ActivityEvent activityEvent : activityEventArr) {
            C0432qa c0432qa = this.f24460c;
            Collection collection = (Collection) c0432qa.f24625a.get(activityEvent);
            if (collection != null && collection.remove(activityLifecycleListener)) {
                if (collection.isEmpty() && c0432qa.f24626b) {
                    c0432qa.f24625a.remove(activityEvent);
                }
                new ArrayList(collection);
            }
        }
        c();
    }

    public final synchronized void a(@NonNull Application application) {
        try {
            if (this.f24458a == null) {
                this.f24458a = application;
            }
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public final EnumC0346n a() {
        return this.f24459b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f24460c.f24625a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
