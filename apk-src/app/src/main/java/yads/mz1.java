package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mz1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f41105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12 f41106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zz1 f41107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jz1 f41108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z30 f41109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oz1 f41110g;

    public mz1(oz1 oz1Var, v9 v9Var, f12 f12Var, zz1 zz1Var, jz1 jz1Var, cq2 cq2Var) {
        this.f41110g = oz1Var;
        this.f41105b = v9Var;
        this.f41106c = f12Var;
        this.f41107d = zz1Var;
        this.f41108e = jz1Var;
        this.f41109f = new a40(oz1Var.f41779e, oz1Var.f41775a, cq2Var.b(v9Var, oz1Var.f41776b)).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            f12 f12Var = this.f41106c;
            if (f12Var == null) {
                this.f41108e.a(h9.f39082c);
                return;
            }
            if (f12Var.f38323a.isEmpty()) {
                this.f41108e.a(h9.f39087h);
                return;
            }
            f12 f12Var2 = this.f41106c;
            v9 v9Var = this.f41105b;
            oz1 oz1Var = this.f41110g;
            ty1 ty1Var = new ty1(v9Var, oz1Var.f41776b, f12Var2);
            jz1 jz1Var = this.f41108e;
            w5 w5Var = oz1Var.f41777c;
            lz1 lz1Var = new lz1(this, jz1Var, w5Var);
            w5Var.a(v5.f43882n, null);
            oz1 oz1Var2 = this.f41110g;
            s42 s42Var = oz1Var2.f41781g;
            Context context = oz1Var2.f41779e;
            d4 d4Var = oz1Var2.f41776b;
            z30 z30Var = this.f41109f;
            jz1 jz1Var2 = this.f41108e;
            s42Var.getClass();
            hk.c0.m(s42Var.f42802a, new t42(jz1Var2), new r42(context, jz1Var2, lz1Var, s42Var, d4Var, ty1Var, z30Var, null), 2);
        } catch (Exception unused) {
            this.f41108e.a(h9.f39082c);
        }
    }
}
