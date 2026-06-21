package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0196h0;
import io.appmetrica.analytics.impl.C0377o5;
import io.appmetrica.analytics.impl.Dn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Dn f21452l = new Dn(new C0196h0());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0377o5 f21453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f21455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f21456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f21457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f21458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f21459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f21460h;
        private Integer i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final HashMap f21461j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final HashMap f21462k;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, Object obj) {
            this.f21462k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f21461j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z5) {
            this.f21457e = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i) {
            this.f21460h = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f21456d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f21458f = Integer.valueOf(this.f21453a.a(i));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i) {
            this.f21455c = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(String str) {
            this.f21459g = str;
            return this;
        }

        private Builder(String str) {
            this.f21461j = new HashMap();
            this.f21462k = new HashMap();
            f21452l.a(str);
            this.f21453a = new C0377o5(str);
            this.f21454b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f21454b;
        this.sessionTimeout = builder.f21455c;
        this.logs = builder.f21456d;
        this.dataSendingEnabled = builder.f21457e;
        this.maxReportsInDatabaseCount = builder.f21458f;
        this.userProfileID = builder.f21459g;
        this.dispatchPeriodSeconds = builder.f21460h;
        this.maxReportsCount = builder.i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f21461j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f21462k);
    }
}
