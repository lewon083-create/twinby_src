package zh;

import a0.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46273c;

    public a(String str, String str2) {
        this.f46271a = str;
        this.f46272b = null;
        this.f46273c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f46271a.equals(aVar.f46271a)) {
            return this.f46273c.equals(aVar.f46273c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46273c.hashCode() + (this.f46271a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DartEntrypoint( bundle path: ");
        sb2.append(this.f46271a);
        sb2.append(", function: ");
        return u.o(sb2, this.f46273c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f46271a = str;
        this.f46272b = str2;
        this.f46273c = str3;
    }
}
