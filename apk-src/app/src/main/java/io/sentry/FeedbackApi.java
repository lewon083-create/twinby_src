package io.sentry;

import io.sentry.SentryFeedbackOptions;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class FeedbackApi implements IFeedbackApi {

    @NotNull
    private final IScopes scopes;

    public FeedbackApi(@NotNull IScopes iScopes) {
        this.scopes = iScopes;
    }

    @Override // io.sentry.IFeedbackApi
    @NotNull
    public SentryId capture(@NotNull Feedback feedback) {
        return this.scopes.captureFeedback(feedback);
    }

    @Override // io.sentry.IFeedbackApi
    public void show() {
        show(null, null);
    }

    @Override // io.sentry.IFeedbackApi
    @NotNull
    public SentryId capture(@NotNull Feedback feedback, @Nullable Hint hint) {
        return this.scopes.captureFeedback(feedback, hint);
    }

    @Override // io.sentry.IFeedbackApi
    public void show(@Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        show(null, optionsConfigurator);
    }

    @Override // io.sentry.IFeedbackApi
    @NotNull
    public SentryId capture(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        return this.scopes.captureFeedback(feedback, hint, scopeCallback);
    }

    @Override // io.sentry.IFeedbackApi
    public void show(@Nullable SentryId sentryId, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        this.scopes.getOptions().getFeedbackOptions().getFormHandler().showForm(sentryId, optionsConfigurator);
    }
}
