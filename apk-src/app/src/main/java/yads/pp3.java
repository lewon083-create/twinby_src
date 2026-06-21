package yads;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pp3 implements hp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ig3 f41986a;

    public pp3(ig3 ig3Var) {
        this.f41986a = ig3Var;
    }

    @Override // yads.hp2
    public final go2 a(Object obj) {
        Map mapA = this.f41986a.a();
        eo2 eo2Var = eo2.f38194c;
        return new go2("vast_wrapper_request", kotlin.collections.j0.m(mapA), null);
    }

    @Override // yads.hp2
    public final go2 a(xp2 xp2Var, int i, Object obj) {
        fo2 fo2Var;
        List list = xp2Var != null ? (List) xp2Var.f44786a : null;
        if (204 == i) {
            fo2Var = fo2.f38520e;
        } else if (list != null && i == 200) {
            fo2Var = list.isEmpty() ? fo2.f38520e : fo2.f38518c;
        } else {
            fo2Var = fo2.f38519d;
        }
        LinkedHashMap linkedHashMapI = kotlin.collections.j0.i(this.f41986a.a(), kotlin.collections.i0.c(new Pair("status", fo2Var.f38522b)));
        eo2 eo2Var = eo2.f38194c;
        return new go2("vast_wrapper_response", kotlin.collections.j0.m(linkedHashMapI), null);
    }
}
