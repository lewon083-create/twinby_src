package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class o0 {
    public static jj.n a(jj.n builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        jj.i iVar = builder.f26674b;
        iVar.b();
        return iVar.f26664j > 0 ? builder : jj.n.f26673d;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
