package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1 f20934d = new j1(new j3.p0[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad.b1 f20936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20937c;

    static {
        m3.z.G(0);
    }

    public j1(j3.p0... p0VarArr) {
        ad.b1 b1VarT = ad.j0.t(p0VarArr);
        this.f20936b = b1VarT;
        this.f20935a = p0VarArr.length;
        int i = 0;
        while (i < b1VarT.f770e) {
            int i10 = i + 1;
            for (int i11 = i10; i11 < b1VarT.f770e; i11++) {
                if (((j3.p0) b1VarT.get(i)).equals(b1VarT.get(i11))) {
                    m3.b.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i10;
        }
    }

    public final j3.p0 a(int i) {
        return (j3.p0) this.f20936b.get(i);
    }

    public final int b(j3.p0 p0Var) {
        int iIndexOf = this.f20936b.indexOf(p0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f20935a == j1Var.f20935a && this.f20936b.equals(j1Var.f20936b);
    }

    public final int hashCode() {
        if (this.f20937c == 0) {
            this.f20937c = this.f20936b.hashCode();
        }
        return this.f20937c;
    }

    public final String toString() {
        return this.f20936b.toString();
    }
}
