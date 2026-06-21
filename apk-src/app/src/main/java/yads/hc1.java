package yads;

import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hc1 implements um3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq2 f39122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk.c f39123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pm3 f39124c;

    public hc1(l43 l43Var, vk.c cVar, pm3 pm3Var) {
        this.f39122a = l43Var;
        this.f39123b = cVar;
        this.f39124c = pm3Var;
    }

    @Override // yads.um3
    public final Object a(h82 h82Var) {
        this.f39124c.getClass();
        int i = h82Var.f39069a;
        zp2 zp2Var = new zp2(h82Var.f39070b);
        Map mapD = h82Var.f39071c;
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        String str = (String) this.f39122a.a(new yp2(i, zp2Var, mapD));
        if (str == null || StringsKt.D(str)) {
            return null;
        }
        vk.c cVar = this.f39123b;
        cVar.getClass();
        return (j80) cVar.a(str, j80.Companion.serializer());
    }
}
