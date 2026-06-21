package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryRandom {

    @NotNull
    private static final SentryRandomThreadLocal instance = new SentryRandomThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SentryRandomThreadLocal extends ThreadLocal<Random> {
        private SentryRandomThreadLocal() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @NotNull
    public static Random current() {
        return instance.get();
    }
}
