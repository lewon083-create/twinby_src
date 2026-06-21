package io.sentry.android.core;

import android.content.Context;
import io.sentry.SentryFeedbackOptions;
import io.sentry.android.core.SentryUserFeedbackForm;
import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SentryUserFeedbackDialog extends SentryUserFeedbackForm {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Deprecated
    public static class Builder extends SentryUserFeedbackForm.Builder {
        @Deprecated
        public Builder(@NotNull Context context) {
            super(context);
        }

        @Deprecated
        public Builder(Context context, int i) {
            super(context, i);
        }

        @Override // io.sentry.android.core.SentryUserFeedbackForm.Builder
        @Deprecated
        public Builder associatedEventId(@Nullable SentryId sentryId) {
            super.associatedEventId(sentryId);
            return this;
        }

        @Override // io.sentry.android.core.SentryUserFeedbackForm.Builder
        @Deprecated
        public Builder configurator(@Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
            super.configurator(optionsConfigurator);
            return this;
        }

        @Override // io.sentry.android.core.SentryUserFeedbackForm.Builder
        @Deprecated
        public SentryUserFeedbackDialog create() {
            return new SentryUserFeedbackDialog(this.context, this.themeResId, this.associatedEventId, this.configuration, this.configurator);
        }

        @Deprecated
        public Builder(@NotNull Context context, @Nullable OptionsConfiguration optionsConfiguration) {
            super(context, optionsConfiguration);
        }

        @Deprecated
        public Builder(@NotNull Context context, int i, @Nullable OptionsConfiguration optionsConfiguration) {
            super(context, i, optionsConfiguration);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Deprecated
    public interface OptionsConfiguration extends SentryUserFeedbackForm.OptionsConfiguration {
    }

    public SentryUserFeedbackDialog(@NotNull Context context, int i, @Nullable SentryId sentryId, @Nullable SentryUserFeedbackForm.OptionsConfiguration optionsConfiguration, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        super(context, i, sentryId, optionsConfiguration, optionsConfigurator);
    }
}
