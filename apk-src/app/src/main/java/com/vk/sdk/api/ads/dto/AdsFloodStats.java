package com.vk.sdk.api.ads.dto;

import com.google.android.gms.internal.ads.om1;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class AdsFloodStats {

    @b(RRWebVideoEvent.JsonKeys.LEFT)
    private final int left;

    @b("refresh")
    private final int refresh;

    public AdsFloodStats(int i, int i10) {
        this.left = i;
        this.refresh = i10;
    }

    public static /* synthetic */ AdsFloodStats copy$default(AdsFloodStats adsFloodStats, int i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = adsFloodStats.left;
        }
        if ((i11 & 2) != 0) {
            i10 = adsFloodStats.refresh;
        }
        return adsFloodStats.copy(i, i10);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.refresh;
    }

    @NotNull
    public final AdsFloodStats copy(int i, int i10) {
        return new AdsFloodStats(i, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsFloodStats)) {
            return false;
        }
        AdsFloodStats adsFloodStats = (AdsFloodStats) obj;
        return this.left == adsFloodStats.left && this.refresh == adsFloodStats.refresh;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRefresh() {
        return this.refresh;
    }

    public int hashCode() {
        return Integer.hashCode(this.refresh) + (Integer.hashCode(this.left) * 31);
    }

    @NotNull
    public String toString() {
        return om1.j("AdsFloodStats(left=", this.left, ", refresh=", this.refresh, ")");
    }
}
