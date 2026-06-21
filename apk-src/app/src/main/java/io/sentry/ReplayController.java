package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ReplayController extends IReplayApi {
    void captureReplay(@Nullable Boolean bool);

    @NotNull
    ReplayBreadcrumbConverter getBreadcrumbConverter();

    @NotNull
    SentryId getReplayId();

    boolean isDebugMaskingOverlayEnabled();

    boolean isRecording();

    void pause();

    void resume();

    void setBreadcrumbConverter(@NotNull ReplayBreadcrumbConverter replayBreadcrumbConverter);

    void start();

    void stop();
}
