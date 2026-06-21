package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38462e;

    public fj2(String str, String str2, String str3, String str4, String str5) {
        this.f38458a = str;
        this.f38459b = str2;
        this.f38460c = str3;
        this.f38461d = str4;
        this.f38462e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj2)) {
            return false;
        }
        fj2 fj2Var = (fj2) obj;
        return lb3.a(this.f38458a, fj2Var.f38458a) && lb3.a(this.f38459b, fj2Var.f38459b) && lb3.a(this.f38460c, fj2Var.f38460c) && lb3.a(this.f38461d, fj2Var.f38461d) && lb3.a(this.f38462e, fj2Var.f38462e);
    }

    public final int hashCode() {
        String str = this.f38458a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f38459b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f38460c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f38461d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f38462e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
