package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n30 implements fh, t60, s9.l, r60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i30 f8166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30 f8167c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cr f8169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f8170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ua.a f8171g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f8168d = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f8172h = new AtomicBoolean(false);
    public final m30 i = new m30();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8173j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f8174k = new WeakReference(this);

    public n30(br brVar, j30 j30Var, Executor executor, i30 i30Var, ua.a aVar) {
        this.f8166b = i30Var;
        brVar.a();
        this.f8169e = new cr(0, brVar.f3857b);
        this.f8167c = j30Var;
        this.f8170f = executor;
        this.f8171g = aVar;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final synchronized void I(eh ehVar) {
        m30 m30Var = this.i;
        m30Var.f7752a = ehVar.f4951j;
        m30Var.f7756e = ehVar;
        e();
    }

    @Override // s9.l
    public final synchronized void L1() {
        this.i.f7753b = true;
        e();
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final synchronized void a(Context context) {
        this.i.f7755d = "u";
        e();
        b();
        this.f8173j = true;
    }

    public final void b() {
        Iterator it = this.f8168d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            i30 i30Var = this.f8166b;
            if (!zHasNext) {
                br brVar = i30Var.f6352b;
                g30 g30Var = i30Var.f6355e;
                ed.d dVar = brVar.f3857b;
                ar arVar = new ar(0, str2, g30Var);
                gx gxVar = hx.f6285g;
                s71 s71VarK = vv.K(dVar, arVar, gxVar);
                brVar.f3857b = s71VarK;
                brVar.f3857b = vv.K(s71VarK, new ar(0, str, i30Var.f6356f), gxVar);
                return;
            }
            sz szVar = (sz) it.next();
            szVar.s1("/updateActiveView", i30Var.f6355e);
            szVar.s1("/untrackActiveViewUnit", i30Var.f6356f);
        }
    }

    public final synchronized void e() {
        try {
            if (this.f8174k.get() == null) {
                synchronized (this) {
                    b();
                    this.f8173j = true;
                }
                return;
            }
            if (this.f8173j || !this.f8172h.get()) {
                return;
            }
            try {
                m30 m30Var = this.i;
                this.f8171g.getClass();
                m30Var.f7754c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectI = this.f8167c.i(m30Var);
                Iterator it = this.f8168d.iterator();
                while (it.hasNext()) {
                    this.f8170f.execute(new l30(jSONObjectI, (sz) it.next()));
                }
                cr crVar = this.f8169e;
                crVar.getClass();
                zq zqVar = new zq(1, crVar, jSONObjectI);
                ed.d dVar = crVar.f4302b;
                gx gxVar = hx.f6285g;
                r71 r71VarJ = vv.J(dVar, zqVar, gxVar);
                r71VarJ.a(new l81(0, r71VarJ, new ea1("ActiveViewListener.callActiveViewJs", 4)), gxVar);
                return;
            } catch (Exception e3) {
                t9.c0.n("Failed to call ActiveViewJS", e3);
                return;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // s9.l
    public final synchronized void i2() {
        this.i.f7753b = false;
        e();
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final synchronized void j(Context context) {
        this.i.f7753b = true;
        e();
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final synchronized void r(Context context) {
        this.i.f7753b = false;
        e();
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final synchronized void z() {
        if (this.f8172h.compareAndSet(false, true)) {
            i30 i30Var = this.f8166b;
            br brVar = i30Var.f6352b;
            g30 g30Var = i30Var.f6355e;
            brVar.a();
            ed.d dVar = brVar.f3857b;
            zq zqVar = new zq(0, "/updateActiveView", g30Var);
            gx gxVar = hx.f6285g;
            brVar.f3857b = vv.J(dVar, zqVar, gxVar);
            g30 g30Var2 = i30Var.f6356f;
            brVar.a();
            brVar.f3857b = vv.J(brVar.f3857b, new zq(0, "/untrackActiveViewUnit", g30Var2), gxVar);
            i30Var.f6354d = this;
            e();
        }
    }

    @Override // s9.l
    public final void A2() {
    }

    @Override // s9.l
    public final void D0() {
    }

    @Override // s9.l
    public final void T0() {
    }

    @Override // s9.l
    public final void X1() {
    }

    @Override // s9.l
    public final void d3() {
    }

    @Override // s9.l
    public final void m() {
    }

    @Override // s9.l
    public final void p1() {
    }

    @Override // s9.l
    public final void w1() {
    }

    @Override // s9.l
    public final void E0(int i) {
    }
}
