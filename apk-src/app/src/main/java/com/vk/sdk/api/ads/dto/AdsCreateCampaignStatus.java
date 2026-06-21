package com.vk.sdk.api.ads.dto;

import a0.u;
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
public final class AdsCreateCampaignStatus {

    @b(VKApiCodes.PARAM_ERROR_CODE)
    @Nullable
    private final Integer errorCode;

    @b("error_desc")
    @Nullable
    private final String errorDesc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15115id;

    public AdsCreateCampaignStatus(int i, @Nullable Integer num, @Nullable String str) {
        this.f15115id = i;
        this.errorCode = num;
        this.errorDesc = str;
    }

    public static /* synthetic */ AdsCreateCampaignStatus copy$default(AdsCreateCampaignStatus adsCreateCampaignStatus, int i, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = adsCreateCampaignStatus.f15115id;
        }
        if ((i10 & 2) != 0) {
            num = adsCreateCampaignStatus.errorCode;
        }
        if ((i10 & 4) != 0) {
            str = adsCreateCampaignStatus.errorDesc;
        }
        return adsCreateCampaignStatus.copy(i, num, str);
    }

    public final int component1() {
        return this.f15115id;
    }

    @Nullable
    public final Integer component2() {
        return this.errorCode;
    }

    @Nullable
    public final String component3() {
        return this.errorDesc;
    }

    @NotNull
    public final AdsCreateCampaignStatus copy(int i, @Nullable Integer num, @Nullable String str) {
        return new AdsCreateCampaignStatus(i, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCreateCampaignStatus)) {
            return false;
        }
        AdsCreateCampaignStatus adsCreateCampaignStatus = (AdsCreateCampaignStatus) obj;
        return this.f15115id == adsCreateCampaignStatus.f15115id && Intrinsics.a(this.errorCode, adsCreateCampaignStatus.errorCode) && Intrinsics.a(this.errorDesc, adsCreateCampaignStatus.errorDesc);
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
        return this.f15115id;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f15115id) * 31;
        Integer num = this.errorCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorDesc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15115id;
        Integer num = this.errorCode;
        String str = this.errorDesc;
        StringBuilder sb2 = new StringBuilder("AdsCreateCampaignStatus(id=");
        sb2.append(i);
        sb2.append(", errorCode=");
        sb2.append(num);
        sb2.append(", errorDesc=");
        return u.o(sb2, str, ")");
    }

    public /* synthetic */ AdsCreateCampaignStatus(int i, Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str);
    }
}
