package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SentryMaskingOptions {
    public static final String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
    public static final String CAMERAX_PREVIEW_VIEW_CLASS_NAME = "androidx.camera.view.PreviewView";
    public static final String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
    public static final String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
    public static final String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
    public static final String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
    public static final String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
    public static final String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";
    protected Set<String> maskViewClasses = new CopyOnWriteArraySet();
    protected Set<String> unmaskViewClasses = new CopyOnWriteArraySet();

    @Nullable
    protected String maskViewContainerClass = null;

    @Nullable
    protected String unmaskViewContainerClass = null;

    public void addMaskViewClass(@NotNull String str) {
        this.maskViewClasses.add(str);
        this.unmaskViewClasses.remove(str);
    }

    public void addUnmaskViewClass(@NotNull String str) {
        this.unmaskViewClasses.add(str);
        this.maskViewClasses.remove(str);
    }

    @NotNull
    public Set<String> getMaskViewClasses() {
        return this.maskViewClasses;
    }

    @Nullable
    public String getMaskViewContainerClass() {
        return this.maskViewContainerClass;
    }

    @NotNull
    public Set<String> getUnmaskViewClasses() {
        return this.unmaskViewClasses;
    }

    @Nullable
    public String getUnmaskViewContainerClass() {
        return this.unmaskViewContainerClass;
    }

    public void setMaskAllImages(boolean z5) {
        if (z5) {
            this.maskViewClasses.add(IMAGE_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        } else {
            this.unmaskViewClasses.add(IMAGE_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        }
    }

    public void setMaskAllText(boolean z5) {
        if (z5) {
            this.maskViewClasses.add(TEXT_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        } else {
            this.unmaskViewClasses.add(TEXT_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        }
    }

    public void setMaskViewContainerClass(@NotNull String str) {
        this.maskViewClasses.add(str);
        this.maskViewContainerClass = str;
    }

    public void setUnmaskViewContainerClass(@NotNull String str) {
        this.unmaskViewContainerClass = str;
    }

    public abstract void trackCustomMasking();
}
