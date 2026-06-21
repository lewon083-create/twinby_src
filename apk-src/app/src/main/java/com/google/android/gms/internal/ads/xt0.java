package com.google.android.gms.internal.ads;

import io.sentry.protocol.Request;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum xt0 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWABLE("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIBLE("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(Request.JsonKeys.OTHER);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12327b;

    xt0(String str) {
        this.f12327b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12327b;
    }
}
