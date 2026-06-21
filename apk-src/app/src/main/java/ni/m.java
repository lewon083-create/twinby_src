package ni;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import com.google.android.gms.internal.ads.ji0;
import g0.q1;
import g0.u1;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji0 f29437a;

    public m(ji0 pigeonRegistrar, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
            default:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29437a = pigeonRegistrar;
                break;
        }
    }

    public static String a(m1 m1Var, String str, String str2) {
        try {
            return File.createTempFile(str, str2, ((Context) m1Var.f29441b.f29437a.f6857h).getCacheDir()).toString();
        } catch (IOException e3) {
            throw new RuntimeException("getTempFilePath_failure", new Throwable("SystemServicesHostApiImpl.getTempFilePath encountered an exception: " + e3, e3));
        }
    }

    public static void b(x0.d0 d0Var) {
        if (d0Var.f35573b.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        x0.b0 b0Var = d0Var.f35574c;
        synchronized (b0Var.f35541h) {
            try {
                if (!x0.b0.p(d0Var, b0Var.f35552p) && !x0.b0.p(d0Var, b0Var.f35551o)) {
                    com.google.android.gms.internal.auth.g.e("Recorder", "pause() called on a recording that is no longer active: " + d0Var.f35576e);
                    return;
                }
                int iOrdinal = b0Var.f35547l.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        b0Var.D(x0.a0.f35508d);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            b0Var.D(x0.a0.f35511g);
                            b0Var.f35533d.execute(new x0.s(b0Var, b0Var.f35551o, 0));
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + b0Var.f35547l);
            } finally {
            }
        }
    }

    public static z.g c(Map map) {
        q1 q1VarV = q1.v();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == null) {
                q1VarV.z(s.b.u((CaptureRequest.Key) entry.getKey()));
            } else {
                CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
                Object value = entry.getValue();
                if (CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE == key) {
                    value = Integer.valueOf(((Long) value).intValue());
                }
                q1VarV.y(s.b.u(key), value);
            }
        }
        return new z.g(u1.u(q1VarV));
    }

    public static void i(x0.d0 d0Var) {
        if (d0Var.f35573b.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        x0.b0 b0Var = d0Var.f35574c;
        synchronized (b0Var.f35541h) {
            try {
                if (!x0.b0.p(d0Var, b0Var.f35552p) && !x0.b0.p(d0Var, b0Var.f35551o)) {
                    com.google.android.gms.internal.auth.g.e("Recorder", "resume() called on a recording that is no longer active: " + d0Var.f35576e);
                    return;
                }
                int iOrdinal = b0Var.f35547l.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        b0Var.D(x0.a0.f35510f);
                        b0Var.f35533d.execute(new x0.s(b0Var, b0Var.f35551o, 1));
                    } else if (iOrdinal == 2) {
                        b0Var.D(x0.a0.f35507c);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + b0Var.f35547l);
            } finally {
            }
        }
    }

    public void d(a0.m0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29437a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.FocusMeteringResult.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg)), Boolean.valueOf(pigeon_instanceArg.f168a)), new l0(20, callback));
        }
    }

    public void e(CameraCharacteristics.Key pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29437a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristicsKey.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new he.e(29, callback));
        }
    }

    public void f(c0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29437a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            long jB = cVar.b(pigeon_instanceArg);
            String str = "dev.flutter.pigeon.camera_android_camerax.LiveData.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), pigeon_instanceArg.f29361b), new l0(24, callback));
        }
    }

    public void g(z.g pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29437a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(12, callback));
        }
    }

    public void h(c0 c0Var) {
        ji0 ji0Var = this.f29437a;
        if (ji0Var.c() == null) {
            throw new IllegalStateException("LifecycleOwner must be set to remove LiveData observers.");
        }
        androidx.lifecycle.d0 d0Var = c0Var.f29360a;
        androidx.lifecycle.u uVarC = ji0Var.c();
        d0Var.getClass();
        androidx.lifecycle.d0.a("removeObservers");
        Iterator it = d0Var.f1551b.iterator();
        while (true) {
            o.b bVar = (o.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (((androidx.lifecycle.b0) entry.getValue()).c(uVarC)) {
                d0Var.j((androidx.lifecycle.e0) entry.getKey());
            }
        }
    }
}
