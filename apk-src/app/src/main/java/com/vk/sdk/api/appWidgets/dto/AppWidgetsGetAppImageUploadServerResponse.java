package com.vk.sdk.api.appWidgets.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class AppWidgetsGetAppImageUploadServerResponse {

    @b("upload_url")
    @Nullable
    private final String uploadUrl;

    public AppWidgetsGetAppImageUploadServerResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AppWidgetsGetAppImageUploadServerResponse copy$default(AppWidgetsGetAppImageUploadServerResponse appWidgetsGetAppImageUploadServerResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appWidgetsGetAppImageUploadServerResponse.uploadUrl;
        }
        return appWidgetsGetAppImageUploadServerResponse.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.uploadUrl;
    }

    @NotNull
    public final AppWidgetsGetAppImageUploadServerResponse copy(@Nullable String str) {
        return new AppWidgetsGetAppImageUploadServerResponse(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppWidgetsGetAppImageUploadServerResponse) && Intrinsics.a(this.uploadUrl, ((AppWidgetsGetAppImageUploadServerResponse) obj).uploadUrl);
    }

    @Nullable
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        String str = this.uploadUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return a.f("AppWidgetsGetAppImageUploadServerResponse(uploadUrl=", this.uploadUrl, ")");
    }

    public AppWidgetsGetAppImageUploadServerResponse(@Nullable String str) {
        this.uploadUrl = str;
    }

    public /* synthetic */ AppWidgetsGetAppImageUploadServerResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
