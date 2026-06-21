package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44281a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc2 f44282b = new oc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f44283c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44284d = new ArrayList();

    public final void a(v5 v5Var) {
        a(v5Var, this.f44282b, null);
    }

    public final void b(v5 v5Var) {
        a(v5Var, null);
    }

    public final void a(v5 v5Var, pc2 pc2Var, tc3 tc3Var) {
        Long l10;
        synchronized (this.f44281a) {
            try {
                Map map = (Map) this.f44283c.get(v5Var);
                Long lValueOf = (map == null || (l10 = (Long) map.get(tc3Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
                if (lValueOf != null) {
                    this.f44284d.add(new u5(v5Var, pc2Var.a(lValueOf.longValue())));
                }
                Map map2 = (Map) this.f44283c.get(v5Var);
                if (map2 != null) {
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(v5 v5Var, tc3 tc3Var) {
        synchronized (this.f44281a) {
            try {
                Map linkedHashMap = (Map) this.f44283c.get(v5Var);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.f44283c.put(v5Var, linkedHashMap);
                linkedHashMap.put(tc3Var, Long.valueOf(SystemClock.elapsedRealtime()));
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
