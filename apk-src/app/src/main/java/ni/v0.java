package ni;

import android.util.Log;
import com.google.firebase.datatransport.TransportRegistrar;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.database.DatabaseService;
import com.vk.sdk.api.docs.DocsService;
import com.vk.sdk.api.storage.StorageService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v0 implements ii.b, ApiResponseParser, md.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29495b;

    public /* synthetic */ v0(int i) {
        this.f29495b = i;
    }

    @Override // md.e
    public Object l(q9.o oVar) {
        switch (this.f29495b) {
            case 18:
                return TransportRegistrar.lambda$getComponents$0(oVar);
            case 19:
                return TransportRegistrar.lambda$getComponents$1(oVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(oVar);
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(me.p pVar) {
        switch (this.f29495b) {
            case 3:
                return DatabaseService.m145databaseGetRegions$lambda34(pVar);
            case 4:
                return DatabaseService.m146databaseGetSchoolClasses$lambda39(pVar);
            case 5:
                return DatabaseService.m144databaseGetMetroStationsById$lambda31(pVar);
            case 6:
                return DatabaseService.m141databaseGetCountriesById$lambda20(pVar);
            case 7:
                return DatabaseService.m140databaseGetCountries$lambda14(pVar);
            case 8:
                return DatabaseService.m147databaseGetSchools$lambda42(pVar);
            case 9:
                return DatabaseService.m137databaseGetChairs$lambda0(pVar);
            case 10:
                return DatabaseService.m142databaseGetFaculties$lambda23(pVar);
            case 11:
                return DatabaseService.m138databaseGetCities$lambda4(pVar);
            case 12:
                return DatabaseService.m139databaseGetCitiesById$lambda11(pVar);
            case 13:
                return DatabaseService.m148databaseGetUniversities$lambda47(pVar);
            case 14:
                return DatabaseService.m143databaseGetMetroStations$lambda27(pVar);
            case 15:
                return StorageService.m489storageSet$lambda10(pVar);
            case 16:
                return StorageService.m488storageGetKeys$lambda5(pVar);
            case 17:
                return StorageService.m487storageGet$lambda0(pVar);
            case 18:
            case 19:
            case 20:
            default:
                return DocsService.m158docsSave$lambda30(pVar);
            case 21:
                return DocsService.m151docsEdit$lambda5(pVar);
            case 22:
                return DocsService.m150docsDelete$lambda3(pVar);
            case 23:
                return DocsService.m157docsGetWallUploadServer$lambda27(pVar);
            case 24:
                return DocsService.m154docsGetMessagesUploadServer$lambda18(pVar);
            case 25:
                return DocsService.m156docsGetUploadServer$lambda24(pVar);
            case 26:
                return DocsService.m155docsGetTypes$lambda22(pVar);
            case 27:
                return DocsService.m153docsGetById$lambda15(pVar);
            case 28:
                return DocsService.m159docsSearch$lambda35(pVar);
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        List listF3;
        switch (this.f29495b) {
            case 0:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.camera.core.MeteringPointFactory");
                a0.h0 h0Var = (a0.h0) obj2;
                Object obj3 = list.get(1);
                Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Double");
                double dDoubleValue = ((Double) obj3).doubleValue();
                Object obj4 = list.get(2);
                Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Double");
                try {
                    listF = kotlin.collections.r.c(h0Var.a((float) dDoubleValue, (float) ((Double) obj4).doubleValue(), 0.15f));
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
            case 1:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.MeteringPointFactory");
                a0.h0 h0Var2 = (a0.h0) obj5;
                Object obj6 = list2.get(1);
                Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                double dDoubleValue2 = ((Double) obj6).doubleValue();
                Object obj7 = list2.get(2);
                Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Double");
                double dDoubleValue3 = ((Double) obj7).doubleValue();
                Object obj8 = list2.get(3);
                Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Double");
                try {
                    listF2 = kotlin.collections.r.c(h0Var2.a((float) dDoubleValue2, (float) dDoubleValue3, (float) ((Double) obj8).doubleValue()));
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
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj9 = ((List) obj).get(0);
                Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.ResolutionSelector");
                try {
                    listF3 = kotlin.collections.r.c(((t0.b) obj9).f33335a);
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
