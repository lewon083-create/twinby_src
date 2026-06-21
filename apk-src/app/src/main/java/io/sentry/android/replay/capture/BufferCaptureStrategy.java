package io.sentry.android.replay.capture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.ads.om1;
import fj.o;
import he.e;
import io.appmetrica.analytics.impl.cp;
import io.sentry.DateUtils;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.n;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import io.sentry.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.s;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
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
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class BufferCaptureStrategy extends BaseCaptureStrategy {
    private static final long ENVELOPE_PROCESSING_DELAY = 100;

    @NotNull
    private static final String TAG = "BufferCaptureStrategy";

    @NotNull
    private final List<CaptureStrategy.ReplaySegment.Created> bufferedSegments;

    @NotNull
    private final ICurrentDateProvider dateProvider;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final Random random;

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

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$captureReplay$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function1<CaptureStrategy.ReplaySegment, Unit> {
        final /* synthetic */ Function1<Date, Unit> $onSegmentSent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Date, Unit> function1) {
            super(1);
            this.$onSegmentSent = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return Unit.f27471a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) throws InterruptedException {
            Intrinsics.checkNotNullParameter(segment, "segment");
            BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
            bufferCaptureStrategy.capture(bufferCaptureStrategy.bufferedSegments);
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, BufferCaptureStrategy.this.scopes, null, 2, null);
                Function1<Date, Unit> function1 = this.$onSegmentSent;
                Date timestamp = created.getReplay().getTimestamp();
                Intrinsics.checkNotNullExpressionValue(timestamp, "getTimestamp(...)");
                function1.invoke(timestamp);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$onConfigurationChanged$1, reason: invalid class name */
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
                BufferCaptureStrategy.this.bufferedSegments.add(segment);
                BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$pause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class C06971 extends r implements Function1<CaptureStrategy.ReplaySegment, Unit> {
        public C06971() {
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
                BufferCaptureStrategy.this.bufferedSegments.add(segment);
                BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$rotate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class C06981 extends r implements Function1<CaptureStrategy.ReplaySegment.Created, Boolean> {
        final /* synthetic */ long $bufferLimit;
        final /* synthetic */ d0 $removed;
        final /* synthetic */ BufferCaptureStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06981(long j10, BufferCaptureStrategy bufferCaptureStrategy, d0 d0Var) {
            super(1);
            this.$bufferLimit = j10;
            this.this$0 = bufferCaptureStrategy;
            this.$removed = d0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(CaptureStrategy.ReplaySegment.Created it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getReplay().getTimestamp().getTime() >= this.$bufferLimit) {
                return Boolean.FALSE;
            }
            this.this$0.setCurrentSegment(r0.getCurrentSegment() - 1);
            this.this$0.deleteFile(it.getReplay().getVideoFile());
            this.$removed.f27507b = true;
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ BufferCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, Random random, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, iScopes, iCurrentDateProvider, random, scheduledExecutorService, (i & 32) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capture(List<CaptureStrategy.ReplaySegment.Created> list) throws InterruptedException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        CaptureStrategy.ReplaySegment.Created createdRemove = list.isEmpty() ? null : list.remove(0);
        while (createdRemove != null) {
            CaptureStrategy.ReplaySegment.Created.capture$default(createdRemove, this.scopes, null, 2, null);
            Intrinsics.checkNotNullParameter(list, "<this>");
            createdRemove = list.isEmpty() ? null : list.remove(0);
            Thread.sleep(ENVELOPE_PROCESSING_DELAY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureReplay$lambda$1(BufferCaptureStrategy bufferCaptureStrategy, IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setReplayId(bufferCaptureStrategy.getCurrentReplayId());
    }

    private final void createCurrentSegment(String str, Function1<? super CaptureStrategy.ReplaySegment, Unit> function1) {
        Date dateTime;
        Long lFirstFrameTimestamp$sentry_android_replay_release;
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, om1.k("Recorder config is not set, not creating segment for task: ", str), new Object[0]);
            return;
        }
        long errorReplayDuration = this.options.getSessionReplay().getErrorReplayDuration();
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        ReplayCache cache = getCache();
        if (cache == null || (lFirstFrameTimestamp$sentry_android_replay_release = cache.firstFrameTimestamp$sentry_android_replay_release()) == null || (dateTime = DateUtils.getDateTime(lFirstFrameTimestamp$sentry_android_replay_release.longValue())) == null) {
            dateTime = DateUtils.getDateTime(currentTimeMillis - errorReplayDuration);
        }
        Intrinsics.b(dateTime);
        getReplayExecutor().submit(new ReplayRunnable(om1.k("BufferCaptureStrategy.", str), new o(this, currentTimeMillis - dateTime.getTime(), dateTime, getCurrentReplayId(), recorderConfig$sentry_android_replay_release, function1, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$5(BufferCaptureStrategy bufferCaptureStrategy, long j10, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1) {
        function1.invoke(BaseCaptureStrategy.createSegmentInternal$default(bufferCaptureStrategy, j10, date, sentryId, bufferCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$2(BufferCaptureStrategy bufferCaptureStrategy, Function2 function2, long j10) {
        ReplayCache cache = bufferCaptureStrategy.getCache();
        if (cache != null) {
            function2.invoke(cache, Long.valueOf(j10));
        }
        long currentTimeMillis = bufferCaptureStrategy.dateProvider.getCurrentTimeMillis() - bufferCaptureStrategy.options.getSessionReplay().getErrorReplayDuration();
        ReplayCache cache2 = bufferCaptureStrategy.getCache();
        bufferCaptureStrategy.setScreenAtStart(cache2 != null ? cache2.rotate$sentry_android_replay_release(currentTimeMillis) : null);
        bufferCaptureStrategy.rotate(bufferCaptureStrategy.bufferedSegments, currentTimeMillis);
    }

    private final void rotate(List<CaptureStrategy.ReplaySegment.Created> list, long j10) {
        d0 d0Var = new d0();
        x.p(list, new C06981(j10, this, d0Var));
        if (d0Var.f27507b) {
            int i = 0;
            for (Object obj : list) {
                int i10 = i + 1;
                if (i < 0) {
                    s.i();
                    throw null;
                }
                ((CaptureStrategy.ReplaySegment.Created) obj).setSegmentId(i);
                i = i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(File file, BufferCaptureStrategy bufferCaptureStrategy) {
        FileUtils.deleteRecursively(file);
        bufferCaptureStrategy.setCurrentSegment(-1);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean z5, @NotNull Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!SamplingKt.sample(this.random, this.options.getSessionReplay().getOnErrorSampleRate())) {
            this.options.getLogger().log(SentryLevel.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new e(10, this));
        }
        if (!z5) {
            createCurrentSegment("capture_replay", new AnonymousClass2(onSegmentSent));
        } else {
            isTerminating().set(true);
            this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public CaptureStrategy convert() {
        if (isTerminating().get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        SessionCaptureStrategy sessionCaptureStrategy = new SessionCaptureStrategy(this.options, this.scopes, this.dateProvider, getReplayExecutor(), null, 16, null);
        sessionCaptureStrategy.setRecorderConfig$sentry_android_replay_release(getRecorderConfig$sentry_android_replay_release());
        sessionCaptureStrategy.start(getCurrentSegment(), getCurrentReplayId(), SentryReplayEvent.ReplayType.BUFFER);
        return sessionCaptureStrategy;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("configuration_changed", new AnonymousClass1());
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(@Nullable Bitmap bitmap, @NotNull Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        getReplayExecutor().submit(new ReplayRunnable("BufferCaptureStrategy.add_frame", new n(this, store, this.dateProvider.getCurrentTimeMillis(), 1)));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchEvent(event);
        CaptureStrategy.Companion.rotateEvents$sentry_android_replay_release$default(CaptureStrategy.Companion, getCurrentEvents(), this.dateProvider.getCurrentTimeMillis() - this.options.getSessionReplay().getErrorReplayDuration(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new C06971());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        getReplayExecutor().submit(new ReplayRunnable("BufferCaptureStrategy.stop", new cp(9, cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null, this)));
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy(@NotNull SentryOptions options, @Nullable IScopes iScopes, @NotNull ICurrentDateProvider dateProvider, @NotNull Random random, @NotNull ScheduledExecutorService executor, @Nullable Function1<? super SentryId, ReplayCache> function1) {
        super(options, iScopes, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
        this.random = random;
        this.bufferedSegments = new ArrayList();
    }
}
