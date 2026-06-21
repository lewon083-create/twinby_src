package m3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28597c;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(int i, int i10) {
        String strK;
        if (i == 0) {
            strK = a0.u.k(i10, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strK = a0.u.k(i10, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strK = a0.u.k(i10, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strK = a0.u.k(i10, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            strK = a0.u.k(i10, "Player stuck suppressed for ", " ms");
        }
        super(strK);
        this.f28596b = i;
        this.f28597c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f28596b == sVar.f28596b && this.f28597c == sVar.f28597c;
    }

    public final int hashCode() {
        return ((527 + this.f28596b) * 31) + this.f28597c;
    }
}
