package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uf implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Handler f10927n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f10929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager f10930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KeyguardManager f10931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bj.g f10932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kf f10933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f10934h;
    public WeakReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ff f10935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f10936k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10937l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10938m = -3;

    public uf(Context context, kf kfVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10928b = applicationContext;
        this.f10933g = kfVar;
        this.f10930d = (PowerManager) applicationContext.getSystemService("power");
        this.f10931e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f10929c = (Application) applicationContext;
            this.f10935j = new ff((Application) applicationContext, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j10;
        WeakReference weakReference = this.i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.i = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.f10938m = j10;
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.i == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        WeakReference weakReference = this.i;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f10937l = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.i
            if (r0 != 0) goto L6
            goto Lc2
        L6:
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = -1
            r3 = -3
            if (r0 != 0) goto L1b
            r9.f10938m = r3
            r9.f10936k = r2
            return
        L1b:
            int r5 = r0.getVisibility()
            r6 = 0
            if (r5 == 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = r6
        L25:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L2d
            r5 = r5 | 2
        L2d:
            android.os.PowerManager r7 = r9.f10930d
            if (r7 == 0) goto L39
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L39
            r5 = r5 | 4
        L39:
            com.google.android.gms.internal.ads.kf r7 = r9.f10933g
            boolean r7 = r7.f7207a
            if (r7 != 0) goto L88
            android.app.KeyguardManager r7 = r9.f10931e
            if (r7 == 0) goto L86
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L86
            char[] r7 = com.google.android.gms.internal.ads.sf.f10283a
            android.view.View r7 = r0.getRootView()
            if (r7 != 0) goto L52
            r7 = r0
        L52:
            android.content.Context r7 = r7.getContext()
        L56:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L6e
            r8 = 10
            if (r6 >= r8) goto L6e
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L65
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6f
        L65:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + 1
            goto L56
        L6e:
            r7 = r1
        L6f:
            if (r7 != 0) goto L72
            goto L86
        L72:
            android.view.Window r6 = r7.getWindow()
            if (r6 != 0) goto L79
            goto L7d
        L79:
            android.view.WindowManager$LayoutParams r1 = r6.getAttributes()
        L7d:
            if (r1 == 0) goto L86
            int r1 = r1.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r6
            if (r1 != 0) goto L88
        L86:
            r5 = r5 | 8
        L88:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r1 = r0.getGlobalVisibleRect(r1)
            if (r1 != 0) goto L95
            r5 = r5 | 16
        L95:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r1 = r0.getLocalVisibleRect(r1)
            if (r1 != 0) goto La2
            r5 = r5 | 32
        La2:
            int r0 = r0.getWindowVisibility()
            int r1 = r9.f10937l
            if (r1 == r2) goto Lab
            r0 = r1
        Lab:
            if (r0 == 0) goto Laf
            r5 = r5 | 64
        Laf:
            byte r0 = r9.f10936k
            if (r0 == r5) goto Lc2
            byte r0 = (byte) r5
            r9.f10936k = r0
            if (r5 != 0) goto Lbd
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lc0
        Lbd:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lc0:
            r9.f10938m = r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uf.c():void");
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10934h = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10932f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            bj.g gVar = new bj.g(1, this);
            this.f10932f = gVar;
            this.f10928b.registerReceiver(gVar, intentFilter);
        }
        Application application = this.f10929c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10935j);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f10934h;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10934h = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        bj.g gVar = this.f10932f;
        if (gVar != null) {
            try {
                this.f10928b.unregisterReceiver(gVar);
            } catch (Exception unused3) {
            }
            this.f10932f = null;
        }
        Application application = this.f10929c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10935j);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        f10927n.post(new s(6, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10937l = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10937l = -1;
        c();
        f10927n.post(new s(6, this));
        e(view);
    }
}
