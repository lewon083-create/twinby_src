package com.vk.sdk.api.stories.dto;

import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
@Metadata
public final class StoriesStoryStatsStat {

    @b("count")
    @Nullable
    private final Integer count;

    @b(SentryThread.JsonKeys.STATE)
    @NotNull
    private final StoriesStoryStatsState state;

    public StoriesStoryStatsStat(@NotNull StoriesStoryStatsState state, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.count = num;
    }

    public static /* synthetic */ StoriesStoryStatsStat copy$default(StoriesStoryStatsStat storiesStoryStatsStat, StoriesStoryStatsState storiesStoryStatsState, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            storiesStoryStatsState = storiesStoryStatsStat.state;
        }
        if ((i & 2) != 0) {
            num = storiesStoryStatsStat.count;
        }
        return storiesStoryStatsStat.copy(storiesStoryStatsState, num);
    }

    @NotNull
    public final StoriesStoryStatsState component1() {
        return this.state;
    }

    @Nullable
    public final Integer component2() {
        return this.count;
    }

    @NotNull
    public final StoriesStoryStatsStat copy(@NotNull StoriesStoryStatsState state, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new StoriesStoryStatsStat(state, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryStatsStat)) {
            return false;
        }
        StoriesStoryStatsStat storiesStoryStatsStat = (StoriesStoryStatsStat) obj;
        return this.state == storiesStoryStatsStat.state && Intrinsics.a(this.count, storiesStoryStatsStat.count);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @NotNull
    public final StoriesStoryStatsState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        Integer num = this.count;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "StoriesStoryStatsStat(state=" + this.state + ", count=" + this.count + ")";
    }

    public /* synthetic */ StoriesStoryStatsStat(StoriesStoryStatsState storiesStoryStatsState, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storiesStoryStatsState, (i & 2) != 0 ? null : num);
    }
}
