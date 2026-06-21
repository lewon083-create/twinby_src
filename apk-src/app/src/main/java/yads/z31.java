package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import yads.z31;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m41 f45239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f45240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f51 f45241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f45242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f45243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ls1 f45244f;

    public z31(g03 g03Var, Set set, f51 f51Var, Handler handler, AtomicInteger atomicInteger, ls1 ls1Var) {
        this.f45239a = g03Var;
        this.f45240b = set;
        this.f45241c = f51Var;
        this.f45242d = handler;
        this.f45243e = atomicInteger;
        this.f45244f = ls1Var;
    }

    public final void a(Map map) {
        if (this.f45243e.decrementAndGet() == 0) {
            this.f45241c.a(map);
        }
    }

    public final boolean a(w41 w41Var) {
        int iA = w41Var.a();
        int iB = w41Var.b();
        this.f45244f.getClass();
        return ((float) ls1.a()) >= ((float) ((iA * iB) * 4)) + 1048576.0f;
    }

    public final void a() {
        final HashMap map = new HashMap();
        for (final w41 w41Var : this.f45240b) {
            final String str = w41Var.f44275c;
            final int i = w41Var.f44274b;
            final int i10 = w41Var.f44273a;
            if (a(w41Var)) {
                this.f45242d.post(new Runnable() { // from class: zl.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z31.a(this.f46570b, str, i10, i, map, w41Var);
                    }
                });
            } else {
                a(map);
            }
        }
    }

    public static final void a(z31 z31Var, String str, int i, int i10, Map map, w41 w41Var) {
        z31Var.f45239a.a(str, new y31(z31Var, map, w41Var), i, i10);
    }
}
