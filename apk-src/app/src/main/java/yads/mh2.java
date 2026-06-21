package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class mh2 {
    public static LinkedHashMap a(kh2 kh2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("adapter", kh2Var.f40203a);
        sh2 sh2Var = kh2Var.f40204b;
        if (sh2Var != null) {
            linkedHashMap.put("winner_name", sh2Var.f42943a);
            linkedHashMap.put("winner_ad_unit", sh2Var.f42944b);
        }
        String lowerCase = kh2Var.f40206d.f37402a.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        linkedHashMap.put("status", lowerCase);
        Integer num = kh2Var.f40206d.f37404c;
        if (num != null) {
            linkedHashMap.put(VKApiCodes.PARAM_ERROR_CODE, String.valueOf(num.intValue()));
        }
        String str = kh2Var.f40206d.f37403b;
        if (str != null) {
            linkedHashMap.put("error_message", str);
        }
        return linkedHashMap;
    }
}
