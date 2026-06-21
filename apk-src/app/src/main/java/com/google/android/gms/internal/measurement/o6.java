package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f13905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h1 f13907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f13908g;

    public o6() {
        Map map = Collections.EMPTY_MAP;
        this.f13905d = map;
        this.f13908g = map;
    }

    public final p6 a(int i) {
        if (i < this.f13904c) {
            return (p6) this.f13903b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.f13905d.isEmpty() ? Collections.EMPTY_SET : this.f13905d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((p6) this.f13903b[iE]).setValue(obj);
        }
        f();
        if (this.f13903b == null) {
            this.f13903b = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f13904c == 16) {
            p6 p6Var = (p6) this.f13903b[15];
            this.f13904c = 15;
            g().put(p6Var.f13918b, p6Var.f13919c);
        }
        Object[] objArr = this.f13903b;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f13903b[i] = new p6(this, comparable, obj);
        this.f13904c++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f13904c != 0) {
            this.f13903b = null;
            this.f13904c = 0;
        }
        if (this.f13905d.isEmpty()) {
            return;
        }
        this.f13905d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f13905d.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.f13903b;
        Object obj = ((p6) objArr[i]).f13919c;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f13904c - i) - 1);
        this.f13904c--;
        if (!this.f13905d.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f13903b;
            int i10 = this.f13904c;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new p6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f13904c++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.f13904c;
        int i10 = i - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((p6) this.f13903b[i10]).f13918b);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((p6) this.f13903b[i12]).f13918b);
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13907f == null) {
            this.f13907f = new androidx.datastore.preferences.protobuf.h1(this, 3);
        }
        return this.f13907f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return super.equals(obj);
        }
        o6 o6Var = (o6) obj;
        int size = size();
        if (size == o6Var.size()) {
            int i = this.f13904c;
            if (i != o6Var.f13904c) {
                return entrySet().equals(o6Var.entrySet());
            }
            for (int i10 = 0; i10 < i; i10++) {
                if (a(i10).equals(o6Var.a(i10))) {
                }
            }
            if (i != size) {
                return this.f13905d.equals(o6Var.f13905d);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f13906e) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f13905d.isEmpty() && !(this.f13905d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13905d = treeMap;
            this.f13908g = treeMap.descendingMap();
        }
        return (SortedMap) this.f13905d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((p6) this.f13903b[iE]).f13919c : this.f13905d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f13904c;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i; i10++) {
            iHashCode += this.f13903b[i10].hashCode();
        }
        return this.f13905d.size() > 0 ? this.f13905d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f13905d.isEmpty()) {
            return null;
        }
        return this.f13905d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13905d.size() + this.f13904c;
    }
}
