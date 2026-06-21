package ni;

import a0.q2;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Trace;
import android.util.Range;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.measurement.b4;
import g0.q1;
import g0.u1;
import io.appmetrica.analytics.impl.lp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji0 f29394a;

    public g(ji0 pigeonRegistrar, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
            default:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29394a = pigeonRegistrar;
                break;
        }
    }

    public static ArrayList c(w0.f fVar) {
        zz zzVar = fVar.f34959a;
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            a0.b0 b0Var = (a0.b0) zzVar.f13156g;
            Intrinsics.b(b0Var);
            LinkedHashSet linkedHashSetC = b0Var.f28a.c();
            Intrinsics.checkNotNullExpressionValue(linkedHashSetC, "getCameras(...)");
            Iterator it = linkedHashSetC.iterator();
            while (it.hasNext()) {
                g0.d0 d0VarB = ((g0.f0) it.next()).b();
                Intrinsics.checkNotNullExpressionValue(d0VarB, "getCameraInfo(...)");
                arrayList.add(d0VarB);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    public static x0.g d(n1 n1Var) {
        int iOrdinal = n1Var.ordinal();
        if (iOrdinal == 0) {
            return x0.g.f35584e;
        }
        if (iOrdinal == 1) {
            return x0.g.f35585f;
        }
        if (iOrdinal == 2) {
            return x0.g.f35586g;
        }
        if (iOrdinal == 3) {
            return x0.g.f35587h;
        }
        if (iOrdinal == 4) {
            return x0.g.i;
        }
        if (iOrdinal == 5) {
            return x0.g.f35588j;
        }
        throw new IllegalArgumentException("VideoQuality " + n1Var + " is unhandled by FallbackStrategyProxyApi.");
    }

    public static a0.w0 e(t0.b bVar, Long l10, Range range, Long l11) {
        q1 q1Var = new a0.t0(0).f224b;
        if (bVar != null) {
            q1Var.y(g0.i1.f19612q, bVar);
        }
        if (l10 != null) {
            q1Var.y(g0.i1.f19605j, Integer.valueOf(l10.intValue()));
        }
        if (l11 != null) {
            q1Var.y(g0.f1.P, Integer.valueOf(l11.intValue()));
        }
        if (range != null) {
            q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
        }
        g0.f1 f1Var = new g0.f1(u1.u(q1Var));
        g0.i1.r(f1Var);
        return new a0.w0(f1Var);
    }

    public static void p(w0.f fVar, List list) {
        int iB = 0;
        q2[] useCases = (q2[]) list.toArray(new q2[0]);
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        zz zzVar = fVar.f34959a;
        q2[] useCases2 = (q2[]) Arrays.copyOf(useCases, useCases.length);
        Intrinsics.checkNotNullParameter(useCases2, "useCases");
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("CX:unbind"));
        try {
            b4.e();
            a0.b0 b0Var = (a0.b0) zzVar.f13156g;
            if (b0Var != null) {
                t.p pVar = b0Var.f34g;
                if (pVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                iB = pVar.f33204b.b();
            }
            if (iB == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            ((w0.e) zzVar.f13155f).j(new a0.u1(kotlin.collections.p.l(useCases2)), (HashSet) zzVar.i);
            Unit unit = Unit.f27471a;
        } finally {
            Trace.endSection();
        }
    }

    public w0.b a(w0.f fVar, a0.w cameraSelector, List list) {
        androidx.lifecycle.u lifecycleOwner = this.f29394a.c();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
        }
        int iB = 0;
        q2[] useCases = (q2[]) list.toArray(new q2[0]);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        zz zzVar = fVar.f34959a;
        q2[] useCases2 = (q2[]) Arrays.copyOf(useCases, useCases.length);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases2, "useCases");
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("CX:bindToLifecycle"));
        try {
            a0.b0 b0Var = (a0.b0) zzVar.f13156g;
            if (b0Var != null) {
                t.p pVar = b0Var.f34g;
                if (pVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                iB = pVar.f33204b.b();
            }
            if (iB == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            zz.c(zzVar, 1);
            return zz.d(zzVar, lifecycleOwner, cameraSelector, new a0.u1(kotlin.collections.p.l(useCases2)));
        } finally {
            Trace.endSection();
        }
    }

    public void b(a0.w0 w0Var) {
        synchronized (w0Var.f241q) {
            try {
                a0.z0 z0Var = w0Var.f242r;
                if (z0Var != null) {
                    z0Var.i(null, null);
                }
                if (w0Var.f244t != null) {
                    w0Var.f205d = 2;
                    w0Var.s();
                }
                w0Var.f243s = null;
                w0Var.f244t = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fj.c cVar = (fj.c) this.f29394a.f6853d;
        cVar.f19317g.removeCallbacks((lp) cVar.f19321l);
        cVar.f19319j = 3000L;
        cVar.h();
    }

    public void f(a0.f pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            long jB = cVar.b(pigeon_instanceArg);
            int iM = t.z.m(pigeon_instanceArg.f75a);
            new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.CameraState.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), iM != 0 ? iM != 1 ? iM != 2 ? iM != 3 ? iM != 4 ? o.i : o.f29458d : o.f29459e : o.f29460f : o.f29461g : o.f29462h, pigeon_instanceArg.f76b), new l0(8, callback));
        }
    }

    public void g(a0.h0 pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(26, callback));
        }
    }

    public void h(a0.w0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            long jB = cVar.b(pigeon_instanceArg);
            String str = "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), ((g0.i1) pigeon_instanceArg.f209h).j()), new l0(21, callback));
        }
    }

    public void i(CaptureRequest.Key pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.CaptureRequestKey.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(11, callback));
        }
    }

    public void j(CaptureRequest pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(10, callback));
        }
    }

    public void k(g0.c0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.CameraControl.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(0, callback));
        }
    }

    public void l(j1 pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new x0(5, callback));
        }
    }

    public void m(x0.c pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(17, callback));
        }
    }

    public void n(z.c pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29394a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new he.e(26, callback));
        }
    }

    public void o(a0.w0 w0Var, final a0.r0 r0Var) {
        fj.c cVar = (fj.c) this.f29394a.f6853d;
        cVar.f19317g.removeCallbacks((lp) cVar.f19321l);
        cVar.f19319j = 1000L;
        cVar.h();
        Executor executorC = t1.b.c((Context) this.f29394a.f6857h);
        synchronized (w0Var.f241q) {
            try {
                a0.z0 z0Var = w0Var.f242r;
                if (z0Var != null) {
                    z0Var.i(executorC, new a0.r0() { // from class: a0.q0
                        @Override // a0.r0
                        public final void a(g2 g2Var) {
                            r0Var.a(g2Var);
                        }
                    });
                }
                if (w0Var.f244t == null) {
                    w0Var.q();
                }
                w0Var.f243s = executorC;
                w0Var.f244t = r0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
