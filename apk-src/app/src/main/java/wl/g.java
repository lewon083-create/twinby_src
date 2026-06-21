package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum g extends a0 {
    public g() {
        super("InRow", 13);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        boolean zK = kv0Var.k();
        y yVar = a0.f35340j;
        if (zK) {
            k0 k0Var = (k0) kv0Var;
            String str = k0Var.f35452e;
            if (str.equals("template")) {
                bVar.n(k0Var);
                return true;
            }
            if (tl.a.a(str, "th", "td")) {
                bVar.c("tr", "template");
                bVar.n(k0Var);
                bVar.f35370k = a0.f35346p;
                bVar.f35375p.add(null);
                return true;
            }
            if (!tl.a.a(str, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr")) {
                bVar.f35366f = kv0Var;
                return yVar.c(kv0Var, bVar);
            }
            if (bVar.z("tr")) {
                return bVar.x(kv0Var);
            }
            return false;
        }
        if (!kv0Var.j()) {
            bVar.f35366f = kv0Var;
            return yVar.c(kv0Var, bVar);
        }
        String str2 = ((j0) kv0Var).f35452e;
        if (str2.equals("tr")) {
            if (!bVar.m(str2)) {
                bVar.e(this);
                return false;
            }
            bVar.c("tr", "template");
            bVar.v();
            bVar.f35370k = a0.f35344n;
            return true;
        }
        if (str2.equals("table")) {
            if (bVar.z("tr")) {
                return bVar.x(kv0Var);
            }
            return false;
        }
        if (tl.a.a(str2, "tbody", "tfoot", "thead")) {
            if (bVar.m(str2)) {
                bVar.z("tr");
                return bVar.x(kv0Var);
            }
            bVar.e(this);
            return false;
        }
        if (tl.a.a(str2, SentryLogEvent.JsonKeys.BODY, "caption", "col", "colgroup", "html", "td", "th")) {
            bVar.e(this);
            return false;
        }
        bVar.f35366f = kv0Var;
        return yVar.c(kv0Var, bVar);
    }
}
