package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterator f854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f855f;

    public p0() {
        this.f851b = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        h5.r(this.f851b != 4);
        int iM = t.z.m(this.f851b);
        if (iM == 0) {
            return true;
        }
        if (iM != 2) {
            this.f851b = 4;
            switch (this.f853d) {
                case 0:
                    do {
                        Iterator it = this.f854e;
                        if (!it.hasNext()) {
                            this.f851b = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((zc.g) this.f855f).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f854e;
                        if (!it2.hasNext()) {
                            this.f851b = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((Set) this.f855f).contains(next));
                    break;
            }
            this.f852c = next;
            if (this.f851b != 3) {
                this.f851b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f851b = 2;
        Object obj = this.f852c;
        this.f852c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(Iterator it, zc.g gVar) {
        this();
        this.f853d = 0;
        this.f854e = it;
        this.f855f = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(Set set, Set set2) {
        this();
        this.f853d = 1;
        this.f855f = set2;
        this.f854e = set.iterator();
    }
}
