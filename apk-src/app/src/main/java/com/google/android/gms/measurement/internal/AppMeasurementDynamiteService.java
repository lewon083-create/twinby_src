package com.google.android.gms.measurement.internal;

import aa.b;
import aa.h0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ur;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.firebase.messaging.j;
import ed.c;
import h1.e;
import io.sentry.protocol.App;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k0.i;
import ka.k;
import ob.b2;
import ob.c2;
import ob.e2;
import ob.e4;
import ob.f2;
import ob.f4;
import ob.g2;
import ob.i1;
import ob.j1;
import ob.k2;
import ob.l1;
import ob.n2;
import ob.p2;
import ob.r2;
import ob.r3;
import ob.s0;
import ob.t3;
import ob.u;
import ob.u0;
import ob.u2;
import ob.v;
import ob.x;
import pa.c0;
import xa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1 f14422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f14423c;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f14422b = null;
        this.f14423c = new e(0);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void beginAdUnitExposure(String str, long j10) {
        l0();
        x xVar = this.f14422b.f30272o;
        l1.f(xVar);
        xVar.D(j10, str);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.Q(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void clearMeasurementEnabled(long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.D();
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new c(25, k2Var, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void endAdUnitExposure(String str, long j10) {
        l0();
        x xVar = this.f14422b.f30272o;
        l1.f(xVar);
        xVar.E(j10, str);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void generateEventId(l0 l0Var) {
        l0();
        e4 e4Var = this.f14422b.f30267j;
        l1.h(e4Var);
        long jX0 = e4Var.x0();
        l0();
        e4 e4Var2 = this.f14422b.f30267j;
        l1.h(e4Var2);
        e4Var2.k0(l0Var, jX0);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getAppInstanceId(l0 l0Var) {
        l0();
        i1 i1Var = this.f14422b.f30266h;
        l1.k(i1Var);
        i1Var.L(new j1(this, l0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getCachedAppInstanceId(l0 l0Var) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        n0((String) k2Var.f30222h.get(), l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getConditionalUserProperties(String str, String str2, l0 l0Var) {
        l0();
        i1 i1Var = this.f14422b.f30266h;
        l1.k(i1Var);
        i1Var.L(new b(this, l0Var, str, str2, 14, false));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getCurrentScreenClass(l0 l0Var) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        u2 u2Var = ((l1) k2Var.f15951b).f30270m;
        l1.i(u2Var);
        r2 r2Var = u2Var.f30444d;
        n0(r2Var != null ? r2Var.f30386b : null, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getCurrentScreenName(l0 l0Var) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        u2 u2Var = ((l1) k2Var.f15951b).f30270m;
        l1.i(u2Var);
        r2 r2Var = u2Var.f30444d;
        n0(r2Var != null ? r2Var.f30385a : null, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getGmpAppId(l0 l0Var) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        n0(k2Var.R(), l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getMaxUserProperties(String str, l0 l0Var) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        c0.f(str);
        ((l1) k2Var.f15951b).getClass();
        l0();
        e4 e4Var = this.f14422b.f30267j;
        l1.h(e4Var);
        e4Var.l0(l0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getSessionId(l0 l0Var) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new i(k2Var, l0Var));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getTestFlag(l0 l0Var, int i) {
        l0();
        if (i == 0) {
            e4 e4Var = this.f14422b.f30267j;
            l1.h(e4Var);
            k2 k2Var = this.f14422b.f30271n;
            l1.i(k2Var);
            AtomicReference atomicReference = new AtomicReference();
            i1 i1Var = ((l1) k2Var.f15951b).f30266h;
            l1.k(i1Var);
            e4Var.j0((String) i1Var.M(atomicReference, 15000L, "String test flag value", new e2(k2Var, atomicReference, 1)), l0Var);
            return;
        }
        if (i == 1) {
            e4 e4Var2 = this.f14422b.f30267j;
            l1.h(e4Var2);
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            i1 i1Var2 = ((l1) k2Var2.f15951b).f30266h;
            l1.k(i1Var2);
            e4Var2.k0(l0Var, ((Long) i1Var2.M(atomicReference2, 15000L, "long test flag value", new g2(k2Var2, atomicReference2, 0))).longValue());
            return;
        }
        if (i == 2) {
            e4 e4Var3 = this.f14422b.f30267j;
            l1.h(e4Var3);
            k2 k2Var3 = this.f14422b.f30271n;
            l1.i(k2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            i1 i1Var3 = ((l1) k2Var3.f15951b).f30266h;
            l1.k(i1Var3);
            double dDoubleValue = ((Double) i1Var3.M(atomicReference3, 15000L, "double test flag value", new g2(k2Var3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                l0Var.W2(bundle);
                return;
            } catch (RemoteException e3) {
                s0 s0Var = ((l1) e4Var3.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30413j.g(e3, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            e4 e4Var4 = this.f14422b.f30267j;
            l1.h(e4Var4);
            k2 k2Var4 = this.f14422b.f30271n;
            l1.i(k2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            i1 i1Var4 = ((l1) k2Var4.f15951b).f30266h;
            l1.k(i1Var4);
            e4Var4.l0(l0Var, ((Integer) i1Var4.M(atomicReference4, 15000L, "int test flag value", new e2(k2Var4, atomicReference4, 2))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        e4 e4Var5 = this.f14422b.f30267j;
        l1.h(e4Var5);
        k2 k2Var5 = this.f14422b.f30271n;
        l1.i(k2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        i1 i1Var5 = ((l1) k2Var5.f15951b).f30266h;
        l1.k(i1Var5);
        e4Var5.n0(l0Var, ((Boolean) i1Var5.M(atomicReference5, 15000L, "boolean test flag value", new e2(k2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void getUserProperties(String str, String str2, boolean z5, l0 l0Var) {
        l0();
        i1 i1Var = this.f14422b.f30266h;
        l1.k(i1Var);
        i1Var.L(new b2(this, l0Var, str, str2, z5));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void initForTests(Map map) {
        l0();
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void initialize(a aVar, t0 t0Var, long j10) {
        l1 l1Var = this.f14422b;
        if (l1Var == null) {
            Context context = (Context) xa.b.X1(aVar);
            c0.i(context);
            this.f14422b = l1.r(context, t0Var, Long.valueOf(j10));
        } else {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.f("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void isDataCollectionEnabled(l0 l0Var) {
        l0();
        i1 i1Var = this.f14422b.f30266h;
        l1.k(i1Var);
        i1Var.L(new j1(this, l0Var, 1));
    }

    public final void l0() {
        if (this.f14422b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z10, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.H(str, str2, bundle, z5, z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void logEventAndBundle(String str, String str2, Bundle bundle, l0 l0Var, long j10) {
        l0();
        c0.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", App.TYPE);
        v vVar = new v(str2, new u(bundle), App.TYPE, j10);
        i1 i1Var = this.f14422b.f30266h;
        l1.k(i1Var);
        i1Var.L(new b(this, l0Var, vVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void logHealthData(int i, String str, a aVar, a aVar2, a aVar3) {
        l0();
        Object objX1 = aVar == null ? null : xa.b.X1(aVar);
        Object objX12 = aVar2 == null ? null : xa.b.X1(aVar2);
        Object objX13 = aVar3 != null ? xa.b.X1(aVar3) : null;
        s0 s0Var = this.f14422b.f30265g;
        l1.k(s0Var);
        s0Var.L(i, true, false, str, objX1, objX12, objX13);
    }

    public final void n0(String str, l0 l0Var) {
        l0();
        e4 e4Var = this.f14422b.f30267j;
        l1.h(e4Var);
        e4Var.j0(str, l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityCreated(a aVar, Bundle bundle, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivityCreatedByScionActivityInfo(v0.a(activity), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        j jVar = k2Var.f30218d;
        if (jVar != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
            jVar.j(v0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityDestroyed(a aVar, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivityDestroyedByScionActivityInfo(v0.a(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        j jVar = k2Var.f30218d;
        if (jVar != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
            jVar.k(v0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityPaused(a aVar, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivityPausedByScionActivityInfo(v0.a(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityPausedByScionActivityInfo(v0 v0Var, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        j jVar = k2Var.f30218d;
        if (jVar != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
            jVar.l(v0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityResumed(a aVar, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivityResumedByScionActivityInfo(v0.a(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityResumedByScionActivityInfo(v0 v0Var, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        j jVar = k2Var.f30218d;
        if (jVar != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
            jVar.m(v0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivitySaveInstanceState(a aVar, l0 l0Var, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivitySaveInstanceStateByScionActivityInfo(v0.a(activity), l0Var, j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        j jVar = k2Var.f30218d;
        Bundle bundle = new Bundle();
        if (jVar != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
            jVar.n(v0Var, bundle);
        }
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = this.f14422b.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStarted(a aVar, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivityStartedByScionActivityInfo(v0.a(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStartedByScionActivityInfo(v0 v0Var, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        if (k2Var.f30218d != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStopped(a aVar, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        onActivityStoppedByScionActivityInfo(v0.a(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void onActivityStoppedByScionActivityInfo(v0 v0Var, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        if (k2Var.f30218d != null) {
            k2 k2Var2 = this.f14422b.f30271n;
            l1.i(k2Var2);
            k2Var2.V();
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void performAction(Bundle bundle, l0 l0Var, long j10) {
        l0();
        l0Var.W2(null);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void registerOnMeasurementEventListener(q0 q0Var) {
        f4 f4Var;
        l0();
        e eVar = this.f14423c;
        synchronized (eVar) {
            try {
                o0 o0Var = (o0) q0Var;
                Parcel parcelN0 = o0Var.n0(o0Var.D0(), 2);
                int i = parcelN0.readInt();
                parcelN0.recycle();
                f4Var = (f4) eVar.get(Integer.valueOf(i));
                if (f4Var == null) {
                    f4Var = new f4(this, o0Var);
                    Parcel parcelN02 = o0Var.n0(o0Var.D0(), 2);
                    int i10 = parcelN02.readInt();
                    parcelN02.recycle();
                    eVar.put(Integer.valueOf(i10), f4Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.D();
        if (k2Var.f30220f.add(f4Var)) {
            return;
        }
        s0 s0Var = ((l1) k2Var.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30413j.f("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void resetAnalyticsData(long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.f30222h.set(null);
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new c2(k2Var, j10, 1));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void retrieveAndUploadBatches(n0 n0Var) {
        p2 p2Var;
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.D();
        l1 l1Var = (l1) k2Var.f15951b;
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        if (i1Var.I()) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        i1 i1Var2 = l1Var.f30266h;
        l1.k(i1Var2);
        if (Thread.currentThread() == i1Var2.f30182e) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.f("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (l7.b.e()) {
            s0 s0Var3 = l1Var.f30265g;
            l1.k(s0Var3);
            s0Var3.f30411g.f("Cannot retrieve and upload batches from main thread");
            return;
        }
        s0 s0Var4 = l1Var.f30265g;
        l1.k(s0Var4);
        s0Var4.f30418o.f("[sgtm] Started client-side batch upload work.");
        boolean z5 = false;
        int size = 0;
        int i = 0;
        while (!z5) {
            s0 s0Var5 = l1Var.f30265g;
            l1.k(s0Var5);
            s0Var5.f30418o.f("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            i1 i1Var3 = l1Var.f30266h;
            l1.k(i1Var3);
            i1Var3.M(atomicReference, 10000L, "[sgtm] Getting upload batches", new g2(k2Var, atomicReference, 3, false));
            t3 t3Var = (t3) atomicReference.get();
            if (t3Var == null) {
                break;
            }
            List list = t3Var.f30429b;
            if (list.isEmpty()) {
                break;
            }
            s0 s0Var6 = l1Var.f30265g;
            l1.k(s0Var6);
            s0Var6.f30418o.g(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                r3 r3Var = (r3) it.next();
                try {
                    URL url = new URI(r3Var.f30393d).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    ob.l0 l0VarQ = ((l1) k2Var.f15951b).q();
                    l0VarQ.D();
                    c0.i(l0VarQ.f30250h);
                    String str = l0VarQ.f30250h;
                    l1 l1Var2 = (l1) k2Var.f15951b;
                    s0 s0Var7 = l1Var2.f30265g;
                    l1.k(s0Var7);
                    ur urVar = s0Var7.f30418o;
                    Long lValueOf = Long.valueOf(r3Var.f30391b);
                    urVar.i("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, r3Var.f30393d, Integer.valueOf(r3Var.f30392c.length));
                    if (!TextUtils.isEmpty(r3Var.f30397h)) {
                        s0 s0Var8 = l1Var2.f30265g;
                        l1.k(s0Var8);
                        s0Var8.f30418o.h(lValueOf, "[sgtm] Uploading data from app. row_id", r3Var.f30397h);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = r3Var.f30394e;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    n2 n2Var = l1Var2.f30273p;
                    l1.k(n2Var);
                    byte[] bArr = r3Var.f30392c;
                    k kVar = new k(k2Var, atomicReference2, r3Var, 20);
                    n2Var.E();
                    c0.i(url);
                    c0.i(bArr);
                    i1 i1Var4 = ((l1) n2Var.f15951b).f30266h;
                    l1.k(i1Var4);
                    i1Var4.O(new u0(n2Var, str, url, bArr, map, kVar));
                    try {
                        e4 e4Var = l1Var2.f30267j;
                        l1.h(e4Var);
                        l1 l1Var3 = (l1) e4Var.f15951b;
                        l1Var3.f30269l.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    l1Var3.f30269l.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        s0 s0Var9 = ((l1) k2Var.f15951b).f30265g;
                        l1.k(s0Var9);
                        s0Var9.f30413j.f("[sgtm] Interrupted waiting for uploading batch");
                    }
                    p2Var = atomicReference2.get() == null ? p2.UNKNOWN : (p2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e3) {
                    s0 s0Var10 = ((l1) k2Var.f15951b).f30265g;
                    l1.k(s0Var10);
                    s0Var10.f30411g.i("[sgtm] Bad upload url for row_id", r3Var.f30393d, Long.valueOf(r3Var.f30391b), e3);
                    p2Var = p2.FAILURE;
                }
                if (p2Var != p2.SUCCESS) {
                    if (p2Var == p2.BACKOFF) {
                        z5 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        s0 s0Var11 = l1Var.f30265g;
        l1.k(s0Var11);
        s0Var11.f30418o.h(Integer.valueOf(size), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i));
        try {
            n0Var.i();
        } catch (RemoteException e7) {
            l1 l1Var4 = this.f14422b;
            c0.i(l1Var4);
            s0 s0Var12 = l1Var4.f30265g;
            l1.k(s0Var12);
            s0Var12.f30413j.g(e7, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        l0();
        if (bundle == null) {
            s0 s0Var = this.f14422b.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Conditional user property must not be null");
        } else {
            k2 k2Var = this.f14422b.f30271n;
            l1.i(k2Var);
            k2Var.P(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setConsentThirdParty(Bundle bundle, long j10) throws Throwable {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.W(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setCurrentScreen(a aVar, String str, String str2, long j10) {
        l0();
        Activity activity = (Activity) xa.b.X1(aVar);
        c0.i(activity);
        setCurrentScreenByScionActivityInfo(v0.a(activity), str, str2, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.v0 r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.v0, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setDataCollectionEnabled(boolean z5) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.D();
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new h0(k2Var, z5));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setDefaultEventParameters(Bundle bundle) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new f2(k2Var, bundle2, 1));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setEventInterceptor(q0 q0Var) {
        l0();
        l6.i iVar = new l6.i(16, this, q0Var, false);
        i1 i1Var = this.f14422b.f30266h;
        l1.k(i1Var);
        if (!i1Var.I()) {
            i1 i1Var2 = this.f14422b.f30266h;
            l1.k(i1Var2);
            i1Var2.L(new c(26, this, iVar, false));
            return;
        }
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.C();
        k2Var.D();
        l6.i iVar2 = k2Var.f30219e;
        if (iVar != iVar2) {
            c0.k("EventInterceptor already set.", iVar2 == null);
        }
        k2Var.f30219e = iVar;
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.s0 s0Var) {
        l0();
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setMeasurementEnabled(boolean z5, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        Boolean boolValueOf = Boolean.valueOf(z5);
        k2Var.D();
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new c(25, k2Var, boolValueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setMinimumSessionDuration(long j10) {
        l0();
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setSessionTimeoutDuration(long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        i1 i1Var = ((l1) k2Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new c2(k2Var, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setSgtmDebugInfo(Intent intent) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        l1 l1Var = (l1) k2Var.f15951b;
        Uri data = intent.getData();
        if (data == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30416m.f("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30416m.f("[sgtm] Preview Mode was not enabled.");
            l1Var.f30263e.f30121d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        s0 s0Var3 = l1Var.f30265g;
        l1.k(s0Var3);
        s0Var3.f30416m.g(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        l1Var.f30263e.f30121d = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setUserId(String str, long j10) {
        l0();
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        l1 l1Var = (l1) k2Var.f15951b;
        if (str != null && TextUtils.isEmpty(str)) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.f("User ID must be non-empty or null");
        } else {
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.L(new c(28, k2Var, str));
            k2Var.M(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setUserProperty(String str, String str2, a aVar, boolean z5, long j10) {
        l0();
        Object objX1 = xa.b.X1(aVar);
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.M(str, str2, objX1, z5, j10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void unregisterOnMeasurementEventListener(q0 q0Var) {
        o0 o0Var;
        f4 f4Var;
        l0();
        e eVar = this.f14423c;
        synchronized (eVar) {
            o0Var = (o0) q0Var;
            Parcel parcelN0 = o0Var.n0(o0Var.D0(), 2);
            int i = parcelN0.readInt();
            parcelN0.recycle();
            f4Var = (f4) eVar.remove(Integer.valueOf(i));
        }
        if (f4Var == null) {
            f4Var = new f4(this, o0Var);
        }
        k2 k2Var = this.f14422b.f30271n;
        l1.i(k2Var);
        k2Var.D();
        if (k2Var.f30220f.remove(f4Var)) {
            return;
        }
        s0 s0Var = ((l1) k2Var.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30413j.f("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public void setConsent(Bundle bundle, long j10) {
    }
}
