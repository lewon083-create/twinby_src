package aa;

import android.os.Binder;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.dg0;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.i81;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.ku;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.og0;
import com.google.android.gms.internal.ads.r81;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.wf0;
import com.google.android.gms.internal.ads.z7;
import com.google.android.gms.internal.ads.z71;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7 f698b;

    public r(gx gxVar, z7 z7Var) {
        this.f697a = gxVar;
        this.f698b = z7Var;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        ed.d dVarB;
        ku kuVar = (ku) obj;
        String str = kuVar.f7300e;
        t9.g0 g0Var = p9.k.C.f31297c;
        boolean zF = t9.g0.f(str);
        z7 z7Var = this.f698b;
        if (zF) {
            dVarB = vv.y(new og0(1));
        } else {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.m8)).booleanValue() || ((Boolean) lm.f7574a.r()).booleanValue()) {
                dVarB = ((gx) ((r81) z7Var.f12903e)).b(new je(6, z7Var, kuVar));
            } else {
                dVarB = ((dg0) z7Var.f12904f).c(kuVar);
            }
        }
        return vv.J(vv.H((i81) vv.I(i81.s(dVarB), ((Integer) q9.s.f31967e.f31970c.a(al.f3210t6)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) z7Var.f12901c), Throwable.class, new wf0(z7Var, kuVar, Binder.getCallingUid(), 1), (r81) z7Var.f12902d), new f(2, kuVar), this.f697a);
    }
}
