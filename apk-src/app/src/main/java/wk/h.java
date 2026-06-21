package wk;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sk.f p02 = (sk.f) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        i iVar = (i) this.receiver;
        iVar.getClass();
        boolean z5 = !p02.j(iIntValue) && p02.i(iIntValue).c();
        iVar.f35287b = z5;
        return Boolean.valueOf(z5);
    }
}
