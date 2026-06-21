package oi;

import a0.i1;
import a0.y;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.google.firebase.messaging.u;
import fj.z;
import ii.m;
import ij.k;
import ij.p;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.sentry.android.core.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f30674a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f30675b = ij.h.b(new aj.e(7));

    public static m a() {
        return (m) f30675b.getValue();
    }

    public static void b(c cVar, ii.f binaryMessenger, final j jVar) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent", strConcat), a(), obj);
        if (jVar != null) {
            final int i = 3;
            gVar.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i10 = i;
                    int i11 = 27;
                    int i12 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    int i15 = 0;
                    d dVar = jVar;
                    switch (i10) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar2 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar2));
                            sb.m mVar = gVar2.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar3 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar3, jVar3, i14));
                            sb.m mVar2 = gVar3.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i11, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar4 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar4, jVar4, i15));
                            sb.m mVar3 = gVar4.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar5 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar5, i12));
                            sb.m mVar4 = gVar5.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i14, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar6 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar6, i11));
                            sb.m mVar5 = gVar6.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar7 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar7, 12));
                            sb.m mVar6 = gVar7.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i13, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i12, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i15, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i13);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i14));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId", strConcat), a(), obj);
        if (jVar != null) {
            final int i10 = 6;
            gVar2.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i10;
                    int i11 = 27;
                    int i12 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    int i15 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar3 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar3, jVar3, i14));
                            sb.m mVar2 = gVar3.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i11, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar4 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar4, jVar4, i15));
                            sb.m mVar3 = gVar4.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar5 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar5, i12));
                            sb.m mVar4 = gVar5.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i14, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar6 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar6, i11));
                            sb.m mVar5 = gVar6.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar7 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar7, 12));
                            sb.m mVar6 = gVar7.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i13, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i12, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i15, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i13);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i14));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty", strConcat), a(), obj);
        if (jVar != null) {
            final int i11 = 7;
            gVar3.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i11;
                    int i112 = 27;
                    int i12 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    int i15 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i14));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar4 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar4, jVar4, i15));
                            sb.m mVar3 = gVar4.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar5 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar5, i12));
                            sb.m mVar4 = gVar5.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i14, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar6 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar6, i112));
                            sb.m mVar5 = gVar6.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar7 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar7, 12));
                            sb.m mVar6 = gVar7.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i13, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i12, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i15, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i13);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i14));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled", strConcat), a(), obj);
        if (jVar != null) {
            final int i12 = 8;
            gVar4.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i12;
                    int i112 = 27;
                    int i122 = 2;
                    int i13 = 22;
                    int i14 = 1;
                    int i15 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i14));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i15));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar5 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar5, i122));
                            sb.m mVar4 = gVar5.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i14, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar6 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar6, i112));
                            sb.m mVar5 = gVar6.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar7 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar7, 12));
                            sb.m mVar6 = gVar7.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i13, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i15, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i13);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i14));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData", strConcat), a(), obj);
        if (jVar != null) {
            final int i13 = 9;
            gVar5.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i13;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i14 = 1;
                    int i15 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i14));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i15));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i14, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar6 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar6, i112));
                            sb.m mVar5 = gVar6.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar7 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar7, 12));
                            sb.m mVar6 = gVar7.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i15, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i14));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration", strConcat), a(), obj);
        if (jVar != null) {
            final int i14 = 10;
            gVar6.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i14;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i15 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i15));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar7 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar7, 12));
                            sb.m mVar6 = gVar7.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i15, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i142));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent", strConcat), a(), obj);
        if (jVar != null) {
            final int i15 = 11;
            gVar7.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i15;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i152 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i152));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar72 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar72, 12));
                            sb.m mVar6 = gVar72.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar8 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar8, zBooleanValue));
                            sb.m mVar7 = gVar8.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i152, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i142));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters", strConcat), a(), obj);
        if (jVar != null) {
            final int i16 = 0;
            gVar8.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i16;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i152 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i152));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar72 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar72, 12));
                            sb.m mVar6 = gVar72.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar82 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar82, zBooleanValue));
                            sb.m mVar7 = gVar82.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar9 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar9));
                            sb.m mVar8 = gVar9.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i152, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i142));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId", strConcat), a(), obj);
        if (jVar != null) {
            final int i17 = 1;
            gVar9.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i17;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i152 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i152));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar72 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar72, 12));
                            sb.m mVar6 = gVar72.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar82 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar82, zBooleanValue));
                            sb.m mVar7 = gVar82.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar92 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar92));
                            sb.m mVar8 = gVar92.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i152, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar10 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar10, 3));
                            sb.m mVar9 = gVar10.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i142));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar9.L(null);
        }
        s7.g gVar10 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId", strConcat), a(), obj);
        if (jVar != null) {
            final int i18 = 2;
            gVar10.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i18;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i152 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i152));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar72 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar72, 12));
                            sb.m mVar6 = gVar72.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar82 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar82, zBooleanValue));
                            sb.m mVar7 = gVar82.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar92 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar92));
                            sb.m mVar8 = gVar92.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i152, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar102 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar102, 3));
                            sb.m mVar9 = gVar102.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar11 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar11, i142));
                            sb.m mVar10 = gVar11.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar10.L(null);
        }
        s7.g gVar11 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement", strConcat), a(), obj);
        if (jVar != null) {
            final int i19 = 4;
            gVar11.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i19;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i152 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i152));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar72 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar72, 12));
                            sb.m mVar6 = gVar72.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar82 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar82, zBooleanValue));
                            sb.m mVar7 = gVar82.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar92 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar92));
                            sb.m mVar8 = gVar92.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i152, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar102 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar102, 3));
                            sb.m mVar9 = gVar102.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar112 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar112, i142));
                            sb.m mVar10 = gVar112.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        } else {
            gVar11.L(null);
        }
        s7.g gVar12 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logTransaction", strConcat), a(), obj);
        if (jVar == null) {
            gVar12.L(null);
        } else {
            final int i20 = 5;
            gVar12.L(new ii.b() { // from class: oi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    int i102 = i20;
                    int i112 = 27;
                    int i122 = 2;
                    int i132 = 22;
                    int i142 = 1;
                    int i152 = 0;
                    d dVar = jVar;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Map map = (Map) ((List) obj2).get(0);
                            z callback = new z(reply, 14);
                            j jVar2 = (j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(jVar2, map, gVar22));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new y(29, jVar2, callback));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback2 = new z(reply, 20);
                            j jVar3 = (j) dVar;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            sb.g gVar32 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar32, jVar3, i142));
                            sb.m mVar2 = gVar32.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "getTask(...)");
                            mVar2.addOnCompleteListener(new y(i112, jVar3, callback2));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback3 = new z(reply, 11);
                            j jVar4 = (j) dVar;
                            jVar4.getClass();
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            sb.g gVar42 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar42, jVar4, i152));
                            sb.m mVar3 = gVar42.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "getTask(...)");
                            mVar3.addOnCompleteListener(new y(24, jVar4, callback3));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map event = (Map) obj3;
                            z callback4 = new z(reply, 16);
                            j jVar5 = (j) dVar;
                            jVar5.getClass();
                            Intrinsics.checkNotNullParameter(event, "event");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            sb.g gVar52 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(event, jVar5, gVar52, i122));
                            sb.m mVar4 = gVar52.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar4, "getTask(...)");
                            mVar4.addOnCompleteListener(new i(i142, jVar5, callback4));
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
                            Map arguments = (Map) obj4;
                            z callback5 = new z(reply, 12);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(arguments, "arguments");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            k kVar = ij.m.f21341c;
                            callback5.invoke(new ij.m(h5.s(new e("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS."))));
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String transactionId = (String) obj5;
                            z callback6 = new z(reply, 21);
                            ((j) dVar).getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            k kVar2 = ij.m.f21341c;
                            callback6.invoke(new ij.m(h5.s(new e("unimplemented", "logTransaction is only available on iOS."))));
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            String str = (String) ((List) obj2).get(0);
                            z callback7 = new z(reply, 19);
                            j jVar6 = (j) dVar;
                            jVar6.getClass();
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            sb.g gVar62 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new a1.c(jVar6, str, gVar62, i112));
                            sb.m mVar5 = gVar62.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "getTask(...)");
                            mVar5.addOnCompleteListener(new y(25, jVar6, callback7));
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String name = (String) obj6;
                            String str2 = (String) list.get(1);
                            z callback8 = new z(reply, 17);
                            j jVar7 = (j) dVar;
                            jVar7.getClass();
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            sb.g gVar72 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(jVar7, name, str2, gVar72, 12));
                            sb.m mVar6 = gVar72.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar6, "getTask(...)");
                            mVar6.addOnCompleteListener(new y(i132, jVar7, callback8));
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            z callback9 = new z(reply, 15);
                            j jVar8 = (j) dVar;
                            jVar8.getClass();
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            sb.g gVar82 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new u(i122, jVar8, gVar82, zBooleanValue));
                            sb.m mVar7 = gVar82.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar7, "getTask(...)");
                            mVar7.addOnCompleteListener(new y(23, jVar8, callback9));
                            break;
                        case 9:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            z callback10 = new z(reply, 13);
                            j jVar9 = (j) dVar;
                            jVar9.getClass();
                            Intrinsics.checkNotNullParameter(callback10, "callback");
                            sb.g gVar92 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new g(jVar9, gVar92));
                            sb.m mVar8 = gVar92.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar8, "getTask(...)");
                            mVar8.addOnCompleteListener(new i(i152, jVar9, callback10));
                            break;
                        case 10:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            z callback11 = new z(reply, i132);
                            j jVar10 = (j) dVar;
                            jVar10.getClass();
                            Intrinsics.checkNotNullParameter(callback11, "callback");
                            sb.g gVar102 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new n(jVar10, jLongValue, gVar102, 3));
                            sb.m mVar9 = gVar102.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar9, "getTask(...)");
                            mVar9.addOnCompleteListener(new y(26, jVar10, callback11));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
                            Map consent = (Map) obj9;
                            z callback12 = new z(reply, 18);
                            j jVar11 = (j) dVar;
                            jVar11.getClass();
                            Intrinsics.checkNotNullParameter(consent, "consent");
                            Intrinsics.checkNotNullParameter(callback12, "callback");
                            sb.g gVar112 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new h(consent, jVar11, gVar112, i142));
                            sb.m mVar10 = gVar112.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar10, "getTask(...)");
                            mVar10.addOnCompleteListener(new y(28, jVar11, callback12));
                            break;
                    }
                }
            });
        }
    }
}
