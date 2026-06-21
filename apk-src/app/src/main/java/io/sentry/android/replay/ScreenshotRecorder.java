package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import ij.j;
import io.sentry.ScreenshotStrategyType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.screenshot.CanvasStrategy;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import io.sentry.android.replay.screenshot.ScreenshotStrategy;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.ViewsKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"UseKtx", "UseRequiresApi"})
@TargetApi(26)
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {
    public static final int $stable = 8;

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final AtomicBoolean contentChanged;

    @NotNull
    private final DebugOverlayDrawable debugOverlayDrawable;

    @NotNull
    private final ExecutorProvider executorProvider;

    @NotNull
    private final AtomicBoolean isCapturing;

    @NotNull
    private final SentryOptions options;

    @Nullable
    private WeakReference<View> rootView;

    @NotNull
    private final ScreenshotStrategy screenshotStrategy;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenshotStrategyType.values().length];
            try {
                iArr[ScreenshotStrategyType.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenshotStrategyType.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScreenshotRecorder(@NotNull ScreenshotRecorderConfig config, @NotNull SentryOptions options, @NotNull ExecutorProvider executorProvider, @Nullable ScreenshotRecorderCallback screenshotRecorderCallback) {
        ScreenshotStrategy canvasStrategy;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.config = config;
        this.options = options;
        this.executorProvider = executorProvider;
        this.isCapturing = new AtomicBoolean(true);
        DebugOverlayDrawable debugOverlayDrawable = new DebugOverlayDrawable();
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.contentChanged = new AtomicBoolean(false);
        int i = WhenMappings.$EnumSwitchMapping$0[options.getSessionReplay().getScreenshotStrategy().ordinal()];
        if (i == 1) {
            canvasStrategy = new CanvasStrategy(executorProvider, screenshotRecorderCallback, options, config);
        } else {
            if (i != 2) {
                throw new j();
            }
            canvasStrategy = new PixelCopyStrategy(executorProvider, screenshotRecorderCallback, options, config, debugOverlayDrawable, new ScreenshotRecorder$screenshotStrategy$1(this));
        }
        this.screenshotStrategy = canvasStrategy;
    }

    public final void bind(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        ViewsKt.addOnDrawListenerSafe(root, this);
        this.contentChanged.set(true);
        this.screenshotStrategy.onContentChanged();
    }

    public final void capture() {
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.isCapturing.get()));
        }
        if (!this.isCapturing.get()) {
            if (this.options.getSessionReplay().isDebug()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.contentChanged.get()), Boolean.valueOf(this.screenshotStrategy.lastCaptureSuccessful()));
        }
        if (!this.contentChanged.get()) {
            this.screenshotStrategy.emitLastScreenshot();
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (WindowsKt.getPhoneWindow(view) == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            this.screenshotStrategy.capture(view);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void close() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.screenshotStrategy.close();
    }

    @NotNull
    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.executorProvider;
    }

    @NotNull
    public final SentryOptions getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.isCapturing.get()) {
            WeakReference<View> weakReference = this.rootView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.contentChanged.set(true);
                this.screenshotStrategy.onContentChanged();
            }
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(@Nullable View view) {
        ViewOverlay overlay;
        if (this.options.getReplayController().isDebugMaskingOverlayEnabled() && view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(this.debugOverlayDrawable);
        }
        if (view != null) {
            ViewsKt.removeOnDrawListenerSafe(view, this);
        }
    }
}
