package yads;

import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f44423a = kotlin.collections.j0.g(new Pair(sb3.f42884c, "No ad view"), new Pair(sb3.f42885d, "No valid ads in ad unit"), new Pair(sb3.f42886e, "Ad is not visible for percent"), new Pair(sb3.f42887f, "Required asset %s is not visible in ad view"), new Pair(sb3.f42888g, "Ad view is null"), new Pair(sb3.f42889h, "Ad view is hidden"), new Pair(sb3.i, "Visible area of an ad view is too small"));

    public static String a(wb3 wb3Var) {
        if (!(wb3Var instanceof tb3)) {
            return "Unknown error, that shouldn't happen";
        }
        tb3 tb3Var = (tb3) wb3Var;
        String str = tb3Var.f43261b;
        String str2 = (String) f44423a.get(tb3Var.f43260a);
        if (str2 == null) {
            return "Visibility error";
        }
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }
}
