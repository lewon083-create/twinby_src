package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.ko;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;

    @NonNull
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BigDecimal f21388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Currency f21389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AdType f21390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f21391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f21392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f21393f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f21394g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f21395h;
        private String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map f21396j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f21388a, this.f21389b, this.f21390c, this.f21391d, this.f21392e, this.f21393f, this.f21394g, this.f21395h, this.i, this.f21396j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f21391d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f21394g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f21395h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f21390c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f21392e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f21393f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f21396j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f21388a = bigDecimal;
            this.f21389b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(ko.a(j10), currency, 0);
    }

    public static Builder newBuilder(double d10, @NonNull Currency currency) {
        return new Builder(new BigDecimal(ko.a(d10)), currency, 0);
    }
}
