package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cg extends ig {
    public final /* synthetic */ int i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f4199j;

    public cg(qf qfVar, jd jdVar, int i, View view) {
        super(qfVar, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", jdVar, i, 57);
        this.f4199j = view;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        switch (this.i) {
            case 0:
                Method method = this.f6485f;
                p1 p1Var = (p1) this.f4199j;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(p1Var.f8871c), Long.valueOf(p1Var.f8872d), Long.valueOf(p1Var.f8873e), Long.valueOf(p1Var.f8874f));
                jd jdVar = this.f6484e;
                synchronized (jdVar) {
                    long j10 = jArr[0];
                    jdVar.b();
                    ((wd) jdVar.f9560c).i0(j10);
                    long j11 = jArr[1];
                    jdVar.b();
                    ((wd) jdVar.f9560c).j0(j11);
                    break;
                }
                return;
            case 1:
                Method method2 = this.f6485f;
                q8 q8Var = (q8) this.f4199j;
                List list = q8Var.f9364a;
                q8Var.f9364a = Collections.EMPTY_LIST;
                int iIntValue = ((Integer) method2.invoke(null, list)).intValue();
                jd jdVar2 = this.f6484e;
                synchronized (jdVar2) {
                    int iA = c80.a(iIntValue);
                    jdVar2.b();
                    ((wd) jdVar2.f9560c).t0(iA);
                    break;
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.f4199j;
                if (stackTraceElementArr != null) {
                    af afVar = new af((String) this.f6485f.invoke(null, stackTraceElementArr));
                    jd jdVar3 = this.f6484e;
                    synchronized (jdVar3) {
                        try {
                            long jLongValue = afVar.I.longValue();
                            jdVar3.b();
                            ((wd) jdVar3.f9560c).M(jLongValue);
                            if (((Boolean) afVar.J).booleanValue()) {
                                int i = true != ((Boolean) afVar.K).booleanValue() ? 2 : 1;
                                jdVar3.b();
                                ((wd) jdVar3.f9560c).q0(i);
                            } else {
                                jdVar3.b();
                                ((wd) jdVar3.f9560c).q0(3);
                            }
                        } finally {
                        }
                        break;
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.f4199j;
                if (view != null) {
                    wk wkVar = al.f2953c4;
                    q9.s sVar = q9.s.f31967e;
                    Boolean bool = (Boolean) sVar.f31970c.a(wkVar);
                    Boolean bool2 = (Boolean) sVar.f31970c.a(al.f3052ic);
                    String str = (String) this.f6485f.invoke(null, view, this.f6481b.f9475a.getResources().getDisplayMetrics(), bool, bool2);
                    tf tfVar = new tf();
                    HashMap mapN = pn1.n(str);
                    if (mapN != null) {
                        tfVar.H = (Long) mapN.get(0);
                        tfVar.I = (Long) mapN.get(1);
                        tfVar.J = (Long) mapN.get(2);
                        tfVar.K = (Long) mapN.get(3);
                        tfVar.L = (Long) mapN.get(4);
                    }
                    ud udVarZ = vd.z();
                    long jLongValue2 = tfVar.H.longValue();
                    udVarZ.b();
                    ((vd) udVarZ.f9560c).B(jLongValue2);
                    long jLongValue3 = tfVar.I.longValue();
                    udVarZ.b();
                    ((vd) udVarZ.f9560c).C(jLongValue3);
                    long jLongValue4 = tfVar.J.longValue();
                    udVarZ.b();
                    ((vd) udVarZ.f9560c).D(jLongValue4);
                    if (bool2.booleanValue()) {
                        long jLongValue5 = tfVar.L.longValue();
                        udVarZ.b();
                        ((vd) udVarZ.f9560c).A(jLongValue5);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue6 = tfVar.K.longValue();
                        udVarZ.b();
                        ((vd) udVarZ.f9560c).E(jLongValue6);
                    }
                    jd jdVar4 = this.f6484e;
                    vd vdVar = (vd) udVarZ.d();
                    jdVar4.b();
                    ((wd) jdVar4.f9560c).V(vdVar);
                    return;
                }
                return;
        }
    }

    public cg(qf qfVar, jd jdVar, int i, p1 p1Var) {
        super(qfVar, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", jdVar, i, 85);
        this.f4199j = p1Var;
    }

    public cg(qf qfVar, jd jdVar, int i, q8 q8Var) {
        super(qfVar, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", jdVar, i, 94);
        this.f4199j = q8Var;
    }

    public cg(qf qfVar, jd jdVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(qfVar, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", jdVar, i, 45);
        this.f4199j = stackTraceElementArr;
    }
}
