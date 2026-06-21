package yads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sd3 {
    public static rd3 a(String str) {
        Integer intOrNull;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '-') {
                    str = str.substring(0, i);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        List listJ = StringsKt.J(str, new char[]{'.'});
        String str2 = (String) CollectionsKt.F(0, listJ);
        if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        int iE = kotlin.collections.s.e(listJ);
        Object obj = CommonUrlParts.Values.FALSE_INTEGER;
        Integer intOrNull2 = StringsKt.toIntOrNull((String) (1 <= iE ? listJ.get(1) : CommonUrlParts.Values.FALSE_INTEGER));
        if (intOrNull2 == null) {
            return null;
        }
        int iIntValue2 = intOrNull2.intValue();
        if (2 <= kotlin.collections.s.e(listJ)) {
            obj = listJ.get(2);
        }
        Integer intOrNull3 = StringsKt.toIntOrNull((String) obj);
        if (intOrNull3 != null) {
            return new rd3(iIntValue, iIntValue2, intOrNull3.intValue());
        }
        return null;
    }
}
