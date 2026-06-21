package he;

import ad.b1;
import ad.g0;
import ad.j0;
import android.app.usage.UsageStatsManager;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.Task;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import com.yandex.varioqub.config.Varioqub;
import g2.n0;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0095d2;
import io.appmetrica.analytics.impl.C0548v2;
import io.appmetrica.analytics.impl.J5;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.PropagationContext;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.flutter.SentryFlutterReplayRecorder;
import io.sentry.protocol.Mechanism;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.TracingUtils;
import j3.p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import m.s;
import ni.u;
import ni.v;
import org.json.JSONException;
import org.json.JSONObject;
import s3.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements sb.f, ii.c, ii.b, ActivationBarrierCallback, FunctionWithThrowable, ScopeCallback, HintUtils.SentryHintFallback, Scope.IWithPropagationContext, l4.m, m3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20503c;

    public /* synthetic */ e(int i, Object obj) {
        this.f20502b = i;
        this.f20503c = obj;
    }

    public boolean a(a7.l lVar, int i, Bundle bundle) {
        g2.c fVar;
        s sVar = (s) this.f20503c;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i & 1) != 0) {
            try {
                ((i2.h) lVar.f491c).h();
                Parcelable parcelable = (Parcelable) ((i2.h) lVar.f491c).w();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
                return false;
            }
        }
        i2.h hVar = (i2.h) lVar.f491c;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.f()));
        if (i10 >= 31) {
            fVar = new v7.f(clipData, 2);
        } else {
            g2.d dVar = new g2.d();
            dVar.f19846c = clipData;
            dVar.f19847d = 2;
            fVar = dVar;
        }
        fVar.d(hVar.i());
        fVar.setExtras(bundle);
        return n0.g(sVar, fVar.build()) == null;
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        TracingUtils.lambda$startNewTrace$0((IScope) this.f20503c, propagationContext);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* JADX INFO: renamed from: apply */
    public Object mo625apply(Object obj) {
        return C0548v2.a((C0095d2) this.f20503c, (UsageStatsManager) obj);
    }

    @Override // sb.f
    public Task c(Object obj) {
        return b4.s((f) this.f20503c);
    }

    @Override // l4.m
    public b1 d(int i, p0 p0Var, int[] iArr) {
        l4.j jVar = (l4.j) this.f20503c;
        g0 g0VarQ = j0.q();
        for (int i10 = 0; i10 < p0Var.f26351a; i10++) {
            g0VarQ.b(new l4.g(i, p0Var, i10, jVar, iArr[i10]));
        }
        return g0VarQ.g();
    }

    @Override // ii.c
    public void i(Object obj) {
        int i = this.f20502b;
        boolean z5 = false;
        Object obj2 = this.f20503c;
        switch (i) {
            case 1:
                q qVar = (q) obj2;
                if (obj != null) {
                    try {
                        z5 = ((JSONObject) obj).getBoolean(Mechanism.JsonKeys.HANDLED);
                    } catch (JSONException e3) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
                    }
                }
                ((ac.c) qVar.f32631c).h(z5);
                break;
            case 22:
                fj.h hVar = (fj.h) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    hVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        hVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj3 = list.get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        hVar.invoke(new ij.m(h5.s(new ni.p((String) obj3, (String) obj4, (String) list.get(2)))));
                    }
                }
                break;
            case 24:
                u uVar = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    uVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_newInstance'.", "")));
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
                        uVar.invoke(new ij.m(h5.s(new ni.p((String) obj5, (String) obj6, (String) list2.get(2)))));
                    }
                }
                break;
            case 25:
                u uVar2 = (u) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    uVar2.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.Camera.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Camera.pigeon_newInstance'.", "")));
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
                        uVar2.invoke(new ij.m(h5.s(new ni.p((String) obj7, (String) obj8, (String) list3.get(2)))));
                    }
                }
                break;
            case 26:
                v vVar = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    vVar.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.pigeon_newInstance'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        vVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj9 = list4.get(0);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        vVar.invoke(new ij.m(h5.s(new ni.p((String) obj9, (String) obj10, (String) list4.get(2)))));
                    }
                }
                break;
            case 27:
                v vVar2 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    vVar2.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.pigeon_newInstance'.", "")));
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
                        vVar2.invoke(new ij.m(h5.s(new ni.p((String) obj11, (String) obj12, (String) list5.get(2)))));
                    }
                }
                break;
            case 28:
                v vVar3 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    vVar3.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.pigeon_newInstance'.", "")));
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
                        vVar3.invoke(new ij.m(h5.s(new ni.p((String) obj13, (String) obj14, (String) list6.get(2)))));
                    }
                }
                break;
            default:
                v vVar4 = (v) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar19 = ij.m.f21341c;
                    vVar4.invoke(new ij.m(l7.o.h("dev.flutter.pigeon.camera_android_camerax.CameraCharacteristicsKey.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraCharacteristicsKey.pigeon_newInstance'.", "")));
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        ij.k kVar20 = ij.m.f21341c;
                        vVar4.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar21 = ij.m.f21341c;
                        Object obj15 = list7.get(0);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list7.get(1);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        vVar4.invoke(new ij.m(h5.s(new ni.p((String) obj15, (String) obj16, (String) list7.get(2)))));
                    }
                }
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        J5.a((J5) this.f20503c);
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        Object objF;
        switch (this.f20502b) {
            case 4:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f20503c, obj, reply);
                break;
            case 5:
                Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0((Pigeon.AppMetricaLibraryAdapterPigeon) this.f20503c, obj, reply);
                break;
            case 6:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f20503c, obj, reply);
                break;
            case 17:
                v7.f fVar = (v7.f) this.f20503c;
                ArrayList arrayList = new ArrayList();
                jh.d dVar = (jh.d) ((ArrayList) obj).get(0);
                try {
                    Context context = (Context) fVar.f34767c;
                    try {
                        Varioqub.init(ih.c.a(dVar), new AppMetricaAdapter(context), context);
                    } catch (Throwable th2) {
                        Log.e("VarioqubFlutter", "Something went wrong while parsing Varioqub Settings", th2);
                    }
                    arrayList.add(0, null);
                } catch (Throwable th3) {
                    arrayList = a.a.t(th3);
                }
                reply.i(arrayList);
                break;
            default:
                ni.c cVar = (ni.c) this.f20503c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((fj.c) cVar.f29359a.f6853d).a(((Long) obj2).longValue(), new ni.b(cVar));
                    objF = r.c(null);
                    break;
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof ni.p) {
                        ni.p pVar = exception;
                        objF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                    } else {
                        objF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                }
                reply.i(objF);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f20502b) {
            case 9:
                ((SentryGestureListener) this.f20503c).lambda$stopTracing$1(iScope);
                break;
            case 10:
                BufferCaptureStrategy.captureReplay$lambda$1((BufferCaptureStrategy) this.f20503c, iScope);
                break;
            case 11:
                SessionCaptureStrategy.start$lambda$0((SessionCaptureStrategy) this.f20503c, iScope);
                break;
            case 12:
                SentryFlutterReplayRecorder.start$lambda$1$lambda$0((d0) this.f20503c, iScope);
                break;
            default:
                TracingUtils.lambda$setTrace$3((PropagationContext) this.f20503c, iScope);
                break;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        switch (this.f20502b) {
            case 13:
                LogUtils.logNotInstanceOf(cls, obj, (ILogger) this.f20503c);
                break;
            default:
                ((HintUtils.SentryNullableConsumer) this.f20503c).accept(obj);
                break;
        }
    }

    @Override // m3.g
    public void accept(Object obj) {
        switch (this.f20502b) {
            case 19:
                n5.i iVar = (n5.i) this.f20503c;
                n5.a aVar = (n5.a) obj;
                n5.h hVar = new n5.h(aVar.f29102b, l7.b.d(aVar.f29103c, aVar.f29101a));
                iVar.f29116c.add(hVar);
                long j10 = iVar.f29122j;
                if (j10 == -9223372036854775807L || aVar.f29104d >= j10) {
                    iVar.e(hVar);
                }
                break;
            default:
                ((g0) this.f20503c).b((n5.a) obj);
                break;
        }
    }
}
