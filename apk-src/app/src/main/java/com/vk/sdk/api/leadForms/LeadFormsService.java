package com.vk.sdk.api.leadForms;

import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.leadForms.dto.LeadFormsCreateResponse;
import com.vk.sdk.api.leadForms.dto.LeadFormsDeleteResponse;
import com.vk.sdk.api.leadForms.dto.LeadFormsForm;
import com.vk.sdk.api.leadForms.dto.LeadFormsGetLeadsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wf.b;

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
public final class LeadFormsService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsCreate$lambda-0, reason: not valid java name */
    public static final LeadFormsCreateResponse m265leadFormsCreate$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LeadFormsCreateResponse) GsonHolder.INSTANCE.getGson().b(it, LeadFormsCreateResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsDelete$lambda-10, reason: not valid java name */
    public static final LeadFormsDeleteResponse m266leadFormsDelete$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LeadFormsDeleteResponse) GsonHolder.INSTANCE.getGson().b(it, LeadFormsDeleteResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsGet$lambda-12, reason: not valid java name */
    public static final LeadFormsForm m267leadFormsGet$lambda12(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LeadFormsForm) GsonHolder.INSTANCE.getGson().b(it, LeadFormsForm.class);
    }

    public static /* synthetic */ VKRequest leadFormsGetLeads$default(LeadFormsService leadFormsService, int i, int i10, Integer num, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        return leadFormsService.leadFormsGetLeads(i, i10, num, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsGetLeads$lambda-14, reason: not valid java name */
    public static final LeadFormsGetLeadsResponse m268leadFormsGetLeads$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LeadFormsGetLeadsResponse) GsonHolder.INSTANCE.getGson().b(it, LeadFormsGetLeadsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsGetUploadURL$lambda-18, reason: not valid java name */
    public static final String m269leadFormsGetUploadURL$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, String.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson(it, String::class.java)");
        return (String) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsList$lambda-19, reason: not valid java name */
    public static final List m270leadFormsList$lambda19(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends LeadFormsForm>>() { // from class: com.vk.sdk.api.leadForms.LeadFormsService$leadFormsList$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: leadFormsUpdate$lambda-21, reason: not valid java name */
    public static final LeadFormsCreateResponse m271leadFormsUpdate$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (LeadFormsCreateResponse) GsonHolder.INSTANCE.getGson().b(it, LeadFormsCreateResponse.class);
    }

    @NotNull
    public final VKRequest<LeadFormsCreateResponse> leadFormsCreate(int i, @NotNull String name, @NotNull String title, @NotNull String description, @NotNull String questions, @NotNull String policyLinkUrl, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable List<Integer> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(policyLinkUrl, "policyLinkUrl");
        NewApiRequest newApiRequest = new NewApiRequest("leadForms.create", new b(20));
        newApiRequest.addParam("group_id", i);
        NewApiRequest.addParam$default(newApiRequest, "name", name, 0, 100, 4, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 60, 4, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "description", description, 0, VKApiCodes.CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION, 4, (Object) null);
        newApiRequest.addParam("questions", questions);
        NewApiRequest.addParam$default(newApiRequest, "policy_link_url", policyLinkUrl, 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 4, (Object) null);
        if (str != null) {
            newApiRequest.addParam("photo", str);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "confirmation", str2, 0, VKApiCodes.CODE_PHOTO_ALBUM_LIMIT_EXCEED, 4, (Object) null);
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "site_link_url", str3, 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 4, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("active", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("once_per_user", bool2.booleanValue());
        }
        if (str4 != null) {
            newApiRequest.addParam("pixel_code", str4);
        }
        if (list != null) {
            newApiRequest.addParam("notify_admins", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("notify_emails", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LeadFormsDeleteResponse> leadFormsDelete(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("leadForms.delete", new b(24));
        newApiRequest.addParam("group_id", i);
        newApiRequest.addParam("form_id", i10);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LeadFormsForm> leadFormsGet(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("leadForms.get", new b(26));
        newApiRequest.addParam("group_id", i);
        newApiRequest.addParam("form_id", i10);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LeadFormsGetLeadsResponse> leadFormsGetLeads(int i, int i10, @Nullable Integer num, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("leadForms.getLeads", new b(25));
        newApiRequest.addParam("group_id", i);
        newApiRequest.addParam("form_id", i10);
        if (num != null) {
            newApiRequest.addParam("limit", num.intValue(), 1, 1000);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("next_page_token", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<String> leadFormsGetUploadURL() {
        return new NewApiRequest("leadForms.getUploadURL", new b(22));
    }

    @NotNull
    public final VKRequest<List<LeadFormsForm>> leadFormsList(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("leadForms.list", new b(21));
        newApiRequest.addParam("group_id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<LeadFormsCreateResponse> leadFormsUpdate(int i, int i10, @NotNull String name, @NotNull String title, @NotNull String description, @NotNull String questions, @NotNull String policyLinkUrl, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable List<Integer> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(policyLinkUrl, "policyLinkUrl");
        NewApiRequest newApiRequest = new NewApiRequest("leadForms.update", new b(23));
        newApiRequest.addParam("group_id", i);
        newApiRequest.addParam("form_id", i10);
        NewApiRequest.addParam$default(newApiRequest, "name", name, 0, 100, 4, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 60, 4, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "description", description, 0, VKApiCodes.CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION, 4, (Object) null);
        newApiRequest.addParam("questions", questions);
        NewApiRequest.addParam$default(newApiRequest, "policy_link_url", policyLinkUrl, 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 4, (Object) null);
        if (str != null) {
            newApiRequest.addParam("photo", str);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "confirmation", str2, 0, VKApiCodes.CODE_PHOTO_ALBUM_LIMIT_EXCEED, 4, (Object) null);
        }
        if (str3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "site_link_url", str3, 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 4, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("active", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("once_per_user", bool2.booleanValue());
        }
        if (str4 != null) {
            newApiRequest.addParam("pixel_code", str4);
        }
        if (list != null) {
            newApiRequest.addParam("notify_admins", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("notify_emails", list2);
        return newApiRequest;
    }
}
