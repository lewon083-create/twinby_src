package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum f extends a0 {
    public f() {
        super("InTableBody", 12);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        int iM = t.z.m(kv0Var.f7316c);
        y yVar = a0.f35340j;
        if (iM == 1) {
            k0 k0Var = (k0) kv0Var;
            String str = k0Var.f35452e;
            if (str.equals("template")) {
                bVar.n(k0Var);
                return true;
            }
            if (str.equals("tr")) {
                bVar.c("tbody", "tfoot", "thead", "template");
                bVar.n(k0Var);
                bVar.f35370k = a0.f35345o;
                return true;
            }
            if (tl.a.a(str, "th", "td")) {
                bVar.e(this);
                bVar.A("tr");
                return bVar.x(k0Var);
            }
            if (tl.a.a(str, "caption", "col", "colgroup", "tbody", "tfoot", "thead")) {
                return d(kv0Var, bVar);
            }
            bVar.f35366f = kv0Var;
            return yVar.c(kv0Var, bVar);
        }
        if (iM != 2) {
            bVar.f35366f = kv0Var;
            return yVar.c(kv0Var, bVar);
        }
        String str2 = ((j0) kv0Var).f35452e;
        if (tl.a.a(str2, "tbody", "tfoot", "thead")) {
            if (!bVar.m(str2)) {
                bVar.e(this);
                return false;
            }
            bVar.c("tbody", "tfoot", "thead", "template");
            bVar.v();
            bVar.f35370k = yVar;
            return true;
        }
        if (str2.equals("table")) {
            return d(kv0Var, bVar);
        }
        if (tl.a.a(str2, SentryLogEvent.JsonKeys.BODY, "caption", "col", "colgroup", "html", "td", "th", "tr")) {
            bVar.e(this);
            return false;
        }
        bVar.f35366f = kv0Var;
        return yVar.c(kv0Var, bVar);
    }

    public final boolean d(kv0 kv0Var, b bVar) {
        if (!bVar.m("tbody") && !bVar.m("thead") && !bVar.j("tfoot")) {
            bVar.e(this);
            return false;
        }
        bVar.c("tbody", "tfoot", "thead", "template");
        bVar.z(bVar.d().o());
        return bVar.x(kv0Var);
    }
}
