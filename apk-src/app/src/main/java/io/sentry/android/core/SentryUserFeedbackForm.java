package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.sentry.IScopes;
import io.sentry.Sentry;
import io.sentry.SentryFeedbackOptions;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryShakeDetector;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class SentryUserFeedbackForm extends AlertDialog {

    @Nullable
    private final SentryId associatedEventId;

    @Nullable
    private SentryId currentReplayId;

    @Nullable
    private DialogInterface.OnDismissListener delegate;
    private boolean isCancelable;

    @NotNull
    private final SentryFeedbackOptions resolvedFeedbackOptions;

    @Nullable
    private SentryShakeDetector shakeDetector;

    @Nullable
    private Application.ActivityLifecycleCallbacks shakeLifecycleCallbacks;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        @Nullable
        SentryId associatedEventId;

        @Nullable
        OptionsConfiguration configuration;

        @Nullable
        SentryFeedbackOptions.OptionsConfigurator configurator;

        @NotNull
        final Context context;
        final int themeResId;

        public Builder(@NotNull Context context) {
            this(context, 0);
        }

        public Builder associatedEventId(@Nullable SentryId sentryId) {
            this.associatedEventId = sentryId;
            return this;
        }

        public Builder configurator(@Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
            this.configurator = optionsConfigurator;
            return this;
        }

        public SentryUserFeedbackForm create() {
            return new SentryUserFeedbackForm(this.context, this.themeResId, this.associatedEventId, this.configuration, this.configurator);
        }

        public Builder(Context context, int i) {
            this(context, i, null);
        }

        public Builder(@NotNull Context context, @Nullable OptionsConfiguration optionsConfiguration) {
            this(context, 0, optionsConfiguration);
        }

        public Builder(@NotNull Context context, int i, @Nullable OptionsConfiguration optionsConfiguration) {
            this.context = context;
            this.themeResId = i;
            this.configuration = optionsConfiguration;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface OptionsConfiguration {
        void configure(@NotNull Context context, @NotNull SentryFeedbackOptions sentryFeedbackOptions);
    }

    public SentryUserFeedbackForm(@NotNull Context context, int i, @Nullable SentryId sentryId, @Nullable OptionsConfiguration optionsConfiguration, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        super(context, i);
        this.isCancelable = false;
        this.associatedEventId = sentryId;
        SentryFeedbackOptions sentryFeedbackOptions = new SentryFeedbackOptions(Sentry.getCurrentScopes().getOptions().getFeedbackOptions());
        this.resolvedFeedbackOptions = sentryFeedbackOptions;
        if (optionsConfiguration != null) {
            optionsConfiguration.configure(context, sentryFeedbackOptions);
        }
        if (optionsConfigurator != null) {
            optionsConfigurator.configure(sentryFeedbackOptions);
        }
        SentryIntegrationPackageStorage.getInstance().addIntegration("UserFeedbackWidget");
        maybeStartShakeDetection(context);
    }

    @Nullable
    private static Activity getActivity(@NotNull Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(EditText editText, EditText editText2, EditText editText3, SentryFeedbackOptions sentryFeedbackOptions, TextView textView, TextView textView2, TextView textView3, View view) {
        String strTrim = editText.getText().toString().trim();
        String strTrim2 = editText2.getText().toString().trim();
        String strTrim3 = editText3.getText().toString().trim();
        if (strTrim.isEmpty() && sentryFeedbackOptions.isNameRequired()) {
            editText.setError(textView.getText());
            return;
        }
        if (strTrim2.isEmpty() && sentryFeedbackOptions.isEmailRequired()) {
            editText2.setError(textView2.getText());
            return;
        }
        if (strTrim3.isEmpty()) {
            editText3.setError(textView3.getText());
            return;
        }
        Feedback feedback = new Feedback(strTrim3);
        feedback.setName(strTrim);
        feedback.setContactEmail(strTrim2);
        SentryId sentryId = this.associatedEventId;
        if (sentryId != null) {
            feedback.setAssociatedEventId(sentryId);
        }
        SentryId sentryId2 = this.currentReplayId;
        if (sentryId2 != null) {
            feedback.setReplayId(sentryId2);
        }
        if (Sentry.feedback().capture(feedback).equals(SentryId.EMPTY_ID)) {
            SentryFeedbackOptions.SentryFeedbackCallback onSubmitError = sentryFeedbackOptions.getOnSubmitError();
            if (onSubmitError != null) {
                onSubmitError.call(feedback);
            }
        } else {
            Toast.makeText(getContext(), sentryFeedbackOptions.getSuccessMessageText(), 0).show();
            SentryFeedbackOptions.SentryFeedbackCallback onSubmitSuccess = sentryFeedbackOptions.getOnSubmitSuccess();
            if (onSubmitSuccess != null) {
                onSubmitSuccess.call(feedback);
            }
        }
        cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(View view) {
        cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnDismissListener$4(Runnable runnable, DialogInterface dialogInterface) {
        runnable.run();
        this.currentReplayId = null;
        DialogInterface.OnDismissListener onDismissListener = this.delegate;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shakeListener$0(Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shakeListener$1(WeakReference weakReference) {
        Activity activity = (Activity) weakReference.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new b(5, this, activity));
    }

    private void maybeStartShakeDetection(@NotNull Context context) {
        Activity activity;
        SentryFeedbackOptions feedbackOptions = Sentry.getCurrentScopes().getOptions().getFeedbackOptions();
        if (!this.resolvedFeedbackOptions.isUseShakeGesture() || feedbackOptions.isUseShakeGesture() || (activity = getActivity(context)) == null) {
            return;
        }
        this.shakeDetector = new SentryShakeDetector(Sentry.getCurrentScopes().getOptions().getLogger());
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.shakeDetector.start(activity, shakeListener(weakReference));
        Application application = activity.getApplication();
        ShakeLifecycleCallbacks shakeLifecycleCallbacks = new ShakeLifecycleCallbacks(weakReference);
        this.shakeLifecycleCallbacks = shakeLifecycleCallbacks;
        application.registerActivityLifecycleCallbacks(shakeLifecycleCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public SentryShakeDetector.Listener shakeListener(@NotNull WeakReference<Activity> weakReference) {
        return new e(this, weakReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopShakeDetection() {
        SentryShakeDetector sentryShakeDetector = this.shakeDetector;
        if (sentryShakeDetector != null) {
            sentryShakeDetector.close();
            this.shakeDetector = null;
        }
        if (this.shakeLifecycleCallbacks != null) {
            Activity activity = getActivity(getContext());
            if (activity != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.shakeLifecycleCallbacks);
            }
            this.shakeLifecycleCallbacks = null;
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        User user;
        super.onCreate(bundle);
        setContentView(R.layout.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        setCancelable(this.isCancelable);
        final SentryFeedbackOptions sentryFeedbackOptions = this.resolvedFeedbackOptions;
        TextView textView = (TextView) findViewById(R.id.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(R.id.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_cancel);
        if (sentryFeedbackOptions.isShowBranding()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (sentryFeedbackOptions.isShowName() || sentryFeedbackOptions.isNameRequired()) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText(sentryFeedbackOptions.getNameLabel());
            editText.setHint(sentryFeedbackOptions.getNamePlaceholder());
            if (sentryFeedbackOptions.isNameRequired()) {
                textView2.append(sentryFeedbackOptions.getIsRequiredLabel());
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (sentryFeedbackOptions.isShowEmail() || sentryFeedbackOptions.isEmailRequired()) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText(sentryFeedbackOptions.getEmailLabel());
            editText2.setHint(sentryFeedbackOptions.getEmailPlaceholder());
            if (sentryFeedbackOptions.isEmailRequired()) {
                textView3.append(sentryFeedbackOptions.getIsRequiredLabel());
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (sentryFeedbackOptions.isUseSentryUser() && (user = Sentry.getCurrentScopes().getScope().getUser()) != null) {
            editText.setText(user.getUsername());
            editText2.setText(user.getEmail());
        }
        textView4.setText(sentryFeedbackOptions.getMessageLabel());
        textView4.append(sentryFeedbackOptions.getIsRequiredLabel());
        editText3.setHint(sentryFeedbackOptions.getMessagePlaceholder());
        textView.setText(sentryFeedbackOptions.getFormTitle());
        button.setText(sentryFeedbackOptions.getSubmitButtonLabel());
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25957b.lambda$onCreate$2(editText, editText2, editText3, sentryFeedbackOptions, textView2, textView3, textView4, view);
            }
        });
        button2.setText(sentryFeedbackOptions.getCancelButtonLabel());
        button2.setOnClickListener(new w(this, 1));
        setOnDismissListener(this.delegate);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        SentryOptions options = Sentry.getCurrentScopes().getOptions();
        Runnable onFormOpen = options.getFeedbackOptions().getOnFormOpen();
        if (onFormOpen != null) {
            onFormOpen.run();
        }
        options.getReplayController().captureReplay(Boolean.FALSE);
        this.currentReplayId = options.getReplayController().getReplayId();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z5) {
        super.setCancelable(z5);
        this.isCancelable = z5;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.delegate = onDismissListener;
        final Runnable onFormClose = Sentry.getCurrentScopes().getOptions().getFeedbackOptions().getOnFormClose();
        if (onFormClose != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.y
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f25964b.lambda$setOnDismissListener$4(onFormClose, dialogInterface);
                }
            });
        } else {
            super.setOnDismissListener(this.delegate);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IScopes currentScopes = Sentry.getCurrentScopes();
        SentryOptions options = currentScopes.getOptions();
        if (currentScopes.isEnabled() && options.isEnabled()) {
            super.show();
        } else {
            options.getLogger().log(SentryLevel.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public class ShakeLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        @NotNull
        private final WeakReference<Activity> activityRef;

        public ShakeLifecycleCallbacks(@NotNull WeakReference<Activity> weakReference) {
            this.activityRef = weakReference;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            if (activity == this.activityRef.get()) {
                SentryUserFeedbackForm.this.stopShakeDetection();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            if (activity != this.activityRef.get() || SentryUserFeedbackForm.this.shakeDetector == null) {
                return;
            }
            SentryUserFeedbackForm.this.shakeDetector.stop();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            if (activity != this.activityRef.get() || SentryUserFeedbackForm.this.shakeDetector == null) {
                return;
            }
            SentryUserFeedbackForm.this.shakeDetector.start(activity, SentryUserFeedbackForm.this.shakeListener(this.activityRef));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }
    }
}
