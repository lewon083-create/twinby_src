package h7;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((f) this.receiver).accept(p02);
        return Unit.f27471a;
    }
}
