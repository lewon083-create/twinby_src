package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.protocol.Mechanism;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum u extends a0 {
    public u() {
        super("InHeadNoscript", 4);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (kv0Var.g()) {
            bVar.e(this);
            return true;
        }
        if (kv0Var.k() && ((k0) kv0Var).f35452e.equals("html")) {
            bVar.f35366f = kv0Var;
            return a0.f35339h.c(kv0Var, bVar);
        }
        boolean zJ = kv0Var.j();
        t tVar = a0.f35336e;
        if (zJ && ((j0) kv0Var).f35452e.equals("noscript")) {
            bVar.v();
            bVar.f35370k = tVar;
            return true;
        }
        if (a0.a(kv0Var) || kv0Var.e() || (kv0Var.k() && tl.a.a(((k0) kv0Var).f35452e, "basefont", "bgsound", "link", Mechanism.JsonKeys.META, "noframes", "style"))) {
            bVar.f35366f = kv0Var;
            return tVar.c(kv0Var, bVar);
        }
        if (kv0Var.j() && ((j0) kv0Var).f35452e.equals("br")) {
            bVar.e(this);
            f0 f0Var = new f0();
            f0Var.f35444d = kv0Var.toString();
            bVar.o(f0Var);
            return true;
        }
        if ((kv0Var.k() && tl.a.a(((k0) kv0Var).f35452e, "head", "noscript")) || kv0Var.j()) {
            bVar.e(this);
            return false;
        }
        bVar.e(this);
        f0 f0Var2 = new f0();
        f0Var2.f35444d = kv0Var.toString();
        bVar.o(f0Var2);
        return true;
    }
}
