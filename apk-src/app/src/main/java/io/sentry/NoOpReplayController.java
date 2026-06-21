package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpReplayController implements ReplayController {
    private static final NoOpReplayController instance = new NoOpReplayController();

    private NoOpReplayController() {
    }

    public static NoOpReplayController getInstance() {
        return instance;
    }

    @Override // io.sentry.ReplayController
    @NotNull
    public ReplayBreadcrumbConverter getBreadcrumbConverter() {
        return NoOpReplayBreadcrumbConverter.getInstance();
    }

    @Override // io.sentry.ReplayController
    @NotNull
    public SentryId getReplayId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ReplayController
    public boolean isDebugMaskingOverlayEnabled() {
        return false;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return false;
    }

    @Override // io.sentry.IReplayApi
    public void disableDebugMaskingOverlay() {
    }

    @Override // io.sentry.IReplayApi
    public void enableDebugMaskingOverlay() {
    }

    @Override // io.sentry.ReplayController
    public void pause() {
    }

    @Override // io.sentry.ReplayController
    public void resume() {
    }

    @Override // io.sentry.ReplayController
    public void start() {
    }

    @Override // io.sentry.ReplayController
    public void stop() {
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(@Nullable Boolean bool) {
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(@NotNull ReplayBreadcrumbConverter replayBreadcrumbConverter) {
    }
}
