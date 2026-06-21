package io.sentry.util.network;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkRequestData {

    @Nullable
    private final String method;

    @Nullable
    private ReplayNetworkRequestOrResponse request;

    @Nullable
    private Long requestBodySize;

    @Nullable
    private ReplayNetworkRequestOrResponse response;

    @Nullable
    private Long responseBodySize;

    @Nullable
    private Integer statusCode;

    public NetworkRequestData(@Nullable String str) {
        this.method = str;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    @Nullable
    public ReplayNetworkRequestOrResponse getRequest() {
        return this.request;
    }

    @Nullable
    public Long getRequestBodySize() {
        return this.requestBodySize;
    }

    @Nullable
    public ReplayNetworkRequestOrResponse getResponse() {
        return this.response;
    }

    @Nullable
    public Long getResponseBodySize() {
        return this.responseBodySize;
    }

    @Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setRequestDetails(@NotNull ReplayNetworkRequestOrResponse replayNetworkRequestOrResponse) {
        this.request = replayNetworkRequestOrResponse;
        this.requestBodySize = replayNetworkRequestOrResponse.getSize();
    }

    public void setResponseDetails(int i, @NotNull ReplayNetworkRequestOrResponse replayNetworkRequestOrResponse) {
        this.statusCode = Integer.valueOf(i);
        this.response = replayNetworkRequestOrResponse;
        this.responseBodySize = replayNetworkRequestOrResponse.getSize();
    }

    public String toString() {
        return "NetworkRequestData{method='" + this.method + "', statusCode=" + this.statusCode + ", requestBodySize=" + this.requestBodySize + ", responseBodySize=" + this.responseBodySize + ", request=" + this.request + ", response=" + this.response + '}';
    }
}
