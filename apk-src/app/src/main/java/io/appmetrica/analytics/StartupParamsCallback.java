package io.appmetrica.analytics;

import a0.u;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface StartupParamsCallback {
    public static final String APPMETRICA_DEVICE_ID = "appmetrica_device_id";
    public static final String APPMETRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String APPMETRICA_UUID = "appmetrica_uuid";

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Reason {

        @NonNull
        public final String value;
        public static Reason UNKNOWN = new Reason("UNKNOWN");
        public static Reason NETWORK = new Reason("NETWORK");
        public static Reason INVALID_RESPONSE = new Reason("INVALID_RESPONSE");

        public Reason(@NonNull String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Reason.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((Reason) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return u.o(new StringBuilder("Reason{value='"), this.value, "'}");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Result {

        @NonNull
        public final Map<String, StartupParamsItem> parameters;
        public final String uuid = parameterForKey(StartupParamsCallback.APPMETRICA_UUID);
        public final String deviceId = parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        public final String deviceIdHash = parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);

        public Result(@NonNull Map<String, StartupParamsItem> map) {
            this.parameters = map;
        }

        public String parameterForKey(@NonNull String str) {
            StartupParamsItem startupParamsItem = this.parameters.get(str);
            if (startupParamsItem != null) {
                return startupParamsItem.getId();
            }
            return null;
        }
    }

    void onReceive(Result result);

    void onRequestError(@NonNull Reason reason, Result result);
}
