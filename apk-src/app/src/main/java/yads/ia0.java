package yads;

import io.sentry.protocol.SentryStackFrame;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ia0 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ia0 f39477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f39478b;

    static {
        ia0 ia0Var = new ia0();
        f39477a = ia0Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCurrency", ia0Var, 2);
        q0Var.k("name", false);
        q0Var.k(SentryStackFrame.JsonKeys.SYMBOL, false);
        f39478b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{a1Var, a1Var};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f39478b;
        tk.a aVarA = bVar.a(q0Var);
        String strF = null;
        boolean z5 = true;
        int i = 0;
        String strF2 = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                strF = aVarA.f(q0Var, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    throw new qk.e(iV);
                }
                strF2 = aVarA.f(q0Var, 1);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new ka0(i, strF, strF2);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f39478b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ka0 ka0Var = (ka0) obj;
        uk.q0 q0Var = f39478b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.v(q0Var, 0, ka0Var.f40132a);
        oVarA.v(q0Var, 1, ka0Var.f40133b);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
