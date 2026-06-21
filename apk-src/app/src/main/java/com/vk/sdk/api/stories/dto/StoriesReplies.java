package com.vk.sdk.api.stories.dto;

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
public final class StoriesReplies {

    @b("count")
    private final int count;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    @b("new")
    @Nullable
    private final Integer f7new;

    public StoriesReplies(int i, @Nullable Integer num) {
        this.count = i;
        this.f7new = num;
    }

    public static /* synthetic */ StoriesReplies copy$default(StoriesReplies storiesReplies, int i, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = storiesReplies.count;
        }
        if ((i10 & 2) != 0) {
            num = storiesReplies.f7new;
        }
        return storiesReplies.copy(i, num);
    }

    public final int component1() {
        return this.count;
    }

    @Nullable
    public final Integer component2() {
        return this.f7new;
    }

    @NotNull
    public final StoriesReplies copy(int i, @Nullable Integer num) {
        return new StoriesReplies(i, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesReplies)) {
            return false;
        }
        StoriesReplies storiesReplies = (StoriesReplies) obj;
        return this.count == storiesReplies.count && Intrinsics.a(this.f7new, storiesReplies.f7new);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getNew() {
        return this.f7new;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.f7new;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "StoriesReplies(count=" + this.count + ", new=" + this.f7new + ")";
    }

    public /* synthetic */ StoriesReplies(int i, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : num);
    }
}
