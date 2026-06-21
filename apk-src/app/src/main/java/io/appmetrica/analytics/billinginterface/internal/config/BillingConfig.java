package io.appmetrica.analytics.billinginterface.internal.config;

import androidx.annotation.NonNull;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int i, int i10) {
        this.sendFrequencySeconds = i;
        this.firstCollectingInappMaxAgeSeconds = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingConfig billingConfig = (BillingConfig) obj;
        return this.sendFrequencySeconds == billingConfig.sendFrequencySeconds && this.firstCollectingInappMaxAgeSeconds == billingConfig.firstCollectingInappMaxAgeSeconds;
    }

    public int hashCode() {
        return (this.sendFrequencySeconds * 31) + this.firstCollectingInappMaxAgeSeconds;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        sb2.append(this.sendFrequencySeconds);
        sb2.append(", firstCollectingInappMaxAgeSeconds=");
        return z.d(this.firstCollectingInappMaxAgeSeconds, "}", sb2);
    }
}
