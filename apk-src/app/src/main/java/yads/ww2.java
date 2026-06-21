package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ww2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax2 f44509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax2 f44510b;

    public ww2(ax2 ax2Var) {
        this(ax2Var, ax2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ww2.class == obj.getClass()) {
            ww2 ww2Var = (ww2) obj;
            if (this.f44509a.equals(ww2Var.f44509a) && this.f44510b.equals(ww2Var.f44510b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44510b.hashCode() + (this.f44509a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f44509a);
        if (this.f44509a.equals(this.f44510b)) {
            str = "";
        } else {
            str = ", " + this.f44510b;
        }
        return a0.u.o(sb2, str, "]");
    }

    public ww2(ax2 ax2Var, ax2 ax2Var2) {
        this.f44509a = (ax2) ni.a(ax2Var);
        this.f44510b = (ax2) ni.a(ax2Var2);
    }
}
