package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44371c;

    public wf0(String str, String str2, String str3) {
        this.f44369a = str;
        this.f44370b = str2;
        this.f44371c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf0.class == obj.getClass()) {
            wf0 wf0Var = (wf0) obj;
            if (lb3.a(this.f44369a, wf0Var.f44369a) && lb3.a(this.f44370b, wf0Var.f44370b) && lb3.a(this.f44371c, wf0Var.f44371c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f44369a.hashCode() * 31;
        String str = this.f44370b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f44371c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
