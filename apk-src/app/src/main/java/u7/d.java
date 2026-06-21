package u7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34318b;

    public d(String str, int i) {
        this.f34317a = str;
        this.f34318b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f34318b != dVar.f34318b) {
            return false;
        }
        return this.f34317a.equals(dVar.f34317a);
    }

    public final int hashCode() {
        return (this.f34317a.hashCode() * 31) + this.f34318b;
    }
}
