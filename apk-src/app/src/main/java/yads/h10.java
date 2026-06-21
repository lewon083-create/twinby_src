package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38976a;

    public h10(float f10) {
        this.f38976a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && Float.compare(this.f38976a, ((h10) obj).f38976a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38976a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f38976a + ")";
    }
}
