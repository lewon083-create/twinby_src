package com.vk.sdk.api.account.dto;

import gf.a;
import io.sentry.protocol.App;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AccountOffer {

    @b("currency_amount")
    @Nullable
    private final Float currencyAmount;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15107id;

    @b("img")
    @Nullable
    private final String img;

    @b("instruction")
    @Nullable
    private final String instruction;

    @b("instruction_html")
    @Nullable
    private final String instructionHtml;

    @b("link_id")
    @Nullable
    private final Integer linkId;

    @b("link_type")
    @Nullable
    private final LinkType linkType;

    @b("price")
    @Nullable
    private final Integer price;

    @b("short_description")
    @Nullable
    private final String shortDescription;

    @b("tag")
    @Nullable
    private final String tag;

    @b("title")
    @Nullable
    private final String title;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum LinkType {
        PROFILE("profile"),
        GROUP("group"),
        APP(App.TYPE);


        @NotNull
        private final String value;

        LinkType(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public AccountOffer() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ AccountOffer copy$default(AccountOffer accountOffer, String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Float f10, Integer num3, LinkType linkType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountOffer.description;
        }
        if ((i & 2) != 0) {
            num = accountOffer.f15107id;
        }
        if ((i & 4) != 0) {
            str2 = accountOffer.img;
        }
        if ((i & 8) != 0) {
            str3 = accountOffer.instruction;
        }
        if ((i & 16) != 0) {
            str4 = accountOffer.instructionHtml;
        }
        if ((i & 32) != 0) {
            num2 = accountOffer.price;
        }
        if ((i & 64) != 0) {
            str5 = accountOffer.shortDescription;
        }
        if ((i & 128) != 0) {
            str6 = accountOffer.tag;
        }
        if ((i & 256) != 0) {
            str7 = accountOffer.title;
        }
        if ((i & 512) != 0) {
            f10 = accountOffer.currencyAmount;
        }
        if ((i & 1024) != 0) {
            num3 = accountOffer.linkId;
        }
        if ((i & 2048) != 0) {
            linkType = accountOffer.linkType;
        }
        Integer num4 = num3;
        LinkType linkType2 = linkType;
        String str8 = str7;
        Float f11 = f10;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        Integer num5 = num2;
        return accountOffer.copy(str, num, str2, str3, str11, num5, str9, str10, str8, f11, num4, linkType2);
    }

    @Nullable
    public final String component1() {
        return this.description;
    }

    @Nullable
    public final Float component10() {
        return this.currencyAmount;
    }

    @Nullable
    public final Integer component11() {
        return this.linkId;
    }

    @Nullable
    public final LinkType component12() {
        return this.linkType;
    }

    @Nullable
    public final Integer component2() {
        return this.f15107id;
    }

    @Nullable
    public final String component3() {
        return this.img;
    }

    @Nullable
    public final String component4() {
        return this.instruction;
    }

    @Nullable
    public final String component5() {
        return this.instructionHtml;
    }

    @Nullable
    public final Integer component6() {
        return this.price;
    }

    @Nullable
    public final String component7() {
        return this.shortDescription;
    }

    @Nullable
    public final String component8() {
        return this.tag;
    }

    @Nullable
    public final String component9() {
        return this.title;
    }

    @NotNull
    public final AccountOffer copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Float f10, @Nullable Integer num3, @Nullable LinkType linkType) {
        return new AccountOffer(str, num, str2, str3, str4, num2, str5, str6, str7, f10, num3, linkType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountOffer)) {
            return false;
        }
        AccountOffer accountOffer = (AccountOffer) obj;
        return Intrinsics.a(this.description, accountOffer.description) && Intrinsics.a(this.f15107id, accountOffer.f15107id) && Intrinsics.a(this.img, accountOffer.img) && Intrinsics.a(this.instruction, accountOffer.instruction) && Intrinsics.a(this.instructionHtml, accountOffer.instructionHtml) && Intrinsics.a(this.price, accountOffer.price) && Intrinsics.a(this.shortDescription, accountOffer.shortDescription) && Intrinsics.a(this.tag, accountOffer.tag) && Intrinsics.a(this.title, accountOffer.title) && Intrinsics.a(this.currencyAmount, accountOffer.currencyAmount) && Intrinsics.a(this.linkId, accountOffer.linkId) && this.linkType == accountOffer.linkType;
    }

    @Nullable
    public final Float getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getId() {
        return this.f15107id;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final String getInstruction() {
        return this.instruction;
    }

    @Nullable
    public final String getInstructionHtml() {
        return this.instructionHtml;
    }

    @Nullable
    public final Integer getLinkId() {
        return this.linkId;
    }

    @Nullable
    public final LinkType getLinkType() {
        return this.linkType;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    public final String getShortDescription() {
        return this.shortDescription;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f15107id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.img;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.instruction;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.instructionHtml;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.price;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.shortDescription;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tag;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f10 = this.currencyAmount;
        int iHashCode10 = (iHashCode9 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Integer num3 = this.linkId;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        LinkType linkType = this.linkType;
        return iHashCode11 + (linkType != null ? linkType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.description;
        Integer num = this.f15107id;
        String str2 = this.img;
        String str3 = this.instruction;
        String str4 = this.instructionHtml;
        Integer num2 = this.price;
        String str5 = this.shortDescription;
        String str6 = this.tag;
        String str7 = this.title;
        Float f10 = this.currencyAmount;
        Integer num3 = this.linkId;
        LinkType linkType = this.linkType;
        StringBuilder sb2 = new StringBuilder("AccountOffer(description=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(num);
        sb2.append(", img=");
        o.t(sb2, str2, ", instruction=", str3, ", instructionHtml=");
        a.r(num2, str4, ", price=", ", shortDescription=", sb2);
        o.t(sb2, str5, ", tag=", str6, ", title=");
        sb2.append(str7);
        sb2.append(", currencyAmount=");
        sb2.append(f10);
        sb2.append(", linkId=");
        sb2.append(num3);
        sb2.append(", linkType=");
        sb2.append(linkType);
        sb2.append(")");
        return sb2.toString();
    }

    public AccountOffer(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Float f10, @Nullable Integer num3, @Nullable LinkType linkType) {
        this.description = str;
        this.f15107id = num;
        this.img = str2;
        this.instruction = str3;
        this.instructionHtml = str4;
        this.price = num2;
        this.shortDescription = str5;
        this.tag = str6;
        this.title = str7;
        this.currencyAmount = f10;
        this.linkId = num3;
        this.linkType = linkType;
    }

    public /* synthetic */ AccountOffer(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Float f10, Integer num3, LinkType linkType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : f10, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : linkType);
    }
}
