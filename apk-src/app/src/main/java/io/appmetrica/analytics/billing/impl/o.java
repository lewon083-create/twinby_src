package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String currencyCode;
        z zVar = new z();
        zVar.f21574a = productInfo.quantity;
        zVar.f21579f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        Charset charset = Charsets.UTF_8;
        zVar.f21575b = currencyCode.getBytes(charset);
        zVar.f21576c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f21541a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f21542b = productInfo.signature.getBytes(charset);
        zVar.f21578e = uVar;
        zVar.f21580g = true;
        zVar.f21581h = 1;
        int i = n.f21528a[productInfo.type.ordinal()];
        zVar.i = (i == 1 || i != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f21563a = productInfo.purchaseToken.getBytes(charset);
        yVar.f21564b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f21582j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f21557a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f21554a = period.number;
                int i10 = n.f21529b[period.timeUnit.ordinal()];
                wVar.f21555b = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f21558b = wVar;
            }
            v vVar = new v();
            vVar.f21544a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f21554a = period2.number;
                int i11 = n.f21529b[period2.timeUnit.ordinal()];
                wVar2.f21555b = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f21545b = wVar2;
            }
            vVar.f21546c = productInfo.introductoryPriceCycles;
            xVar.f21559c = vVar;
            zVar.f21583k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
