package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 implements nx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f37937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient q f37938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient d0 f37939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient n f37940e;

    public abstract n a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx1) {
            return ((i) this).a().equals(((i) ((nx1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f41112d.hashCode();
    }

    public final String toString() {
        return a().f41112d.toString();
    }
}
