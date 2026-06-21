package v8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34803b;

    public a(Object obj, b bVar) {
        this.f34802a = obj;
        this.f34803b = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f34803b;
            if (this.f34802a.equals(aVar.f34802a)) {
                Object obj2 = d.f34806b;
                if (obj2.equals(obj2) && ((bVar = this.f34803b) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f34802a.hashCode()) * 1000003) ^ d.f34806b.hashCode()) * 1000003;
        b bVar = this.f34803b;
        return (bVar == null ? 0 : bVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f34802a + ", priority=" + d.f34806b + ", productData=" + this.f34803b + "}";
    }
}
