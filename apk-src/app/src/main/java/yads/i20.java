package yads;

import io.sentry.rrweb.RRWebVideoEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum i20 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("htmlDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("nativeDisplay"),
    f39407c(RRWebVideoEvent.EVENT_TAG),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("audio");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39409b;

    i20(String str) {
        this.f39409b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f39409b;
    }
}
