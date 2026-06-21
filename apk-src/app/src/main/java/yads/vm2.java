package yads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vm2 extends r51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm2 f44085d;

    public vm2(wm2 wm2Var) {
        this.f44085d = wm2Var;
    }

    @Override // yads.l51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pg2.a(i, this.f44085d.f44428g);
        wm2 wm2Var = this.f44085d;
        int i10 = i * 2;
        Object obj = wm2Var.f44426e[wm2Var.f44427f + i10];
        Objects.requireNonNull(obj);
        wm2 wm2Var2 = this.f44085d;
        Object obj2 = wm2Var2.f44426e[i10 + (wm2Var2.f44427f ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44085d.f44428g;
    }
}
