package io.sentry.util;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionUtils {
    @NotNull
    public static Throwable findRootCause(@NotNull Throwable th2) {
        Objects.requireNonNull(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean isIgnored(@NotNull Set<Class<? extends Throwable>> set, @NotNull Throwable th2) {
        return set.contains(th2.getClass());
    }
}
