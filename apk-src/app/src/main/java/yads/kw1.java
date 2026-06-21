package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kw1 extends kk3 {
    public kw1(iw1 iw1Var) {
        super(iw1Var);
    }

    @Override // yads.kk3
    public final void a(oi oiVar, nk3 nk3Var, Object obj) {
        iw1 iw1Var = (iw1) b();
        if (iw1Var == null) {
            return;
        }
        nk3Var.a(iw1Var, oiVar);
        nk3Var.a(oiVar, new uv1(iw1Var));
    }

    @Override // yads.kk3
    public final void b(View view, Object obj) {
        iw1 iw1Var = (iw1) view;
        qj1 qj1Var = (qj1) obj;
        String str = qj1Var.f42323a;
        if (str != null && str.length() > 0) {
            iw1Var.setAspectRatio(qj1Var.f42324b);
            iw1Var.a(str, (hw1) null);
        }
    }

    @Override // yads.kk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
