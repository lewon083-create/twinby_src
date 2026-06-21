package com.vk.sdk.api.market.dto;

import a0.u;
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
public final class MarketAddResponse {

    @b("market_item_id")
    private final int marketItemId;

    public MarketAddResponse(int i) {
        this.marketItemId = i;
    }

    public static /* synthetic */ MarketAddResponse copy$default(MarketAddResponse marketAddResponse, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = marketAddResponse.marketItemId;
        }
        return marketAddResponse.copy(i);
    }

    public final int component1() {
        return this.marketItemId;
    }

    @NotNull
    public final MarketAddResponse copy(int i) {
        return new MarketAddResponse(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketAddResponse) && this.marketItemId == ((MarketAddResponse) obj).marketItemId;
    }

    public final int getMarketItemId() {
        return this.marketItemId;
    }

    public int hashCode() {
        return Integer.hashCode(this.marketItemId);
    }

    @NotNull
    public String toString() {
        return u.k(this.marketItemId, "MarketAddResponse(marketItemId=", ")");
    }
}
