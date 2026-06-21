package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appsflyer.AppsFlyerProperties;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xt implements yt {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f12307m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static yt f12308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static yt f12309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static yt f12310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Boolean f12311q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12313c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u9.a f12316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PackageInfo f12317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12318h;
    public final String i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f12321l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12312b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f12314d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f12315e = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f12319j = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xt(android.content.Context r4, u9.a r5) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt.<init>(android.content.Context, u9.a):void");
    }

    public static yt a(Context context) {
        synchronized (f12307m) {
            try {
                if (f12308n == null) {
                    if (h(context)) {
                        f12308n = new xt(context, u9.a.c());
                    } else {
                        f12308n = new fp(12);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12308n;
    }

    public static yt b(Context context, u9.a aVar) {
        synchronized (f12307m) {
            try {
                if (f12310p == null) {
                    boolean z5 = false;
                    if (((Boolean) ul.f10969c.r()).booleanValue()) {
                        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3286y8)).booleanValue() || ((Boolean) ul.f10967a.r()).booleanValue()) {
                            z5 = true;
                        }
                    }
                    if (h(context)) {
                        xt xtVar = new xt(context, aVar);
                        xtVar.i();
                        Thread.setDefaultUncaughtExceptionHandler(new wt(xtVar, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f12310p = xtVar;
                    } else if (!z5 || context == null) {
                        f12310p = new fp(12);
                    } else {
                        xt xtVar2 = new xt(context, aVar);
                        xtVar2.f12320k = true;
                        xtVar2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new wt(xtVar2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f12310p = xtVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12310p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002b, B:14:0x0039, B:15:0x0042), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.yt e(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.xt.f12307m
            monitor-enter(r0)
            com.google.android.gms.internal.ads.yt r1 = com.google.android.gms.internal.ads.xt.f12309o     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.f3301z8     // Catch: java.lang.Throwable -> L37
            q9.s r2 = q9.s.f31967e     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.yk r3 = r2.f31970c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.f3286y8     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.xt r1 = new com.google.android.gms.internal.ads.xt     // Catch: java.lang.Throwable -> L37
            u9.a r2 = u9.a.c()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.xt.f12309o = r1     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r4 = move-exception
            goto L46
        L39:
            com.google.android.gms.internal.ads.fp r4 = new com.google.android.gms.internal.ads.fp     // Catch: java.lang.Throwable -> L37
            r1 = 12
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.xt.f12309o = r4     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.yt r4 = com.google.android.gms.internal.ads.xt.f12309o
            return r4
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt.e(android.content.Context):com.google.android.gms.internal.ads.yt");
    }

    public static String f(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (f12307m) {
                try {
                    if (f12311q == null) {
                        f12311q = Boolean.valueOf(q9.r.f31959g.f31964e.nextInt(100) < ((Integer) q9.s.f31967e.f31970c.a(al.Vd)).intValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (f12311q.booleanValue()) {
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3286y8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void c(String str, Throwable th2) {
        if (this.f12320k) {
            return;
        }
        d(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Throwable th2, String str, float f10) {
        Throwable th3;
        boolean zE;
        String packageName;
        PackageInfo packageInfoD;
        ActivityManager.MemoryInfo memoryInfoI;
        String strD;
        Context context = this.f12313c;
        if (this.f12320k) {
            return;
        }
        kw0 kw0Var = u9.d.f34372b;
        if (((Boolean) km.f7261e.r()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z5 = ((Boolean) q9.s.f31967e.f31970c.a(al.N2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && u9.d.n(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (u9.d.n(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z5 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z5) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strF = f(th2);
            String str2 = "";
            if (((Boolean) q9.s.f31967e.f31970c.a(al.U9)).booleanValue() && (strD = u9.d.d(f(th2), "SHA-256")) != null) {
                str2 = strD;
            }
            double d10 = f10;
            double dRandom = Math.random();
            int i = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zE = wa.b.a(context).e();
                } catch (Throwable th5) {
                    u9.i.f("Error fetching instant app info", th5);
                    zE = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    u9.i.h("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zE)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(OperatingSystem.TYPE, Build.VERSION.RELEASE);
                int i10 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i10));
                String str3 = Build.MANUFACTURER;
                String strG = Build.MODEL;
                if (!strG.startsWith(str3)) {
                    strG = t.z.g(new StringBuilder(String.valueOf(str3).length() + 1 + strG.length()), str3, " ", strG);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(Device.TYPE, strG);
                u9.a aVar = this.f12316f;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", aVar.f34365b).appendQueryParameter(AppsFlyerProperties.APP_ID, packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strF);
                q9.s sVar = q9.s.f31967e;
                oq0 oq0Var = sVar.f31968a;
                yk ykVar = sVar.f31970c;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("eids", TextUtils.join(StringUtils.COMMA, oq0Var.w())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(km.f7259c.r()));
                ma.g.f28775b.getClass();
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(ma.g.a(context))).appendQueryParameter("lite", true != aVar.f34369f ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter6.appendQueryParameter("hash", str2);
                }
                if (((Boolean) ykVar.a(al.F8)).booleanValue() && (memoryInfoI = u9.d.i(context)) != null) {
                    builderAppendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfoI.availMem));
                    builderAppendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfoI.totalMem));
                    builderAppendQueryParameter6.appendQueryParameter("is_low_memory", true != memoryInfoI.lowMemory ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                }
                if (((Boolean) ykVar.a(al.E8)).booleanValue()) {
                    String str4 = this.f12318h;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter6.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.i;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter6.appendQueryParameter("psv", str5);
                    }
                    if (i10 >= 26) {
                        packageInfoD = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoD = null;
                    } else {
                        try {
                            packageInfoD = wa.b.a(context).d(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfoD = null;
                        }
                    }
                    if (packageInfoD != null) {
                        builderAppendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfoD.versionCode));
                        builderAppendQueryParameter6.appendQueryParameter("wvvn", packageInfoD.versionName);
                        builderAppendQueryParameter6.appendQueryParameter("wvpn", packageInfoD.packageName);
                    }
                }
                PackageInfo packageInfo = this.f12317g;
                if (packageInfo != null) {
                    builderAppendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter6.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.f12315e.execute(new l81(9, new u9.l(context, null), (String) it.next()));
                }
            }
        }
    }

    public final void g(Throwable th2) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th2 != null) {
            boolean zN = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zN |= u9.d.n(stackTraceElement.getClassName());
                    zEquals |= xt.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) q9.s.f31967e.f31970c.a(al.A8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.f12321l;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strD = u9.d.d(f(th2), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                if (hashSet.contains(strD)) {
                    return;
                } else {
                    hashSet.add(strD);
                }
            }
            if (!zN || zEquals) {
                return;
            }
            if (!this.f12320k) {
                c("", th2);
            }
            if (this.f12319j.getAndSet(true) || !((Boolean) ul.f10969c.r()).booleanValue() || (sharedPreferences = (context = this.f12313c).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", pn1.C(context, "crash_without_write") + 1).commit();
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f12312b) {
            this.f12314d.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new wt(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
