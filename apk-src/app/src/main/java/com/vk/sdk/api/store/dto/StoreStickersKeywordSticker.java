package com.vk.sdk.api.store.dto;

import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
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
public final class StoreStickersKeywordSticker {

    @b("pack_id")
    private final int packId;

    @b("sticker_id")
    private final int stickerId;

    public StoreStickersKeywordSticker(int i, int i10) {
        this.packId = i;
        this.stickerId = i10;
    }

    public static /* synthetic */ StoreStickersKeywordSticker copy$default(StoreStickersKeywordSticker storeStickersKeywordSticker, int i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = storeStickersKeywordSticker.packId;
        }
        if ((i11 & 2) != 0) {
            i10 = storeStickersKeywordSticker.stickerId;
        }
        return storeStickersKeywordSticker.copy(i, i10);
    }

    public final int component1() {
        return this.packId;
    }

    public final int component2() {
        return this.stickerId;
    }

    @NotNull
    public final StoreStickersKeywordSticker copy(int i, int i10) {
        return new StoreStickersKeywordSticker(i, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStickersKeywordSticker)) {
            return false;
        }
        StoreStickersKeywordSticker storeStickersKeywordSticker = (StoreStickersKeywordSticker) obj;
        return this.packId == storeStickersKeywordSticker.packId && this.stickerId == storeStickersKeywordSticker.stickerId;
    }

    public final int getPackId() {
        return this.packId;
    }

    public final int getStickerId() {
        return this.stickerId;
    }

    public int hashCode() {
        return Integer.hashCode(this.stickerId) + (Integer.hashCode(this.packId) * 31);
    }

    @NotNull
    public String toString() {
        return om1.j("StoreStickersKeywordSticker(packId=", this.packId, ", stickerId=", this.stickerId, ")");
    }
}
