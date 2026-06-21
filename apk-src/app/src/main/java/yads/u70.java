package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43595a;

    public u70(boolean z5) {
        this.f43595a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u70) && this.f43595a == ((u70) obj).f43595a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43595a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f43595a + ")";
    }
}
