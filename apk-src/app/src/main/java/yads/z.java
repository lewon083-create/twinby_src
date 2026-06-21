package yads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class z extends x implements List {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f45208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Object obj, List list, x xVar) {
        super(a0Var, obj, list, xVar);
        this.f45208g = a0Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean zIsEmpty = this.f44550c.isEmpty();
        ((List) this.f44550c).add(i, obj);
        this.f45208g.f36594g++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f44550c.size();
        boolean zAddAll = ((List) this.f44550c).addAll(i, collection);
        if (zAddAll) {
            int size2 = this.f44550c.size();
            a0 a0Var = this.f45208g;
            a0Var.f36594g = (size2 - size) + a0Var.f36594g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final List e() {
        return (List) this.f44550c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.f44550c).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f44550c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f44550c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new y(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = ((List) this.f44550c).remove(i);
        a0 a0Var = this.f45208g;
        a0Var.f36594g--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.f44550c).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        c();
        a0 a0Var = this.f45208g;
        Object obj = this.f44549b;
        List listSubList = ((List) this.f44550c).subList(i, i10);
        x xVar = this.f44551d;
        if (xVar == null) {
            xVar = this;
        }
        a0Var.getClass();
        return listSubList instanceof RandomAccess ? new t(a0Var, obj, listSubList, xVar) : new z(a0Var, obj, listSubList, xVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new y(this, i);
    }
}
