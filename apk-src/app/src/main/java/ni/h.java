package ni;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import io.appmetrica.analytics.impl.lp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ei.a f29401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ji0 f29402c;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        ji0 ji0Var = this.f29402c;
        if (ji0Var != null) {
            ji0Var.f6857h = (z2.w) ((h3) bVar).f28250b;
            ji0Var.i = new he.e(21, bVar);
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        this.f29401b = aVar;
        ii.f binaryMessenger = aVar.f16383c;
        ji0 pigeonRegistrar = new ji0(binaryMessenger, aVar.f16381a, aVar.f16384d);
        this.f29402c = pigeonRegistrar;
        ij.p pVar = t.f29485b;
        a0.e.r(binaryMessenger, (fj.c) pigeonRegistrar.f6853d);
        final int i = 0;
        m mVar = new m(pigeonRegistrar, 0);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_defaultConstructor", pigeonRegistrar.a(), (Object) null).L(new l0(7, mVar));
        c cVar = new c(pigeonRegistrar, 2);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_defaultConstructor", pigeonRegistrar.a(), (Object) null).L(new l0(3, cVar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        l7.i iVar = new l7.i(9);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.MeteringPoint.getSize", pigeonRegistrar.a(), (Object) null).L(new n5.b(29, iVar));
        c cVar2 = new c(pigeonRegistrar, 7);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Observer.pigeon_defaultConstructor", pigeonRegistrar.a(), (Object) null).L(new l0(27, cVar2));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        l7.b bVar = new l7.b(6);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getCameraState", mVarA, (Object) null).L(new n5.b(23, bVar));
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getZoomState", mVarA, (Object) null).L(new n5.b(24, bVar));
        j4.u(binaryMessenger, new f(pigeonRegistrar, 2));
        ya.e.z(binaryMessenger, new g(pigeonRegistrar, 8));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        l7.i iVar2 = new l7.i(6);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera.getCameraInfo", pigeonRegistrar.a(), (Object) null).L(new n5.b(22, iVar2));
        b4.J(binaryMessenger, new m(pigeonRegistrar, 7));
        h5.B(binaryMessenger, new c(pigeonRegistrar, 4));
        if (((l6.i) pigeonRegistrar.f6858j) == null) {
            pigeonRegistrar.f6858j = new l6.i(pigeonRegistrar);
        }
        wa.a.y(binaryMessenger, (l6.i) pigeonRegistrar.f6858j);
        d4.z(binaryMessenger, new g(pigeonRegistrar, 10));
        a0.e.t(binaryMessenger, new f(pigeonRegistrar, 8));
        c cVar3 = new c(pigeonRegistrar, 11);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.pigeon_defaultConstructor", pigeonRegistrar.a(), (Object) null).L(new x0(16, cVar3));
        rl.b.s(binaryMessenger, new f(pigeonRegistrar, 6));
        com.google.android.gms.internal.auth.g.J(binaryMessenger, new m(pigeonRegistrar, 6));
        j0.g.S(binaryMessenger, new c(pigeonRegistrar, 6));
        com.google.android.gms.internal.auth.m.y(binaryMessenger, new f(pigeonRegistrar, 9));
        c cVar4 = new c(pigeonRegistrar, 10);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA2 = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_defaultConstructor", mVarA2, (Object) null).L(new x0(9, cVar4));
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.getAspectRatioStrategy", mVarA2, (Object) null).L(new v0(2, cVar4));
        com.google.android.gms.internal.auth.g.I(binaryMessenger, new f(pigeonRegistrar, 0));
        i0.o.M(binaryMessenger, new g(pigeonRegistrar, 5));
        c cVar5 = new c(pigeonRegistrar, 0);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Analyzer.pigeon_defaultConstructor", pigeonRegistrar.a(), (Object) null).L(new he.e(23, cVar5));
        k3.f.D(binaryMessenger, new m(pigeonRegistrar, 4));
        f fVar = new f(pigeonRegistrar, 5);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA3 = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.getPlanes", mVarA3, (Object) null).L(new n5.b(26, fVar));
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.close", mVarA3, (Object) null).L(new n5.b(27, fVar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        le.a aVar2 = new le.a(7);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageProxyUtils.getNv21Buffer", pigeonRegistrar.a(), (Object) null).L(new n5.b(28, aVar2));
        a.a.r(binaryMessenger, new c(pigeonRegistrar, 9));
        hl.d.E(binaryMessenger, new g(pigeonRegistrar, 4));
        final int i10 = 1;
        d4.y(binaryMessenger, new g(pigeonRegistrar, 1));
        hl.l.r(binaryMessenger, new c(pigeonRegistrar, 5));
        final g gVar = new g(pigeonRegistrar, 3);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA4 = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlAELock", mVarA4, (Object) null).L(new ii.b() { // from class: ni.o0
            @Override // ii.b
            public final void q(Object obj, h3.e reply) {
                List listF;
                List listF2;
                switch (i) {
                    case 0:
                        g gVar2 = gVar;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((fj.c) gVar2.f29394a.f6853d).a(((Long) obj2).longValue(), CaptureRequest.CONTROL_AE_LOCK);
                            listF = kotlin.collections.r.c(null);
                            break;
                        } catch (Throwable exception) {
                            Intrinsics.checkNotNullParameter(exception, "exception");
                            if (exception instanceof p) {
                                p pVar2 = exception;
                                listF = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                            } else {
                                listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                            }
                        }
                        reply.i(listF);
                        break;
                    default:
                        g gVar3 = gVar;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj3 = ((List) obj).get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((fj.c) gVar3.f29394a.f6853d).a(((Long) obj3).longValue(), CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
                            listF2 = kotlin.collections.r.c(null);
                            break;
                        } catch (Throwable exception2) {
                            Intrinsics.checkNotNullParameter(exception2, "exception");
                            if (exception2 instanceof p) {
                                p pVar3 = exception2;
                                listF2 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                            } else {
                                listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                            }
                        }
                        reply.i(listF2);
                        break;
                }
            }
        });
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlVideoStabilizationMode", mVarA4, (Object) null).L(new ii.b() { // from class: ni.o0
            @Override // ii.b
            public final void q(Object obj, h3.e reply) {
                List listF;
                List listF2;
                switch (i10) {
                    case 0:
                        g gVar2 = gVar;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((fj.c) gVar2.f29394a.f6853d).a(((Long) obj2).longValue(), CaptureRequest.CONTROL_AE_LOCK);
                            listF = kotlin.collections.r.c(null);
                            break;
                        } catch (Throwable exception) {
                            Intrinsics.checkNotNullParameter(exception, "exception");
                            if (exception instanceof p) {
                                p pVar2 = exception;
                                listF = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                            } else {
                                listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                            }
                        }
                        reply.i(listF);
                        break;
                    default:
                        g gVar3 = gVar;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj3 = ((List) obj).get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((fj.c) gVar3.f29394a.f6853d).a(((Long) obj3).longValue(), CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
                            listF2 = kotlin.collections.r.c(null);
                            break;
                        } catch (Throwable exception2) {
                            Intrinsics.checkNotNullParameter(exception2, "exception");
                            if (exception2 instanceof p) {
                                p pVar3 = exception2;
                                listF2 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                            } else {
                                listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                            }
                        }
                        reply.i(listF2);
                        break;
                }
            }
        });
        m mVar2 = new m(pigeonRegistrar, 1);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA5 = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_defaultConstructor", mVarA5, (Object) null).L(new l0(13, mVar2));
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.getCaptureRequestOption", mVarA5, (Object) null).L(new n5.b(25, mVar2));
        final g gVar2 = new g(pigeonRegistrar, 0);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA6 = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.from", mVarA6, (Object) null).L(new ii.b() { // from class: ni.i0
            @Override // ii.b
            public final void q(Object obj, h3.e reply) {
                List listF;
                switch (i) {
                    case 0:
                        g gVar3 = gVar2;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue = ((Long) obj2).longValue();
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                        g0.c0 c0Var = (g0.c0) obj3;
                        try {
                            fj.c cVar6 = (fj.c) gVar3.f29394a.f6853d;
                            g0.c0 c0VarB = c0Var.b();
                            f2.g.a("CameraControl doesn't contain Camera2 implementation.", c0VarB instanceof t.o);
                            cVar6.a(jLongValue, ((t.o) c0VarB).f33183n);
                            listF = kotlin.collections.r.c(null);
                            break;
                        } catch (Throwable exception) {
                            Intrinsics.checkNotNullParameter(exception, "exception");
                            if (exception instanceof p) {
                                p pVar2 = exception;
                                listF = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                            } else {
                                listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                            }
                        }
                        reply.i(listF);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraControl");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.camera2.interop.CaptureRequestOptions");
                        fj.z zVar = new fj.z(reply, 2);
                        ed.d dVarA = ((z.c) obj4).a((z.g) obj5);
                        m7.a aVar3 = new m7.a(2, zVar);
                        dVarA.a(new ed.c(0, dVarA, aVar3), t1.b.c((Context) gVar2.f29394a.f6857h));
                        break;
                }
            }
        });
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.addCaptureRequestOptions", mVarA6, (Object) null).L(new ii.b() { // from class: ni.i0
            @Override // ii.b
            public final void q(Object obj, h3.e reply) {
                List listF;
                switch (i10) {
                    case 0:
                        g gVar3 = gVar2;
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue = ((Long) obj2).longValue();
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                        g0.c0 c0Var = (g0.c0) obj3;
                        try {
                            fj.c cVar6 = (fj.c) gVar3.f29394a.f6853d;
                            g0.c0 c0VarB = c0Var.b();
                            f2.g.a("CameraControl doesn't contain Camera2 implementation.", c0VarB instanceof t.o);
                            cVar6.a(jLongValue, ((t.o) c0VarB).f33183n);
                            listF = kotlin.collections.r.c(null);
                            break;
                        } catch (Throwable exception) {
                            Intrinsics.checkNotNullParameter(exception, "exception");
                            if (exception instanceof p) {
                                p pVar2 = exception;
                                listF = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                            } else {
                                listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                            }
                        }
                        reply.i(listF);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(reply, "reply");
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list2 = (List) obj;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraControl");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.camera2.interop.CaptureRequestOptions");
                        fj.z zVar = new fj.z(reply, 2);
                        ed.d dVarA = ((z.c) obj4).a((z.g) obj5);
                        m7.a aVar3 = new m7.a(2, zVar);
                        dVarA.a(new ed.c(0, dVarA, aVar3), t1.b.c((Context) gVar2.f29394a.f6857h));
                        break;
                }
            }
        });
        g gVar3 = new g(pigeonRegistrar, 9);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.createWithOnePreferredSize", pigeonRegistrar.a(), (Object) null).L(new x0(6, gVar3));
        b4.I(binaryMessenger, new f(pigeonRegistrar, 1));
        com.google.android.gms.internal.auth.m.x(binaryMessenger, new c(pigeonRegistrar, 1));
        g gVar4 = new g(pigeonRegistrar, 6);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA7 = pigeonRegistrar.a();
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPoint", mVarA7, (Object) null).L(new v0(0, gVar4));
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPointWithSize", mVarA7, (Object) null).L(new v0(1, gVar4));
        f fVar2 = new f(pigeonRegistrar, 3);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_defaultConstructor", pigeonRegistrar.a(), (Object) null).L(new l0(15, fVar2));
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        ji0 ji0Var = this.f29402c;
        if (ji0Var != null) {
            ji0Var.f6857h = this.f29401b.f16381a;
            ji0Var.i = null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        ji0 ji0Var = this.f29402c;
        if (ji0Var != null) {
            ji0Var.f6857h = this.f29401b.f16381a;
            ji0Var.i = null;
        }
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        ji0 ji0Var = this.f29402c;
        if (ji0Var != null) {
            ji0Var.f6851b = true;
            ij.p pVar = t.f29485b;
            ii.f binaryMessenger = (ii.f) ji0Var.f6852c;
            a0.e.r(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_defaultConstructor", new cj.n(2), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_defaultConstructor", new cj.n(2), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.MeteringPoint.getSize", new cj.n(2), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Observer.pigeon_defaultConstructor", new cj.n(2), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getCameraState", nVar, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getZoomState", nVar, (Object) null).L(null);
            j4.u(binaryMessenger, null);
            ya.e.z(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera.getCameraInfo", new cj.n(2), (Object) null).L(null);
            b4.J(binaryMessenger, null);
            h5.B(binaryMessenger, null);
            wa.a.y(binaryMessenger, null);
            d4.z(binaryMessenger, null);
            a0.e.t(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.pigeon_defaultConstructor", new cj.n(2), (Object) null).L(null);
            rl.b.s(binaryMessenger, null);
            com.google.android.gms.internal.auth.g.J(binaryMessenger, null);
            j0.g.S(binaryMessenger, null);
            com.google.android.gms.internal.auth.m.y(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar2 = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_defaultConstructor", nVar2, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.getAspectRatioStrategy", nVar2, (Object) null).L(null);
            com.google.android.gms.internal.auth.g.I(binaryMessenger, null);
            i0.o.M(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Analyzer.pigeon_defaultConstructor", new cj.n(2), (Object) null).L(null);
            k3.f.D(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar3 = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.getPlanes", nVar3, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.close", nVar3, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageProxyUtils.getNv21Buffer", new cj.n(2), (Object) null).L(null);
            a.a.r(binaryMessenger, null);
            hl.d.E(binaryMessenger, null);
            d4.y(binaryMessenger, null);
            hl.l.r(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar4 = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlAELock", nVar4, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlVideoStabilizationMode", nVar4, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar5 = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_defaultConstructor", nVar5, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.getCaptureRequestOption", nVar5, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar6 = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.from", nVar6, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.addCaptureRequestOptions", nVar6, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.createWithOnePreferredSize", new cj.n(2), (Object) null).L(null);
            b4.I(binaryMessenger, null);
            com.google.android.gms.internal.auth.m.x(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar7 = new cj.n(2);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPoint", nVar7, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPointWithSize", nVar7, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_defaultConstructor", new cj.n(2), (Object) null).L(null);
            fj.c cVar = (fj.c) this.f29402c.f6853d;
            cVar.f19317g.removeCallbacks((lp) cVar.f19321l);
            cVar.i = true;
            this.f29402c = null;
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        ji0 ji0Var = this.f29402c;
        if (ji0Var != null) {
            ji0Var.f6857h = (z2.w) ((h3) bVar).f28250b;
            ji0Var.i = new he.e(21, bVar);
        }
    }
}
