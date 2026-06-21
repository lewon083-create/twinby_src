package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c41 extends ad.d implements SortedMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SortedSet f4022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m51 f4023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(m51 m51Var, SortedMap sortedMap) {
        super(m51Var, sortedMap);
        Objects.requireNonNull(m51Var);
        this.f4023h = m51Var;
    }

    public SortedSet c() {
        return new d41(this.f4023h, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // ad.d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f4022g;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f4022g = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.f777c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new c41(this.f4023h, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new c41(this.f4023h, e().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new c41(this.f4023h, e().tailMap(obj));
    }
}
