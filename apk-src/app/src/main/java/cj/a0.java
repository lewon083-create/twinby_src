package cj;

import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.SentryEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a0 f2301a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ij.p f2302b = ij.h.b(new aj.e(2));

    public static ii.m a() {
        return (ii.m) f2302b.getValue();
    }

    public static void b(ii.f binaryMessenger, final y yVar, String messageChannelSuffix) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
        String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping", strConcat), a(), obj);
        if (yVar != null) {
            final int i = 1;
            gVar.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume", strConcat), a(), obj);
        if (yVar != null) {
            final int i10 = 2;
            gVar2.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i10) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed", strConcat), a(), obj);
        if (yVar != null) {
            final int i11 = 3;
            gVar3.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i11) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play", strConcat), a(), obj);
        if (yVar != null) {
            final int i12 = 4;
            gVar4.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i12) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause", strConcat), a(), obj);
        if (yVar != null) {
            final int i13 = 5;
            gVar5.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i13) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo", strConcat), a(), obj);
        if (yVar != null) {
            final int i14 = 6;
            gVar6.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i14) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getCurrentPosition", strConcat), a(), obj);
        if (yVar != null) {
            final int i15 = 7;
            gVar7.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i15) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getBufferedPosition", strConcat), a(), obj);
        if (yVar != null) {
            final int i16 = 8;
            gVar8.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i16) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getAudioTracks", strConcat), a(), obj);
        if (yVar != null) {
            final int i17 = 9;
            gVar9.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i17) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        } else {
            gVar9.L(null);
        }
        s7.g gVar10 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.selectAudioTrack", strConcat), a(), obj);
        if (yVar == null) {
            gVar10.L(null);
        } else {
            final int i18 = 0;
            gVar10.L(new ii.b() { // from class: cj.z
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    switch (i18) {
                        case 0:
                            b0 b0Var = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((y) b0Var).f(jLongValue, ((Long) obj4).longValue());
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            b0 b0Var2 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((y) b0Var2).g(((Boolean) obj5).booleanValue());
                                listF2 = kotlin.collections.r.c(null);
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            b0 b0Var3 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            try {
                                y yVar2 = (y) b0Var3;
                                yVar2.getClass();
                                ((s3.y) yVar2.f2368e).h0((float) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, Math.min(1.0d, dDoubleValue)));
                                listF3 = kotlin.collections.r.c(null);
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            b0 b0Var4 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                            try {
                                ((y) b0Var4).h(((Double) obj7).doubleValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            b0 b0Var5 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var = (e1.d0) ((y) b0Var5).f2368e;
                                d0Var.getClass();
                                ((s3.y) d0Var).d0(true);
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            b0 b0Var6 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                e1.d0 d0Var2 = (e1.d0) ((y) b0Var6).f2368e;
                                d0Var2.getClass();
                                ((s3.y) d0Var2).d0(false);
                                listF6 = kotlin.collections.r.c(null);
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            b0 b0Var7 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj8).longValue();
                            try {
                                e1.d0 d0Var3 = (e1.d0) ((y) b0Var7).f2368e;
                                d0Var3.getClass();
                                d0Var3.w(((s3.y) d0Var3).I(), jLongValue2);
                                listF7 = kotlin.collections.r.c(null);
                            } catch (Throwable th8) {
                                listF7 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th8), th8.toString(), l7.o.k("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            b0 b0Var8 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF8 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var8).f2368e).K()));
                            } catch (Throwable th9) {
                                listF8 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th9), th9.toString(), l7.o.k("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            b0 b0Var9 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF9 = kotlin.collections.r.c(Long.valueOf(((s3.y) ((y) b0Var9).f2368e).E()));
                            } catch (Throwable th10) {
                                listF9 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th10), th10.toString(), l7.o.k("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            reply.i(listF9);
                            break;
                        default:
                            b0 b0Var10 = yVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                listF10 = kotlin.collections.r.c(((y) b0Var10).e());
                            } catch (Throwable th11) {
                                listF10 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th11), th11.toString(), l7.o.k("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            reply.i(listF10);
                            break;
                    }
                }
            });
        }
    }
}
