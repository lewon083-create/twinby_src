package qi;

import android.util.Log;
import com.google.android.gms.internal.ads.dz1;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.o;
import fj.b0;
import fj.k0;
import fj.z;
import ii.m;
import ij.k;
import ij.p;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import oi.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f32119a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f32120b = ij.h.b(new aj.e(9));

    public static m a() {
        return (m) f32120b.getValue();
    }

    public static void b(c cVar, ii.f binaryMessenger, final f fVar) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.fetch", strConcat), a(), obj);
        if (fVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i10 = i;
                    int i11 = 28;
                    int i12 = 5;
                    int i13 = 6;
                    int i14 = 1;
                    int i15 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i10) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i14);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i15, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i11);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i14, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i12, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i14, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i11, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar2 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar2, i14));
                            sb.m mVar = gVar2.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i13, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.fetchAndActivate", strConcat), a(), obj);
        if (fVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i10;
                    int i11 = 28;
                    int i12 = 5;
                    int i13 = 6;
                    int i14 = 1;
                    int i15 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i14);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i15, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i11);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i14, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i12, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i14, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i11, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i14));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i13, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.activate", strConcat), a(), obj);
        if (fVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i11;
                    int i112 = 28;
                    int i12 = 5;
                    int i13 = 6;
                    int i14 = 1;
                    int i15 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i14);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i15, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i14, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i12, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i14, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i14));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i13, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setConfigSettings", strConcat), a(), obj);
        if (fVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i12;
                    int i112 = 28;
                    int i122 = 5;
                    int i13 = 6;
                    int i14 = 1;
                    int i15 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i14);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i15, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i14, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i122, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i14, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i14));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i13, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setDefaults", strConcat), a(), obj);
        if (fVar != null) {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i13;
                    int i112 = 28;
                    int i122 = 5;
                    int i132 = 6;
                    int i14 = 1;
                    int i15 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i14);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i15, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i14, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i122, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i14, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i14));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i132, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.ensureInitialized", strConcat), a(), obj);
        if (fVar != null) {
            final int i14 = 5;
            gVar6.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i14;
                    int i112 = 28;
                    int i122 = 5;
                    int i132 = 6;
                    int i142 = 1;
                    int i15 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i142);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i15, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i142, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i122, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i142, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i142));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i132, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.setCustomSignals", strConcat), a(), obj);
        if (fVar != null) {
            final int i15 = 6;
            gVar7.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i15;
                    int i112 = 28;
                    int i122 = 5;
                    int i132 = 6;
                    int i142 = 1;
                    int i152 = 4;
                    d dVar = fVar;
                    int i16 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i142);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i152, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i142, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i122, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i142, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i16);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i142));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i132, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.getAll", strConcat), a(), obj);
        if (fVar != null) {
            final int i16 = 7;
            gVar8.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i16;
                    int i112 = 28;
                    int i122 = 5;
                    int i132 = 6;
                    int i142 = 1;
                    int i152 = 4;
                    d dVar = fVar;
                    int i162 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i142);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i152, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i142, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i122, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i142, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i162);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i142));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i132, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.firebase_remote_config_platform_interface.FirebaseRemoteConfigHostApi.getProperties", strConcat), a(), obj);
        if (fVar == null) {
            gVar9.L(null);
        } else {
            final int i17 = 8;
            gVar9.L(new ii.b() { // from class: qi.b
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    Task taskS;
                    int i102 = i17;
                    int i112 = 28;
                    int i122 = 5;
                    int i132 = 6;
                    int i142 = 1;
                    int i152 = 4;
                    d dVar = fVar;
                    int i162 = 0;
                    switch (i102) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String appName = (String) obj3;
                            a callback = new a(reply, i142);
                            f fVar2 = (f) dVar;
                            fVar2.getClass();
                            Intrinsics.checkNotNullParameter(appName, "appName");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            f.b(appName).a().addOnCompleteListener(new i(i152, callback, fVar2));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String appName2 = (String) obj4;
                            z callback2 = new z(reply, 25);
                            f fVar3 = (f) dVar;
                            fVar3.getClass();
                            Intrinsics.checkNotNullParameter(appName2, "appName");
                            Intrinsics.checkNotNullParameter(callback2, "callback");
                            ge.e eVarB = f.b(appName2);
                            eVarB.a().j(eVarB.f20124b, new ge.d(eVarB)).addOnCompleteListener(new i(7, callback2, fVar3));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String appName3 = (String) obj5;
                            z callback3 = new z(reply, 23);
                            f fVar4 = (f) dVar;
                            fVar4.getClass();
                            Intrinsics.checkNotNullParameter(appName3, "appName");
                            Intrinsics.checkNotNullParameter(callback3, "callback");
                            ge.e eVarB2 = f.b(appName3);
                            Task taskB = eVarB2.f20125c.b();
                            Task taskB2 = eVarB2.f20126d.b();
                            b4.L(taskB, taskB2).f(eVarB2.f20124b, new o(eVarB2, taskB, taskB2, 7)).addOnCompleteListener(new i(10, callback3, fVar4));
                            return;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj6 = list.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String appName4 = (String) obj6;
                            Object obj7 = list.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.firebase.firebaseremoteconfig.RemoteConfigPigeonSettings");
                            h settings = (h) obj7;
                            z callback4 = new z(reply, i112);
                            f fVar5 = (f) dVar;
                            fVar5.getClass();
                            Intrinsics.checkNotNullParameter(appName4, "appName");
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            Intrinsics.checkNotNullParameter(callback4, "callback");
                            u0 u0Var = new u0();
                            long j10 = settings.f32130a;
                            if (j10 < 0) {
                                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                            }
                            u0Var.f10771b = j10;
                            u0Var.a(settings.f32131b);
                            u0 u0Var2 = new u0(u0Var);
                            Intrinsics.checkNotNullExpressionValue(u0Var2, "build(...)");
                            ge.e eVarB3 = f.b(appName4);
                            b4.d(new com.google.firebase.messaging.g(i142, eVarB3, u0Var2), eVarB3.f20124b).addOnCompleteListener(new i(i122, callback4, fVar5));
                            return;
                        case 4:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String appName5 = (String) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map defaultParameters = (Map) obj9;
                            z callback5 = new z(reply, 24);
                            f fVar6 = (f) dVar;
                            fVar6.getClass();
                            Intrinsics.checkNotNullParameter(appName5, "appName");
                            Intrinsics.checkNotNullParameter(defaultParameters, "defaultParameters");
                            Intrinsics.checkNotNullParameter(callback5, "callback");
                            ge.e eVarB4 = f.b(appName5);
                            eVarB4.getClass();
                            HashMap map = new HashMap();
                            for (Map.Entry entry : defaultParameters.entrySet()) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    map.put((String) entry.getKey(), new String((byte[]) value));
                                } else {
                                    map.put((String) entry.getKey(), value.toString());
                                }
                            }
                            try {
                                dz1 dz1VarC = he.d.c();
                                dz1VarC.f4768b = new JSONObject(map);
                                taskS = eVarB4.f20127e.d(dz1VarC.a()).j(nd.i.f29319b, new k0(12));
                            } catch (JSONException e3) {
                                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                                taskS = b4.s(null);
                            }
                            taskS.addOnCompleteListener(new i(9, callback5, fVar6));
                            return;
                        case 5:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String appName6 = (String) obj10;
                            z callback6 = new z(reply, 27);
                            f fVar7 = (f) dVar;
                            fVar7.getClass();
                            Intrinsics.checkNotNullParameter(appName6, "appName");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            ge.e eVarB5 = f.b(appName6);
                            Task taskB3 = eVarB5.f20126d.b();
                            Task taskB4 = eVarB5.f20127e.b();
                            Task taskB5 = eVarB5.f20125c.b();
                            Executor executor = eVarB5.f20124b;
                            sb.m mVarD = b4.d(new a7.h(i142, eVarB5), executor);
                            zd.c cVar2 = (zd.c) eVarB5.i;
                            b4.L(taskB3, taskB4, taskB5, mVarD, cVar2.c(), cVar2.d()).e(executor, new b0(i112, mVarD)).addOnCompleteListener(new i(8, callback6, fVar7));
                            return;
                        case 6:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String appName7 = (String) obj11;
                            Object obj12 = list3.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            Map customSignals = (Map) obj12;
                            a callback7 = new a(reply, i162);
                            f fVar8 = (f) dVar;
                            fVar8.getClass();
                            Intrinsics.checkNotNullParameter(appName7, "appName");
                            Intrinsics.checkNotNullParameter(customSignals, "customSignals");
                            Intrinsics.checkNotNullParameter(callback7, "callback");
                            ge.e eVarB6 = f.b(appName7);
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new q0.o(customSignals, eVarB6, gVar22, i142));
                            sb.m mVar = gVar22.f32858a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
                            mVar.addOnCompleteListener(new i(i132, callback7, fVar8));
                            return;
                        case 7:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj13 = ((List) obj2).get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String appName8 = (String) obj13;
                            z callback8 = new z(reply, 29);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName8, "appName");
                            Intrinsics.checkNotNullParameter(callback8, "callback");
                            ge.e eVarB7 = f.b(appName8);
                            k kVar = ij.m.f21341c;
                            HashMap mapB = eVarB7.b();
                            Intrinsics.checkNotNullExpressionValue(mapB, "getAll(...)");
                            callback8.invoke(new ij.m(f.d(mapB)));
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj14 = ((List) obj2).get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String appName9 = (String) obj14;
                            z callback9 = new z(reply, 26);
                            ((f) dVar).getClass();
                            Intrinsics.checkNotNullParameter(appName9, "appName");
                            Intrinsics.checkNotNullParameter(callback9, "callback");
                            callback9.invoke(new ij.m(f.a(f.b(appName9))));
                            return;
                    }
                }
            });
        }
    }
}
