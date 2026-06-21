package com.vk.sdk.api.downloadedGames.dto;

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
public final class DownloadedGamesPaidStatusResponse {

    @b("is_paid")
    private final boolean isPaid;

    public DownloadedGamesPaidStatusResponse(boolean z5) {
        this.isPaid = z5;
    }

    public static /* synthetic */ DownloadedGamesPaidStatusResponse copy$default(DownloadedGamesPaidStatusResponse downloadedGamesPaidStatusResponse, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = downloadedGamesPaidStatusResponse.isPaid;
        }
        return downloadedGamesPaidStatusResponse.copy(z5);
    }

    public final boolean component1() {
        return this.isPaid;
    }

    @NotNull
    public final DownloadedGamesPaidStatusResponse copy(boolean z5) {
        return new DownloadedGamesPaidStatusResponse(z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownloadedGamesPaidStatusResponse) && this.isPaid == ((DownloadedGamesPaidStatusResponse) obj).isPaid;
    }

    public int hashCode() {
        boolean z5 = this.isPaid;
        if (z5) {
            return 1;
        }
        return z5 ? 1 : 0;
    }

    public final boolean isPaid() {
        return this.isPaid;
    }

    @NotNull
    public String toString() {
        return "DownloadedGamesPaidStatusResponse(isPaid=" + this.isPaid + ")";
    }
}
