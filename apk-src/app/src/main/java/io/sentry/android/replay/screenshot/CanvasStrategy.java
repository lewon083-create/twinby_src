package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.measurement.b4;
import ij.g;
import ij.h;
import ij.i;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.o;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"NewApi", "UseKtx"})
public final class CanvasStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final ExecutorProvider executor;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final AtomicBoolean lastCaptureSuccessful;

    @NotNull
    private final SentryOptions options;

    @SuppressLint({"NewApi"})
    @NotNull
    private final Runnable pictureRenderTask;

    @NotNull
    private final g prescaledMatrix$delegate;

    @Nullable
    private volatile Bitmap screenshot;

    @NotNull
    private final AutoClosableReentrantLock screenshotLock;

    @Nullable
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    @NotNull
    private final Surface surface;

    @NotNull
    private final SurfaceTexture surfaceTexture;

    @NotNull
    private final TextIgnoringDelegateCanvas textIgnoringCanvas;

    @NotNull
    private AtomicReference<Picture> unprocessedPictureRef;

    public CanvasStrategy(@NotNull ExecutorProvider executor, @Nullable ScreenshotRecorderCallback screenshotRecorderCallback, @NotNull SentryOptions options, @NotNull ScreenshotRecorderConfig config) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.executor = executor;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.unprocessedPictureRef = new AtomicReference<>(null);
        this.screenshotLock = new AutoClosableReentrantLock();
        this.prescaledMatrix$delegate = h.a(i.f21338c, new CanvasStrategy$prescaledMatrix$2(this));
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.textIgnoringCanvas = new TextIgnoringDelegateCanvas();
        this.isClosed = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureE = o.e();
        surfaceTextureE.setDefaultBufferSize(config.getRecordingWidth(), config.getRecordingHeight());
        this.surfaceTexture = surfaceTextureE;
        this.surface = new Surface(surfaceTextureE);
        IntegrationUtils.addIntegrationToSdkVersion("ReplayCanvasStrategy");
        this.pictureRenderTask = new a(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$6(CanvasStrategy canvasStrategy) {
        Bitmap bitmap = canvasStrategy.screenshot;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        canvasStrategy.surface.release();
        canvasStrategy.surfaceTexture.release();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3(final CanvasStrategy canvasStrategy) {
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture andSet = canvasStrategy.unprocessedPictureRef.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = canvasStrategy.surface.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                andSet.draw(canvasLockHardwareCanvas);
                canvasStrategy.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (canvasStrategy.screenshot == null) {
                    ISentryLifecycleToken iSentryLifecycleTokenAcquire = canvasStrategy.screenshotLock.acquire();
                    try {
                        if (canvasStrategy.screenshot == null) {
                            canvasStrategy.screenshot = Bitmap.createBitmap(canvasStrategy.config.getRecordingWidth(), canvasStrategy.config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.f27471a;
                        b4.f(iSentryLifecycleTokenAcquire, null);
                    } finally {
                    }
                }
                if (canvasStrategy.isClosed.get()) {
                    canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = canvasStrategy.surface;
                Bitmap bitmap = canvasStrategy.screenshot;
                Intrinsics.b(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.b
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) {
                        CanvasStrategy.pictureRenderTask$lambda$3$lambda$2(this.f25988a, i);
                    }
                }, canvasStrategy.executor.getBackgroundHandler());
            } catch (Throwable th2) {
                canvasStrategy.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th2;
            }
        } catch (Throwable th3) {
            canvasStrategy.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: picture render failed", th3);
            canvasStrategy.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3$lambda$2(CanvasStrategy canvasStrategy, int i) {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i != 0) {
            canvasStrategy.options.getLogger().log(SentryLevel.ERROR, l7.o.i(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
            canvasStrategy.lastCaptureSuccessful.set(false);
            return;
        }
        canvasStrategy.lastCaptureSuccessful.set(true);
        Bitmap bitmap = canvasStrategy.screenshot;
        if (bitmap == null || bitmap.isRecycled() || (screenshotRecorderCallback = canvasStrategy.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    @SuppressLint({"NewApi"})
    public void capture(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.isClosed.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.config.getRecordingWidth(), this.config.getRecordingHeight());
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(...)");
        this.textIgnoringCanvas.setDelegate(canvasBeginRecording);
        this.textIgnoringCanvas.setMatrix(getPrescaledMatrix());
        root.draw(this.textIgnoringCanvas);
        picture.endRecording();
        if (this.isClosed.get()) {
            return;
        }
        this.unprocessedPictureRef.set(picture);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("screenshot_recorder.canvas", this.pictureRenderTask));
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("CanvasStrategy.close", new a(this, 1)));
        this.unprocessedPictureRef.getAndSet(null);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        Bitmap bitmap;
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || (bitmap = this.screenshot) == null || bitmap.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    public final void postSafely(@NotNull Handler handler, @NotNull ReplayRunnable runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: failed to post runnable " + runnable.getTaskName(), th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
    }
}
