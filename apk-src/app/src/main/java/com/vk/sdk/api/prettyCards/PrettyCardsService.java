package com.vk.sdk.api.prettyCards;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.prettyCards.dto.PrettyCardsCreateResponse;
import com.vk.sdk.api.prettyCards.dto.PrettyCardsDeleteResponse;
import com.vk.sdk.api.prettyCards.dto.PrettyCardsEditResponse;
import com.vk.sdk.api.prettyCards.dto.PrettyCardsGetResponse;
import com.vk.sdk.api.prettyCards.dto.PrettyCardsPrettyCardOrError;
import java.util.List;
import kotlin.KotlinVersion;
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
public final class PrettyCardsService {
    public static /* synthetic */ VKRequest prettyCardsCreate$default(PrettyCardsService prettyCardsService, int i, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        if ((i10 & 64) != 0) {
            str6 = null;
        }
        return prettyCardsService.prettyCardsCreate(i, str, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prettyCardsCreate$lambda-0, reason: not valid java name */
    public static final PrettyCardsCreateResponse m465prettyCardsCreate$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PrettyCardsCreateResponse) GsonHolder.INSTANCE.getGson().b(it, PrettyCardsCreateResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prettyCardsDelete$lambda-5, reason: not valid java name */
    public static final PrettyCardsDeleteResponse m466prettyCardsDelete$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PrettyCardsDeleteResponse) GsonHolder.INSTANCE.getGson().b(it, PrettyCardsDeleteResponse.class);
    }

    public static /* synthetic */ VKRequest prettyCardsEdit$default(PrettyCardsService prettyCardsService, int i, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            str4 = null;
        }
        if ((i11 & 64) != 0) {
            str5 = null;
        }
        if ((i11 & 128) != 0) {
            str6 = null;
        }
        return prettyCardsService.prettyCardsEdit(i, i10, str, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prettyCardsEdit$lambda-7, reason: not valid java name */
    public static final PrettyCardsEditResponse m467prettyCardsEdit$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PrettyCardsEditResponse) GsonHolder.INSTANCE.getGson().b(it, PrettyCardsEditResponse.class);
    }

    public static /* synthetic */ VKRequest prettyCardsGet$default(PrettyCardsService prettyCardsService, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return prettyCardsService.prettyCardsGet(i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prettyCardsGet$lambda-15, reason: not valid java name */
    public static final PrettyCardsGetResponse m468prettyCardsGet$lambda15(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PrettyCardsGetResponse) GsonHolder.INSTANCE.getGson().b(it, PrettyCardsGetResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prettyCardsGetById$lambda-19, reason: not valid java name */
    public static final List m469prettyCardsGetById$lambda19(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PrettyCardsPrettyCardOrError>>() { // from class: com.vk.sdk.api.prettyCards.PrettyCardsService$prettyCardsGetById$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prettyCardsGetUploadURL$lambda-21, reason: not valid java name */
    public static final String m470prettyCardsGetUploadURL$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, String.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson(it, String::class.java)");
        return (String) objB;
    }

    @NotNull
    public final VKRequest<PrettyCardsCreateResponse> prettyCardsCreate(int i, @NotNull String photo, @NotNull String title, @NotNull String link, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        NewApiRequest newApiRequest = new NewApiRequest("prettyCards.create", new jf.a(8));
        newApiRequest.addParam("owner_id", i);
        newApiRequest.addParam("photo", photo);
        newApiRequest.addParam("title", title);
        NewApiRequest.addParam$default(newApiRequest, "link", link, 0, 2000, 4, (Object) null);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "price", str, 0, 20, 4, (Object) null);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_old", str2, 0, 20, 4, (Object) null);
        }
        if (str3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "button", str3, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PrettyCardsDeleteResponse> prettyCardsDelete(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("prettyCards.delete", new jf.a(6));
        newApiRequest.addParam("owner_id", i);
        newApiRequest.addParam("card_id", i10);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PrettyCardsEditResponse> prettyCardsEdit(int i, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        NewApiRequest newApiRequest = new NewApiRequest("prettyCards.edit", new jf.a(7));
        newApiRequest.addParam("owner_id", i);
        newApiRequest.addParam("card_id", i10);
        if (str != null) {
            newApiRequest.addParam("photo", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("title", str2);
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "link", str3, 0, 2000, 4, (Object) null);
        }
        if (str4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price", str4, 0, 20, 4, (Object) null);
        }
        if (str5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_old", str5, 0, 20, 4, (Object) null);
        }
        if (str6 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "button", str6, 0, KotlinVersion.MAX_COMPONENT_VALUE, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PrettyCardsGetResponse> prettyCardsGet(int i, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("prettyCards.get", new jf.a(4));
        newApiRequest.addParam("owner_id", i);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 100);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PrettyCardsPrettyCardOrError>> prettyCardsGetById(int i, @NotNull List<Integer> cardIds) {
        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
        NewApiRequest newApiRequest = new NewApiRequest("prettyCards.getById", new jf.a(9));
        newApiRequest.addParam("owner_id", i);
        newApiRequest.addParam("card_ids", cardIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<String> prettyCardsGetUploadURL() {
        return new NewApiRequest("prettyCards.getUploadURL", new jf.a(5));
    }
}
