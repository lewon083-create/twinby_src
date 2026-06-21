package aj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f967b;

    public h(String str, boolean z5) {
        this.f966a = str;
        this.f967b = z5;
    }

    public final List a() {
        return kotlin.collections.s.f(this.f966a, Boolean.valueOf(this.f967b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j0.g.I(a(), ((h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f966a + ", useDataStore=" + this.f967b + ")";
    }
}
