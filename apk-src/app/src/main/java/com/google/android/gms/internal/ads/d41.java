package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d41 extends y31 implements SortedSet {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m51 f4454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(m51 m51Var, SortedMap sortedMap) {
        super(m51Var, sortedMap);
        Objects.requireNonNull(m51Var);
        this.f4454e = m51Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f12486c;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new d41(this.f4454e, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new d41(this.f4454e, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new d41(this.f4454e, a().tailMap(obj));
    }
}
