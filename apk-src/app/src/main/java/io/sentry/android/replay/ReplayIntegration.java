package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.measurement.b4;
import ij.g;
import ij.h;
import io.appmetrica.analytics.impl.lp;
import io.sentry.Breadcrumb;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.NoOpReplayBreadcrumbConverter;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.ReplayController;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ReplayExecutorService;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Random;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;
import kotlin.text.a0;
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
public final class ReplayIntegration implements Integration, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, ReplayController, IConnectionStatusProvider.IConnectionStatusObserver, RateLimiter.IRateLimitObserver, WindowCallback {

    @Nullable
    private CaptureStrategy captureStrategy;

    @NotNull
    private final Context context;

    @NotNull
    private final ICurrentDateProvider dateProvider;
    private boolean debugMaskingEnabled;

    @Nullable
    private GestureRecorder gestureRecorder;

    @Nullable
    private Function0<GestureRecorder> gestureRecorderProvider;

    @NotNull
    private final AtomicBoolean isEnabled;

    @NotNull
    private final AtomicBoolean isManualPause;

    @NotNull
    private volatile IConnectionStatusProvider.ConnectionStatus lastKnownConnectionStatus;

    @NotNull
    private final ReplayLifecycle lifecycle;

    @NotNull
    private final AutoClosableReentrantLock lifecycleLock;

    @NotNull
    private MainLooperHandler mainLooperHandler;
    private SentryOptions options;

    @NotNull
    private final g random$delegate;

    @Nullable
    private Recorder recorder;

    @Nullable
    private final Function0<Recorder> recorderProvider;

    @NotNull
    private ReplayBreadcrumbConverter replayBreadcrumbConverter;

    @Nullable
    private final Function1<SentryId, ReplayCache> replayCacheProvider;

    @Nullable
    private Function1<? super Boolean, ? extends CaptureStrategy> replayCaptureStrategyProvider;

    @NotNull
    private final g replayExecutor$delegate;

    @NotNull
    private final g rootViewsSpy$delegate;

    @Nullable
    private IScopes scopes;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class PreviousReplayHint implements Backfillable {
        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r8) {
            Intrinsics.checkNotNullParameter(r8, "r");
            StringBuilder sb2 = new StringBuilder("SentryReplayIntegration-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb2.append(i);
            Thread thread = new Thread(r8, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$captureReplay$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<Date, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Date) obj);
            return Unit.f27471a;
        }

