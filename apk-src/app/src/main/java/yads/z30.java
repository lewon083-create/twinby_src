package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f45237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ho2 f45238b;

    public z30(ct1 ct1Var, ho2 ho2Var) {
        this.f45237a = ct1Var;
        this.f45238b = ho2Var;
    }

    public final void a(y30 y30Var) {
        this.f45238b.b(y30Var.f44901b, "log_type");
        eo2 eo2Var = eo2.f38194c;
        ho2 ho2Var = this.f45238b;
        Map map = ho2Var.f39286a;
        this.f45237a.a(new go2("log", kotlin.collections.j0.m(map), ho2Var.f39287b));
    }
}
