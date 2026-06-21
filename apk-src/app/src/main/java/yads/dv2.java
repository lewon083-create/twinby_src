package yads;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dv2 implements sc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rc2 f37900a;

    public /* synthetic */ dv2(w5 w5Var) {
        this(new rc2(w5Var));
    }

    @Override // yads.sc2
    public final LinkedHashMap a() {
        rc2 rc2Var = this.f37900a;
        v5[] elements = {v5.f43877h, v5.i, v5.f43879k, v5.f43878j, v5.f43880l, v5.f43881m, v5.f43894z};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return rc2Var.a(kotlin.collections.p.w(elements));
    }

    public dv2(rc2 rc2Var) {
        this.f37900a = rc2Var;
    }
}
