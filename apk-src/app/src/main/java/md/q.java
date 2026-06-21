package md;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f28868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f28869b;

    public q(Class cls, Class cls2) {
        this.f28868a = cls;
        this.f28869b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f28869b.equals(qVar.f28869b)) {
            return this.f28868a.equals(qVar.f28868a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28868a.hashCode() + (this.f28869b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f28869b;
        Class cls2 = this.f28868a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
