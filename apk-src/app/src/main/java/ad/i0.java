package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f810f;

    public i0(j0 j0Var, int i, int i10) {
        this.f810f = j0Var;
        this.f808d = i;
        this.f809e = i10;
    }

    @Override // ad.j0, java.util.List
    /* JADX INFO: renamed from: A */
    public final j0 subList(int i, int i10) {
        h5.p(i, i10, this.f809e);
        int i11 = this.f808d;
        return this.f810f.subList(i + i11, i10 + i11);
    }

    @Override // ad.f0
    public final Object[] e() {
        return this.f810f.e();
    }

    @Override // ad.f0
    public final int f() {
        return this.f810f.g() + this.f808d + this.f809e;
    }

    @Override // ad.f0
    public final int g() {
        return this.f810f.g() + this.f808d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h5.l(i, this.f809e);
        return this.f810f.get(i + this.f808d);
    }

    @Override // ad.j0, ad.f0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // ad.j0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ad.f0
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f809e;
    }

    @Override // ad.j0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
