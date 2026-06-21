package fj;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.appmetrica.analytics.impl.lp;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19311a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f19312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f19315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f19316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f19317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19318h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f19320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f19321l;

    public c(a7.l finalizationListener) {
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.f19320k = finalizationListener;
        this.f19312b = new WeakHashMap();
        this.f19313c = new HashMap();
        this.f19314d = new HashMap();
        this.f19315e = new ReferenceQueue();
        this.f19316f = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f19317g = handler;
        a0.d1 d1Var = new a0.d1(19, this);
        this.f19321l = d1Var;
        this.f19318h = 65536L;
        this.f19319j = 3000L;
        handler.postDelayed(d1Var, 3000L);
    }

    public final void a(long j10, Object instance) {
        switch (this.f19311a) {
            case 0:
                Intrinsics.checkNotNullParameter(instance, "instance");
                g();
                c(j10, instance);
                break;
            default:
                Intrinsics.checkNotNullParameter(instance, "instance");
                g();
                c(j10, instance);
                break;
        }
    }

    public final long b(Object instance) {
        switch (this.f19311a) {
            case 0:
                Intrinsics.checkNotNullParameter(instance, "instance");
                g();
                if (!d(instance)) {
                    long j10 = this.f19318h;
                    this.f19318h = 1 + j10;
                    c(j10, instance);
                    return j10;
                }
                throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
            default:
                Intrinsics.checkNotNullParameter(instance, "instance");
                g();
                if (!d(instance)) {
                    long j11 = this.f19318h;
                    this.f19318h = 1 + j11;
                    c(j11, instance);
                    return j11;
                }
                throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
        }
    }

    public final void c(long j10, Object obj) {
        switch (this.f19311a) {
            case 0:
                if (j10 < 0) {
                    throw new IllegalArgumentException(pe.a.d(j10, "Identifier must be >= 0: ").toString());
                }
                Long lValueOf = Long.valueOf(j10);
                HashMap map = this.f19313c;
                if (map.containsKey(lValueOf)) {
                    throw new IllegalArgumentException(pe.a.d(j10, "Identifier has already been added: ").toString());
                }
                b bVar = new b(obj, this.f19315e);
                this.f19312b.put(bVar, Long.valueOf(j10));
                map.put(Long.valueOf(j10), bVar);
                this.f19316f.put(bVar, Long.valueOf(j10));
                this.f19314d.put(Long.valueOf(j10), obj);
                return;
            default:
                if (j10 < 0) {
                    throw new IllegalArgumentException(pe.a.d(j10, "Identifier must be >= 0: ").toString());
                }
                Long lValueOf2 = Long.valueOf(j10);
                HashMap map2 = this.f19313c;
                if (map2.containsKey(lValueOf2)) {
                    throw new IllegalArgumentException(pe.a.d(j10, "Identifier has already been added: ").toString());
                }
                ni.r rVar = new ni.r(obj, this.f19315e);
                this.f19312b.put(rVar, Long.valueOf(j10));
                map2.put(Long.valueOf(j10), rVar);
                this.f19316f.put(rVar, Long.valueOf(j10));
                this.f19314d.put(Long.valueOf(j10), obj);
                return;
        }
    }

    public final boolean d(Object obj) {
        switch (this.f19311a) {
            case 0:
                g();
                if (obj != null) {
                    if (this.f19312b.containsKey(new b(obj))) {
                    }
                }
                break;
            default:
                g();
                if (obj != null) {
                    if (this.f19312b.containsKey(new ni.r(obj))) {
                    }
                }
                break;
        }
        return false;
    }

    public Long e(Object obj) {
        g();
        if (obj == null) {
            return null;
        }
        Long l10 = (Long) this.f19312b.get(new ni.r(obj));
        if (l10 != null) {
            this.f19314d.put(l10, obj);
        }
        return l10;
    }

    public Object f(long j10) {
        g();
        b bVar = (b) this.f19313c.get(Long.valueOf(j10));
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    public final void g() {
        switch (this.f19311a) {
            case 0:
                if (this.i) {
                    Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
                }
                break;
            default:
                if (this.i) {
                    Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
                }
                break;
        }
    }

    public void h() {
        if (this.i) {
            return;
        }
        while (true) {
            ni.r rVar = (ni.r) this.f19315e.poll();
            if (rVar == null) {
                this.f19317g.postDelayed((lp) this.f19321l, this.f19319j);
                return;
            }
            HashMap map = this.f19316f;
            kotlin.jvm.internal.k0.a(map);
            Long l10 = (Long) map.remove(rVar);
            if (l10 != null) {
                this.f19313c.remove(l10);
                this.f19314d.remove(l10);
                m4.d dVar = (m4.d) this.f19320k;
                long jLongValue = l10.longValue();
                ni.t tVar = (ni.t) dVar.f28630b;
                h callback = new h(jLongValue, 1);
                Intrinsics.checkNotNullParameter(callback, "callback");
                new s7.g(tVar.f29486a, "dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference", (ii.m) ni.t.f29485b.getValue(), (Object) null).K(kotlin.collections.r.c(l10), new he.e(22, callback));
            }
        }
    }

    public c(m4.d finalizationListener) {
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.f19320k = finalizationListener;
        this.f19312b = new WeakHashMap();
        this.f19313c = new HashMap();
        this.f19314d = new HashMap();
        this.f19315e = new ReferenceQueue();
        this.f19316f = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f19317g = handler;
        lp lpVar = new lp(14, this);
        this.f19321l = lpVar;
        this.f19318h = 65536L;
        this.f19319j = 3000L;
        handler.postDelayed(lpVar, 3000L);
    }
}
