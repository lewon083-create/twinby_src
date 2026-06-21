package com.vk.sdk.api.podcasts;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.podcasts.dto.PodcastsSearchPodcastResponse;
import hf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
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
public final class PodcastsService {
    public static /* synthetic */ VKRequest podcastsSearchPodcast$default(PodcastsService podcastsService, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return podcastsService.podcastsSearchPodcast(str, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: podcastsSearchPodcast$lambda-0, reason: not valid java name */
    public static final PodcastsSearchPodcastResponse m455podcastsSearchPodcast$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PodcastsSearchPodcastResponse) GsonHolder.INSTANCE.getGson().b(it, PodcastsSearchPodcastResponse.class);
    }

    @NotNull
    public final VKRequest<PodcastsSearchPodcastResponse> podcastsSearchPodcast(@NotNull String searchString, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        NewApiRequest newApiRequest = new NewApiRequest("podcasts.searchPodcast", new a(24));
        newApiRequest.addParam("search_string", searchString);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 1, 1000);
        return newApiRequest;
    }
}
