package fj;

import android.os.Build;
import android.view.View;
import g2.f1;
import g2.g1;
import g2.h1;
import g2.i1;
import g2.j1;
import g2.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0 implements g2.q, m3.k, zc.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19399c;

    public /* synthetic */ o0(int i, int i10) {
        this.f19398b = i10;
        this.f19399c = i;
    }

    @Override // zc.e
    public Object apply(Object obj) {
        return Integer.valueOf(this.f19399c);
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f19398b) {
            case 1:
                ((j3.h0) obj).b(this.f19399c);
                break;
            case 2:
                ((j3.h0) obj).n(this.f19399c);
                break;
            default:
                t3.i iVar = (t3.i) obj;
                iVar.getClass();
                int i = this.f19399c;
                if (i == 1) {
                    iVar.f33460v = true;
                }
                iVar.f33450l = i;
                break;
        }
    }

    @Override // g2.q
    public x1 l(View view, x1 x1Var) {
        int i = Build.VERSION.SDK_INT;
        j1 i1Var = i >= 36 ? new i1(x1Var) : i >= 35 ? new h1(x1Var) : i >= 34 ? new g1(x1Var) : i >= 31 ? new f1(x1Var) : i >= 30 ? new g2.e1(x1Var) : i >= 29 ? new g2.d1(x1Var) : new g2.c1(x1Var);
        i1Var.d(this.f19399c, x1.b.f35688e);
        return i1Var.b();
    }

    public /* synthetic */ o0(t3.a aVar, int i, j3.i0 i0Var, j3.i0 i0Var2) {
        this.f19398b = 4;
        this.f19399c = i;
    }
}
