package fh;

import io.sentry.ProfilingTraceData;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum v6 {
    NORMAL(ProfilingTraceData.TRUNCATION_REASON_NORMAL),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");

    v6(String str) {
    }
}
