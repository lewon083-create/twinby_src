package com.vk.sdk.api.market.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class MarketPrice {

    @b("amount")
    @NotNull
    private final String amount;

    @b("currency")
    @NotNull
    private final MarketCurrency currency;

    @b("discount_rate")
    @Nullable
    private final Integer discountRate;

    @b("old_amount")
    @Nullable
    private final String oldAmount;

    @b("old_amount_text")
    @Nullable
    private final String oldAmountText;

    @b("text")
    @NotNull
    private final String text;

    public MarketPrice(@NotNull String amount, @NotNull MarketCurrency currency, @NotNull String text, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(text, "text");
        this.amount = amount;
        this.currency = currency;
        this.text = text;
        this.discountRate = num;
        this.oldAmount = str;
        this.oldAmountText = str2;
    }

    public static /* synthetic */ MarketPrice copy$default(MarketPrice marketPrice, String str, MarketCurrency marketCurrency, String str2, Integer num, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketPrice.amount;
        }
        if ((i & 2) != 0) {
            marketCurrency = marketPrice.currency;
        }
        if ((i & 4) != 0) {
            str2 = marketPrice.text;
        }
        if ((i & 8) != 0) {
            num = marketPrice.discountRate;
        }
        if ((i & 16) != 0) {
            str3 = marketPrice.oldAmount;
        }
        if ((i & 32) != 0) {
            str4 = marketPrice.oldAmountText;
        }
        String str5 = str3;
        String str6 = str4;
        return marketPrice.copy(str, marketCurrency, str2, num, str5, str6);
    }

    @NotNull
    public final String component1() {
        return this.amount;
    }

    @NotNull
    public final MarketCurrency component2() {
        return this.currency;
    }

    @NotNull
    public final String component3() {
        return this.text;
    }

    @Nullable
    public final Integer component4() {
        return this.discountRate;
    }

    @Nullable
    public final String component5() {
        return this.oldAmount;
    }

    @Nullable
    public final String component6() {
        return this.oldAmountText;
    }

    @NotNull
    public final MarketPrice copy(@NotNull String amount, @NotNull MarketCurrency currency, @NotNull String text, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(text, "text");
        return new MarketPrice(amount, currency, text, num, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPrice)) {
            return false;
        }
        MarketPrice marketPrice = (MarketPrice) obj;
        return Intrinsics.a(this.amount, marketPrice.amount) && Intrinsics.a(this.currency, marketPrice.currency) && Intrinsics.a(this.text, marketPrice.text) && Intrinsics.a(this.discountRate, marketPrice.discountRate) && Intrinsics.a(this.oldAmount, marketPrice.oldAmount) && Intrinsics.a(this.oldAmountText, marketPrice.oldAmountText);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final MarketCurrency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    @Nullable
    public final String getOldAmount() {
        return this.oldAmount;
    }

    @Nullable
    public final String getOldAmountText() {
        return this.oldAmountText;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE = a.e((this.currency.hashCode() + (this.amount.hashCode() * 31)) * 31, 31, this.text);
        Integer num = this.discountRate;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.oldAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oldAmountText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.amount;
        MarketCurrency marketCurrency = this.currency;
        String str2 = this.text;
        Integer num = this.discountRate;
        String str3 = this.oldAmount;
        String str4 = this.oldAmountText;
        StringBuilder sb2 = new StringBuilder("MarketPrice(amount=");
        sb2.append(str);
        sb2.append(", currency=");
        sb2.append(marketCurrency);
        sb2.append(", text=");
        a.r(num, str2, ", discountRate=", ", oldAmount=", sb2);
        return om1.n(sb2, str3, ", oldAmountText=", str4, ")");
    }

    public /* synthetic */ MarketPrice(String str, MarketCurrency marketCurrency, String str2, Integer num, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, marketCurrency, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
