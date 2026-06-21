package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import pe.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class BillingInfo {

    @NonNull
    public final String productId;
    public final long purchaseTime;

    @NonNull
    public final String purchaseToken;
    public long sendTime;

    @NonNull
    public final ProductType type;

    public BillingInfo(@NonNull ProductType productType, @NonNull String str, @NonNull String str2, long j10, long j11) {
        this.type = productType;
        this.productId = str;
        this.purchaseToken = str2;
        this.purchaseTime = j10;
        this.sendTime = j11;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillingInfo{type=");
        sb2.append(this.type);
        sb2.append("productId='");
        sb2.append(this.productId);
        sb2.append("'purchaseToken='");
        sb2.append(this.purchaseToken);
        sb2.append("'purchaseTime=");
        sb2.append(this.purchaseTime);
        sb2.append("sendTime=");
        return a.h(sb2, this.sendTime, "}");
    }
}
