package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum l extends a0 {
    public l() {
        super("InFrameset", 18);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        k0 k0Var;
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
        if (!kv0Var.k()) {
            if (kv0Var.j() && ((j0) kv0Var).f35452e.equals("frameset")) {
                if (pe.a.t(bVar, "html")) {
                    bVar.e(this);
                    return false;
                }
                bVar.v();
                if (!bVar.d().o().equals("frameset")) {
                    bVar.f35370k = a0.f35351u;
                    return true;
                }
            } else {
                if (!kv0Var.i()) {
                    bVar.e(this);
                    return false;
                }
                if (!pe.a.t(bVar, "html")) {
                    bVar.e(this);
                }
            }
            return true;
        }
        k0Var = (k0) kv0Var;
        String str = k0Var.f35452e;
        str.getClass();
        switch (str) {
            case "frameset":
                bVar.n(k0Var);
                break;
            case "html":
                bVar.f35366f = k0Var;
                break;
            case "frame":
                bVar.q(k0Var);
                break;
            case "noframes":
                bVar.f35366f = k0Var;
                break;
            default:
                bVar.e(this);
                break;
        }
        return true;
    }
}
