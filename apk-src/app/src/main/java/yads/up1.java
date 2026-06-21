package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class up1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43758a;

    public /* synthetic */ up1() {
        this(kotlin.collections.s.f("AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native"));
    }

    public final e00 a(sq1 sq1Var) {
        Object next;
        String str = sq1Var.f43050b;
        String strI = StringsKt.I(StringsKt.N(str, str), "Adapter");
        if (strI.length() <= 0) {
            strI = null;
        }
        if (strI != null) {
            Iterator it = this.f43758a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.text.a0.h(strI, (String) next)) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                d00 d00Var = e00.f37941c;
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                d00Var.getClass();
                return d00.a(lowerCase);
            }
        }
        return null;
    }

    public final String b(sq1 sq1Var) {
        Object next;
        String str = sq1Var.f43050b;
        String strI = StringsKt.I(StringsKt.N(str, str), "Adapter");
        if (strI.length() <= 0) {
            strI = null;
        }
        if (strI != null) {
            Iterator it = this.f43758a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.text.a0.h(strI, (String) next)) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                String strI2 = StringsKt.I(strI, str2);
                if (strI2.length() > 0) {
                    return strI2;
                }
            }
        }
        return null;
    }

    public up1(List list) {
        this.f43758a = list;
    }
}
