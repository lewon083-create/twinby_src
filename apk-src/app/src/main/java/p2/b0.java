package p2;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.r implements Function2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f30933f = new b0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p0 msg = (p0) obj;
        Throwable cancellationException = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        hk.r rVar = msg.f31043b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        rVar.H(new hk.t(cancellationException, false));
        return Unit.f27471a;
    }
}
