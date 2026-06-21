package ad;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i extends d implements SortedMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SortedSet f806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x0 x0Var, SortedMap sortedMap) {
        super(x0Var, sortedMap);
        this.f807h = x0Var;
    }

    public SortedSet c() {
        return new j(this.f807h, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // ad.d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f806g;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f806g = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.f777c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.f807h, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.f807h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.f807h, e().tailMap(obj));
    }
}
