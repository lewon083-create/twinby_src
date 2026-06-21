package io.sentry.util;

import java.net.URI;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class PropagationTargetsUtils {
    public static boolean contain(@NotNull List<String> list, @NotNull String str) {
        if (list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
            if (str.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contain(@NotNull List<String> list, URI uri) {
        return contain(list, uri.toString());
    }
}
