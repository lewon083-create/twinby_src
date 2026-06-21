package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x00 implements ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk0 f11958c;

    public x00(Context context, u9.a aVar) {
        int i;
        gk0 gk0Var;
        this.f11957b = context;
        wk wkVar = al.f3132o3;
        q9.s sVar = q9.s.f31967e;
        int iIntValue = ((Integer) sVar.f31970c.a(wkVar)).intValue();
        if (iIntValue != 1) {
            i = 3;
            if (iIntValue != 2 && iIntValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        wx0 wx0VarD = xx0.D();
        float fFloatValue = ((Float) sVar.f31970c.a(al.f3237v3)).floatValue();
        wx0VarD.b();
        ((xx0) wx0VarD.f9560c).F(fFloatValue);
        xx0 xx0Var = (xx0) wx0VarD.d();
        yx0 yx0VarG = zx0.G();
        boolean zBooleanValue = ((Boolean) sVar.f31970c.a(al.f3251w3)).booleanValue();
        yx0VarG.b();
        ((zx0) yx0VarG.f9560c).I(zBooleanValue);
        long jLongValue = ((Long) sVar.f31970c.a(al.f3282y3)).longValue();
        yx0VarG.b();
        ((zx0) yx0VarG.f9560c).J(jLongValue);
        zx0 zx0Var = (zx0) yx0VarG.d();
        tx0 tx0VarX = ux0.X();
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).D(i);
        String str = aVar.f34365b;
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).Z(str);
        boolean zBooleanValue2 = ((Boolean) sVar.f31970c.a(al.S2)).booleanValue();
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).Y(zBooleanValue2);
        boolean z5 = ((Integer) sVar.f31970c.a(al.f3090l3)).intValue() == -1;
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).B(z5);
        long jIntValue = ((Integer) sVar.f31970c.a(al.f3119n3)).intValue();
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).A(jIntValue);
        long jLongValue2 = ((Long) sVar.f31970c.a(al.f3267x3)).longValue();
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).c0(jLongValue2);
        long jIntValue2 = ((Integer) sVar.f31970c.a(al.f3105m3)).intValue();
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).b0(jIntValue2);
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).a0(xx0Var);
        tx0VarX.b();
        ((ux0) tx0VarX.f9560c).z(zx0Var);
        ux0 ux0Var = (ux0) tx0VarX.d();
        gx gxVar = hx.f6279a;
        synchronized (gk0.f5834d) {
            try {
                if (gk0.f5835e == null) {
                    gk0.f5835e = new gk0(context, gxVar, ux0Var);
                }
                gk0Var = gk0.f5835e;
            } finally {
            }
        }
        this.f11958c = gk0Var;
        py0 py0Var = ((rx0) gk0Var.f5837c).f10077a;
        synchronized (py0Var) {
            try {
                if (py0Var.f9214e != null) {
                    return;
                }
                Set set = (Set) py0Var.f9211b.j();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((oy0) it.next()).h());
                }
                j21 j21Var = (j21) py0Var.f9213d.j();
                s71 s71VarK = vv.K(new a81(x41.v(arrayList), true), u5.f10833t, py0Var.f9212c);
                j21Var.e(2, s71VarK);
                py0Var.f9214e = s71VarK;
                Iterator it2 = ((Set) py0Var.f9210a.j()).iterator();
                while (it2.hasNext()) {
                    ((oy0) it2.next()).h();
                }
                if (py0Var.f9214e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void a(int i, int i10, int i11) {
        u9.d dVar = q9.r.f31959g.f31960a;
        Context context = this.f11957b;
        long j10 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j10, 0, u9.d.b(context, i), u9.d.p(context.getResources().getDisplayMetrics(), i10), 0);
        gk0 gk0Var = this.f11958c;
        gk0Var.s(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j10, 2, u9.d.p(context.getResources().getDisplayMetrics(), i), u9.d.p(context.getResources().getDisplayMetrics(), i10), 0);
        gk0Var.s(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j10, 1, u9.d.p(context.getResources().getDisplayMetrics(), i), u9.d.p(context.getResources().getDisplayMetrics(), i10), 0);
        gk0Var.s(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f11958c.s(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f11958c.q(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String d(Context context) {
        return this.f11958c.o(context);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void e(StackTraceElement[] stackTraceElementArr) {
        gk0 gk0Var = this.f11958c;
        List listAsList = Arrays.asList(stackTraceElementArr);
        d21 d21Var = ((rx0) gk0Var.f5837c).f10079c.f12845b;
        synchronized (d21Var) {
            ArrayList arrayList = d21Var.f4424b;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String f(Context context) {
        return this.f11958c.o(context);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String h(Context context, String str, View view) {
        return this.f11958c.q(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String i(Context context, View view, Activity activity) {
        String string;
        s71 s71Var;
        rx0 rx0Var = (rx0) this.f11958c.f5837c;
        fy0 fy0Var = rx0Var.f10081e;
        j21 j21Var = rx0Var.f10080d;
        i21 i21VarA = j21Var.a(4);
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
                    string = (String) vv.J(s71Var, new yq(rx0Var, context, view, activity, 6), f81.f5272b).get(rx0Var.f10082f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    i21VarA.b(e3);
                    string = "";
                } catch (ExecutionException e7) {
                    Throwable th2 = e7;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    i21VarA.b(th2);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                j21Var.b(57);
                string = Integer.toString(17);
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

    @Override // com.google.android.gms.internal.ads.ve
    public final void g(View view) {
    }
}
