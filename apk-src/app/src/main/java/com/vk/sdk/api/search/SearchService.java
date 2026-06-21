package com.vk.sdk.api.search;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.search.dto.SearchGetHintsResponse;
import java.util.List;
import kf.a;
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
public final class SearchService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest searchGetHints$default(SearchService searchService, String str, Integer num, Integer num2, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return searchService.searchGetHints(str, num, num2, list, list2, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: searchGetHints$lambda-0, reason: not valid java name */
    public static final SearchGetHintsResponse m471searchGetHints$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (SearchGetHintsResponse) GsonHolder.INSTANCE.getGson().b(it, SearchGetHintsResponse.class);
    }

    @NotNull
    public final VKRequest<SearchGetHintsResponse> searchGetHints(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("search.getHints", new a(8));
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "q", str, 0, 9000, 4, (Object) null);
        }
        if (num != null) {
            newApiRequest.addParam("offset", num.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num2 != null) {
            newApiRequest.addParam("limit", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (list != null) {
            newApiRequest.addParam("filters", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("fields", list2);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("search_global", bool.booleanValue());
        return newApiRequest;
    }
}
