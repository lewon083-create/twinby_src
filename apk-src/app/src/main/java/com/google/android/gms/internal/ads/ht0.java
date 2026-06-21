package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.MeasurementUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientApi f6241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oq0 f6244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q9.x2 f6245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt0 f6246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f6247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q9.p0 f6248h;
    public final q9.q0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Queue f6249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final it0 f6250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f6252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f6253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mr0 f6254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f6255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f6256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kx0 f6257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ua.a f6258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mt0 f6259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6260u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ht0(ClientApi clientApi, Context context, int i, oq0 oq0Var, q9.x2 x2Var, q9.p0 p0Var, ScheduledExecutorService scheduledExecutorService, mr0 mr0Var, it0 it0Var, ua.a aVar, int i10) {
        this(MeasurementUnit.NONE, clientApi, context, i, oq0Var, x2Var, scheduledExecutorService, mr0Var, it0Var, aVar, (dt0) null);
        this.f6260u = i10;
        this.f6248h = p0Var;
    }

    public final void a(q9.x1 x1Var) {
        synchronized (this) {
            try {
                if (this.f6255p.get()) {
                    t9.g0.f33596l.post(new th0(this, x1Var, 12));
                }
                this.f6252m.set(false);
                int i = x1Var.f31976b;
                if (i != 1 && i != 8 && i != 10 && i != 11) {
                    c(true);
                    return;
                }
                q9.x2 x2Var = this.f6245e;
                int i10 = x2Var.f31982c;
                String str = x2Var.f31981b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26 + String.valueOf(str).length() + 61);
                sb2.append("Preloading ");
                sb2.append(i10);
                sb2.append(", for adUnitId:");
                sb2.append(str);
                sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
                u9.i.g(sb2.toString());
                this.f6247g.set(false);
                dt0 dt0Var = this.f6246f;
                if (dt0Var != null) {
                    dt0Var.a(this);
                }
                oq0 oq0Var = new oq0(27, this.f6245e.f31981b, p());
                oq0Var.f8764e = this.f6251l;
                mt0 mt0Var = new mt0(oq0Var);
                kx0 kx0Var = this.f6257r;
                this.f6258s.getClass();
                kx0Var.N(System.currentTimeMillis(), mt0Var, x1Var, this.f6245e.f31984e, q(), f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void b(Object obj) {
        try {
            q9.y1 y1VarI = i(obj);
            double d10 = !(y1VarI instanceof e60) ? ConfigValue.DOUBLE_DEFAULT_VALUE : ((e60) y1VarI).f4851k;
            q9.y1 y1VarI2 = i(obj);
            int i = y1VarI2 instanceof e60 ? ((e60) y1VarI2).f4852l : 2;
            ua.a aVar = this.f6258s;
            nt0 nt0Var = new nt0(obj, aVar, d10, i);
            this.f6249j.add(nt0Var);
            q9.y1 y1VarI3 = i(obj);
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f6255p.get()) {
                t9.g0.f33596l.post(new th0(this, y1VarI3, 11));
            }
            ScheduledExecutorService scheduledExecutorService = this.f6253n;
            scheduledExecutorService.execute(new f1(this, jCurrentTimeMillis, y1VarI3));
            if (this.f6246f != null) {
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.E)).booleanValue()) {
                    scheduledExecutorService.schedule(new ot0(this, 3), nt0Var.a(), TimeUnit.MILLISECONDS);
                    return;
                }
                mr0 mr0Var = this.f6254o;
                ot0 ot0Var = new ot0(this, 4);
                long jA = nt0Var.a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                mr0Var.a(ot0Var, jA);
                return;
            }
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.E)).booleanValue()) {
                scheduledExecutorService.schedule(new ot0(this, 0), nt0Var.a(), TimeUnit.MILLISECONDS);
                return;
            }
            mr0 mr0Var2 = this.f6254o;
            ot0 ot0Var2 = new ot0(this, 0);
            long jA2 = nt0Var.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            mr0Var2.a(ot0Var2, jA2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(boolean z5) {
        try {
            dt0 dt0Var = this.f6246f;
            if (dt0Var != null) {
                if (z5) {
                    this.f6250k.c();
                }
                dt0Var.a(this);
            } else {
                it0 it0Var = this.f6250k;
                if (it0Var.d()) {
                    return;
                }
                if (z5) {
                    it0Var.c();
                }
                this.f6253n.schedule(new ot0(this, 0), it0Var.b(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        Iterator it = this.f6249j.iterator();
        while (it.hasNext()) {
            nt0 nt0Var = (nt0) it.next();
            long j10 = nt0Var.f8436b;
            long j11 = nt0Var.f8438d;
            nt0Var.f8437c.getClass();
            if (System.currentTimeMillis() >= j10 + j11) {
                it.remove();
                dt0 dt0Var = this.f6246f;
                if (dt0Var != null) {
                    dt0Var.a(this);
                }
            }
        }
    }

    public final synchronized void e() {
        try {
            if (this.f6256q.get() && this.f6249j.isEmpty()) {
                this.f6256q.set(false);
                if (this.f6255p.get()) {
                    t9.g0.f33596l.post(new ot0(this, 1));
                }
                this.f6253n.execute(new ot0(this, 2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String f() {
        return true != MeasurementUnit.NONE.equals(this.f6251l) ? "2" : "1";
    }

    public final g71 g(Context context) {
        switch (this.f6260u) {
            case 0:
                ir irVar = (ir) ((AtomicReference) this.f6244d.f8764e).get();
                if (irVar != null) {
                    q9.l0 l0VarN2 = this.f6241a.N2(new xa.b(context), q9.g3.e(), this.f6245e.f31981b, irVar, this.f6243c);
                    if (l0VarN2 != null) {
                        y81 y81Var = new y81();
                        try {
                            v(this.f6245e.f31983d);
                            qo0 qo0Var = (qo0) l0VarN2;
                            qo0Var.J1(new gt0(this, y81Var, this.f6245e));
                            qo0Var.X(this.f6245e.f31983d);
                        } catch (RemoteException e3) {
                            u9.i.i("Failed to load app open ad.", e3);
                            return vv.y(new et0());
                        }
                    }
                }
                break;
            case 1:
                ir irVar2 = (ir) ((AtomicReference) this.f6244d.f8764e).get();
                if (irVar2 != null) {
                    q9.l0 l0VarZ3 = this.f6241a.z3(new xa.b(context), new q9.g3(), this.f6245e.f31981b, irVar2, this.f6243c);
                    if (l0VarZ3 != null) {
                        y81 y81Var2 = new y81();
                        try {
                            v(this.f6245e.f31983d);
                            ((xk0) l0VarZ3).R3(this.f6245e.f31983d, new jt0(this, y81Var2, (xk0) l0VarZ3));
                        } catch (RemoteException e7) {
                            u9.i.i("Failed to load interstitial ad.", e7);
                            return vv.y(new et0());
                        }
                    }
                }
                break;
            default:
                ir irVar3 = (ir) ((AtomicReference) this.f6244d.f8764e).get();
                if (irVar3 != null) {
                    ev evVarM2 = this.f6241a.m2(new xa.b(context), this.f6245e.f31981b, irVar3, this.f6243c);
                    if (evVarM2 != null) {
                        y81 y81Var3 = new y81();
                        try {
                            v(this.f6245e.f31983d);
                            ((tp0) evVarM2).R0(this.f6245e.f31983d, new st0(this, y81Var3, (tp0) evVarM2));
                        } catch (RemoteException unused) {
                            u9.i.h("Failed to load rewarded ad.");
                            return vv.y(new et0());
                        }
                    }
                }
                break;
        }
        return vv.y(new et0());
    }

    public final long h() {
        switch (this.f6260u) {
            case 0:
                return ((Long) q9.s.f31967e.f31970c.a(al.S)).longValue();
            case 1:
                return ((Long) q9.s.f31967e.f31970c.a(al.Q)).longValue();
            default:
                return ((Long) q9.s.f31967e.f31970c.a(al.R)).longValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        u9.i.d("Failed to get response info for  the interstitial ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        u9.i.d("Failed to get response info for the app open ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        u9.i.d("Failed to get response info for the rewarded ad.", r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ q9.y1 i(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.f6260u
            switch(r0) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.ev r2 = (com.google.android.gms.internal.ads.ev) r2
            q9.y1 r2 = r2.p()     // Catch: android.os.RemoteException -> Lc
            goto L13
        Lc:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the rewarded ad."
            u9.i.d(r0, r2)
            r2 = 0
        L13:
            return r2
        L14:
            q9.l0 r2 = (q9.l0) r2
            q9.y1 r2 = r2.B()     // Catch: android.os.RemoteException -> L1b
            goto L22
        L1b:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for  the interstitial ad."
            u9.i.d(r0, r2)
            r2 = 0
        L22:
            return r2
        L23:
            com.google.android.gms.internal.ads.zh r2 = (com.google.android.gms.internal.ads.zh) r2
            q9.y1 r2 = r2.k()     // Catch: android.os.RemoteException -> L2a
            goto L31
        L2a:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the app open ad."
            u9.i.d(r0, r2)
            r2 = 0
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ht0.i(java.lang.Object):q9.y1");
    }

    public final synchronized void j() {
        if (!this.f6252m.get() && this.f6247g.get() && this.f6249j.size() < this.f6245e.f31984e) {
            this.f6252m.set(true);
            this.f6253n.submit(new ot0(this, 5));
        }
    }

    public final synchronized boolean k() {
        try {
            wk wkVar = al.K;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                this.f6250k.a();
            }
            if (((Boolean) sVar.f31970c.a(al.D)).booleanValue() && this.f6246f == null) {
                s();
            } else {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return !this.f6249j.isEmpty();
    }

    public final synchronized Object l() {
        try {
            wk wkVar = al.N;
            q9.s sVar = q9.s.f31967e;
            boolean z5 = true;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                if (!((Boolean) sVar.f31970c.a(al.L)).booleanValue() || this.f6249j.size() == 1) {
                    this.f6250k.a();
                }
            }
            if (((Boolean) sVar.f31970c.a(al.M)).booleanValue()) {
                d();
            }
            Queue queue = this.f6249j;
            nt0 nt0Var = (nt0) queue.poll();
            AtomicBoolean atomicBoolean = this.f6256q;
            if (nt0Var == null) {
                z5 = false;
            }
            atomicBoolean.set(z5);
            if (nt0Var == null) {
                nt0Var = null;
            } else if (!queue.isEmpty()) {
                nt0 nt0Var2 = (nt0) queue.peek();
                k9.a aVarA = k9.a.a(this.f6245e.f31982c);
                q9.y1 y1VarI = i(nt0Var.f8435a);
                String str = !(y1VarI instanceof e60) ? null : ((e60) y1VarI).f4846e;
                if (nt0Var2 != null && aVarA != null && str != null && nt0Var2.f8436b < nt0Var.f8436b) {
                    kx0 kx0Var = this.f6257r;
                    this.f6258s.getClass();
                    kx0Var.P("poll_ad", "psvroc_ts", System.currentTimeMillis(), this.f6245e.f31984e, q(), str, this.f6259t, f());
                }
            }
            dt0 dt0Var = this.f6246f;
            if (dt0Var != null) {
                dt0Var.b(this);
            } else {
                long jH = h();
                if (jH < 0) {
                    jH = ((Long) sVar.f31970c.a(al.P)).longValue();
                }
                if (jH > 0) {
                    this.f6253n.schedule(new ot0(this, 0), jH, TimeUnit.MILLISECONDS);
                } else {
                    s();
                }
            }
            if (nt0Var == null) {
                return null;
            }
            return nt0Var.f8435a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void m() {
        this.f6247g.set(true);
        this.f6255p.set(true);
        if (this.f6246f == null) {
            this.f6253n.submit(new ot0(this, 0));
        }
    }

    public final synchronized String n() {
        String str;
        Object obj;
        synchronized (this) {
            nt0 nt0Var = (nt0) this.f6249j.peek();
            str = null;
            obj = nt0Var == null ? null : nt0Var.f8435a;
        }
        return str;
        q9.y1 y1VarI = obj == null ? null : i(obj);
        if (y1VarI instanceof e60) {
            str = ((e60) y1VarI).f4846e;
        }
        return str;
    }

    public final synchronized void o(int i) {
        pa.c0.b(i >= 5);
        it0 it0Var = this.f6250k;
        synchronized (it0Var) {
            pa.c0.b(i > 0);
            it0Var.f6606d = i;
        }
    }

    public final k9.a p() {
        return k9.a.a(this.f6245e.f31982c);
    }

    public final synchronized int q() {
        return this.f6249j.size();
    }

    public final boolean r() {
        if (!this.f6247g.get() || this.f6252m.get() || q() >= this.f6245e.f31984e) {
            return false;
        }
        it0 it0Var = this.f6250k;
        it0Var.f6608f.getClass();
        return System.currentTimeMillis() >= it0Var.f6607e;
    }

    public final synchronized void s() {
        d();
        e();
        if (!this.f6252m.get() && this.f6247g.get() && this.f6249j.size() < this.f6245e.f31984e) {
            this.f6252m.set(true);
            t();
        }
    }

    public final synchronized void t() {
        g71 g71VarG;
        try {
            Activity activityY = p9.k.C.f31301g.y();
            if (activityY == null) {
                u9.i.h("Empty activity context at preloading: ".concat(String.valueOf(this.f6245e.f31981b)));
                g71VarG = g(this.f6242b);
            } else {
                g71VarG = g(activityY);
            }
            in0 in0Var = new in0(5, this);
            g71VarG.a(new l81(0, g71VarG, in0Var), this.f6253n);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void u(int i) {
        dt0 dt0Var;
        pa.c0.b(i > 0);
        k9.a aVarA = k9.a.a(this.f6245e.f31982c);
        int i10 = this.f6245e.f31984e;
        int size = this.f6249j.size();
        synchronized (this) {
            try {
                q9.x2 x2Var = this.f6245e;
                this.f6245e = new q9.x2(x2Var.f31981b, x2Var.f31982c, x2Var.f31983d, i > 0 ? i : x2Var.f31984e);
                Queue queue = this.f6249j;
                if (queue.size() > i) {
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3263x)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < i; i11++) {
                            nt0 nt0Var = (nt0) queue.poll();
                            if (nt0Var != null) {
                                arrayList.add(nt0Var);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (dt0Var = this.f6246f) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            dt0Var.c(this, size2);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kx0 kx0Var = this.f6257r;
        if (kx0Var == null || aVarA == null) {
            return;
        }
        this.f6258s.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f6245e.f31981b;
        zd1 zd1VarA = ((sd0) kx0Var.f7326c).a();
        zd1VarA.v("action", "cache_resize");
        zd1VarA.v("cs_ts", Long.toString(jCurrentTimeMillis));
        zd1VarA.v("orig_ma", Integer.toString(i10));
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("ad_format", aVarA.name().toLowerCase(Locale.ENGLISH));
        zd1VarA.v("ad_unit_id", str);
        zd1VarA.v("pid", null);
        zd1VarA.v("pv", "1");
        zd1VarA.w();
    }

    public final void v(q9.d3 d3Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.C)).booleanValue()) {
            Bundle bundle = d3Var.C;
            bundle.putInt("plcs", q());
            bundle.putInt("plbs", this.f6245e.f31984e);
            bundle.putString("plid", this.f6251l);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ht0(String str, ClientApi clientApi, Context context, int i, oq0 oq0Var, q9.x2 x2Var, q9.q0 q0Var, ScheduledExecutorService scheduledExecutorService, mr0 mr0Var, it0 it0Var, ua.a aVar, dt0 dt0Var, int i10) {
        this(str, clientApi, context, i, oq0Var, x2Var, scheduledExecutorService, mr0Var, it0Var, aVar, dt0Var);
        this.f6260u = i10;
        this.i = q0Var;
    }

    public ht0(String str, ClientApi clientApi, Context context, int i, oq0 oq0Var, q9.x2 x2Var, ScheduledExecutorService scheduledExecutorService, mr0 mr0Var, it0 it0Var, ua.a aVar, dt0 dt0Var) {
        Queue priorityQueue;
        this.f6251l = str;
        this.f6241a = clientApi;
        this.f6242b = context;
        this.f6243c = i;
        this.f6244d = oq0Var;
        this.f6245e = x2Var;
        int iMax = Math.max(1, x2Var.f31984e);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.X)).booleanValue()) {
            priorityQueue = new rt0();
        } else {
            priorityQueue = new PriorityQueue(iMax, v.f11147g);
        }
        this.f6249j = priorityQueue;
        this.f6247g = new AtomicBoolean(true);
        this.f6252m = new AtomicBoolean(false);
        this.f6253n = scheduledExecutorService;
        this.f6254o = mr0Var;
        this.f6250k = it0Var;
        this.f6255p = new AtomicBoolean(true);
        this.f6256q = new AtomicBoolean(false);
        this.f6258s = aVar;
        oq0 oq0Var2 = new oq0(27, x2Var.f31981b, k9.a.a(this.f6245e.f31982c));
        oq0Var2.f8764e = str;
        this.f6259t = new mt0(oq0Var2);
        this.f6246f = dt0Var;
    }
}
