package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import io.sentry.ProfilingTraceData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10270d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f10272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f10273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gd0 f10274h;
    public final Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f10275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f10276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yd0 f10277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u9.a f10278m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j80 f10280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bs0 f10281p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10267a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10268b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10269c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jx f10271e = new jx();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f10279n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10282q = true;

    public se0(Executor executor, Context context, WeakReference weakReference, gx gxVar, gd0 gd0Var, ScheduledExecutorService scheduledExecutorService, yd0 yd0Var, u9.a aVar, j80 j80Var, bs0 bs0Var) {
        this.f10274h = gd0Var;
        this.f10272f = context;
        this.f10273g = weakReference;
        this.i = gxVar;
        this.f10276k = scheduledExecutorService;
        this.f10275j = executor;
        this.f10277l = yd0Var;
        this.f10278m = aVar;
        this.f10280o = j80Var;
        this.f10281p = bs0Var;
        p9.k.C.f31304k.getClass();
        this.f10270d = SystemClock.elapsedRealtime();
        d(0, "com.google.android.gms.ads.MobileAds", "", false);
    }

    public final void a() {
        if (!((Boolean) hm.f6178a.r()).booleanValue()) {
            int i = this.f10278m.f34367d;
            wk wkVar = al.f3073k2;
            q9.s sVar = q9.s.f31967e;
            if (i >= ((Integer) sVar.f31970c.a(wkVar)).intValue() && this.f10282q) {
                if (this.f10267a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f10267a) {
                            return;
                        }
                        this.f10277l.d();
                        this.f10280o.i();
                        jx jxVar = this.f10271e;
                        final int i10 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.qe0

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ se0 f9469c;

                            {
                                this.f9469c = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        se0 se0Var = this.f9469c;
                                        yd0 yd0Var = se0Var.f10277l;
                                        synchronized (yd0Var) {
                                            try {
                                                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3250w2)).booleanValue() && !yd0Var.f12596d) {
                                                    HashMap mapE = yd0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = yd0Var.f12594b;
                                                    arrayList.add(mapE);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        yd0Var.f12598f.a((Map) it.next(), false);
                                                    }
                                                    yd0Var.f12596d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        se0Var.f10280o.c();
                                        se0Var.f10268b = true;
                                        return;
                                    default:
                                        se0 se0Var2 = this.f9469c;
                                        synchronized (se0Var2) {
                                            try {
                                                if (se0Var2.f10269c) {
                                                    return;
                                                }
                                                p9.k.C.f31304k.getClass();
                                                se0Var2.d((int) (SystemClock.elapsedRealtime() - se0Var2.f10270d), "com.google.android.gms.ads.MobileAds", "Timeout.", false);
                                                se0Var2.f10277l.c("com.google.android.gms.ads.MobileAds", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                                                se0Var2.f10280o.g("com.google.android.gms.ads.MobileAds", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                                                se0Var2.f10271e.d(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.i;
                        jxVar.f6961b.a(runnable, executor);
                        this.f10267a = true;
                        ed.d dVarC = c();
                        final int i11 = 1;
                        this.f10276k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qe0

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ se0 f9469c;

                            {
                                this.f9469c = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        se0 se0Var = this.f9469c;
                                        yd0 yd0Var = se0Var.f10277l;
                                        synchronized (yd0Var) {
                                            try {
                                                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3250w2)).booleanValue() && !yd0Var.f12596d) {
                                                    HashMap mapE = yd0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = yd0Var.f12594b;
                                                    arrayList.add(mapE);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        yd0Var.f12598f.a((Map) it.next(), false);
                                                    }
                                                    yd0Var.f12596d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        se0Var.f10280o.c();
                                        se0Var.f10268b = true;
                                        return;
                                    default:
                                        se0 se0Var2 = this.f9469c;
                                        synchronized (se0Var2) {
                                            try {
                                                if (se0Var2.f10269c) {
                                                    return;
                                                }
                                                p9.k.C.f31304k.getClass();
                                                se0Var2.d((int) (SystemClock.elapsedRealtime() - se0Var2.f10270d), "com.google.android.gms.ads.MobileAds", "Timeout.", false);
                                                se0Var2.f10277l.c("com.google.android.gms.ads.MobileAds", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                                                se0Var2.f10280o.g("com.google.android.gms.ads.MobileAds", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                                                se0Var2.f10271e.d(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) sVar.f31970c.a(al.f3104m2)).longValue(), TimeUnit.SECONDS);
                        dVarC.a(new l81(0, dVarC, new kx0(this)), executor);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (this.f10267a) {
            return;
        }
        d(0, "com.google.android.gms.ads.MobileAds", "", true);
        this.f10271e.b(Boolean.FALSE);
        this.f10267a = true;
        this.f10268b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f10279n;
        for (String str : concurrentHashMap.keySet()) {
            pp ppVar = (pp) concurrentHashMap.get(str);
            arrayList.add(new pp(ppVar.f9146d, str, ppVar.f9147e, ppVar.f9145c));
        }
        return arrayList;
    }

    public final synchronized ed.d c() {
        p9.k kVar = p9.k.C;
        String str = kVar.f31302h.g().n().f12770e;
        if (!TextUtils.isEmpty(str)) {
            return vv.d(str);
        }
        jx jxVar = new jx();
        t9.e0 e0VarG = kVar.f31302h.g();
        e0VarG.f33566c.add(new l81(26, this, jxVar));
        return jxVar;
    }

    public final void d(int i, String str, String str2, boolean z5) {
        this.f10279n.put(str, new pp(i, str, str2, z5));
    }
}
