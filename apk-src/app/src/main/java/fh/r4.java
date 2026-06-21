package fh;

import io.sentry.rrweb.RRWebOptionsEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum r4 {
    GET("get"),
    POST("post"),
    PUT("put"),
    PATCH("patch"),
    DELETE("delete"),
    HEAD("head"),
    OPTIONS(RRWebOptionsEvent.EVENT_TAG);

    r4(String str) {
    }
}
