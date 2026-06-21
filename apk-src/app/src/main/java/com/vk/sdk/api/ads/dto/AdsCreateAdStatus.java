package com.vk.sdk.api.ads.dto;

import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class AdsCreateAdStatus {

    @b(VKApiCodes.PARAM_ERROR_CODE)
    @Nullable
    private final Integer errorCode;

    @b("error_desc")
    @Nullable
    private final String errorDesc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15114id;

    @b("post_id")
    @Nullable
    private final Integer postId;

    public AdsCreateAdStatus(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        this.f15114id = i;
        this.postId = num;
        this.errorCode = num2;
        this.errorDesc = str;
    }

    public static /* synthetic */ AdsCreateAdStatus copy$default(AdsCreateAdStatus adsCreateAdStatus, int i, Integer num, Integer num2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = adsCreateAdStatus.f15114id;
        }
        if ((i10 & 2) != 0) {
            num = adsCreateAdStatus.postId;
        }
        if ((i10 & 4) != 0) {
            num2 = adsCreateAdStatus.errorCode;
        }
        if ((i10 & 8) != 0) {
            str = adsCreateAdStatus.errorDesc;
        }
        return adsCreateAdStatus.copy(i, num, num2, str);
    }

    public final int component1() {
        return this.f15114id;
    }

    @Nullable
    public final Integer component2() {
        return this.postId;
    }

    @Nullable
    public final Integer component3() {
        return this.errorCode;
    }

    @Nullable
    public final String component4() {
        return this.errorDesc;
    }

    @NotNull
    public final AdsCreateAdStatus copy(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        return new AdsCreateAdStatus(i, num, num2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCreateAdStatus)) {
            return false;
        }
        AdsCreateAdStatus adsCreateAdStatus = (AdsCreateAdStatus) obj;
        return this.f15114id == adsCreateAdStatus.f15114id && Intrinsics.a(this.postId, adsCreateAdStatus.postId) && Intrinsics.a(this.errorCode, adsCreateAdStatus.errorCode) && Intrinsics.a(this.errorDesc, adsCreateAdStatus.errorDesc);
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getId() {
        return this.f15114id;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f15114id) * 31;
        Integer num = this.postId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.errorDesc;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsCreateAdStatus(id=" + this.f15114id + ", postId=" + this.postId + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ")";
    }

    public /* synthetic */ AdsCreateAdStatus(int i, Integer num, Integer num2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : str);
    }
}
