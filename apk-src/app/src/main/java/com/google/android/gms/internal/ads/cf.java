package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cf implements t21, bb, ov0, pa.b, lx, kx, w9.c, k81, e80, vm, qg0, q40, p9.d, al0, dp0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4193c;

    public /* synthetic */ cf(int i) {
        this.f4192b = i;
    }

    public static cf m(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        cf cfVar = new cf(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new bf(0, cfVar));
                return cfVar;
            } catch (RuntimeException unused) {
                synchronized (cf.class) {
                    cfVar.f4193c = null;
                }
            }
        }
        return cfVar;
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f4192b) {
            case 8:
                rq rqVar = (rq) this.f4193c;
                rqVar.getClass();
                sz szVar = ((hq) obj).f6211b;
                if (szVar == null || szVar.A0()) {
                    rqVar.f10019a = 1;
                }
                break;
            case 18:
                ((m60) obj).y0((g90) this.f4193c);
                break;
            case 19:
                ((a80) obj).D((wj) this.f4193c);
                break;
            default:
                ((fh) obj).I((eh) this.f4193c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ov0
    public void b(int i, long j10) {
        ((dv0) this.f4193c).b(i, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public ed.d c(ku kuVar) {
        jg0 jg0Var = (jg0) ((oq0) this.f4193c).f8763d;
        String str = kuVar.i;
        synchronized (jg0Var.f6134c) {
            try {
                int i = jg0Var.i;
                if (i != 1 && i != 3) {
                    return vv.y(new og0(2));
                }
                if (jg0Var.f6135d) {
                    return jg0Var.f6133b;
                }
                jg0Var.i = 3;
                jg0Var.f6135d = true;
                jg0Var.f6843h = str;
                jg0Var.f6138g.d();
                jx jxVar = jg0Var.f6133b;
                jxVar.f6961b.a(new ig0(jg0Var, 0), hx.f6285g);
                return jxVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dp0
    public /* synthetic */ p10 d(cp0 cp0Var) {
        return ((no0) this.f4193c).b(cp0Var);
    }

    @Override // com.google.android.gms.internal.ads.t21
    public /* synthetic */ void f(long j10, tk0 tk0Var) {
        pn1.o(j10, tk0Var, ((o9) this.f4193c).f8641c);
    }

    @Override // com.google.android.gms.internal.ads.vm
    public JSONObject g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bb
    public File h() {
        return (File) this.f4193c;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        jx jxVar;
        switch (this.f4192b) {
            case 13:
                ((AtomicInteger) ((ca.a) this.f4193c).f2254c).set(1);
                return;
            case 17:
                ((q50) this.f4193c).f9336b.a();
                return;
            case 21:
                fa0 fa0Var = (fa0) this.f4193c;
                ja0 ja0Var = fa0Var.f5280m;
                sz szVar = (sz) obj;
                synchronized (ja0Var) {
                    ja0Var.f6775k = szVar;
                }
                ja0 ja0Var2 = fa0Var.f5280m;
                synchronized (ja0Var2) {
                    jxVar = ja0Var2.f6778n;
                }
                wh0 wh0VarE = fa0Var.e("Google", true);
                if (wh0VarE != null && jxVar != null) {
                    jxVar.b(wh0VarE);
                    return;
                } else {
                    if (jxVar != null) {
                        jxVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 23:
                ((we0) obj).f11793o = true;
                ((pf0) this.f4193c).f9044e.c();
                return;
            default:
                try {
                    ((jr0) this.f4193c).a((SQLiteDatabase) obj);
                    return;
                } catch (Exception e3) {
                    u9.i.e("Error executing function on offline signal database: ".concat(String.valueOf(e3.getMessage())));
                    return;
                }
        }
    }

    @Override // p9.d
    public synchronized void j() {
        p9.d dVar = (p9.d) this.f4193c;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f4192b) {
            case 13:
                ((AtomicInteger) ((ca.a) this.f4193c).f2254c).set(-1);
                break;
            case 17:
                break;
            case 21:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3047i6)).booleanValue()) {
                    p9.k.C.f31302h.e("omid native display exp", th2);
                }
                break;
            case 23:
                break;
            default:
                u9.i.e("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vm
    public JSONObject l() {
        return null;
    }

    @Override // pa.b
    public void l0(int i) {
        hi hiVar = (hi) this.f4193c;
        synchronized (hiVar.f6143d) {
            hiVar.f6146g = null;
            hiVar.f6143d.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.ov0
    public void n(long j10, String str, int i) {
        ((dv0) this.f4193c).e(i, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // pa.b
    public void n0() {
        ki kiVar;
        hi hiVar = (hi) this.f4193c;
        synchronized (hiVar.f6143d) {
            try {
                kiVar = (ki) hiVar.f6144e;
            } catch (DeadObjectException e3) {
                u9.i.f("Unable to obtain a cache service instance.", e3);
                ((hi) this.f4193c).p();
            }
            if (kiVar != null) {
                hiVar.f6146g = (mi) kiVar.n();
                ((hi) this.f4193c).f6143d.notifyAll();
            } else {
                ((hi) this.f4193c).f6143d.notifyAll();
            }
        }
    }

    public void o(u1 u1Var) {
        long[] jArr = u1Var.f10781e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4193c;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), u1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public void r(r40 r40Var) {
        r50 r50Var;
        sk0 sk0Var = (sk0) this.f4193c;
        x30 x30Var = (x30) r40Var;
        synchronized (sk0Var) {
            try {
                x30 x30Var2 = sk0Var.f10321j;
                if (x30Var2 != null) {
                    r50 r50Var2 = x30Var.f9704j;
                    if (r50Var2 != null && (r50Var = x30Var2.f9704j) != null) {
                        r50Var2.a(r50Var.f9712a.get());
                    }
                    u60 u60Var = sk0Var.f10321j.f9698c;
                    u60Var.getClass();
                    u60Var.A1(new zk(null, 2));
                }
                sk0Var.f10321j = x30Var;
                x30Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w9.c
    public void w(la.m mVar) {
        switch (this.f4192b) {
            case 10:
                try {
                    ((is) this.f4193c).a(mVar.j());
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                    return;
                }
                break;
            default:
                try {
                    ((ms) this.f4193c).a(mVar.j());
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                }
                break;
        }
    }

    @Override // p9.d
    public synchronized void z(View view) {
        p9.d dVar = (p9.d) this.f4193c;
        if (dVar != null) {
            dVar.z(view);
        }
    }

    public /* synthetic */ cf(int i, Object obj) {
        this.f4192b = i;
        this.f4193c = obj;
    }

    @Override // com.google.android.gms.internal.ads.q40
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public q9.b2 mo3h() throws kq0 {
        try {
            return ((os) ((ci0) this.f4193c).f4217b).m();
        } catch (RemoteException e3) {
            throw new kq0(e3);
        }
    }

    @Override // p9.d
    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public synchronized void mo5l() {
        p9.d dVar = (p9.d) this.f4193c;
        if (dVar != null) {
            dVar.mo5l();
        }
    }

    public /* synthetic */ cf(int i, Object obj, Object obj2) {
        this.f4192b = i;
        this.f4193c = obj2;
    }

    public cf() {
        this.f4192b = 1;
        this.f4193c = new LinkedHashMap();
    }

    public cf(qq qqVar, pq pqVar) {
        this.f4192b = 9;
        this.f4193c = pqVar;
        Objects.requireNonNull(qqVar);
    }

    @Override // com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public void mo4h() {
        switch (this.f4192b) {
            case 9:
                pq pqVar = (pq) this.f4193c;
                t9.c0.m("Rejecting reference for JS Engine.");
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B8)).booleanValue()) {
                    pqVar.g("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    pqVar.f();
                    return;
                }
            case 22:
                fa0 fa0Var = ((dc0) this.f4193c).f4552e;
                if (fa0Var != null) {
                    synchronized (fa0Var) {
                        fa0Var.f5281n.F("_videoMediaView");
                    }
                    return;
                }
                return;
            default:
                sk0 sk0Var = (sk0) this.f4193c;
                synchronized (sk0Var) {
                    sk0Var.f10321j = null;
                    break;
                }
                return;
        }
    }

    private final void p(Throwable th2) {
    }

    private final void q(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.vm
    public void e(MotionEvent motionEvent) {
    }
}
