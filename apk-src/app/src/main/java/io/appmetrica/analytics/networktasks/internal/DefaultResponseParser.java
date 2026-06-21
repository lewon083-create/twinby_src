package io.appmetrica.analytics.networktasks.internal;

import a0.u;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultResponseParser {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Response {

        @NonNull
        public final String mStatus;

        public Response(@NonNull String str) {
            this.mStatus = str;
        }

        public String toString() {
            return u.o(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public Response parse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new Response(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
