package io.sentry;

import io.sentry.SentryFeedbackOptions;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpFeedbackApi implements IFeedbackApi {
    private static final NoOpFeedbackApi instance = new NoOpFeedbackApi();

    private NoOpFeedbackApi() {
    }

    public static NoOpFeedbackApi getInstance() {
        return instance;
    }

    @Override // io.sentry.IFeedbackApi
    @NotNull
    public SentryId capture(@NotNull Feedback feedback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IFeedbackApi
    public void show() {
    }

    @Override // io.sentry.IFeedbackApi
    @NotNull
    public SentryId capture(@NotNull Feedback feedback, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IFeedbackApi
    public void show(@Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
    }

    @Override // io.sentry.IFeedbackApi
    @NotNull
    public SentryId capture(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IFeedbackApi
    public void show(@Nullable SentryId sentryId, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
    }
}
