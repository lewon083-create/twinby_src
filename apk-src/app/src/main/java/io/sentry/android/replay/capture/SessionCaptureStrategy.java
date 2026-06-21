package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.ads.om1;
import fj.o;
import he.e;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;
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
public final class SessionCaptureStrategy extends BaseCaptureStrategy {

    @NotNull
    private static final String TAG = "SessionCaptureStrategy";

    @NotNull
    private final ICurrentDateProvider dateProvider;

    @NotNull
    private final SentryOptions options;

    @Nullable
    private final IScopes scopes;

    @NotNull
    public static final Companion Companion = new Companion(null);
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

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.SessionCaptureStrategy$onConfigurationChanged$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<CaptureStrategy.ReplaySegment, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return Unit.f27471a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, SessionCaptureStrategy.this.scopes, null, 2, null);
                SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                SessionCaptureStrategy.this.setSegmentTimestamp(created.getReplay().getTimestamp());
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.SessionCaptureStrategy$pause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class C06991 extends r implements Function1<CaptureStrategy.ReplaySegment, Unit> {
        public C06991() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return Unit.f27471a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.scopes, null, 2, null);
                SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.SessionCaptureStrategy$stop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class C07001 extends r implements Function1<CaptureStrategy.ReplaySegment, Unit> {
        final /* synthetic */ File $replayCacheDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07001(File file) {
            super(1);
            this.$replayCacheDir = file;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return Unit.f27471a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.scopes, null, 2, null);
            }
            SessionCaptureStrategy.this.setCurrentSegment(-1);
            FileUtils.deleteRecursively(this.$replayCacheDir);
        }
    }

    public /* synthetic */ SessionCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i & 16) != 0 ? null : function1);
    }

    private final void createCurrentSegment(String str, Function1<? super CaptureStrategy.ReplaySegment, Unit> function1) {
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, om1.k("Recorder config is not set, not creating segment for task: ", str), new Object[0]);
            return;
        }
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        Date segmentTimestamp = getSegmentTimestamp();
        if (segmentTimestamp == null) {
            return;
        }
        getReplayExecutor().submit(new ReplayRunnable(om1.k("SessionCaptureStrategy.", str), new o(this, currentTimeMillis - segmentTimestamp.getTime(), segmentTimestamp, getCurrentReplayId(), recorderConfig$sentry_android_replay_release, function1, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(SessionCaptureStrategy sessionCaptureStrategy, long j10, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1) {
        function1.invoke(BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, j10, date, sentryId, sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$3(SessionCaptureStrategy sessionCaptureStrategy, Function2 function2, long j10, ScreenshotRecorderConfig screenshotRecorderConfig) {
        ReplayCache cache = sessionCaptureStrategy.getCache();
        if (cache != null) {
            function2.invoke(cache, Long.valueOf(j10));
        }
        Date segmentTimestamp = sessionCaptureStrategy.getSegmentTimestamp();
        if (segmentTimestamp == null) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (sessionCaptureStrategy.isTerminating().get()) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (screenshotRecorderConfig == null) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long currentTimeMillis = sessionCaptureStrategy.dateProvider.getCurrentTimeMillis();
        if (currentTimeMillis - segmentTimestamp.getTime() >= sessionCaptureStrategy.options.getSessionReplay().getSessionSegmentDuration()) {
            CaptureStrategy.ReplaySegment replaySegmentCreateSegmentInternal$default = BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, sessionCaptureStrategy.options.getSessionReplay().getSessionSegmentDuration(), segmentTimestamp, sessionCaptureStrategy.getCurrentReplayId(), sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null);
            if (replaySegmentCreateSegmentInternal$default instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegmentInternal$default;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, sessionCaptureStrategy.scopes, null, 2, null);
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                sessionCaptureStrategy.setSegmentTimestamp(created.getReplay().getTimestamp());
            }
        }
        if (currentTimeMillis - sessionCaptureStrategy.getReplayStartTimestamp().get() >= sessionCaptureStrategy.options.getSessionReplay().getSessionDuration()) {
            sessionCaptureStrategy.options.getReplayController().stop();
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SessionCaptureStrategy sessionCaptureStrategy, IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setReplayId(sessionCaptureStrategy.getCurrentReplayId());
        String screen = it.getScreen();
        sessionCaptureStrategy.setScreenAtStart(screen != null ? StringsKt.N(screen, screen) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setReplayId(SentryId.EMPTY_ID);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean z5, @NotNull Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        isTerminating().set(z5);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("onConfigurationChanged", new AnonymousClass1());
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(@Nullable Bitmap bitmap, @NotNull Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        getReplayExecutor().submit(new ReplayRunnable("SessionCaptureStrategy.add_frame", new a(this, store, this.dateProvider.getCurrentTimeMillis(), recorderConfig$sentry_android_replay_release)));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new C06991());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void start(int i, @NotNull SentryId replayId, @Nullable SentryReplayEvent.ReplayType replayType) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.start(i, replayId, replayType);
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new e(11, this));
        }
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        createCurrentSegment("stop", new C07001(cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null));
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new ig.a(19));
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy(@NotNull SentryOptions options, @Nullable IScopes iScopes, @NotNull ICurrentDateProvider dateProvider, @NotNull ScheduledExecutorService executor, @Nullable Function1<? super SentryId, ReplayCache> function1) {
        super(options, iScopes, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public CaptureStrategy convert() {
        return this;
    }
}
