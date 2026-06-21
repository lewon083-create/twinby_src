package com.vk.sdk.api.aliexpress.dto;

import com.vk.sdk.api.base.dto.BaseLinkButton;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
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
public final class AliexpressPromoCard {

    @b("action_button")
    @Nullable
    private final BaseLinkButton actionButton;

    @b("card_position")
    @Nullable
    private final Integer cardPosition;

    @b("icon")
    @Nullable
    private final PhotosPhoto icon;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    @b("title")
    @Nullable
    private final String title;

    public AliexpressPromoCard() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AliexpressPromoCard copy$default(AliexpressPromoCard aliexpressPromoCard, PhotosPhoto photosPhoto, String str, String str2, Integer num, BaseLinkButton baseLinkButton, int i, Object obj) {
        if ((i & 1) != 0) {
            photosPhoto = aliexpressPromoCard.icon;
        }
        if ((i & 2) != 0) {
            str = aliexpressPromoCard.title;
        }
        if ((i & 4) != 0) {
            str2 = aliexpressPromoCard.subtitle;
        }
        if ((i & 8) != 0) {
            num = aliexpressPromoCard.cardPosition;
        }
        if ((i & 16) != 0) {
            baseLinkButton = aliexpressPromoCard.actionButton;
        }
        BaseLinkButton baseLinkButton2 = baseLinkButton;
        String str3 = str2;
        return aliexpressPromoCard.copy(photosPhoto, str, str3, num, baseLinkButton2);
    }

    @Nullable
    public final PhotosPhoto component1() {
        return this.icon;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.subtitle;
    }

    @Nullable
    public final Integer component4() {
        return this.cardPosition;
    }

    @Nullable
    public final BaseLinkButton component5() {
        return this.actionButton;
    }

    @NotNull
    public final AliexpressPromoCard copy(@Nullable PhotosPhoto photosPhoto, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable BaseLinkButton baseLinkButton) {
        return new AliexpressPromoCard(photosPhoto, str, str2, num, baseLinkButton);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressPromoCard)) {
            return false;
        }
        AliexpressPromoCard aliexpressPromoCard = (AliexpressPromoCard) obj;
        return Intrinsics.a(this.icon, aliexpressPromoCard.icon) && Intrinsics.a(this.title, aliexpressPromoCard.title) && Intrinsics.a(this.subtitle, aliexpressPromoCard.subtitle) && Intrinsics.a(this.cardPosition, aliexpressPromoCard.cardPosition) && Intrinsics.a(this.actionButton, aliexpressPromoCard.actionButton);
    }

    @Nullable
    public final BaseLinkButton getActionButton() {
        return this.actionButton;
    }

    @Nullable
    public final Integer getCardPosition() {
        return this.cardPosition;
    }

    @Nullable
    public final PhotosPhoto getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PhotosPhoto photosPhoto = this.icon;
        int iHashCode = (photosPhoto == null ? 0 : photosPhoto.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cardPosition;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButton baseLinkButton = this.actionButton;
        return iHashCode4 + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        PhotosPhoto photosPhoto = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.cardPosition;
        BaseLinkButton baseLinkButton = this.actionButton;
        StringBuilder sb2 = new StringBuilder("AliexpressPromoCard(icon=");
        sb2.append(photosPhoto);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        a.r(num, str2, ", cardPosition=", ", actionButton=", sb2);
        sb2.append(baseLinkButton);
        sb2.append(")");
        return sb2.toString();
    }

    public AliexpressPromoCard(@Nullable PhotosPhoto photosPhoto, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable BaseLinkButton baseLinkButton) {
        this.icon = photosPhoto;
        this.title = str;
        this.subtitle = str2;
        this.cardPosition = num;
        this.actionButton = baseLinkButton;
    }

    public /* synthetic */ AliexpressPromoCard(PhotosPhoto photosPhoto, String str, String str2, Integer num, BaseLinkButton baseLinkButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : photosPhoto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : baseLinkButton);
    }
}
