package yads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ti1 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient l f43329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient si1 f43330c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f43329b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l((n) this);
        this.f43329b = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        si1 si1Var = this.f43330c;
        if (si1Var != null) {
            return si1Var;
        }
        si1 si1Var2 = new si1(this);
        this.f43330c = si1Var2;
        return si1Var2;
    }
}
