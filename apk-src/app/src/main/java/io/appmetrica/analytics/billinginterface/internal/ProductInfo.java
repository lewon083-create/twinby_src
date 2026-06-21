package io.appmetrica.analytics.billinginterface.internal;

import a0.u;
import androidx.annotation.NonNull;
import gf.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    public final Period introductoryPricePeriod;

    @NonNull
    public final String priceCurrency;
    public final long priceMicros;

    @NonNull
    public final String purchaseOriginalJson;
    public final long purchaseTime;

    @NonNull
    public final String purchaseToken;
    public final int quantity;

    @NonNull
    public final String signature;

    @NonNull
    public final String sku;
    public final Period subscriptionPeriod;

    @NonNull
    public final ProductType type;

    public ProductInfo(@NonNull ProductType productType, @NonNull String str, int i, long j10, @NonNull String str2, long j11, Period period, int i10, Period period2, @NonNull String str3, @NonNull String str4, long j12, boolean z5, @NonNull String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i;
        this.priceMicros = j10;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j11;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i10;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j12;
        this.autoRenewing = z5;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int iE = (a.e(this.type.hashCode() * 31, 31, this.sku) + this.quantity) * 31;
        long j10 = this.priceMicros;
        int iE2 = a.e((iE + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.priceCurrency);
        long j11 = this.introductoryPriceMicros;
        int i = (iE2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int iHashCode = (((i + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        int iE3 = a.e(a.e((iHashCode + (period2 != null ? period2.hashCode() : 0)) * 31, 31, this.signature), 31, this.purchaseToken);
        long j12 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((iE3 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProductInfo{type=");
        sb2.append(this.type);
        sb2.append(", sku='");
        sb2.append(this.sku);
        sb2.append("', quantity=");
        sb2.append(this.quantity);
        sb2.append(", priceMicros=");
        sb2.append(this.priceMicros);
        sb2.append(", priceCurrency='");
        sb2.append(this.priceCurrency);
        sb2.append("', introductoryPriceMicros=");
        sb2.append(this.introductoryPriceMicros);
        sb2.append(", introductoryPricePeriod=");
        sb2.append(this.introductoryPricePeriod);
        sb2.append(", introductoryPriceCycles=");
        sb2.append(this.introductoryPriceCycles);
        sb2.append(", subscriptionPeriod=");
        sb2.append(this.subscriptionPeriod);
        sb2.append(", signature='");
        sb2.append(this.signature);
        sb2.append("', purchaseToken='");
        sb2.append(this.purchaseToken);
        sb2.append("', purchaseTime=");
        sb2.append(this.purchaseTime);
        sb2.append(", autoRenewing=");
        sb2.append(this.autoRenewing);
        sb2.append(", purchaseOriginalJson='");
        return u.o(sb2, this.purchaseOriginalJson, "'}");
    }
}
