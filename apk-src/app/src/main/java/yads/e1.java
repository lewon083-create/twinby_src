package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f37953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f37954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q43 f37955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f37956e;

    public e1(Context context, i1 i1Var, w0 w0Var, q43 q43Var) {
        this.f37952a = context;
        this.f37953b = i1Var;
        this.f37954c = w0Var;
        this.f37955d = q43Var;
        this.f37956e = new d1(this);
    }

    public final void a() {
        ((z0) this.f37954c).a(this.f37952a, (l1) this.f37956e);
        ((z0) this.f37954c).a(this.f37952a, this.f37956e);
    }

    public final void b() {
        this.f37953b.a(h1.f38971c);
        ((z0) this.f37954c).b(this.f37952a, this.f37956e);
        w0 w0Var = this.f37954c;
        Context context = this.f37952a;
        d1 d1Var = this.f37956e;
        z0 z0Var = (z0) w0Var;
        synchronized (z0Var.f45211a) {
            z0Var.f45213c.remove(d1Var);
            z0Var.b(context);
            Unit unit = Unit.f27471a;
        }
        this.f37955d.a(ke1.f40178d, this);
    }

    public final void c() {
        this.f37955d.b(ke1.f40178d, this);
        ((z0) this.f37954c).a(this.f37952a, (l1) this.f37956e);
        ((z0) this.f37954c).a(this.f37952a, this.f37956e);
        this.f37953b.b(h1.f38971c);
    }

    public /* synthetic */ e1(Context context, d4 d4Var, nu2 nu2Var, v9 v9Var, g1 g1Var, er0 er0Var) {
        this(context.getApplicationContext(), new i1(context, d4Var, nu2Var, v9Var, g1Var, er0Var), x0.a(), p43.a());
    }
}
