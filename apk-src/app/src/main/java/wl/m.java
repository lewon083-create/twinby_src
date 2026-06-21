package wl;

import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum m extends a0 {
    public m() {
        super("Initial", 0);
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
        boolean zG = kv0Var.g();
        r rVar = a0.f35334c;
        if (!zG) {
            bVar.f35370k = rVar;
            return bVar.x(kv0Var);
        }
        h0 h0Var = (h0) kv0Var;
        c0 c0Var = bVar.f35368h;
        String string = h0Var.f35446d.toString();
        c0Var.getClass();
        String strTrim = string.trim();
        if (!c0Var.f35383a) {
            strTrim = d4.p(strTrim);
        }
        String string2 = h0Var.f35448f.toString();
        String string3 = h0Var.f35449g.toString();
        vl.i iVar = new vl.i();
        k3.f.v(strTrim);
        k3.f.v(string2);
        k3.f.v(string3);
        iVar.c("name", strTrim);
        iVar.c("publicId", string2);
        if (iVar.v("publicId")) {
            iVar.c("pubSysKey", "PUBLIC");
        }
        iVar.c("systemId", string3);
        String str = h0Var.f35447e;
        if (str != null) {
            iVar.c("pubSysKey", str);
        }
        bVar.f35363c.t(iVar);
        if (h0Var.f35450h) {
            bVar.f35363c.f34920k = 2;
        }
        bVar.f35370k = rVar;
        return true;
    }
}
