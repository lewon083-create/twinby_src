package com.google.android.gms.internal.ads;

import io.sentry.rrweb.RRWebVideoEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum vt0 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(RRWebVideoEvent.EVENT_TAG),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11471b;

    vt0(String str) {
        this.f11471b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11471b;
    }
}
