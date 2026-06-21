package io.appmetrica.analytics.idsync.impl;

import io.sentry.MeasurementUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return MeasurementUnit.NONE;
        }
        if (i == 2) {
            return "success";
        }
        if (i == 3) {
            return "incompatible_precondition";
        }
        if (i == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
