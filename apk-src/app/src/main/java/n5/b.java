package n5;

import a0.r1;
import a0.x1;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.board.BoardService;
import com.vk.sdk.api.status.StatusService;
import g0.d0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import ni.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements zc.e, md.e, ApiResponseParser, ii.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29105b;

    public /* synthetic */ b(int i) {
        this.f29105b = i;
    }

    @Override // zc.e
    public Object apply(Object obj) {
        long j10 = ((a) obj).f29102b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        return Long.valueOf(j10);
    }

    @Override // md.e
    public Object l(q9.o oVar) {
        switch (this.f29105b) {
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f14755a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f14757c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f14756b.get();
            default:
                md.m mVar = ExecutorsRegistrar.f14755a;
                return nd.k.f29327b;
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f29105b) {
            case 5:
                return BoardService.m125boardDeleteComment$lambda14(pVar);
            case 6:
                return BoardService.m135boardRestoreComment$lambda58(pVar);
            case 7:
                return BoardService.m123boardCloseTopic$lambda5(pVar);
            case 8:
                return BoardService.m132boardGetTopics$lambda40(pVar);
            case 9:
                return BoardService.m127boardEditComment$lambda18(pVar);
            case 10:
                return BoardService.m134boardOpenTopic$lambda56(pVar);
            case 11:
                return BoardService.m136boardUnfixTopic$lambda60(pVar);
            case 12:
                return BoardService.m131boardGetCommentsExtended$lambda33(pVar);
            case 13:
                return BoardService.m133boardGetTopicsExtended$lambda48(pVar);
            case 14:
                return BoardService.m130boardGetComments$lambda26(pVar);
            case 15:
                return BoardService.m128boardEditTopic$lambda22(pVar);
            case 16:
                return BoardService.m129boardFixTopic$lambda24(pVar);
            case 17:
                return BoardService.m124boardCreateComment$lambda7(pVar);
            case 18:
                return BoardService.m122boardAddTopic$lambda0(pVar);
            case 19:
                return BoardService.m126boardDeleteTopic$lambda16(pVar);
            case 20:
                return StatusService.m485statusGet$lambda0(pVar);
            default:
                return StatusService.m486statusSet$lambda4(pVar);
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        List listF3;
        List listF4;
        List listF5;
        List listF6;
        List listF7;
        List listF8;
        switch (this.f29105b) {
            case 22:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.camera.core.Camera");
                try {
                    listF = r.c(((a0.n) obj2).b());
                    break;
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof ni.p) {
                        ni.p pVar = exception;
                        listF = s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                    } else {
                        listF = s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                }
                reply.i(listF);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                try {
                    listF2 = r.c(new c0(((d0) obj3).j(), ni.d0.f29372d));
                    break;
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof ni.p) {
                        ni.p pVar2 = exception2;
                        listF2 = s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                    } else {
                        listF2 = s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                }
                reply.i(listF2);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                try {
                    listF3 = r.c(new c0(((d0) obj4).t(), ni.d0.f29373e));
                    break;
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof ni.p) {
                        ni.p pVar3 = exception3;
                        listF3 = s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                    } else {
                        listF3 = s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                    }
                }
                reply.i(listF3);
                break;
            case 25:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj5 = list.get(0);
                Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.camera2.interop.CaptureRequestOptions");
                z.g gVar = (z.g) obj5;
                Object obj6 = list.get(1);
                Intrinsics.c(obj6, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<*>");
                try {
                    listF4 = r.c(gVar.L.g(s.b.u((CaptureRequest.Key) obj6), null));
                    break;
                } catch (Throwable exception4) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof ni.p) {
                        ni.p pVar4 = exception4;
                        listF4 = s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                    } else {
                        listF4 = s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                    }
                }
                reply.i(listF4);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj7 = ((List) obj).get(0);
                Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.ImageProxy");
                try {
                    listF5 = r.c(Arrays.asList(((r1) obj7).f()));
                    break;
                } catch (Throwable exception5) {
                    Intrinsics.checkNotNullParameter(exception5, "exception");
                    if (exception5 instanceof ni.p) {
                        ni.p pVar5 = exception5;
                        listF5 = s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                    } else {
                        listF5 = s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                    }
                }
                reply.i(listF5);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.ImageProxy");
                try {
                    ((r1) obj8).close();
                    listF6 = r.c(null);
                    break;
                } catch (Throwable exception6) {
                    Intrinsics.checkNotNullParameter(exception6, "exception");
                    if (exception6 instanceof ni.p) {
                        ni.p pVar6 = exception6;
                        listF6 = s.f(pVar6.f29468b, pVar6.f29469c, pVar6.f29470d);
                    } else {
                        listF6 = s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                    }
                }
                reply.i(listF6);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj9).longValue();
                Object obj10 = list2.get(1);
                Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue2 = ((Long) obj10).longValue();
                Object obj11 = list2.get(2);
                Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.ImageProxy.PlaneProxy>");
                try {
                    listF7 = r.c(le.a.f(jLongValue, jLongValue2, (List) obj11));
                    break;
                } catch (Throwable exception7) {
                    Intrinsics.checkNotNullParameter(exception7, "exception");
                    if (exception7 instanceof ni.p) {
                        ni.p pVar7 = exception7;
                        listF7 = s.f(pVar7.f29468b, pVar7.f29469c, pVar7.f29470d);
                    } else {
                        listF7 = s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                    }
                }
                reply.i(listF7);
                break;
            default:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Intrinsics.c(((List) obj).get(0), "null cannot be cast to non-null type androidx.camera.core.MeteringPoint");
                try {
                    listF8 = r.c(Double.valueOf(((x1) r6).f271c));
                    break;
                } catch (Throwable exception8) {
                    Intrinsics.checkNotNullParameter(exception8, "exception");
                    if (exception8 instanceof ni.p) {
                        ni.p pVar8 = exception8;
                        listF8 = s.f(pVar8.f29468b, pVar8.f29469c, pVar8.f29470d);
                    } else {
                        listF8 = s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                    }
                }
                reply.i(listF8);
                break;
        }
    }
}
