package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gh implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f5795p = ((Long) q9.s.f31967e.f31970c.a(al.K1)).longValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f5797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager f5798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KeyguardManager f5799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bj.g f5800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f5801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f5802h;
    public final ff i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ba f5803j = new ba(f5795p);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5804k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5805l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f5806m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DisplayMetrics f5807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f5808o;

    public gh(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f5796b = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f5798d = (PowerManager) applicationContext.getSystemService("power");
        this.f5799e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f5797c = (Application) applicationContext;
            this.i = new ff((Application) applicationContext, this);
        }
        this.f5807n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f5808o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f5802h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f5802h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f10 = rect.left;
        float f11 = this.f5807n.density;
        return new Rect((int) (f10 / f11), (int) (rect.top / f11), (int) (rect.right / f11), (int) (rect.bottom / f11));
    }

    public final void b() {
        t9.g0.f33596l.post(new s(8, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f5802h;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f5805l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r24v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r32) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gh.d(int):void");
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f5801g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f5800f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            bj.g gVar = new bj.g(2, this);
            this.f5800f = gVar;
            Context context = this.f5796b;
            tr0 tr0Var = p9.k.C.f31319z;
            synchronized (tr0Var) {
                if (tr0Var.f10702c) {
                    ((WeakHashMap) tr0Var.f10704e).put(gVar, intentFilter);
                } else {
                    al.a(context);
                    if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3082kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(gVar, intentFilter);
                    } else {
                        context.registerReceiver(gVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f5797c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.i);
            } catch (Exception e3) {
                u9.i.f("Error registering activity lifecycle callbacks.", e3);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f5801g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f5801g = null;
            }
        } catch (Exception e3) {
            u9.i.f("Error while unregistering listeners from the last ViewTreeObserver.", e3);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e7) {
            u9.i.f("Error while unregistering listeners from the ViewTreeObserver.", e7);
        }
        bj.g gVar = this.f5800f;
        if (gVar != null) {
            try {
                p9.k.C.f31319z.g(this.f5796b, gVar);
            } catch (IllegalStateException e10) {
                u9.i.f("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                p9.k.C.f31302h.d("ActiveViewUnit.stopScreenStatusMonitoring", e11);
            }
            this.f5800f = null;
        }
        Application application = this.f5797c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.i);
            } catch (Exception e12) {
                u9.i.f("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5805l = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5805l = -1;
        d(3);
        b();
        f(view);
    }
}
