package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u52 f44606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf2 f44607c;

    public /* synthetic */ x52(Context context, d4 d4Var, nu2 nu2Var, v9 v9Var) {
        this(context, d4Var, nu2Var, v9Var, ot2.a(context));
    }

    public final u52 a(Context context, v9 v9Var, nu2 nu2Var, d4 d4Var) {
        return this.f44605a ? new he0(context, v9Var, nu2Var, d4Var) : new ie0(context, v9Var, nu2Var, d4Var);
    }

    public x52(Context context, d4 d4Var, nu2 nu2Var, v9 v9Var, boolean z5) {
        this.f44605a = z5;
        this.f44606b = a(context.getApplicationContext(), v9Var, nu2Var, d4Var);
        this.f44607c = a();
    }

    public final sf2 a() {
        kp0 kp0Var;
        if (this.f44605a) {
            kp0 kp0Var2 = kp0.f40302c;
            if (kp0Var2 == null) {
                synchronized (kp0.f40301b) {
                    kp0Var = kp0.f40302c;
                    if (kp0Var == null) {
                        kp0Var = new kp0();
                        kp0.f40302c = kp0Var;
                    }
                }
                kp0Var2 = kp0Var;
            }
            return new w52(kp0Var2);
        }
        return new v52(jp0.a());
    }
}
