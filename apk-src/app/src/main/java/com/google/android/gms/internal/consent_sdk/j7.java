package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.f00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13429g;

    public /* synthetic */ j7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f13424b = i;
        this.f13425c = obj;
        this.f13426d = obj2;
        this.f13427e = obj3;
        this.f13428f = obj4;
        this.f13429g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AtomicReference atomicReference;
        ob.d3 d3Var;
        ob.g0 g0Var;
        ob.e4 e4Var;
        ob.g0 g0Var2;
        switch (this.f13424b) {
            case 0:
                c cVar = (c) this.f13425c;
                Handler handler = (Handler) cVar.f13338b;
                a0 a0Var = (a0) cVar.i;
                Activity activity = (Activity) this.f13426d;
                yc.d dVar = (yc.d) this.f13427e;
                yc.c cVar2 = (yc.c) this.f13428f;
                final yc.b bVar = (yc.b) this.f13429g;
                try {
                    f00 f00Var = dVar.f45611b;
                    if (f00Var == null || !f00Var.f5159b) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + b0.a((Application) cVar.f13337a) + "\") to set this as a debug device.");
                    }
                    b8.a aVarA = ((com.google.firebase.messaging.y) cVar.f13343g).A(cVar.u(((n) cVar.f13342f).a(activity, dVar)));
                    g gVar = (g) cVar.f13340d;
                    gVar.f13391b.edit().putInt("consent_status", aVarA.f1987b).commit();
                    int i = aVarA.f1988c;
                    SharedPreferences.Editor editorEdit = gVar.f13391b.edit();
                    if (i == 1) {
                        str = "UNKNOWN";
                    } else if (i == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    editorEdit.putString("privacy_options_requirement_status", str).commit();
                    ((o) cVar.f13341e).f13502c.set((p) aVarA.f1989d);
                    a0Var.a((Queue) a0Var.f13319f.get(), 8, 9, null);
                    ((r0) cVar.f13344h).f13537a.execute(new aa.y(cVar, cVar2, aVarA, 5));
                    return;
                } catch (n1 e3) {
                    a0Var.a((Queue) a0Var.f13319f.get(), 8, 9, t.z.e("RequestConsentUpdate exception. Error: ", e3.getMessage(), ", cause: ", String.valueOf(e3.getCause())));
                    final int i10 = 0;
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.z5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    bVar.a(e3.a());
                                    break;
                                default:
                                    bVar.a(e3.a());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e7) {
                    a0Var.a((Queue) a0Var.f13319f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e7.getMessage())));
                    final int i11 = 1;
                    final n1 n1Var = new n1(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e7))));
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.z5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    bVar.a(n1Var.a());
                                    break;
                                default:
                                    bVar.a(n1Var.a());
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 1:
                ob.r1 r1Var = (ob.r1) this.f13425c;
                ob.g4 g4Var = (ob.g4) this.f13426d;
                Bundle bundle = (Bundle) this.f13427e;
                ob.i0 i0Var = (ob.i0) this.f13428f;
                String str2 = (String) this.f13429g;
                ob.z3 z3Var = r1Var.f30382b;
                z3Var.B();
                try {
                    i0Var.G3(z3Var.c0(bundle, g4Var));
                    return;
                } catch (RemoteException e10) {
                    z3Var.b().f30411g.h(str2, "Failed to return trigger URIs for app", e10);
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f13425c;
                synchronized (atomicReference2) {
                    try {
                        try {
                            d3Var = (ob.d3) this.f13429g;
                            g0Var = d3Var.f30067e;
                        } catch (RemoteException e11) {
                            ob.s0 s0Var = ((ob.l1) ((ob.d3) this.f13429g).f15951b).f30265g;
                            ob.l1.k(s0Var);
                            s0Var.f30411g.i("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f13426d, e11);
                            ((AtomicReference) this.f13425c).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f13425c;
                        }
                        if (g0Var == null) {
                            ob.s0 s0Var2 = ((ob.l1) d3Var.f15951b).f30265g;
                            ob.l1.k(s0Var2);
                            s0Var2.f30411g.i("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f13426d, (String) this.f13427e);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(g0Var.T1((String) this.f13426d, (String) this.f13427e, (ob.g4) this.f13428f));
                        } else {
                            atomicReference2.set(g0Var.A1(null, (String) this.f13426d, (String) this.f13427e));
                        }
                        d3Var.P();
                        atomicReference = (AtomicReference) this.f13425c;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f13425c).notify();
                        throw th2;
                    }
                }
            case 3:
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.f13428f;
                String str3 = (String) this.f13426d;
                String str4 = (String) this.f13425c;
                ob.d3 d3Var2 = (ob.d3) this.f13429g;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        g0Var2 = d3Var2.f30067e;
                    } catch (RemoteException e12) {
                        ob.s0 s0Var3 = ((ob.l1) d3Var2.f15951b).f30265g;
                        ob.l1.k(s0Var3);
                        s0Var3.f30411g.i("Failed to get conditional properties; remote exception", str4, str3, e12);
                    }
                    if (g0Var2 != null) {
                        arrayList = ob.e4.q0(g0Var2.T1(str4, str3, (ob.g4) this.f13427e));
                        d3Var2.P();
                        e4Var = ((ob.l1) d3Var2.f15951b).f30267j;
                        ob.l1.h(e4Var);
                        e4Var.p0(l0Var, arrayList);
                        return;
                    }
                    ob.l1 l1Var = (ob.l1) d3Var2.f15951b;
                    ob.s0 s0Var4 = l1Var.f30265g;
                    ob.l1.k(s0Var4);
                    s0Var4.f30411g.h(str4, "Failed to get conditional properties; not connected to service", str3);
                    e4Var = l1Var.f30267j;
                    ob.l1.h(e4Var);
                    e4Var.p0(l0Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    ob.e4 e4Var2 = ((ob.l1) d3Var2.f15951b).f30267j;
                    ob.l1.h(e4Var2);
                    e4Var2.p0(l0Var, arrayList);
                    throw th3;
                }
            default:
                try {
                    if (!(((w7.j) this.f13425c).f35196b instanceof w7.a)) {
                        String string = ((UUID) this.f13426d).toString();
                        int iE = ((v7.m) this.f13429g).f34789c.e(string);
                        if (iE == 0 || l7.o.a(iE)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((m7.c) ((v7.m) this.f13429g).f34788b).f(string, (l7.g) this.f13427e);
                        ((Context) this.f13428f).startService(t7.b.a((Context) this.f13428f, string, (l7.g) this.f13427e));
                    }
                    ((w7.j) this.f13425c).j(null);
                    return;
                } catch (Throwable th4) {
                    ((w7.j) this.f13425c).k(th4);
                    return;
                }
        }
    }

    public /* synthetic */ j7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z5) {
        this.f13424b = i;
        this.f13425c = obj2;
        this.f13426d = obj3;
        this.f13427e = obj4;
        this.f13428f = obj5;
        this.f13429g = obj;
    }
}
