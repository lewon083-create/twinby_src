package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum y extends a0 {
    public y() {
        super("InTable", 8);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (kv0Var.f7316c == 5) {
            bVar.f35376q = new ArrayList();
            bVar.f35371l = bVar.f35370k;
            bVar.f35370k = a0.f35341k;
            return bVar.x(kv0Var);
        }
        if (kv0Var.e()) {
            bVar.p((g0) kv0Var);
            return true;
        }
        if (kv0Var.g()) {
            bVar.e(this);
            return false;
        }
        if (kv0Var.k()) {
            k0 k0Var = (k0) kv0Var;
            String str = k0Var.f35452e;
            if (str.equals("caption")) {
                bVar.c("table");
                bVar.f35375p.add(null);
                bVar.n(k0Var);
                bVar.f35370k = a0.f35342l;
                return true;
            }
            if (str.equals("colgroup")) {
                bVar.c("table");
                bVar.n(k0Var);
                bVar.f35370k = a0.f35343m;
                return true;
            }
            if (str.equals("col")) {
                bVar.A("colgroup");
                return bVar.x(kv0Var);
            }
            if (tl.a.a(str, "tbody", "tfoot", "thead")) {
                bVar.c("table");
                bVar.n(k0Var);
                bVar.f35370k = a0.f35344n;
                return true;
            }
            if (tl.a.a(str, "td", "th", "tr")) {
                bVar.A("tbody");
                return bVar.x(kv0Var);
            }
            if (!str.equals("table")) {
                if (tl.a.a(str, "style", "script")) {
                    bVar.f35366f = kv0Var;
                    return a0.f35336e.c(kv0Var, bVar);
                }
                if (str.equals("input")) {
                    if (!k0Var.f35458l.f("type").equalsIgnoreCase("hidden")) {
                        return d(kv0Var, bVar);
                    }
                    bVar.q(k0Var);
                    return true;
                }
                if (!str.equals("form")) {
                    return d(kv0Var, bVar);
                }
                bVar.e(this);
                if (bVar.f35374o != null) {
                    return false;
                }
                bVar.r(k0Var, false);
                return true;
            }
            bVar.e(this);
            if (bVar.z("table")) {
                return bVar.x(kv0Var);
            }
        } else {
            if (kv0Var.j()) {
                String str2 = ((j0) kv0Var).f35452e;
                if (!str2.equals("table")) {
                    if (!tl.a.a(str2, SentryLogEvent.JsonKeys.BODY, "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                        return d(kv0Var, bVar);
                    }
                    bVar.e(this);
                    return false;
                }
                if (!bVar.m(str2)) {
                    bVar.e(this);
                    return false;
                }
                bVar.w("table");
                bVar.F();
                return true;
            }
            if (!kv0Var.i()) {
                return d(kv0Var, bVar);
            }
            if (pe.a.t(bVar, "html")) {
                bVar.e(this);
            }
        }
        return true;
    }

    public final boolean d(kv0 kv0Var, b bVar) {
        bVar.e(this);
        boolean zA = tl.a.a(bVar.d().o(), "table", "tbody", "tfoot", "thead", "tr");
        w wVar = a0.f35339h;
        if (!zA) {
            bVar.f35366f = kv0Var;
            return wVar.c(kv0Var, bVar);
        }
        bVar.f35379t = true;
        bVar.f35366f = kv0Var;
        boolean zC = wVar.c(kv0Var, bVar);
        bVar.f35379t = false;
        return zC;
    }
}
