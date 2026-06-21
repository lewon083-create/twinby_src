package yads;

import io.sentry.protocol.Request;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum i61 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("beginToRender"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("onePixel"),
    f39445c("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF79(Request.JsonKeys.OTHER);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39447b;

    i61(String str) {
        this.f39447b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f39447b;
    }
}
