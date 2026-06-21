package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37436b;

    public cl3(int i, int i10) {
        this.f37435a = i;
        this.f37436b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl3)) {
            return false;
        }
        cl3 cl3Var = (cl3) obj;
        return this.f37435a == cl3Var.f37435a && this.f37436b == cl3Var.f37436b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37436b) + (Integer.hashCode(this.f37435a) * 31);
    }

    public final String toString() {
        return com.google.android.gms.internal.ads.om1.j("ViewSize(width=", this.f37435a, ", height=", this.f37436b, ")");
    }
}
