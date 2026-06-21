package xh;

import ad.m0;
import android.content.Intent;
import android.net.Uri;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.jw1;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.protocol.SentryThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f36106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterEngine f36107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f36108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d1.b f36109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f36110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f36111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36113h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f36115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f36116l = new io.flutter.embedding.engine.renderer.a(1, this);
    public boolean i = false;

    public d(k kVar) {
        this.f36106a = kVar;
    }

    public final void a(gn0 gn0Var) {
        String string = this.f36106a.f45973g.getString("app_bundle_path");
        if (string == null || string.isEmpty()) {
            string = (String) ((ci.b) ((ci.e) u7.f.q().f34322c).f2295d).f2282c;
        }
        zh.a aVar = new zh.a(string, this.f36106a.f45973g.getString("dart_entrypoint", SentryThread.JsonKeys.MAIN));
        String string2 = this.f36106a.f45973g.getString("initial_route");
        if (string2 == null && (string2 = d(this.f36106a.j().getIntent())) == null) {
            string2 = "/";
        }
        gn0Var.f5877f = aVar;
        gn0Var.f5876e = string2;
        gn0Var.f5878g = this.f36106a.f45973g.getStringArrayList("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f36106a.S()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f36106a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        k kVar = this.f36106a;
        kVar.getClass();
        Log.w("FlutterFragment", "FlutterFragment " + kVar + " connection to the engine " + kVar.W.f36107b + " evicted by another attaching activity");
        d dVar = kVar.W;
        if (dVar != null) {
            dVar.e();
            kVar.W.f();
        }
    }

    public final void c() {
        if (this.f36106a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        Uri data;
        if (!this.f36106a.f45973g.getBoolean("handle_deeplinking") || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f36111f != null) {
            this.f36108c.getViewTreeObserver().removeOnPreDrawListener(this.f36111f);
            this.f36111f = null;
        }
        s sVar = this.f36108c;
        if (sVar != null) {
            sVar.a();
            s sVar2 = this.f36108c;
            sVar2.i.remove(this.f36116l);
        }
    }

    public final void f() {
        if (this.f36114j) {
            c();
            this.f36106a.e(this.f36107b);
            if (this.f36106a.f45973g.getBoolean("should_attach_engine_to_activity")) {
                if (this.f36106a.j().isChangingConfigurations()) {
                    jw1 jw1Var = this.f36107b.f25544d;
                    if (jw1Var.f()) {
                        gj.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                        try {
                            jw1Var.f6955b = true;
                            Iterator it = ((HashMap) jw1Var.f6958e).values().iterator();
                            while (it.hasNext()) {
                                ((fi.a) it.next()).onDetachedFromActivityForConfigChanges();
                            }
                            jw1Var.d();
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                    }
                } else {
                    this.f36107b.f25544d.c();
                }
            }
            d1.b bVar = this.f36109d;
            if (bVar != null) {
                ((h3.e) bVar.f15509e).f20376d = null;
                this.f36109d = null;
            }
            m0 m0Var = this.f36110e;
            if (m0Var != null) {
                ((fe.c) m0Var.f841e).f16785c = null;
                m0Var.f840d = null;
                this.f36110e = null;
            }
            this.f36106a.getClass();
            FlutterEngine flutterEngine = this.f36107b;
            if (flutterEngine != null) {
                e4.j jVar = flutterEngine.f25547g;
                jVar.f(1, jVar.f16134c);
            }
            if (this.f36106a.S()) {
                FlutterEngine flutterEngine2 = this.f36107b;
                FlutterJNI flutterJNI = flutterEngine2.f25541a;
                Iterator it2 = flutterEngine2.f25560u.iterator();
                while (it2.hasNext()) {
                    ((yh.b) it2.next()).a();
                }
                jw1 jw1Var2 = flutterEngine2.f25544d;
                jw1Var2.e();
                HashMap map = (HashMap) jw1Var2.f6954a;
                for (Class cls : new HashSet(map.keySet())) {
                    ei.b bVar2 = (ei.b) map.get(cls);
                    if (bVar2 != null) {
                        gj.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar2 instanceof fi.a) {
                                if (jw1Var2.f()) {
                                    ((fi.a) bVar2).onDetachedFromActivity();
                                }
                                ((HashMap) jw1Var2.f6958e).remove(cls);
                            }
                            bVar2.onDetachedFromEngine((ei.a) jw1Var2.f6957d);
                            map.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                map.clear();
                io.flutter.plugin.platform.q qVar = flutterEngine2.f25557r;
                SparseArray sparseArray = qVar.f25738m;
                while (sparseArray.size() > 0) {
                    qVar.f25749x.s(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.p pVar = flutterEngine2.f25558s;
                SparseArray sparseArray2 = pVar.f25719j;
                while (sparseArray2.size() > 0) {
                    pVar.f25726q.s(sparseArray2.keyAt(0));
                }
                flutterEngine2.f25543c.f46274b.setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f25562w);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                u7.f.q().getClass();
                FlutterEngine.f25540y.remove(Long.valueOf(flutterEngine2.f25561v));
                if (this.f36106a.Q() != null) {
                    if (ge.c.f20119b == null) {
                        ge.c.f20119b = new ge.c();
                    }
                    ge.c cVar = ge.c.f20119b;
                    cVar.f20120a.remove(this.f36106a.Q());
                }
                this.f36107b = null;
            }
            this.f36114j = false;
        }
    }
}
