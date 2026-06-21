package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gk0 implements pa.c, o9.b, lx, kx, w9.c, k81, e80, o00, qg0, h90, al0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f5834d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static gk0 f5835e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5837c;

    public gk0(int i) {
        this.f5836b = i;
        switch (i) {
            case 12:
                this.f5837c = new AtomicBoolean(false);
                break;
            case 26:
                break;
            default:
                this.f5837c = new ArrayDeque();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        switch (this.f5836b) {
            case 8:
                t9.c0.m("Releasing engine reference.");
                ((pq) this.f5837c).f9152e.i();
                break;
            case 14:
                ((b70) obj).H((r40) this.f5837c);
                break;
            case 15:
                ((q70) obj).E((ku) this.f5837c);
                break;
            case 16:
                ((a80) obj).y((wj) this.f5837c);
                break;
            default:
                ((ep) obj).N((zu) this.f5837c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00
    public /* synthetic */ void b(int i, String str, String str2, boolean z5) {
        ((ni) this.f5837c).e();
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public /* synthetic */ ed.d c(ku kuVar) {
        return ((xg0) ((js1) ((oq0) this.f5837c).f8764e).j()).n4(kuVar.i);
    }

    @Override // pa.c
    public void c0(ma.b bVar) {
        hi hiVar = (hi) this.f5837c;
        synchronized (hiVar.f6143d) {
            try {
                hiVar.f6146g = null;
                if (((ki) hiVar.f6144e) != null) {
                    hiVar.f6144e = null;
                }
                hiVar.f6143d.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i) {
        g gVar;
        sf0 sf0Var = (sf0) this.f5837c;
        try {
            js0 js0VarZ = ks0.z();
            int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3;
            js0VarZ.b();
            ((ks0) js0VarZ.f9560c).H(i10);
            if (i == 0) {
                rf0 rf0Var = sf0Var.f10285b;
                rf0Var.getClass();
                try {
                    gVar = rf0Var.f9930b;
                } catch (RemoteException unused) {
                }
                gk0 gk0VarE = (gVar == null || !gVar.a()) ? null : gVar.e();
                if (gk0VarE != null) {
                    long j10 = ((Bundle) gk0VarE.f5837c).getLong("referrer_click_timestamp_seconds");
                    js0VarZ.b();
                    ((ks0) js0VarZ.f9560c).B(j10);
                    long j11 = ((Bundle) gk0VarE.f5837c).getLong("install_begin_timestamp_seconds");
                    js0VarZ.b();
                    ((ks0) js0VarZ.f9560c).C(j11);
                    boolean z5 = ((Bundle) gk0VarE.f5837c).getBoolean("google_play_instant");
                    js0VarZ.b();
                    ((ks0) js0VarZ.f9560c).D(z5);
                    long j12 = ((Bundle) gk0VarE.f5837c).getLong("referrer_click_timestamp_server_seconds");
                    js0VarZ.b();
                    ((ks0) js0VarZ.f9560c).E(j12);
                    long j13 = ((Bundle) gk0VarE.f5837c).getLong("install_begin_timestamp_server_seconds");
                    js0VarZ.b();
                    ((ks0) js0VarZ.f9560c).F(j13);
                    if (!TextUtils.isEmpty(((Bundle) gk0VarE.f5837c).getString("install_referrer"))) {
                        String string = ((Bundle) gk0VarE.f5837c).getString("install_referrer");
                        js0VarZ.b();
                        ((ks0) js0VarZ.f9560c).A(string);
                    }
                    if (!TextUtils.isEmpty(((Bundle) gk0VarE.f5837c).getString("install_version"))) {
                        String string2 = ((Bundle) gk0VarE.f5837c).getString("install_version");
                        js0VarZ.b();
                        ((ks0) js0VarZ.f9560c).G(string2);
                    }
                }
            }
            g gVar2 = sf0Var.f10285b.f9930b;
            gVar2.f5552b = 3;
            if (((z9) gVar2.f5556f) != null) {
                rs.f("Unbinding from service.");
                ((Context) gVar2.f5553c).unbindService((z9) gVar2.f5556f);
                gVar2.f5556f = null;
            }
            gVar2.f5555e = null;
            sd0 sd0Var = sf0Var.f10286c;
            String strEncodeToString = Base64.encodeToString(((ks0) js0VarZ.d()).b(), 1);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.F5)).booleanValue()) {
                zd1 zd1VarA = sd0Var.a();
                zd1VarA.v("action", "irda");
                zd1VarA.v("irdd", strEncodeToString);
                zd1VarA.y();
            }
            sf0Var.f10287d.h();
        } catch (Exception e3) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.G5)).booleanValue()) {
                if (sf0Var.f10289f == null) {
                    sf0Var.f10289f = xt.e(sf0Var.f10284a);
                }
                sf0Var.f10289f.c("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e3);
            } else {
                if (sf0Var.f10288e == null) {
                    sf0Var.f10288e = xt.a(sf0Var.f10284a);
                }
                sf0Var.f10288e.c("InstallReferrer.onInstallReferrerSetupFinished", e3);
            }
        }
    }

    @Override // o9.b
    public Map f() {
        return (HashMap) this.f5837c;
    }

    public void g(long j10, long j11, long j12) throws ic {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        hc hcVar = new hc(j10, j11, j12);
        ArrayDeque arrayDeque = (ArrayDeque) this.f5837c;
        if (arrayDeque.size() >= (a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15) ^ (i16 % 452867621))) {
            throw new ic();
        }
        arrayDeque.push(hcVar);
    }

    @Override // com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        switch (this.f5836b) {
            case 9:
                ((jx) this.f5837c).d(new c7.k("Cannot get Javascript Engine"));
                return;
            case 28:
                xk0 xk0Var = (xk0) this.f5837c;
                synchronized (xk0Var) {
                    xk0Var.f12184k = null;
                    break;
                }
                return;
            default:
                qo0 qo0Var = (qo0) this.f5837c;
                synchronized (qo0Var) {
                    qo0Var.f9571l = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void mo6i(Object obj) {
        switch (this.f5836b) {
            case 11:
                tv.f10721l.remove((ed.d) this.f5837c);
                break;
            case 13:
                ((b50) this.f5837c).f3623f.x(true);
                break;
            case 20:
                ((sz) obj).c("sendMessageToNativeJs", (Map) this.f5837c);
                break;
            case 23:
                ((mg0) this.f5837c).f7888c.l((eq0) obj);
                break;
            default:
                try {
                    ((jr0) this.f5837c).a((SQLiteDatabase) obj);
                } catch (Exception e3) {
                    u9.i.e("Error executing function on offline buffered ping database: ".concat(String.valueOf(e3.getMessage())));
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        return (xp0) this.f5837c;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f5836b) {
            case 11:
                tv.f10721l.remove((ed.d) this.f5837c);
                break;
            case 13:
                ((b50) this.f5837c).f3623f.x(false);
                break;
            case 20:
            case 23:
                break;
            default:
                u9.i.e("Failed to get offline buffered ping database: ".concat(String.valueOf(th2.getMessage())));
                break;
        }
    }

    public hc n() {
        return (hc) Optional.ofNullable((hc) ((ArrayDeque) this.f5837c).peek()).orElseThrow(gc.f5769b);
    }

    public String o(Context context) {
        String string;
        s71 s71Var;
        rx0 rx0Var = (rx0) this.f5837c;
        fy0 fy0Var = rx0Var.f10081e;
        j21 j21Var = rx0Var.f10080d;
        long j10 = rx0Var.i;
        boolean z5 = false;
        if (rx0Var.f10085j && System.currentTimeMillis() - j10 <= rx0Var.f10086k) {
            z5 = true;
        }
        i21 i21VarA = j21Var.a(3);
        try {
            try {
                try {
                    try {
                        i21VarA.a();
                        py0 py0Var = rx0Var.f10077a;
                        synchronized (py0Var) {
                            s71Var = py0Var.f9214e;
                            if (s71Var == null) {
                                throw null;
                            }
                        }
                        string = (String) vv.J(s71Var, new zq(14, rx0Var, context), f81.f5272b).get(z5 ? rx0Var.f10084h : rx0Var.f10082f, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e3) {
                        Thread.currentThread().interrupt();
                        i21VarA.b(e3);
                        string = "";
                    } catch (TimeoutException unused) {
                        if (z5) {
                            string = ((n01) rx0Var.f10083g.j()).a(j10);
                        } else {
                            j21Var.b(56);
                            string = Integer.toString(17);
                        }
                    }
                } catch (Throwable th2) {
                    i21VarA.b(th2);
                    throw th2;
                }
            } catch (ExecutionException e7) {
                e = e7;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                i21VarA.b(e);
                string = Integer.toString(3);
            }
            i21VarA.c();
            fy0Var.j();
            return string;
        } catch (Throwable th3) {
            i21VarA.c();
            fy0Var.j();
            throw th3;
        }
    }

    public void p(long j10) {
        hi hiVar = new hi("creation");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "nativeObjectNotCreated";
        t(hiVar);
    }

    public String q(Context context, String str, View view) {
        String string;
        s71 s71Var;
        rx0 rx0Var = (rx0) this.f5837c;
        fy0 fy0Var = rx0Var.f10081e;
        j21 j21Var = rx0Var.f10080d;
        i21 i21VarA = j21Var.a(5);
        try {
            try {
                try {
                    i21VarA.a();
                    py0 py0Var = rx0Var.f10077a;
                    synchronized (py0Var) {
                        s71Var = py0Var.f9214e;
                        if (s71Var == null) {
                            throw null;
                        }
                    }
                    string = (String) vv.J(s71Var, new yq((Object) rx0Var, (Object) context, str, (Object) view, 7), f81.f5272b).get(rx0Var.f10082f, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e3) {
                    Throwable th2 = e3;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    i21VarA.b(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    j21Var.b(58);
                    string = Integer.toString(17);
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                i21VarA.b(e7);
                string = "";
            } catch (Throwable th3) {
                i21VarA.b(th3);
                throw th3;
            }
            i21VarA.c();
            fy0Var.j();
            return string;
        } catch (Throwable th4) {
            i21VarA.c();
            fy0Var.j();
            throw th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public void r(r40 r40Var) {
        switch (this.f5836b) {
            case 28:
                xk0 xk0Var = (xk0) this.f5837c;
                d90 d90Var = (d90) r40Var;
                synchronized (xk0Var) {
                    xk0Var.f12184k = d90Var;
                    d90Var.a();
                    break;
                }
                return;
            default:
                t30 t30Var = (t30) r40Var;
                qo0 qo0Var = (qo0) this.f5837c;
                synchronized (qo0Var) {
                    try {
                        t30 t30Var2 = qo0Var.f9571l;
                        if (t30Var2 != null) {
                            t30Var2.d();
                        }
                        qo0Var.f9571l = t30Var;
                        sz szVar = t30Var.f10474l;
                        if (szVar != null) {
                            szVar.b1(qo0Var);
                        }
                        qo0Var.f9567g.c(new u30(t30Var, qo0Var, qo0Var.f9567g, qo0Var.i));
                        t30Var.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public void s(MotionEvent motionEvent) {
        gz0 gz0Var = ((rx0) this.f5837c).f10078b;
        cz0 cz0Var = (cz0) gz0Var.f5992g.get();
        if (cz0Var == null) {
            gz0Var.f5991f.b(54);
        } else {
            cz0Var.c(motionEvent);
        }
    }

    public void t(hi hiVar) {
        String strA = hiVar.a();
        u9.i.g("Dispatching AFMA event on publisher webview: ".concat(strA));
        hp hpVar = (hp) this.f5837c;
        Parcel parcelD0 = hpVar.D0();
        parcelD0.writeString(strA);
        hpVar.L1(parcelD0, 1);
    }

    @Override // w9.c
    public void w(la.m mVar) {
        try {
            ((ks) this.f5837c).a(mVar.j());
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
    }

    public /* synthetic */ gk0(int i, Object obj) {
        this.f5836b = i;
        this.f5837c = obj;
    }

    public /* synthetic */ gk0(int i, Object obj, Object obj2) {
        this.f5836b = i;
        this.f5837c = obj2;
    }

    public gk0(Context context, Executor executor) {
        this.f5836b = 5;
        this.f5837c = vv.B(new ze(0, context), executor);
    }

    public gk0(pq pqVar) {
        this.f5836b = 8;
        Objects.requireNonNull(pqVar);
        this.f5837c = pqVar;
    }

    public gk0(tv tvVar, ed.d dVar) {
        this.f5836b = 11;
        this.f5837c = dVar;
        Objects.requireNonNull(tvVar);
    }

    public gk0(kc0 kc0Var, Map map) {
        this.f5836b = 20;
        this.f5837c = map;
        Objects.requireNonNull(kc0Var);
    }

    public gk0(sf0 sf0Var) {
        this.f5836b = 22;
        Objects.requireNonNull(sf0Var);
        this.f5837c = sf0Var;
    }

    public gk0(Context context, gx gxVar, ux0 ux0Var) {
        this.f5836b = 1;
        context.getClass();
        gxVar.getClass();
        this.f5837c = (rx0) ((ls1) new f80(gxVar, context, ux0Var).f5269m).j();
    }

    private final void l(Throwable th2) {
    }

    private final void m(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void d(boolean z5, Context context, o60 o60Var) {
    }
}
