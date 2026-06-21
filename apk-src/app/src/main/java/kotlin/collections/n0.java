package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27493b;

    public n0(ArrayList delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f27493b = delegate;
    }

    @Override // kotlin.collections.h
    public final int a() {
        return this.f27493b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f27493b.add(y.s(this, i), obj);
    }

    @Override // kotlin.collections.h
    public final Object c(int i) {
        return this.f27493b.remove(y.r(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f27493b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f27493b.get(y.r(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new m0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new m0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f27493b.set(y.r(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new m0(this, i);
    }
}
