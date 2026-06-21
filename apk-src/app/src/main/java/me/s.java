package me;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe.j f28895b = new oe.j();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof s) && ((s) obj).f28895b.equals(this.f28895b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f28895b.hashCode();
    }
}
