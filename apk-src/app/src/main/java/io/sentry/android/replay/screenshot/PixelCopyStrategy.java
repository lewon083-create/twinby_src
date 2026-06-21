package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import ij.g;
import ij.h;
import ij.i;
import io.appmetrica.analytics.impl.lp;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.MaskRenderer;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
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
@SuppressLint({"UseKtx"})
public final class PixelCopyStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final AtomicBoolean contentChanged;

    @NotNull
    private final DebugOverlayDrawable debugOverlayDrawable;

    @NotNull
    private final g dstOverPaint$delegate;

    @NotNull
    private final ScheduledExecutorService executor;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final AtomicBoolean lastCaptureSuccessful;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    @NotNull
    private final Function0<Unit> markContentChanged;

    @NotNull
    private final MaskRenderer maskRenderer;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final g prescaledMatrix$delegate;

    @NotNull
    private final Bitmap screenshot;

    @NotNull
    private final g screenshotCanvas$delegate;

    @Nullable
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    @NotNull
    private final int[] svLocation;

    @NotNull
    private final RectF tmpDstRect;

    @NotNull
    private final Rect tmpSrcRect;

    @NotNull
    private final int[] windowLocation;

    /* JADX INFO: renamed from: io.sentry.android.replay.screenshot.PixelCopyStrategy$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m619invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m619invoke();
            return Unit.f27471a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class SurfaceViewCapture {

        @NotNull
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f25984x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f25985y;

        public SurfaceViewCapture(@NotNull Bitmap bitmap, int i, int i10) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.f25984x = i;
            this.f25985y = i10;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getX() {
            return this.f25984x;
        }

        public final int getY() {
            return this.f25985y;
        }
    }

    public PixelCopyStrategy(@NotNull ExecutorProvider executorProvider, @Nullable ScreenshotRecorderCallback screenshotRecorderCallback, @NotNull SentryOptions options, @NotNull ScreenshotRecorderConfig config, @NotNull DebugOverlayDrawable debugOverlayDrawable, @NotNull Function0<Unit> markContentChanged) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        Intrinsics.checkNotNullParameter(markContentChanged, "markContentChanged");
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.markContentChanged = markContentChanged;
        this.executor = executorProvider.getExecutor();
        this.mainLooperHandler = executorProvider.getMainLooperHandler();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.screenshot = bitmapCreateBitmap;
        i iVar = i.f21338c;
        this.prescaledMatrix$delegate = h.a(iVar, new PixelCopyStrategy$prescaledMatrix$2(this));
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.maskRenderer = new MaskRenderer();
        this.contentChanged = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
        this.dstOverPaint$delegate = h.a(iVar, PixelCopyStrategy$dstOverPaint$2.INSTANCE);
        this.screenshotCanvas$delegate = h.a(iVar, new PixelCopyStrategy$screenshotCanvas$2(this));
        this.tmpSrcRect = new Rect();
        this.tmpDstRect = new RectF();
        this.windowLocation = new int[2];
        this.svLocation = new int[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaskingAndNotify(View view, ViewHierarchyNode viewHierarchyNode) {
        if (this.isClosed.get() || this.screenshot.isRecycled()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        List<Rect> listRenderMasks = this.maskRenderer.renderMasks(this.screenshot, viewHierarchyNode, getPrescaledMatrix());
        if (this.options.getReplayController().isDebugMaskingOverlayEnabled()) {
            this.mainLooperHandler.post(new a1.c(this, view, listRenderMasks, 22));
        }
        ScreenshotRecorderCallback screenshotRecorderCallback = this.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
        }
        this.lastCaptureSuccessful.set(true);
        this.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyMaskingAndNotify$lambda$2(PixelCopyStrategy pixelCopyStrategy, View view, List list) {
        if (pixelCopyStrategy.debugOverlayDrawable.getCallback() == null) {
            view.getOverlay().add(pixelCopyStrategy.debugOverlayDrawable);
        }
        pixelCopyStrategy.debugOverlayDrawable.updateMasks(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$1(PixelCopyStrategy pixelCopyStrategy, View view, int i) {
        if (pixelCopyStrategy.isClosed.get()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i != 0) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
            pixelCopyStrategy.lastCaptureSuccessful.set(false);
            return;
        }
        if (pixelCopyStrategy.contentChanged.get()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            pixelCopyStrategy.lastCaptureSuccessful.set(false);
            return;
        }
        ViewHierarchyNode.Companion companion = ViewHierarchyNode.Companion;
        SentryReplayOptions sessionReplay = pixelCopyStrategy.options.getSessionReplay();
        Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
        ViewHierarchyNode viewHierarchyNodeFromView = companion.fromView(view, null, 0, sessionReplay);
        ArrayList arrayList = pixelCopyStrategy.options.getSessionReplay().isCaptureSurfaceViews() ? new ArrayList() : null;
        SentryReplayOptions sessionReplay2 = pixelCopyStrategy.options.getSessionReplay();
        Intrinsics.checkNotNullExpressionValue(sessionReplay2, "getSessionReplay(...)");
        ILogger logger = pixelCopyStrategy.options.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        ViewsKt.traverse(view, viewHierarchyNodeFromView, sessionReplay2, logger, arrayList);
        if (arrayList == null || arrayList.isEmpty()) {
            pixelCopyStrategy.executor.submit(new ReplayRunnable("screenshot_recorder.mask", new a1.c(pixelCopyStrategy, view, viewHierarchyNodeFromView, 23)));
        } else {
            pixelCopyStrategy.markContentChanged.invoke();
            pixelCopyStrategy.captureSurfaceViews(view, arrayList, viewHierarchyNodeFromView);
        }
    }

    @SuppressLint({"NewApi"})
    private final void captureSurfaceViews(final View view, List<ViewHierarchyNode.SurfaceViewHierarchyNode> list, final ViewHierarchyNode viewHierarchyNode) {
        SurfaceViewCapture[] surfaceViewCaptureArr;
        AtomicInteger atomicInteger;
        final PixelCopyStrategy pixelCopyStrategy;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener;
        SurfaceHolder holder;
        PixelCopyStrategy pixelCopyStrategy2 = this;
        view.getLocationOnScreen(pixelCopyStrategy2.windowLocation);
        int[] iArr = pixelCopyStrategy2.windowLocation;
        char c8 = 0;
        int i = iArr[0];
        int i10 = iArr[1];
        SurfaceViewCapture[] surfaceViewCaptureArr2 = new SurfaceViewCapture[list.size()];
        AtomicInteger atomicInteger2 = new AtomicInteger(list.size());
        Iterator<T> it = list.iterator();
        final SurfaceViewCapture[] surfaceViewCaptureArr3 = surfaceViewCaptureArr2;
        final int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            SurfaceView surfaceView = ((ViewHierarchyNode.SurfaceViewHierarchyNode) it.next()).getSurfaceViewRef().get();
            final Bitmap bitmapCreateBitmap = null;
            Surface surface = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? null : holder.getSurface();
            if (surfaceView == null || surface == null) {
                pixelCopyStrategy2 = this;
            } else {
                if (surface.isValid()) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                        try {
                            surfaceView.getLocationOnScreen(pixelCopyStrategy2.svLocation);
                            int[] iArr2 = pixelCopyStrategy2.svLocation;
                            try {
                                final int i13 = iArr2[c8];
                                final int i14 = iArr2[1];
                                final int i15 = i;
                                final int i16 = i10;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                pixelCopyStrategy = this;
                                try {
                                    onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.c
                                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                        public final void onPixelCopyFinished(int i17) {
                                            PixelCopyStrategy.captureSurfaceViews$lambda$3(this.f25989a, bitmapCreateBitmap, surfaceViewCaptureArr3, i11, i13, i14, atomicInteger3, view, viewHierarchyNode, i15, i16, i17);
                                        }
                                    };
                                    atomicInteger = atomicInteger3;
                                    i = i15;
                                    i10 = i16;
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicInteger = atomicInteger3;
                                    i = i15;
                                    i10 = i16;
                                }
                                try {
                                    PixelCopy.request(surfaceView, bitmapCreateBitmap, onPixelCopyFinishedListener, pixelCopyStrategy.mainLooperHandler.getHandler());
                                    atomicInteger2 = atomicInteger;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    pixelCopyStrategy.options.getLogger().log(SentryLevel.WARNING, "Failed to capture SurfaceView", th);
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    PixelCopyStrategy pixelCopyStrategy3 = pixelCopyStrategy;
                                    atomicInteger2 = atomicInteger;
                                    surfaceViewCaptureArr = surfaceViewCaptureArr3;
                                    captureSurfaceViews$onCaptureComplete(atomicInteger2, pixelCopyStrategy3, view, surfaceViewCaptureArr, viewHierarchyNode, i, i10);
                                    surfaceViewCaptureArr3 = surfaceViewCaptureArr;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                atomicInteger = atomicInteger2;
                                pixelCopyStrategy = this;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            atomicInteger = atomicInteger2;
                            pixelCopyStrategy = pixelCopyStrategy2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        atomicInteger = atomicInteger2;
                        pixelCopyStrategy = pixelCopyStrategy2;
                    }
                    c8 = 0;
                    pixelCopyStrategy2 = this;
                    i11 = i12;
                }
                surfaceViewCaptureArr3 = surfaceViewCaptureArr;
                c8 = 0;
                pixelCopyStrategy2 = this;
                i11 = i12;
            }
            surfaceViewCaptureArr = surfaceViewCaptureArr3;
            captureSurfaceViews$onCaptureComplete(atomicInteger2, pixelCopyStrategy2, view, surfaceViewCaptureArr, viewHierarchyNode, i, i10);
            surfaceViewCaptureArr3 = surfaceViewCaptureArr;
            c8 = 0;
            pixelCopyStrategy2 = this;
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureSurfaceViews$lambda$3(PixelCopyStrategy pixelCopyStrategy, Bitmap bitmap, SurfaceViewCapture[] surfaceViewCaptureArr, int i, int i10, int i11, AtomicInteger atomicInteger, View view, ViewHierarchyNode viewHierarchyNode, int i12, int i13, int i14) {
        if (pixelCopyStrategy.isClosed.get()) {
            bitmap.recycle();
            captureSurfaceViews$onCaptureComplete(atomicInteger, pixelCopyStrategy, view, surfaceViewCaptureArr, viewHierarchyNode, i12, i13);
            return;
        }
        if (i14 == 0) {
            surfaceViewCaptureArr[i] = new SurfaceViewCapture(bitmap, i10, i11);
        } else {
            bitmap.recycle();
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i14));
        }
        captureSurfaceViews$onCaptureComplete(atomicInteger, pixelCopyStrategy, view, surfaceViewCaptureArr, viewHierarchyNode, i12, i13);
    }

    private static final void captureSurfaceViews$onCaptureComplete(AtomicInteger atomicInteger, PixelCopyStrategy pixelCopyStrategy, View view, SurfaceViewCapture[] surfaceViewCaptureArr, ViewHierarchyNode viewHierarchyNode, int i, int i10) {
        if (atomicInteger.decrementAndGet() == 0) {
            pixelCopyStrategy.compositeSurfaceViewsAndMask(view, surfaceViewCaptureArr, viewHierarchyNode, i, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$6(PixelCopyStrategy pixelCopyStrategy) {
        if (!pixelCopyStrategy.screenshot.isRecycled()) {
            synchronized (pixelCopyStrategy.screenshot) {
                try {
                    if (!pixelCopyStrategy.screenshot.isRecycled()) {
                        pixelCopyStrategy.screenshot.recycle();
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        pixelCopyStrategy.maskRenderer.close();
    }

    private final void compositeSurfaceViewsAndMask(final View view, final SurfaceViewCapture[] surfaceViewCaptureArr, final ViewHierarchyNode viewHierarchyNode, final int i, final int i10) {
        this.executor.submit(new ReplayRunnable("screenshot_recorder.composite", new Runnable() { // from class: io.sentry.android.replay.screenshot.d
            @Override // java.lang.Runnable
            public final void run() {
                PixelCopyStrategy.compositeSurfaceViewsAndMask$lambda$4(this.f25999b, surfaceViewCaptureArr, i, i10, view, viewHierarchyNode);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void compositeSurfaceViewsAndMask$lambda$4(PixelCopyStrategy pixelCopyStrategy, SurfaceViewCapture[] surfaceViewCaptureArr, int i, int i10, View view, ViewHierarchyNode viewHierarchyNode) {
        if (pixelCopyStrategy.isClosed.get() || pixelCopyStrategy.screenshot.isRecycled()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
            pixelCopyStrategy.recycleCaptures(surfaceViewCaptureArr);
            return;
        }
        for (SurfaceViewCapture surfaceViewCapture : surfaceViewCaptureArr) {
            if (surfaceViewCapture != null && !surfaceViewCapture.getBitmap().isRecycled()) {
                PixelCopyStrategyKt.compositeSurfaceViewInto(pixelCopyStrategy.getScreenshotCanvas(), pixelCopyStrategy.getDstOverPaint(), pixelCopyStrategy.tmpSrcRect, pixelCopyStrategy.tmpDstRect, surfaceViewCapture.getBitmap(), surfaceViewCapture.getX(), surfaceViewCapture.getY(), i, i10, pixelCopyStrategy.config.getScaleFactorX(), pixelCopyStrategy.config.getScaleFactorY());
                surfaceViewCapture.getBitmap().recycle();
            }
        }
        pixelCopyStrategy.applyMaskingAndNotify(view, viewHierarchyNode);
    }

    private final Paint getDstOverPaint() {
        return (Paint) this.dstOverPaint$delegate.getValue();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix$delegate.getValue();
    }

    private final Canvas getScreenshotCanvas() {
        return (Canvas) this.screenshotCanvas$delegate.getValue();
    }

    private final void recycleCaptures(SurfaceViewCapture[] surfaceViewCaptureArr) {
        for (SurfaceViewCapture surfaceViewCapture : surfaceViewCaptureArr) {
            if (surfaceViewCapture != null && !surfaceViewCapture.getBitmap().isRecycled()) {
                surfaceViewCapture.getBitmap().recycle();
            }
        }
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    @SuppressLint({"NewApi"})
    public void capture(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window phoneWindow = WindowsKt.getPhoneWindow(root);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.isClosed.get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            PixelCopy.request(phoneWindow, this.screenshot, new io.sentry.android.core.internal.util.c(1, this, root), this.mainLooperHandler.getHandler());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th2);
            this.lastCaptureSuccessful.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        this.executor.submit(new ReplayRunnable("PixelCopyStrategy.close", new lp(7, this)));
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || this.screenshot.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
        this.contentChanged.set(true);
    }

    public /* synthetic */ PixelCopyStrategy(ExecutorProvider executorProvider, ScreenshotRecorderCallback screenshotRecorderCallback, SentryOptions sentryOptions, ScreenshotRecorderConfig screenshotRecorderConfig, DebugOverlayDrawable debugOverlayDrawable, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorProvider, screenshotRecorderCallback, sentryOptions, screenshotRecorderConfig, debugOverlayDrawable, (i & 32) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
