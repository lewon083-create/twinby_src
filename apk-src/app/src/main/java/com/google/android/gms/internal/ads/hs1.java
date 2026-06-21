package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends AbstractList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fs1 f6238d = fs1.w(hs1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final es1 f6240c;

    public hs1(ArrayList arrayList, es1 es1Var) {
        this.f6239b = arrayList;
        this.f6240c = es1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f6239b;
        if (list.size() > i) {
            return list.get(i);
        }
        es1 es1Var = this.f6240c;
        if (!es1Var.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(es1Var.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new gs1(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        fs1 fs1Var = f6238d;
        fs1Var.k("potentially expensive size() call");
        fs1Var.k("blowup running");
        while (true) {
            es1 es1Var = this.f6240c;
            boolean zHasNext = es1Var.hasNext();
            List list = this.f6239b;
            if (!zHasNext) {
                return list.size();
            }
            list.add(es1Var.next());
        }
    }
}
