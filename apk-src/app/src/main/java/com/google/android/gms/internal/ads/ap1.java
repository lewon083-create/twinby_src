package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f3351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f3353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h1 f3355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f3356g;

    public ap1() {
        Map map = Collections.EMPTY_MAP;
        this.f3353d = map;
        this.f3356g = map;
    }

    public final bp1 a(int i) {
        if (i < this.f3352c) {
            return (bp1) this.f3351b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.f3353d.isEmpty() ? Collections.EMPTY_SET : this.f3353d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((bp1) this.f3351b[iE]).setValue(obj);
        }
        f();
        if (this.f3351b == null) {
            this.f3351b = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f3352c == 16) {
            bp1 bp1Var = (bp1) this.f3351b[15];
            this.f3352c = 15;
            g().put(bp1Var.f3848b, bp1Var.f3849c);
        }
        Object[] objArr = this.f3351b;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f3351b[i] = new bp1(this, comparable, obj);
        this.f3352c++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f3352c != 0) {
            this.f3351b = null;
            this.f3352c = 0;
        }
        if (this.f3353d.isEmpty()) {
            return;
        }
        this.f3353d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f3353d.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.f3351b;
        Object obj = ((bp1) objArr[i]).f3849c;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f3352c - i) - 1);
        this.f3352c--;
        if (!this.f3353d.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f3351b;
            int i10 = this.f3352c;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new bp1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f3352c++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.f3352c;
        int i10 = i - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((bp1) this.f3351b[i10]).f3848b);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((bp1) this.f3351b[i12]).f3848b);
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
        if (this.f3355f == null) {
            this.f3355f = new androidx.datastore.preferences.protobuf.h1(this, 1);
        }
        return this.f3355f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1)) {
            return super.equals(obj);
        }
        ap1 ap1Var = (ap1) obj;
        int size = size();
        if (size == ap1Var.size()) {
            int i = this.f3352c;
            if (i != ap1Var.f3352c) {
                return entrySet().equals(ap1Var.entrySet());
            }
            for (int i10 = 0; i10 < i; i10++) {
                if (a(i10).equals(ap1Var.a(i10))) {
                }
            }
            if (i != size) {
                return this.f3353d.equals(ap1Var.f3353d);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f3354e) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f3353d.isEmpty() && !(this.f3353d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3353d = treeMap;
            this.f3356g = treeMap.descendingMap();
        }
        return (SortedMap) this.f3353d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((bp1) this.f3351b[iE]).f3849c : this.f3353d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f3352c;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i; i10++) {
            iHashCode += this.f3351b[i10].hashCode();
        }
        return this.f3353d.size() > 0 ? this.f3353d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f3353d.isEmpty()) {
            return null;
        }
        return this.f3353d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3353d.size() + this.f3352c;
    }
}
