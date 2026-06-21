package md;

import a0.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f28853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28855c;

    public i(int i, int i10, Class cls) {
        this(q.a(cls), i, i10);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f28853a.equals(iVar.f28853a) && this.f28854b == iVar.f28854b && this.f28855c == iVar.f28855c;
    }

    public final int hashCode() {
        return ((((this.f28853a.hashCode() ^ 1000003) * 1000003) ^ this.f28854b) * 1000003) ^ this.f28855c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f28853a);
        sb2.append(", type=");
        int i = this.f28854b;
        sb2.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f28855c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(l7.o.i(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return u.o(sb2, str, "}");
    }

    public i(q qVar, int i, int i10) {
        this.f28853a = qVar;
        this.f28854b = i;
        this.f28855c = i10;
    }
}
