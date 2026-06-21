package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class r {
    public static jj.e a(jj.e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.n();
        builder.f26650d = true;
        return builder.f26649c > 0 ? builder : jj.e.f26647f;
    }

    public static jj.e b() {
        return new jj.e(0, 1, null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
