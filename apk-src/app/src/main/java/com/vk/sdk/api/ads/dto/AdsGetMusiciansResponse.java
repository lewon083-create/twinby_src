package com.vk.sdk.api.ads.dto;

import java.util.List;
import kotlin.Metadata;
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
public final class AdsGetMusiciansResponse {

    @b("items")
    @NotNull
    private final List<AdsMusician> items;

    public AdsGetMusiciansResponse(@NotNull List<AdsMusician> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsGetMusiciansResponse copy$default(AdsGetMusiciansResponse adsGetMusiciansResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adsGetMusiciansResponse.items;
        }
        return adsGetMusiciansResponse.copy(list);
    }

    @NotNull
    public final List<AdsMusician> component1() {
        return this.items;
    }

    @NotNull
    public final AdsGetMusiciansResponse copy(@NotNull List<AdsMusician> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AdsGetMusiciansResponse(items);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsGetMusiciansResponse) && Intrinsics.a(this.items, ((AdsGetMusiciansResponse) obj).items);
    }

    @NotNull
    public final List<AdsMusician> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdsGetMusiciansResponse(items=" + this.items + ")";
    }
}
