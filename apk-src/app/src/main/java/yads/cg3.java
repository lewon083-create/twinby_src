package yads;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cg3 implements sc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rc2 f37392a;

    public /* synthetic */ cg3(w5 w5Var) {
        this(new rc2(w5Var));
    }

    @Override // yads.sc2
    public final LinkedHashMap a() {
        rc2 rc2Var = this.f37392a;
        v5[] elements = {v5.f43889u, v5.f43890v};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return rc2Var.a(kotlin.collections.p.w(elements));
    }

    public cg3(rc2 rc2Var) {
        this.f37392a = rc2Var;
    }
}
