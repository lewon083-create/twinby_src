package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f25267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f25268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f25269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f25270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f25271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25272f;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f25273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f25274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f25275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f25276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f25277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f25278f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f25273a, this.f25274b, this.f25275c, this.f25276d, this.f25277e, this.f25278f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i) {
            this.f25273a = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z5) {
            this.f25277e = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i) {
            this.f25278f = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i) {
            this.f25274b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f25275c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z5) {
            this.f25276d = Boolean.valueOf(z5);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f25267a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f25271e;
    }

    public int getMaxResponseSize() {
        return this.f25272f;
    }

    public Integer getReadTimeout() {
        return this.f25268b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f25269c;
    }

    public Boolean getUseCaches() {
        return this.f25270d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkClient{connectTimeout=");
        sb2.append(this.f25267a);
        sb2.append(", readTimeout=");
        sb2.append(this.f25268b);
        sb2.append(", sslSocketFactory=");
        sb2.append(this.f25269c);
        sb2.append(", useCaches=");
        sb2.append(this.f25270d);
        sb2.append(", instanceFollowRedirects=");
        sb2.append(this.f25271e);
        sb2.append(", maxResponseSize=");
        return om1.l(sb2, this.f25272f, '}');
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f25267a = num;
        this.f25268b = num2;
        this.f25269c = sSLSocketFactory;
        this.f25270d = bool;
        this.f25271e = bool2;
        this.f25272f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
