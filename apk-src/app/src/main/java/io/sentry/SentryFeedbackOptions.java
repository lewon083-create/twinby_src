package io.sentry;

import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryFeedbackOptions {

    @NotNull
    private CharSequence cancelButtonLabel;

    @NotNull
    private CharSequence emailLabel;

    @NotNull
    private CharSequence emailPlaceholder;

    @NotNull
    private CharSequence formTitle;

    @NotNull
    private IFormHandler iFormHandler;
    private boolean isEmailRequired;
    private boolean isNameRequired;

    @NotNull
    private CharSequence isRequiredLabel;

    @NotNull
    private CharSequence messageLabel;

    @NotNull
    private CharSequence messagePlaceholder;

    @NotNull
    private CharSequence nameLabel;

    @NotNull
    private CharSequence namePlaceholder;

    @Nullable
    private Runnable onFormClose;

    @Nullable
    private Runnable onFormOpen;

    @Nullable
    private SentryFeedbackCallback onSubmitError;

    @Nullable
    private SentryFeedbackCallback onSubmitSuccess;
    private boolean showBranding;
    private boolean showEmail;
    private boolean showName;

    @NotNull
    private CharSequence submitButtonLabel;

    @NotNull
    private CharSequence successMessageText;
    private boolean useSentryUser;
    private boolean useShakeGesture;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface IFormHandler {
        void showForm(@Nullable SentryId sentryId, @Nullable OptionsConfigurator optionsConfigurator);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface OptionsConfigurator {
        void configure(@NotNull SentryFeedbackOptions sentryFeedbackOptions);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface SentryFeedbackCallback {
        void call(@NotNull Feedback feedback);
    }

    public SentryFeedbackOptions(@NotNull IFormHandler iFormHandler) {
        this.isNameRequired = false;
        this.showName = true;
        this.isEmailRequired = false;
        this.showEmail = true;
        this.useSentryUser = true;
        this.showBranding = true;
        this.useShakeGesture = false;
        this.formTitle = "Report a Bug";
        this.submitButtonLabel = "Send Bug Report";
        this.cancelButtonLabel = "Cancel";
        this.nameLabel = "Name";
        this.namePlaceholder = "Your Name";
        this.emailLabel = "Email";
        this.emailPlaceholder = "your.email@example.org";
        this.isRequiredLabel = " (Required)";
        this.messageLabel = "Description";
        this.messagePlaceholder = "What's the bug? What did you expect?";
        this.successMessageText = "Thank you for your report!";
        this.iFormHandler = iFormHandler;
    }

    @NotNull
    public CharSequence getCancelButtonLabel() {
        return this.cancelButtonLabel;
    }

    @NotNull
    public CharSequence getEmailLabel() {
        return this.emailLabel;
    }

    @NotNull
    public CharSequence getEmailPlaceholder() {
        return this.emailPlaceholder;
    }

    @NotNull
    public IFormHandler getFormHandler() {
        return this.iFormHandler;
    }

    @NotNull
    public CharSequence getFormTitle() {
        return this.formTitle;
    }

    @NotNull
    public CharSequence getIsRequiredLabel() {
        return this.isRequiredLabel;
    }

    @NotNull
    public CharSequence getMessageLabel() {
        return this.messageLabel;
    }

    @NotNull
    public CharSequence getMessagePlaceholder() {
        return this.messagePlaceholder;
    }

    @NotNull
    public CharSequence getNameLabel() {
        return this.nameLabel;
    }

    @NotNull
    public CharSequence getNamePlaceholder() {
        return this.namePlaceholder;
    }

    @Nullable
    public Runnable getOnFormClose() {
        return this.onFormClose;
    }

    @Nullable
    public Runnable getOnFormOpen() {
        return this.onFormOpen;
    }

    @Nullable
    public SentryFeedbackCallback getOnSubmitError() {
        return this.onSubmitError;
    }

    @Nullable
    public SentryFeedbackCallback getOnSubmitSuccess() {
        return this.onSubmitSuccess;
    }

    @NotNull
    public CharSequence getSubmitButtonLabel() {
        return this.submitButtonLabel;
    }

    @NotNull
    public CharSequence getSuccessMessageText() {
        return this.successMessageText;
    }

    public boolean isEmailRequired() {
        return this.isEmailRequired;
    }

    public boolean isNameRequired() {
        return this.isNameRequired;
    }

    public boolean isShowBranding() {
        return this.showBranding;
    }

    public boolean isShowEmail() {
        return this.showEmail;
    }

    public boolean isShowName() {
        return this.showName;
    }

    public boolean isUseSentryUser() {
        return this.useSentryUser;
    }

    public boolean isUseShakeGesture() {
        return this.useShakeGesture;
    }

    public void setCancelButtonLabel(@NotNull CharSequence charSequence) {
        this.cancelButtonLabel = charSequence;
    }

    public void setEmailLabel(@NotNull CharSequence charSequence) {
        this.emailLabel = charSequence;
    }

    public void setEmailPlaceholder(@NotNull CharSequence charSequence) {
        this.emailPlaceholder = charSequence;
    }

    public void setEmailRequired(boolean z5) {
        this.isEmailRequired = z5;
    }

    public void setFormHandler(@NotNull IFormHandler iFormHandler) {
        this.iFormHandler = iFormHandler;
    }

    public void setFormTitle(@NotNull CharSequence charSequence) {
        this.formTitle = charSequence;
    }

    public void setIsRequiredLabel(@NotNull CharSequence charSequence) {
        this.isRequiredLabel = charSequence;
    }

    public void setMessageLabel(@NotNull CharSequence charSequence) {
        this.messageLabel = charSequence;
    }

    public void setMessagePlaceholder(@NotNull CharSequence charSequence) {
        this.messagePlaceholder = charSequence;
    }

    public void setNameLabel(@NotNull CharSequence charSequence) {
        this.nameLabel = charSequence;
    }

    public void setNamePlaceholder(@NotNull CharSequence charSequence) {
        this.namePlaceholder = charSequence;
    }

    public void setNameRequired(boolean z5) {
        this.isNameRequired = z5;
    }

    public void setOnFormClose(@Nullable Runnable runnable) {
        this.onFormClose = runnable;
    }

    public void setOnFormOpen(@Nullable Runnable runnable) {
        this.onFormOpen = runnable;
    }

    public void setOnSubmitError(@Nullable SentryFeedbackCallback sentryFeedbackCallback) {
        this.onSubmitError = sentryFeedbackCallback;
    }

    public void setOnSubmitSuccess(@Nullable SentryFeedbackCallback sentryFeedbackCallback) {
        this.onSubmitSuccess = sentryFeedbackCallback;
    }

    public void setShowBranding(boolean z5) {
        this.showBranding = z5;
    }

    public void setShowEmail(boolean z5) {
        this.showEmail = z5;
    }

    public void setShowName(boolean z5) {
        this.showName = z5;
    }

    public void setSubmitButtonLabel(@NotNull CharSequence charSequence) {
        this.submitButtonLabel = charSequence;
    }

    public void setSuccessMessageText(@NotNull CharSequence charSequence) {
        this.successMessageText = charSequence;
    }

    public void setUseSentryUser(boolean z5) {
        this.useSentryUser = z5;
    }

    public void setUseShakeGesture(boolean z5) {
        this.useShakeGesture = z5;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.isNameRequired + ", showName=" + this.showName + ", isEmailRequired=" + this.isEmailRequired + ", showEmail=" + this.showEmail + ", useSentryUser=" + this.useSentryUser + ", showBranding=" + this.showBranding + ", useShakeGesture=" + this.useShakeGesture + ", formTitle='" + ((Object) this.formTitle) + "', submitButtonLabel='" + ((Object) this.submitButtonLabel) + "', cancelButtonLabel='" + ((Object) this.cancelButtonLabel) + "', nameLabel='" + ((Object) this.nameLabel) + "', namePlaceholder='" + ((Object) this.namePlaceholder) + "', emailLabel='" + ((Object) this.emailLabel) + "', emailPlaceholder='" + ((Object) this.emailPlaceholder) + "', isRequiredLabel='" + ((Object) this.isRequiredLabel) + "', messageLabel='" + ((Object) this.messageLabel) + "', messagePlaceholder='" + ((Object) this.messagePlaceholder) + "'}";
    }

    public SentryFeedbackOptions(@NotNull SentryFeedbackOptions sentryFeedbackOptions) {
        this.isNameRequired = false;
        this.showName = true;
        this.isEmailRequired = false;
        this.showEmail = true;
        this.useSentryUser = true;
        this.showBranding = true;
        this.useShakeGesture = false;
        this.formTitle = "Report a Bug";
        this.submitButtonLabel = "Send Bug Report";
        this.cancelButtonLabel = "Cancel";
        this.nameLabel = "Name";
        this.namePlaceholder = "Your Name";
        this.emailLabel = "Email";
        this.emailPlaceholder = "your.email@example.org";
        this.isRequiredLabel = " (Required)";
        this.messageLabel = "Description";
        this.messagePlaceholder = "What's the bug? What did you expect?";
        this.successMessageText = "Thank you for your report!";
        this.isNameRequired = sentryFeedbackOptions.isNameRequired;
        this.showName = sentryFeedbackOptions.showName;
        this.isEmailRequired = sentryFeedbackOptions.isEmailRequired;
        this.showEmail = sentryFeedbackOptions.showEmail;
        this.useSentryUser = sentryFeedbackOptions.useSentryUser;
        this.showBranding = sentryFeedbackOptions.showBranding;
        this.useShakeGesture = sentryFeedbackOptions.useShakeGesture;
        this.formTitle = sentryFeedbackOptions.formTitle;
        this.submitButtonLabel = sentryFeedbackOptions.submitButtonLabel;
        this.cancelButtonLabel = sentryFeedbackOptions.cancelButtonLabel;
        this.nameLabel = sentryFeedbackOptions.nameLabel;
        this.namePlaceholder = sentryFeedbackOptions.namePlaceholder;
        this.emailLabel = sentryFeedbackOptions.emailLabel;
        this.emailPlaceholder = sentryFeedbackOptions.emailPlaceholder;
        this.isRequiredLabel = sentryFeedbackOptions.isRequiredLabel;
        this.messageLabel = sentryFeedbackOptions.messageLabel;
        this.messagePlaceholder = sentryFeedbackOptions.messagePlaceholder;
        this.successMessageText = sentryFeedbackOptions.successMessageText;
        this.onFormOpen = sentryFeedbackOptions.onFormOpen;
        this.onFormClose = sentryFeedbackOptions.onFormClose;
        this.onSubmitSuccess = sentryFeedbackOptions.onSubmitSuccess;
        this.onSubmitError = sentryFeedbackOptions.onSubmitError;
        this.iFormHandler = sentryFeedbackOptions.iFormHandler;
    }
}
