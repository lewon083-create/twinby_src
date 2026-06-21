package yads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class px1 extends tx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f42098a;

    public px1(b82 b82Var) {
        this.f42098a = b82Var;
    }

    @Override // yads.tx1
    public final Map b() {
        return new TreeMap(this.f42098a);
    }
}
