package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 implements ng0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f3776h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f3777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r81 f3778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq0 f3779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f3780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eh0 f3781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final as0 f3782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f3783g;

    public bg0(Context context, iq0 iq0Var, cw cwVar, r81 r81Var, ScheduledExecutorService scheduledExecutorService, eh0 eh0Var, as0 as0Var) {
        this.f3783g = context;
        this.f3779c = iq0Var;
        this.f3777a = cwVar;
        this.f3778b = r81Var;
        this.f3780d = scheduledExecutorService;
        this.f3781e = eh0Var;
        this.f3782f = as0Var;
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final ed.d c(ku kuVar) {
        ed.d dVarH;
        cw cwVar = this.f3777a;
        r81 r81Var = (r81) cwVar.f4348d;
        String str = kuVar.f7300e;
        t9.g0 g0Var = p9.k.C.f31297c;
        if (t9.g0.f(str)) {
            dVarH = vv.y(new og0(1));
        } else {
            dVarH = vv.H(((gx) ((r81) cwVar.f4347c)).b(new je(5, cwVar, kuVar)), ExecutionException.class, n20.f8154c, r81Var);
        }
        x61 x61VarH = vv.H(dVarH, og0.class, new wf0(cwVar, kuVar, Binder.getCallingUid(), 0), r81Var);
        xr0 xr0VarK = xr0.k(this.f3783g, 11);
        fs1.B(x61VarH, xr0VarK);
        ed.d dVarJ = vv.J(x61VarH, new np(6, this), this.f3778b);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3195s6)).booleanValue()) {
            dVarJ = vv.H(vv.I(dVarJ, ((Integer) r2.f31970c.a(al.f3210t6)).intValue(), TimeUnit.SECONDS, this.f3780d), TimeoutException.class, n20.f8155d, hx.f6285g);
        }
        fs1.R(dVarJ, this.f3782f, xr0VarK, false);
        dVarJ.a(new l81(0, dVarJ, new kx0(20, this)), hx.f6285g);
        return dVarJ;
    }
}
