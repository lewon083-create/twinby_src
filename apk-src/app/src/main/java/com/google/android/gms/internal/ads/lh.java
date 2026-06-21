package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lh implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f7511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Application f7512c;
    public s i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7519k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7513d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7514e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7515f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f7516g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7517h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7518j = false;

    public final void a(Activity activity) {
        synchronized (this.f7513d) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f7511b = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f7513d) {
            try {
                Activity activity2 = this.f7511b;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f7511b = null;
                }
                Iterator it = this.f7517h.iterator();
                while (it.hasNext()) {
                    try {
                        ((cd0) it.next()).d();
                    } catch (Exception e3) {
                        p9.k.C.f31302h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e3);
                        u9.i.f("", e3);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f7513d) {
            Iterator it = this.f7517h.iterator();
            while (it.hasNext()) {
                try {
                    ((cd0) it.next()).c();
                } catch (Exception e3) {
                    p9.k.C.f31302h.d("AppActivityTracker.ActivityListener.onActivityPaused", e3);
                    u9.i.f("", e3);
                }
            }
        }
        this.f7515f = true;
        s sVar = this.i;
        if (sVar != null) {
            t9.g0.f33596l.removeCallbacks(sVar);
        }
        t9.d0 d0Var = t9.g0.f33596l;
        s sVar2 = new s(9, this);
        this.i = sVar2;
        d0Var.postDelayed(sVar2, this.f7519k);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f7515f = false;
        boolean andSet = this.f7514e.getAndSet(true);
        s sVar = this.i;
        if (sVar != null) {
            t9.g0.f33596l.removeCallbacks(sVar);
        }
        synchronized (this.f7513d) {
            Iterator it = this.f7517h.iterator();
            while (it.hasNext()) {
                try {
                    ((cd0) it.next()).b();
                } catch (Exception e3) {
                    p9.k.C.f31302h.d("AppActivityTracker.ActivityListener.onActivityResumed", e3);
                    u9.i.f("", e3);
                }
            }
            if (andSet) {
                u9.i.c("App is still foreground.");
            } else {
                Iterator it2 = this.f7516g.iterator();
                while (it2.hasNext()) {
                    try {
                        ((mh) it2.next()).l0(true);
                    } catch (Exception e7) {
                        u9.i.f("", e7);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
