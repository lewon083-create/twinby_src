package io.sentry.android.core;

import io.sentry.ISentryClient;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AppState;
import io.sentry.metrics.MetricsBatchProcessor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidMetricsBatchProcessor extends MetricsBatchProcessor implements AppState.AppStateListener {
    public AndroidMetricsBatchProcessor(@NotNull SentryOptions sentryOptions, @NotNull ISentryClient iSentryClient) {
        super(sentryOptions, iSentryClient);
        AppState.getInstance().addAppStateListener(this);
    }

    @Override // io.sentry.metrics.MetricsBatchProcessor, io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z5) {
        AppState.getInstance().removeAppStateListener(this);
        super.close(z5);
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.AndroidMetricsBatchProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    AndroidMetricsBatchProcessor.this.flush(5000L);
                }
            });
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
    }
}
