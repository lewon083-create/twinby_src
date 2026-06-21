package a6;

import a0.u;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f453b;

    public d(List list, int i) {
        this.f452a = list;
        this.f453b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sbM = l7.o.m(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbM.append(s.d(list2));
        sbM.append("'.");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f453b == dVar.f453b && Intrinsics.a(this.f452a, dVar.f452a);
    }

    public final int hashCode() {
        return this.f452a.hashCode() + (this.f453b * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb2.append(this.f453b);
        sb2.append(", mergedHistory=");
        return u.p(sb2, this.f452a, ')');
    }

    public d() {
        this(b0.f27475b, -1);
    }
}
