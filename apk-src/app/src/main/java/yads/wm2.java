package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wm2 extends w51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient u51 f44425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f44426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f44427f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f44428g;

    public wm2(u51 u51Var, Object[] objArr, int i) {
        this.f44425d = u51Var;
        this.f44426e = objArr;
        this.f44428g = i;
    }

    @Override // yads.l51
    public final int a(int i, Object[] objArr) {
        return a().a(i, objArr);
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f44425d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.l51
    public final boolean e() {
        return true;
    }

    @Override // yads.w51
    public final r51 f() {
        return new vm2(this);
    }

    @Override // yads.l51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final ma3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44428g;
    }
}
