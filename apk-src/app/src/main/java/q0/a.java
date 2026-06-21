package q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.h f31548c;

    public a(int i, int i10, j1.h hVar) {
        this.f31546a = i;
        this.f31547b = i10;
        this.f31548c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f31546a == aVar.f31546a && this.f31547b == aVar.f31547b && this.f31548c.equals(aVar.f31548c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f31546a ^ 1000003) * 1000003) ^ this.f31547b) * 1000003) ^ this.f31548c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f31546a + ", rotationDegrees=" + this.f31547b + ", completer=" + this.f31548c + "}";
    }
}
