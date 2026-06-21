package yads;

import android.content.Context;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j12 implements gq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm3 f39696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c42 f39697b;

    public /* synthetic */ j12(Context context, ct1 ct1Var) {
        this(g82.a(), new c42(context, ct1Var));
    }

    @Override // yads.gq2
    public final Object a(h82 h82Var) {
        qm3 qm3Var = this.f39696a;
        qm3Var.f42340a.getClass();
        int i = h82Var.f39069a;
        zp2 zp2Var = new zp2(h82Var.f39070b);
        Map mapD = h82Var.f39071c;
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        String strA = ((k82) qm3Var.f42341b).a(new yp2(i, zp2Var, mapD));
        if (strA == null || strA.length() == 0) {
            return null;
        }
        Map mapD2 = h82Var.f39071c;
        if (mapD2 == null) {
            mapD2 = kotlin.collections.j0.d();
        }
        try {
            return this.f39697b.a(strA, new kn(mapD2));
        } catch (JSONException e3) {
            ij.d.b(e3);
            return null;
        } catch (b12 e7) {
            ij.d.b(e7);
            return null;
        }
    }

    public j12(qm3 qm3Var, c42 c42Var) {
        this.f39696a = qm3Var;
        this.f39697b = c42Var;
    }
}
