package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import io.sentry.android.core.SentryUserFeedbackForm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SentryUserFeedbackButton extends Button {

    @Nullable
    private View.OnClickListener delegate;

    @Deprecated
    public SentryUserFeedbackButton(Context context) throws Exception {
        super(context);
        init(context, null, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    private void init(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i10) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SentryUserFeedbackButton, i, i10);
        boolean z5 = false;
        try {
            float f10 = context.getResources().getDisplayMetrics().density;
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SentryUserFeedbackButton_android_drawablePadding, -1.0f);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SentryUserFeedbackButton_android_drawableStart, -1);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SentryUserFeedbackButton_android_textAllCaps, false);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SentryUserFeedbackButton_android_background, -1);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SentryUserFeedbackButton_android_padding, -1.0f);
            int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SentryUserFeedbackButton_android_textColor, -1);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.SentryUserFeedbackButton_android_text);
            if (dimension == -1.0f) {
                setCompoundDrawablePadding((int) (4.0f * f10));
            }
            if (resourceId == -1) {
                setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.sentry_user_feedback_button_logo_24, 0, 0, 0);
            }
            setAllCaps(z10);
            if (resourceId2 == -1) {
                setBackgroundResource(R.drawable.sentry_oval_button_ripple_background);
            }
            if (dimension2 == -1.0f) {
                int i11 = (int) (f10 * 12.0f);
                setPadding(i11, i11, i11, i11);
            }
            if (color == -1) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorForeground, typedValue, true);
                setTextColor(context.getResources().getColor(typedValue.resourceId, context.getTheme()));
            }
            if (string == null) {
                setText("Report a Bug");
            }
            if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
                typedArrayObtainStyledAttributes.close();
            } else if (typedArrayObtainStyledAttributes instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) typedArrayObtainStyledAttributes;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z5) {
                                executorService.shutdownNow();
                                z5 = true;
                            }
                        }
                    }
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                typedArrayObtainStyledAttributes.recycle();
            }
            setOnClickListener(this.delegate);
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes == 0) {
                throw th2;
            }
            try {
                if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
                    typedArrayObtainStyledAttributes.close();
                    throw th2;
                }
                if (!(typedArrayObtainStyledAttributes instanceof ExecutorService)) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
                ExecutorService executorService2 = (ExecutorService) typedArrayObtainStyledAttributes;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    throw th2;
                }
                executorService2.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused2) {
                        if (!z5) {
                            executorService2.shutdownNow();
                            z5 = true;
                        }
                    }
                }
                if (!z5) {
                    throw th2;
                }
                Thread.currentThread().interrupt();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$0(View view) {
        new SentryUserFeedbackForm.Builder(getContext()).create().show();
        View.OnClickListener onClickListener = this.delegate;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.delegate = onClickListener;
        super.setOnClickListener(new w(this, 0));
    }

    @Deprecated
    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    @Deprecated
    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i) throws Exception {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    @Deprecated
    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i, int i10) throws Exception {
        super(context, attributeSet, i, i10);
        init(context, attributeSet, i, i10);
    }
}
