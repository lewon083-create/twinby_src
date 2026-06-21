package io.sentry.util.network;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReplayNetworkRequestOrResponse {

    @Nullable
    private final NetworkBody body;

    @NotNull
    private final Map<String, String> headers;

    @Nullable
    private final Long size;

    public ReplayNetworkRequestOrResponse(@Nullable Long l10, @Nullable NetworkBody networkBody, @NotNull Map<String, String> map) {
        this.size = l10;
        this.body = networkBody;
        this.headers = map;
    }

    @Nullable
    public NetworkBody getBody() {
        return this.body;
    }

    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public Long getSize() {
        return this.size;
    }

    public String toString() {
        return "ReplayNetworkRequestOrResponse{size=" + this.size + ", body=" + this.body + ", headers=" + this.headers + '}';
    }
}
