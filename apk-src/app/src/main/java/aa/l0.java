package aa;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f645b;

    public l0(n0 n0Var) {
        this.f645b = n0Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        n0 n0Var = this.f645b;
        synchronized (n0Var) {
            try {
                if (size() <= n0Var.f663a) {
                    return false;
                }
                n0Var.f668f.add(new Pair((String) entry.getKey(), ((m0) entry.getValue()).f659b));
                return size() > n0Var.f663a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
