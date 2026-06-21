package com.vk.sdk.api.account.dto;

import com.appsflyer.AdRevenueScheme;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class AccountInfo {

    /* JADX INFO: renamed from: 2faRequired, reason: not valid java name */
    @b("2fa_required")
    @Nullable
    private final BaseBoolInt f02faRequired;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final String country;

    @b("https_required")
    @Nullable
    private final BaseBoolInt httpsRequired;

    @b("intro")
    @Nullable
    private final BaseBoolInt intro;

    @b(VKApiCodes.PARAM_LANG)
    @Nullable
    private final Integer lang;

    @b("link_redirects")
    @Nullable
    private final Object linkRedirects;

    @b("mini_apps_ads_slot_id")
    @Nullable
    private final Integer miniAppsAdsSlotId;

    @b("no_wall_replies")
    @Nullable
    private final BaseBoolInt noWallReplies;

    @b("own_posts_default")
    @Nullable
    private final BaseBoolInt ownPostsDefault;

    @b("qr_promotion")
    @Nullable
    private final Integer qrPromotion;

    @b("show_vk_apps_intro")
    @Nullable
    private final Boolean showVkAppsIntro;

    @b("subscriptions")
    @Nullable
    private final List<Integer> subscriptions;

    @b("wishlists_ae_promo_banner_show")
    @Nullable
    private final BaseBoolInt wishlistsAePromoBannerShow;

    public AccountInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, String str, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, Boolean bool, Integer num, Integer num2, Object obj, Integer num3, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            baseBoolInt = accountInfo.wishlistsAePromoBannerShow;
        }
        return accountInfo.copy(baseBoolInt, (i & 2) != 0 ? accountInfo.f02faRequired : baseBoolInt2, (i & 4) != 0 ? accountInfo.country : str, (i & 8) != 0 ? accountInfo.httpsRequired : baseBoolInt3, (i & 16) != 0 ? accountInfo.intro : baseBoolInt4, (i & 32) != 0 ? accountInfo.showVkAppsIntro : bool, (i & 64) != 0 ? accountInfo.miniAppsAdsSlotId : num, (i & 128) != 0 ? accountInfo.qrPromotion : num2, (i & 256) != 0 ? accountInfo.linkRedirects : obj, (i & 512) != 0 ? accountInfo.lang : num3, (i & 1024) != 0 ? accountInfo.noWallReplies : baseBoolInt5, (i & 2048) != 0 ? accountInfo.ownPostsDefault : baseBoolInt6, (i & 4096) != 0 ? accountInfo.subscriptions : list);
    }

    @Nullable
    public final BaseBoolInt component1() {
        return this.wishlistsAePromoBannerShow;
    }

    @Nullable
    public final Integer component10() {
        return this.lang;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.noWallReplies;
    }

    @Nullable
    public final BaseBoolInt component12() {
        return this.ownPostsDefault;
    }

    @Nullable
    public final List<Integer> component13() {
        return this.subscriptions;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.f02faRequired;
    }

    @Nullable
    public final String component3() {
        return this.country;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.httpsRequired;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.intro;
    }

    @Nullable
    public final Boolean component6() {
        return this.showVkAppsIntro;
    }

    @Nullable
    public final Integer component7() {
        return this.miniAppsAdsSlotId;
    }

    @Nullable
    public final Integer component8() {
        return this.qrPromotion;
    }

    @Nullable
    public final Object component9() {
        return this.linkRedirects;
    }

    @NotNull
    public final AccountInfo copy(@Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Object obj, @Nullable Integer num3, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable List<Integer> list) {
        return new AccountInfo(baseBoolInt, baseBoolInt2, str, baseBoolInt3, baseBoolInt4, bool, num, num2, obj, num3, baseBoolInt5, baseBoolInt6, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return this.wishlistsAePromoBannerShow == accountInfo.wishlistsAePromoBannerShow && this.f02faRequired == accountInfo.f02faRequired && Intrinsics.a(this.country, accountInfo.country) && this.httpsRequired == accountInfo.httpsRequired && this.intro == accountInfo.intro && Intrinsics.a(this.showVkAppsIntro, accountInfo.showVkAppsIntro) && Intrinsics.a(this.miniAppsAdsSlotId, accountInfo.miniAppsAdsSlotId) && Intrinsics.a(this.qrPromotion, accountInfo.qrPromotion) && Intrinsics.a(this.linkRedirects, accountInfo.linkRedirects) && Intrinsics.a(this.lang, accountInfo.lang) && this.noWallReplies == accountInfo.noWallReplies && this.ownPostsDefault == accountInfo.ownPostsDefault && Intrinsics.a(this.subscriptions, accountInfo.subscriptions);
    }

    @Nullable
    public final BaseBoolInt get2faRequired() {
        return this.f02faRequired;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final BaseBoolInt getHttpsRequired() {
        return this.httpsRequired;
    }

    @Nullable
    public final BaseBoolInt getIntro() {
        return this.intro;
    }

    @Nullable
    public final Integer getLang() {
        return this.lang;
    }

    @Nullable
    public final Object getLinkRedirects() {
        return this.linkRedirects;
    }

    @Nullable
    public final Integer getMiniAppsAdsSlotId() {
        return this.miniAppsAdsSlotId;
    }

    @Nullable
    public final BaseBoolInt getNoWallReplies() {
        return this.noWallReplies;
    }

    @Nullable
    public final BaseBoolInt getOwnPostsDefault() {
        return this.ownPostsDefault;
    }

    @Nullable
    public final Integer getQrPromotion() {
        return this.qrPromotion;
    }

    @Nullable
    public final Boolean getShowVkAppsIntro() {
        return this.showVkAppsIntro;
    }

    @Nullable
    public final List<Integer> getSubscriptions() {
        return this.subscriptions;
    }

    @Nullable
    public final BaseBoolInt getWishlistsAePromoBannerShow() {
        return this.wishlistsAePromoBannerShow;
    }

    public int hashCode() {
        BaseBoolInt baseBoolInt = this.wishlistsAePromoBannerShow;
        int iHashCode = (baseBoolInt == null ? 0 : baseBoolInt.hashCode()) * 31;
        BaseBoolInt baseBoolInt2 = this.f02faRequired;
        int iHashCode2 = (iHashCode + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        String str = this.country;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.httpsRequired;
        int iHashCode4 = (iHashCode3 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.intro;
        int iHashCode5 = (iHashCode4 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        Boolean bool = this.showVkAppsIntro;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.miniAppsAdsSlotId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.qrPromotion;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.linkRedirects;
        int iHashCode9 = (iHashCode8 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num3 = this.lang;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.noWallReplies;
        int iHashCode11 = (iHashCode10 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
        BaseBoolInt baseBoolInt6 = this.ownPostsDefault;
        int iHashCode12 = (iHashCode11 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
        List<Integer> list = this.subscriptions;
        return iHashCode12 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BaseBoolInt baseBoolInt = this.wishlistsAePromoBannerShow;
        BaseBoolInt baseBoolInt2 = this.f02faRequired;
        String str = this.country;
        BaseBoolInt baseBoolInt3 = this.httpsRequired;
        BaseBoolInt baseBoolInt4 = this.intro;
        Boolean bool = this.showVkAppsIntro;
        Integer num = this.miniAppsAdsSlotId;
        Integer num2 = this.qrPromotion;
        Object obj = this.linkRedirects;
        Integer num3 = this.lang;
        BaseBoolInt baseBoolInt5 = this.noWallReplies;
        BaseBoolInt baseBoolInt6 = this.ownPostsDefault;
        List<Integer> list = this.subscriptions;
        StringBuilder sb2 = new StringBuilder("AccountInfo(wishlistsAePromoBannerShow=");
        sb2.append(baseBoolInt);
        sb2.append(", 2faRequired=");
        sb2.append(baseBoolInt2);
        sb2.append(", country=");
        sb2.append(str);
        sb2.append(", httpsRequired=");
        sb2.append(baseBoolInt3);
        sb2.append(", intro=");
        sb2.append(baseBoolInt4);
        sb2.append(", showVkAppsIntro=");
        sb2.append(bool);
        sb2.append(", miniAppsAdsSlotId=");
        a.t(sb2, num, ", qrPromotion=", num2, ", linkRedirects=");
        sb2.append(obj);
        sb2.append(", lang=");
        sb2.append(num3);
        sb2.append(", noWallReplies=");
        a.s(sb2, baseBoolInt5, ", ownPostsDefault=", baseBoolInt6, ", subscriptions=");
        return z.h(sb2, list, ")");
    }

    public AccountInfo(@Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Object obj, @Nullable Integer num3, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable List<Integer> list) {
        this.wishlistsAePromoBannerShow = baseBoolInt;
        this.f02faRequired = baseBoolInt2;
        this.country = str;
        this.httpsRequired = baseBoolInt3;
        this.intro = baseBoolInt4;
        this.showVkAppsIntro = bool;
        this.miniAppsAdsSlotId = num;
        this.qrPromotion = num2;
        this.linkRedirects = obj;
        this.lang = num3;
        this.noWallReplies = baseBoolInt5;
        this.ownPostsDefault = baseBoolInt6;
        this.subscriptions = list;
    }

    public /* synthetic */ AccountInfo(BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, String str, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, Boolean bool, Integer num, Integer num2, Object obj, Integer num3, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseBoolInt, (i & 2) != 0 ? null : baseBoolInt2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : baseBoolInt3, (i & 16) != 0 ? null : baseBoolInt4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : obj, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : baseBoolInt5, (i & 2048) != 0 ? null : baseBoolInt6, (i & 4096) != 0 ? null : list);
    }
}
