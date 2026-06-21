package com.vk.sdk.api.prettyCards.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseImage;
import com.vk.sdk.api.base.dto.BaseLinkButton;
import gf.a;
import io.sentry.protocol.DebugMeta;
import java.util.List;
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
public final class PrettyCardsPrettyCard {

    @b("button")
    @Nullable
    private final BaseLinkButton button;

    @b("button_text")
    @Nullable
    private final String buttonText;

    @b("card_id")
    @NotNull
    private final String cardId;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<BaseImage> images;

    @b("link_url")
    @NotNull
    private final String linkUrl;

    @b("photo")
    @NotNull
    private final String photo;

    @b("price")
    @Nullable
    private final String price;

    @b("price_old")
    @Nullable
    private final String priceOld;

    @b("title")
    @NotNull
    private final String title;

    public PrettyCardsPrettyCard(@NotNull String cardId, @NotNull String linkUrl, @NotNull String photo, @NotNull String title, @Nullable BaseLinkButton baseLinkButton, @Nullable String str, @Nullable List<BaseImage> list, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(title, "title");
        this.cardId = cardId;
        this.linkUrl = linkUrl;
        this.photo = photo;
        this.title = title;
        this.button = baseLinkButton;
        this.buttonText = str;
        this.images = list;
        this.price = str2;
        this.priceOld = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrettyCardsPrettyCard copy$default(PrettyCardsPrettyCard prettyCardsPrettyCard, String str, String str2, String str3, String str4, BaseLinkButton baseLinkButton, String str5, List list, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prettyCardsPrettyCard.cardId;
        }
        if ((i & 2) != 0) {
            str2 = prettyCardsPrettyCard.linkUrl;
        }
        if ((i & 4) != 0) {
            str3 = prettyCardsPrettyCard.photo;
        }
        if ((i & 8) != 0) {
            str4 = prettyCardsPrettyCard.title;
        }
        if ((i & 16) != 0) {
            baseLinkButton = prettyCardsPrettyCard.button;
        }
        if ((i & 32) != 0) {
            str5 = prettyCardsPrettyCard.buttonText;
        }
        if ((i & 64) != 0) {
            list = prettyCardsPrettyCard.images;
        }
        if ((i & 128) != 0) {
            str6 = prettyCardsPrettyCard.price;
        }
        if ((i & 256) != 0) {
            str7 = prettyCardsPrettyCard.priceOld;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        List list2 = list;
        BaseLinkButton baseLinkButton2 = baseLinkButton;
        String str11 = str3;
        return prettyCardsPrettyCard.copy(str, str2, str11, str4, baseLinkButton2, str10, list2, str8, str9);
    }

    @NotNull
    public final String component1() {
        return this.cardId;
    }

    @NotNull
    public final String component2() {
        return this.linkUrl;
    }

    @NotNull
    public final String component3() {
        return this.photo;
    }

    @NotNull
    public final String component4() {
        return this.title;
    }

    @Nullable
    public final BaseLinkButton component5() {
        return this.button;
    }

    @Nullable
    public final String component6() {
        return this.buttonText;
    }

    @Nullable
    public final List<BaseImage> component7() {
        return this.images;
    }

    @Nullable
    public final String component8() {
        return this.price;
    }

    @Nullable
    public final String component9() {
        return this.priceOld;
    }

    @NotNull
    public final PrettyCardsPrettyCard copy(@NotNull String cardId, @NotNull String linkUrl, @NotNull String photo, @NotNull String title, @Nullable BaseLinkButton baseLinkButton, @Nullable String str, @Nullable List<BaseImage> list, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PrettyCardsPrettyCard(cardId, linkUrl, photo, title, baseLinkButton, str, list, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsPrettyCard)) {
            return false;
        }
        PrettyCardsPrettyCard prettyCardsPrettyCard = (PrettyCardsPrettyCard) obj;
        return Intrinsics.a(this.cardId, prettyCardsPrettyCard.cardId) && Intrinsics.a(this.linkUrl, prettyCardsPrettyCard.linkUrl) && Intrinsics.a(this.photo, prettyCardsPrettyCard.photo) && Intrinsics.a(this.title, prettyCardsPrettyCard.title) && Intrinsics.a(this.button, prettyCardsPrettyCard.button) && Intrinsics.a(this.buttonText, prettyCardsPrettyCard.buttonText) && Intrinsics.a(this.images, prettyCardsPrettyCard.images) && Intrinsics.a(this.price, prettyCardsPrettyCard.price) && Intrinsics.a(this.priceOld, prettyCardsPrettyCard.priceOld);
    }

    @Nullable
    public final BaseLinkButton getButton() {
        return this.button;
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    public final List<BaseImage> getImages() {
        return this.images;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public final String getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPriceOld() {
        return this.priceOld;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = a.e(a.e(a.e(this.cardId.hashCode() * 31, 31, this.linkUrl), 31, this.photo), 31, this.title);
        BaseLinkButton baseLinkButton = this.button;
        int iHashCode = (iE + (baseLinkButton == null ? 0 : baseLinkButton.hashCode())) * 31;
        String str = this.buttonText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImage> list = this.images;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.price;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceOld;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cardId;
        String str2 = this.linkUrl;
        String str3 = this.photo;
        String str4 = this.title;
        BaseLinkButton baseLinkButton = this.button;
        String str5 = this.buttonText;
        List<BaseImage> list = this.images;
        String str6 = this.price;
        String str7 = this.priceOld;
        StringBuilder sbJ = z.j("PrettyCardsPrettyCard(cardId=", str, ", linkUrl=", str2, ", photo=");
        o.t(sbJ, str3, ", title=", str4, ", button=");
        sbJ.append(baseLinkButton);
        sbJ.append(", buttonText=");
        sbJ.append(str5);
        sbJ.append(", images=");
        sbJ.append(list);
        sbJ.append(", price=");
        sbJ.append(str6);
        sbJ.append(", priceOld=");
        return u.o(sbJ, str7, ")");
    }

    public /* synthetic */ PrettyCardsPrettyCard(String str, String str2, String str3, String str4, BaseLinkButton baseLinkButton, String str5, List list, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : baseLinkButton, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
