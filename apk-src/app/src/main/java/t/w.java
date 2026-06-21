package t;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements k0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f33310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f33311d;

    public /* synthetic */ w(c0 c0Var, h1 h1Var, int i) {
        this.f33309b = i;
        this.f33311d = c0Var;
        this.f33310c = h1Var;
    }

    @Override // k0.c
    public final void onFailure(Throwable th2) {
        switch (this.f33309b) {
            case 0:
                break;
            default:
                g0.h2 h2Var = null;
                if (th2 instanceof g0.z0) {
                    c0 c0Var = this.f33311d;
                    g0.a1 a1Var = ((g0.z0) th2).f19811b;
                    Iterator it = c0Var.f32967b.C().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            g0.h2 h2Var2 = (g0.h2) it.next();
                            if (h2Var2.b().contains(a1Var)) {
                                h2Var = h2Var2;
                            }
                        }
                    }
                    if (h2Var != null) {
                        c0 c0Var2 = this.f33311d;
                        j0.d dVarS = hl.d.s();
                        g0.f2 f2Var = h2Var.f19588f;
                        if (f2Var != null) {
                            c0Var2.v("Posting surface closed", new Throwable());
                            dVarS.execute(new m3.c0(27, f2Var, h2Var));
                        }
                    }
                } else if (!(th2 instanceof CancellationException)) {
                    if (this.f33311d.M == 10) {
                        this.f33311d.G(10, new a0.g(th2, 4), true);
                    }
                    com.google.android.gms.internal.auth.g.l("Camera2CameraImpl", "Unable to configure camera " + this.f33311d, th2);
                    c0 c0Var3 = this.f33311d;
                    if (c0Var3.f32977m == this.f33310c) {
                        c0Var3.E();
                    }
                } else {
                    this.f33311d.v("Unable to configure camera cancelled", null);
                }
                break;
        }
    }

    @Override // k0.c
    public final void onSuccess(Object obj) {
        switch (this.f33309b) {
            case 0:
                this.f33311d.f32981q.remove(this.f33310c);
                int iM = z.m(this.f33311d.M);
                if (iM != 1 && iM != 5) {
                    if (iM == 6 || (iM == 7 && this.f33311d.f32976l != 0)) {
                        this.f33311d.v("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    }
                }
                if (this.f33311d.f32981q.isEmpty()) {
                    c0 c0Var = this.f33311d;
                    if (c0Var.f32975k != null) {
                        c0Var.v("closing camera", null);
                        this.f33311d.f32975k.close();
                        this.f33311d.f32975k = null;
                    }
                }
                break;
            default:
                if (this.f33311d.f32984t.b() == 2 && this.f33311d.M == 10) {
                    this.f33311d.F(11);
                    break;
                }
                break;
        }
    }

    private final void a(Throwable th2) {
    }
}
