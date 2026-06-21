package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum j extends a0 {
    public j() {
        super("InSelectInTable", 16);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (kv0Var.k() && tl.a.a(((k0) kv0Var).f35452e, "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
            bVar.e(this);
            bVar.z("select");
            return bVar.x(kv0Var);
        }
        if (kv0Var.j()) {
            j0 j0Var = (j0) kv0Var;
            if (tl.a.a(j0Var.f35452e, "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                bVar.e(this);
                if (!bVar.m(j0Var.f35452e)) {
                    return false;
                }
                bVar.z("select");
                return bVar.x(kv0Var);
            }
        }
        bVar.f35366f = kv0Var;
        return a0.f35347q.c(kv0Var, bVar);
    }
}
