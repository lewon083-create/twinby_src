package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21449b;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f21451b;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f21451b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f21450a = str;
            this.f21451b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f21449b;
    }

    public String getTrackingId() {
        return this.f21448a;
    }

    private PreloadInfo(Builder builder) {
        this.f21448a = builder.f21450a;
        this.f21449b = CollectionUtils.unmodifiableMapCopy(builder.f21451b);
    }
}
