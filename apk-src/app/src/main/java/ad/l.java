package ad;

import com.google.android.gms.internal.ads.b41;
import com.google.android.gms.internal.ads.e41;
import com.google.android.gms.internal.ads.m51;
import com.google.android.gms.internal.ads.x31;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f824b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractCollection f828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Serializable f830h;

    public l(m51 m51Var, Object obj, List list, l lVar) {
        this.f830h = m51Var;
        this.f829g = m51Var;
        this.f825c = obj;
        this.f826d = list;
        this.f828f = lVar;
        this.f827e = lVar == null ? null : lVar.f826d;
    }

    public void a() {
        l lVar = (l) this.f828f;
        if (lVar != null) {
            lVar.a();
        } else {
            ((x0) this.f829g).f892e.put(this.f825c, this.f826d);
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                boolean zIsEmpty = this.f826d.isEmpty();
                ((List) this.f826d).add(i, obj);
                ((x0) this.f830h).f893f++;
                if (zIsEmpty) {
                    a();
                }
                break;
            default:
                f();
                boolean zIsEmpty2 = this.f826d.isEmpty();
                ((List) this.f826d).add(i, obj);
                ((m51) this.f830h).f7786f++;
                if (zIsEmpty2) {
                    g();
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f824b) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.f826d).addAll(i, collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                int size2 = this.f826d.size();
                ((x0) this.f830h).f893f += size2 - size;
                if (size != 0) {
                    return zAddAll;
                }
                a();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = ((List) this.f826d).addAll(i, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                int size4 = this.f826d.size();
                ((m51) this.f830h).f7786f += size4 - size3;
                if (size3 != 0) {
                    return zAddAll2;
                }
                g();
                return true;
        }
    }

    public void c() {
        Collection collection;
        l lVar = (l) this.f828f;
        if (lVar != null) {
            lVar.c();
            if (lVar.f826d != this.f827e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f826d.isEmpty() || (collection = (Collection) ((x0) this.f829g).f892e.get(this.f825c)) == null) {
                return;
            }
            this.f826d = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.f824b) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f826d.clear();
                    ((x0) this.f829g).f893f -= size;
                    e();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f826d.clear();
                    ((m51) this.f829g).f7786f -= size2;
                    j();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return this.f826d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return this.f826d.containsAll(collection);
    }

    public void e() {
        l lVar = (l) this.f828f;
        if (lVar != null) {
            lVar.e();
        } else if (this.f826d.isEmpty()) {
            ((x0) this.f829g).f892e.remove(this.f825c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.f824b) {
            case 0:
                if (obj == this) {
                    return true;
                }
                c();
                return this.f826d.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                f();
                return this.f826d.equals(obj);
        }
    }

    public void f() {
        l lVar = (l) this.f828f;
        if (lVar != null) {
            lVar.f();
            if (lVar.f826d != this.f827e) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f826d.isEmpty()) {
            m51 m51Var = (m51) this.f829g;
            Collection collection = (Collection) m51Var.f7785e.get(this.f825c);
            if (collection != null) {
                this.f826d = collection;
            }
        }
    }

    public void g() {
        l lVar = (l) this.f828f;
        if (lVar != null) {
            lVar.g();
            return;
        }
        m51 m51Var = (m51) this.f829g;
        m51Var.f7785e.put(this.f825c, this.f826d);
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return ((List) this.f826d).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.f824b) {
            case 0:
                c();
                return this.f826d.hashCode();
            default:
                f();
                return this.f826d.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return ((List) this.f826d).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f824b) {
            case 0:
                c();
                return new c(this);
            default:
                f();
                return new x31(this);
        }
    }

    public void j() {
        l lVar = (l) this.f828f;
        if (lVar != null) {
            lVar.j();
        } else if (this.f826d.isEmpty()) {
            m51 m51Var = (m51) this.f829g;
            m51Var.f7785e.remove(this.f825c);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return ((List) this.f826d).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f824b) {
            case 0:
                c();
                return new k(this);
            default:
                f();
                return new e41(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f824b) {
            case 0:
                c();
                Object objRemove = ((List) this.f826d).remove(i);
                x0 x0Var = (x0) this.f830h;
                x0Var.f893f--;
                e();
                return objRemove;
            default:
                f();
                Object objRemove2 = ((List) this.f826d).remove(i);
                m51 m51Var = (m51) this.f830h;
                m51Var.f7786f--;
                j();
                return objRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.f824b) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll = this.f826d.removeAll(collection);
                if (!zRemoveAll) {
                    return zRemoveAll;
                }
                int size2 = this.f826d.size();
                ((x0) this.f829g).f893f += size2 - size;
                e();
                return zRemoveAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zRemoveAll2 = this.f826d.removeAll(collection);
                if (!zRemoveAll2) {
                    return zRemoveAll2;
                }
                int size4 = this.f826d.size();
                ((m51) this.f829g).f7786f += size4 - size3;
                j();
                return zRemoveAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.f824b) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.f826d.retainAll(collection);
                if (zRetainAll) {
                    int size2 = this.f826d.size();
                    ((x0) this.f829g).f893f += size2 - size;
                    e();
                }
                return zRetainAll;
            default:
                collection.getClass();
                int size3 = size();
                boolean zRetainAll2 = this.f826d.retainAll(collection);
                if (zRetainAll2) {
                    int size4 = this.f826d.size();
                    ((m51) this.f829g).f7786f += size4 - size3;
                    j();
                }
                return zRetainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return ((List) this.f826d).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return this.f826d.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        switch (this.f824b) {
            case 0:
                c();
                x0 x0Var = (x0) this.f830h;
                List listSubList = ((List) this.f826d).subList(i, i10);
                l lVar = (l) this.f828f;
                if (lVar == null) {
                    lVar = this;
                }
                boolean z5 = listSubList instanceof RandomAccess;
                Object obj = this.f825c;
                return z5 ? new h(x0Var, obj, listSubList, lVar) : new l(x0Var, obj, listSubList, lVar);
            default:
                f();
                List listSubList2 = ((List) this.f826d).subList(i, i10);
                l lVar2 = (l) this.f828f;
                if (lVar2 == null) {
                    lVar2 = this;
                }
                m51 m51Var = (m51) this.f830h;
                m51Var.getClass();
                boolean z10 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.f825c;
                return z10 ? new b41(m51Var, obj2, listSubList2, lVar2) : new l(m51Var, obj2, listSubList2, lVar2);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.f824b) {
            case 0:
                c();
                break;
            default:
                f();
                break;
        }
        return this.f826d.toString();
    }

    public l(x0 x0Var, Object obj, List list, l lVar) {
        this.f830h = x0Var;
        this.f829g = x0Var;
        this.f825c = obj;
        this.f826d = list;
        this.f828f = lVar;
        this.f827e = lVar == null ? null : lVar.f826d;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f824b) {
            case 0:
                c();
                return new k(this, i);
            default:
                f();
                return new e41(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                boolean zRemove = this.f826d.remove(obj);
                if (zRemove) {
                    x0 x0Var = (x0) this.f829g;
                    x0Var.f893f--;
                    e();
                }
                return zRemove;
            default:
                f();
                boolean zRemove2 = this.f826d.remove(obj);
                if (zRemove2) {
                    m51 m51Var = (m51) this.f829g;
                    m51Var.f7786f--;
                    j();
                }
                return zRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.f824b) {
            case 0:
                c();
                boolean zIsEmpty = this.f826d.isEmpty();
                boolean zAdd = this.f826d.add(obj);
                if (zAdd) {
                    ((x0) this.f829g).f893f++;
                    if (zIsEmpty) {
                        a();
                    }
                }
                return zAdd;
            default:
                f();
                boolean zIsEmpty2 = this.f826d.isEmpty();
                boolean zAdd2 = this.f826d.add(obj);
                if (!zAdd2) {
                    return zAdd2;
                }
                ((m51) this.f829g).f7786f++;
                if (!zIsEmpty2) {
                    return zAdd2;
                }
                g();
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.f824b) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.f826d.addAll(collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                int size2 = this.f826d.size();
                ((x0) this.f829g).f893f += size2 - size;
                if (size != 0) {
                    return zAddAll;
                }
                a();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = this.f826d.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                int size4 = this.f826d.size();
                ((m51) this.f829g).f7786f += size4 - size3;
                if (size3 != 0) {
                    return zAddAll2;
                }
                g();
                return true;
        }
    }
}
