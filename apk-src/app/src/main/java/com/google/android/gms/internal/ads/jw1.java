package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6960g;

    public jw1(Context context, d8.s sVar, oi.i iVar, a1.e eVar) {
        this.f6954a = context;
        this.f6956c = sVar;
        this.f6957d = iVar;
        this.f6958e = eVar;
        this.f6959f = new d8.o0(this, true);
        this.f6960g = new d8.o0(this, false);
    }

    public void a(ei.b bVar) {
        HashMap map = (HashMap) this.f6954a;
        gj.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            if (map.containsKey(bVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((FlutterEngine) this.f6956c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            map.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((ei.a) this.f6957d);
            if (bVar instanceof fi.a) {
                fi.a aVar = (fi.a) bVar;
                ((HashMap) this.f6958e).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((m.h3) this.f6960g);
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void b(z2.w wVar, androidx.lifecycle.w wVar2) {
        m.h3 h3Var = new m.h3();
        h3Var.f28252d = new HashSet();
        h3Var.f28253e = new HashSet();
        h3Var.f28254f = new HashSet();
        h3Var.f28255g = new HashSet();
        new HashSet();
        h3Var.f28256h = new HashSet();
        h3Var.f28250b = wVar;
        h3Var.f28251c = new HiddenLifecycleReference(wVar2);
        this.f6960g = h3Var;
        boolean booleanExtra = wVar.getIntent() != null ? wVar.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        FlutterEngine flutterEngine = (FlutterEngine) this.f6956c;
        flutterEngine.f25557r.f25748w = booleanExtra;
        h3.e eVar = flutterEngine.f25559t;
        io.flutter.embedding.engine.renderer.j jVar = flutterEngine.f25542b;
        zh.b bVar = flutterEngine.f25543c;
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) eVar.f20375c;
        if (qVar.f25730d != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        qVar.f25730d = wVar;
        qVar.f25733g = jVar;
        qVar.i = new h3.e(bVar, 7);
        io.flutter.plugin.platform.p pVar = (io.flutter.plugin.platform.p) eVar.f20376d;
        if (pVar.f25714d != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        pVar.f25714d = wVar;
        h3.e eVar2 = new h3.e(bVar, 6);
        pVar.f25718h = eVar2;
        eVar2.f20376d = pVar.f25726q;
        qVar.i.f20376d = eVar;
        for (fi.a aVar : ((HashMap) this.f6958e).values()) {
            if (this.f6955b) {
                aVar.onReattachedToActivityForConfigChanges((m.h3) this.f6960g);
            } else {
                aVar.onAttachedToActivity((m.h3) this.f6960g);
            }
        }
        this.f6955b = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        gj.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f6958e).values().iterator();
            while (it.hasNext()) {
                ((fi.a) it.next()).onDetachedFromActivity();
            }
            d();
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void d() {
        FlutterEngine flutterEngine = (FlutterEngine) this.f6956c;
        io.flutter.plugin.platform.q qVar = flutterEngine.f25557r;
        h3.e eVar = qVar.i;
        if (eVar != null) {
            eVar.f20376d = null;
        }
        qVar.d();
        qVar.i = null;
        qVar.f25730d = null;
        qVar.f25733g = null;
        io.flutter.plugin.platform.p pVar = flutterEngine.f25558s;
        h3.e eVar2 = pVar.f25718h;
        if (eVar2 != null) {
            eVar2.f20376d = null;
        }
        Surface surface = pVar.f25724o;
        if (surface != null) {
            surface.release();
            pVar.f25724o = null;
            pVar.f25725p = null;
        }
        pVar.f25718h = null;
        pVar.f25714d = null;
        this.f6959f = null;
        this.f6960g = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((xh.d) this.f6959f) != null;
    }

    public void g(boolean z5) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f6955b = z5;
        ((d8.o0) this.f6960g).a((Context) this.f6954a, intentFilter2);
        if (!this.f6955b) {
            ((d8.o0) this.f6959f).a((Context) this.f6954a, intentFilter);
            return;
        }
        d8.o0 o0Var = (d8.o0) this.f6959f;
        Context context = (Context) this.f6954a;
        synchronized (o0Var) {
            try {
                if (o0Var.f15696b) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(o0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != o0Var.f15697c ? 4 : 2);
                } else {
                    context.registerReceiver(o0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                o0Var.f15696b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public jw1(Context context, int i) {
        switch (i) {
            case 2:
                this.f6954a = context;
                this.f6956c = u3.b.f34071c;
                break;
            default:
                this.f6954a = context;
                this.f6956c = hv1.f6270c;
                break;
        }
    }

    public jw1(Context context, FlutterEngine flutterEngine, ci.e eVar) {
        this.f6954a = new HashMap();
        this.f6958e = new HashMap();
        this.f6955b = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f6956c = flutterEngine;
        this.f6957d = new ei.a(context, flutterEngine, flutterEngine.f25543c, flutterEngine.f25542b, flutterEngine.f25557r.f25728b, new ni.i(28, eVar));
    }
}
