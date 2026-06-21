package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 implements a21 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4797b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4798c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4799d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4800e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4801f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4802g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4803h = -1;
    public long i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4804j = SystemClock.uptimeMillis();

    public static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final synchronized void a(HashMap map) {
        this.i = this.f4803h;
        this.f4803h = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final synchronized void b(HashMap map) {
        this.f4798c = this.f4797b;
        this.f4797b = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final synchronized void c(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.f4800e = this.f4799d;
            this.f4799d = SystemClock.uptimeMillis();
            long j10 = this.f4801f;
            if (j10 != -1) {
                this.f4802g = j10;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i || (iMin == 0 && d(view))) {
                        this.f4801f = this.f4799d;
                    }
                }
                e(map);
            }
            this.f4801f = -1L;
            e(map);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e(HashMap map) {
        map.put("tcq", Long.valueOf(this.f4797b));
        map.put("tpq", Long.valueOf(this.f4798c));
        map.put("tcc", Long.valueOf(this.f4803h));
        map.put("tpc", Long.valueOf(this.i));
        map.put("tpv", Long.valueOf(this.f4800e));
        map.put("tcv", Long.valueOf(this.f4799d));
        map.put("tchv", Long.valueOf(this.f4801f));
        map.put("tphv", Long.valueOf(this.f4802g));
        map.put("tst", Long.valueOf(this.f4804j));
    }
}
