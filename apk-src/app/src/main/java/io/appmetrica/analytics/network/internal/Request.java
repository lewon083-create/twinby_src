package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f25281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f25282d;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f25285c = new byte[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f25286d = new HashMap();

        public Builder(@NonNull String str) {
            this.f25283a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, String str2) {
            this.f25286d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f25283a, this.f25284b, this.f25285c, this.f25286d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f25285c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f25284b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i) {
        this(str, str2, bArr, map);
    }

    @NonNull
    public byte[] getBody() {
        return this.f25281c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f25282d;
    }

    @NonNull
    public String getMethod() {
        return this.f25280b;
    }

    @NonNull
    public String getUrl() {
        return this.f25279a;
    }

    public String toString() {
        return "Request{url=" + this.f25279a + ", method='" + this.f25280b + "', bodyLength=" + this.f25281c.length + ", headers=" + this.f25282d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f25279a = str;
        this.f25280b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f25281c = bArr;
        this.f25282d = e.a(map);
    }
}
