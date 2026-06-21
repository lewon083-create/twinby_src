package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum h extends a0 {
    public h() {
        super("InCell", 14);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        boolean zJ = kv0Var.j();
        w wVar = a0.f35339h;
        if (!zJ) {
            if (!kv0Var.k() || !tl.a.a(((k0) kv0Var).f35452e, "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                bVar.f35366f = kv0Var;
                return wVar.c(kv0Var, bVar);
            }
            if (!bVar.m("td") && !bVar.m("th")) {
                bVar.e(this);
                return false;
            }
            if (bVar.m("td")) {
                bVar.z("td");
            } else {
                bVar.z("th");
            }
            return bVar.x(kv0Var);
        }
        String str = ((j0) kv0Var).f35452e;
        if (tl.a.a(str, "td", "th")) {
            boolean zM = bVar.m(str);
            g gVar = a0.f35345o;
            if (!zM) {
                bVar.e(this);
                bVar.f35370k = gVar;
                return false;
            }
            if (!pe.a.t(bVar, str)) {
                bVar.e(this);
            }
            bVar.w(str);
            bVar.b();
            bVar.f35370k = gVar;
            return true;
        }
        if (tl.a.a(str, SentryLogEvent.JsonKeys.BODY, "caption", "col", "colgroup", "html")) {
            bVar.e(this);
            return false;
        }
        if (!tl.a.a(str, "table", "tbody", "tfoot", "thead", "tr")) {
            bVar.f35366f = kv0Var;
            return wVar.c(kv0Var, bVar);
        }
        if (!bVar.m(str)) {
            bVar.e(this);
            return false;
        }
        if (bVar.m("td")) {
            bVar.z("td");
        } else {
            bVar.z("th");
        }
        return bVar.x(kv0Var);
    }
}
