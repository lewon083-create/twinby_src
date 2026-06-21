package k6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f27176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.b f27177b;

    public s1(r1 r1Var) {
        this.f27176a = r1Var;
        k5.b bVar = new k5.b();
        bVar.f26897a = 0;
        this.f27177b = bVar;
    }

    public final View a(int i, int i10, int i11, int i12) {
        r1 r1Var = this.f27176a;
        int iG = r1Var.g();
        int iO = r1Var.o();
        int i13 = i10 > i ? 1 : -1;
        View view = null;
        while (i != i10) {
            View viewR = r1Var.r(i);
            int iB = r1Var.b(viewR);
            int iS = r1Var.s(viewR);
            k5.b bVar = this.f27177b;
            bVar.f26898b = iG;
            bVar.f26899c = iO;
            bVar.f26900d = iB;
            bVar.f26901e = iS;
            if (i11 != 0) {
                bVar.f26897a = i11;
                if (bVar.a()) {
                    return viewR;
                }
            }
            if (i12 != 0) {
                bVar.f26897a = i12;
                if (bVar.a()) {
                    view = viewR;
                }
            }
            i += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        r1 r1Var = this.f27176a;
        int iG = r1Var.g();
        int iO = r1Var.o();
        int iB = r1Var.b(view);
        int iS = r1Var.s(view);
        k5.b bVar = this.f27177b;
        bVar.f26898b = iG;
        bVar.f26899c = iO;
        bVar.f26900d = iB;
        bVar.f26901e = iS;
        bVar.f26897a = 24579;
        return bVar.a();
    }
}
