package io.sentry.android.core;

import io.sentry.SentryMaskingOptions;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryScreenshotOptions extends SentryMaskingOptions {
    private void addSensitiveViewClasses() {
        addMaskViewClass(SentryMaskingOptions.WEB_VIEW_CLASS_NAME);
        addMaskViewClass(SentryMaskingOptions.VIDEO_VIEW_CLASS_NAME);
        addMaskViewClass(SentryMaskingOptions.CAMERAX_PREVIEW_VIEW_CLASS_NAME);
        addMaskViewClass(SentryMaskingOptions.ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        addMaskViewClass(SentryMaskingOptions.EXOPLAYER_CLASS_NAME);
        addMaskViewClass(SentryMaskingOptions.EXOPLAYER_STYLED_CLASS_NAME);
    }

    private void removeSensitiveViewClasses() {
        getMaskViewClasses().remove(SentryMaskingOptions.WEB_VIEW_CLASS_NAME);
        getMaskViewClasses().remove(SentryMaskingOptions.VIDEO_VIEW_CLASS_NAME);
        getMaskViewClasses().remove(SentryMaskingOptions.CAMERAX_PREVIEW_VIEW_CLASS_NAME);
        getMaskViewClasses().remove(SentryMaskingOptions.ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        getMaskViewClasses().remove(SentryMaskingOptions.EXOPLAYER_CLASS_NAME);
        getMaskViewClasses().remove(SentryMaskingOptions.EXOPLAYER_STYLED_CLASS_NAME);
    }

    @Override // io.sentry.SentryMaskingOptions
    public void setMaskAllImages(boolean z5) {
        super.setMaskAllImages(z5);
        if (z5) {
            addSensitiveViewClasses();
        } else {
            removeSensitiveViewClasses();
        }
    }

    @Override // io.sentry.SentryMaskingOptions
    public void trackCustomMasking() {
    }
}
