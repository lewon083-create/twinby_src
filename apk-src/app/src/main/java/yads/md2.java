package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class md2 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final md2 f40884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f40885b;

    static {
        md2 md2Var = new md2();
        f40884a = md2Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.core.configuration.model.PlayBackOptimizationConfig", md2Var, 5);
        q0Var.k("minBufferMs", true);
        q0Var.k("maxBufferMs", true);
        q0Var.k("bufferForPlaybackMs", true);
        q0Var.k("bufferForPlaybackAfterRebufferMs", true);
        q0Var.k("targetBufferBytes", true);
        f40885b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.e0 e0Var = uk.e0.f34508a;
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(e0Var), com.google.android.gms.internal.auth.g.q(e0Var), com.google.android.gms.internal.auth.g.q(e0Var), com.google.android.gms.internal.auth.g.q(e0Var), com.google.android.gms.internal.auth.g.q(e0Var)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f40885b;
        tk.a aVarA = bVar.a(q0Var);
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                num = (Integer) aVarA.g(q0Var, 0, uk.e0.f34508a, num);
                i |= 1;
            } else if (iV == 1) {
                num2 = (Integer) aVarA.g(q0Var, 1, uk.e0.f34508a, num2);
                i |= 2;
            } else if (iV == 2) {
                num3 = (Integer) aVarA.g(q0Var, 2, uk.e0.f34508a, num3);
                i |= 4;
            } else if (iV == 3) {
                num4 = (Integer) aVarA.g(q0Var, 3, uk.e0.f34508a, num4);
                i |= 8;
            } else {
                if (iV != 4) {
                    throw new qk.e(iV);
                }
                num5 = (Integer) aVarA.g(q0Var, 4, uk.e0.f34508a, num5);
                i |= 16;
            }
        }
        aVarA.m(q0Var);
        return new od2(i, num, num2, num3, num4, num5);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f40885b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        od2 od2Var = (od2) obj;
        uk.q0 q0Var = f40885b;
        wk.o oVarA = cVar.a(q0Var);
        if (oVarA.x(q0Var) || od2Var.f41516a != null) {
            oVarA.t(q0Var, 0, uk.e0.f34508a, od2Var.f41516a);
        }
        if (oVarA.x(q0Var) || od2Var.f41517b != null) {
            oVarA.t(q0Var, 1, uk.e0.f34508a, od2Var.f41517b);
        }
        if (oVarA.x(q0Var) || od2Var.f41518c != null) {
            oVarA.t(q0Var, 2, uk.e0.f34508a, od2Var.f41518c);
        }
        if (oVarA.x(q0Var) || od2Var.f41519d != null) {
            oVarA.t(q0Var, 3, uk.e0.f34508a, od2Var.f41519d);
        }
        if (oVarA.x(q0Var) || od2Var.f41520e != null) {
            oVarA.t(q0Var, 4, uk.e0.f34508a, od2Var.f41520e);
        }
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
