package com.vk.sdk.api.gifts.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class GiftsGift {

    @b("date")
    @Nullable
    private final Integer date;

    @b("from_id")
    @Nullable
    private final Integer fromId;

    @b("gift")
    @Nullable
    private final GiftsLayout gift;

    @b("gift_hash")
    @Nullable
    private final String giftHash;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15170id;

    @b("message")
    @Nullable
    private final String message;

    @b("privacy")
    @Nullable
    private final GiftsGiftPrivacy privacy;

    public GiftsGift() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ GiftsGift copy$default(GiftsGift giftsGift, Integer num, Integer num2, GiftsLayout giftsLayout, String str, Integer num3, String str2, GiftsGiftPrivacy giftsGiftPrivacy, int i, Object obj) {
        if ((i & 1) != 0) {
            num = giftsGift.date;
        }
        if ((i & 2) != 0) {
            num2 = giftsGift.fromId;
        }
        if ((i & 4) != 0) {
            giftsLayout = giftsGift.gift;
        }
        if ((i & 8) != 0) {
            str = giftsGift.giftHash;
        }
        if ((i & 16) != 0) {
            num3 = giftsGift.f15170id;
        }
        if ((i & 32) != 0) {
            str2 = giftsGift.message;
        }
        if ((i & 64) != 0) {
            giftsGiftPrivacy = giftsGift.privacy;
        }
        String str3 = str2;
        GiftsGiftPrivacy giftsGiftPrivacy2 = giftsGiftPrivacy;
        Integer num4 = num3;
        GiftsLayout giftsLayout2 = giftsLayout;
        return giftsGift.copy(num, num2, giftsLayout2, str, num4, str3, giftsGiftPrivacy2);
    }

    @Nullable
    public final Integer component1() {
        return this.date;
    }

    @Nullable
    public final Integer component2() {
        return this.fromId;
    }

    @Nullable
    public final GiftsLayout component3() {
        return this.gift;
    }

    @Nullable
    public final String component4() {
        return this.giftHash;
    }

    @Nullable
    public final Integer component5() {
        return this.f15170id;
    }

    @Nullable
    public final String component6() {
        return this.message;
    }

    @Nullable
    public final GiftsGiftPrivacy component7() {
        return this.privacy;
    }

    @NotNull
    public final GiftsGift copy(@Nullable Integer num, @Nullable Integer num2, @Nullable GiftsLayout giftsLayout, @Nullable String str, @Nullable Integer num3, @Nullable String str2, @Nullable GiftsGiftPrivacy giftsGiftPrivacy) {
        return new GiftsGift(num, num2, giftsLayout, str, num3, str2, giftsGiftPrivacy);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGift)) {
            return false;
        }
        GiftsGift giftsGift = (GiftsGift) obj;
        return Intrinsics.a(this.date, giftsGift.date) && Intrinsics.a(this.fromId, giftsGift.fromId) && Intrinsics.a(this.gift, giftsGift.gift) && Intrinsics.a(this.giftHash, giftsGift.giftHash) && Intrinsics.a(this.f15170id, giftsGift.f15170id) && Intrinsics.a(this.message, giftsGift.message) && this.privacy == giftsGift.privacy;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getFromId() {
        return this.fromId;
    }

    @Nullable
    public final GiftsLayout getGift() {
        return this.gift;
    }

    @Nullable
    public final String getGiftHash() {
        return this.giftHash;
    }

    @Nullable
    public final Integer getId() {
        return this.f15170id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final GiftsGiftPrivacy getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        Integer num = this.date;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fromId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        GiftsLayout giftsLayout = this.gift;
        int iHashCode3 = (iHashCode2 + (giftsLayout == null ? 0 : giftsLayout.hashCode())) * 31;
        String str = this.giftHash;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f15170id;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GiftsGiftPrivacy giftsGiftPrivacy = this.privacy;
        return iHashCode6 + (giftsGiftPrivacy != null ? giftsGiftPrivacy.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.date;
        Integer num2 = this.fromId;
        GiftsLayout giftsLayout = this.gift;
        String str = this.giftHash;
        Integer num3 = this.f15170id;
        String str2 = this.message;
        GiftsGiftPrivacy giftsGiftPrivacy = this.privacy;
        StringBuilder sbO = om1.o("GiftsGift(date=", ", fromId=", num, num2, ", gift=");
        sbO.append(giftsLayout);
        sbO.append(", giftHash=");
        sbO.append(str);
        sbO.append(", id=");
        a.r(num3, ", message=", str2, ", privacy=", sbO);
        sbO.append(giftsGiftPrivacy);
        sbO.append(")");
        return sbO.toString();
    }

    public GiftsGift(@Nullable Integer num, @Nullable Integer num2, @Nullable GiftsLayout giftsLayout, @Nullable String str, @Nullable Integer num3, @Nullable String str2, @Nullable GiftsGiftPrivacy giftsGiftPrivacy) {
        this.date = num;
        this.fromId = num2;
        this.gift = giftsLayout;
        this.giftHash = str;
        this.f15170id = num3;
        this.message = str2;
        this.privacy = giftsGiftPrivacy;
    }

    public /* synthetic */ GiftsGift(Integer num, Integer num2, GiftsLayout giftsLayout, String str, Integer num3, String str2, GiftsGiftPrivacy giftsGiftPrivacy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : giftsLayout, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : giftsGiftPrivacy);
    }
}
