package v7;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34797e = l7.n.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f34798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f34799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f34800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34801d;

    public r() {
        o oVar = new o(0);
        oVar.f34794b = 0;
        this.f34799b = new HashMap();
        this.f34800c = new HashMap();
        this.f34801d = new Object();
        this.f34798a = Executors.newSingleThreadScheduledExecutor(oVar);
    }

    public final void a(String str, o7.e eVar) {
        synchronized (this.f34801d) {
            l7.n.g().e(f34797e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            q qVar = new q(this, str);
            this.f34799b.put(str, qVar);
            this.f34800c.put(str, eVar);
            this.f34798a.schedule(qVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f34801d) {
            try {
                if (((q) this.f34799b.remove(str)) != null) {
                    l7.n.g().e(f34797e, "Stopping timer for " + str, new Throwable[0]);
                    this.f34800c.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
