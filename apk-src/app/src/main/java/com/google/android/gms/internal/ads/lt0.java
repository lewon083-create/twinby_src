package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lt0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qt0 f7607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx0 f7608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f7609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f7610f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ua.a f7612h;
    public AtomicInteger i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f7611g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7605a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7606b = new ConcurrentHashMap();

    public lt0(qt0 qt0Var, kx0 kx0Var, Context context, ua.a aVar) {
        this.f7607c = qt0Var;
        this.f7608d = kx0Var;
        this.f7609e = context;
        this.f7612h = aVar;
    }

    public static String a(String str, k9.a aVar) {
        String strName = aVar == null ? "NULL" : aVar.name();
        return t.z.g(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final void b(boolean z5) {
        synchronized (this) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3279y)).booleanValue()) {
                c(z5);
            }
        }
    }

    public final synchronized void c(boolean z5) {
        try {
            if (z5) {
                Iterator it = this.f7605a.values().iterator();
                while (it.hasNext()) {
                    ((ht0) it.next()).m();
                }
            } else {
                Iterator it2 = this.f7605a.values().iterator();
                while (it2.hasNext()) {
                    ((ht0) it2.next()).f6247g.set(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00ee, B:37:0x0105, B:39:0x010b, B:34:0x00fe, B:36:0x0104, B:43:0x0111, B:35:0x00ff), top: B:48:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.ArrayList d(java.util.List r9) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lt0.d(java.util.List):java.util.ArrayList");
    }

    public final synchronized boolean e(String str, k9.a aVar) {
        boolean z5;
        try {
            this.f7612h.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ht0 ht0VarG = g(str, aVar);
            z5 = ht0VarG != null && ht0VarG.k();
            Long lValueOf = z5 ? Long.valueOf(System.currentTimeMillis()) : null;
            mt0 mt0Var = new mt0(new oq0(27, str, aVar));
            int iQ = 0;
            kx0 kx0Var = this.f7608d;
            int i = ht0VarG == null ? 0 : ht0VarG.f6245e.f31984e;
            if (ht0VarG != null) {
                iQ = ht0VarG.q();
            }
            kx0Var.K(i, iQ, jCurrentTimeMillis, lValueOf, ht0VarG != null ? ht0VarG.n() : null, mt0Var, "1");
        } catch (Throwable th2) {
            throw th2;
        }
        return z5;
    }

    public final synchronized Object f(Class cls, String str, k9.a aVar) {
        mt0 mt0Var = new mt0(new oq0(27, str, aVar));
        kx0 kx0Var = this.f7608d;
        this.f7612h.getClass();
        kx0Var.P("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, mt0Var, "1");
        ht0 ht0VarG = g(str, aVar);
        if (ht0VarG == null) {
            return null;
        }
        try {
            String strN = ht0VarG.n();
            Object objL = ht0VarG.l();
            Object objCast = objL == null ? null : cls.cast(objL);
            if (objCast != null) {
                kx0Var.L(System.currentTimeMillis(), ht0VarG.f6245e.f31984e, ht0VarG.q(), strN, mt0Var, "1");
            }
            return objCast;
        } catch (ClassCastException e3) {
            p9.k.C.f31302h.d("PreloadAdManager.pollAd", e3);
            t9.c0.n("Unable to cast ad to the requested type:".concat(cls.getName()), e3);
            return null;
        }
    }

    public final synchronized ht0 g(String str, k9.a aVar) {
        return (ht0) this.f7605a.get(a(str, aVar));
    }
}
