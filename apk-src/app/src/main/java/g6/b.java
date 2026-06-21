package g6;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import ij.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import p2.e0;
import p2.l0;
import p2.o0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r implements Function1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20006g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj) {
        super(1);
        this.f20005f = i;
        this.f20006g = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20005f) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = (Context) this.f20006g;
                Intrinsics.checkNotNullParameter(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
                return new c(measurementManager);
            case 1:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Context context2 = (Context) this.f20006g;
                Intrinsics.checkNotNullParameter(context2, "context");
                TopicsManager topicsManager = TopicsManager.get(context2);
                Intrinsics.checkNotNullExpressionValue(topicsManager, "get(context)");
                return new h6.f(topicsManager, 0);
            case 2:
                Context it3 = (Context) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                Context context3 = (Context) this.f20006g;
                Intrinsics.checkNotNullParameter(context3, "context");
                TopicsManager topicsManager2 = TopicsManager.get(context3);
                Intrinsics.checkNotNullExpressionValue(topicsManager2, "get(context)");
                return new h6.f(topicsManager2, 1);
            default:
                Throwable th2 = (Throwable) obj;
                e0 e0Var = (e0) this.f20006g;
                p pVar = e0Var.f30959j;
                if (th2 != null) {
                    e0Var.f30958h.u(new o0(th2));
                }
                if (pVar.a()) {
                    ((l0) pVar.getValue()).close();
                }
                return Unit.f27471a;
        }
    }
}
