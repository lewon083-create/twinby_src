package wl;

import com.google.android.gms.internal.ads.kv0;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Mechanism;
import io.sentry.rrweb.RRWebMetaEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum t extends a0 {
    public t() {
        super("InHead", 3);
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
            return false;
        }
        if (iM != 1) {
            if (iM != 2) {
                if (iM != 3) {
                    bVar.z("head");
                    return bVar.x(kv0Var);
                }
                bVar.p((g0) kv0Var);
                return true;
            }
            String str = ((j0) kv0Var).f35452e;
            if (str.equals("head")) {
                bVar.v();
                bVar.f35370k = a0.f35338g;
                return true;
            }
            if (tl.a.a(str, SentryLogEvent.JsonKeys.BODY, "html", "br")) {
                bVar.z("head");
                return bVar.x(kv0Var);
            }
            bVar.e(this);
            return false;
        }
        k0 k0Var = (k0) kv0Var;
        String str2 = k0Var.f35452e;
        if (str2.equals("html")) {
            return a0.f35339h.c(kv0Var, bVar);
        }
        if (tl.a.a(str2, "base", "basefont", "bgsound", "command", "link")) {
            vl.k kVarQ = bVar.q(k0Var);
            if (str2.equals("base") && kVarQ.k(RRWebMetaEvent.JsonKeys.HREF) && !bVar.f35372m) {
                String strA = kVarQ.a(RRWebMetaEvent.JsonKeys.HREF);
                if (strA.length() != 0) {
                    bVar.f35365e = strA;
                    bVar.f35372m = true;
                    vl.h hVar = bVar.f35363c;
                    hVar.getClass();
                    vl.p pVarN = hVar;
                    int i = 0;
                    while (pVarN != null) {
                        pVarN.i(strA);
                        if (pVarN.f() > 0) {
                            pVarN = (vl.p) pVarN.j().get(0);
                            i++;
                        } else {
                            while (pVarN.n() == null && i > 0) {
                                pVarN = pVarN.f34939b;
                                i--;
                            }
                            if (pVarN == hVar) {
                                break;
                            }
                            pVarN = pVarN.n();
                        }
                    }
                }
            }
            return true;
        }
        if (str2.equals(Mechanism.JsonKeys.META)) {
            bVar.q(k0Var);
            return true;
        }
        boolean zEquals = str2.equals("title");
        x xVar = a0.i;
        if (zEquals) {
            bVar.f35362b.f35463c = c3.f35390d;
            bVar.f35371l = bVar.f35370k;
            bVar.f35370k = xVar;
            bVar.n(k0Var);
            return true;
        }
        if (tl.a.a(str2, "noframes", "style")) {
            a0.b(k0Var, bVar);
            return true;
        }
        if (str2.equals("noscript")) {
            bVar.n(k0Var);
            bVar.f35370k = a0.f35337f;
            return true;
        }
        if (!str2.equals("script")) {
            if (str2.equals("head")) {
                bVar.e(this);
                return false;
            }
            bVar.z("head");
            return bVar.x(kv0Var);
        }
        bVar.f35362b.f35463c = c3.f35396g;
        bVar.f35371l = bVar.f35370k;
        bVar.f35370k = xVar;
        bVar.n(k0Var);
        return true;
    }
}
