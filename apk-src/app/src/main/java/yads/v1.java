package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43820a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f43821b = kotlin.collections.j0.g(new Pair(16, "ActivityInfo.CONFIG_KEYBOARD"), new Pair(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), new Pair(128, "ActivityInfo.CONFIG_ORIENTATION"), new Pair(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), new Pair(512, "ActivityInfo.CONFIG_UI_MODE"), new Pair(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), new Pair(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    public static void a(ActivityInfo activityInfo) {
        Object obj;
        Map map = f43821b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                obj = str;
            }
            arrayList.add(obj);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next) != null) {
                obj = next;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        String str3 = String.format(f43820a, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        throw new wb1(str3, str3);
    }
}
