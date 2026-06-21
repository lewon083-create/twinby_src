package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends AbstractList implements RandomAccess, r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f13284b;

    public r1(q0 q0Var) {
        this.f13284b = q0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f13284b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new q1(this);
    }

    @Override // com.google.android.gms.internal.auth.r0
    public final List k() {
        return Collections.unmodifiableList(this.f13284b.f13282c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new p1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13284b.f13282c.size();
    }

    @Override // com.google.android.gms.internal.auth.r0
    public final r0 i() {
        return this;
    }
}
