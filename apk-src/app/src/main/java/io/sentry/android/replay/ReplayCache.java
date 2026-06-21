package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.StabilityInferred;
import ck.i;
import ck.j;
import ck.m;
import ck.n;
import com.google.android.gms.internal.measurement.b4;
import ek.p;
import ij.g;
import ij.h;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.protocol.SentryId;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.k0;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tj.k;

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
public final class ReplayCache implements Closeable {

    @NotNull
    public static final String ONGOING_SEGMENT = ".ongoing_segment";

    @NotNull
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";

    @NotNull
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";

    @NotNull
    public static final String SEGMENT_KEY_HEIGHT = "config.height";

    @NotNull
    public static final String SEGMENT_KEY_ID = "segment.id";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";

    @NotNull
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";

    @NotNull
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";

    @NotNull
    public static final String SEGMENT_KEY_WIDTH = "config.width";

    @Nullable
    private SimpleVideoEncoder encoder;

    @NotNull
    private final AutoClosableReentrantLock encoderLock;

    @NotNull
    private final List<ReplayFrame> frames;

    @NotNull
    private final AutoClosableReentrantLock framesLock;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final AutoClosableReentrantLock lock;

    @NotNull
    private final LinkedHashMap<String, String> ongoingSegment;

    @NotNull
    private final g ongoingSegmentFile$delegate;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final g replayCacheDir$delegate;

