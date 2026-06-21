package io.sentry.android.replay.capture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import dk.i;
import ij.g;
import ij.h;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScopes;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wj.n;
import zj.d;

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
public abstract class BaseCaptureStrategy implements CaptureStrategy {
    static final /* synthetic */ i[] $$delegatedProperties;
    public static final int $stable;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final String TAG = "CaptureStrategy";

    @Nullable
    private ReplayCache cache;

    @NotNull
    private final Deque<RRWebEvent> currentEvents;

    @NotNull
    private final d currentReplayId$delegate;

    @NotNull
    private final d currentSegment$delegate;

    @NotNull
    private final ICurrentDateProvider dateProvider;

    @NotNull
    private final ReplayGestureConverter gestureConverter;

    @NotNull
    private final AtomicBoolean isTerminating;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final g persistingExecutor$delegate;

    @NotNull
    private final d recorderConfig$delegate;

    @Nullable
    private final Function1<SentryId, ReplayCache> replayCacheProvider;

    @NotNull
    private final ScheduledExecutorService replayExecutor;

    @NotNull
    private final AtomicLong replayStartTimestamp;

    @NotNull
    private final d replayType$delegate;

    @Nullable
    private final IScopes scopes;

    @NotNull
    private final d screenAtStart$delegate;

    @NotNull
    private final d segmentTimestamp$delegate;

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
    public static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r8) {
            Intrinsics.checkNotNullParameter(r8, "r");
            StringBuilder sb2 = new StringBuilder("SentryReplayPersister-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb2.append(i);
            Thread thread = new Thread(r8, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomic$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements n {
        final /* synthetic */ String $propertyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override // wj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, obj2, obj3);
            return Unit.f27471a;
        }

        public final void invoke(String str, Object obj, Object obj2) {
            ReplayCache cache = BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class C06961 extends r implements n {
        final /* synthetic */ String $propertyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06961(String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override // wj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, obj2, obj3);
            return Unit.f27471a;
        }

        public final void invoke(String str, Object obj, Object obj2) {
            ReplayCache cache = BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 implements d {
        final /* synthetic */ n $onChange;
        final /* synthetic */ String $propertyName;
        final /* synthetic */ BaseCaptureStrategy this$0;
        private final AtomicReference<T> value;

        public AnonymousClass2(T t10, BaseCaptureStrategy baseCaptureStrategy, n nVar, String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = nVar;
            this.$propertyName = str;
            this.value = new AtomicReference<>(t10);
        }

        private final void runInBackground(final Function0<Unit> function0) {
            if (this.this$0.options.getThreadChecker().isMainThread()) {
                this.this$0.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        function0.invoke();
                    }
                }));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.this$0.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
        @Override // zj.c
        public T getValue(Object obj, i property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.value.get();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zj.d
        public void setValue(Object obj, i property, T t10) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.value.getAndSet(t10);
            if (Intrinsics.a(andSet, t10)) {
                return;
            }
            runInBackground(new BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(this.$onChange, this.$propertyName, andSet, t10));
        }
    }

    static {
        u uVar = new u(BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        g0.f27511a.getClass();
        $$delegatedProperties = new i[]{uVar, new u(BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;"), new u(BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;"), new u(BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;"), new u(BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I"), new u(BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;")};
        Companion = new Companion(null);
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCaptureStrategy(@NotNull SentryOptions options, @Nullable IScopes iScopes, @NotNull ICurrentDateProvider dateProvider, @NotNull ScheduledExecutorService replayExecutor, @Nullable Function1<? super SentryId, ReplayCache> function1) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = function1;
        this.persistingExecutor$delegate = h.b(new BaseCaptureStrategy$persistingExecutor$2(this));
        this.gestureConverter = new ReplayGestureConverter(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final Object obj = null;
        final String str = "";
        this.recorderConfig$delegate = new d(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<ScreenshotRecorderConfig> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            @Metadata
            public static final class AnonymousClass2 extends r implements Function0<Unit> {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m616invoke();
                    return Unit.f27471a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m616invoke() {
                    Object obj = this.$oldValue;
                    ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.$value;
                    if (screenshotRecorderConfig == null) {
                        return;
                    }
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                    }
                    ReplayCache cache2 = this.this$0.getCache();
                    if (cache2 != null) {
                        cache2.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                    }
                    ReplayCache cache3 = this.this$0.getCache();
                    if (cache3 != null) {
                        cache3.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig.getFrameRate()));
                    }
                    ReplayCache cache4 = this.this$0.getCache();
                    if (cache4 != null) {
                        cache4.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig.getBitRate()));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    }));
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // zj.c
            public ScreenshotRecorderConfig getValue(Object obj2, i property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // zj.d
            public void setValue(Object obj2, i property, ScreenshotRecorderConfig screenshotRecorderConfig) {
                Intrinsics.checkNotNullParameter(property, "property");
                ScreenshotRecorderConfig andSet = this.value.getAndSet(screenshotRecorderConfig);
                if (Intrinsics.a(andSet, screenshotRecorderConfig)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, screenshotRecorderConfig, this.this$0));
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp$delegate = new d(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Date> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            @Metadata
            public static final class AnonymousClass2 extends r implements Function0<Unit> {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m617invoke();
                    return Unit.f27471a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m617invoke() {
                    Object obj = this.$oldValue;
                    Date date = (Date) this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : DateUtils.getTimestamp(date));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    }));
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // zj.c
            public Date getValue(Object obj2, i property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // zj.d
            public void setValue(Object obj2, i property, Date date) {
                Intrinsics.checkNotNullParameter(property, "property");
                Date andSet = this.value.getAndSet(date);
                if (Intrinsics.a(andSet, date)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, date, this.this$0));
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart$delegate = new d(obj, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<String> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            @Metadata
            public static final class AnonymousClass2 extends r implements Function0<Unit> {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m618invoke();
                    return Unit.f27471a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m618invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    }));
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // zj.c
            public String getValue(Object obj2, i property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // zj.d
            public void setValue(Object obj2, i property, String str4) {
                Intrinsics.checkNotNullParameter(property, "property");
                String andSet = this.value.getAndSet(str4);
                if (Intrinsics.a(andSet, str4)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, str4, this.this$0, this.$propertyName$inlined));
            }
        };
        final SentryId sentryId = SentryId.EMPTY_ID;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId$delegate = new d(sentryId, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryId> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            @Metadata
            public static final class AnonymousClass2 extends r implements Function0<Unit> {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m613invoke();
                    return Unit.f27471a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m613invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(sentryId);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    }));
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // zj.c
            public SentryId getValue(Object obj2, i property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // zj.d
            public void setValue(Object obj2, i property, SentryId sentryId2) {
                Intrinsics.checkNotNullParameter(property, "property");
                SentryId andSet = this.value.getAndSet(sentryId2);
                if (Intrinsics.a(andSet, sentryId2)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, sentryId2, this.this$0, this.$propertyName$inlined));
            }
        };
        final int i = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment$delegate = new d(i, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Integer> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            @Metadata
            public static final class AnonymousClass2 extends r implements Function0<Unit> {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m614invoke();
                    return Unit.f27471a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m614invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    }));
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // zj.c
            public Integer getValue(Object obj2, i property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // zj.d
            public void setValue(Object obj2, i property, Integer num) {
                Intrinsics.checkNotNullParameter(property, "property");
                Integer andSet = this.value.getAndSet(num);
                if (Intrinsics.a(andSet, num)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, num, this.this$0, this.$propertyName$inlined));
            }
        };
        final Object obj2 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType$delegate = new d(obj2, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryReplayEvent.ReplayType> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            @Metadata
            public static final class AnonymousClass2 extends r implements Function0<Unit> {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m615invoke();
                    return Unit.f27471a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m615invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final Function0<Unit> function0) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    }));
                    return;
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // zj.c
            public SentryReplayEvent.ReplayType getValue(Object obj3, i property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // zj.d
            public void setValue(Object obj3, i property, SentryReplayEvent.ReplayType replayType) {
                Intrinsics.checkNotNullParameter(property, "property");
                SentryReplayEvent.ReplayType andSet = this.value.getAndSet(replayType);
                if (Intrinsics.a(andSet, replayType)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, replayType, this.this$0, this.$propertyName$inlined));
            }
        };
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j10, Date date, SentryId sentryId, int i, int i10, int i11, int i12, int i13, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, String str, List list, Deque deque, int i14, Object obj) {
        Deque deque2;
        BaseCaptureStrategy baseCaptureStrategy2;
        long j11;
        Date date2;
        SentryId sentryId2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
        }
        SentryReplayEvent.ReplayType replayType2 = (i14 & 256) != 0 ? baseCaptureStrategy.getReplayType() : replayType;
        ReplayCache replayCache2 = (i14 & 512) != 0 ? baseCaptureStrategy.cache : replayCache;
        String screenAtStart = (i14 & 1024) != 0 ? baseCaptureStrategy.getScreenAtStart() : str;
        List list2 = (i14 & 2048) != 0 ? null : list;
        if ((i14 & 4096) != 0) {
            deque2 = baseCaptureStrategy.currentEvents;
            baseCaptureStrategy2 = baseCaptureStrategy;
            date2 = date;
            sentryId2 = sentryId;
            i15 = i;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            j11 = j10;
        } else {
            deque2 = deque;
            baseCaptureStrategy2 = baseCaptureStrategy;
            j11 = j10;
            date2 = date;
            sentryId2 = sentryId;
            i15 = i;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
        }
        return baseCaptureStrategy2.createSegmentInternal(j11, date2, sentryId2, i15, i16, i17, i18, i19, replayType2, replayCache2, screenAtStart, list2, deque2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService getPersistingExecutor() {
        return (ScheduledExecutorService) this.persistingExecutor$delegate.getValue();
    }

    private final <T> d persistableAtomic(T t10, String str, n nVar) {
        return new AnonymousClass2(t10, this, nVar, str);
    }

    public static /* synthetic */ d persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, n nVar, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            nVar = baseCaptureStrategy.new AnonymousClass1(str);
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, nVar, str);
    }

    private final <T> d persistableAtomicNullable(T t10, String str, n nVar) {
        return new AnonymousClass2(t10, this, nVar, str);
    }

    public static /* synthetic */ d persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, n nVar, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            nVar = baseCaptureStrategy.new C06961(str);
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, nVar, str);
    }

    @NotNull
    public final CaptureStrategy.ReplaySegment createSegmentInternal(long j10, @NotNull Date currentSegmentTimestamp, @NotNull SentryId replayId, int i, int i10, int i11, int i12, int i13, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable ReplayCache replayCache, @Nullable String str, @Nullable List<Breadcrumb> list, @NotNull Deque<RRWebEvent> events) {
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return CaptureStrategy.Companion.createSegment(this.scopes, this.options, j10, currentSegmentTimestamp, replayId, i, i10, i11, replayType, replayCache, i12, i13, str, list, events);
    }

    @Nullable
    public final ReplayCache getCache() {
        return this.cache;
    }

    @NotNull
    public final Deque<RRWebEvent> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public SentryId getCurrentReplayId() {
        return (SentryId) this.currentReplayId$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((Number) this.currentSegment$delegate.getValue(this, $$delegatedProperties[4])).intValue();
    }

    @Nullable
    public final ScreenshotRecorderConfig getRecorderConfig$sentry_android_replay_release() {
        return (ScreenshotRecorderConfig) this.recorderConfig$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @Nullable
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    @NotNull
    public final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    @NotNull
    public final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public SentryReplayEvent.ReplayType getReplayType() {
        return (SentryReplayEvent.ReplayType) this.replayType$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Nullable
    public final String getScreenAtStart() {
        return (String) this.screenAtStart$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @Nullable
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final AtomicBoolean isTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        setRecorderConfig$sentry_android_replay_release(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(@Nullable String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(@NotNull MotionEvent event) {
        List<RRWebIncrementalSnapshotEvent> listConvert;
        Intrinsics.checkNotNullParameter(event, "event");
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null || (listConvert = this.gestureConverter.convert(event, recorderConfig$sentry_android_replay_release)) == null) {
            return;
        }
        x.m(this.currentEvents, listConvert);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
    }

    public final void setCache(@Nullable ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(@NotNull SentryId sentryId) {
        Intrinsics.checkNotNullParameter(sentryId, "<set-?>");
        this.currentReplayId$delegate.setValue(this, $$delegatedProperties[3], sentryId);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i) {
        this.currentSegment$delegate.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setRecorderConfig$sentry_android_replay_release(@Nullable ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.recorderConfig$delegate.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(@NotNull SentryReplayEvent.ReplayType replayType) {
        Intrinsics.checkNotNullParameter(replayType, "<set-?>");
        this.replayType$delegate.setValue(this, $$delegatedProperties[5], replayType);
    }

    public final void setScreenAtStart(@Nullable String str) {
        this.screenAtStart$delegate.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(@Nullable Date date) {
        this.segmentTimestamp$delegate.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(int i, @NotNull SentryId replayId, @Nullable SentryReplayEvent.ReplayType replayType) {
        ReplayCache replayCache;
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function1<SentryId, ReplayCache> function1 = this.replayCacheProvider;
        if (function1 == null || (replayCache = (ReplayCache) function1.invoke(replayId)) == null) {
            replayCache = new ReplayCache(this.options, replayId);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(i);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? SentryReplayEvent.ReplayType.SESSION : SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
        this.replayStartTimestamp.set(this.dateProvider.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    public /* synthetic */ BaseCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i & 16) != 0 ? null : function1);
    }
}
