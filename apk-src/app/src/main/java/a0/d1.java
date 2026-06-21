package a0;

import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.util.Log;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.appsflyer.AFLogger;
import com.google.android.gms.internal.measurement.b4;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.impl.C0117e;
import io.appmetrica.analytics.impl.C0120e2;
import io.appmetrica.analytics.impl.C0522u1;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63c;

    public /* synthetic */ d1(int i, Object obj) {
        this.f62b = i;
        this.f63c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62b) {
            case 0:
                f1 f1Var = (f1) this.f63c;
                synchronized (f1Var.f79x) {
                    try {
                        f1Var.f81z = null;
                        r1 r1Var = f1Var.f80y;
                        if (r1Var != null) {
                            f1Var.f80y = null;
                            f1Var.f(r1Var);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                ((a2) this.f63c).r();
                return;
            case 2:
                a1.g gVar = (a1.g) this.f63c;
                int iM = t.z.m(gVar.f332g);
                if (iM == 1) {
                    gVar.d(1);
                    gVar.f();
                    return;
                } else {
                    if (iM != 2) {
                        return;
                    }
                    com.google.android.gms.internal.auth.g.O("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    return;
                }
            case 3:
                ((x0.v) this.f63c).getClass();
                return;
            case 4:
                a1.g gVar2 = ((a1.f) this.f63c).f325b;
                gVar2.f341q = true;
                if (gVar2.f332g == 2) {
                    gVar2.a();
                    return;
                }
                return;
            case 5:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f63c;
                androidx.lifecycle.w wVar = processLifecycleOwner.f1532g;
                if (processLifecycleOwner.f1528c == 0) {
                    processLifecycleOwner.f1529d = true;
                    wVar.e(androidx.lifecycle.n.ON_PAUSE);
                }
                if (processLifecycleOwner.f1527b == 0 && processLifecycleOwner.f1529d) {
                    wVar.e(androidx.lifecycle.n.ON_STOP);
                    processLifecycleOwner.f1530e = true;
                    return;
                }
                return;
            case 6:
                b4.h hVar = (b4.h) this.f63c;
                synchronized (hVar.f1886b) {
                    try {
                        if (hVar.f1897n) {
                            return;
                        }
                        long j10 = hVar.f1896m - 1;
                        hVar.f1896m = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 >= 0) {
                            hVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (hVar.f1886b) {
                            hVar.f1898o = illegalStateException;
                            break;
                        }
                        return;
                    } finally {
                    }
                }
            case 7:
                bf.e eVar = (bf.e) this.f63c;
                ArrayList arrayList = eVar.f2101f;
                while (!arrayList.isEmpty() && eVar.f2106l == null) {
                    ((cf.d) arrayList.get(0)).f2274a.run();
                    arrayList.remove(0);
                }
                return;
            case 8:
                ((FlutterJNI) ((ci.e) ((aa.x) this.f63c).f719d).f2296e).prefetchDefaultFontManager();
                return;
            case 9:
                AFLogger.getMonetizationNetwork((Function1) this.f63c);
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f63c).m();
                return;
            case 11:
                a1.m mVar = (a1.m) this.f63c;
                synchronized (((ArrayDeque) mVar.f365e)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) mVar.f362b).edit();
                    String str = (String) mVar.f363c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) mVar.f365e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) mVar.f364d);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                    break;
                }
                return;
            case 12:
                com.google.firebase.messaging.j0 j0Var = (com.google.firebase.messaging.j0) this.f63c;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + j0Var.f14843a.getAction() + " finishing.");
                j0Var.f14844b.d(null);
                return;
            case 13:
                d.k kVar = (d.k) this.f63c;
                Runnable runnable = kVar.f15451c;
                if (runnable != null) {
                    runnable.run();
                    kVar.f15451c = null;
                    return;
                }
                return;
            case 14:
                d.p.a((d.p) this.f63c);
                return;
            case 15:
                ((e1.a0) this.f63c).a();
                return;
            case 16:
                ((HandlerThread) this.f63c).quit();
                return;
            case 17:
                s7.g gVar3 = (s7.g) this.f63c;
                ((f9.j) ((g9.c) gVar3.f32798e)).j(new a0(17, gVar3));
                return;
            case 18:
                f0.o oVar = (f0.o) ((t.x1) ((v1) this.f63c).f236b).f33317b;
                if (oVar != null) {
                    f0.q qVar = oVar.f16536h;
                    b4.e();
                    if (qVar.f16548g || qVar.f16549h) {
                        return;
                    }
                    qVar.f16549h = true;
                    return;
                }
                return;
            case 19:
                fj.c cVar = (fj.c) this.f63c;
                if (cVar.i) {
                    return;
                }
                while (true) {
                    fj.b bVar = (fj.b) cVar.f19315e.poll();
                    if (bVar == null) {
                        cVar.f19317g.postDelayed((d1) cVar.f19321l, cVar.f19319j);
                        return;
                    }
                    HashMap map = cVar.f19316f;
                    kotlin.jvm.internal.k0.a(map);
                    Long l10 = (Long) map.remove(bVar);
                    if (l10 != null) {
                        cVar.f19313c.remove(l10);
                        cVar.f19314d.remove(l10);
                        a7.l lVar = (a7.l) cVar.f19320k;
                        long jLongValue = l10.longValue();
                        fj.e eVar2 = (fj.e) lVar.f491c;
                        fj.h callback = new fj.h(jLongValue, 0);
                        Intrinsics.checkNotNullParameter(callback, "callback");
                        new s7.g(eVar2.f19338a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (ii.m) fj.e.f19337b.getValue(), (Object) null).K(kotlin.collections.r.c(l10), new a0(20, callback));
                    }
                }
                break;
            case 20:
                t.x xVar = (t.x) this.f63c;
                if (xVar.f33315c.M == 4 || xVar.f33315c.M == 5) {
                    xVar.f33315c.K(false);
                    return;
                }
                return;
            case 21:
                k6.t0 t0Var = (k6.t0) this.f63c;
                if (((t.c0) t0Var.f27180c).M == 10) {
                    ((t.c0) t0Var.f27180c).D();
                    return;
                }
                return;
            case 22:
                ((j1.k) this.f63c).cancel(true);
                return;
            case 23:
                ((g4.d) this.f63c).y();
                return;
            case 24:
                B.a((com.yandex.varioqub.config.impl.g) this.f63c);
                return;
            case 25:
                B.a((B) this.f63c);
                return;
            case 26:
                ((C0117e) this.f63c).a();
                return;
            case 27:
                C0120e2.a((C0120e2) this.f63c);
                return;
            case 28:
                ((C0522u1) this.f63c).e();
                return;
            default:
                C0522u1.a((Object[]) this.f63c);
                return;
        }
    }

    public /* synthetic */ d1(x0.v vVar, boolean z5) {
        this.f62b = 3;
        this.f63c = vVar;
    }
}
