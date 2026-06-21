package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum i extends a0 {
    public i() {
        super("InSelect", 15);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        String str;
        int iM = t.z.m(kv0Var.f7316c);
        if (iM == 0) {
            bVar.e(this);
            return false;
        }
        if (iM == 1) {
            k0 k0Var = (k0) kv0Var;
            String str2 = k0Var.f35452e;
            if (str2.equals("html")) {
                bVar.f35366f = k0Var;
                return a0.f35339h.c(k0Var, bVar);
            }
            if (str2.equals("option")) {
                if (pe.a.t(bVar, "option")) {
                    bVar.z("option");
                }
                bVar.n(k0Var);
                return true;
            }
            if (str2.equals("optgroup")) {
                if (pe.a.t(bVar, "option")) {
                    bVar.z("option");
                } else if (pe.a.t(bVar, "optgroup")) {
                    bVar.z("optgroup");
                }
                bVar.n(k0Var);
                return true;
            }
            if (str2.equals("select")) {
                bVar.e(this);
                return bVar.z("select");
            }
            if (tl.a.a(str2, "input", "keygen", "textarea")) {
                bVar.e(this);
                if (!bVar.k("select")) {
                    return false;
                }
                bVar.z("select");
                return bVar.x(k0Var);
            }
            if (str2.equals("script")) {
                bVar.f35366f = kv0Var;
                return a0.f35336e.c(kv0Var, bVar);
            }
            bVar.e(this);
            return false;
        }
        if (iM != 2) {
            if (iM == 3) {
                bVar.p((g0) kv0Var);
                return true;
            }
            if (iM != 4) {
                if (iM != 5) {
                    bVar.e(this);
                    return false;
                }
                if (!pe.a.t(bVar, "html")) {
                    bVar.e(this);
                }
                return true;
            }
            f0 f0Var = (f0) kv0Var;
            if (f0Var.f35444d.equals(a0.f35354x)) {
                bVar.e(this);
                return false;
            }
            bVar.o(f0Var);
            return true;
        }
        str = ((j0) kv0Var).f35452e;
        str.getClass();
        switch (str) {
            case "option":
                if (pe.a.t(bVar, "option")) {
                    bVar.v();
                    return true;
                }
                bVar.e(this);
                return true;
            case "select":
                if (!bVar.k(str)) {
                    bVar.e(this);
                    return false;
                }
                bVar.w(str);
                bVar.F();
                return true;
            case "optgroup":
                if (pe.a.t(bVar, "option") && bVar.a(bVar.d()) != null && bVar.a(bVar.d()).o().equals("optgroup")) {
                    bVar.z("option");
                }
                if (pe.a.t(bVar, "optgroup")) {
                    bVar.v();
                    return true;
                }
                bVar.e(this);
                return true;
            default:
                bVar.e(this);
                return false;
        }
    }
}
