package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1378g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f1380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile h1 f1382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f1383f;

    public static e1 f() {
        e1 e1Var = new e1();
        e1Var.f1379b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        e1Var.f1380c = map;
        e1Var.f1383f = map;
        return e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f1379b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f1379b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.f1 r2 = (androidx.datastore.preferences.protobuf.f1) r2
            java.lang.Comparable r2 = r2.f1395b
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f1379b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.f1 r3 = (androidx.datastore.preferences.protobuf.f1) r3
            java.lang.Comparable r3 = r3.f1395b
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e1.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f1381d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f1379b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1379b.isEmpty()) {
            this.f1379b.clear();
        }
        if (this.f1380c.isEmpty()) {
            return;
        }
        this.f1380c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1380c.containsKey(comparable);
    }

    public final Set d() {
        return this.f1380c.isEmpty() ? Collections.EMPTY_SET : this.f1380c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1380c.isEmpty() && !(this.f1380c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1380c = treeMap;
            this.f1383f = treeMap.descendingMap();
        }
        return (SortedMap) this.f1380c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1382e == null) {
            this.f1382e = new h1(this, 0);
        }
        return this.f1382e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        int size = size();
        if (size == e1Var.size()) {
            int size2 = this.f1379b.size();
            if (size2 != e1Var.f1379b.size()) {
                return ((AbstractSet) entrySet()).equals(e1Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(e1Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f1380c.equals(e1Var.f1380c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((f1) this.f1379b.get(iA)).setValue(obj);
        }
        b();
        if (this.f1379b.isEmpty() && !(this.f1379b instanceof ArrayList)) {
            this.f1379b = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1379b.size() == 16) {
            f1 f1Var = (f1) this.f1379b.remove(15);
            e().put(f1Var.f1395b, f1Var.f1396c);
        }
        this.f1379b.add(i, new f1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((f1) this.f1379b.get(iA)).f1396c : this.f1380c.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((f1) this.f1379b.remove(i)).f1396c;
        if (!this.f1380c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1379b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1379b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((f1) this.f1379b.get(i)).hashCode();
        }
        return this.f1380c.size() > 0 ? this.f1380c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f1380c.isEmpty()) {
            return null;
        }
        return this.f1380c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1380c.size() + this.f1379b.size();
    }
}
