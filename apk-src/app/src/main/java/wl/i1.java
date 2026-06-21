package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum i1 extends c3 {
    public i1() {
        super("CharacterReferenceInData", 1);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        int[] iArrC = m0Var.c(null, false);
        if (iArrC == null) {
            m0Var.f('&');
        } else {
            m0Var.h(new String(iArrC, 0, iArrC.length));
        }
        m0Var.f35463c = c3.f35386b;
    }
}
