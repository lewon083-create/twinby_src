package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.measurement.b4;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class WindowRecorder implements Recorder, OnRootViewsChangedListener, ExecutorProvider {
    public static final int $stable = 8;

    @Nullable
    private volatile Handler backgroundProcessingHandler;

    @NotNull
    private final AutoClosableReentrantLock backgroundProcessingHandlerLock;

    @Nullable
    private volatile HandlerThread backgroundProcessingHandlerThread;

    @Nullable
    private volatile Capturer capturer;

    @NotNull
    private final AutoClosableReentrantLock capturerLock;

    @NotNull
    private final AtomicBoolean isRecording;

    @NotNull
    private Point lastKnownWindowSize;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ScheduledExecutorService replayExecutor;

    @NotNull
    private final WeakHashMap<View, View.OnLayoutChangeListener> rootLayoutListeners;

    @NotNull
    private final ArrayList<WeakReference<View>> rootViews;

    @NotNull
    private final AutoClosableReentrantLock rootViewsLock;

    @Nullable
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    @NotNull
    private final WindowCallback windowCallback;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Capturer implements Runnable {

        @Nullable
        private ScreenshotRecorderConfig config;

        @NotNull
        private final AtomicBoolean isRecording;

        @NotNull
        private final MainLooperHandler mainLooperHandler;

        @NotNull
        private final SentryOptions options;

        @Nullable
        private ScreenshotRecorder recorder;

        public Capturer(@NotNull SentryOptions options, @NotNull MainLooperHandler mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.options = options;
            this.mainLooperHandler = mainLooperHandler;
            this.isRecording = new AtomicBoolean(true);
        }

        @Nullable
        public final ScreenshotRecorderConfig getConfig() {
            return this.config;
        }

        @Nullable
        public final ScreenshotRecorder getRecorder() {
            return this.recorder;
        }

        public final void pause() {
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.pause();
            }
            this.isRecording.getAndSet(false);
        }

        public final void resume() {
            if (this.options.getSessionReplay().isDebug()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.resume();
            }
            this.isRecording.getAndSet(true);
            this.mainLooperHandler.removeCallbacks(this);
            if (this.mainLooperHandler.post(this)) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.isRecording.get()) {
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Capturing a frame.", new Object[0]);
                }
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.capture();
                }
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture a frame", th2);
            }
            if (this.options.getSessionReplay().isDebug()) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                StringBuilder sb2 = new StringBuilder("Posting the capture runnable again, frame rate is ");
                ScreenshotRecorderConfig screenshotRecorderConfig = this.config;
                logger.log(sentryLevel, z.d(screenshotRecorderConfig != null ? screenshotRecorderConfig.getFrameRate() : 1, " fps.", sb2), new Object[0]);
            }
            MainLooperHandler mainLooperHandler = this.mainLooperHandler;
            ScreenshotRecorderConfig screenshotRecorderConfig2 = this.config;
            if (mainLooperHandler.postDelayed(this, 1000 / ((long) (screenshotRecorderConfig2 != null ? screenshotRecorderConfig2.getFrameRate() : 1)))) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }

        public final void setConfig(@Nullable ScreenshotRecorderConfig screenshotRecorderConfig) {
            this.config = screenshotRecorderConfig;
        }

        public final void setRecorder(@Nullable ScreenshotRecorder screenshotRecorder) {
            this.recorder = screenshotRecorder;
        }

        public final void stop() {
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.close();
            }
            this.recorder = null;
            this.isRecording.getAndSet(false);
        }
    }

    public WindowRecorder(@NotNull SentryOptions options, @Nullable ScreenshotRecorderCallback screenshotRecorderCallback, @NotNull WindowCallback windowCallback, @NotNull MainLooperHandler mainLooperHandler, @NotNull ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.windowCallback = windowCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.lastKnownWindowSize = new Point();
        this.rootLayoutListeners = new WeakHashMap<>();
        this.rootViewsLock = new AutoClosableReentrantLock();
        this.capturerLock = new AutoClosableReentrantLock();
        this.backgroundProcessingHandlerLock = new AutoClosableReentrantLock();
    }

    private final void attachLayoutListener(View view) {
        if (this.rootLayoutListeners.containsKey(view)) {
            return;
        }
        c cVar = new c(0, this);
        this.rootLayoutListeners.put(view, cVar);
        view.addOnLayoutChangeListener(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachLayoutListener$lambda$1(WindowRecorder windowRecorder, View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i12 - i10;
        int i18 = i16 - i14;
        if (i11 - i == i15 - i13 && i17 == i18) {
            return;
        }
        WeakReference weakReference = (WeakReference) CollectionsKt.K(windowRecorder.rootViews);
        if (Intrinsics.a(view, weakReference != null ? (View) weakReference.get() : null)) {
            Intrinsics.b(view);
            windowRecorder.determineWindowSize(view);
        }
    }

    private final void detachLayoutListener(View view) {
        View.OnLayoutChangeListener onLayoutChangeListenerRemove = this.rootLayoutListeners.remove(view);
        if (onLayoutChangeListenerRemove != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListenerRemove);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        reset();
        this.mainLooperHandler.removeCallbacks(this.capturer);
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.backgroundProcessingHandlerLock.acquire();
        try {
            Handler handler = this.backgroundProcessingHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            b4.f(iSentryLifecycleTokenAcquire, null);
            stop();
        } finally {
        }
    }

    public final void determineWindowSize(@NotNull final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (!ViewsKt.hasSize(root)) {
            ViewsKt.addOnPreDrawListenerSafe(root, new ViewTreeObserver.OnPreDrawListener() { // from class: io.sentry.android.replay.WindowRecorder.determineWindowSize.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    WeakReference weakReference = (WeakReference) CollectionsKt.K(WindowRecorder.this.rootViews);
                    if (!Intrinsics.a(root, weakReference != null ? (View) weakReference.get() : null)) {
                        ViewsKt.removeOnPreDrawListenerSafe(root, this);
                        return true;
                    }
                    if (ViewsKt.hasSize(root)) {
                        ViewsKt.removeOnPreDrawListenerSafe(root, this);
                        if (root.getWidth() != WindowRecorder.this.lastKnownWindowSize.x || root.getHeight() != WindowRecorder.this.lastKnownWindowSize.y) {
                            WindowRecorder.this.lastKnownWindowSize.set(root.getWidth(), root.getHeight());
                            WindowRecorder.this.windowCallback.onWindowSizeChanged(root.getWidth(), root.getHeight());
                        }
                    }
                    return true;
                }
            });
        } else {
            if (root.getWidth() == this.lastKnownWindowSize.x && root.getHeight() == this.lastKnownWindowSize.y) {
                return;
            }
            this.lastKnownWindowSize.set(root.getWidth(), root.getHeight());
            this.windowCallback.onWindowSizeChanged(root.getWidth(), root.getHeight());
        }
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    @NotNull
    public Handler getBackgroundHandler() {
        if (this.backgroundProcessingHandler == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.backgroundProcessingHandlerLock.acquire();
            try {
                if (this.backgroundProcessingHandler == null) {
                    this.backgroundProcessingHandlerThread = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.backgroundProcessingHandlerThread;
                    Intrinsics.b(handlerThread2);
                    this.backgroundProcessingHandler = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.f27471a;
                b4.f(iSentryLifecycleTokenAcquire, null);
            } finally {
            }
        }
        Handler handler = this.backgroundProcessingHandler;
        Intrinsics.b(handler);
        return handler;
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    @NotNull
    public ScheduledExecutorService getExecutor() {
        return this.replayExecutor;
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    @NotNull
    public MainLooperHandler getMainLooperHandler() {
        return this.mainLooperHandler;
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig config) {
        Capturer capturer;
        ScreenshotRecorder recorder;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isRecording.get()) {
            if (this.capturer == null) {
                ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.capturerLock.acquire();
                try {
                    if (this.capturer == null) {
                        this.capturer = new Capturer(this.options, this.mainLooperHandler);
                    }
                    Unit unit = Unit.f27471a;
                    b4.f(iSentryLifecycleTokenAcquire, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b4.f(iSentryLifecycleTokenAcquire, th2);
                        throw th3;
                    }
                }
            }
            Capturer capturer2 = this.capturer;
            if (capturer2 != null) {
                capturer2.setConfig(config);
            }
            Capturer capturer3 = this.capturer;
            if (capturer3 != null) {
                capturer3.setRecorder(new ScreenshotRecorder(config, this.options, this, this.screenshotRecorderCallback));
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.K(this.rootViews);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (capturer = this.capturer) != null && (recorder = capturer.getRecorder()) != null) {
                recorder.bind(view);
            }
            this.mainLooperHandler.removeCallbacks(this.capturer);
            if (this.mainLooperHandler.postDelayed(this.capturer, 100L)) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(@NotNull View root, boolean z5) {
        ScreenshotRecorder recorder;
        ScreenshotRecorder recorder2;
        ScreenshotRecorder recorder3;
        Intrinsics.checkNotNullParameter(root, "root");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            if (!z5) {
                detachLayoutListener(root);
                Capturer capturer = this.capturer;
                if (capturer != null && (recorder2 = capturer.getRecorder()) != null) {
                    recorder2.unbind(root);
                }
                x.p(this.rootViews, new WindowRecorder$onRootViewsChanged$1$1(root));
                WeakReference weakReference = (WeakReference) CollectionsKt.K(this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.a(root, view)) {
                    Capturer capturer2 = this.capturer;
                    if (capturer2 != null && (recorder = capturer2.getRecorder()) != null) {
                        recorder.bind(view);
                    }
                    determineWindowSize(view);
                    attachLayoutListener(view);
                }
            } else {
                if (WindowsKt.getPhoneWindow(root) == null) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    b4.f(iSentryLifecycleTokenAcquire, null);
                    return;
                }
                this.rootViews.add(new WeakReference<>(root));
                Capturer capturer3 = this.capturer;
                if (capturer3 != null && (recorder3 = capturer3.getRecorder()) != null) {
                    recorder3.bind(root);
                }
                determineWindowSize(root);
                attachLayoutListener(root);
            }
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b4.f(iSentryLifecycleTokenAcquire, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.pause();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        ScreenshotRecorder recorder;
        this.lastKnownWindowSize.set(0, 0);
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    detachLayoutListener(view);
                    Capturer capturer = this.capturer;
                    if (capturer != null && (recorder = capturer.getRecorder()) != null) {
                        recorder.unbind(view);
                    }
                }
            }
            this.rootViews.clear();
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.resume();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        this.isRecording.getAndSet(true);
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.stop();
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.capturerLock.acquire();
        try {
            this.capturer = null;
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
            this.isRecording.set(false);
        } finally {
        }
    }

    public /* synthetic */ WindowRecorder(SentryOptions sentryOptions, ScreenshotRecorderCallback screenshotRecorderCallback, WindowCallback windowCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, (i & 2) != 0 ? null : screenshotRecorderCallback, windowCallback, mainLooperHandler, scheduledExecutorService);
    }
}
