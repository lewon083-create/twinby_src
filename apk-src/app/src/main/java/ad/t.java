package ad;

import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.m41;
import com.google.android.gms.internal.measurement.h5;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f867b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f871f;

    public t(m41 m41Var) {
        Objects.requireNonNull(m41Var);
        this.f871f = m41Var;
        this.f868c = m41Var.f7770f;
        this.f869d = m41Var.isEmpty() ? -1 : 0;
        this.f870e = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f867b) {
            case 0:
                if (this.f869d >= 0) {
                }
                break;
            default:
                if (this.f869d >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f867b) {
            case 0:
                v vVar = (v) this.f871f;
                if (vVar.f886f != this.f868c) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f869d;
                this.f870e = i;
                Object objA = a(i);
                int i10 = this.f869d + 1;
                if (i10 >= vVar.f887g) {
                    i10 = -1;
                }
                this.f869d = i10;
                return objA;
            default:
                m41 m41Var = (m41) this.f871f;
                if (m41Var.f7770f != this.f868c) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f869d;
                this.f870e = i11;
                Object objB = b(i11);
                int i12 = this.f869d + 1;
                if (i12 >= m41Var.f7771g) {
                    i12 = -1;
                }
                this.f869d = i12;
                return objB;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f867b) {
            case 0:
                v vVar = (v) this.f871f;
                if (vVar.f886f != this.f868c) {
                    throw new ConcurrentModificationException();
                }
                h5.q("no calls to next() since the last call to remove()", this.f870e >= 0);
                this.f868c += 32;
                vVar.remove(vVar.j()[this.f870e]);
                this.f869d--;
                this.f870e = -1;
                return;
            default:
                m41 m41Var = (m41) this.f871f;
                if (m41Var.f7770f != this.f868c) {
                    throw new ConcurrentModificationException();
                }
                ix.l0("no calls to next() since the last call to remove()", this.f870e >= 0);
                this.f868c += 32;
                m41Var.remove(m41Var.b()[this.f870e]);
                this.f869d--;
                this.f870e = -1;
                return;
        }
    }

    public t(v vVar) {
        this.f871f = vVar;
        this.f868c = vVar.f886f;
        this.f869d = vVar.isEmpty() ? -1 : 0;
        this.f870e = -1;
    }
}
