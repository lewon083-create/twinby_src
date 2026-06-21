package j3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26249c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26250a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26251b = 0;

    static {
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(2);
        m3.z.G(3);
    }

    public i(v0 v0Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26250a == iVar.f26250a && this.f26251b == iVar.f26251b;
    }

    public final int hashCode() {
        return (((16337 + this.f26250a) * 31) + this.f26251b) * 31;
    }
}
