package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm3 f40499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd3 f40500b;

    public /* synthetic */ lc3(Context context, ct1 ct1Var) {
        this(g82.a(), new hd3(context, ct1Var));
    }

    public final hc3 a(h82 h82Var) {
        String strC;
        qm3 qm3Var = this.f40499a;
        qm3Var.f42340a.getClass();
        int i = h82Var.f39069a;
        zp2 zp2Var = new zp2(h82Var.f39070b);
        Map mapD = h82Var.f39071c;
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        String strA = ((k82) qm3Var.f42341b).a(new yp2(i, zp2Var, mapD));
        Map mapD2 = h82Var.f39071c;
        if (mapD2 == null) {
            mapD2 = kotlin.collections.j0.d();
        }
        kn knVar = new kn(mapD2);
        if (strA != null && strA.length() != 0) {
            try {
                cc3 cc3VarA = this.f40500b.a(strA, knVar);
                if (cc3VarA != null) {
                    Map map = h82Var.f39071c;
                    if (map == null || (strC = u01.c(map, v11.B)) == null || !Boolean.parseBoolean(strC)) {
                        strA = null;
                    }
                    return new hc3(cc3VarA, strA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public lc3(qm3 qm3Var, hd3 hd3Var) {
        this.f40499a = qm3Var;
        this.f40500b = hd3Var;
    }
}
