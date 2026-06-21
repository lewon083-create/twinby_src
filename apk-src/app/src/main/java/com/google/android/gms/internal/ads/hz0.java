package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 implements cz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f6305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js1 f6306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final js1 f6307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z11 f6308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final js1 f6309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vx0 f6310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ux0 f6311g;

    public hz0(ExecutorService executorService, js1 js1Var, js1 js1Var2, z11 z11Var, js1 js1Var3, vx0 vx0Var, ux0 ux0Var) {
        this.f6305a = executorService;
        this.f6306b = js1Var;
        this.f6307c = js1Var2;
        this.f6308d = z11Var;
        this.f6309e = js1Var3;
        this.f6310f = vx0Var;
        this.f6311g = ux0Var;
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d a(Context context) {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f6310f.j();
        cVar.f13339c = context;
        cVar.f13343g = this.f6308d.a();
        jd jdVarB0 = wd.B0();
        jdVarB0.getClass();
        cVar.f13344h = jdVarB0;
        cVar.i = by0.f3961b;
        return ((mz0) cVar.p().f11972a.j()).a();
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d b(Context context, View view, Activity activity) {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f6310f.j();
        context.getClass();
        cVar.f13339c = context;
        cVar.f13340d = view;
        cVar.f13341e = activity;
        cVar.f13342f = true != this.f6311g.I() ? "" : null;
        cVar.f13343g = this.f6308d.b(context, view);
        jd jdVarB0 = wd.B0();
        jdVarB0.getClass();
        cVar.f13344h = jdVarB0;
        cVar.i = by0.f3962c;
        return ((mz0) cVar.p().f11972a.j()).a();
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final void c(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            kz0 kz0Var = (kz0) this.f6309e.j();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (kz0Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        kz0Var.f7349b = MotionEvent.obtain(motionEvent);
                    }
                    kz0Var.f7350c.a(motionEvent);
                    ArrayDeque arrayDeque = kz0Var.f7348a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new jz0(motionEvent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d d(Context context, String str, View view) {
        js1 js1Var = this.f6309e;
        HashMap mapC = this.f6308d.c();
        kz0 kz0Var = (kz0) js1Var.j();
        synchronized (kz0Var) {
            try {
                MotionEvent motionEvent = kz0Var.f7349b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", kz0Var.f7350c);
                ArrayDeque arrayDeque = kz0Var.f7348a;
                mapC.put("ro", arrayDeque.toArray(new jz0[arrayDeque.size()]));
                kz0Var.f7350c = new iz0();
                arrayDeque.clear();
                MotionEvent motionEvent2 = kz0Var.f7349b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    kz0Var.f7349b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f6310f.j();
        context.getClass();
        cVar.f13339c = context;
        cVar.f13340d = view;
        cVar.f13341e = null;
        cVar.f13342f = str;
        cVar.f13343g = mapC;
        cVar.i = by0.f3963d;
        jd jdVarB0 = wd.B0();
        jdVarB0.getClass();
        cVar.f13344h = jdVarB0;
        return ((mz0) cVar.p().f11972a.j()).a();
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final String h() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final ed.d j() {
        return vv.B(new do0(5, this), this.f6305a);
    }

    @Override // com.google.android.gms.internal.ads.cz0
    public final int k() {
        return 2;
    }
}
