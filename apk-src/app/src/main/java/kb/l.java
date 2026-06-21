package kb;

import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ma.d[] f27352a = {new ma.d("name_ulr_private", 1), new ma.d("name_sleep_segment_request", 1), new ma.d("get_last_activity_feature_id", 1), new ma.d("support_context_feature_id", 1), new ma.d("get_current_location", 2), new ma.d("get_last_location_with_request", 1), new ma.d("set_mock_mode_with_callback", 1), new ma.d("set_mock_location_with_callback", 1), new ma.d("inject_location_with_callback", 1), new ma.d("location_updates_with_callback", 1), new ma.d("use_safe_parcelable_in_intents", 1), new ma.d("flp_debug_updates", 1), new ma.d("google_location_accuracy_enabled", 1), new ma.d("geofences_with_callback", 1), new ma.d("location_enabled", 1)};

    public static void a(int i) {
        boolean z5 = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z5 = false;
            }
        }
        c0.c(z5, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String b(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
