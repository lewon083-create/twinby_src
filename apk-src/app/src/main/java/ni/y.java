package ni;

import com.google.android.gms.internal.ads.ji0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f29502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f29503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29504d;

    public y(c cVar, z zVar, int i) {
        this.f29502b = cVar;
        this.f29503c = zVar;
        this.f29504d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String orientationArg = gf.a.w(this.f29504d);
        fj.l0 callback = l1.a(new ch.a(this, 12));
        c cVar = this.f29502b;
        cVar.getClass();
        z pigeon_instanceArg = this.f29503c;
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(orientationArg, "orientationArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ji0 ji0Var = cVar.f29359a;
        if (ji0Var.f6851b) {
            ij.k kVar = ij.m.f21341c;
            l7.o.r(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
        } else if (((fj.c) ji0Var.f6853d).d(pigeon_instanceArg)) {
            new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.onDeviceOrientationChanged", ji0Var.a(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, orientationArg), new g0(callback, 1));
        } else {
            ij.k kVar2 = ij.m.f21341c;
            l7.o.r(l7.o.g("missing-instance-error", "Callback to `DeviceOrientationManager.onDeviceOrientationChanged` failed because native instance was not in the instance manager.", ""), callback);
        }
    }
}
