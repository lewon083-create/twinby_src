package yads;

import java.util.LinkedHashMap;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lr1 {
    public static ho2 a(sq1 sq1Var) {
        ho2 ho2Var = new ho2(new LinkedHashMap(), 2);
        String str = sq1Var.f43050b;
        ho2Var.b(str, "adapter");
        ho2Var.b(sq1Var.f43051c, "adapter_parameters");
        CharSequence charSequence = (CharSequence) sq1Var.f43051c.get("bidding_data");
        boolean z5 = false;
        ho2Var.b(Boolean.valueOf(!(charSequence == null || StringsKt.D(charSequence))), "mediation_bidder");
        if (StringsKt.y(str, "LevelPlay", true)) {
            try {
                Class.forName("com.yandex.ads.mobile.ads.mediation.extras.BuildConfig");
                z5 = true;
            } catch (ClassNotFoundException unused) {
            }
            ho2Var.b(Boolean.valueOf(z5), "has_extras");
        }
        return ho2Var;
    }
}
