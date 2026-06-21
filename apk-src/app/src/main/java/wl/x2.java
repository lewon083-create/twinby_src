package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum x2 extends c3 {
    public x2() {
        super("CdataSection", 66);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        String strC;
        int iP = aVar.p("]]>");
        String[] strArr = aVar.f35332h;
        char[] cArr = aVar.f35325a;
        if (iP != -1) {
            strC = a.c(cArr, strArr, aVar.f35329e, iP);
            aVar.f35329e += iP;
        } else {
            aVar.b();
            int i = aVar.f35329e;
            strC = a.c(cArr, strArr, i, aVar.f35327c - i);
            aVar.f35329e = aVar.f35327c;
        }
        m0Var.f35468h.append(strC);
        if (aVar.k("]]>") || aVar.j()) {
            String string = m0Var.f35468h.toString();
            e0 e0Var = new e0();
            e0Var.f35444d = string;
            m0Var.g(e0Var);
            m0Var.f35463c = c3.f35386b;
        }
    }
}
