package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aa1 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aa1 f36668b = new aa1();

    public aa1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ij.g gVar = ba1.f36975a;
        List listSplit$default = StringsKt__StringsKt.split$default("adsdk.yandex.ru,yandex.ru", new String[]{StringUtils.COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!StringsKt.D((String) obj)) {
                arrayList.add(obj);
            }
        }
        ij.g gVar2 = ba1.f36975a;
        return CollectionsKt.M(arrayList, "yandex.com/ads");
    }
}
