package yads;

import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kb {
    public static List a(y90 y90Var) {
        jj.e eVarB = kotlin.collections.r.b();
        eVarB.add(v90.f43955a);
        eVarB.add(new w90("Info"));
        if (y90Var.f() == c50.f37291c && y90Var.a() != null) {
            String strD = y90Var.d();
            eVarB.add(new x90((strD == null || StringsKt.D(strD)) ? "ID" : y90Var.d(), y90Var.a()));
        }
        eVarB.add(new x90("Type", y90Var.f().a()));
        List<d80> listE = y90Var.e();
        if (listE != null) {
            for (d80 d80Var : listE) {
                eVarB.add(new x90(d80Var.a(), d80Var.b()));
            }
        }
        List listB = y90Var.b();
        if (listB != null && !listB.isEmpty()) {
            eVarB.add(v90.f43955a);
            eVarB.add(new w90("CPM floors"));
            String strD2 = y90Var.d();
            String strX = (strD2 == null || StringsKt.D(strD2)) ? "" : com.google.android.gms.internal.ads.om1.x(y90Var.d(), ": ");
            for (ha0 ha0Var : y90Var.b()) {
                eVarB.add(new x90(com.google.android.gms.internal.ads.om1.x(strX, ha0Var.b()), "cpm: " + ha0Var.a()));
            }
        }
        return kotlin.collections.r.a(eVarB);
    }
}
