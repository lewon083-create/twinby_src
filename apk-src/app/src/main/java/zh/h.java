package zh;

import a0.z;
import android.os.Build;
import android.os.Trace;
import ii.l;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements ii.f, i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f46291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f46293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f46295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f46296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46297h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakHashMap f46298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z9.c f46299k;

    public h(FlutterJNI flutterJNI) {
        z9.c cVar = new z9.c();
        cVar.f46219a = (ExecutorService) u7.f.q().f34324e;
        this.f46292c = new HashMap();
        this.f46293d = new HashMap();
        this.f46294e = new Object();
        this.f46295f = new AtomicBoolean(false);
        this.f46296g = new HashMap();
        this.f46297h = 1;
        this.i = new j();
        this.f46298j = new WeakHashMap();
        this.f46291b = flutterJNI;
        this.f46299k = cVar;
    }

    @Override // ii.f
    public final void b(String str, ii.d dVar, t0 t0Var) {
        d dVar2;
        if (dVar == null) {
            synchronized (this.f46294e) {
                this.f46292c.remove(str);
            }
            return;
        }
        if (t0Var != null) {
            dVar2 = (d) this.f46298j.get(t0Var);
            if (dVar2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar2 = null;
        }
        synchronized (this.f46294e) {
            try {
                this.f46292c.put(str, new e(dVar, dVar2));
                List<c> list = (List) this.f46293d.remove(str);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    c(str, (e) this.f46292c.get(str), cVar.f46280a, cVar.f46281b, cVar.f46282c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, e eVar, ByteBuffer byteBuffer, int i, long j10) {
        d dVar = eVar != null ? eVar.f46284b : null;
        String strA = gj.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            t6.a.a(i, com.google.android.gms.internal.auth.g.M(strA));
        } else {
            String strM = com.google.android.gms.internal.auth.g.M(strA);
            try {
                if (com.google.android.gms.internal.auth.g.f13217h == null) {
                    com.google.android.gms.internal.auth.g.f13217h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                com.google.android.gms.internal.auth.g.f13217h.invoke(null, Long.valueOf(com.google.android.gms.internal.auth.g.f13215f), strM, Integer.valueOf(i));
            } catch (Exception e3) {
                com.google.android.gms.internal.auth.g.s("asyncTraceBegin", e3);
            }
        }
        z zVar = new z(this, str, i, eVar, byteBuffer, j10);
        if (dVar == null) {
            dVar = this.i;
        }
        dVar.a(zVar);
    }

    @Override // ii.f
    public final void d(String str, ii.d dVar) {
        b(str, dVar, null);
    }

    @Override // ii.f
    public final void f(String str, ByteBuffer byteBuffer) {
        g(str, byteBuffer, null);
    }

    @Override // ii.f
    public final void g(String str, ByteBuffer byteBuffer, ii.e eVar) {
        gj.a.b("DartMessenger#send on " + str);
        try {
            int i = this.f46297h;
            this.f46297h = i + 1;
            if (eVar != null) {
                this.f46296g.put(Integer.valueOf(i), eVar);
            }
            FlutterJNI flutterJNI = this.f46291b;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
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

    @Override // ii.f
    public final t0 h(l lVar) {
        z9.c cVar = this.f46299k;
        cVar.getClass();
        g gVar = new g((ExecutorService) cVar.f46219a);
        t0 t0Var = new t0(12);
        this.f46298j.put(t0Var, gVar);
        return t0Var;
    }
}
