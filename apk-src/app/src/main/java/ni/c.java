package ni;

import a0.q2;
import com.google.android.gms.internal.ads.ji0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji0 f29359a;

    public c(ji0 pigeonRegistrar, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
            default:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29359a = pigeonRegistrar;
                break;
        }
    }

    public static int a(e0 e0Var) {
        int iOrdinal = e0Var.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        throw new IllegalArgumentException("MeteringMode " + e0Var + " is unhandled by FocusMeteringActionBuilderProxyApi.");
    }

    public static x0.g b(n1 n1Var) {
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
        throw new IllegalArgumentException("VideoQuality " + n1Var + " is unhandled by QualitySelectorProxyApi.");
    }

    public static void i(a0.k1 k1Var, q qVar) {
        int iOrdinal = qVar.ordinal();
        int i = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? -1 : 1 : 2 : 0;
        com.google.android.gms.internal.auth.g.e("ImageCapture", "setFlashMode: flashMode = " + i);
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException(l7.o.i(i, "Invalid flash mode: "));
        }
        synchronized (k1Var.f141r) {
            k1Var.f143t = i;
            k1Var.L();
        }
    }

    public void c(a0.g pigeon_instanceArg, u callback) {
        n nVar;
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29359a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
            return;
        }
        if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
            return;
        }
        long jB = cVar.b(pigeon_instanceArg);
        switch (pigeon_instanceArg.f83a) {
            case 1:
                nVar = n.f29447h;
                break;
            case 2:
                nVar = n.f29445f;
                break;
            case 3:
                nVar = n.i;
                break;
            case 4:
                nVar = n.f29448j;
                break;
            case 5:
                nVar = n.f29443d;
                break;
            case 6:
                nVar = n.f29444e;
                break;
            case 7:
                nVar = n.f29446g;
                break;
            default:
                nVar = n.f29449k;
                break;
        }
        new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.CameraStateStateError.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), nVar), new l0(9, callback));
    }

    public void d(a0.k0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29359a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(19, callback));
        }
    }

    public void e(a0.r0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29359a;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (((fj.c) ji0Var.f6853d).d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            ij.k kVar3 = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("new-instance-error", "Attempting to create a new Dart instance of Analyzer, but the class has a nonnull callback method.", "")));
        }
    }

    public void f(q2 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29359a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.UseCase.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new x0(11, callback));
        }
    }

    public void g(x0.p pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29359a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.QualitySelector.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new x0(2, callback));
        }
    }

    public void h(z.d pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29359a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new he.e(27, callback));
        }
    }
}
