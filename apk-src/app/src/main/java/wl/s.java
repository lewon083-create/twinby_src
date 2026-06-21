package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum s extends a0 {
    public s() {
        super("BeforeHead", 2);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (a0.a(kv0Var)) {
            return true;
        }
        if (kv0Var.e()) {
            bVar.p((g0) kv0Var);
            return true;
        }
        if (kv0Var.g()) {
            bVar.e(this);
            return false;
        }
        if (kv0Var.k() && ((k0) kv0Var).f35452e.equals("html")) {
            return a0.f35339h.c(kv0Var, bVar);
        }
        if (kv0Var.k()) {
            k0 k0Var = (k0) kv0Var;
            if (k0Var.f35452e.equals("head")) {
                bVar.f35373n = bVar.n(k0Var);
                bVar.f35370k = a0.f35336e;
                return true;
            }
        }
        if (kv0Var.j() && tl.a.a(((j0) kv0Var).f35452e, "head", SentryLogEvent.JsonKeys.BODY, "html", "br")) {
            bVar.A("head");
            return bVar.x(kv0Var);
        }
        if (kv0Var.j()) {
            bVar.e(this);
            return false;
        }
        bVar.A("head");
        return bVar.x(kv0Var);
    }
}
