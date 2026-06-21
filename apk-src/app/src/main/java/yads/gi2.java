package yads;

import com.yandex.varioqub.config.model.ConfigValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gi2 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gi2 f38766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f38767b;

    static {
        gi2 gi2Var = new gi2();
        f38766a = gi2Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", gi2Var, 1);
        q0Var.k("value", false);
        f38767b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.q.f34566a};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f38767b;
        tk.a aVarA = bVar.a(q0Var);
        double dK = ConfigValue.DOUBLE_DEFAULT_VALUE;
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
                dK = aVarA.k(q0Var, 0);
                i = 1;
            }
        }
        aVarA.m(q0Var);
        return new ii2(i, dK);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f38767b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        uk.q0 descriptor = f38767b;
        wk.o oVarA = cVar.a(descriptor);
        double d10 = ((ii2) obj).f39551a;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        oVarA.q(descriptor, 0);
        oVarA.d(d10);
        oVarA.w(descriptor);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
