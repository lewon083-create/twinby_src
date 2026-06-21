package ob;

import fh.zf;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends com.google.android.gms.internal.ads.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1 f29981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var) {
        super(20);
        this.f29981h = e1Var;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final Object a(Object obj) throws Throwable {
        String str = (String) obj;
        pa.c0.f(str);
        e1 e1Var = this.f29981h;
        e1Var.D();
        pa.c0.f(str);
        n nVar = e1Var.f30373c.f30607d;
        z3.T(nVar);
        ka.k kVarI0 = nVar.I0(str);
        if (kVarI0 == null) {
            return null;
        }
        s0 s0Var = ((l1) e1Var.f15951b).f30265g;
        l1.k(s0Var);
        s0Var.f30418o.g(str, "Populate EES config from database on cache miss. appId");
        e1Var.K(str, e1Var.L(str, (byte[]) kVarI0.f27324c));
        c1 c1Var = e1Var.f30088k;
        c1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (((zf) c1Var.f11554g)) {
            try {
                Set<Map.Entry> setEntrySet = ((LinkedHashMap) ((a0.b1) c1Var.f11553f).f45c).entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "map.entries");
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (com.google.android.gms.internal.measurement.d0) linkedHashMap.get(str);
    }
}
