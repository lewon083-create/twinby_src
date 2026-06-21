package cf;

import com.google.android.gms.internal.measurement.b4;
import ii.n;
import ii.p;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends b4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fe.c f2272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f2273g;

    public b(n nVar, p pVar) {
        super(3);
        this.f2273g = nVar;
        this.f2272f = new fe.c(7, pVar);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean B() {
        Object obj = this.f2273g.f21316b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Object t(String str) {
        return this.f2273g.a(str);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final String x() {
        return this.f2273g.f21315a;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final c z() {
        return this.f2272f;
    }
}
