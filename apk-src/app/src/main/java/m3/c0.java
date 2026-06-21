package m3;

import a0.o2;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import android.util.Size;
import android.view.Surface;
import com.google.android.gms.internal.ads.st1;
import com.google.android.gms.internal.ads.vs1;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.measurement.h5;
import g0.f2;
import g0.h2;
import g0.u2;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import j3.m0;
import j3.o0;
import j3.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ni.g1;
import ni.l1;
import s3.u0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28553d;

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.f28551b = i;
        this.f28552c = obj;
        this.f28553d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        kf.a aVar;
        int i;
        long j10;
        boolean z5;
        int i10 = 2;
        boolean z10 = true;
        int i11 = 0;
        switch (this.f28551b) {
            case 0:
                l6.i iVar = (l6.i) this.f28552c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f28553d;
                synchronized (iVar) {
                    if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) iVar.f27979d) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 1:
                md.o oVar = (md.o) this.f28552c;
                yd.a aVar2 = (yd.a) this.f28553d;
                if (oVar.f28867b != md.o.f28865d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    aVar = oVar.f28866a;
                    oVar.f28866a = null;
                    oVar.f28867b = aVar2;
                    break;
                }
                aVar.getClass();
                return;
            case 2:
                md.n nVar = (md.n) this.f28552c;
                yd.a aVar3 = (yd.a) this.f28553d;
                synchronized (nVar) {
                    try {
                        if (nVar.f28863b == null) {
                            nVar.f28862a.add(aVar3);
                        } else {
                            nVar.f28863b.add(aVar3.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                ((vd.b) ((Map.Entry) this.f28552c).getKey()).a((vd.a) this.f28553d);
                return;
            case 4:
                nd.a aVar4 = (nd.a) this.f28552c;
                Runnable runnable = (Runnable) this.f28553d;
                Process.setThreadPriority(aVar4.f29298c);
                StrictMode.ThreadPolicy threadPolicy = aVar4.f29299d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 5:
                Callable callable = (Callable) this.f28552c;
                nd.h hVar = (nd.h) ((m4.d) this.f28553d).f28630b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e3) {
                    hVar.l(e3);
                    return;
                }
            case 6:
                ((nh.a) this.f28552c).f29331c.b((ArrayList) this.f28553d);
                return;
            case 7:
                k0.b bVar = (k0.b) this.f28552c;
                fj.z zVar = (fj.z) this.f28553d;
                try {
                    l1.c((w0.f) bVar.get(), zVar);
                    return;
                } catch (InterruptedException | ExecutionException e7) {
                    l1.b(zVar, e7);
                    return;
                }
            case 8:
                ((o4.c) ((l6.i) this.f28552c).f27979d).f29608h.onVideoSizeChanged((y0) this.f28553d);
                return;
            case 9:
                o4.v vVar = (o4.v) this.f28552c;
                s3.b bVar2 = (s3.b) this.f28553d;
                s3.t tVar = vVar.f29701b;
                String str = z.f28608a;
                r3.b.l(tVar.f32648b.H, bVar2);
                return;
            case 10:
                o4.v vVar2 = (o4.v) this.f28552c;
                y0 y0Var = (y0) this.f28553d;
                s3.t tVar2 = vVar2.f29701b;
                String str2 = z.f28608a;
                s3.y yVar = tVar2.f32648b;
                yVar.h0 = y0Var;
                yVar.f32708n.e(25, new s3.s(y0Var));
                return;
            case 11:
                o4.v vVar3 = (o4.v) this.f28552c;
                j3.o oVar2 = (j3.o) this.f28553d;
                s3.t tVar3 = vVar3.f29701b;
                String str3 = z.f28608a;
                s3.y yVar2 = tVar3.f32648b;
                yVar2.S = oVar2;
                t3.d dVar = yVar2.f32714t;
                dVar.z(dVar.y(), 1017, new t3.c(i11));
                return;
            case 12:
                o4.v vVar4 = (o4.v) this.f28552c;
                vs1 vs1Var = (vs1) this.f28553d;
                synchronized (vs1Var) {
                }
                s3.t tVar4 = vVar4.f29701b;
                String str4 = z.f28608a;
                s3.y yVar3 = tVar4.f32648b;
                t3.d dVar2 = yVar3.f32714t;
                t3.a aVarV = dVar2.v((i4.c0) dVar2.f33420d.f31950e);
                dVar2.z(aVarV, 1020, new s3.q(12, aVarV, vs1Var));
                yVar3.S = null;
                return;
            case 13:
                String str5 = (String) this.f28552c;
                sb.g gVar = (sb.g) this.f28553d;
                HashMap map = pi.d.f31479d;
                try {
                    try {
                        fd.g.f(str5).b();
                        break;
                    } catch (IllegalStateException unused) {
                    }
                    gVar.b(null);
                    return;
                } catch (Exception e10) {
                    gVar.a(e10);
                    return;
                }
            case 14:
                ((q0.f) this.f28552c).f31575l.add((q0.a) this.f28553d);
                return;
            case 15:
                q0.f fVar = (q0.f) this.f28552c;
                q0.n nVar2 = (q0.n) this.f28553d;
                Surface surfaceB = nVar2.b(fVar.f31568d, new i7.h(i10, fVar, nVar2));
                fVar.f31566b.h(surfaceB);
                fVar.i.put(nVar2, surfaceB);
                return;
            case 16:
                final q0.f fVar2 = (q0.f) this.f28552c;
                final o2 o2Var = (o2) this.f28553d;
                fVar2.f31573j++;
                y50 y50Var = fVar2.f31566b;
                s0.i.d(true, (AtomicBoolean) y50Var.f12502c);
                s0.i.c((Thread) y50Var.f12504e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(y50Var.f12501b);
                Size size = o2Var.f179b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                j0.d dVar3 = fVar2.f31568d;
                o2Var.c(dVar3, new oi.i(i10, fVar2, o2Var));
                o2Var.b(surface, dVar3, new f2.a() { // from class: q0.e
                    @Override // f2.a
                    public final void accept(Object obj) {
                        f fVar3 = fVar2;
                        o2 o2Var2 = o2Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (o2Var2.f178a) {
                            o2Var2.f191o = null;
                            o2Var2.f192p = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        fVar3.f31573j--;
                        fVar3.a();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(fVar2, fVar2.f31569e);
                return;
            case 17:
                ((f2.a) ((AtomicReference) this.f28553d).get()).accept(new a0.k((q0.n) this.f28552c));
                return;
            case 18:
                qi.f fVar3 = (qi.f) this.f28552c;
                sb.g gVar2 = (sb.g) this.f28553d;
                try {
                    fVar3.f();
                    gVar2.b(null);
                    return;
                } catch (Exception e11) {
                    gVar2.a(e11);
                    return;
                }
            case 19:
                ((ii.g) this.f28552c).b((ArrayList) this.f28553d);
                return;
            case 20:
                r0.d dVar4 = (r0.d) this.f28552c;
                o2 o2Var2 = (o2) this.f28553d;
                dVar4.f32150f++;
                r0.c cVar = dVar4.f32146b;
                boolean z11 = o2Var2.f183f;
                Size size2 = o2Var2.f179b;
                s0.i.d(true, (AtomicBoolean) cVar.f12502c);
                s0.i.c((Thread) cVar.f12504e);
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(z11 ? cVar.f32142o : cVar.f32143p);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                Surface surface2 = new Surface(surfaceTexture2);
                o2Var2.b(surface2, dVar4.f32148d, new g1(dVar4, surfaceTexture2, surface2));
                if (z11) {
                    dVar4.f32153j = surfaceTexture2;
                    return;
                } else {
                    dVar4.f32154k = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(dVar4, dVar4.f32149e);
                    return;
                }
            case 21:
                r0.d dVar5 = (r0.d) this.f28552c;
                q0.n nVar3 = (q0.n) this.f28553d;
                Surface surfaceB2 = nVar3.b(dVar5.f32148d, new i7.h(3, dVar5, nVar3));
                dVar5.f32146b.h(surfaceB2);
                dVar5.i.put(nVar3, surfaceB2);
                return;
            case 22:
                FlutterFirebaseMessagingBackgroundService.f25770j.o((Intent) this.f28552c, (CountDownLatch) this.f28553d);
                return;
            case 23:
                s3.y yVar4 = (s3.y) this.f28552c;
                st1 st1Var = (st1) this.f28553d;
                int i12 = yVar4.J - st1Var.f10386b;
                yVar4.J = i12;
                if (st1Var.f10389e) {
                    yVar4.K = st1Var.f10387c;
                    yVar4.L = true;
                }
                if (i12 == 0) {
                    o0 o0Var = ((u0) st1Var.f10390f).f32657a;
                    int I = -1;
                    if (!yVar4.f32702j0.f32657a.p() && o0Var.p()) {
                        yVar4.f32704k0 = -1;
                        yVar4.f32706l0 = 0L;
                    }
                    if (!o0Var.p()) {
                        List listAsList = Arrays.asList(((z0) o0Var).f32731h);
                        h5.r(listAsList.size() == yVar4.f32711q.size());
                        for (int i13 = 0; i13 < listAsList.size(); i13++) {
                            ((s3.v) yVar4.f32711q.get(i13)).f32677b = (o0) listAsList.get(i13);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (yVar4.L) {
                        boolean z12 = ((u0) st1Var.f10390f).f32657a.p() && yVar4.f32702j0.f32657a.p();
                        boolean zEquals = ((u0) st1Var.f10390f).f32658b.equals(yVar4.f32702j0.f32658b);
                        boolean z13 = ((u0) st1Var.f10390f).f32660d == yVar4.f32702j0.f32674s;
                        if (z12 || (zEquals && z13)) {
                            z10 = false;
                        }
                        if (z10) {
                            I = yVar4.I();
                            if (o0Var.p() || ((u0) st1Var.f10390f).f32658b.b()) {
                                j11 = ((u0) st1Var.f10390f).f32660d;
                            } else {
                                u0 u0Var = (u0) st1Var.f10390f;
                                i4.c0 c0Var = u0Var.f32658b;
                                long j12 = u0Var.f32660d;
                                Object obj = c0Var.f20861a;
                                m0 m0Var = yVar4.f32710p;
                                o0Var.g(obj, m0Var);
                                j11 = j12 + m0Var.f26278e;
                            }
                        }
                        i = I;
                        j10 = j11;
                        z5 = z10;
                    } else {
                        i = -1;
                        j10 = -9223372036854775807L;
                        z5 = false;
                    }
                    yVar4.L = false;
                    yVar4.l0((u0) st1Var.f10390f, 1, z5, yVar4.K, j10, i);
                    return;
                }
                return;
            case 24:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) this.f28552c, (ProductInfo) this.f28553d);
                return;
            case 25:
                t.m mVar = (t.m) this.f28552c;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f28553d;
                HashSet hashSet = new HashSet();
                HashSet<t.n> hashSet2 = (HashSet) mVar.f33151b;
                for (t.n nVar4 : hashSet2) {
                    if (nVar4.b(totalCaptureResult)) {
                        hashSet.add(nVar4);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 26:
                t.c0 c0Var2 = (t.c0) this.f28552c;
                String str6 = (String) this.f28553d;
                c0Var2.v("Use case " + str6 + " INACTIVE", null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0Var2.f32967b.f324d;
                if (linkedHashMap.containsKey(str6)) {
                    u2 u2Var = (u2) linkedHashMap.get(str6);
                    u2Var.f19782f = false;
                    if (!u2Var.f19781e) {
                        linkedHashMap.remove(str6);
                    }
                }
                c0Var2.L();
                return;
            case 27:
                ((f2) this.f28552c).a((h2) this.f28553d);
                return;
            case 28:
                Surface surface3 = (Surface) this.f28552c;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.f28553d;
                surface3.release();
                surfaceTexture3.release();
                return;
            default:
                ((t.o) this.f28552c).B((t.o0) this.f28553d);
                return;
        }
    }

    public /* synthetic */ c0(o4.v vVar, j3.o oVar, s3.c cVar) {
        this.f28551b = 11;
        this.f28552c = vVar;
        this.f28553d = oVar;
    }
}
