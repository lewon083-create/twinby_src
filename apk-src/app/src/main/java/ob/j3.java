package ob;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.m6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(Object obj, t1 t1Var, int i) {
        super(t1Var);
        this.f30211e = i;
        this.f30212f = obj;
    }

    @Override // ob.o
    public final void a() {
        switch (this.f30211e) {
            case 0:
                m6 m6Var = (m6) this.f30212f;
                k3 k3Var = (k3) m6Var.f7791e;
                k3Var.C();
                l1 l1Var = (l1) k3Var.f15951b;
                l1Var.f30269l.getClass();
                m6Var.c(SystemClock.elapsedRealtime(), false, false);
                x xVar = l1Var.f30272o;
                l1.f(xVar);
                l1Var.f30269l.getClass();
                xVar.F(SystemClock.elapsedRealtime());
                break;
            case 1:
                p3 p3Var = (p3) this.f30212f;
                p3Var.G();
                s0 s0Var = ((l1) p3Var.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30418o.f("Starting upload from DelayedRunnable");
                p3Var.f30373c.q();
                break;
            default:
                z3 z3Var = (z3) this.f30212f;
                z3Var.e().C();
                String str = (String) z3Var.f30620r.pollFirst();
                if (str != null) {
                    z3Var.o().getClass();
                    z3Var.J = SystemClock.elapsedRealtime();
                    z3Var.b().f30418o.g(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = z3Var.f30615m.f30260b;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                z3Var.H();
                break;
        }
    }
}
