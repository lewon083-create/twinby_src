package n6;

import a0.u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f29156c;

    public d(String str, List list, boolean z5) {
        this.f29154a = str;
        this.f29155b = z5;
        this.f29156c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f29154a;
        if (this.f29155b != dVar.f29155b || !this.f29156c.equals(dVar.f29156c)) {
            return false;
        }
        String str2 = this.f29154a;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f29154a;
        return this.f29156c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f29155b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Index{name='");
        sb2.append(this.f29154a);
        sb2.append("', unique=");
        sb2.append(this.f29155b);
        sb2.append(", columns=");
        return u.p(sb2, this.f29156c, '}');
    }
}
