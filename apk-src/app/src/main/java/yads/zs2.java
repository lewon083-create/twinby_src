package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zs2 implements y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f45526a;

    public zs2(v9 v9Var) {
        this.f45526a = v9Var;
    }

    @Override // yads.y9
    public final ho2 a() {
        ho2 ho2Var = new ho2((Map) null, 3);
        ho2Var.b(this.f45526a.f43940l, "ad_source");
        ho2Var.b(this.f45526a.f43931b, "ad_type_format");
        ho2Var.b(this.f45526a.f43934e, "ad_unit_id");
        ho2Var.b(this.f45526a.f43933d, "product_type");
        ho2Var.a(this.f45526a.f43943o, "server_log_id");
        ho2Var.b(this.f45526a.c().f41737a.f37246b, "size_type");
        ho2Var.b(Integer.valueOf(this.f45526a.c().f41739c), "width");
        ho2Var.b(Integer.valueOf(this.f45526a.c().f41740d), "height");
        ho2Var.f39287b = this.f45526a.i;
        return ho2Var;
    }
}
