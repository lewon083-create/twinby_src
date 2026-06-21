package fd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements oa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f16753a = new AtomicReference();

    @Override // oa.b
    public final void a(boolean z5) {
        synchronized (g.f16756k) {
            try {
                for (g gVar : new ArrayList(g.f16757l.values())) {
                    if (gVar.f16762e.get()) {
                        gVar.l(z5);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
