package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum r extends a0 {
    public r() {
        super("BeforeHtml", 1);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (kv0Var.g()) {
            bVar.e(this);
            return false;
        }
        if (kv0Var.e()) {
            bVar.p((g0) kv0Var);
            return true;
        }
        if (a0.a(kv0Var)) {
            return true;
        }
        boolean zK = kv0Var.k();
        s sVar = a0.f35335d;
        if (zK) {
            k0 k0Var = (k0) kv0Var;
            if (k0Var.f35452e.equals("html")) {
                bVar.n(k0Var);
                bVar.f35370k = sVar;
                return true;
            }
        }
        if (kv0Var.j() && tl.a.a(((j0) kv0Var).f35452e, "head", SentryLogEvent.JsonKeys.BODY, "html", "br")) {
            vl.k kVar = new vl.k(d0.a("html", bVar.f35368h), bVar.f35365e, null);
            bVar.t(kVar);
            bVar.f35364d.add(kVar);
            bVar.f35370k = sVar;
            return bVar.x(kv0Var);
        }
        if (kv0Var.j()) {
            bVar.e(this);
            return false;
        }
        vl.k kVar2 = new vl.k(d0.a("html", bVar.f35368h), bVar.f35365e, null);
        bVar.t(kVar2);
        bVar.f35364d.add(kVar2);
        bVar.f35370k = sVar;
        return bVar.x(kv0Var);
    }
}
