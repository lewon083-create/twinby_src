package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum n extends a0 {
    public n() {
        super("AfterFrameset", 19);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (a0.a(kv0Var)) {
            bVar.o((f0) kv0Var);
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
            bVar.f35366f = kv0Var;
            return a0.f35339h.c(kv0Var, bVar);
        }
        if (kv0Var.j() && ((j0) kv0Var).f35452e.equals("html")) {
            bVar.f35370k = a0.f35353w;
            return true;
        }
        if (kv0Var.k() && ((k0) kv0Var).f35452e.equals("noframes")) {
            bVar.f35366f = kv0Var;
            return a0.f35336e.c(kv0Var, bVar);
        }
        if (kv0Var.i()) {
            return true;
        }
        bVar.e(this);
        return false;
    }
}
