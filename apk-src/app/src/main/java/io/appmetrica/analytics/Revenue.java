package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0055be;
import io.appmetrica.analytics.impl.Dn;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Revenue {

    @NonNull
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Dn f21463g = new Dn(new C0055be("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f21464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Currency f21465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Integer f21466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f21467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f21468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Receipt f21469f;

        public /* synthetic */ Builder(long j10, Currency currency, int i) {
            this(j10, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(String str) {
            this.f21468e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(String str) {
            this.f21467d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(Integer num) {
            this.f21466c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(Receipt receipt) {
            this.f21469f = receipt;
            return this;
        }

        private Builder(long j10, Currency currency) {
            f21463g.a(currency);
            this.f21464a = j10;
            this.f21465b = currency;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Receipt {
        public final String data;
        public final String signature;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f21470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f21471b;

            public /* synthetic */ Builder(int i) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(String str) {
                this.f21470a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(String str) {
                this.f21471b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f21470a;
            this.signature = builder.f21471b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(j10, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f21464a;
        this.currency = builder.f21465b;
        this.quantity = builder.f21466c;
        this.productID = builder.f21467d;
        this.payload = builder.f21468e;
        this.receipt = builder.f21469f;
    }
}
