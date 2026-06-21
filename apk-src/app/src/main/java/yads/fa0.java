package yads;

import com.yandex.varioqub.config.model.ConfigValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fa0 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fa0 f38410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f38411b;

    static {
        fa0 fa0Var = new fa0();
        f38410a = fa0Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", fa0Var, 2);
        q0Var.k("network_ad_unit_id", false);
        q0Var.k("min_cpm", false);
        f38411b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.a1.f34493a, uk.q.f34566a};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f38411b;
        tk.a aVarA = bVar.a(q0Var);
        String strF = null;
        double dK = ConfigValue.DOUBLE_DEFAULT_VALUE;
        boolean z5 = true;
        int i = 0;
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
                dK = aVarA.k(q0Var, 1);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new ha0(i, strF, dK);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f38411b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ha0 ha0Var = (ha0) obj;
        uk.q0 descriptor = f38411b;
        wk.o oVarA = cVar.a(descriptor);
        oVarA.v(descriptor, 0, ha0Var.f39116a);
        double d10 = ha0Var.f39117b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        oVarA.q(descriptor, 1);
        oVarA.d(d10);
        oVarA.w(descriptor);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
