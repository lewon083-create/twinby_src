package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Mechanism;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum v extends a0 {
    public v() {
        super("AfterHead", 5);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (a0.a(kv0Var)) {
            bVar.o((f0) kv0Var);
        } else if (kv0Var.e()) {
            bVar.p((g0) kv0Var);
        } else if (kv0Var.g()) {
            bVar.e(this);
        } else if (kv0Var.k()) {
            k0 k0Var = (k0) kv0Var;
            String str = k0Var.f35452e;
            boolean zEquals = str.equals("html");
            w wVar = a0.f35339h;
            if (zEquals) {
                bVar.f35366f = kv0Var;
                return wVar.c(kv0Var, bVar);
            }
            if (str.equals(SentryLogEvent.JsonKeys.BODY)) {
                bVar.n(k0Var);
                bVar.f35378s = false;
                bVar.f35370k = wVar;
            } else if (str.equals("frameset")) {
                bVar.n(k0Var);
                bVar.f35370k = a0.f35350t;
            } else if (tl.a.a(str, "base", "basefont", "bgsound", "link", Mechanism.JsonKeys.META, "noframes", "script", "style", "title")) {
                bVar.e(this);
                vl.k kVar = bVar.f35373n;
                bVar.f35364d.add(kVar);
                bVar.y(kv0Var, a0.f35336e);
                bVar.E(kVar);
            } else {
                if (str.equals("head")) {
                    bVar.e(this);
                    return false;
                }
                bVar.A(SentryLogEvent.JsonKeys.BODY);
                bVar.f35378s = true;
                bVar.x(kv0Var);
            }
        } else {
            if (kv0Var.j() && !tl.a.a(((j0) kv0Var).f35452e, SentryLogEvent.JsonKeys.BODY, "html")) {
                bVar.e(this);
                return false;
            }
            bVar.A(SentryLogEvent.JsonKeys.BODY);
            bVar.f35378s = true;
            bVar.x(kv0Var);
        }
        return true;
    }
}
