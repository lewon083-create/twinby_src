package ni;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements ii.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fj.l0 f29396c;

    public /* synthetic */ g0(fj.l0 l0Var, int i) {
        this.f29395b = i;
        this.f29396c = l0Var;
    }

    @Override // ii.c
    public final void i(Object obj) {
        ij.l lVarH;
        ij.l lVarH2;
        ij.l lVarH3;
        ij.l lVarH4;
        ij.l lVarH5;
        int i = this.f29395b;
        fj.l0 l0Var = this.f29396c;
        switch (i) {
            case 0:
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar = ij.m.f21341c;
                        l0Var.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar2 = ij.m.f21341c;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVarH = h5.s(new p((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                } else {
                    ij.k kVar3 = ij.m.f21341c;
                    lVarH = l7.o.h("dev.flutter.pigeon.camera_android_camerax.Analyzer.analyze", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Analyzer.analyze'.", "");
                }
                l7.o.r(lVarH, l0Var);
                break;
            case 1:
                if (obj instanceof List) {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar4 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar5 = ij.m.f21341c;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVarH2 = h5.s(new p((String) obj4, (String) obj5, (String) list2.get(2)));
                    }
                } else {
                    ij.k kVar6 = ij.m.f21341c;
                    lVarH2 = l7.o.h("dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.onDeviceOrientationChanged", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.onDeviceOrientationChanged'.", "");
                }
                l7.o.r(lVarH2, l0Var);
                break;
            case 2:
                if (obj instanceof List) {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        ij.k kVar7 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar8 = ij.m.f21341c;
                        Object obj6 = list3.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        lVarH3 = h5.s(new p((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                } else {
                    ij.k kVar9 = ij.m.f21341c;
                    lVarH3 = l7.o.h("dev.flutter.pigeon.camera_android_camerax.Observer.onChanged", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Observer.onChanged'.", "");
                }
                l7.o.r(lVarH3, l0Var);
                break;
            case 3:
                if (obj instanceof List) {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar10 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar11 = ij.m.f21341c;
                        Object obj8 = list4.get(0);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        lVarH4 = h5.s(new p((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                } else {
                    ij.k kVar12 = ij.m.f21341c;
                    lVarH4 = l7.o.h("dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.onCameraError", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.onCameraError'.", "");
                }
                l7.o.r(lVarH4, l0Var);
                break;
            default:
                if (obj instanceof List) {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar13 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar14 = ij.m.f21341c;
                        Object obj10 = list5.get(0);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        lVarH5 = h5.s(new p((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                } else {
                    ij.k kVar15 = ij.m.f21341c;
                    lVarH5 = l7.o.h("dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.onEvent", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.onEvent'.", "");
                }
                l7.o.r(lVarH5, l0Var);
                break;
        }
    }
}
