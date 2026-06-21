package ni;

import a0.o2;
import a0.q1;
import a0.r1;
import a0.r2;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import com.google.android.gms.internal.ads.ji0;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji0 f29389a;

    public f(ji0 pigeonRegistrar, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
            default:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f29389a = pigeonRegistrar;
                break;
        }
    }

    public static x0.b0 a(Long l10, Long l11, x0.p pVar) {
        wf.b bVar = x0.b0.f35522q0;
        wf.b bVar2 = x0.b0.f35523r0;
        x0.a aVarC = x0.a.a().c();
        com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
        x0.p pVar2 = x0.k.f35627f;
        if (pVar2 == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        yVar.f14899b = pVar2;
        yVar.f14900c = 0;
        Range range = x0.k.f35626e;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        yVar.f14901d = range;
        yVar.f14902e = -1;
        x0.k kVarB = yVar.b();
        if (l10 != null) {
            int iIntValue = l10.intValue();
            com.google.firebase.messaging.y yVar2 = new com.google.firebase.messaging.y();
            yVar2.f14899b = kVarB.f35628a;
            yVar2.f14900c = Integer.valueOf(kVarB.f35629b);
            yVar2.f14901d = kVarB.f35630c;
            yVar2.f14902e = Integer.valueOf(kVarB.f35631d);
            yVar2.f14902e = Integer.valueOf(iIntValue);
            kVarB = yVar2.b();
        }
        if (l11 != null) {
            int iIntValue2 = l11.intValue();
            if (iIntValue2 <= 0) {
                throw new IllegalArgumentException(a0.u.k(iIntValue2, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
            }
            com.google.firebase.messaging.y yVar3 = new com.google.firebase.messaging.y();
            yVar3.f14899b = kVarB.f35628a;
            yVar3.f14900c = Integer.valueOf(kVarB.f35629b);
            yVar3.f14901d = kVarB.f35630c;
            yVar3.f14902e = Integer.valueOf(kVarB.f35631d);
            yVar3.f14901d = new Range(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue2));
            kVarB = yVar3.b();
        }
        if (pVar != null) {
            com.google.firebase.messaging.y yVar4 = new com.google.firebase.messaging.y();
            yVar4.f14899b = kVarB.f35628a;
            yVar4.f14900c = Integer.valueOf(kVarB.f35629b);
            yVar4.f14901d = kVarB.f35630c;
            yVar4.f14902e = Integer.valueOf(kVarB.f35631d);
            yVar4.f14899b = pVar;
            kVarB = yVar4.b();
        }
        return new x0.b0(new x0.e(kVarB, aVarC, -1), bVar, bVar, bVar2);
    }

    public void b(a0.h0 pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29389a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new l0(14, callback));
        }
    }

    public void c(a0.l0 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29389a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringAction.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg)), pigeon_instanceArg.f156b, pigeon_instanceArg.f155a, pigeon_instanceArg.f157c, Boolean.valueOf(pigeon_instanceArg.f158d > 0)), new l0(18, callback));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(q1 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29389a;
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
        ByteBuffer byteBufferE = pigeon_instanceArg.e();
        int iRemaining = byteBufferE.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBufferE.get(bArr, 0, iRemaining);
        new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.PlaneProxy.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), bArr, Long.valueOf(pigeon_instanceArg.g()), Long.valueOf(pigeon_instanceArg.f())), new l0(29, callback));
    }

    public void e(r1 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29389a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else {
            if (cVar.d(pigeon_instanceArg)) {
                ij.k kVar2 = ij.m.f21341c;
                callback.invoke(new ij.m(Unit.f27471a));
                return;
            }
            new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg)), Long.valueOf(pigeon_instanceArg.getFormat()), Long.valueOf(pigeon_instanceArg.getWidth()), Long.valueOf(pigeon_instanceArg.getHeight())), new l0(23, callback));
        }
    }

    public void f(r2 pigeon_instanceArg, u callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29389a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else {
            if (cVar.d(pigeon_instanceArg)) {
                ij.k kVar2 = ij.m.f21341c;
                callback.invoke(new ij.m(Unit.f27471a));
                return;
            }
            new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.ZoomState.pigeon_newInstance", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg)), Double.valueOf(pigeon_instanceArg.b()), Double.valueOf(pigeon_instanceArg.a())), new x0(18, callback));
        }
    }

    public void g(CameraCharacteristics pigeon_instanceArg, v callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = this.f29389a;
        fj.c cVar = (fj.c) ji0Var.f6853d;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", "")));
        } else if (cVar.d(pigeon_instanceArg)) {
            ij.k kVar2 = ij.m.f21341c;
            callback.invoke(new ij.m(Unit.f27471a));
        } else {
            String str = "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.pigeon_newInstance";
            new s7.g((ii.f) ji0Var.f6852c, str, ji0Var.a(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg))), new he.e(28, callback));
        }
    }

    public x0.n h(x0.b0 b0Var, String str) {
        try {
            File file = new File(str);
            Long l10 = 0L;
            if (!"".isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(""));
            }
            return new x0.n((Context) this.f29389a.f6857h, b0Var, new x0.m(new x0.d(l10.longValue(), l10.longValue(), file)));
        } catch (NullPointerException | SecurityException e3) {
            throw new RuntimeException(e3);
        }
    }

    public x0.d0 i(x0.n nVar, o1 o1Var) {
        x0.h hVar;
        int i;
        long j10;
        x0.h hVar2;
        x0.d0 d0Var;
        Executor listenerExecutor = t1.b.c((Context) this.f29389a.f6857h);
        f7.i listener = new f7.i(1, o1Var);
        Intrinsics.checkNotNullParameter(listenerExecutor, "listenerExecutor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f2.g.g(listenerExecutor, "Listener Executor can't be null.");
        nVar.f35654e = listenerExecutor;
        nVar.f35653d = listener;
        final x0.b0 b0Var = nVar.f35650a;
        synchronized (b0Var.f35541h) {
            try {
                long j11 = b0Var.f35553q + 1;
                b0Var.f35553q = j11;
                hVar = null;
                i = 0;
                switch (b0Var.f35547l.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        x0.a0 a0Var = b0Var.f35547l;
                        x0.a0 a0Var2 = x0.a0.f35509e;
                        if (a0Var == a0Var2) {
                            f2.g.h("Expected recorder to be idle but a recording is either pending or in progress.", b0Var.f35551o == null && b0Var.f35552p == null);
                        }
                        try {
                            j10 = j11;
                        } catch (IOException e3) {
                            e = e3;
                            j10 = j11;
                        }
                        try {
                            x0.h hVar3 = new x0.h(nVar.f35651b, nVar.f35654e, nVar.f35653d, nVar.f35655f, nVar.f35657h, j10);
                            hVar3.f35605g.set(nVar.f35656g);
                            hVar3.d(nVar.f35652c);
                            b0Var.f35552p = hVar3;
                            x0.a0 a0Var3 = b0Var.f35547l;
                            if (a0Var3 == a0Var2) {
                                b0Var.D(x0.a0.f35507c);
                                final int i10 = 0;
                                b0Var.f35533d.execute(new Runnable() { // from class: x0.r
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        h hVarQ;
                                        h hVar4;
                                        int i11;
                                        boolean z5 = false;
                                        switch (i10) {
                                            case 0:
                                                b0 b0Var2 = b0Var;
                                                synchronized (b0Var2.f35541h) {
                                                    try {
                                                        com.google.android.gms.internal.auth.g.e("Recorder", "tryServicePendingRecording on state: " + b0Var2.f35547l);
                                                        int iOrdinal = b0Var2.f35547l.ordinal();
                                                        boolean z10 = true;
                                                        hVarQ = null;
                                                        if (iOrdinal != 1) {
                                                            i11 = iOrdinal != 2 ? 0 : 0;
                                                            hVar4 = null;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (b0Var2.f35548l0 != 3) {
                                                            if (b0Var2.f35551o != null || b0Var2.f35528a0) {
                                                                com.google.android.gms.internal.auth.g.O("Recorder", "PendingRecording is not handled, active recording = " + b0Var2.f35551o + ", need reset flag = " + b0Var2.f35528a0);
                                                            } else if (b0Var2.G != null) {
                                                                hVar4 = null;
                                                                hVarQ = b0Var2.q(b0Var2.f35547l);
                                                                i11 = 0;
                                                            }
                                                            z5 = z10;
                                                            hVar4 = null;
                                                        } else {
                                                            h hVar5 = b0Var2.f35552p;
                                                            b0Var2.f35552p = null;
                                                            b0Var2.y();
                                                            Set set = b0.f35519m0;
                                                            i11 = 4;
                                                            hVar4 = hVar5;
                                                        }
                                                        z5 = z10;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                    break;
                                                }
                                                if (hVarQ != null) {
                                                    b0Var2.H(hVarQ, z5);
                                                    return;
                                                } else {
                                                    if (hVar4 != null) {
                                                        b0Var2.j(hVar4, i11);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                b0 b0Var3 = b0Var;
                                                o2 o2Var = b0Var3.f35562z;
                                                if (o2Var == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                b0Var3.h(o2Var, b0Var3.A, false);
                                                return;
                                        }
                                    }
                                });
                            } else if (a0Var3 == x0.a0.f35513j) {
                                b0Var.D(x0.a0.f35507c);
                                final int i11 = 1;
                                b0Var.f35533d.execute(new Runnable() { // from class: x0.r
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        h hVarQ;
                                        h hVar4;
                                        int i112;
                                        boolean z5 = false;
                                        switch (i11) {
                                            case 0:
                                                b0 b0Var2 = b0Var;
                                                synchronized (b0Var2.f35541h) {
                                                    try {
                                                        com.google.android.gms.internal.auth.g.e("Recorder", "tryServicePendingRecording on state: " + b0Var2.f35547l);
                                                        int iOrdinal = b0Var2.f35547l.ordinal();
                                                        boolean z10 = true;
                                                        hVarQ = null;
                                                        if (iOrdinal != 1) {
                                                            i112 = iOrdinal != 2 ? 0 : 0;
                                                            hVar4 = null;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (b0Var2.f35548l0 != 3) {
                                                            if (b0Var2.f35551o != null || b0Var2.f35528a0) {
                                                                com.google.android.gms.internal.auth.g.O("Recorder", "PendingRecording is not handled, active recording = " + b0Var2.f35551o + ", need reset flag = " + b0Var2.f35528a0);
                                                            } else if (b0Var2.G != null) {
                                                                hVar4 = null;
                                                                hVarQ = b0Var2.q(b0Var2.f35547l);
                                                                i112 = 0;
                                                            }
                                                            z5 = z10;
                                                            hVar4 = null;
                                                        } else {
                                                            h hVar5 = b0Var2.f35552p;
                                                            b0Var2.f35552p = null;
                                                            b0Var2.y();
                                                            Set set = b0.f35519m0;
                                                            i112 = 4;
                                                            hVar4 = hVar5;
                                                        }
                                                        z5 = z10;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                    break;
                                                }
                                                if (hVarQ != null) {
                                                    b0Var2.H(hVarQ, z5);
                                                    return;
                                                } else {
                                                    if (hVar4 != null) {
                                                        b0Var2.j(hVar4, i112);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                b0 b0Var3 = b0Var;
                                                o2 o2Var = b0Var3.f35562z;
                                                if (o2Var == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                b0Var3.h(o2Var, b0Var3.A, false);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                b0Var.D(x0.a0.f35507c);
                            }
                            e = null;
                        } catch (IOException e7) {
                            e = e7;
                            i = 5;
                        }
                        break;
                    case 1:
                    case 2:
                        hVar2 = b0Var.f35552p;
                        hVar2.getClass();
                        hVar = hVar2;
                        e = null;
                        j10 = j11;
                        break;
                    case 4:
                    case 5:
                        hVar2 = b0Var.f35551o;
                        hVar = hVar2;
                        e = null;
                        j10 = j11;
                        break;
                    default:
                        j10 = j11;
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (hVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i != 0) {
            com.google.android.gms.internal.auth.g.k("Recorder", "Recording was started when the Recorder had encountered error " + e);
            x0.h hVar4 = new x0.h(nVar.f35651b, nVar.f35654e, nVar.f35653d, nVar.f35655f, nVar.f35657h, j10);
            hVar4.f35605g.set(nVar.f35656g);
            b0Var.j(hVar4, i);
            d0Var = new x0.d0(nVar.f35650a, j10, nVar.f35651b, true);
        } else {
            d0Var = new x0.d0(nVar.f35650a, j10, nVar.f35651b, false);
        }
        Intrinsics.checkNotNullExpressionValue(d0Var, "start(...)");
        return d0Var;
    }

    public x0.n j(x0.n nVar, boolean z5) {
        if (t1.b.a((Context) this.f29389a.f6857h, "android.permission.RECORD_AUDIO") != 0) {
            return nVar;
        }
        if (rl.b.d(nVar.f35652c, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        f2.g.h("The Recorder this recording is associated to doesn't support audio.", ((x0.e) x0.b0.l(nVar.f35650a.E)).f35579b.f35505e != 0);
        nVar.f35655f = true;
        nVar.f35656g = z5;
        return nVar;
    }
}
