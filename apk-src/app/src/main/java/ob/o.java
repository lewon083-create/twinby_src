package ob;

import android.os.Handler;
import com.google.android.gms.internal.ads.kw0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile kw0 f30315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f30316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed.c f30317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f30318c;

    public o(t1 t1Var) {
        pa.c0.i(t1Var);
        this.f30316a = t1Var;
        this.f30317b = new ed.c(22, this, t1Var, false);
    }

    public abstract void a();

    public final void b(long j10) {
        c();
        if (j10 >= 0) {
            t1 t1Var = this.f30316a;
            t1Var.o().getClass();
            this.f30318c = System.currentTimeMillis();
            if (d().postDelayed(this.f30317b, j10)) {
                return;
            }
            t1Var.b().f30411g.g(Long.valueOf(j10), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f30318c = 0L;
        d().removeCallbacks(this.f30317b);
    }

    public final Handler d() {
        kw0 kw0Var;
        if (f30315d != null) {
            return f30315d;
        }
        synchronized (o.class) {
            try {
                if (f30315d == null) {
                    f30315d = new kw0(this.f30316a.j().getMainLooper(), 1);
                }
                kw0Var = f30315d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kw0Var;
    }
}
