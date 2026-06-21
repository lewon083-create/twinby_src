package aj;

import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import io.sentry.SentryEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f955a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ij.p f956b = ij.h.b(new e(0));

    public static ii.m a() {
        return (ii.m) f956b.getValue();
    }

    public static void b(ii.f binaryMessenger, final g gVar, String messageChannelSuffix) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
        String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
        t0 t0VarA = binaryMessenger.a();
        s7.g gVar2 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i = 7;
            gVar2.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i) {
                        case 0:
                            g gVar3 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar3.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar4.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar5.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar6.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar7.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar8.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i10 = 13;
            gVar3.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i10) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar4.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar5.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar6.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar7.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar8.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i11 = 14;
            gVar4.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i11) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar5.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar6.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar7.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar8.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i12 = 0;
            gVar5.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i12) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar6.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar7.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar8.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i13 = 1;
            gVar6.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i13) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar7.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar8.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i14 = 2;
            gVar7.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i14) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar8.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i15 = 3;
            gVar8.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i15) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar9 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar9.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i16 = 4;
            gVar9.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i16) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar10 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar10.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar9.L(null);
        }
        s7.g gVar10 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i17 = 5;
            gVar10.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i17) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar11 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar11.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar10.L(null);
        }
        s7.g gVar11 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i18 = 6;
            gVar11.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i18) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar112 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar112.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar12 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar12.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar11.L(null);
        }
        s7.g gVar12 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i19 = 8;
            gVar12.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i19) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar112 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar112.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar122 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar122.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar13 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar13.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar12.L(null);
        }
        s7.g gVar13 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i20 = 9;
            gVar13.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i20) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar112 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar112.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar122 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar122.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar132 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar132.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar14 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar14.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar13.L(null);
        }
        s7.g gVar14 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i21 = 10;
            gVar14.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i21) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar112 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar112.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar122 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar122.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar132 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar132.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar142 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar142.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar15 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar15.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar14.L(null);
        }
        s7.g gVar15 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), t0VarA);
        if (gVar != null) {
            final int i22 = 11;
            gVar15.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i22) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar112 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar112.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar122 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar122.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar132 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar132.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar142 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar142.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar152 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar152.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar16 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar16.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        } else {
            gVar15.L(null);
        }
        s7.g gVar16 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), t0VarA);
        if (gVar == null) {
            gVar16.L(null);
        } else {
            final int i23 = 12;
            gVar16.L(new ii.b() { // from class: aj.d
                @Override // ii.b
                public final void q(Object obj, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    List listF8;
                    List listF9;
                    List listF10;
                    List listF11;
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    switch (i23) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj3).doubleValue();
                            Object obj4 = list.get(2);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar32.e(str, dDoubleValue, (h) obj4);
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar42.d(str2, str3, (h) obj7);
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list4 = (List) obj9;
                            Object obj10 = list3.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar52.p(str4, list4, (h) obj10);
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF4 = kotlin.collections.r.c(gVar62.c(str5, (h) obj12));
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF5 = kotlin.collections.r.c(gVar72.b(str6, (h) obj14));
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            g gVar82 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj15 = list7.get(0);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj15;
                            Object obj16 = list7.get(1);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF6 = kotlin.collections.r.c(gVar82.x(str7, (h) obj16));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            g gVar92 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj17;
                            Object obj18 = list8.get(1);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF7 = kotlin.collections.r.c(gVar92.t(str8, (h) obj18));
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            g gVar102 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj19;
                            Object obj20 = list9.get(1);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj20).booleanValue();
                            Object obj21 = list9.get(2);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar102.s(str9, zBooleanValue, (h) obj21);
                                listF8 = kotlin.collections.r.c(null);
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            g gVar112 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj22 = list10.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj22;
                            Object obj23 = list10.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF9 = kotlin.collections.r.c(gVar112.q(str10, (h) obj23));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            g gVar122 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj24 = list11.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj24;
                            Object obj25 = list11.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF10 = kotlin.collections.r.c(gVar122.l(str11, (h) obj25));
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            g gVar132 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj26 = list12.get(1);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar132.z(list13, (h) obj26);
                                listF11 = kotlin.collections.r.c(null);
                            } catch (Throwable th12) {
                                listF11 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th12), th12.toString(), l7.o.k("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            g gVar142 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj27 = list14.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF12 = kotlin.collections.r.c(gVar142.o(list15, (h) obj27));
                            } catch (Throwable th13) {
                                listF12 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th13), th13.toString(), l7.o.k("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            g gVar152 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            List list17 = (List) list16.get(0);
                            Object obj28 = list16.get(1);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listF13 = kotlin.collections.r.c(gVar152.v(list17, (h) obj28));
                            } catch (Throwable th14) {
                                listF13 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th14), th14.toString(), l7.o.k("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            g gVar162 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj29;
                            Object obj30 = list18.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj30;
                            Object obj31 = list18.get(2);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar162.g(str12, str13, (h) obj31);
                                listF14 = kotlin.collections.r.c(null);
                            } catch (Throwable th15) {
                                listF14 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th15), th15.toString(), l7.o.k("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            reply.i(listF14);
                            break;
                        default:
                            g gVar17 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj32;
                            Object obj33 = list19.get(1);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj33).longValue();
                            Object obj34 = list19.get(2);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                gVar17.y(str14, jLongValue, (h) obj34);
                                listF15 = kotlin.collections.r.c(null);
                            } catch (Throwable th16) {
                                listF15 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th16), th16.toString(), l7.o.k("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                            }
                            reply.i(listF15);
                            break;
                    }
                }
            });
        }
    }
}
