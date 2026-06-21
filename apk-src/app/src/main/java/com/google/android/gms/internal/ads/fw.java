package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5457a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5458b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5459c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5460d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f5461e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f5462f = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f5463g = new AtomicReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f5464h = new ConcurrentHashMap(9);
    public final Object i = new Object();

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) {
        wk wkVar = al.K0;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (!((Boolean) ykVar.a(wkVar)).booleanValue() || ya.d.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) ykVar2.a(al.L0)).intValue()) {
            return false;
        }
        if (!((Boolean) ykVar2.a(al.M0)).booleanValue()) {
            return true;
        }
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public final boolean a(Context context) {
        int iC;
        wk wkVar = al.C0;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && !this.f5460d.get()) {
            if (!((Boolean) sVar.f31970c.a(al.N0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f5461e;
                if (atomicInteger.get() == -1) {
                    u9.d dVar = q9.r.f31959g.f31960a;
                    ma.g gVar = ma.g.f28775b;
                    if (gVar.c(context, 12451000) != 0 && ((iC = gVar.c(context, 12451000)) == 0 || iC == 2)) {
                        u9.i.h("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final String b(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f5458b) {
            try {
                String str = this.f5459c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) k(context, "getGmpAppId");
                this.f5459c = str2;
                return str2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String c(Context context) {
        if (a(context)) {
            wk wkVar = al.I0;
            q9.s sVar = q9.s.f31967e;
            yk ykVar = sVar.f31970c;
            yk ykVar2 = sVar.f31970c;
            long jLongValue = ((Long) ykVar.a(wkVar)).longValue();
            if (jLongValue < 0) {
                return (String) k(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f5457a;
            if (atomicReference.get() == null) {
                wk wkVar2 = al.J0;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) ykVar2.a(wkVar2)).intValue(), ((Integer) ykVar2.a(wkVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ew(this));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new je(3, this, context)).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String d(Context context) {
        Object objK;
        if (a(context) && (objK = k(context, "generateEventId")) != null) {
            return objK.toString();
        }
        return null;
    }

    public final void e(Context context, String str, String str2, String str3, int i) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            h(context, "_ar", str, bundle);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i).length());
            sb2.append("Log a Firebase reward video event, reward type: ");
            sb2.append(str3);
            sb2.append(", reward value: ");
            sb2.append(i);
            t9.c0.m(sb2.toString());
        }
    }

    public final void h(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e3) {
                u9.i.f("Invalid event ID: ".concat(String.valueOf(str2)), e3);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f5462f;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f5464h;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f5464h;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f5462f;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f5464h;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    l(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                t9.c0.m(sb2.toString());
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final Object k(Context context, String str) {
        AtomicReference atomicReference = this.f5462f;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final void l(String str, boolean z5) {
        AtomicBoolean atomicBoolean = this.f5460d;
        if (atomicBoolean.get()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 30);
        sb2.append("Invoke Firebase method ");
        sb2.append(str);
        sb2.append(" error.");
        u9.i.h(sb2.toString());
        if (z5) {
            u9.i.h("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z5) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, objInvoke) && atomicReference.get() == null) {
            }
            return true;
        } catch (Exception unused) {
            l("getInstance", z5);
            return false;
        }
    }
}
