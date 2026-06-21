package wl;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum o0 extends c3 {
    public o0() {
        super("RcdataLessthanSign", 10);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (aVar.m('/')) {
            m0Var.e();
            m0Var.a(c3.f35406m);
            return;
        }
        if (aVar.o() && m0Var.f35474o != null) {
            String str = "</" + m0Var.f35474o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                l0 l0VarD = m0Var.d(false);
                l0VarD.x(m0Var.f35474o);
                m0Var.i = l0VarD;
                m0Var.k();
                aVar.q();
                m0Var.f35463c = c3.f35386b;
                return;
            }
        }
        m0Var.h("<");
        m0Var.f35463c = c3.f35390d;
    }
}
