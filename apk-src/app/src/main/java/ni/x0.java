package ni;

import android.util.Log;
import android.util.Size;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x0 implements ii.c, ii.b, OnCompleteListener, j1.i, m3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29501c;

    public /* synthetic */ x0(int i, Object obj) {
        this.f29500b = i;
        this.f29501c = obj;
    }

    public void a(j jVar) {
        l1.c(jVar, (fj.z) ((x0) this.f29501c).f29501c);
    }

    @Override // ii.c
    public void i(Object obj) {
        int i = this.f29500b;
        Object obj2 = this.f29501c;
        switch (i) {
            case 0:
                v vVar = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    vVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.Preview.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Preview.pigeon_newInstance'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        vVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj3 = list.get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        vVar.invoke(new ij.m(h5.s(new p((String) obj3, (String) obj4, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                u uVar = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    uVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.pigeon_newInstance'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar5 = ij.m.f21341c;
                        uVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar6 = ij.m.f21341c;
                        Object obj5 = list2.get(0);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        uVar.invoke(new ij.m(h5.s(new p((String) obj5, (String) obj6, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                u uVar2 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    uVar2.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.QualitySelector.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.QualitySelector.pigeon_newInstance'.", "")));
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
                v vVar2 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    vVar2.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.Recorder.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Recorder.pigeon_newInstance'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        vVar2.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj9 = list4.get(0);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        vVar2.invoke(new ij.m(h5.s(new p((String) obj9, (String) obj10, (String) list4.get(2)))));
                    }
                }
                break;
            case 4:
                u uVar3 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    uVar3.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.Recording.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Recording.pigeon_newInstance'.", "")));
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar14 = ij.m.f21341c;
                        uVar3.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar15 = ij.m.f21341c;
                        Object obj11 = list5.get(0);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Object obj12 = list5.get(1);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        uVar3.invoke(new ij.m(h5.s(new p((String) obj11, (String) obj12, (String) list5.get(2)))));
                    }
                }
                break;
            case 5:
                v vVar3 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    vVar3.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.pigeon_newInstance'.", "")));
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
            case 9:
            case 16:
            default:
                u uVar4 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar19 = ij.m.f21341c;
                    uVar4.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ZoomState.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ZoomState.pigeon_newInstance'.", "")));
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        ij.k kVar20 = ij.m.f21341c;
                        uVar4.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar21 = ij.m.f21341c;
                        Object obj15 = list7.get(0);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list7.get(1);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        uVar4.invoke(new ij.m(h5.s(new p((String) obj15, (String) obj16, (String) list7.get(2)))));
                    }
                }
                break;
            case 7:
                u uVar5 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar22 = ij.m.f21341c;
                    uVar5.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ResolutionInfo.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ResolutionInfo.pigeon_newInstance'.", "")));
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        ij.k kVar23 = ij.m.f21341c;
                        uVar5.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar24 = ij.m.f21341c;
                        Object obj17 = list8.get(0);
                        Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Object obj18 = list8.get(1);
                        Intrinsics.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        uVar5.invoke(new ij.m(h5.s(new p((String) obj17, (String) obj18, (String) list8.get(2)))));
                    }
                }
                break;
            case 8:
                u uVar6 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar25 = ij.m.f21341c;
                    uVar6.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_newInstance'.", "")));
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        ij.k kVar26 = ij.m.f21341c;
                        uVar6.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar27 = ij.m.f21341c;
                        Object obj19 = list9.get(0);
                        Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        Object obj20 = list9.get(1);
                        Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        uVar6.invoke(new ij.m(h5.s(new p((String) obj19, (String) obj20, (String) list9.get(2)))));
                    }
                }
                break;
            case 10:
                u uVar7 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar28 = ij.m.f21341c;
                    uVar7.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.pigeon_newInstance'.", "")));
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        ij.k kVar29 = ij.m.f21341c;
                        uVar7.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar30 = ij.m.f21341c;
                        Object obj21 = list10.get(0);
                        Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        Object obj22 = list10.get(1);
                        Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        uVar7.invoke(new ij.m(h5.s(new p((String) obj21, (String) obj22, (String) list10.get(2)))));
                    }
                }
                break;
            case 11:
                u uVar8 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar31 = ij.m.f21341c;
                    uVar8.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.UseCase.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.UseCase.pigeon_newInstance'.", "")));
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        ij.k kVar32 = ij.m.f21341c;
                        uVar8.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar33 = ij.m.f21341c;
                        Object obj23 = list11.get(0);
                        Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        Object obj24 = list11.get(1);
                        Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        uVar8.invoke(new ij.m(h5.s(new p((String) obj23, (String) obj24, (String) list11.get(2)))));
                    }
                }
                break;
            case 12:
                v vVar4 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar34 = ij.m.f21341c;
                    vVar4.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.VideoCapture.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoCapture.pigeon_newInstance'.", "")));
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
            case 13:
                v vVar5 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar37 = ij.m.f21341c;
                    vVar5.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.VideoOutput.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoOutput.pigeon_newInstance'.", "")));
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
            case 14:
                v vVar6 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar40 = ij.m.f21341c;
                    vVar6.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.VideoRecordEvent.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEvent.pigeon_newInstance'.", "")));
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        ij.k kVar41 = ij.m.f21341c;
                        vVar6.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar42 = ij.m.f21341c;
                        Object obj29 = list14.get(0);
                        Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        Object obj30 = list14.get(1);
                        Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        vVar6.invoke(new ij.m(h5.s(new p((String) obj29, (String) obj30, (String) list14.get(2)))));
                    }
                }
                break;
            case 15:
                v vVar7 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar43 = ij.m.f21341c;
                    vVar7.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.VideoRecordEventFinalize.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEventFinalize.pigeon_newInstance'.", "")));
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        ij.k kVar44 = ij.m.f21341c;
                        vVar7.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar45 = ij.m.f21341c;
                        Object obj31 = list15.get(0);
                        Intrinsics.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        Object obj32 = list15.get(1);
                        Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        vVar7.invoke(new ij.m(h5.s(new p((String) obj31, (String) obj32, (String) list15.get(2)))));
                    }
                }
                break;
            case 17:
                u uVar9 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar46 = ij.m.f21341c;
                    uVar9.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.VideoRecordEventStart.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEventStart.pigeon_newInstance'.", "")));
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        ij.k kVar47 = ij.m.f21341c;
                        uVar9.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar48 = ij.m.f21341c;
                        Object obj33 = list16.get(0);
                        Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        Object obj34 = list16.get(1);
                        Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        uVar9.invoke(new ij.m(h5.s(new p((String) obj33, (String) obj34, (String) list16.get(2)))));
                    }
                }
                break;
        }
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f29500b) {
            case 27:
                ((j3.h0) obj).r((j3.z) this.f29501c);
                break;
            case 28:
                ((j3.h0) obj).e((j3.d) this.f29501c);
                break;
            default:
                ((j3.h0) obj).i((l3.c) this.f29501c);
                break;
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        switch (this.f29500b) {
            case 24:
                q0.l lVar = (q0.l) this.f29501c;
                lVar.f31591p = hVar;
                return "SettableFuture hashCode: " + lVar.hashCode();
            default:
                ((q0.n) this.f29501c).f31618m = hVar;
                return "SurfaceOutputImpl close future complete";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f29500b;
        jh.b bVar = (jh.b) this.f29501c;
        switch (i) {
            case 22:
                HashMap map = pi.d.f31479d;
                if (!task.isSuccessful()) {
                    bVar.a(task.getException());
                } else {
                    bVar.d();
                }
                break;
            default:
                HashMap map2 = pi.d.f31479d;
                if (!task.isSuccessful()) {
                    bVar.a(task.getException());
                } else {
                    bVar.e(task.getResult());
                }
                break;
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        List listF3;
        switch (this.f29500b) {
            case 6:
                g gVar = (g) this.f29501c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                Intrinsics.c(obj3, "null cannot be cast to non-null type android.util.Size");
                try {
                    ((fj.c) gVar.f29394a.f6853d).a(jLongValue, new j1((Size) obj3));
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
                break;
            case 9:
                c cVar = (c) this.f29501c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue2 = ((Long) obj4).longValue();
                j1 j1Var = (j1) list2.get(1);
                t0.c cVar2 = (t0.c) list2.get(2);
                t0.a aVar = (t0.a) list2.get(3);
                try {
                    fj.c cVar3 = (fj.c) cVar.f29359a.f6853d;
                    t0.a aVar2 = t0.a.f33331c;
                    if (aVar == null) {
                        aVar = aVar2;
                    }
                    if (cVar2 == null) {
                        cVar2 = null;
                    }
                    if (j1Var == null) {
                        j1Var = null;
                    }
                    cVar3.a(jLongValue2, new t0.b(aVar, cVar2, j1Var));
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
                break;
            default:
                c cVar4 = (c) this.f29501c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((fj.c) cVar4.f29359a.f6853d).a(((Long) obj5).longValue(), new o1(cVar4));
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
                break;
        }
    }
}
