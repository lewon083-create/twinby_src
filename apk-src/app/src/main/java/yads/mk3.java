package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mk3 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f40935a;

    public mk3(View view) {
        this.f40935a = view;
    }

    @Override // yads.fv
    public final void a(kf1 kf1Var, hv hvVar) {
        Context context = this.f40935a.getContext();
        n12 n12Var = hvVar.f39336c;
        iv ivVar = n12Var.f41133a;
        oi oiVar = hvVar.f39334a;
        y3 y3Var = hvVar.f39335b;
        mn2 mn2Var = hvVar.f39337d;
        kx0 kx0Var = hvVar.f39338e;
        ivVar.getClass();
        l12 l12Var = new l12(new ou(context, new vz1(kx0Var, mn2Var, y3Var, n12Var, oiVar, kf1Var)), e02.a());
        this.f40935a.setOnTouchListener(l12Var);
        this.f40935a.setOnClickListener(l12Var);
    }
}
