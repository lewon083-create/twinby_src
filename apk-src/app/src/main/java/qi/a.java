package qi;

import android.util.Log;
import ij.m;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.e f32116c;

    public /* synthetic */ a(h3.e eVar, int i) {
        this.f32115b = i;
        this.f32116c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listF;
        List listF2;
        m mVar = (m) obj;
        switch (this.f32115b) {
            case 0:
                Throwable exception = m.a(mVar.f21342b);
                h3.e eVar = this.f32116c;
                if (exception != null) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof g) {
                        g gVar = (g) exception;
                        listF = s.f(gVar.f32127b, gVar.f32128c, gVar.f32129d);
                    } else {
                        listF = s.f(exception.getClass().getSimpleName(), exception.toString(), o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                    eVar.i(listF);
                } else {
                    eVar.i(r.c(null));
                }
                break;
            default:
                Throwable exception2 = m.a(mVar.f21342b);
                h3.e eVar2 = this.f32116c;
                if (exception2 != null) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof g) {
                        g gVar2 = (g) exception2;
                        listF2 = s.f(gVar2.f32127b, gVar2.f32128c, gVar2.f32129d);
                    } else {
                        listF2 = s.f(exception2.getClass().getSimpleName(), exception2.toString(), o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                    eVar2.i(listF2);
                } else {
                    eVar2.i(r.c(null));
                }
                break;
        }
        return Unit.f27471a;
    }
}
