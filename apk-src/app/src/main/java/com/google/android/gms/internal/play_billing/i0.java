package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends h0 implements NavigableSet, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Comparator f14214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient i0 f14215e;

    public i0(Comparator comparator) {
        this.f14214d = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f14214d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        i0 y0Var = this.f14215e;
        if (y0Var == null) {
            y0 y0Var2 = (y0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(y0Var2.f14214d);
            if (!y0Var2.isEmpty()) {
                y0Var = new y0(y0Var2.f14371f.o(), comparatorReverseOrder);
            } else if (n0.f14245c.equals(comparatorReverseOrder)) {
                y0Var = y0.f14370g;
            } else {
                z zVar = c0.f14146c;
                y0Var = new y0(r0.f14290f, comparatorReverseOrder);
            }
            this.f14215e = y0Var;
            y0Var.f14215e = this;
        }
        return y0Var;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        y0 y0Var = (y0) this;
        return y0Var.u(0, y0Var.r(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z5, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f14214d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        y0 y0Var = (y0) this;
        y0 y0VarU = y0Var.u(y0Var.t(obj, z5), y0Var.f14371f.size());
        return y0VarU.u(0, y0VarU.r(obj2, z10));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        y0 y0Var = (y0) this;
        return y0Var.u(y0Var.t(obj, true), y0Var.f14371f.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z5) {
        obj.getClass();
        y0 y0Var = (y0) this;
        return y0Var.u(0, y0Var.r(obj, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z5) {
        obj.getClass();
        y0 y0Var = (y0) this;
        return y0Var.u(y0Var.t(obj, z5), y0Var.f14371f.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f14214d.compare(obj, obj2) <= 0) {
            y0 y0Var = (y0) this;
            y0 y0VarU = y0Var.u(y0Var.t(obj, true), y0Var.f14371f.size());
            return y0VarU.u(0, y0VarU.r(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
