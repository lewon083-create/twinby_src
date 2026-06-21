package ad;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a1 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator[] f765b;

    public a0(p pVar, p pVar2) {
        this.f765b = new Comparator[]{pVar, pVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f765b;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return Arrays.equals(this.f765b, ((a0) obj).f765b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f765b);
    }

    public final String toString() {
        return a0.u.o(new StringBuilder("Ordering.compound("), Arrays.toString(this.f765b), ")");
    }
}
