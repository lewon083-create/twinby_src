package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37824b;

    public dl3(int i, int i10) {
        this.f37823a = i;
        this.f37824b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl3)) {
            return false;
        }
        dl3 dl3Var = (dl3) obj;
        return this.f37823a == dl3Var.f37823a && this.f37824b == dl3Var.f37824b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37824b) + (Integer.hashCode(this.f37823a) * 31);
    }

    public final String toString() {
        return com.google.android.gms.internal.ads.om1.j("ViewSize(width=", this.f37823a, ", height=", this.f37824b, ")");
    }
}
