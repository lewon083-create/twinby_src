package yads;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr0 f38857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f38858b;

    public /* synthetic */ gr0() {
        this(new jr0(), new d());
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            ij.k kVar = ij.m.f21341c;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next));
            }
            Unit unit = Unit.f27471a;
            ij.k kVar2 = ij.m.f21341c;
            return map;
        } catch (Throwable th2) {
            ij.k kVar3 = ij.m.f21341c;
            com.google.android.gms.internal.measurement.h5.s(th2);
            return map;
        }
    }

    public gr0(jr0 jr0Var, d dVar) {
        this.f38857a = jr0Var;
        this.f38858b = dVar;
    }
}
