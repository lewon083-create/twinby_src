package com.vk.sdk.api.store.dto;

import java.util.List;
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
public final class StoreStickersKeyword {

    @b("promoted_stickers")
    @Nullable
    private final Object promotedStickers;

    @b("stickers")
    @Nullable
    private final List<StoreStickersKeywordSticker> stickers;

    @b("user_stickers")
    @Nullable
    private final Object userStickers;

    @b("words")
    @NotNull
    private final List<String> words;

    public StoreStickersKeyword(@NotNull List<String> words, @Nullable Object obj, @Nullable Object obj2, @Nullable List<StoreStickersKeywordSticker> list) {
        Intrinsics.checkNotNullParameter(words, "words");
        this.words = words;
        this.userStickers = obj;
        this.promotedStickers = obj2;
        this.stickers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoreStickersKeyword copy$default(StoreStickersKeyword storeStickersKeyword, List list, Object obj, Object obj2, List list2, int i, Object obj3) {
        if ((i & 1) != 0) {
            list = storeStickersKeyword.words;
        }
        if ((i & 2) != 0) {
            obj = storeStickersKeyword.userStickers;
        }
        if ((i & 4) != 0) {
            obj2 = storeStickersKeyword.promotedStickers;
        }
        if ((i & 8) != 0) {
            list2 = storeStickersKeyword.stickers;
        }
        return storeStickersKeyword.copy(list, obj, obj2, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.words;
    }

    @Nullable
    public final Object component2() {
        return this.userStickers;
    }

    @Nullable
    public final Object component3() {
        return this.promotedStickers;
    }

    @Nullable
    public final List<StoreStickersKeywordSticker> component4() {
        return this.stickers;
    }

    @NotNull
    public final StoreStickersKeyword copy(@NotNull List<String> words, @Nullable Object obj, @Nullable Object obj2, @Nullable List<StoreStickersKeywordSticker> list) {
        Intrinsics.checkNotNullParameter(words, "words");
        return new StoreStickersKeyword(words, obj, obj2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStickersKeyword)) {
            return false;
        }
        StoreStickersKeyword storeStickersKeyword = (StoreStickersKeyword) obj;
        return Intrinsics.a(this.words, storeStickersKeyword.words) && Intrinsics.a(this.userStickers, storeStickersKeyword.userStickers) && Intrinsics.a(this.promotedStickers, storeStickersKeyword.promotedStickers) && Intrinsics.a(this.stickers, storeStickersKeyword.stickers);
    }

    @Nullable
    public final Object getPromotedStickers() {
        return this.promotedStickers;
    }

    @Nullable
    public final List<StoreStickersKeywordSticker> getStickers() {
        return this.stickers;
    }

    @Nullable
    public final Object getUserStickers() {
        return this.userStickers;
    }

    @NotNull
    public final List<String> getWords() {
        return this.words;
    }

    public int hashCode() {
        int iHashCode = this.words.hashCode() * 31;
        Object obj = this.userStickers;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.promotedStickers;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        List<StoreStickersKeywordSticker> list = this.stickers;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StoreStickersKeyword(words=" + this.words + ", userStickers=" + this.userStickers + ", promotedStickers=" + this.promotedStickers + ", stickers=" + this.stickers + ")";
    }

    public /* synthetic */ StoreStickersKeyword(List list, Object obj, Object obj2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : list2);
    }
}
