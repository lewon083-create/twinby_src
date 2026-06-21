package com.vk.sdk.api.ads.dto;

import a0.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;
import t.z;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AdsLookalikeRequest {

    @b("audience_count")
    @Nullable
    private final Integer audienceCount;

    @b("create_time")
    private final int createTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15119id;

    @b("save_audience_levels")
    @Nullable
    private final List<AdsLookalikeRequestSaveAudienceLevel> saveAudienceLevels;

    @b("scheduled_delete_time")
    @Nullable
    private final Integer scheduledDeleteTime;

    @b("source_name")
    @Nullable
    private final String sourceName;

    @b("source_retargeting_group_id")
    @Nullable
    private final Integer sourceRetargetingGroupId;

    @b("source_type")
    @NotNull
    private final SourceType sourceType;

    @b("status")
    @NotNull
    private final Status status;

    @b("update_time")
    private final int updateTime;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum SourceType {
        UNKNOWN("unknown"),
        RETARGETING_GROUP("retargeting_group"),
        PROMOTED_POST("promoted_post");


        @NotNull
        private final String value;

        SourceType(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Status {
        UNKNOWN("unknown"),
        NEW("new"),
        SEARCH_QUEUED("search_queued"),
        SEARCH_IN_PROGRESS("search_in_progress"),
        SEARCH_FAILED("search_failed"),
        SEARCH_DONE("search_done"),
        SAVE_IN_PROGRESS("save_in_progress"),
        SAVE_FAILED("save_failed"),
        SAVE_DONE("save_done"),
        CANCELED("canceled");


        @NotNull
        private final String value;

        Status(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public AdsLookalikeRequest(int i, int i10, int i11, @NotNull Status status, @NotNull SourceType sourceType, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable List<AdsLookalikeRequestSaveAudienceLevel> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.f15119id = i;
        this.createTime = i10;
        this.updateTime = i11;
        this.status = status;
        this.sourceType = sourceType;
        this.scheduledDeleteTime = num;
        this.sourceRetargetingGroupId = num2;
        this.sourceName = str;
        this.audienceCount = num3;
        this.saveAudienceLevels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsLookalikeRequest copy$default(AdsLookalikeRequest adsLookalikeRequest, int i, int i10, int i11, Status status, SourceType sourceType, Integer num, Integer num2, String str, Integer num3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = adsLookalikeRequest.f15119id;
        }
        if ((i12 & 2) != 0) {
            i10 = adsLookalikeRequest.createTime;
        }
        if ((i12 & 4) != 0) {
            i11 = adsLookalikeRequest.updateTime;
        }
        if ((i12 & 8) != 0) {
            status = adsLookalikeRequest.status;
        }
        if ((i12 & 16) != 0) {
            sourceType = adsLookalikeRequest.sourceType;
        }
        if ((i12 & 32) != 0) {
            num = adsLookalikeRequest.scheduledDeleteTime;
        }
        if ((i12 & 64) != 0) {
            num2 = adsLookalikeRequest.sourceRetargetingGroupId;
        }
        if ((i12 & 128) != 0) {
            str = adsLookalikeRequest.sourceName;
        }
        if ((i12 & 256) != 0) {
            num3 = adsLookalikeRequest.audienceCount;
        }
        if ((i12 & 512) != 0) {
            list = adsLookalikeRequest.saveAudienceLevels;
        }
        Integer num4 = num3;
        List list2 = list;
        Integer num5 = num2;
        String str2 = str;
        SourceType sourceType2 = sourceType;
        Integer num6 = num;
        return adsLookalikeRequest.copy(i, i10, i11, status, sourceType2, num6, num5, str2, num4, list2);
    }

    public final int component1() {
        return this.f15119id;
    }

    @Nullable
    public final List<AdsLookalikeRequestSaveAudienceLevel> component10() {
        return this.saveAudienceLevels;
    }

    public final int component2() {
        return this.createTime;
    }

    public final int component3() {
        return this.updateTime;
    }

    @NotNull
    public final Status component4() {
        return this.status;
    }

    @NotNull
    public final SourceType component5() {
        return this.sourceType;
    }

    @Nullable
    public final Integer component6() {
        return this.scheduledDeleteTime;
    }

    @Nullable
    public final Integer component7() {
        return this.sourceRetargetingGroupId;
    }

    @Nullable
    public final String component8() {
        return this.sourceName;
    }

    @Nullable
    public final Integer component9() {
        return this.audienceCount;
    }

    @NotNull
    public final AdsLookalikeRequest copy(int i, int i10, int i11, @NotNull Status status, @NotNull SourceType sourceType, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable List<AdsLookalikeRequestSaveAudienceLevel> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return new AdsLookalikeRequest(i, i10, i11, status, sourceType, num, num2, str, num3, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsLookalikeRequest)) {
            return false;
        }
        AdsLookalikeRequest adsLookalikeRequest = (AdsLookalikeRequest) obj;
        return this.f15119id == adsLookalikeRequest.f15119id && this.createTime == adsLookalikeRequest.createTime && this.updateTime == adsLookalikeRequest.updateTime && this.status == adsLookalikeRequest.status && this.sourceType == adsLookalikeRequest.sourceType && Intrinsics.a(this.scheduledDeleteTime, adsLookalikeRequest.scheduledDeleteTime) && Intrinsics.a(this.sourceRetargetingGroupId, adsLookalikeRequest.sourceRetargetingGroupId) && Intrinsics.a(this.sourceName, adsLookalikeRequest.sourceName) && Intrinsics.a(this.audienceCount, adsLookalikeRequest.audienceCount) && Intrinsics.a(this.saveAudienceLevels, adsLookalikeRequest.saveAudienceLevels);
    }

    @Nullable
    public final Integer getAudienceCount() {
        return this.audienceCount;
    }

    public final int getCreateTime() {
        return this.createTime;
    }

    public final int getId() {
        return this.f15119id;
    }

    @Nullable
    public final List<AdsLookalikeRequestSaveAudienceLevel> getSaveAudienceLevels() {
        return this.saveAudienceLevels;
    }

    @Nullable
    public final Integer getScheduledDeleteTime() {
        return this.scheduledDeleteTime;
    }

    @Nullable
    public final String getSourceName() {
        return this.sourceName;
    }

    @Nullable
    public final Integer getSourceRetargetingGroupId() {
        return this.sourceRetargetingGroupId;
    }

    @NotNull
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public final int getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = (this.sourceType.hashCode() + ((this.status.hashCode() + u.g(this.updateTime, u.g(this.createTime, Integer.hashCode(this.f15119id) * 31, 31), 31)) * 31)) * 31;
        Integer num = this.scheduledDeleteTime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sourceRetargetingGroupId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sourceName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.audienceCount;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<AdsLookalikeRequestSaveAudienceLevel> list = this.saveAudienceLevels;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15119id;
        int i10 = this.createTime;
        int i11 = this.updateTime;
        Status status = this.status;
        SourceType sourceType = this.sourceType;
        Integer num = this.scheduledDeleteTime;
        Integer num2 = this.sourceRetargetingGroupId;
        String str = this.sourceName;
        Integer num3 = this.audienceCount;
        List<AdsLookalikeRequestSaveAudienceLevel> list = this.saveAudienceLevels;
        StringBuilder sbI = z.i("AdsLookalikeRequest(id=", i, ", createTime=", i10, ", updateTime=");
        sbI.append(i11);
        sbI.append(", status=");
        sbI.append(status);
        sbI.append(", sourceType=");
        sbI.append(sourceType);
        sbI.append(", scheduledDeleteTime=");
        sbI.append(num);
        sbI.append(", sourceRetargetingGroupId=");
        a.r(num2, ", sourceName=", str, ", audienceCount=", sbI);
        sbI.append(num3);
        sbI.append(", saveAudienceLevels=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ AdsLookalikeRequest(int i, int i10, int i11, Status status, SourceType sourceType, Integer num, Integer num2, String str, Integer num3, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, status, sourceType, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : str, (i12 & 256) != 0 ? null : num3, (i12 & 512) != 0 ? null : list);
    }
}
