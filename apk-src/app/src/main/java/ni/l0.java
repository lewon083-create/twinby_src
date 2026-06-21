package ni;

import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Display;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l0 implements ii.c, ii.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29432c;

    public /* synthetic */ l0(int i, Object obj) {
        this.f29431b = i;
        this.f29432c = obj;
    }

    @Override // ii.c
    public void i(Object obj) {
        int i = this.f29431b;
        Object obj2 = this.f29432c;
        switch (i) {
            case 0:
                u uVar = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    uVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraControl.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraControl.pigeon_newInstance'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        uVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj3 = list.get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        uVar.invoke(new ij.m(h5.s(new p((String) obj3, (String) obj4, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                v vVar = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    vVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraInfo.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraInfo.pigeon_newInstance'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar5 = ij.m.f21341c;
                        vVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar6 = ij.m.f21341c;
                        Object obj5 = list2.get(0);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        vVar.invoke(new ij.m(h5.s(new p((String) obj5, (String) obj6, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                u uVar2 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    uVar2.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_newInstance'.", "")));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        ij.k kVar8 = ij.m.f21341c;
                        uVar2.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar9 = ij.m.f21341c;
                        Object obj7 = list3.get(0);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        uVar2.invoke(new ij.m(h5.s(new p((String) obj7, (String) obj8, (String) list3.get(2)))));
                    }
                }
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 27:
            default:
                u uVar3 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    uVar3.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.PlaneProxy.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.PlaneProxy.pigeon_newInstance'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        uVar3.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj9 = list4.get(0);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        uVar3.invoke(new ij.m(h5.s(new p((String) obj9, (String) obj10, (String) list4.get(2)))));
                    }
                }
                break;
            case 4:
                v vVar2 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    vVar2.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraPermissionsError.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraPermissionsError.pigeon_newInstance'.", "")));
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar14 = ij.m.f21341c;
                        vVar2.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar15 = ij.m.f21341c;
                        Object obj11 = list5.get(0);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Object obj12 = list5.get(1);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        vVar2.invoke(new ij.m(h5.s(new p((String) obj11, (String) obj12, (String) list5.get(2)))));
                    }
                }
                break;
            case 5:
                v vVar3 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    vVar3.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_newInstance'.", "")));
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        ij.k kVar17 = ij.m.f21341c;
                        vVar3.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar18 = ij.m.f21341c;
                        Object obj13 = list6.get(0);
                        Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        Object obj14 = list6.get(1);
                        Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        vVar3.invoke(new ij.m(h5.s(new p((String) obj13, (String) obj14, (String) list6.get(2)))));
                    }
                }
                break;
            case 6:
                fj.f fVar = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar19 = ij.m.f21341c;
                    fVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_newInstance'.", "")));
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        ij.k kVar20 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar21 = ij.m.f21341c;
                        Object obj15 = list7.get(0);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list7.get(1);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new p((String) obj15, (String) obj16, (String) list7.get(2)))));
                    }
                }
                break;
            case 8:
                u uVar4 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar22 = ij.m.f21341c;
                    uVar4.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraState.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraState.pigeon_newInstance'.", "")));
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        ij.k kVar23 = ij.m.f21341c;
                        uVar4.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar24 = ij.m.f21341c;
                        Object obj17 = list8.get(0);
                        Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Object obj18 = list8.get(1);
                        Intrinsics.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        uVar4.invoke(new ij.m(h5.s(new p((String) obj17, (String) obj18, (String) list8.get(2)))));
                    }
                }
                break;
            case 9:
                u uVar5 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar25 = ij.m.f21341c;
                    uVar5.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraStateStateError.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraStateStateError.pigeon_newInstance'.", "")));
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        ij.k kVar26 = ij.m.f21341c;
                        uVar5.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar27 = ij.m.f21341c;
                        Object obj19 = list9.get(0);
                        Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        Object obj20 = list9.get(1);
                        Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        uVar5.invoke(new ij.m(h5.s(new p((String) obj19, (String) obj20, (String) list9.get(2)))));
                    }
                }
                break;
            case 10:
                u uVar6 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar28 = ij.m.f21341c;
                    uVar6.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CaptureRequest.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CaptureRequest.pigeon_newInstance'.", "")));
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        ij.k kVar29 = ij.m.f21341c;
                        uVar6.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar30 = ij.m.f21341c;
                        Object obj21 = list10.get(0);
                        Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        Object obj22 = list10.get(1);
                        Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        uVar6.invoke(new ij.m(h5.s(new p((String) obj21, (String) obj22, (String) list10.get(2)))));
                    }
                }
                break;
            case 11:
                u uVar7 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar31 = ij.m.f21341c;
                    uVar7.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CaptureRequestKey.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CaptureRequestKey.pigeon_newInstance'.", "")));
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        ij.k kVar32 = ij.m.f21341c;
                        uVar7.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar33 = ij.m.f21341c;
                        Object obj23 = list11.get(0);
                        Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        Object obj24 = list11.get(1);
                        Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        uVar7.invoke(new ij.m(h5.s(new p((String) obj23, (String) obj24, (String) list11.get(2)))));
                    }
                }
                break;
            case 12:
                v vVar4 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar34 = ij.m.f21341c;
                    vVar4.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_newInstance'.", "")));
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        ij.k kVar35 = ij.m.f21341c;
                        vVar4.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar36 = ij.m.f21341c;
                        Object obj25 = list12.get(0);
                        Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        Object obj26 = list12.get(1);
                        Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        vVar4.invoke(new ij.m(h5.s(new p((String) obj25, (String) obj26, (String) list12.get(2)))));
                    }
                }
                break;
            case 14:
                v vVar5 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar37 = ij.m.f21341c;
                    vVar5.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_newInstance'.", "")));
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        ij.k kVar38 = ij.m.f21341c;
                        vVar5.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar39 = ij.m.f21341c;
                        Object obj27 = list13.get(0);
                        Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        Object obj28 = list13.get(1);
                        Intrinsics.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        vVar5.invoke(new ij.m(h5.s(new p((String) obj27, (String) obj28, (String) list13.get(2)))));
                    }
                }
                break;
            case 16:
                u uVar8 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar40 = ij.m.f21341c;
                    uVar8.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ExposureState.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ExposureState.pigeon_newInstance'.", "")));
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        ij.k kVar41 = ij.m.f21341c;
                        uVar8.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar42 = ij.m.f21341c;
                        Object obj29 = list14.get(0);
                        Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        Object obj30 = list14.get(1);
                        Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        uVar8.invoke(new ij.m(h5.s(new p((String) obj29, (String) obj30, (String) list14.get(2)))));
                    }
                }
                break;
            case 17:
                u uVar9 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar43 = ij.m.f21341c;
                    uVar9.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.pigeon_newInstance'.", "")));
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        ij.k kVar44 = ij.m.f21341c;
                        uVar9.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar45 = ij.m.f21341c;
                        Object obj31 = list15.get(0);
                        Intrinsics.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        Object obj32 = list15.get(1);
                        Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        uVar9.invoke(new ij.m(h5.s(new p((String) obj31, (String) obj32, (String) list15.get(2)))));
                    }
                }
                break;
            case 18:
                u uVar10 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar46 = ij.m.f21341c;
                    uVar10.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.FocusMeteringAction.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.FocusMeteringAction.pigeon_newInstance'.", "")));
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        ij.k kVar47 = ij.m.f21341c;
                        uVar10.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar48 = ij.m.f21341c;
                        Object obj33 = list16.get(0);
                        Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        Object obj34 = list16.get(1);
                        Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        uVar10.invoke(new ij.m(h5.s(new p((String) obj33, (String) obj34, (String) list16.get(2)))));
                    }
                }
                break;
            case 19:
                u uVar11 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar49 = ij.m.f21341c;
                    uVar11.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.pigeon_newInstance'.", "")));
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        ij.k kVar50 = ij.m.f21341c;
                        uVar11.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar51 = ij.m.f21341c;
                        Object obj35 = list17.get(0);
                        Intrinsics.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        Object obj36 = list17.get(1);
                        Intrinsics.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        uVar11.invoke(new ij.m(h5.s(new p((String) obj35, (String) obj36, (String) list17.get(2)))));
                    }
                }
                break;
            case 20:
                u uVar12 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar52 = ij.m.f21341c;
                    uVar12.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.FocusMeteringResult.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.FocusMeteringResult.pigeon_newInstance'.", "")));
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        ij.k kVar53 = ij.m.f21341c;
                        uVar12.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar54 = ij.m.f21341c;
                        Object obj37 = list18.get(0);
                        Intrinsics.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        Object obj38 = list18.get(1);
                        Intrinsics.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        uVar12.invoke(new ij.m(h5.s(new p((String) obj37, (String) obj38, (String) list18.get(2)))));
                    }
                }
                break;
            case 21:
                u uVar13 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar55 = ij.m.f21341c;
                    uVar13.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.pigeon_newInstance'.", "")));
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        ij.k kVar56 = ij.m.f21341c;
                        uVar13.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar57 = ij.m.f21341c;
                        Object obj39 = list19.get(0);
                        Intrinsics.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        Object obj40 = list19.get(1);
                        Intrinsics.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        uVar13.invoke(new ij.m(h5.s(new p((String) obj39, (String) obj40, (String) list19.get(2)))));
                    }
                }
                break;
            case 22:
                u uVar14 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar58 = ij.m.f21341c;
                    uVar14.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ImageCapture.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ImageCapture.pigeon_newInstance'.", "")));
                } else {
                    List list20 = (List) obj;
                    if (list20.size() <= 1) {
                        ij.k kVar59 = ij.m.f21341c;
                        uVar14.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar60 = ij.m.f21341c;
                        Object obj41 = list20.get(0);
                        Intrinsics.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        Object obj42 = list20.get(1);
                        Intrinsics.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        uVar14.invoke(new ij.m(h5.s(new p((String) obj41, (String) obj42, (String) list20.get(2)))));
                    }
                }
                break;
            case 23:
                u uVar15 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar61 = ij.m.f21341c;
                    uVar15.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ImageProxy.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ImageProxy.pigeon_newInstance'.", "")));
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        ij.k kVar62 = ij.m.f21341c;
                        uVar15.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar63 = ij.m.f21341c;
                        Object obj43 = list21.get(0);
                        Intrinsics.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        Object obj44 = list21.get(1);
                        Intrinsics.c(obj44, "null cannot be cast to non-null type kotlin.String");
                        uVar15.invoke(new ij.m(h5.s(new p((String) obj43, (String) obj44, (String) list21.get(2)))));
                    }
                }
                break;
            case 24:
                u uVar16 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar64 = ij.m.f21341c;
                    uVar16.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.LiveData.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.LiveData.pigeon_newInstance'.", "")));
                } else {
                    List list22 = (List) obj;
                    if (list22.size() <= 1) {
                        ij.k kVar65 = ij.m.f21341c;
                        uVar16.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar66 = ij.m.f21341c;
                        Object obj45 = list22.get(0);
                        Intrinsics.c(obj45, "null cannot be cast to non-null type kotlin.String");
                        Object obj46 = list22.get(1);
                        Intrinsics.c(obj46, "null cannot be cast to non-null type kotlin.String");
                        uVar16.invoke(new ij.m(h5.s(new p((String) obj45, (String) obj46, (String) list22.get(2)))));
                    }
                }
                break;
            case 25:
                v vVar6 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar67 = ij.m.f21341c;
                    vVar6.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.MeteringPoint.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.MeteringPoint.pigeon_newInstance'.", "")));
                } else {
                    List list23 = (List) obj;
                    if (list23.size() <= 1) {
                        ij.k kVar68 = ij.m.f21341c;
                        vVar6.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar69 = ij.m.f21341c;
                        Object obj47 = list23.get(0);
                        Intrinsics.c(obj47, "null cannot be cast to non-null type kotlin.String");
                        Object obj48 = list23.get(1);
                        Intrinsics.c(obj48, "null cannot be cast to non-null type kotlin.String");
                        vVar6.invoke(new ij.m(h5.s(new p((String) obj47, (String) obj48, (String) list23.get(2)))));
                    }
                }
                break;
            case 26:
                v vVar7 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar70 = ij.m.f21341c;
                    vVar7.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.pigeon_newInstance'.", "")));
                } else {
                    List list24 = (List) obj;
                    if (list24.size() <= 1) {
                        ij.k kVar71 = ij.m.f21341c;
                        vVar7.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar72 = ij.m.f21341c;
                        Object obj49 = list24.get(0);
                        Intrinsics.c(obj49, "null cannot be cast to non-null type kotlin.String");
                        Object obj50 = list24.get(1);
                        Intrinsics.c(obj50, "null cannot be cast to non-null type kotlin.String");
                        vVar7.invoke(new ij.m(h5.s(new p((String) obj49, (String) obj50, (String) list24.get(2)))));
                    }
                }
                break;
            case 28:
                u uVar17 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar73 = ij.m.f21341c;
                    uVar17.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.PendingRecording.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.PendingRecording.pigeon_newInstance'.", "")));
                } else {
                    List list25 = (List) obj;
                    if (list25.size() <= 1) {
                        ij.k kVar74 = ij.m.f21341c;
                        uVar17.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar75 = ij.m.f21341c;
                        Object obj51 = list25.get(0);
                        Intrinsics.c(obj51, "null cannot be cast to non-null type kotlin.String");
                        Object obj52 = list25.get(1);
                        Intrinsics.c(obj52, "null cannot be cast to non-null type kotlin.String");
                        uVar17.invoke(new ij.m(h5.s(new p((String) obj51, (String) obj52, (String) list25.get(2)))));
                    }
                }
                break;
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        List listF3;
        List listF4;
        fj.c cVar;
        Display displayB;
        List listF5;
        switch (this.f29431b) {
            case 3:
                c cVar2 = (c) this.f29432c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue2 = ((Long) obj3).longValue();
                Object obj4 = list.get(2);
                Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((fj.c) cVar2.f29359a.f6853d).a(jLongValue, new Range(Integer.valueOf((int) jLongValue2), Integer.valueOf((int) ((Long) obj4).longValue())));
                    listF = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof p) {
                        p pVar = exception;
                        listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                    } else {
                        listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                }
                reply.i(listF);
                return;
            case 7:
                m mVar = (m) this.f29432c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue3 = ((Long) obj5).longValue();
                Object obj6 = list2.get(1);
                Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue4 = ((Long) obj6).longValue();
                Object obj7 = list2.get(2);
                Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((fj.c) mVar.f29437a.f6853d).a(jLongValue3, new Size((int) jLongValue4, (int) ((Long) obj7).longValue()));
                    listF2 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof p) {
                        p pVar2 = exception2;
                        listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                    } else {
                        listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                }
                reply.i(listF2);
                return;
            case 13:
                m mVar2 = (m) this.f29432c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj8 = list3.get(0);
                Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue5 = ((Long) obj8).longValue();
                Object obj9 = list3.get(1);
                Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<android.hardware.camera2.CaptureRequest.Key<*>, kotlin.Any?>");
                try {
                    ((fj.c) mVar2.f29437a.f6853d).a(jLongValue5, m.c((Map) obj9));
                    listF3 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof p) {
                        p pVar3 = exception3;
                        listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                    } else {
                        listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                    }
                }
                reply.i(listF3);
                return;
            case 15:
                f fVar = (f) this.f29432c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list4 = (List) obj;
                Object obj10 = list4.get(0);
                Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue6 = ((Long) obj10).longValue();
                Object obj11 = list4.get(1);
                Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                g0.d0 d0Var = (g0.d0) obj11;
                Object obj12 = list4.get(2);
                Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.Double");
                double dDoubleValue = ((Double) obj12).doubleValue();
                Object obj13 = list4.get(3);
                Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Double");
                double dDoubleValue2 = ((Double) obj13).doubleValue();
                try {
                    ji0 ji0Var = fVar.f29389a;
                    cVar = (fj.c) ji0Var.f6853d;
                    displayB = ji0Var.b();
                } catch (Throwable exception4) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof p) {
                        p pVar4 = exception4;
                        listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                    } else {
                        listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                    }
                }
                if (displayB == null) {
                    throw new IllegalStateException("A Display could not be retrieved.");
                }
                cVar.a(jLongValue6, new a0.h0(displayB, d0Var, (float) dDoubleValue, (float) dDoubleValue2));
                listF4 = kotlin.collections.r.c(null);
                reply.i(listF4);
                return;
            default:
                c cVar3 = (c) this.f29432c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((fj.c) cVar3.f29359a.f6853d).a(((Long) obj14).longValue(), new f0(0, cVar3));
                    listF5 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception5) {
                    Intrinsics.checkNotNullParameter(exception5, "exception");
                    if (exception5 instanceof p) {
                        p pVar5 = exception5;
                        listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                    } else {
                        listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                    }
                }
                reply.i(listF5);
                return;
        }
    }
}
