package com.vk.sdk.api.podcasts.dto;

import com.vk.sdk.api.podcast.dto.PodcastExternalData;
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
public final class PodcastsSearchPodcastResponse {

    @b("podcasts")
    @NotNull
    private final List<PodcastExternalData> podcasts;

    @b("results_total")
    private final int resultsTotal;

    public PodcastsSearchPodcastResponse(@NotNull List<PodcastExternalData> podcasts, int i) {
        Intrinsics.checkNotNullParameter(podcasts, "podcasts");
        this.podcasts = podcasts;
        this.resultsTotal = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PodcastsSearchPodcastResponse copy$default(PodcastsSearchPodcastResponse podcastsSearchPodcastResponse, List list, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = podcastsSearchPodcastResponse.podcasts;
        }
        if ((i10 & 2) != 0) {
            i = podcastsSearchPodcastResponse.resultsTotal;
        }
        return podcastsSearchPodcastResponse.copy(list, i);
    }

    @NotNull
    public final List<PodcastExternalData> component1() {
        return this.podcasts;
    }

    public final int component2() {
        return this.resultsTotal;
    }

    @NotNull
    public final PodcastsSearchPodcastResponse copy(@NotNull List<PodcastExternalData> podcasts, int i) {
        Intrinsics.checkNotNullParameter(podcasts, "podcasts");
        return new PodcastsSearchPodcastResponse(podcasts, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsSearchPodcastResponse)) {
            return false;
        }
        PodcastsSearchPodcastResponse podcastsSearchPodcastResponse = (PodcastsSearchPodcastResponse) obj;
        return Intrinsics.a(this.podcasts, podcastsSearchPodcastResponse.podcasts) && this.resultsTotal == podcastsSearchPodcastResponse.resultsTotal;
    }

    @NotNull
    public final List<PodcastExternalData> getPodcasts() {
        return this.podcasts;
    }

    public final int getResultsTotal() {
        return this.resultsTotal;
    }

    public int hashCode() {
        return Integer.hashCode(this.resultsTotal) + (this.podcasts.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PodcastsSearchPodcastResponse(podcasts=" + this.podcasts + ", resultsTotal=" + this.resultsTotal + ")";
    }
}
