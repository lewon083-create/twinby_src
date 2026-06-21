package androidx.lifecycle;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.a f1612a = new g3.a();

    public final void a() {
        g3.a aVar = this.f1612a;
        if (aVar != null && !aVar.f19958d) {
            aVar.f19958d = true;
            synchronized (aVar.f19955a) {
                try {
                    Iterator it = aVar.f19956b.values().iterator();
                    while (it.hasNext()) {
                        g3.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f19957c.iterator();
                    while (it2.hasNext()) {
                        g3.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f19957c.clear();
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
