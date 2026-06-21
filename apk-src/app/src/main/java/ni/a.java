package ni;

import a0.g2;
import com.google.android.gms.internal.ads.ji0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29339d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f29337b = i;
        this.f29339d = obj;
        this.f29338c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f29337b;
        Object obj = null;
        Object valueArg = this.f29338c;
        Object obj2 = this.f29339d;
        switch (i) {
            case 0:
                b pigeon_instanceArg = (b) obj2;
                c cVar = pigeon_instanceArg.f29349a;
                g2 imageArg = (g2) valueArg;
                fj.l0 callback = l1.a(new ch.a(this, 11));
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(imageArg, "imageArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                ji0 ji0Var = cVar.f29359a;
                if (ji0Var.f6851b) {
                    ij.k kVar = ij.m.f21341c;
                    l7.o.r(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback);
                } else if (!((fj.c) ji0Var.f6853d).d(pigeon_instanceArg)) {
                    ij.k kVar2 = ij.m.f21341c;
                    l7.o.r(l7.o.g("missing-instance-error", "Callback to `Analyzer.analyze` failed because native instance was not in the instance manager.", ""), callback);
                } else {
                    new s7.g((ii.f) ji0Var.f6852c, "dev.flutter.pigeon.camera_android_camerax.Analyzer.analyze", ji0Var.a(), obj).K(kotlin.collections.s.f(pigeon_instanceArg, imageArg), new g0(callback, 0));
                }
                break;
            case 1:
                f0 pigeon_instanceArg2 = (f0) obj2;
                c cVar2 = (c) pigeon_instanceArg2.f29391b;
                fj.l0 callback2 = l1.a(new ch.a(this, 13));
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(valueArg, "valueArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                ji0 ji0Var2 = cVar2.f29359a;
                if (ji0Var2.f6851b) {
                    ij.k kVar3 = ij.m.f21341c;
                    l7.o.r(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback2);
                } else if (!((fj.c) ji0Var2.f6853d).d(pigeon_instanceArg2)) {
                    ij.k kVar4 = ij.m.f21341c;
                    l7.o.r(l7.o.g("missing-instance-error", "Callback to `Observer.onChanged` failed because native instance was not in the instance manager.", ""), callback2);
                } else {
                    new s7.g((ii.f) ji0Var2.f6852c, "dev.flutter.pigeon.camera_android_camerax.Observer.onChanged", ji0Var2.a(), obj).K(kotlin.collections.s.f(pigeon_instanceArg2, valueArg), new g0(callback2, 2));
                }
                break;
            case 2:
                m1 pigeon_instanceArg3 = (m1) obj2;
                m mVar = pigeon_instanceArg3.f29441b;
                String errorDescriptionArg = (String) valueArg;
                fj.l0 callback3 = l1.a(new ch.a(this, 14));
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg3, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(errorDescriptionArg, "errorDescriptionArg");
                Intrinsics.checkNotNullParameter(callback3, "callback");
                ji0 ji0Var3 = mVar.f29437a;
                if (ji0Var3.f6851b) {
                    ij.k kVar5 = ij.m.f21341c;
                    l7.o.r(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback3);
                } else if (!((fj.c) ji0Var3.f6853d).d(pigeon_instanceArg3)) {
                    ij.k kVar6 = ij.m.f21341c;
                    l7.o.r(l7.o.g("missing-instance-error", "Callback to `SystemServicesManager.onCameraError` failed because native instance was not in the instance manager.", ""), callback3);
                } else {
                    new s7.g((ii.f) ji0Var3.f6852c, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.onCameraError", ji0Var3.a(), obj).K(kotlin.collections.s.f(pigeon_instanceArg3, errorDescriptionArg), new g0(callback3, 3));
                }
                break;
            default:
                o1 pigeon_instanceArg4 = (o1) obj2;
                c cVar3 = pigeon_instanceArg4.f29467a;
                x0.s0 eventArg = (x0.s0) valueArg;
                fj.l0 callback4 = l1.a(new ch.a(this, 15));
                Intrinsics.checkNotNullParameter(pigeon_instanceArg4, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(eventArg, "eventArg");
                Intrinsics.checkNotNullParameter(callback4, "callback");
                ji0 ji0Var4 = cVar3.f29359a;
                if (ji0Var4.f6851b) {
                    ij.k kVar7 = ij.m.f21341c;
                    l7.o.r(l7.o.g("ignore-calls-error", "Calls to Dart are being ignored.", ""), callback4);
                } else if (!((fj.c) ji0Var4.f6853d).d(pigeon_instanceArg4)) {
                    ij.k kVar8 = ij.m.f21341c;
                    l7.o.r(l7.o.g("missing-instance-error", "Callback to `VideoRecordEventListener.onEvent` failed because native instance was not in the instance manager.", ""), callback4);
                } else {
                    new s7.g((ii.f) ji0Var4.f6852c, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.onEvent", ji0Var4.a(), obj).K(kotlin.collections.s.f(pigeon_instanceArg4, eventArg), new g0(callback4, 4));
                }
                break;
        }
    }
}
