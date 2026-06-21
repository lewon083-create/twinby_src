package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a41 extends d41 implements NavigableSet {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m51 f2746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(m51 m51Var, NavigableMap navigableMap) {
        super(m51Var, navigableMap);
        Objects.requireNonNull(m51Var);
        this.f2746f = m51Var;
    }

    @Override // com.google.android.gms.internal.ads.d41
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f12486c);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f12486c)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((y31) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new a41(this.f2746f, ((NavigableMap) ((SortedMap) this.f12486c)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f12486c)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.d41, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f12486c)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f12486c)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        x31 x31Var = (x31) iterator();
        if (!x31Var.hasNext()) {
            return null;
        }
        Object next = x31Var.next();
        x31Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.d41, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.d41, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z5) {
        return new a41(this.f2746f, ((NavigableMap) ((SortedMap) this.f12486c)).headMap(obj, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z5, Object obj2, boolean z10) {
        return new a41(this.f2746f, ((NavigableMap) ((SortedMap) this.f12486c)).subMap(obj, z5, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z5) {
        return new a41(this.f2746f, ((NavigableMap) ((SortedMap) this.f12486c)).tailMap(obj, z5));
    }
}
