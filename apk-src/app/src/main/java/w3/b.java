package w3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35028d;

    public b(int i, int i10, String str, String str2) {
        this.f35025a = str;
        this.f35026b = str2;
        this.f35027c = i;
        this.f35028d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35027c == bVar.f35027c && this.f35028d == bVar.f35028d && Objects.equals(this.f35025a, bVar.f35025a) && Objects.equals(this.f35026b, bVar.f35026b);
    }

    public final int hashCode() {
        return Objects.hash(this.f35025a, this.f35026b, Integer.valueOf(this.f35027c), Integer.valueOf(this.f35028d));
    }
}
