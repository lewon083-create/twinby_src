package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13538h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f13541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h1 f13543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f13544g;

    public r6() {
        Map map = Collections.EMPTY_MAP;
        this.f13541d = map;
        this.f13544g = map;
    }

    public final Set a() {
        return this.f13541d.isEmpty() ? Collections.EMPTY_SET : this.f13541d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iD = d(comparable);
        if (iD >= 0) {
            return ((s6) this.f13539b[iD]).setValue(obj);
        }
        g();
        if (this.f13539b == null) {
            this.f13539b = new Object[16];
        }
        int i = -(iD + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f13540c == 16) {
            s6 s6Var = (s6) this.f13539b[15];
            this.f13540c = 15;
            f().put(s6Var.f13549b, s6Var.f13550c);
        }
        Object[] objArr = this.f13539b;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f13539b[i] = new s6(this, comparable, obj);
        this.f13540c++;
        return null;
    }

    public final s6 c(int i) {
        if (i < this.f13540c) {
            return (s6) this.f13539b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f13540c != 0) {
            this.f13539b = null;
            this.f13540c = 0;
        }
        if (this.f13541d.isEmpty()) {
            return;
        }
        this.f13541d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f13541d.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int i = this.f13540c;
        int i10 = i - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((s6) this.f13539b[i10]).f13549b);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((s6) this.f13539b[i12]).f13549b);
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

    public final Object e(int i) {
        g();
        Object[] objArr = this.f13539b;
        Object obj = ((s6) objArr[i]).f13550c;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f13540c - i) - 1);
        this.f13540c--;
        if (!this.f13541d.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.f13539b;
            int i10 = this.f13540c;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new s6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f13540c++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13543f == null) {
            this.f13543f = new androidx.datastore.preferences.protobuf.h1(this, 2);
        }
        return this.f13543f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return super.equals(obj);
        }
        r6 r6Var = (r6) obj;
        int size = size();
        if (size == r6Var.size()) {
            int i = this.f13540c;
            if (i != r6Var.f13540c) {
                return entrySet().equals(r6Var.entrySet());
            }
            for (int i10 = 0; i10 < i; i10++) {
                if (c(i10).equals(r6Var.c(i10))) {
                }
            }
            if (i != size) {
                return this.f13541d.equals(r6Var.f13541d);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        g();
        if (this.f13541d.isEmpty() && !(this.f13541d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13541d = treeMap;
            this.f13544g = treeMap.descendingMap();
        }
        return (SortedMap) this.f13541d;
    }

    public final void g() {
        if (this.f13542e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        return iD >= 0 ? ((s6) this.f13539b[iD]).f13550c : this.f13541d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f13540c;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i; i10++) {
            iHashCode += this.f13539b[i10].hashCode();
        }
        return this.f13541d.size() > 0 ? this.f13541d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        if (iD >= 0) {
            return e(iD);
        }
        if (this.f13541d.isEmpty()) {
            return null;
        }
        return this.f13541d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13541d.size() + this.f13540c;
    }
}