        public final void invoke(Date newTimestamp) {
            Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
            CaptureStrategy captureStrategy = ReplayIntegration.this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy captureStrategy2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = captureStrategy2 != null ? Integer.valueOf(captureStrategy2.getCurrentSegment()) : null;
                Intrinsics.b(numValueOf);
                captureStrategy.setCurrentSegment(numValueOf.intValue() + 1);
            }
            CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
            if (captureStrategy3 == null) {
                return;
            }
            captureStrategy3.setSegmentTimestamp(newTimestamp);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function2<ReplayCache, Long, Unit> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ f0 $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bitmap bitmap, f0 f0Var) {
            super(2);
            this.$bitmap = bitmap;
            this.$screen = f0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return Unit.f27471a;
        }

        public final void invoke(ReplayCache onScreenshotRecorded, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.addFrame$sentry_android_replay_release(this.$bitmap, j10, (String) this.$screen.f27510b);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass3 extends r implements Function2<ReplayCache, Long, Unit> {
        final /* synthetic */ long $frameTimestamp;
        final /* synthetic */ File $screenshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(File file, long j10) {
            super(2);
            this.$screenshot = file;
            this.$frameTimestamp = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return Unit.f27471a;
        }

        public final void invoke(ReplayCache onScreenshotRecorded, long j10) {
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            ReplayCache.addFrame$default(onScreenshotRecorded, this.$screenshot, this.$frameTimestamp, null, 4, null);
        }
    }

    static {
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-replay", "8.41.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(@NotNull Context context, @NotNull ICurrentDateProvider dateProvider, @Nullable Function0<? extends Recorder> function0, @Nullable Function1<? super SentryId, ReplayCache> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.replayCacheProvider = function1;
        this.lastKnownConnectionStatus = IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        this.random$delegate = h.b(ReplayIntegration$random$2.INSTANCE);
        this.rootViewsSpy$delegate = h.b(ReplayIntegration$rootViewsSpy$2.INSTANCE);
        this.replayExecutor$delegate = h.b(new ReplayIntegration$replayExecutor$2(this));
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        NoOpReplayBreadcrumbConverter noOpReplayBreadcrumbConverter = NoOpReplayBreadcrumbConverter.getInstance();
        Intrinsics.checkNotNullExpressionValue(noOpReplayBreadcrumbConverter, "getInstance(...)");
        this.replayBreadcrumbConverter = noOpReplayBreadcrumbConverter;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.lifecycleLock = new AutoClosableReentrantLock();
        this.lifecycle = new ReplayLifecycle();
    }

    private final void checkCanRecord() {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (this.lastKnownConnectionStatus == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(String str) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.b(name);
            if (a0.n(name, "replay_", false)) {
                String string = getReplayId().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (!StringsKt.y(name, string, false) && (StringsKt.D(str) || !StringsKt.y(name, str, false))) {
                    FileUtils.deleteRecursively(file);
                }
            }
        }
    }

    public static /* synthetic */ void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        ISentryExecutorService executorService = sentryOptions.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        SentryOptions sentryOptions2 = this.options;
        if (sentryOptions2 != null) {
            ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new lp(5, this));
        } else {
            Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$10(ReplayIntegration replayIntegration) throws IOException {
        SentryOptions sentryOptions = replayIntegration.options;
        if (sentryOptions == null) {
            Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        PersistingScopeObserver persistingScopeObserverFindPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (persistingScopeObserverFindPersistingScopeObserver != null) {
            SentryOptions sentryOptions2 = replayIntegration.options;
            if (sentryOptions2 == null) {
                Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            String str = (String) persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions2, PersistingScopeObserver.REPLAY_FILENAME, String.class);
            if (str != null) {
                SentryId sentryId = new SentryId(str);
                if (sentryId.equals(SentryId.EMPTY_ID)) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                ReplayCache.Companion companion = ReplayCache.Companion;
                SentryOptions sentryOptions3 = replayIntegration.options;
                if (sentryOptions3 == null) {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions3, sentryId, replayIntegration.replayCacheProvider);
                if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                SentryOptions sentryOptions4 = replayIntegration.options;
                if (sentryOptions4 == null) {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                Object obj = persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions4, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class);
                List<Breadcrumb> list = obj instanceof List ? (List) obj : null;
                CaptureStrategy.Companion companion2 = CaptureStrategy.Companion;
                IScopes iScopes = replayIntegration.scopes;
                SentryOptions sentryOptions5 = replayIntegration.options;
                if (sentryOptions5 == null) {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(iScopes, sentryOptions5, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), sentryId, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
                if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
                    Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(new PreviousReplayHint());
                    IScopes iScopes2 = replayIntegration.scopes;
                    Intrinsics.b(hintCreateWithTypeCheckHint);
                    ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(iScopes2, hintCreateWithTypeCheckHint);
                }
                replayIntegration.cleanupReplays(str);
                return;
            }
        }
        cleanupReplays$default(replayIntegration, null, 1, null);
    }

    private final Random getRandom() {
        return (Random) this.random$delegate.getValue();
    }

    private final ReplayExecutorService getReplayExecutor() {
        return (ReplayExecutorService) this.replayExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$4(f0 f0Var, IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String screen = it.getScreen();
        f0Var.f27510b = screen != null ? StringsKt.N(screen, screen) : null;
    }

    private final void pauseInternal() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.PAUSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.pause();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.pause();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    Unit unit = Unit.f27471a;
                    b4.f(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final void resumeInternal() {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.RESUMED;
                if (replayLifecycle.isAllowed(replayState)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != IConnectionStatusProvider.ConnectionStatus.DISCONNECTED && (((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                        this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                        CaptureStrategy captureStrategy = this.captureStrategy;
                        if (captureStrategy != null) {
                            captureStrategy.resume();
                        }
                        Recorder recorder = this.recorder;
                        if (recorder != null) {
                            recorder.resume();
                            Unit unit = Unit.f27471a;
                        }
                        b4.f(iSentryLifecycleTokenAcquire, null);
                        return;
                    }
                    b4.f(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(@Nullable Boolean bool) {
        if (this.isEnabled.get() && isRecording()) {
            SentryId sentryId = SentryId.EMPTY_ID;
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (sentryId.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(Intrinsics.a(bool, Boolean.TRUE), new AnonymousClass1());
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RateLimiter rateLimiter;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.CLOSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    SentryOptions sentryOptions = this.options;
                    if (sentryOptions == null) {
                        Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    sentryOptions.getConnectionStatusProvider().removeConnectionStatusObserver(this);
                    IScopes iScopes = this.scopes;
                    if (iScopes != null && (rateLimiter = iScopes.getRateLimiter()) != null) {
                        rateLimiter.removeRateLimitObserver(this);
                    }
                    stop();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.close();
                    }
                    this.recorder = null;
                    getRootViewsSpy$sentry_android_replay_release().close();
                    getReplayExecutor().shutdown();
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    Unit unit = Unit.f27471a;
                    b4.f(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
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

    @Override // io.sentry.IReplayApi
    public void disableDebugMaskingOverlay() {
        this.debugMaskingEnabled = false;
    }

    @Override // io.sentry.IReplayApi
    public void enableDebugMaskingOverlay() {
        this.debugMaskingEnabled = true;
    }

    @Override // io.sentry.ReplayController
    @NotNull
    public ReplayBreadcrumbConverter getBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    @Nullable
    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @Override // io.sentry.ReplayController
    @NotNull
    public SentryId getReplayId() {
        SentryId currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @NotNull
    public final RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (RootViewsSpy) this.rootViewsSpy$delegate.getValue();
    }

    @Override // io.sentry.ReplayController
    public boolean isDebugMaskingOverlayEnabled() {
        return this.debugMaskingEnabled;
    }

    @NotNull
    public final AtomicBoolean isEnabled$sentry_android_replay_release() {
        return this.isEnabled;
    }

    @NotNull
    public final AtomicBoolean isManualPause$sentry_android_replay_release() {
        return this.isManualPause;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return this.lifecycle.getCurrentState$sentry_android_replay_release().compareTo(ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState$sentry_android_replay_release().compareTo(ReplayState.STOPPED) < 0;
    }

    public final void onConfigurationChanged(@NotNull ScreenshotRecorderConfig config) {
        Recorder recorder;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isEnabled.get() && isRecording()) {
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(config);
            }
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.onConfigurationChanged(config);
            }
            if (this.lifecycle.getCurrentState$sentry_android_replay_release() != ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(@NotNull IConnectionStatusProvider.ConnectionStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (status == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.transport.RateLimiter.IRateLimitObserver
    public void onRateLimitChanged(@NotNull RateLimiter rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        f0 f0Var = new f0();
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new b(f0Var, 0));
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new AnonymousClass2(bitmap, f0Var));
        }
        checkCanRecord();
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(@NotNull MotionEvent event) {
        CaptureStrategy captureStrategy;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override // io.sentry.android.replay.WindowCallback
    public void onWindowSizeChanged(int i, int i10) {
        if (this.isEnabled.get() && isRecording()) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            if (sentryOptions.getSessionReplay().isTrackConfiguration()) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.Companion;
                Context context = this.context;
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                SentryReplayOptions sessionReplay = sentryOptions2.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                onConfigurationChanged(companion.fromSize(context, sessionReplay, i, i10));
            }
        }
    }

    @Override // io.sentry.ReplayController
    public void pause() {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes scopes, @NotNull SentryOptions options) {
        ReplayIntegration replayIntegration;
        SentryOptions sentryOptions;
        Recorder windowRecorder;
        GestureRecorder gestureRecorder;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().log(SentryLevel.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!options.getSessionReplay().isSessionReplayEnabled() && !options.getSessionReplay().isSessionReplayForErrorsEnabled()) {
            options.getLogger().log(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        Function0<Recorder> function0 = this.recorderProvider;
        if (function0 == null || (windowRecorder = (Recorder) function0.invoke()) == null) {
            replayIntegration = this;
            sentryOptions = options;
            windowRecorder = new WindowRecorder(sentryOptions, replayIntegration, this, this.mainLooperHandler, getReplayExecutor());
        } else {
            replayIntegration = this;
            sentryOptions = options;
        }
        replayIntegration.recorder = windowRecorder;
        Function0<GestureRecorder> function02 = replayIntegration.gestureRecorderProvider;
        if (function02 == null || (gestureRecorder = (GestureRecorder) function02.invoke()) == null) {
            gestureRecorder = new GestureRecorder(sentryOptions, this);
        }
        replayIntegration.gestureRecorder = gestureRecorder;
        replayIntegration.isEnabled.set(true);
        sentryOptions.getConnectionStatusProvider().addConnectionStatusObserver(this);
        RateLimiter rateLimiter = scopes.getRateLimiter();
        if (rateLimiter != null) {
            rateLimiter.addRateLimitObserver(this);
        }
        IntegrationUtils.addIntegrationToSdkVersion("Replay");
        finalizePreviousReplay();
    }

    @Override // io.sentry.ReplayController
    public void resume() {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(@NotNull ReplayBreadcrumbConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    @Override // io.sentry.ReplayController
    public void start() {
        CaptureStrategy bufferCaptureStrategy;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (!this.isEnabled.get()) {
                b4.f(iSentryLifecycleTokenAcquire, null);
                return;
            }
            ReplayLifecycle replayLifecycle = this.lifecycle;
            ReplayState replayState = ReplayState.STARTED;
            if (!replayLifecycle.isAllowed(replayState)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                b4.f(iSentryLifecycleTokenAcquire, null);
                return;
            }
            Random random = getRandom();
            SentryOptions sentryOptions2 = this.options;
            if (sentryOptions2 == null) {
                Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            boolean zSample = SamplingKt.sample(random, sentryOptions2.getSessionReplay().getSessionSampleRate());
            if (!zSample) {
                SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                if (!sentryOptions3.getSessionReplay().isSessionReplayForErrorsEnabled()) {
                    SentryOptions sentryOptions4 = this.options;
                    if (sentryOptions4 == null) {
                        Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    sentryOptions4.getLogger().log(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    b4.f(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
            Function1<? super Boolean, ? extends CaptureStrategy> function1 = this.replayCaptureStrategyProvider;
            if (function1 == null || (bufferCaptureStrategy = (CaptureStrategy) function1.invoke(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    SentryOptions sentryOptions5 = this.options;
                    if (sentryOptions5 == null) {
                        Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    bufferCaptureStrategy = new SessionCaptureStrategy(sentryOptions5, this.scopes, this.dateProvider, getReplayExecutor(), this.replayCacheProvider);
                } else {
                    SentryOptions sentryOptions6 = this.options;
                    if (sentryOptions6 == null) {
                        Intrinsics.g(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    bufferCaptureStrategy = new BufferCaptureStrategy(sentryOptions6, this.scopes, this.dateProvider, getRandom(), getReplayExecutor(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = bufferCaptureStrategy;
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy.DefaultImpls.start$default(captureStrategy, 0, null, null, 7, null);
            }
            registerRootViewListeners();
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

    @Override // io.sentry.ReplayController
    public void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.STOPPED;
                if (replayLifecycle.isAllowed(replayState)) {
                    unregisterRootViewListeners();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.reset();
                    }
                    Recorder recorder2 = this.recorder;
                    if (recorder2 != null) {
                        recorder2.stop();
                    }
                    GestureRecorder gestureRecorder = this.gestureRecorder;
                    if (gestureRecorder != null) {
                        gestureRecorder.stop();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    Unit unit = Unit.f27471a;
                    b4.f(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull File screenshot, long j10) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new AnonymousClass3(screenshot, j10), 1, null);
        }
        checkCanRecord();
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iCurrentDateProvider, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull ICurrentDateProvider dateProvider) {
        this(ContextKt.appContext(context), dateProvider, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, Function0 function0, Function1 function1, Function1 function12, MainLooperHandler mainLooperHandler, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iCurrentDateProvider, function0, function1, (i & 16) != 0 ? null : function12, (i & 32) != 0 ? null : mainLooperHandler, (i & 64) != 0 ? null : function02);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull ICurrentDateProvider dateProvider, @Nullable Function0<? extends Recorder> function0, @Nullable Function1<? super SentryId, ReplayCache> function1, @Nullable Function1<? super Boolean, ? extends CaptureStrategy> function12, @Nullable MainLooperHandler mainLooperHandler, @Nullable Function0<GestureRecorder> function02) {
        this(ContextKt.appContext(context), dateProvider, function0, function1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = function12;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = function02;
    }
}
