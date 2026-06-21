package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.b;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
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
@Metadata
public interface CaptureStrategy {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long MAX_SEGMENT_DURATION = 300000;
        private static final long NETWORK_BREADCRUMB_START_OFFSET = 5000;

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment buildReplay(io.sentry.SentryOptions r19, java.io.File r20, io.sentry.protocol.SentryId r21, java.util.Date r22, int r23, int r24, int r25, int r26, int r27, long r28, io.sentry.SentryReplayEvent.ReplayType r30, java.lang.String r31, java.util.List<io.sentry.Breadcrumb> r32, java.util.Deque<io.sentry.rrweb.RRWebEvent> r33) {
            /*
                Method dump skipped, instruction units count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.CaptureStrategy.Companion.buildReplay(io.sentry.SentryOptions, java.io.File, io.sentry.protocol.SentryId, java.util.Date, int, int, int, int, int, long, io.sentry.SentryReplayEvent$ReplayType, java.lang.String, java.util.List, java.util.Deque):io.sentry.android.replay.capture.CaptureStrategy$ReplaySegment");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createSegment$lambda$1(f0 f0Var, IScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            f0Var.f27510b = new ArrayList(scope.getBreadcrumbs());
        }

        private final boolean isNetworkAvailable(Breadcrumb breadcrumb) {
            if (breadcrumb == null || !Intrinsics.a(breadcrumb.getCategory(), "network.event")) {
                return false;
            }
            Map<String, Object> data = breadcrumb.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            Object obj = data.get("action");
            if (obj == null) {
                obj = null;
            }
            return Intrinsics.a(obj, "NETWORK_AVAILABLE");
        }

        private final boolean isNetworkConnectivity(Breadcrumb breadcrumb) {
            return Intrinsics.a(breadcrumb.getCategory(), "network.event") && breadcrumb.getData().containsKey("network_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void rotateEvents$sentry_android_replay_release$default(Companion companion, Deque deque, long j10, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            companion.rotateEvents$sentry_android_replay_release(deque, j10, function1);
        }

        @NotNull
        public final ReplaySegment createSegment(@Nullable IScopes iScopes, @NotNull SentryOptions options, long j10, @NotNull Date currentSegmentTimestamp, @NotNull SentryId replayId, int i, int i10, int i11, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable ReplayCache replayCache, int i12, int i13, @Nullable String str, @Nullable List<Breadcrumb> list, @NotNull Deque<RRWebEvent> events) {
            GeneratedVideo generatedVideoCreateVideoOf$default;
            List<Breadcrumb> list2;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (replayCache == null || (generatedVideoCreateVideoOf$default = ReplayCache.createVideoOf$default(replayCache, Math.min(j10, MAX_SEGMENT_DURATION), currentSegmentTimestamp.getTime(), i, i10, i11, i12, i13, null, 128, null)) == null) {
                return ReplaySegment.Failed.INSTANCE;
            }
            File fileComponent1 = generatedVideoCreateVideoOf$default.component1();
            int iComponent2 = generatedVideoCreateVideoOf$default.component2();
            long jComponent3 = generatedVideoCreateVideoOf$default.component3();
            if (list == null) {
                f0 f0Var = new f0();
                f0Var.f27510b = b0.f27475b;
                if (iScopes != null) {
                    iScopes.configureScope(new b(f0Var, 1));
                }
                list2 = (List) f0Var.f27510b;
            } else {
                list2 = list;
            }
            return buildReplay(options, fileComponent1, replayId, currentSegmentTimestamp, i, i10, i11, iComponent2, i12, jComponent3, replayType, str, list2, events);
        }

        public final void rotateEvents$sentry_android_replay_release(@NotNull Deque<RRWebEvent> events, long j10, @Nullable Function1<? super RRWebEvent, Unit> function1) {
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator<RRWebEvent> it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                RRWebEvent next = it.next();
                if (next.getTimestamp() < j10) {
                    if (function1 != null) {
                        function1.invoke(next);
                    }
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @StabilityInferred(parameters = 1)
    @Metadata
    public static abstract class ReplaySegment {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @StabilityInferred(parameters = 0)
        @Metadata
        public static final class Created extends ReplaySegment {
            public static final int $stable = 8;

            @NotNull
            private final ReplayRecording recording;

            @NotNull
            private final SentryReplayEvent replay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(@NotNull SentryReplayEvent replay, @NotNull ReplayRecording recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.replay = replay;
                this.recording = recording;
            }

            public static /* synthetic */ void capture$default(Created created, IScopes iScopes, Hint hint, int i, Object obj) {
                if ((i & 2) != 0) {
                    hint = new Hint();
                }
                created.capture(iScopes, hint);
            }

            public static /* synthetic */ Created copy$default(Created created, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, int i, Object obj) {
                if ((i & 1) != 0) {
                    sentryReplayEvent = created.replay;
                }
                if ((i & 2) != 0) {
                    replayRecording = created.recording;
                }
                return created.copy(sentryReplayEvent, replayRecording);
            }

            public final void capture(@Nullable IScopes iScopes, @NotNull Hint hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (iScopes != null) {
                    SentryReplayEvent sentryReplayEvent = this.replay;
                    hint.setReplayRecording(this.recording);
                    Unit unit = Unit.f27471a;
                    iScopes.captureReplay(sentryReplayEvent, hint);
                }
            }

            @NotNull
            public final SentryReplayEvent component1() {
                return this.replay;
            }

            @NotNull
            public final ReplayRecording component2() {
                return this.recording;
            }

            @NotNull
            public final Created copy(@NotNull SentryReplayEvent replay, @NotNull ReplayRecording recording) {
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new Created(replay, recording);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Created)) {
                    return false;
                }
                Created created = (Created) obj;
                return Intrinsics.a(this.replay, created.replay) && Intrinsics.a(this.recording, created.recording);
            }

            @NotNull
            public final ReplayRecording getRecording() {
                return this.recording;
            }

            @NotNull
            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            public int hashCode() {
                return this.recording.hashCode() + (this.replay.hashCode() * 31);
            }

            public final void setSegmentId(int i) {
                this.replay.setSegmentId(i);
                List<? extends RRWebEvent> payload = this.recording.getPayload();
                if (payload != null) {
                    for (RRWebEvent rRWebEvent : payload) {
                        if (rRWebEvent instanceof RRWebVideoEvent) {
                            ((RRWebVideoEvent) rRWebEvent).setSegmentId(i);
                        }
                    }
                }
            }

            @NotNull
            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @StabilityInferred(parameters = 1)
        @Metadata
        public static final class Failed extends ReplaySegment {
            public static final int $stable = 0;

            @NotNull
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        public /* synthetic */ ReplaySegment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ReplaySegment() {
        }
    }

    void captureReplay(boolean z5, @NotNull Function1<? super Date, Unit> function1);

    @NotNull
    CaptureStrategy convert();

    @NotNull
    SentryId getCurrentReplayId();

    int getCurrentSegment();

    @Nullable
    File getReplayCacheDir();

    @NotNull
    SentryReplayEvent.ReplayType getReplayType();

    @Nullable
    Date getSegmentTimestamp();

    void onConfigurationChanged(@NotNull ScreenshotRecorderConfig screenshotRecorderConfig);

    void onScreenChanged(@Nullable String str);

    void onScreenshotRecorded(@Nullable Bitmap bitmap, @NotNull Function2<? super ReplayCache, ? super Long, Unit> function2);

    void onTouchEvent(@NotNull MotionEvent motionEvent);

    void pause();

    void resume();

    void setCurrentReplayId(@NotNull SentryId sentryId);

    void setCurrentSegment(int i);

    void setReplayType(@NotNull SentryReplayEvent.ReplayType replayType);

    void setSegmentTimestamp(@Nullable Date date);

    void start(int i, @NotNull SentryId sentryId, @Nullable SentryReplayEvent.ReplayType replayType);

    void stop();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ void onScreenshotRecorded$default(CaptureStrategy captureStrategy, Bitmap bitmap, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((i & 1) != 0) {
                bitmap = null;
            }
            captureStrategy.onScreenshotRecorded(bitmap, function2);
        }

        public static /* synthetic */ void start$default(CaptureStrategy captureStrategy, int i, SentryId sentryId, SentryReplayEvent.ReplayType replayType, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i10 & 1) != 0) {
                i = 0;
            }
            if ((i10 & 2) != 0) {
                sentryId = new SentryId();
            }
            if ((i10 & 4) != 0) {
                replayType = null;
            }
            captureStrategy.start(i, sentryId, replayType);
        }

        public static void onScreenChanged(@NotNull CaptureStrategy captureStrategy, @Nullable String str) {
        }
    }
}
