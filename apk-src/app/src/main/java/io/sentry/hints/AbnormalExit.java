package io.sentry.hints;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface AbnormalExit {
    boolean ignoreCurrentThread();

    @Nullable
    String mechanism();

    @Nullable
    Long timestamp();
}
