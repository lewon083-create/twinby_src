package com.vk.sdk.api.store;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseSticker;
import com.vk.sdk.api.store.dto.StoreGetStickersKeywordsResponse;
import com.vk.sdk.api.store.dto.StoreProduct;
import java.util.List;
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
public final class StoreService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storeAddStickersToFavorite$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m490storeAddStickersToFavorite$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storeGetFavoriteStickers$lambda-2, reason: not valid java name */
    public static final List m491storeGetFavoriteStickers$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objC = GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends BaseSticker>>() { // from class: com.vk.sdk.api.store.StoreService$storeGetFavoriteStickers$1$typeToken$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objC, "GsonHolder.gson.fromJson…eSticker>>(it, typeToken)");
        return (List) objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storeGetProducts$default(StoreService storeService, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        return storeService.storeGetProducts(str, str2, str3, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storeGetProducts$lambda-3, reason: not valid java name */
    public static final List m492storeGetProducts$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends StoreProduct>>() { // from class: com.vk.sdk.api.store.StoreService$storeGetProducts$1$typeToken$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storeGetStickersKeywords$default(StoreService storeService, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        return storeService.storeGetStickersKeywords(list, list2, bool, bool2, bool3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storeGetStickersKeywords$lambda-10, reason: not valid java name */
    public static final StoreGetStickersKeywordsResponse m493storeGetStickersKeywords$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StoreGetStickersKeywordsResponse) GsonHolder.INSTANCE.getGson().b(it, StoreGetStickersKeywordsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storeRemoveStickersFromFavorite$lambda-17, reason: not valid java name */
    public static final BaseOkResponse m494storeRemoveStickersFromFavorite$lambda17(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storeAddStickersToFavorite(@NotNull List<Integer> stickerIds) {
        Intrinsics.checkNotNullParameter(stickerIds, "stickerIds");
        NewApiRequest newApiRequest = new NewApiRequest("store.addStickersToFavorite", new pf.a(5));
        newApiRequest.addParam("sticker_ids", stickerIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<BaseSticker>> storeGetFavoriteStickers() {
        return new NewApiRequest("store.getFavoriteStickers", new pf.a(6));
    }

    @NotNull
    public final VKRequest<List<StoreProduct>> storeGetProducts(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<Integer> list, @Nullable List<String> list2) {
        NewApiRequest newApiRequest = new NewApiRequest("store.getProducts", new pf.a(4));
        if (str != null) {
            newApiRequest.addParam("type", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("merchant", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("section", str3);
        }
        if (list != null) {
            newApiRequest.addParam("product_ids", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("filters", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<StoreGetStickersKeywordsResponse> storeGetStickersKeywords(@Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        NewApiRequest newApiRequest = new NewApiRequest("store.getStickersKeywords", new pf.a(2));
        if (list != null) {
            newApiRequest.addParam("stickers_ids", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("products_ids", list2);
        }
        if (bool != null) {
            newApiRequest.addParam("aliases", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("all_products", bool2.booleanValue());
        }
        if (bool3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_stickers", bool3.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storeRemoveStickersFromFavorite(@NotNull List<Integer> stickerIds) {
        Intrinsics.checkNotNullParameter(stickerIds, "stickerIds");
        NewApiRequest newApiRequest = new NewApiRequest("store.removeStickersFromFavorite", new pf.a(3));
        newApiRequest.addParam("sticker_ids", stickerIds);
        return newApiRequest;
    }
}
