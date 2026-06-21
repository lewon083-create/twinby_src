package yads;

import io.sentry.SentryReplayEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uw0 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uw0 f43795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f43796b;

    static {
        uw0 uw0Var = new uw0();
        f43795a = uw0Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.fonts.FontParameters", uw0Var, 1);
        q0Var.k(SentryReplayEvent.JsonKeys.URLS, false);
        f43796b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(cx0.f37544a)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f43796b;
        tk.a aVarA = bVar.a(q0Var);
        ex0 ex0Var = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else {
                if (iV != 0) {
                    throw new qk.e(iV);
                }
                ex0Var = (ex0) aVarA.g(q0Var, 0, cx0.f37544a, ex0Var);
                i = 1;
            }
        }
        aVarA.m(q0Var);
        return new ww0(i, ex0Var);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f43796b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        uk.q0 q0Var = f43796b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.t(q0Var, 0, cx0.f37544a, ((ww0) obj).f44508a);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
