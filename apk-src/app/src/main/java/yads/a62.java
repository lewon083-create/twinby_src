package yads;

import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a62 implements ig3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f36641a;

    public a62(d4 d4Var) {
        this.f36641a = d4Var;
    }

    @Override // yads.ig3
    public final Map a() {
        String str = this.f36641a.f37615c.f39118a;
        if (str == null || StringsKt.D(str)) {
            str = StringUtils.UNDEFINED;
        }
        return kotlin.collections.j0.g(new Pair("ad_unit_id", str), new Pair(AdRevenueScheme.AD_TYPE, this.f36641a.f37613a.f37950b));
    }
}
