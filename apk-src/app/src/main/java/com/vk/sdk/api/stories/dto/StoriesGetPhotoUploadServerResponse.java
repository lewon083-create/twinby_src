package com.vk.sdk.api.stories.dto;

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
public final class StoriesGetPhotoUploadServerResponse {

    @b("upload_url")
    @NotNull
    private final String uploadUrl;

    @b("user_ids")
    @NotNull
    private final List<Integer> userIds;

    public StoriesGetPhotoUploadServerResponse(@NotNull String uploadUrl, @NotNull List<Integer> userIds) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.uploadUrl = uploadUrl;
        this.userIds = userIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesGetPhotoUploadServerResponse copy$default(StoriesGetPhotoUploadServerResponse storiesGetPhotoUploadServerResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storiesGetPhotoUploadServerResponse.uploadUrl;
        }
        if ((i & 2) != 0) {
            list = storiesGetPhotoUploadServerResponse.userIds;
        }
        return storiesGetPhotoUploadServerResponse.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.uploadUrl;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.userIds;
    }

    @NotNull
    public final StoriesGetPhotoUploadServerResponse copy(@NotNull String uploadUrl, @NotNull List<Integer> userIds) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        return new StoriesGetPhotoUploadServerResponse(uploadUrl, userIds);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetPhotoUploadServerResponse)) {
            return false;
        }
        StoriesGetPhotoUploadServerResponse storiesGetPhotoUploadServerResponse = (StoriesGetPhotoUploadServerResponse) obj;
        return Intrinsics.a(this.uploadUrl, storiesGetPhotoUploadServerResponse.uploadUrl) && Intrinsics.a(this.userIds, storiesGetPhotoUploadServerResponse.userIds);
    }

    @NotNull
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @NotNull
    public final List<Integer> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        return this.userIds.hashCode() + (this.uploadUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "StoriesGetPhotoUploadServerResponse(uploadUrl=" + this.uploadUrl + ", userIds=" + this.userIds + ")";
    }
}
