package ti;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.h f33914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33916c;

    public y(k9.h hVar) {
        this.f33914a = hVar;
        this.f33915b = hVar.f27263a;
        this.f33916c = hVar.f27264b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f33915b == yVar.f33915b && this.f33916c == yVar.f33916c;
    }

    public final int hashCode() {
        return (this.f33915b * 31) + this.f33916c;
    }
}
