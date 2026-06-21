package ob;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f30110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f30111d;

    public /* synthetic */ f2(k2 k2Var, Bundle bundle, int i) {
        this.f30109b = i;
        this.f30111d = bundle;
        this.f30110c = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f30109b) {
            case 0:
                k2 k2Var = this.f30110c;
                k2Var.C();
                k2Var.D();
                Bundle bundle2 = this.f30111d;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                pa.c0.f(string);
                pa.c0.f(string2);
                pa.c0.i(bundle2.get("value"));
                l1 l1Var = (l1) k2Var.f15951b;
                if (!l1Var.a()) {
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30418o.f("Conditional property not set since app measurement is disabled");
                } else {
                    b4 b4Var = new b4(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        e4 e4Var = l1Var.f30267j;
                        l1.h(e4Var);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        v vVarD0 = e4Var.d0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        l1.h(e4Var);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        v vVarD02 = e4Var.d0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        l1Var.n().V(new e(bundle2.getString(CommonUrlParts.APP_ID), string2, b4Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), vVarD02, bundle2.getLong("trigger_timeout"), vVarD0, bundle2.getLong("time_to_live"), e4Var.d0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                k2 k2Var2 = this.f30110c;
                m7.a aVar = k2Var2.f30237x;
                l1 l1Var2 = (l1) k2Var2.f15951b;
                Bundle bundle3 = this.f30111d;
                if (bundle3.isEmpty()) {
                    bundle = bundle3;
                } else {
                    z0 z0Var = l1Var2.f30264f;
                    e4 e4Var2 = l1Var2.f30267j;
                    g gVar = l1Var2.f30263e;
                    s0 s0Var2 = l1Var2.f30265g;
                    l1.h(z0Var);
                    bundle = new Bundle(z0Var.f30600z.N());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            l1.h(e4Var2);
                            if (e4.J0(obj)) {
                                e4.S(aVar, null, 27, null, null, 0);
                            }
                            l1.k(s0Var2);
                            s0Var2.f30415l.h(str, "Invalid default event parameter type. Name, value", obj);
                        } else if (e4.Z(str)) {
                            l1.k(s0Var2);
                            s0Var2.f30415l.g(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            l1.h(e4Var2);
                            gVar.getClass();
                            if (e4Var2.K0("param", str, 500, obj)) {
                                e4Var2.R(bundle, str, obj);
                            }
                        }
                    }
                    l1.h(e4Var2);
                    e4 e4Var3 = ((l1) gVar.f15951b).f30267j;
                    l1.h(e4Var3);
                    int i = e4Var3.g0(201500000) ? 100 : 25;
                    if (bundle.size() > i) {
                        int i10 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i10++;
                            if (i10 > i) {
                                bundle.remove(str2);
                            }
                        }
                        l1.h(e4Var2);
                        e4.S(aVar, null, 26, null, null, 0);
                        l1.k(s0Var2);
                        s0Var2.f30415l.f("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                z0 z0Var2 = l1Var2.f30264f;
                l1.h(z0Var2);
                z0Var2.f30600z.P(bundle);
                if (!bundle3.isEmpty() || l1Var2.f30263e.M(null, d0.W0)) {
                    l1Var2.n().H(bundle);
                }
                break;
        }
    }
}
