package com.vk.sdk.api.ads.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class AdsAdLayout {

    @b("ad_format")
    private final int adFormat;

    @b("campaign_id")
    private final int campaignId;

    @b("cost_type")
    @NotNull
    private final AdsAdCostType costType;

    @b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15110id;

    @b("image_src")
    @NotNull
    private final String imageSrc;

    @b("image_src_2x")
    @Nullable
    private final String imageSrc2x;

    @b("link_domain")
    @Nullable
    private final String linkDomain;

    @b("link_url")
    @NotNull
    private final String linkUrl;

    @b("preview_link")
    @Nullable
    private final String previewLink;

    @b("title")
    @NotNull
    private final String title;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final BaseBoolInt video;

    public AdsAdLayout(int i, int i10, @NotNull AdsAdCostType costType, @NotNull String description, @NotNull String id2, @NotNull String imageSrc, @NotNull String linkUrl, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(costType, "costType");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.adFormat = i;
        this.campaignId = i10;
        this.costType = costType;
        this.description = description;
        this.f15110id = id2;
        this.imageSrc = imageSrc;
        this.linkUrl = linkUrl;
        this.title = title;
        this.imageSrc2x = str;
        this.linkDomain = str2;
        this.previewLink = str3;
        this.video = baseBoolInt;
    }

    public static /* synthetic */ AdsAdLayout copy$default(AdsAdLayout adsAdLayout, int i, int i10, AdsAdCostType adsAdCostType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BaseBoolInt baseBoolInt, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = adsAdLayout.adFormat;
        }
        if ((i11 & 2) != 0) {
            i10 = adsAdLayout.campaignId;
        }
        if ((i11 & 4) != 0) {
            adsAdCostType = adsAdLayout.costType;
        }
        if ((i11 & 8) != 0) {
            str = adsAdLayout.description;
        }
        if ((i11 & 16) != 0) {
            str2 = adsAdLayout.f15110id;
        }
        if ((i11 & 32) != 0) {
            str3 = adsAdLayout.imageSrc;
        }
        if ((i11 & 64) != 0) {
            str4 = adsAdLayout.linkUrl;
        }
        if ((i11 & 128) != 0) {
            str5 = adsAdLayout.title;
        }
        if ((i11 & 256) != 0) {
            str6 = adsAdLayout.imageSrc2x;
        }
        if ((i11 & 512) != 0) {
            str7 = adsAdLayout.linkDomain;
        }
        if ((i11 & 1024) != 0) {
            str8 = adsAdLayout.previewLink;
        }
        if ((i11 & 2048) != 0) {
            baseBoolInt = adsAdLayout.video;
        }
        String str9 = str8;
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str2;
        String str15 = str3;
        return adsAdLayout.copy(i, i10, adsAdCostType, str, str14, str15, str12, str13, str10, str11, str9, baseBoolInt2);
    }

    public final int component1() {
        return this.adFormat;
    }

    @Nullable
    public final String component10() {
        return this.linkDomain;
    }

    @Nullable
    public final String component11() {
        return this.previewLink;
    }

    @Nullable
    public final BaseBoolInt component12() {
        return this.video;
    }

    public final int component2() {
        return this.campaignId;
    }

    @NotNull
    public final AdsAdCostType component3() {
        return this.costType;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final String component5() {
        return this.f15110id;
    }

    @NotNull
    public final String component6() {
        return this.imageSrc;
    }

    @NotNull
    public final String component7() {
        return this.linkUrl;
    }

    @NotNull
    public final String component8() {
        return this.title;
    }

    @Nullable
    public final String component9() {
        return this.imageSrc2x;
    }

    @NotNull
    public final AdsAdLayout copy(int i, int i10, @NotNull AdsAdCostType costType, @NotNull String description, @NotNull String id2, @NotNull String imageSrc, @NotNull String linkUrl, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(costType, "costType");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AdsAdLayout(i, i10, costType, description, id2, imageSrc, linkUrl, title, str, str2, str3, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAdLayout)) {
            return false;
        }
        AdsAdLayout adsAdLayout = (AdsAdLayout) obj;
        return this.adFormat == adsAdLayout.adFormat && this.campaignId == adsAdLayout.campaignId && this.costType == adsAdLayout.costType && Intrinsics.a(this.description, adsAdLayout.description) && Intrinsics.a(this.f15110id, adsAdLayout.f15110id) && Intrinsics.a(this.imageSrc, adsAdLayout.imageSrc) && Intrinsics.a(this.linkUrl, adsAdLayout.linkUrl) && Intrinsics.a(this.title, adsAdLayout.title) && Intrinsics.a(this.imageSrc2x, adsAdLayout.imageSrc2x) && Intrinsics.a(this.linkDomain, adsAdLayout.linkDomain) && Intrinsics.a(this.previewLink, adsAdLayout.previewLink) && this.video == adsAdLayout.video;
    }

    public final int getAdFormat() {
        return this.adFormat;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final AdsAdCostType getCostType() {
        return this.costType;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.f15110id;
    }

    @NotNull
    public final String getImageSrc() {
        return this.imageSrc;
    }

    @Nullable
    public final String getImageSrc2x() {
        return this.imageSrc2x;
    }

    @Nullable
    public final String getLinkDomain() {
        return this.linkDomain;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getPreviewLink() {
        return this.previewLink;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final BaseBoolInt getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iE = a.e(a.e(a.e(a.e(a.e((this.costType.hashCode() + u.g(this.campaignId, Integer.hashCode(this.adFormat) * 31, 31)) * 31, 31, this.description), 31, this.f15110id), 31, this.imageSrc), 31, this.linkUrl), 31, this.title);
        String str = this.imageSrc2x;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkDomain;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previewLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.video;
        return iHashCode3 + (baseBoolInt != null ? baseBoolInt.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.adFormat;
        int i10 = this.campaignId;
        AdsAdCostType adsAdCostType = this.costType;
        String str = this.description;
        String str2 = this.f15110id;
        String str3 = this.imageSrc;
        String str4 = this.linkUrl;
        String str5 = this.title;
        String str6 = this.imageSrc2x;
        String str7 = this.linkDomain;
        String str8 = this.previewLink;
        BaseBoolInt baseBoolInt = this.video;
        StringBuilder sbI = z.i("AdsAdLayout(adFormat=", i, ", campaignId=", i10, ", costType=");
        sbI.append(adsAdCostType);
        sbI.append(", description=");
        sbI.append(str);
        sbI.append(", id=");
        o.t(sbI, str2, ", imageSrc=", str3, ", linkUrl=");
        o.t(sbI, str4, ", title=", str5, ", imageSrc2x=");
        o.t(sbI, str6, ", linkDomain=", str7, ", previewLink=");
        sbI.append(str8);
        sbI.append(", video=");
        sbI.append(baseBoolInt);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ AdsAdLayout(int i, int i10, AdsAdCostType adsAdCostType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BaseBoolInt baseBoolInt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, adsAdCostType, str, str2, str3, str4, str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : baseBoolInt);
    }
}
