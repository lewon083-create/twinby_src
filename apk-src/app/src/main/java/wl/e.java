package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum e extends a0 {
    public e() {
        super("InColumnGroup", 11);
    }

    public static boolean d(kv0 kv0Var, b bVar) {
        if (bVar.z("colgroup")) {
            return bVar.x(kv0Var);
        }
        return true;
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (a0.a(kv0Var)) {
            bVar.o((f0) kv0Var);
            return true;
        }
        int iM = t.z.m(kv0Var.f7316c);
        if (iM == 0) {
            bVar.e(this);
            return true;
        }
        if (iM == 1) {
            k0 k0Var = (k0) kv0Var;
            String str = k0Var.f35452e;
            str.getClass();
            if (str.equals("col")) {
                bVar.q(k0Var);
                return true;
            }
            if (!str.equals("html")) {
                return d(kv0Var, bVar);
            }
            bVar.f35366f = kv0Var;
            return a0.f35339h.c(kv0Var, bVar);
        }
        if (iM != 2) {
            if (iM == 3) {
                bVar.p((g0) kv0Var);
                return true;
            }
            if (iM != 5) {
                return d(kv0Var, bVar);
            }
            if (pe.a.t(bVar, "html")) {
                return true;
            }
            return d(kv0Var, bVar);
        }
        if (!((j0) kv0Var).f35452e.equals("colgroup")) {
            return d(kv0Var, bVar);
        }
        if (pe.a.t(bVar, "html")) {
            bVar.e(this);
            return false;
        }
        bVar.v();
        bVar.f35370k = a0.f35340j;
        return true;
    }
}
