package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xg1 {
    public static final List a(tg1 tg1Var) {
        List listSplit$default;
        String strC = ((vg1) tg1Var).c("SdkConfigurationFallbackHosts");
        if (strC == null || (listSplit$default = StringsKt__StringsKt.split$default(strC, new String[]{StringUtils.COMMA}, false, 0, 6, null)) == null) {
            return null;
        }
        return listSplit$default;
    }

    public static final void a(tg1 tg1Var, String str, List list) {
        String strI = null;
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                strI = CollectionsKt.I(list2, StringUtils.COMMA, null, null, null, 62);
            }
        }
        ((vg1) tg1Var).a(str, strI);
    }
}
