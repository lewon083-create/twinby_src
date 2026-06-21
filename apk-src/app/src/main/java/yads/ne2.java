package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ne2 implements xq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ne2 f41242c = new ne2(new dw0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ew0 f41243b;

    public ne2(ew0 ew0Var) {
        this.f41243b = ew0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ne2) {
            return this.f41243b.equals(((ne2) obj).f41243b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41243b.hashCode();
    }
}
