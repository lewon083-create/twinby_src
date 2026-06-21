package ti;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33884b;

    public r0(String str, String str2) {
        this.f33883a = str;
        this.f33884b = str2;
    }

    public final d8.a a() {
        d8.a aVar = new d8.a(3);
        aVar.f15576b = "";
        aVar.f15577c = "";
        String str = this.f33883a;
        if (str != null) {
            aVar.f15576b = str;
        }
        String str2 = this.f33884b;
        if (str2 != null) {
            aVar.f15577c = str2;
        }
        return new d8.a(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Objects.equals(r0Var.f33883a, this.f33883a) && Objects.equals(r0Var.f33884b, this.f33884b);
    }

    public final int hashCode() {
        return Objects.hash(this.f33883a, this.f33884b);
    }
}
