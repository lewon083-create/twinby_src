package d9;

import fh.of;
import io.sentry.TransactionOptions;
import j0.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15729a;

    public /* synthetic */ d(int i) {
        this.f15729a = i;
    }

    @Override // hj.a
    public final Object get() {
        switch (this.f15729a) {
            case 0:
                of ofVar = new of();
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(v8.d.f34806b, new e9.b(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(v8.d.f34808d, new e9.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e9.c.f16301c)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(v8.d.f34807c, new e9.b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < v8.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new e9.a(ofVar, map);
            default:
                return new f(Executors.newSingleThreadExecutor());
        }
    }
}
