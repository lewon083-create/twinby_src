package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum d extends a0 {
    public d() {
        super("InCaption", 10);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (kv0Var.j()) {
            j0 j0Var = (j0) kv0Var;
            if (j0Var.f35452e.equals("caption")) {
                if (!bVar.m(j0Var.f35452e)) {
                    bVar.e(this);
                    return false;
                }
                if (!pe.a.t(bVar, "caption")) {
                    bVar.e(this);
                }
                bVar.w("caption");
                bVar.b();
                bVar.f35370k = a0.f35340j;
                return true;
            }
        }
        if ((kv0Var.k() && tl.a.a(((k0) kv0Var).f35452e, "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (kv0Var.j() && ((j0) kv0Var).f35452e.equals("table"))) {
            bVar.e(this);
            if (bVar.z("caption")) {
                return bVar.x(kv0Var);
            }
            return true;
        }
        if (kv0Var.j() && tl.a.a(((j0) kv0Var).f35452e, SentryLogEvent.JsonKeys.BODY, "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
            bVar.e(this);
            return false;
        }
        bVar.f35366f = kv0Var;
        return a0.f35339h.c(kv0Var, bVar);
    }
}
