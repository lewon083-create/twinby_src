package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37315a;

    public c90(boolean z5) {
        this.f37315a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c90) && this.f37315a == ((c90) obj).f37315a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37315a);
    }

    public final String toString() {
        return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f37315a + ")";
    }
}
