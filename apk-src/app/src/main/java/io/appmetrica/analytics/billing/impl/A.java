package io.appmetrica.analytics.billing.impl;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21500b;

    public A(int i, int i10) {
        this.f21499a = i;
        this.f21500b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceSideBillingConfig(sendFrequencySeconds=");
        sb2.append(this.f21499a);
        sb2.append(", firstCollectingInappMaxAgeSeconds=");
        return om1.l(sb2, this.f21500b, ')');
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
