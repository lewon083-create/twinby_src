package cf;

import com.google.android.gms.internal.measurement.b4;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s7.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f2269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f2270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2271h;

    public a(Map map, boolean z5) {
        super(3);
        this.f2270g = new g();
        this.f2269f = map;
        this.f2271h = z5;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean B() {
        return this.f2269f.containsKey("transactionId");
    }

    public final void Z(ArrayList arrayList) {
        if (this.f2271h) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        g gVar = this.f2270g;
        map2.put("code", (String) gVar.f32796c);
        map2.put("message", (String) gVar.f32797d);
        map2.put("data", gVar.f32798e);
        map.put("error", map2);
        arrayList.add(map);
    }

    public final void a0(ArrayList arrayList) {
        if (this.f2271h) {
            return;
        }
        HashMap map = new HashMap();
        map.put(FeatureFlag.JsonKeys.RESULT, this.f2270g.f32795b);
        arrayList.add(map);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Object t(String str) {
        return this.f2269f.get(str);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final String x() {
        return (String) this.f2269f.get(Request.JsonKeys.METHOD);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean y() {
        return this.f2271h;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final c z() {
        return this.f2270g;
    }
}
