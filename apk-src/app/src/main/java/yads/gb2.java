package yads;

import io.sentry.MeasurementUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum gb2 {
    f38693c("native"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("javascript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29(MeasurementUnit.NONE);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38695b;

    gb2(String str) {
        this.f38695b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f38695b;
    }
}
