package io.sentry;

import io.sentry.SentryFeedbackOptions;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IFeedbackApi {
    @NotNull
    SentryId capture(@NotNull Feedback feedback);

    @NotNull
    SentryId capture(@NotNull Feedback feedback, @Nullable Hint hint);

    @NotNull
    SentryId capture(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback);

    void show();

    void show(@Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator);

    void show(@Nullable SentryId sentryId, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator);
}
