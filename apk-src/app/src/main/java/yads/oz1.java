package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f41775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f41776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f41777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hk.a0 f41778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f41779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qz1 f41780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s42 f41781g;

    public /* synthetic */ oz1(Context context, nu2 nu2Var, d4 d4Var, w5 w5Var, hk.a0 a0Var) {
        Context applicationContext = context.getApplicationContext();
        hz1 hz1Var = new hz1(new k62(d4Var, nu2Var, context, w5Var, a0Var));
        this(nu2Var, d4Var, w5Var, a0Var, applicationContext, new qz1(d4Var, nu2Var, hz1Var), new s42(context, nu2Var, w5Var, hz1Var, a0Var));
    }

    public final void a() {
        s42 s42Var = this.f41781g;
        l42 l42Var = s42Var.f42803b;
        k62 k62Var = l42Var.f40424c;
        ke0 ke0Var = k62Var.f40085b;
        synchronized (ke0Var.f40175d) {
            ke0Var.f40173b.a();
            Unit unit = Unit.f27471a;
        }
        k62Var.f40086c.a();
        l42Var.f40422a.getClass();
        l42Var.f40423b.getClass();
        s42Var.f42804c.a();
        hk.c0.d(s42Var.f42802a);
    }

    public oz1(nu2 nu2Var, d4 d4Var, w5 w5Var, hk.a0 a0Var, Context context, qz1 qz1Var, s42 s42Var) {
        this.f41775a = nu2Var;
        this.f41776b = d4Var;
        this.f41777c = w5Var;
        this.f41778d = a0Var;
        this.f41779e = context;
        this.f41780f = qz1Var;
        this.f41781g = s42Var;
    }
}
