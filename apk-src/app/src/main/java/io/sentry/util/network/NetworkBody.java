package io.sentry.util.network;

import a0.u;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkBody {

    @Nullable
    private final Object body;

    @Nullable
    private final List<NetworkBodyWarning> warnings;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum NetworkBodyWarning {
        JSON_TRUNCATED("JSON_TRUNCATED"),
        TEXT_TRUNCATED("TEXT_TRUNCATED"),
        INVALID_JSON("INVALID_JSON"),
        BODY_PARSE_ERROR("BODY_PARSE_ERROR");

        private final String value;

        NetworkBodyWarning(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public NetworkBody(@Nullable Object obj) {
        this(obj, null);
    }

    @Nullable
    public Object getBody() {
        return this.body;
    }

    @Nullable
    public List<NetworkBodyWarning> getWarnings() {
        return this.warnings;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkBody{body=");
        sb2.append(this.body);
        sb2.append(", warnings=");
        return u.p(sb2, this.warnings, '}');
    }

    public NetworkBody(@Nullable Object obj, @Nullable List<NetworkBodyWarning> list) {
        this.body = obj;
        this.warnings = list;
    }
}
