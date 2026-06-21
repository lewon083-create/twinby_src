package ni;

import a0.a2;
import a0.b2;
import a0.q1;
import a0.q2;
import a0.r1;
import a0.r2;
import a0.x1;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.google.android.gms.internal.ads.ji0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends cj.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ji0 f29496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ji0 registrar) {
        super(2);
        Intrinsics.checkNotNullParameter(registrar, "registrar");
        this.f29496b = registrar;
    }

    public static final void a(String str, Object obj, Throwable th2) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th2);
    }

    @Override // cj.n, ii.w
    public final Object readValueOfType(byte b2, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b2 != -128) {
            return super.readValueOfType(b2, buffer);
        }
        Object value = readValue(buffer);
        Intrinsics.c(value, "null cannot be cast to non-null type kotlin.Long");
        Long l10 = (Long) value;
        long jLongValue = l10.longValue();
        fj.c cVar = (fj.c) this.f29496b.f6853d;
        cVar.g();
        r rVar = (r) cVar.f19313c.get(l10);
        Object obj = rVar != null ? rVar.get() : null;
        if (obj == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return obj;
    }

    @Override // cj.n, ii.w
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        ji0 pigeonRegistrar = this.f29496b;
        ii.f fVar = (ii.f) pigeonRegistrar.f6852c;
        fj.c cVar = (fj.c) pigeonRegistrar.f6853d;
        Intrinsics.checkNotNullParameter(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof a0) || (obj instanceof d) || (obj instanceof o) || (obj instanceof d0) || (obj instanceof n1) || (obj instanceof e0) || (obj instanceof b0) || (obj instanceof q) || (obj instanceof k1) || (obj instanceof e) || (obj instanceof n) || obj == null) {
            super.writeValue(stream, obj);
            return;
        }
        Object obj2 = null;
        if (obj instanceof Size) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            Size pigeon_instanceArg = (Size) obj;
            fj.f callback = new fj.f(29, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (pigeonRegistrar.f6851b) {
                ij.k kVar = ij.m.f21341c;
                callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            } else if (cVar.d(pigeon_instanceArg)) {
                ij.k kVar2 = ij.m.f21341c;
                callback.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg)), Long.valueOf(pigeon_instanceArg.getWidth()), Long.valueOf(pigeon_instanceArg.getHeight())), new l0(6, callback));
            }
        } else if (obj instanceof b2) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            b2 pigeon_instanceArg2 = (b2) obj;
            u callback2 = new u(1, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback2, "callback");
            if (pigeonRegistrar.f6851b) {
                ij.k kVar3 = ij.m.f21341c;
                callback2.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            } else if (cVar.d(pigeon_instanceArg2)) {
                ij.k kVar4 = ij.m.f21341c;
                callback2.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.ResolutionInfo.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg2)), pigeon_instanceArg2.f46a.f108a), new x0(7, callback2));
            }
        } else if (obj instanceof Range) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            Range pigeon_instanceArg3 = (Range) obj;
            u callback3 = new u(13, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg3, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback3, "callback");
            if (pigeonRegistrar.f6851b) {
                ij.k kVar5 = ij.m.f21341c;
                callback3.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            } else if (cVar.d(pigeon_instanceArg3)) {
                ij.k kVar6 = ij.m.f21341c;
                callback3.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg3)), Long.valueOf(((Integer) pigeon_instanceArg3.getLower()).intValue()), Long.valueOf(((Integer) pigeon_instanceArg3.getUpper()).intValue())), new l0(2, callback3));
            }
        } else if (obj instanceof x0.q0) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            x0.q0 pigeon_instanceArg4 = (x0.q0) obj;
            u callback4 = new u(24, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg4, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback4, "callback");
            if (pigeonRegistrar.f6851b) {
                ij.k kVar7 = ij.m.f21341c;
                callback4.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            } else if (cVar.d(pigeon_instanceArg4)) {
                ij.k kVar8 = ij.m.f21341c;
                callback4.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventStart.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg4))), new x0(17, callback4));
            }
        } else if (obj instanceof x0.n0) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            x0.n0 pigeon_instanceArg5 = (x0.n0) obj;
            v callback5 = new v(6, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg5, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback5, "callback");
            if (pigeonRegistrar.f6851b) {
                ij.k kVar9 = ij.m.f21341c;
                callback5.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            } else if (cVar.d(pigeon_instanceArg5)) {
                ij.k kVar10 = ij.m.f21341c;
                callback5.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventFinalize.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg5))), new x0(15, callback5));
            }
        } else if (obj instanceof x0.s0) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            x0.s0 pigeon_instanceArg6 = (x0.s0) obj;
            v callback6 = new v(10, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg6, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback6, "callback");
            if (pigeonRegistrar.f6851b) {
                ij.k kVar11 = ij.m.f21341c;
                callback6.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            } else if (cVar.d(pigeon_instanceArg6)) {
                ij.k kVar12 = ij.m.f21341c;
                callback6.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEvent.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg6))), new x0(14, callback6));
            }
        } else {
            int i = 25;
            if (obj instanceof x1) {
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                x1 pigeon_instanceArg7 = (x1) obj;
                v callback7 = new v(11, obj);
                Intrinsics.checkNotNullParameter(pigeon_instanceArg7, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(callback7, "callback");
                if (pigeonRegistrar.f6851b) {
                    ij.k kVar13 = ij.m.f21341c;
                    callback7.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                } else if (cVar.d(pigeon_instanceArg7)) {
                    ij.k kVar14 = ij.m.f21341c;
                    callback7.invoke(new ij.m(Unit.f27471a));
                } else {
                    new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.MeteringPoint.pigeon_newInstance", pigeonRegistrar.a(), obj2).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg7))), new l0(i, callback7));
                }
            } else if (obj instanceof androidx.lifecycle.e0) {
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                androidx.lifecycle.e0 pigeon_instanceArg8 = (androidx.lifecycle.e0) obj;
                v callback8 = new v(12, obj);
                Intrinsics.checkNotNullParameter(pigeon_instanceArg8, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(callback8, "callback");
                if (pigeonRegistrar.f6851b) {
                    ij.k kVar15 = ij.m.f21341c;
                    callback8.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                } else if (cVar.d(pigeon_instanceArg8)) {
                    ij.k kVar16 = ij.m.f21341c;
                    callback8.invoke(new ij.m(Unit.f27471a));
                } else {
                    ij.k kVar17 = ij.m.f21341c;
                    callback8.invoke(new ij.m(l7.o.g("new-instance-error", "Attempting to create a new Dart instance of Observer, but the class has a nonnull callback method.", "")));
                }
            } else if (obj instanceof g0.d0) {
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                g0.d0 pigeon_instanceArg9 = (g0.d0) obj;
                v callback9 = new v(14, obj);
                Intrinsics.checkNotNullParameter(pigeon_instanceArg9, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(callback9, "callback");
                if (pigeonRegistrar.f6851b) {
                    ij.k kVar18 = ij.m.f21341c;
                    callback9.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                } else if (cVar.d(pigeon_instanceArg9)) {
                    ij.k kVar19 = ij.m.f21341c;
                    callback9.invoke(new ij.m(Unit.f27471a));
                } else {
                    long jB = cVar.b(pigeon_instanceArg9);
                    long jC = pigeon_instanceArg9.c();
                    int iL = pigeon_instanceArg9.l();
                    new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), Long.valueOf(jC), iL != 0 ? iL != 1 ? iL != 2 ? b0.f29354g : b0.f29353f : b0.f29352e : b0.f29351d, pigeon_instanceArg9.i()), new l0(1, callback9));
                }
            } else {
                int i10 = 5;
                if (obj instanceof a0.w) {
                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                    a0.w pigeon_instanceArg10 = (a0.w) obj;
                    v callback10 = new v(15, obj);
                    Intrinsics.checkNotNullParameter(pigeon_instanceArg10, "pigeon_instanceArg");
                    Intrinsics.checkNotNullParameter(callback10, "callback");
                    if (pigeonRegistrar.f6851b) {
                        ij.k kVar20 = ij.m.f21341c;
                        callback10.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                    } else if (cVar.d(pigeon_instanceArg10)) {
                        ij.k kVar21 = ij.m.f21341c;
                        callback10.invoke(new ij.m(Unit.f27471a));
                    } else {
                        new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg10))), new l0(i10, callback10));
                    }
                } else if (obj instanceof w0.f) {
                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                    w0.f pigeon_instanceArg11 = (w0.f) obj;
                    u callback11 = new u(10, obj);
                    Intrinsics.checkNotNullParameter(pigeon_instanceArg11, "pigeon_instanceArg");
                    Intrinsics.checkNotNullParameter(callback11, "callback");
                    if (pigeonRegistrar.f6851b) {
                        ij.k kVar22 = ij.m.f21341c;
                        callback11.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                    } else if (cVar.d(pigeon_instanceArg11)) {
                        ij.k kVar23 = ij.m.f21341c;
                        callback11.invoke(new ij.m(Unit.f27471a));
                    } else {
                        new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg11))), new x0(1, callback11));
                    }
                } else if (obj instanceof a0.n) {
                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                    a0.n pigeon_instanceArg12 = (a0.n) obj;
                    u callback12 = new u(21, obj);
                    Intrinsics.checkNotNullParameter(pigeon_instanceArg12, "pigeon_instanceArg");
                    Intrinsics.checkNotNullParameter(callback12, "callback");
                    if (pigeonRegistrar.f6851b) {
                        ij.k kVar24 = ij.m.f21341c;
                        callback12.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                    } else if (cVar.d(pigeon_instanceArg12)) {
                        ij.k kVar25 = ij.m.f21341c;
                        callback12.invoke(new ij.m(Unit.f27471a));
                    } else {
                        new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.Camera.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg12)), pigeon_instanceArg12.a()), new he.e(25, callback12));
                    }
                } else if (obj instanceof m1) {
                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                    m1 pigeon_instanceArg13 = (m1) obj;
                    v callback13 = new v(2, obj);
                    Intrinsics.checkNotNullParameter(pigeon_instanceArg13, "pigeon_instanceArg");
                    Intrinsics.checkNotNullParameter(callback13, "callback");
                    if (pigeonRegistrar.f6851b) {
                        ij.k kVar26 = ij.m.f21341c;
                        callback13.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                    } else if (cVar.d(pigeon_instanceArg13)) {
                        ij.k kVar27 = ij.m.f21341c;
                        callback13.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar28 = ij.m.f21341c;
                        callback13.invoke(new ij.m(l7.o.g("new-instance-error", "Attempting to create a new Dart instance of SystemServicesManager, but the class has a nonnull callback method.", "")));
                    }
                } else {
                    int i11 = 4;
                    if (obj instanceof j) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        j pigeon_instanceArg14 = (j) obj;
                        v callback14 = new v(13, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg14, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback14, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar29 = ij.m.f21341c;
                            callback14.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg14)) {
                            ij.k kVar30 = ij.m.f21341c;
                            callback14.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.CameraPermissionsError.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg14)), pigeon_instanceArg14.f29412a, pigeon_instanceArg14.f29413b), new l0(i11, callback14));
                        }
                    } else if (obj instanceof z) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        z pigeon_instanceArg15 = (z) obj;
                        v callback15 = new v(16, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg15, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback15, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar31 = ij.m.f21341c;
                            callback15.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg15)) {
                            ij.k kVar32 = ij.m.f21341c;
                            callback15.invoke(new ij.m(Unit.f27471a));
                        } else {
                            ij.k kVar33 = ij.m.f21341c;
                            callback15.invoke(new ij.m(l7.o.g("new-instance-error", "Attempting to create a new Dart instance of DeviceOrientationManager, but the class has a nonnull callback method.", "")));
                        }
                    } else if (obj instanceof a2) {
                        if (((l6.i) pigeonRegistrar.f6858j) == null) {
                            pigeonRegistrar.f6858j = new l6.i(pigeonRegistrar);
                        }
                        l6.i iVar = (l6.i) pigeonRegistrar.f6858j;
                        a2 pigeon_instanceArg16 = (a2) obj;
                        v callback16 = new v(17, obj);
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg16, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback16, "callback");
                        ji0 ji0Var = (ji0) iVar.f27978c;
                        boolean z5 = ji0Var.f6851b;
                        fj.c cVar2 = (fj.c) ji0Var.f6853d;
                        if (z5) {
                            ij.k kVar34 = ij.m.f21341c;
                            callback16.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar2.d(pigeon_instanceArg16)) {
                            ij.k kVar35 = ij.m.f21341c;
                            callback16.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.Preview.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar2.b(pigeon_instanceArg16)), ((g0.i1) pigeon_instanceArg16.f209h).j()), new x0(0, callback16));
                        }
                    } else if (obj instanceof x0.k0) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        x0.k0 pigeon_instanceArg17 = (x0.k0) obj;
                        v callback17 = new v(18, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg17, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback17, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar36 = ij.m.f21341c;
                            callback17.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg17)) {
                            ij.k kVar37 = ij.m.f21341c;
                            callback17.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg17))), new x0(12, callback17));
                        }
                    } else if (obj instanceof x0.b0) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        x0.b0 pigeon_instanceArg18 = (x0.b0) obj;
                        v callback18 = new v(19, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg18, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback18, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar38 = ij.m.f21341c;
                            callback18.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg18)) {
                            ij.k kVar39 = ij.m.f21341c;
                            callback18.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.Recorder.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg18))), new x0(3, callback18));
                        }
                    } else if (obj instanceof x0.m0) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        x0.m0 pigeon_instanceArg19 = (x0.m0) obj;
                        v callback19 = new v(20, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg19, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback19, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar40 = ij.m.f21341c;
                            callback19.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg19)) {
                            ij.k kVar41 = ij.m.f21341c;
                            callback19.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.VideoOutput.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg19))), new x0(13, callback19));
                        }
                    } else if (obj instanceof o1) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        o1 pigeon_instanceArg20 = (o1) obj;
                        u callback20 = new u(0, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg20, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback20, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar42 = ij.m.f21341c;
                            callback20.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg20)) {
                            ij.k kVar43 = ij.m.f21341c;
                            callback20.invoke(new ij.m(Unit.f27471a));
                        } else {
                            ij.k kVar44 = ij.m.f21341c;
                            callback20.invoke(new ij.m(l7.o.g("new-instance-error", "Attempting to create a new Dart instance of VideoRecordEventListener, but the class has a nonnull callback method.", "")));
                        }
                    } else if (obj instanceof x0.n) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        x0.n pigeon_instanceArg21 = (x0.n) obj;
                        u callback21 = new u(2, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg21, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback21, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar45 = ij.m.f21341c;
                            callback21.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg21)) {
                            ij.k kVar46 = ij.m.f21341c;
                            callback21.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg21))), new l0(28, callback21));
                        }
                    } else if (obj instanceof x0.d0) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        x0.d0 pigeon_instanceArg22 = (x0.d0) obj;
                        u callback22 = new u(3, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg22, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback22, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar47 = ij.m.f21341c;
                            callback22.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg22)) {
                            ij.k kVar48 = ij.m.f21341c;
                            callback22.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.Recording.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg22))), new x0(4, callback22));
                        }
                    } else if (obj instanceof a0.k1) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        a0.k1 pigeon_instanceArg23 = (a0.k1) obj;
                        u callback23 = new u(4, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg23, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback23, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar49 = ij.m.f21341c;
                            callback23.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg23)) {
                            ij.k kVar50 = ij.m.f21341c;
                            callback23.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg23)), ((g0.i1) pigeon_instanceArg23.f209h).j()), new l0(22, callback23));
                        }
                    } else if (obj instanceof t0.c) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        t0.c pigeon_instanceArg24 = (t0.c) obj;
                        u callback24 = new u(5, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg24, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback24, "callback");
                        if (pigeonRegistrar.f6851b) {
                            ij.k kVar51 = ij.m.f21341c;
                            callback24.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar.d(pigeon_instanceArg24)) {
                            ij.k kVar52 = ij.m.f21341c;
                            callback24.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g(fVar, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.pigeon_newInstance", pigeonRegistrar.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg24))), new x0(10, callback24));
                        }
                    } else if (obj instanceof t0.b) {
                        c cVar3 = new c(pigeonRegistrar, 10);
                        t0.b pigeon_instanceArg25 = (t0.b) obj;
                        u callback25 = new u(6, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg25, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback25, "callback");
                        ji0 ji0Var2 = cVar3.f29359a;
                        fj.c cVar4 = (fj.c) ji0Var2.f6853d;
                        if (ji0Var2.f6851b) {
                            ij.k kVar53 = ij.m.f21341c;
                            callback25.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar4.d(pigeon_instanceArg25)) {
                            ij.k kVar54 = ij.m.f21341c;
                            callback25.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g((ii.f) ji0Var2.f6852c, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_newInstance", ji0Var2.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar4.b(pigeon_instanceArg25)), pigeon_instanceArg25.f33337c, pigeon_instanceArg25.f33336b), new x0(8, callback25));
                        }
                    } else if (obj instanceof t0.a) {
                        f fVar2 = new f(pigeonRegistrar, 0);
                        t0.a pigeon_instanceArg26 = (t0.a) obj;
                        u callback26 = new u(7, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg26, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback26, "callback");
                        ji0 ji0Var3 = fVar2.f29389a;
                        fj.c cVar5 = (fj.c) ji0Var3.f6853d;
                        if (ji0Var3.f6851b) {
                            ij.k kVar55 = ij.m.f21341c;
                            callback26.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar5.d(pigeon_instanceArg26)) {
                            ij.k kVar56 = ij.m.f21341c;
                            callback26.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g((ii.f) ji0Var3.f6852c, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_newInstance", ji0Var3.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar5.b(pigeon_instanceArg26))), new he.e(24, callback26));
                        }
                    } else if (obj instanceof a0.f) {
                        new g(pigeonRegistrar, 2).f((a0.f) obj, new u(8, obj));
                    } else if (obj instanceof t.k1) {
                        m mVar = new m(pigeonRegistrar, 2);
                        t.k1 pigeon_instanceArg27 = (t.k1) obj;
                        u callback27 = new u(9, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg27, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback27, "callback");
                        ji0 ji0Var4 = mVar.f29437a;
                        fj.c cVar6 = (fj.c) ji0Var4.f6853d;
                        if (ji0Var4.f6851b) {
                            ij.k kVar57 = ij.m.f21341c;
                            callback27.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
                        } else if (cVar6.d(pigeon_instanceArg27)) {
                            ij.k kVar58 = ij.m.f21341c;
                            callback27.invoke(new ij.m(Unit.f27471a));
                        } else {
                            new s7.g((ii.f) ji0Var4.f6852c, "dev.flutter.pigeon.camera_android_camerax.ExposureState.pigeon_newInstance", ji0Var4.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar6.b(pigeon_instanceArg27)), pigeon_instanceArg27.a(), Double.valueOf((!pigeon_instanceArg27.b() ? Rational.ZERO : (Rational) pigeon_instanceArg27.f33138b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP)).doubleValue())), new l0(16, callback27));
                        }
                    } else if (obj instanceof r2) {
                        new f(pigeonRegistrar, 10).f((r2) obj, new u(11, obj));
                    } else if (obj instanceof a0.w0) {
                        new g(pigeonRegistrar, 5).h((a0.w0) obj, new u(12, obj));
                    } else if (obj instanceof q2) {
                        new c(pigeonRegistrar, 8).f((q2) obj, new u(14, obj));
                    } else if (obj instanceof a0.r0) {
                        new c(pigeonRegistrar, 0).e((a0.r0) obj, new u(15, obj));
                    } else if (obj instanceof a0.g) {
                        new c(pigeonRegistrar, 3).c((a0.g) obj, new u(16, obj));
                    } else if (obj instanceof c0) {
                        new m(pigeonRegistrar, 4).f((c0) obj, new u(17, obj));
                    } else if (obj instanceof r1) {
                        new f(pigeonRegistrar, 5).e((r1) obj, new u(18, obj));
                    } else if (obj instanceof q1) {
                        new f(pigeonRegistrar, 7).d((q1) obj, new u(19, obj));
                    } else if (obj instanceof x0.p) {
                        new c(pigeonRegistrar, 9).g((x0.p) obj, new u(20, obj));
                    } else if (obj instanceof x0.c) {
                        new g(pigeonRegistrar, 4).m((x0.c) obj, new u(22, obj));
                    } else if (obj instanceof g0.c0) {
                        new g(pigeonRegistrar, 1).k((g0.c0) obj, new u(23, obj));
                    } else if (obj instanceof a0.k0) {
                        new c(pigeonRegistrar, 5).d((a0.k0) obj, new u(25, obj));
                    } else if (obj instanceof a0.l0) {
                        new f(pigeonRegistrar, 4).c((a0.l0) obj, new u(26, obj));
                    } else if (obj instanceof a0.m0) {
                        new m(pigeonRegistrar, 3).d((a0.m0) obj, new u(27, obj));
                    } else if (obj instanceof CaptureRequest) {
                        new g(pigeonRegistrar, 3).j((CaptureRequest) obj, new u(28, obj));
                    } else if (obj instanceof CaptureRequest.Key) {
                        new g(pigeonRegistrar, 7).i((CaptureRequest.Key) obj, new u(29, obj));
                    } else if (obj instanceof z.g) {
                        pigeonRegistrar.getClass();
                        new m(pigeonRegistrar, 1).g((z.g) obj, new v(0, obj));
                    } else if (obj instanceof z.c) {
                        pigeonRegistrar.getClass();
                        new g(pigeonRegistrar, 0).n((z.c) obj, new v(1, obj));
                    } else if (obj instanceof j1) {
                        pigeonRegistrar.k().l((j1) obj, new v(3, obj));
                    } else if (obj instanceof CameraCharacteristics.Key) {
                        pigeonRegistrar.g().e((CameraCharacteristics.Key) obj, new v(4, obj));
                    } else if (obj instanceof CameraCharacteristics) {
                        pigeonRegistrar.f().g((CameraCharacteristics) obj, new v(5, obj));
                    } else if (obj instanceof z.d) {
                        pigeonRegistrar.e().h((z.d) obj, new v(7, obj));
                    } else {
                        boolean z10 = obj instanceof a0.h0;
                        if (z10) {
                            pigeonRegistrar.h().b((a0.h0) obj, new v(8, obj));
                        } else if (z10) {
                            pigeonRegistrar.i().g((a0.h0) obj, new v(9, obj));
                        }
                    }
                }
            }
        }
        if (cVar.d(obj)) {
            stream.write(128);
            writeValue(stream, cVar.e(obj));
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
    }
}
