package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ResponseDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f25349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f25350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f25351d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f25351d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f25348a;
    }

    public byte[] getResponseData() {
        return this.f25349b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f25350c;
    }

    public boolean isValidResponse() {
        return this.f25351d.isResponseValid(this.f25348a);
    }

    public void setResponseCode(int i) {
        this.f25348a = i;
    }

    public void setResponseData(byte[] bArr) {
        this.f25349b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f25350c = map;
    }
}
