package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j33 implements u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39718c;

    public j33(ArrayList arrayList, ArrayList arrayList2) {
        this.f39717b = arrayList;
        this.f39718c = arrayList2;
    }

    @Override // yads.u43
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < this.f39718c.size()) {
            return ((Long) this.f39718c.get(i)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.u43
    public final List b(long j10) {
        int iA = lb3.a(this.f39718c, Long.valueOf(j10), false);
        return iA == -1 ? Collections.EMPTY_LIST : (List) this.f39717b.get(iA);
    }

    @Override // yads.u43
    public final int a() {
        return this.f39718c.size();
    }

    @Override // yads.u43
    public final int a(long j10) {
        int i;
        List list = this.f39718c;
        Long lValueOf = Long.valueOf(j10);
        int i10 = lb3.f40466a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < this.f39718c.size()) {
            return i;
        }
        return -1;
    }
}
