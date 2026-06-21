package ad;

import com.google.android.gms.internal.ads.a41;
import com.google.android.gms.internal.ads.b41;
import com.google.android.gms.internal.ads.d41;
import com.google.android.gms.internal.ads.m51;
import com.google.android.gms.internal.ads.w31;
import com.google.android.gms.internal.ads.x31;
import com.google.android.gms.internal.ads.y31;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f776b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Map f777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient AbstractSet f778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient AbstractCollection f779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f780f;

    public d(m51 m51Var, Map map) {
        Objects.requireNonNull(m51Var);
        this.f780f = m51Var;
        this.f777c = map;
    }

    public AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        x0 x0Var = (x0) this.f780f;
        List list = (List) ((Collection) entry.getValue());
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new h(x0Var, key, list, null) : new l(x0Var, key, list, (l) null));
    }

    public AbstractMap.SimpleImmutableEntry b(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        m51 m51Var = (m51) this.f780f;
        m51Var.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new b41(m51Var, key, list, null) : new l(m51Var, key, list, (l) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f776b) {
            case 0:
                x0 x0Var = (x0) this.f780f;
                if (this.f777c != x0Var.f892e) {
                    c cVar = new c(this);
                    while (cVar.hasNext()) {
                        cVar.next();
                        cVar.remove();
                    }
                } else {
                    x0Var.f();
                }
                break;
            default:
                m51 m51Var = (m51) this.f780f;
                if (this.f777c != m51Var.f7785e) {
                    x31 x31Var = new x31(this);
                    while (x31Var.hasNext()) {
                        x31Var.next();
                        x31Var.remove();
                    }
                } else {
                    m51Var.e();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f776b) {
            case 0:
                Map map = this.f777c;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                Map map2 = this.f777c;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f776b) {
            case 0:
                b bVar = (b) this.f778d;
                if (bVar != null) {
                    return bVar;
                }
                b bVar2 = new b(this);
                this.f778d = bVar2;
                return bVar2;
            default:
                w31 w31Var = (w31) this.f778d;
                if (w31Var != null) {
                    return w31Var;
                }
                w31 w31Var2 = new w31(this);
                this.f778d = w31Var2;
                return w31Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f776b) {
            case 0:
                if (this == obj || this.f777c.equals(obj)) {
                }
                break;
            default:
                if (this == obj || this.f777c.equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f776b) {
            case 0:
                Map map = this.f777c;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                x0 x0Var = (x0) this.f780f;
                List list = (List) collection;
                return list instanceof RandomAccess ? new h(x0Var, obj, list, null) : new l(x0Var, obj, list, (l) null);
            default:
                Map map2 = this.f777c;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                m51 m51Var = (m51) this.f780f;
                m51Var.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new b41(m51Var, obj, list2, null) : new l(m51Var, obj, list2, (l) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f776b) {
            case 0:
                return this.f777c.hashCode();
            default:
                return this.f777c.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        switch (this.f776b) {
            case 0:
                return ((x0) this.f780f).e();
            default:
                m51 m51Var = (m51) this.f780f;
                Set a41Var = m51Var.f5223b;
                if (a41Var == null) {
                    Map map = m51Var.f7785e;
                    a41Var = map instanceof NavigableMap ? new a41(m51Var, (NavigableMap) map) : map instanceof SortedMap ? new d41(m51Var, (SortedMap) map) : new y31(m51Var, map);
                    m51Var.f5223b = a41Var;
                }
                return a41Var;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f776b) {
            case 0:
                x0 x0Var = (x0) this.f780f;
                Collection collection = (Collection) this.f777c.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection collectionG = x0Var.g();
                collectionG.addAll(collection);
                x0Var.f893f -= collection.size();
                collection.clear();
                return collectionG;
            default:
                Collection collection2 = (Collection) this.f777c.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                m51 m51Var = (m51) this.f780f;
                List list = (List) m51Var.f7787g.mo8h();
                list.addAll(collection2);
                m51Var.f7786f -= collection2.size();
                collection2.clear();
                return list;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f776b) {
        }
        return this.f777c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f776b) {
        }
        return this.f777c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f776b) {
            case 0:
                m mVar = (m) this.f779e;
                if (mVar != null) {
                    return mVar;
                }
                m mVar2 = new m(this, 2);
                this.f779e = mVar2;
                return mVar2;
            default:
                m mVar3 = (m) this.f779e;
                if (mVar3 != null) {
                    return mVar3;
                }
                m mVar4 = new m(this, 5);
                this.f779e = mVar4;
                return mVar4;
        }
    }

    public d(x0 x0Var, Map map) {
        this.f780f = x0Var;
        this.f777c = map;
    }
}
