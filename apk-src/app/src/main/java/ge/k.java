package ge;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements oa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f20135a = new AtomicReference();

    @Override // oa.b
    public final void a(boolean z5) {
        Random random = l.f20136j;
        synchronized (l.class) {
            Iterator it = l.f20137k.values().iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(z5);
            }
        }
    }
}
