package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class se implements ve {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static se f10250s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw f10252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0 f10253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bw0 f10254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lf f10255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dv0 f10256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10257h;
    public final ng i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c6 f10258j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wf f10260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1 f10261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q8 f10262n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f10265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f10266r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f10263o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f10264p = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CountDownLatch f10259k = new CountDownLatch(1);

    public se(Context context, dv0 dv0Var, cw cwVar, yv0 yv0Var, bw0 bw0Var, lf lfVar, Executor executor, cv0 cv0Var, ng ngVar, wf wfVar, p1 p1Var, q8 q8Var) {
        this.f10266r = false;
        this.f10251b = context;
        this.f10256g = dv0Var;
        this.f10252c = cwVar;
        this.f10253d = yv0Var;
        this.f10254e = bw0Var;
        this.f10255f = lfVar;
        this.f10257h = executor;
        this.i = ngVar;
        this.f10260l = wfVar;
        this.f10261m = p1Var;
        this.f10262n = q8Var;
        this.f10266r = false;
        this.f10258j = new c6(this, cv0Var);
    }

    public static synchronized se m(Context context, ExecutorService executorService, fv0 fv0Var, boolean z5) {
        try {
            if (f10250s == null) {
                dv0 dv0VarA = dv0.a(context, executorService, z5);
                wk wkVar = al.f2920a4;
                q9.s sVar = q9.s.f31967e;
                cf cfVarM = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue() ? cf.m(context) : null;
                wf wfVarA = ((Boolean) sVar.f31970c.a(al.f2936b4)).booleanValue() ? wf.a(context, executorService) : null;
                p1 p1Var = ((Boolean) sVar.f31970c.a(al.f3058j3)).booleanValue() ? new p1() : null;
                q8 q8Var = ((Boolean) sVar.f31970c.a(al.f3192s3)).booleanValue() ? new q8() : null;
                cw cwVar = new cw(context, executorService, dv0VarA, new iv0());
                sb.m mVarD = com.google.android.gms.internal.measurement.b4.d(new do0(3, cwVar), executorService);
                mVarD.c(executorService, new in0(6, cwVar));
                cwVar.f4350f = mVarD;
                kf kfVar = new kf(context);
                lf lfVar = new lf(fv0Var, cwVar, new uf(context, kfVar), kfVar, cfVarM, wfVarA, p1Var, q8Var);
                ng ngVarS = fs1.s(context, dv0VarA);
                cv0 cv0Var = new cv0();
                se seVar = new se(context, dv0VarA, new cw(context, ngVarS), new yv0(context, ngVarS, new cf(6, dv0VarA), ((Boolean) sVar.f31970c.a(al.T2)).booleanValue()), new bw0(context, lfVar, dv0VarA, cv0Var, false), lfVar, executorService, cv0Var, ngVarS, wfVarA, p1Var, q8Var);
                f10250s = seVar;
                seVar.j();
                f10250s.k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f10250s;
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void a(int i, int i10, int i11) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3053id)).booleanValue() || (displayMetrics = this.f10251b.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i;
        float f11 = displayMetrics.density;
        float f12 = i10;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i11, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void b(MotionEvent motionEvent) {
        yv0 yv0VarB = this.f10254e.b();
        if (yv0VarB != null) {
            try {
                yv0VarB.h(motionEvent);
            } catch (zv0 e3) {
                this.f10256g.c(e3.f13129b, -1L, e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String c(Context context, String str, View view, Activity activity) {
        wf wfVar = this.f10260l;
        if (wfVar != null && wfVar.f11801d) {
            wfVar.f11799b = System.currentTimeMillis();
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
            p1 p1Var = this.f10261m;
            p1Var.f8876h = p1Var.f8875g;
            p1Var.f8875g = SystemClock.uptimeMillis();
        }
        k();
        yv0 yv0VarB = this.f10254e.b();
        if (yv0VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strG = yv0VarB.g(context, str, view, activity);
        this.f10256g.e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void e(StackTraceElement[] stackTraceElementArr) {
        q8 q8Var = this.f10262n;
        if (q8Var != null) {
            q8Var.f9364a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String f(Context context) {
        wf wfVar = this.f10260l;
        if (wfVar != null && wfVar.f11801d) {
            wfVar.f11799b = System.currentTimeMillis();
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
            p1 p1Var = this.f10261m;
            p1Var.f8870b = p1Var.f8869a;
            p1Var.f8869a = SystemClock.uptimeMillis();
        }
        k();
        yv0 yv0VarB = this.f10254e.b();
        if (yv0VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = yv0VarB.c(context);
        this.f10256g.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strC, null);
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void g(View view) {
        this.f10255f.f7501c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String i(Context context, View view, Activity activity) {
        wf wfVar = this.f10260l;
        if (wfVar != null && wfVar.f11801d) {
            wfVar.f11799b = System.currentTimeMillis();
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3058j3)).booleanValue()) {
            this.f10261m.c(context, view);
        }
        k();
        yv0 yv0VarB = this.f10254e.b();
        if (yv0VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = yv0VarB.e(context, view, activity);
        this.f10256g.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strE, null);
        return strE;
    }

    public final synchronized void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        vv0 vv0VarN = n();
        if (vv0VarN == null) {
            this.f10256g.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f10254e.a(vv0VarN)) {
            this.f10266r = true;
            this.f10259k.countDown();
        }
    }

    public final void k() {
        vv0 vv0Var;
        if (this.f10265q) {
            return;
        }
        synchronized (this.f10264p) {
            try {
                if (!this.f10265q) {
                    if ((System.currentTimeMillis() / 1000) - this.f10263o < 3600) {
                        return;
                    }
                    bw0 bw0Var = this.f10254e;
                    synchronized (bw0Var.f3932g) {
                        try {
                            yv0 yv0Var = bw0Var.f3931f;
                            vv0Var = yv0Var != null ? (vv0) yv0Var.f12755d : null;
                        } finally {
                        }
                    }
                    if ((vv0Var == null || vv0Var.f11494a.B() - (System.currentTimeMillis() / 1000) < 3600) && fs1.m(this.i)) {
                        this.f10257h.execute(new s(4, this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        String strZ;
        String strA;
        int length;
        vv0 vv0VarN;
        sg sgVar;
        boolean zH;
        long jCurrentTimeMillis = System.currentTimeMillis();
        vv0 vv0VarN2 = n();
        if (vv0VarN2 != null) {
            strZ = vv0VarN2.f11494a.z();
            strA = vv0VarN2.f11494a.A();
        } else {
            strZ = null;
            strA = null;
        }
        try {
            try {
                Context context = this.f10251b;
                ng ngVar = this.i;
                dv0 dv0Var = this.f10256g;
                xv0 xv0VarB = vv.b(context, ngVar, strZ, strA, dv0Var);
                byte[] bArr = xv0VarB.f12346c;
                if (bArr == null || (length = bArr.length) == 0) {
                    dv0Var.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zm1 zm1VarA = bn1.A(bArr, 0, length);
                        kn1 kn1Var = kn1.f7271a;
                        int i = tm1.f10663a;
                        og ogVarC = og.C(zm1VarA, kn1.f7272b);
                        if (ogVarC.z().z().isEmpty() || ogVarC.z().A().isEmpty() || ogVarC.B().D().length == 0 || ((vv0VarN = n()) != null && (sgVar = vv0VarN.f11494a) != null && ogVarC.z().z().equals(sgVar.z()) && ogVarC.z().A().equals(sgVar.A()))) {
                            this.f10256g.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            c6 c6Var = this.f10258j;
                            int i10 = xv0VarB.f12347d;
                            if (!((Boolean) q9.s.f31967e.f31970c.a(al.R2)).booleanValue()) {
                                zH = this.f10252c.h(ogVarC, c6Var);
                            } else if (i10 == 3) {
                                zH = this.f10253d.f(ogVarC);
                            } else {
                                if (i10 == 4) {
                                    zH = this.f10253d.d(ogVarC, c6Var);
                                }
                                this.f10256g.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zH) {
                                vv0 vv0VarN3 = n();
                                if (vv0VarN3 != null) {
                                    if (this.f10254e.a(vv0VarN3)) {
                                        this.f10266r = true;
                                    }
                                    this.f10263o = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f10256g.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f10256g.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (co1 e3) {
                this.f10256g.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            }
            this.f10259k.countDown();
        } catch (Throwable th2) {
            this.f10259k.countDown();
            throw th2;
        }
    }

    public final vv0 n() {
        if (fs1.m(this.i)) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.R2)).booleanValue()) {
                yv0 yv0Var = this.f10253d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (yv0.f12752g) {
                    try {
                        sg sgVarR = yv0Var.r(1);
                        if (sgVarR == null) {
                            yv0Var.p(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileI = yv0Var.i(sgVarR.z());
                        File file = new File(fileI, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileI, "pcam");
                        }
                        File file2 = new File(fileI, "pcbc");
                        File file3 = new File(fileI, "pcopt");
                        yv0Var.p(5016, jCurrentTimeMillis);
                        return new vv0(sgVarR, file, file2, file3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            cw cwVar = this.f10252c;
            sg sgVarR2 = cwVar.r(1);
            if (sgVarR2 != null) {
                String strZ = sgVarR2.z();
                File fileB = ix.b(strZ, "pcam.jar", cwVar.u());
                if (!fileB.exists()) {
                    fileB = ix.b(strZ, "pcam", cwVar.u());
                }
                return new vv0(sgVarR2, fileB, ix.b(strZ, "pcbc", cwVar.u()), ix.b(strZ, "pcopt", cwVar.u()));
            }
        }
        return null;
    }
}
