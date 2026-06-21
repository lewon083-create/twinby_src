package ad;

import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.ads.k51;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f878b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f880d;

    public u0(List list, c31 c31Var) {
        list.getClass();
        this.f879c = list;
        this.f880d = c31Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.f878b) {
        }
        return this.f879c.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f878b) {
            case 0:
                return new s0(this, this.f879c.listIterator(i), 1);
            default:
                return new k51(this, this.f879c.listIterator(i), 1);
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        switch (this.f878b) {
            case 0:
                this.f879c.subList(i, i10).clear();
                break;
            default:
                this.f879c.subList(i, i10).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f878b) {
        }
        return this.f879c.size();
    }

    public u0(List list, zc.e eVar) {
        list.getClass();
        this.f879c = list;
        this.f880d = eVar;
    }
}
