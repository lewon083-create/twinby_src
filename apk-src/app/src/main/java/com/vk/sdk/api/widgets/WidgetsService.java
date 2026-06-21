package com.vk.sdk.api.widgets;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.users.dto.UsersFields;
import com.vk.sdk.api.widgets.dto.WidgetsGetCommentsResponse;
import com.vk.sdk.api.widgets.dto.WidgetsGetPagesResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
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
public final class WidgetsService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest widgetsGetComments$default(WidgetsService widgetsService, Integer num, String str, String str2, String str3, List list, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            num3 = null;
        }
        return widgetsService.widgetsGetComments(num, str, str2, str3, list, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: widgetsGetComments$lambda-0, reason: not valid java name */
    public static final WidgetsGetCommentsResponse m589widgetsGetComments$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WidgetsGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, WidgetsGetCommentsResponse.class);
    }

    public static /* synthetic */ VKRequest widgetsGetPages$default(WidgetsService widgetsService, Integer num, String str, String str2, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        return widgetsService.widgetsGetPages(num, str, str2, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: widgetsGetPages$lambda-10, reason: not valid java name */
    public static final WidgetsGetPagesResponse m590widgetsGetPages$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WidgetsGetPagesResponse) GsonHolder.INSTANCE.getGson().b(it, WidgetsGetPagesResponse.class);
    }

    @NotNull
    public final VKRequest<WidgetsGetCommentsResponse> widgetsGetComments(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<? extends UsersFields> list, @Nullable Integer num2, @Nullable Integer num3) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("widgets.getComments", new b(10));
        if (num != null) {
            newApiRequest.addParam("widget_api_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("url", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("page_id", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("order", str3);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num3.intValue(), 10, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WidgetsGetPagesResponse> widgetsGetPages(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("widgets.getPages", new b(11));
        if (num != null) {
            newApiRequest.addParam("widget_api_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("order", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("period", str2);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num3.intValue(), 10, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        return newApiRequest;
    }
}
