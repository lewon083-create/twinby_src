package io.sentry.metrics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpMetricsApi implements IMetricsApi {
    private static final NoOpMetricsApi instance = new NoOpMetricsApi();

    private NoOpMetricsApi() {
    }

    public static NoOpMetricsApi getInstance() {
        return instance;
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(@NotNull String str, @Nullable Double d10) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(@NotNull String str, @Nullable Double d10) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable Double d10) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(@NotNull String str, @Nullable Double d10, @Nullable String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(@NotNull String str, @Nullable Double d10, @Nullable String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable Double d10, @Nullable String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable String str2) {
    }
}
