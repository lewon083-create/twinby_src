package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends c0 implements RandomAccess, r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13282c;

    static {
        new q0();
    }

    public q0(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f13282c = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a();
        this.f13282c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.c0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof r0) {
            collection = ((r0) collection).k();
        }
        boolean zAddAll = this.f13282c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.f13282c;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            String str = g0Var.e() == 0 ? "" : new String(g0Var.f13224c, 0, g0Var.e(), o0.f13269a);
            byte[] bArr = g0Var.f13224c;
            int iE = g0Var.e();
            x1.f13307a.getClass();
            if (y.a(bArr, 0, iE)) {
                list.set(i, str);
            }
            return str;
        }
        byte[] bArr2 = (byte[]) obj;
        String str2 = new String(bArr2, o0.f13269a);
        y yVar = x1.f13307a;
        int length = bArr2.length;
        yVar.getClass();
        if (y.a(bArr2, 0, length)) {
            list.set(i, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.auth.c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f13282c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.m0
    public final m0 d(int i) {
        List list = this.f13282c;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new q0(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.r0
    public final r0 i() {
        return this.f13175b ? new r1(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.r0
    public final List k() {
        return Collections.unmodifiableList(this.f13282c);
    }

    @Override // com.google.android.gms.internal.auth.c0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.f13282c.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof g0)) {
            return new String((byte[]) objRemove, o0.f13269a);
        }
        g0 g0Var = (g0) objRemove;
        return g0Var.e() == 0 ? "" : new String(g0Var.f13224c, 0, g0Var.e(), o0.f13269a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.f13282c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g0)) {
            return new String((byte[]) obj2, o0.f13269a);
        }
        g0 g0Var = (g0) obj2;
        return g0Var.e() == 0 ? "" : new String(g0Var.f13224c, 0, g0Var.e(), o0.f13269a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13282c.size();
    }

    public q0(ArrayList arrayList) {
        super(true);
        this.f13282c = arrayList;
    }

    public q0() {
        super(false);
        this.f13282c = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f13282c.size(), collection);
    }
}
