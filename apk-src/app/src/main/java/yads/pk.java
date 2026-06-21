package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pk implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pk f41937h = new pk(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ok f41943g;

    public pk(int i, int i10, int i11, int i12, int i13) {
        this.f41938b = i;
        this.f41939c = i10;
        this.f41940d = i11;
        this.f41941e = i12;
        this.f41942f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pk.class == obj.getClass()) {
            pk pkVar = (pk) obj;
            if (this.f41938b == pkVar.f41938b && this.f41939c == pkVar.f41939c && this.f41940d == pkVar.f41940d && this.f41941e == pkVar.f41941e && this.f41942f == pkVar.f41942f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f41938b + 527) * 31) + this.f41939c) * 31) + this.f41940d) * 31) + this.f41941e) * 31) + this.f41942f;
    }
}