    @NotNull
    private final SentryId replayId;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(ReplayCache replayCache, File file, String str) {
            Intrinsics.b(str);
            if (a0.h(str, ".jpg")) {
                File file2 = new File(file, str);
                Intrinsics.checkNotNullParameter(file2, "<this>");
                String missingDelimiterValue = file2.getName();
                Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getName(...)");
                Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
                Intrinsics.checkNotNullParameter(".", "delimiter");
                Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
                int iE = StringsKt.E(6, missingDelimiterValue, ".");
                if (iE != -1) {
                    missingDelimiterValue = missingDelimiterValue.substring(0, iE);
                    Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
                }
                Long lO = StringsKt.O(missingDelimiterValue);
                if (lO != null) {
                    ReplayCache.addFrame$default(replayCache, file2, lO.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, SentryId sentryId, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, function1);
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.sentry.android.replay.LastSegmentData fromDisk$sentry_android_replay_release(@org.jetbrains.annotations.NotNull io.sentry.SentryOptions r26, @org.jetbrains.annotations.NotNull io.sentry.protocol.SentryId r27, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super io.sentry.protocol.SentryId, io.sentry.android.replay.ReplayCache> r28) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 576
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.ReplayCache.Companion.fromDisk$sentry_android_replay_release(io.sentry.SentryOptions, io.sentry.protocol.SentryId, kotlin.jvm.functions.Function1):io.sentry.android.replay.LastSegmentData");
        }

        @Nullable
        public final File makeReplayCacheDir(@NotNull SentryOptions options, @NotNull SentryId replayId) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().log(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.b(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    public ReplayCache(@NotNull SentryOptions options, @NotNull SentryId replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.options = options;
        this.replayId = replayId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new AutoClosableReentrantLock();
        this.lock = new AutoClosableReentrantLock();
        this.framesLock = new AutoClosableReentrantLock();
        this.replayCacheDir$delegate = h.b(new ReplayCache$replayCacheDir$2(this));
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile$delegate = h.b(new ReplayCache$ongoingSegmentFile$2(this));
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j10, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j10, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j10, String str, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j10, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j10, long j11, int i, int i10, int i11, int i12, int i13, File file, int i14, Object obj) {
        int i15;
        File file2;
        if ((i14 & 128) != 0) {
            File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
            StringBuilder sb2 = new StringBuilder();
            i15 = i;
            sb2.append(i15);
            sb2.append(".mp4");
            file2 = new File(replayCacheDir$sentry_android_replay_release, sb2.toString());
        } else {
            i15 = i;
            file2 = file;
        }
        return replayCache.createVideoOf(j10, j11, i15, i10, i11, i12, i13, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame replayFrame) {
        if (replayFrame == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(replayFrame.getScreenshot().getAbsolutePath());
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    Intrinsics.b(bitmapDecodeFile);
                    simpleVideoEncoder.encode(bitmapDecodeFile);
                    Unit unit = Unit.f27471a;
                }
                b4.f(iSentryLifecycleTokenAcquire, null);
                bitmapDecodeFile.recycle();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th2);
            return false;
        }
    }

    public final void addFrame(@NotNull File screenshot, long j10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        ReplayFrame replayFrame = new ReplayFrame(screenshot, j10, str);
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            this.frames.add(replayFrame);
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    public final void addFrame$sentry_android_replay_release(@NotNull Bitmap bitmap, long j10, @Nullable String str) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), j10 + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                Unit unit = Unit.f27471a;
                fileOutputStream.close();
                addFrame(file, j10, str);
            } finally {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
            this.isClosed.set(true);
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    @Nullable
    public final GeneratedVideo createVideoOf(long j10, long j11, int i, int i10, int i11, int i12, int i13, @NotNull File videoFile) {
        ISentryLifecycleToken iSentryLifecycleToken;
        m mVar;
        int i14;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            ArrayList arrayList = this.frames.isEmpty() ? new ArrayList() : CollectionsKt.T(this.frames);
            Throwable th2 = null;
            b4.f(iSentryLifecycleTokenAcquire, null);
            if (arrayList.isEmpty()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.encoderLock.acquire();
            try {
                iSentryLifecycleToken = iSentryLifecycleTokenAcquire2;
                try {
                    SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(this.options, new MuxerConfig(videoFile, i11, i10, i12, i13, null, 32, null), null, 4, null);
                    simpleVideoEncoder.start();
                    b4.f(iSentryLifecycleToken, null);
                    this.encoder = simpleVideoEncoder;
                    long j12 = ((long) 1000) / ((long) i12);
                    Object objFirstOrNull = CollectionsKt.firstOrNull(arrayList);
                    long j13 = j11 + j10;
                    if (j13 <= Long.MIN_VALUE) {
                        m.f2393f.getClass();
                        mVar = m.f2394g;
                    } else {
                        mVar = new m(j11, j13 - 1);
                    }
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                    n.a(j12 > 0, Long.valueOf(j12));
                    i iVar = j.f2385e;
                    long j14 = mVar.f2386b;
                    long j15 = mVar.f2387c;
                    long j16 = mVar.f2388d > 0 ? j12 : -j12;
                    iVar.getClass();
                    long j17 = new j(j14, j15, j16).f2387c;
                    if ((j16 > 0 && j14 <= j17) || (j16 < 0 && j17 <= j14)) {
                        long j18 = j14;
                        int i15 = 0;
                        while (true) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ReplayFrame replayFrame = (ReplayFrame) it.next();
                                long j19 = j18 + j12;
                                long timestamp = replayFrame.getTimestamp();
                                if (j18 <= timestamp && timestamp <= j19) {
                                    objFirstOrNull = replayFrame;
                                    break;
                                }
                                if (replayFrame.getTimestamp() > j19) {
                                    break;
                                }
                            }
                            if (encode((ReplayFrame) objFirstOrNull)) {
                                i15++;
                            } else if (objFirstOrNull != null) {
                                deleteFile(((ReplayFrame) objFirstOrNull).getScreenshot());
                                iSentryLifecycleTokenAcquire = this.framesLock.acquire();
                                try {
                                    List<ReplayFrame> list = this.frames;
                                    Throwable th3 = th2;
                                    if ((list instanceof xj.a) && !(list instanceof xj.b)) {
                                        k0.e(list, "kotlin.collections.MutableCollection");
                                        throw th3;
                                    }
                                    try {
                                        list.remove(objFirstOrNull);
                                        b4.f(iSentryLifecycleTokenAcquire, th3);
                                        arrayList.remove(objFirstOrNull);
                                        objFirstOrNull = null;
                                    } catch (ClassCastException e3) {
                                        Intrinsics.e(e3, k0.class.getName());
                                        throw e3;
                                    }
                                } finally {
                                }
                            }
                            if (j18 == j17) {
                                i14 = i15;
                                break;
                            }
                            j18 += j16;
                            th2 = null;
                        }
                    } else {
                        i14 = 0;
                    }
                    if (i14 == 0) {
                        this.options.getLogger().log(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        deleteFile(videoFile);
                        return null;
                    }
                    iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
                    try {
                        SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                        if (simpleVideoEncoder2 != null) {
                            simpleVideoEncoder2.release();
                        }
                        SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                        long duration = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                        this.encoder = null;
                        Unit unit = Unit.f27471a;
                        b4.f(iSentryLifecycleTokenAcquire, null);
                        rotate$sentry_android_replay_release(j13);
                        return new GeneratedVideo(videoFile, i14, duration);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } finally {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        b4.f(iSentryLifecycleToken, th6);
                        throw th7;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                iSentryLifecycleToken = iSentryLifecycleTokenAcquire2;
            }
        } catch (Throwable th42) {
            try {
                throw th42;
            } finally {
            }
        }
    }

    @Nullable
    public final Long firstFrameTimestamp$sentry_android_replay_release() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            ReplayFrame replayFrame = (ReplayFrame) CollectionsKt.firstOrNull(this.frames);
            Long lValueOf = replayFrame != null ? Long.valueOf(replayFrame.getTimestamp()) : null;
            b4.f(iSentryLifecycleTokenAcquire, null);
            return lValueOf;
        } finally {
        }
    }

    @NotNull
    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    @Nullable
    public final File getOngoingSegmentFile$sentry_android_replay_release() {
        return (File) this.ongoingSegmentFile$delegate.getValue();
    }

    @Nullable
    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir$delegate.getValue();
    }

    public final void persistSegmentValues$sentry_android_replay_release(@NotNull String key, @Nullable String str) {
        File ongoingSegmentFile$sentry_android_replay_release;
        File ongoingSegmentFile$sentry_android_replay_release2;
        Intrinsics.checkNotNullParameter(key, "key");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.isClosed.get()) {
                b4.f(iSentryLifecycleTokenAcquire, null);
                return;
            }
            File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
            if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                ongoingSegmentFile$sentry_android_replay_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), Charsets.UTF_8), 8192);
                try {
                    Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
                    p pVar = new p(bufferedReader);
                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                    ek.a aVar = new ek.a(pVar);
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
                        linkedHashMap.put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, str);
            }
            File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
            if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                k.c(ongoingSegmentFile$sentry_android_replay_release4, CollectionsKt.I(setEntrySet, "\n", null, null, ReplayCache$persistSegmentValues$1$2.INSTANCE, 30));
                Unit unit = Unit.f27471a;
            }
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    @Nullable
    public final String rotate$sentry_android_replay_release(long j10) {
        f0 f0Var = new f0();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            x.p(this.frames, new ReplayCache$rotate$1$1(j10, this, f0Var));
            b4.f(iSentryLifecycleTokenAcquire, null);
            return (String) f0Var.f27510b;
        } finally {
        }
    }
}
