package ad;

import com.google.android.gms.internal.ads.j41;
import com.google.android.gms.internal.ads.l51;
import com.google.android.gms.internal.ads.m41;
import com.google.android.gms.internal.ads.m51;
import com.google.android.gms.internal.ads.v31;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f837c;

    public /* synthetic */ m(int i, Serializable serializable) {
        this.f836b = i;
        this.f837c = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f836b) {
            case 0:
                ((x0) this.f837c).f();
                break;
            case 1:
                ((v) this.f837c).clear();
                break;
            case 2:
                ((AbstractMap) this.f837c).clear();
                break;
            case 3:
                ((m51) this.f837c).e();
                break;
            case 4:
                ((m41) this.f837c).clear();
                break;
            default:
                ((d) this.f837c).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f836b) {
            case 0:
                return ((x0) this.f837c).b(obj);
            case 1:
            case 4:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) this.f837c).containsValue(obj);
            case 3:
                return ((m51) this.f837c).c(obj);
            case 5:
                return ((d) this.f837c).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f836b) {
            case 2:
                return ((AbstractMap) this.f837c).isEmpty();
            case 5:
                return ((d) this.f837c).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f836b) {
            case 0:
                return new a((x0) this.f837c);
            case 1:
                v vVar = (v) this.f837c;
                Map mapC = vVar.c();
                return mapC != null ? mapC.values().iterator() : new r(vVar, 2);
            case 2:
                return new v0(((AbstractMap) this.f837c).entrySet().iterator());
            case 3:
                m51 m51Var = (m51) this.f837c;
                m51Var.getClass();
                return new v31(m51Var);
            case 4:
                m41 m41Var = (m41) this.f837c;
                Map mapE = m41Var.e();
                return mapE != null ? mapE.values().iterator() : new j41(m41Var, 2);
            default:
                return new l51(((d) this.f837c).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f836b) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.f837c;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    d dVar = (d) this.f837c;
                    for (Map.Entry entry2 : dVar.entrySet()) {
                        if (Objects.equals(obj, entry2.getValue())) {
                            dVar.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f836b) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.f837c;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 5:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    d dVar = (d) this.f837c;
                    for (Map.Entry entry2 : dVar.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet2);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f836b) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.f837c;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 5:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    d dVar = (d) this.f837c;
                    for (Map.Entry entry2 : dVar.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet2);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f836b) {
            case 0:
                return ((x0) this.f837c).f893f;
            case 1:
                return ((v) this.f837c).size();
            case 2:
                return ((AbstractMap) this.f837c).size();
            case 3:
                return ((m51) this.f837c).f7786f;
            case 4:
                return ((m41) this.f837c).size();
            default:
                return ((d) this.f837c).f777c.size();
        }
    }

    public /* synthetic */ m(AbstractMap abstractMap, int i) {
        this.f836b = i;
        this.f837c = abstractMap;
    }
}
