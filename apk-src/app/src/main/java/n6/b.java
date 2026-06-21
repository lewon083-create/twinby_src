package n6;

import a0.u;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f29148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f29149e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f29145a = str;
        this.f29146b = str2;
        this.f29147c = str3;
        this.f29148d = Collections.unmodifiableList(list);
        this.f29149e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29145a.equals(bVar.f29145a) && this.f29146b.equals(bVar.f29146b) && this.f29147c.equals(bVar.f29147c) && this.f29148d.equals(bVar.f29148d)) {
            return this.f29149e.equals(bVar.f29149e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29149e.hashCode() + ((this.f29148d.hashCode() + gf.a.e(gf.a.e(this.f29145a.hashCode() * 31, 31, this.f29146b), 31, this.f29147c)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForeignKey{referenceTable='");
        sb2.append(this.f29145a);
        sb2.append("', onDelete='");
        sb2.append(this.f29146b);
        sb2.append("', onUpdate='");
        sb2.append(this.f29147c);
        sb2.append("', columnNames=");
        sb2.append(this.f29148d);
        sb2.append(", referenceColumnNames=");
        return u.p(sb2, this.f29149e, '}');
    }
}
