package xh;

import ad.m0;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.jw1;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.protocol.SentryThread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class k extends z2.t implements c, ComponentCallbacks2 {
    public static final int Z = View.generateViewId();
    public d W;
    public final g V = new g(this);
    public final k X = this;
    public final h Y = new h(this);

    public k() {
        P(new Bundle());
    }

    @Override // z2.t
    public final void A() {
        l().unregisterComponentCallbacks(this);
        this.E = true;
        d dVar = this.W;
        if (dVar == null) {
            toString();
            return;
        }
        dVar.f();
        d dVar2 = this.W;
        dVar2.f36106a = null;
        dVar2.f36107b = null;
        dVar2.f36108c = null;
        dVar2.f36109d = null;
        dVar2.f36110e = null;
        this.W = null;
    }

    @Override // z2.t
    public final void C() {
        this.E = true;
        if (U("onPause")) {
            d dVar = this.W;
            dVar.c();
            dVar.f36106a.getClass();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                e4.j jVar = flutterEngine.f25547g;
                jVar.f(3, jVar.f16134c);
            }
        }
    }

    @Override // z2.t
    public final void D(int i, String[] strArr, int[] iArr) {
        if (U("onRequestPermissionsResult")) {
            d dVar = this.W;
            dVar.c();
            if (dVar.f36107b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            jw1 jw1Var = dVar.f36107b.f25544d;
            if (!jw1Var.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            gj.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((h3) jw1Var.f6960g).f28252d).iterator();
                while (true) {
                    boolean z5 = false;
                    while (it.hasNext()) {
                        if (((ii.u) it.next()).b(i, strArr, iArr) || z5) {
                            z5 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // z2.t
    public final void E() {
        this.E = true;
        if (U("onResume")) {
            d dVar = this.W;
            dVar.c();
            dVar.f36107b.f25542b.i();
            dVar.f36106a.getClass();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                e4.j jVar = flutterEngine.f25547g;
                jVar.f(2, jVar.f16134c);
            }
        }
    }

    @Override // z2.t
    public final void F(Bundle bundle) {
        if (U("onSaveInstanceState")) {
            d dVar = this.W;
            dVar.c();
            if (dVar.f36106a.T()) {
                bundle.putByteArray("framework", (byte[]) dVar.f36107b.f25549j.f20600e);
            }
            if (dVar.f36106a.f45973g.getBoolean("should_attach_engine_to_activity")) {
                Bundle bundle2 = new Bundle();
                jw1 jw1Var = dVar.f36107b.f25544d;
                if (jw1Var.f()) {
                    gj.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                    try {
                        Iterator it = ((HashSet) ((h3) jw1Var.f6960g).f28256h).iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
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
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
                }
                bundle.putBundle("plugins", bundle2);
            }
            if (dVar.f36106a.Q() == null || dVar.f36106a.S()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", dVar.f36106a.Y.isEnabled());
        }
    }

    @Override // z2.t
    public final void G() {
        this.E = true;
        if (U("onStart")) {
            d dVar = this.W;
            dVar.c();
            if (dVar.f36106a.Q() == null && !dVar.f36107b.f25543c.f46279g) {
                String string = dVar.f36106a.f45973g.getString("initial_route");
                if (string == null && (string = dVar.d(dVar.f36106a.j().getIntent())) == null) {
                    string = "/";
                }
                String string2 = dVar.f36106a.f45973g.getString("dart_entrypoint_uri");
                dVar.f36106a.f45973g.getString("dart_entrypoint", SentryThread.JsonKeys.MAIN);
                ((ii.q) dVar.f36107b.i.f491c).a("setInitialRoute", string, null);
                String string3 = dVar.f36106a.f45973g.getString("app_bundle_path");
                if (string3 == null || string3.isEmpty()) {
                    string3 = (String) ((ci.b) ((ci.e) u7.f.q().f34322c).f2295d).f2282c;
                }
                dVar.f36107b.f25543c.c(string2 == null ? new zh.a(string3, dVar.f36106a.f45973g.getString("dart_entrypoint", SentryThread.JsonKeys.MAIN)) : new zh.a(string3, string2, dVar.f36106a.f45973g.getString("dart_entrypoint", SentryThread.JsonKeys.MAIN)), dVar.f36106a.f45973g.getStringArrayList("dart_entrypoint_args"));
            }
            Integer num = dVar.f36115k;
            if (num != null) {
                dVar.f36108c.setVisibility(num.intValue());
            }
        }
    }

    @Override // z2.t
    public final void H() {
        this.E = true;
        if (U("onStop")) {
            d dVar = this.W;
            dVar.c();
            dVar.f36106a.getClass();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                e4.j jVar = flutterEngine.f25547g;
                jVar.f(5, jVar.f16134c);
            }
            dVar.f36115k = Integer.valueOf(dVar.f36108c.getVisibility());
            dVar.f36108c.setVisibility(8);
            FlutterEngine flutterEngine2 = dVar.f36107b;
            if (flutterEngine2 != null) {
                flutterEngine2.f25542b.f(40);
            }
        }
    }

    @Override // z2.t
    public final void I(View view) {
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.V);
    }

    public final String Q() {
        return this.f45973g.getString("cached_engine_id", null);
    }

    public final void R() {
        if (U("onBackPressed")) {
            d dVar = this.W;
            dVar.c();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                ((ii.q) flutterEngine.i.f491c).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final boolean S() {
        boolean z5 = this.f45973g.getBoolean("destroy_engine_with_fragment", false);
        return (Q() != null || this.W.f36112g) ? z5 : this.f45973g.getBoolean("destroy_engine_with_fragment", true);
    }

    public final boolean T() {
        return this.f45973g.containsKey("enable_state_restoration") ? this.f45973g.getBoolean("enable_state_restoration") : Q() == null;
    }

    public final boolean U(String str) {
        d dVar = this.W;
        if (dVar == null) {
            Log.w("FlutterFragment", "FlutterFragment " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (dVar.f36114j) {
            return true;
        }
        Log.w("FlutterFragment", "FlutterFragment " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // xh.f
    public final FlutterEngine b() {
        KeyEvent.Callback callbackJ = j();
        if (callbackJ instanceof f) {
            return ((f) callbackJ).b();
        }
        return null;
    }

    @Override // xh.e
    public final void d(FlutterEngine flutterEngine) {
        KeyEvent.Callback callbackJ = j();
        if (callbackJ instanceof e) {
            ((e) callbackJ).d(flutterEngine);
        }
    }

    @Override // xh.e
    public final void e(FlutterEngine flutterEngine) {
        KeyEvent.Callback callbackJ = j();
        if (callbackJ instanceof e) {
            ((e) callbackJ).e(flutterEngine);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (U("onTrimMemory")) {
            d dVar = this.W;
            dVar.c();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                if (dVar.i && i >= 10) {
                    FlutterJNI flutterJNI = flutterEngine.f25543c.f46274b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    a7.l lVar = dVar.f36107b.f25555p;
                    lVar.getClass();
                    HashMap map = new HashMap(1);
                    map.put("type", "memoryPressure");
                    ((s7.g) lVar.f491c).K(map, null);
                }
                dVar.f36107b.f25542b.f(i);
                io.flutter.plugin.platform.q qVar = dVar.f36107b.f25557r;
                if (i < 40) {
                    qVar.getClass();
                    return;
                }
                Iterator it = qVar.f25736k.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.b0) it.next()).f25686h.setSurface(null);
                }
            }
        }
    }

    @Override // z2.t
    public final void t(int i, int i10, Intent intent) {
        if (U("onActivityResult")) {
            d dVar = this.W;
            dVar.c();
            if (dVar.f36107b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            jw1 jw1Var = dVar.f36107b.f25544d;
            if (!jw1Var.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            gj.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                h3 h3Var = (h3) jw1Var.f6960g;
                h3Var.getClass();
                Iterator it = new HashSet((HashSet) h3Var.f28253e).iterator();
                while (true) {
                    boolean z5 = false;
                    while (it.hasNext()) {
                        if (((ii.s) it.next()).a(i, i10, intent) || z5) {
                            z5 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // z2.t
    public final void v(Context context) {
        d1.b bVar;
        super.v(context);
        this.X.getClass();
        d dVar = new d(this);
        this.W = dVar;
        dVar.c();
        if (dVar.f36107b == null) {
            String strQ = dVar.f36106a.Q();
            if (strQ != null) {
                if (ge.c.f20119b == null) {
                    ge.c.f20119b = new ge.c();
                }
                FlutterEngine flutterEngine = (FlutterEngine) ge.c.f20119b.f20120a.get(strQ);
                dVar.f36107b = flutterEngine;
                dVar.f36112g = true;
                if (flutterEngine == null) {
                    throw new IllegalStateException(pe.a.f("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", strQ, "'"));
                }
            } else {
                k kVar = dVar.f36106a;
                kVar.getClass();
                FlutterEngine flutterEngineB = kVar.b();
                dVar.f36107b = flutterEngineB;
                if (flutterEngineB != null) {
                    dVar.f36112g = true;
                } else {
                    String string = dVar.f36106a.f45973g.getString("cached_engine_group_id", null);
                    if (string != null) {
                        if (yh.e.f45624b == null) {
                            synchronized (yh.e.class) {
                                try {
                                    if (yh.e.f45624b == null) {
                                        yh.e.f45624b = new yh.e(0);
                                    }
                                } finally {
                                }
                            }
                        }
                        yh.d dVar2 = (yh.d) yh.e.f45624b.f45625a.get(string);
                        if (dVar2 == null) {
                            throw new IllegalStateException(pe.a.f("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", string, "'"));
                        }
                        gn0 gn0Var = new gn0(dVar.f36106a.l());
                        dVar.a(gn0Var);
                        dVar.f36107b = dVar2.a(gn0Var);
                        dVar.f36112g = false;
                    } else {
                        Context contextL = dVar.f36106a.l();
                        String[] stringArray = dVar.f36106a.f45973g.getStringArray("initialization_args");
                        if (stringArray == null) {
                            stringArray = new String[0];
                        }
                        HashSet hashSet = new HashSet(Arrays.asList(stringArray));
                        yh.d dVar3 = new yh.d(contextL, (String[]) hashSet.toArray(new String[hashSet.size()]));
                        gn0 gn0Var2 = new gn0(dVar.f36106a.l());
                        gn0Var2.f5873b = false;
                        gn0Var2.f5874c = dVar.f36106a.T();
                        dVar.a(gn0Var2);
                        dVar.f36107b = dVar3.a(gn0Var2);
                        dVar.f36112g = false;
                    }
                }
            }
        }
        if (dVar.f36106a.f45973g.getBoolean("should_attach_engine_to_activity")) {
            jw1 jw1Var = dVar.f36107b.f25544d;
            androidx.lifecycle.w wVar = dVar.f36106a.O;
            jw1Var.getClass();
            gj.a.b("FlutterEngineConnectionRegistry#attachToActivity");
            try {
                d dVar4 = (d) jw1Var.f6959f;
                if (dVar4 != null) {
                    dVar4.b();
                }
                jw1Var.e();
                jw1Var.f6959f = dVar;
                z2.w wVarJ = dVar.f36106a.j();
                if (wVarJ == null) {
                    throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
                }
                jw1Var.b(wVarJ, wVar);
                Trace.endSection();
            } finally {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        z2.w wVarJ2 = dVar.f36106a.j();
        k kVar2 = dVar.f36106a;
        FlutterEngine flutterEngine2 = dVar.f36107b;
        if (wVarJ2 != null) {
            bVar = new d1.b(kVar2.j(), flutterEngine2.f25550k, kVar2);
        } else {
            kVar2.getClass();
            bVar = null;
        }
        dVar.f36109d = bVar;
        k kVar3 = dVar.f36106a;
        FlutterEngine flutterEngine3 = dVar.f36107b;
        kVar3.getClass();
        dVar.f36110e = wVarJ2 != null ? new m0(Z, wVarJ2, flutterEngine3.f25552m) : null;
        dVar.f36106a.d(dVar.f36107b);
        dVar.f36114j = true;
        if (this.f45973g.getBoolean("should_automatically_handle_on_back_pressed", false)) {
            L().getOnBackPressedDispatcher().a(this, this.Y);
            this.Y.setEnabled(false);
        }
        context.registerComponentCallbacks(this);
    }

    @Override // z2.t
    public final void w(Bundle bundle) {
        byte[] byteArray;
        super.w(bundle);
        if (bundle != null) {
            this.Y.setEnabled(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        d dVar = this.W;
        dVar.c();
        if (bundle != null) {
            bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
        } else {
            byteArray = null;
        }
        if (dVar.f36106a.T()) {
            hi.h hVar = dVar.f36107b.f25549j;
            hVar.f20598c = true;
            hi.g gVar = (hi.g) hVar.f20602g;
            if (gVar != null) {
                gVar.success(hi.h.b(byteArray));
                hVar.f20602g = null;
                hVar.f20600e = byteArray;
            } else if (hVar.f20599d) {
                ((ii.q) hVar.f20601f).a("push", hi.h.b(byteArray), new hi.g(0, hVar, byteArray));
            } else {
                hVar.f20600e = byteArray;
            }
        }
        if (dVar.f36106a.f45973g.getBoolean("should_attach_engine_to_activity")) {
            jw1 jw1Var = dVar.f36107b.f25544d;
            if (!jw1Var.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
                return;
            }
            gj.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                Iterator it = ((HashSet) ((h3) jw1Var.f6960g).f28256h).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ce A[LOOP:0: B:36:0x01c8->B:38:0x01ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e4 A[LOOP:1: B:40:0x01de->B:42:0x01e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f9 A[LOOP:2: B:44:0x01f3->B:46:0x01f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0214 A[LOOP:3: B:48:0x020e->B:50:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0229 A[LOOP:4: B:52:0x0223->B:54:0x0229, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028a  */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    @Override // z2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View x(android.view.LayoutInflater r17, android.view.ViewGroup r18) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.k.x(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // z2.t
    public final void z() {
        this.E = true;
        N().getViewTreeObserver().removeOnWindowFocusChangeListener(this.V);
        if (U("onDestroyView")) {
            this.W.e();
        }
    }
}
