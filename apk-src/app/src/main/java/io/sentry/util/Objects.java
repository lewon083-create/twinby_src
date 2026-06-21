package io.sentry.util;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Objects {
    private Objects() {
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hash(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T requireNonNull(@Nullable T t10, @NotNull String str) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(str);
    }
}
