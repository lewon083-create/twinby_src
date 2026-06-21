package k6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f27021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27022d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.f27019a;
            if (i != aVar.f27019a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f27022d - this.f27020b) != 1 || this.f27022d != aVar.f27020b || this.f27020b != aVar.f27022d) {
                if (this.f27022d != aVar.f27022d || this.f27020b != aVar.f27020b) {
                    return false;
                }
                Object obj2 = this.f27021c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f27021c)) {
                        return false;
                    }
                } else if (aVar.f27021c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f27019a * 31) + this.f27020b) * 31) + this.f27022d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i = this.f27019a;
        sb2.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f27020b);
        sb2.append("c:");
        sb2.append(this.f27022d);
        sb2.append(",p:");
        sb2.append(this.f27021c);
        sb2.append("]");
        return sb2.toString();
    }
}
