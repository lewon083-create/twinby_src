package io.sentry.metrics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IMetricsApi {
    void count(@NotNull String str);

    void count(@NotNull String str, @Nullable Double d10);

    void count(@NotNull String str, @Nullable Double d10, @Nullable String str2);

    void count(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters);

    void count(@NotNull String str, @Nullable String str2);

    void distribution(@NotNull String str, @Nullable Double d10);

    void distribution(@NotNull String str, @Nullable Double d10, @Nullable String str2);

    void distribution(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters);

    void gauge(@NotNull String str, @Nullable Double d10);

    void gauge(@NotNull String str, @Nullable Double d10, @Nullable String str2);

    void gauge(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters);
}
