package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qt0 f5429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx0 f5430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f5432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f5433f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ua.a f5434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicInteger f5435h;
    public final dt0 i;

    public ft0(qt0 qt0Var, kx0 kx0Var, Context context, ua.a aVar, dt0 dt0Var) {
        HashMap map = new HashMap();
        this.f5428a = map;
        map.put(k9.a.APP_OPEN_AD, new HashMap());
        map.put(k9.a.INTERSTITIAL, new HashMap());
        map.put(k9.a.REWARDED, new HashMap());
        this.f5429b = qt0Var;
        this.f5430c = kx0Var;
        this.f5431d = context;
        this.f5434g = aVar;
        this.i = dt0Var;
    }

    public final void a(boolean z5) {
        synchronized (this) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3279y)).booleanValue()) {
                b(z5);
            }
        }
    }

    public final synchronized void b(boolean z5) {
        try {
            Iterator it = this.f5428a.values().iterator();
            while (it.hasNext()) {
                for (ht0 ht0Var : ((Map) it.next()).values()) {
                    if (z5) {
                        ht0Var.m();
                    } else {
                        ht0Var.f6247g.set(false);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Object c(Class cls, String str, k9.a aVar) {
        kx0 kx0Var = this.f5430c;
        this.f5434g.getClass();
        kx0Var.P("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.f5428a;
        if (!map.containsKey(aVar)) {
            return null;
        }
        ht0 ht0Var = (ht0) ((Map) map.get(aVar)).get(str);
        if (ht0Var != null && aVar.equals(ht0Var.p())) {
            oq0 oq0Var = new oq0(27, ht0Var.f6245e.f31981b, ht0Var.p());
            oq0Var.f8764e = str;
            mt0 mt0Var = new mt0(oq0Var);
            kx0Var.P("poll_ad", "ppac_ts", System.currentTimeMillis(), ht0Var.f6245e.f31984e, ht0Var.q(), null, mt0Var, "2");
            try {
                String strN = ht0Var.n();
                Object objL = ht0Var.l();
                Object objCast = objL == null ? null : cls.cast(objL);
                if (objCast != null) {
                    kx0Var.L(System.currentTimeMillis(), ht0Var.f6245e.f31984e, ht0Var.q(), strN, mt0Var, "2");
                }
                return objCast;
            } catch (ClassCastException e3) {
                p9.k.C.f31302h.d("PreloadAdManager.pollAd", e3);
                t9.c0.n("Unable to cast ad to the requested type:".concat(cls.getName()), e3);
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean d(k9.a aVar) {
        int size;
        int iOrdinal;
        try {
            HashMap map = this.f5428a;
            size = map.containsKey(aVar) ? ((Map) map.get(aVar)).size() : 0;
            iOrdinal = aVar.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) q9.s.f31967e.f31970c.a(al.f3092l5)).intValue(), 1) : Math.max(((Integer) q9.s.f31967e.f31970c.a(al.f3076k5)).intValue(), 1) : Math.max(((Integer) q9.s.f31967e.f31970c.a(al.f3060j5)).intValue(), 1));
    }
}
