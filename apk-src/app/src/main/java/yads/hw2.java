package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh1 f39350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f39351b;

    public hw2(uh1 uh1Var, nu2 nu2Var) {
        this.f39350a = uh1Var;
        this.f39351b = nu2Var;
    }

    public static final void a() {
    }

    public final void a(Context context) {
        this.f39350a.getClass();
        Boolean bool = (Boolean) uh1.a(context, vh1.f44034c.f44042b);
        if (bool == null || bool.booleanValue()) {
            nu2 nu2Var = this.f39351b;
            zf.a aVar = new zf.a(26);
            new mr0(new ph1()).a(new su1(context, nu2Var, aVar), new tu1(context, nu2Var, aVar));
        }
    }
}
