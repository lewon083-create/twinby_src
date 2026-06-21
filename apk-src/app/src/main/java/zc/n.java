package zc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46227b;

    public n(Object obj) {
        this.f46227b = obj;
    }

    @Override // zc.f
    public final Object a() {
        return this.f46227b;
    }

    @Override // zc.f
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f46227b.equals(((n) obj).f46227b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46227b.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f46227b + ")";
    }
}
