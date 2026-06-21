package cj;

import android.util.Log;
import android.util.LongSparseArray;
import com.google.android.gms.internal.ads.om1;
import io.sentry.SentryEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f2303a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ij.p f2304b = ij.h.b(new aj.e(1));

    public static ii.m a() {
        return (ii.m) f2304b.getValue();
    }

    public static void b(ii.f binaryMessenger, final d0 d0Var) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", ""), a(), obj);
        if (d0Var != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: cj.a
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i) {
                        case 0:
                            c cVar = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                LongSparseArray longSparseArray = ((d0) cVar).f2308b;
                                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                                    ((y) longSparseArray.valueAt(i10)).b();
                                }
                                longSparseArray.clear();
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar2 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF2 = kotlin.collections.r.c(Long.valueOf(((d0) cVar2).a((f) obj3)));
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar3 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF3 = kotlin.collections.r.c(((d0) cVar3).b((f) obj4));
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar4 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((d0) cVar4).c(((Long) obj5).longValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            c cVar5 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((d0) cVar5).f2310d.f16748a = ((Boolean) obj6).booleanValue();
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        default:
                            c cVar6 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF6 = kotlin.collections.r.c(((d0) cVar6).d((String) obj7, (String) list.get(1)));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView", ""), a(), obj);
        if (d0Var != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: cj.a
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i10) {
                        case 0:
                            c cVar = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                LongSparseArray longSparseArray = ((d0) cVar).f2308b;
                                for (int i102 = 0; i102 < longSparseArray.size(); i102++) {
                                    ((y) longSparseArray.valueAt(i102)).b();
                                }
                                longSparseArray.clear();
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar2 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF2 = kotlin.collections.r.c(Long.valueOf(((d0) cVar2).a((f) obj3)));
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar3 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF3 = kotlin.collections.r.c(((d0) cVar3).b((f) obj4));
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar4 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((d0) cVar4).c(((Long) obj5).longValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            c cVar5 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((d0) cVar5).f2310d.f16748a = ((Boolean) obj6).booleanValue();
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        default:
                            c cVar6 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF6 = kotlin.collections.r.c(((d0) cVar6).d((String) obj7, (String) list.get(1)));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView", ""), a(), obj);
        if (d0Var != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: cj.a
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i11) {
                        case 0:
                            c cVar = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                LongSparseArray longSparseArray = ((d0) cVar).f2308b;
                                for (int i102 = 0; i102 < longSparseArray.size(); i102++) {
                                    ((y) longSparseArray.valueAt(i102)).b();
                                }
                                longSparseArray.clear();
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar2 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF2 = kotlin.collections.r.c(Long.valueOf(((d0) cVar2).a((f) obj3)));
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar3 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF3 = kotlin.collections.r.c(((d0) cVar3).b((f) obj4));
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar4 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((d0) cVar4).c(((Long) obj5).longValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            c cVar5 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((d0) cVar5).f2310d.f16748a = ((Boolean) obj6).booleanValue();
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        default:
                            c cVar6 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF6 = kotlin.collections.r.c(((d0) cVar6).d((String) obj7, (String) list.get(1)));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", ""), a(), obj);
        if (d0Var != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: cj.a
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i12) {
                        case 0:
                            c cVar = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                LongSparseArray longSparseArray = ((d0) cVar).f2308b;
                                for (int i102 = 0; i102 < longSparseArray.size(); i102++) {
                                    ((y) longSparseArray.valueAt(i102)).b();
                                }
                                longSparseArray.clear();
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar2 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF2 = kotlin.collections.r.c(Long.valueOf(((d0) cVar2).a((f) obj3)));
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar3 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF3 = kotlin.collections.r.c(((d0) cVar3).b((f) obj4));
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar4 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((d0) cVar4).c(((Long) obj5).longValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            c cVar5 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((d0) cVar5).f2310d.f16748a = ((Boolean) obj6).booleanValue();
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        default:
                            c cVar6 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF6 = kotlin.collections.r.c(((d0) cVar6).d((String) obj7, (String) list.get(1)));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", ""), a(), obj);
        if (d0Var != null) {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: cj.a
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i13) {
                        case 0:
                            c cVar = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                LongSparseArray longSparseArray = ((d0) cVar).f2308b;
                                for (int i102 = 0; i102 < longSparseArray.size(); i102++) {
                                    ((y) longSparseArray.valueAt(i102)).b();
                                }
                                longSparseArray.clear();
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar2 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF2 = kotlin.collections.r.c(Long.valueOf(((d0) cVar2).a((f) obj3)));
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar3 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF3 = kotlin.collections.r.c(((d0) cVar3).b((f) obj4));
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar4 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((d0) cVar4).c(((Long) obj5).longValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            c cVar5 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((d0) cVar5).f2310d.f16748a = ((Boolean) obj6).booleanValue();
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        default:
                            c cVar6 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF6 = kotlin.collections.r.c(((d0) cVar6).d((String) obj7, (String) list.get(1)));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, om1.k("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset", ""), a(), obj);
        if (d0Var == null) {
            gVar6.L(null);
        } else {
            final int i14 = 5;
            gVar6.L(new ii.b() { // from class: cj.a
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i14) {
                        case 0:
                            c cVar = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                LongSparseArray longSparseArray = ((d0) cVar).f2308b;
                                for (int i102 = 0; i102 < longSparseArray.size(); i102++) {
                                    ((y) longSparseArray.valueAt(i102)).b();
                                }
                                longSparseArray.clear();
                                listF = kotlin.collections.r.c(null);
                            } catch (Throwable th2) {
                                listF = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th2), th2.toString(), l7.o.k("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar2 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF2 = kotlin.collections.r.c(Long.valueOf(((d0) cVar2).a((f) obj3)));
                            } catch (Throwable th3) {
                                listF2 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th3), th3.toString(), l7.o.k("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar3 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
                            try {
                                listF3 = kotlin.collections.r.c(((d0) cVar3).b((f) obj4));
                            } catch (Throwable th4) {
                                listF3 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th4), th4.toString(), l7.o.k("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar4 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((d0) cVar4).c(((Long) obj5).longValue());
                                listF4 = kotlin.collections.r.c(null);
                            } catch (Throwable th5) {
                                listF4 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th5), th5.toString(), l7.o.k("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            c cVar5 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((d0) cVar5).f2310d.f16748a = ((Boolean) obj6).booleanValue();
                                listF5 = kotlin.collections.r.c(null);
                            } catch (Throwable th6) {
                                listF5 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th6), th6.toString(), l7.o.k("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            reply.i(listF5);
                            break;
                        default:
                            c cVar6 = d0Var;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj7 = list.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF6 = kotlin.collections.r.c(((d0) cVar6).d((String) obj7, (String) list.get(1)));
                            } catch (Throwable th7) {
                                listF6 = kotlin.collections.s.f(a0.u.l(SentryEvent.JsonKeys.EXCEPTION, th7), th7.toString(), l7.o.k("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        }
    }
}
