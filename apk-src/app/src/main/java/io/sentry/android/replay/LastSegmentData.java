package io.sentry.android.replay;

import a0.u;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryReplayEvent;
import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class LastSegmentData {
    public static final int $stable = 8;

    @NotNull
    private final ReplayCache cache;
    private final long duration;

    @NotNull
    private final List<RRWebEvent> events;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f25973id;

    @NotNull
    private final ScreenshotRecorderConfig recorderConfig;

    @NotNull
    private final SentryReplayEvent.ReplayType replayType;

    @Nullable
    private final String screenAtStart;

    @NotNull
    private final Date timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(@NotNull ScreenshotRecorderConfig recorderConfig, @NotNull ReplayCache cache, @NotNull Date timestamp, int i, long j10, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable String str, @NotNull List<? extends RRWebEvent> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.recorderConfig = recorderConfig;
        this.cache = cache;
        this.timestamp = timestamp;
        this.f25973id = i;
        this.duration = j10;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastSegmentData copy$default(LastSegmentData lastSegmentData, ScreenshotRecorderConfig screenshotRecorderConfig, ReplayCache replayCache, Date date, int i, long j10, SentryReplayEvent.ReplayType replayType, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            screenshotRecorderConfig = lastSegmentData.recorderConfig;
        }
        if ((i10 & 2) != 0) {
            replayCache = lastSegmentData.cache;
        }
        if ((i10 & 4) != 0) {
            date = lastSegmentData.timestamp;
        }
        if ((i10 & 8) != 0) {
            i = lastSegmentData.f25973id;
        }
        if ((i10 & 16) != 0) {
            j10 = lastSegmentData.duration;
        }
        if ((i10 & 32) != 0) {
            replayType = lastSegmentData.replayType;
        }
        if ((i10 & 64) != 0) {
            str = lastSegmentData.screenAtStart;
        }
        if ((i10 & 128) != 0) {
            list = lastSegmentData.events;
        }
        List list2 = list;
        SentryReplayEvent.ReplayType replayType2 = replayType;
        long j11 = j10;
        Date date2 = date;
        int i11 = i;
        return lastSegmentData.copy(screenshotRecorderConfig, replayCache, date2, i11, j11, replayType2, str, list2);
    }

    @NotNull
    public final ScreenshotRecorderConfig component1() {
        return this.recorderConfig;
    }

    @NotNull
    public final ReplayCache component2() {
        return this.cache;
    }

    @NotNull
    public final Date component3() {
        return this.timestamp;
    }

    public final int component4() {
        return this.f25973id;
    }

    public final long component5() {
        return this.duration;
    }

    @NotNull
    public final SentryReplayEvent.ReplayType component6() {
        return this.replayType;
    }

    @Nullable
    public final String component7() {
        return this.screenAtStart;
    }

    @NotNull
    public final List<RRWebEvent> component8() {
        return this.events;
    }

    @NotNull
    public final LastSegmentData copy(@NotNull ScreenshotRecorderConfig recorderConfig, @NotNull ReplayCache cache, @NotNull Date timestamp, int i, long j10, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable String str, @NotNull List<? extends RRWebEvent> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return new LastSegmentData(recorderConfig, cache, timestamp, i, j10, replayType, str, events);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) obj;
        return Intrinsics.a(this.recorderConfig, lastSegmentData.recorderConfig) && Intrinsics.a(this.cache, lastSegmentData.cache) && Intrinsics.a(this.timestamp, lastSegmentData.timestamp) && this.f25973id == lastSegmentData.f25973id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && Intrinsics.a(this.screenAtStart, lastSegmentData.screenAtStart) && Intrinsics.a(this.events, lastSegmentData.events);
    }

    @NotNull
    public final ReplayCache getCache() {
        return this.cache;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<RRWebEvent> getEvents() {
        return this.events;
    }

    public final int getId() {
        return this.f25973id;
    }

    @NotNull
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    @NotNull
    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    @Nullable
    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    @NotNull
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (this.replayType.hashCode() + o.d(this.duration, u.g(this.f25973id, (this.timestamp.hashCode() + ((this.cache.hashCode() + (this.recorderConfig.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.screenAtStart;
        return this.events.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LastSegmentData(recorderConfig=");
        sb2.append(this.recorderConfig);
        sb2.append(", cache=");
        sb2.append(this.cache);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", id=");
        sb2.append(this.f25973id);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", replayType=");
        sb2.append(this.replayType);
        sb2.append(", screenAtStart=");
        sb2.append(this.screenAtStart);
        sb2.append(", events=");
        return u.p(sb2, this.events, ')');
    }
}
