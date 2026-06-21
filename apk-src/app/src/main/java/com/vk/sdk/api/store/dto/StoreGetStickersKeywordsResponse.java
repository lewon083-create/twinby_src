package com.vk.sdk.api.store.dto;

import a0.u;
import gf.a;
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
public final class StoreGetStickersKeywordsResponse {

    @b("chunks_count")
    @Nullable
    private final Integer chunksCount;

    @b("chunks_hash")
    @Nullable
    private final String chunksHash;

    @b("count")
    private final int count;

    @b("dictionary")
    @NotNull
    private final List<StoreStickersKeyword> dictionary;

    public StoreGetStickersKeywordsResponse(int i, @NotNull List<StoreStickersKeyword> dictionary, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        this.count = i;
        this.dictionary = dictionary;
        this.chunksCount = num;
        this.chunksHash = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoreGetStickersKeywordsResponse copy$default(StoreGetStickersKeywordsResponse storeGetStickersKeywordsResponse, int i, List list, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = storeGetStickersKeywordsResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = storeGetStickersKeywordsResponse.dictionary;
        }
        if ((i10 & 4) != 0) {
            num = storeGetStickersKeywordsResponse.chunksCount;
        }
        if ((i10 & 8) != 0) {
            str = storeGetStickersKeywordsResponse.chunksHash;
        }
        return storeGetStickersKeywordsResponse.copy(i, list, num, str);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<StoreStickersKeyword> component2() {
        return this.dictionary;
    }

    @Nullable
    public final Integer component3() {
        return this.chunksCount;
    }

    @Nullable
    public final String component4() {
        return this.chunksHash;
    }

    @NotNull
    public final StoreGetStickersKeywordsResponse copy(int i, @NotNull List<StoreStickersKeyword> dictionary, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        return new StoreGetStickersKeywordsResponse(i, dictionary, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersKeywordsResponse)) {
            return false;
        }
        StoreGetStickersKeywordsResponse storeGetStickersKeywordsResponse = (StoreGetStickersKeywordsResponse) obj;
        return this.count == storeGetStickersKeywordsResponse.count && Intrinsics.a(this.dictionary, storeGetStickersKeywordsResponse.dictionary) && Intrinsics.a(this.chunksCount, storeGetStickersKeywordsResponse.chunksCount) && Intrinsics.a(this.chunksHash, storeGetStickersKeywordsResponse.chunksHash);
    }

    @Nullable
    public final Integer getChunksCount() {
        return this.chunksCount;
    }

    @Nullable
    public final String getChunksHash() {
        return this.chunksHash;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<StoreStickersKeyword> getDictionary() {
        return this.dictionary;
    }

    public int hashCode() {
        int i = u.i(this.dictionary, Integer.hashCode(this.count) * 31, 31);
        Integer num = this.chunksCount;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.chunksHash;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<StoreStickersKeyword> list = this.dictionary;
        Integer num = this.chunksCount;
        String str = this.chunksHash;
        StringBuilder sbM = a.m(i, "StoreGetStickersKeywordsResponse(count=", ", dictionary=", ", chunksCount=", list);
        sbM.append(num);
        sbM.append(", chunksHash=");
        sbM.append(str);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ StoreGetStickersKeywordsResponse(int i, List list, Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str);
    }
}
