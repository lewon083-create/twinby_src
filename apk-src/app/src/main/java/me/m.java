package me;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28893b = new ArrayList();

    @Override // me.p
    public final long c() {
        ArrayList arrayList = this.f28893b;
        if (arrayList.size() == 1) {
            return ((p) arrayList.get(0)).c();
        }
        throw new IllegalStateException();
    }

    @Override // me.p
    public final String e() {
        ArrayList arrayList = this.f28893b;
        if (arrayList.size() == 1) {
            return ((p) arrayList.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f28893b.equals(this.f28893b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f28893b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f28893b.iterator();
    }
}
