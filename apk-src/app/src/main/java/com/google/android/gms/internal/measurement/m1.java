package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile m1 f13877f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f13878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.b1 f13879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile j0 f13882e;

    public m1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13878a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f13879b = new a0.b1(28, this);
        new ArrayList();
        try {
            if (ob.y1.b(context, ob.y1.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, m1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f13881d = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new d1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new l1(this));
        }
    }

    public static m1 e(Context context, Bundle bundle) {
        pa.c0.i(context);
        if (f13877f == null) {
            synchronized (m1.class) {
                try {
                    if (f13877f == null) {
                        f13877f = new m1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f13877f;
    }

    public final Map a(String str, String str2, boolean z5) {
        g0 g0Var = new g0();
        c(new w0(this, str, str2, z5, g0Var));
        Bundle bundleN0 = g0Var.n0(5000L);
        if (bundleN0 == null || bundleN0.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleN0.size());
        for (String str3 : bundleN0.keySet()) {
            Object obj = bundleN0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        g0 g0Var = new g0();
        c(new d1(this, str, g0Var));
        Integer num = (Integer) g0.D0(g0Var.n0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(j1 j1Var) {
        this.f13878a.execute(j1Var);
    }

    public final void d(Exception exc, boolean z5, boolean z10) {
        this.f13881d |= z5;
        if (z5) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            c(new d1(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        g0 g0Var = new g0();
        c(new y0(this, str, str2, g0Var));
        List list = (List) g0.D0(g0Var.n0(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
