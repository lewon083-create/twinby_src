package com.vk.api.sdk.utils;

import android.net.Uri;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.internal.VKErrorUtils;
import h1.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ApiExtKt {
    public static final boolean hasExecuteError(String str, int[] iArr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return VKErrorUtils.INSTANCE.hasExecuteError(str, iArr);
    }

    public static final boolean hasSimpleError(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return VKErrorUtils.INSTANCE.hasSimpleError(str);
    }

    public static final boolean isOAuthBlank(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return VKApiConfig.DEFAULT_OAUTH_DOMAIN.equals(uri.getHost()) && "/blank.html".equals(uri.getPath());
    }

    public static final <E> void set(g gVar, long j10, E e3) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        gVar.d(j10, e3);
    }

    public static final VKApiException toExecuteError(String str, String method, int[] iArr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        return VKErrorUtils.INSTANCE.parseExecuteError(str, method, iArr);
    }

    public static final VKApiException toSimpleError(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return VKErrorUtils.INSTANCE.parseSimpleError(str, str2, str3);
    }

    public static /* synthetic */ VKApiException toSimpleError$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = null;
        }
        return toSimpleError(str, str2, str3);
    }
}
