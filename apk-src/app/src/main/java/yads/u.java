package yads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class u extends n implements SortedMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SortedSet f43498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f43499g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, SortedMap sortedMap) {
        super(a0Var, sortedMap);
        this.f43499g = a0Var;
    }

    public SortedSet a() {
        return new v(this.f43499g, b());
    }

    public SortedMap b() {
        return (SortedMap) this.f41112d;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new u(this.f43499g, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new u(this.f43499g, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new u(this.f43499g, b().tailMap(obj));
    }

    @Override // yads.n, java.util.AbstractMap, java.util.Map
    public SortedSet keySet() {
        SortedSet sortedSet = this.f43498f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetA = a();
        this.f43498f = sortedSetA;
        return sortedSetA;
    }
}
