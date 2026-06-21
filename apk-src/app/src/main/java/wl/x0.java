package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum x0 extends c3 {
    public x0() {
        super("Data", 0);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        int i;
        char c8;
        char cI = aVar.i();
        if (cI == 0) {
            m0Var.m(this);
            m0Var.f(aVar.d());
            return;
        }
        if (cI == '&') {
            m0Var.a(c3.f35388c);
            return;
        }
        if (cI == '<') {
            m0Var.a(c3.i);
            return;
        }
        if (cI == 65535) {
            m0Var.g(new i0());
            return;
        }
        aVar.b();
        int i10 = aVar.f35329e;
        int i11 = aVar.f35327c;
        char[] cArr = aVar.f35325a;
        while (true) {
            i = aVar.f35329e;
            if (i >= i11 || (c8 = cArr[i]) == '&' || c8 == '<' || c8 == 0) {
                break;
            } else {
                aVar.f35329e = i + 1;
            }
        }
        m0Var.h(i > i10 ? a.c(cArr, aVar.f35332h, i10, i - i10) : "");
    }
}
