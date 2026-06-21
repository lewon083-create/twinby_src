package h6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20437a;

    public b(boolean z5) {
        Intrinsics.checkNotNullParameter("com.google.android.gms.ads", "adsSdkName");
        this.f20437a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f20437a == ((b) obj).f20437a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20437a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f20437a;
    }
}
