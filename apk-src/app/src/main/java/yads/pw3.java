package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pw3 implements aw3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f42093b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jw3 f42094c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f42092a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        jw3 jw3Var = (jw3) this.f42093b.poll();
        this.f42094c = jw3Var;
        if (jw3Var != null) {
            jw3Var.a(this.f42092a);
        }
    }

    public final void a(jw3 jw3Var) {
        jw3Var.f40000a = this;
        this.f42093b.add(jw3Var);
        if (this.f42094c == null) {
            a();
        }
    }
}
