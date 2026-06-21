package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class df2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf2 f37751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf2 f37752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv f37753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f37755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f37756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37758h;
    public boolean i;

    public df2(ho0 ho0Var, cf2 cf2Var, v63 v63Var, int i, xv xvVar, Looper looper) {
        this.f37752b = ho0Var;
        this.f37751a = cf2Var;
        this.f37756f = looper;
        this.f37753c = xvVar;
    }

    public final synchronized void a(long j10) {
        boolean z5;
        if (!this.f37757g) {
            throw new IllegalStateException();
        }
        if (this.f37756f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        ((i53) this.f37753c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z5 = this.i;
            if (z5 || j10 <= 0) {
                break;
            }
            this.f37753c.getClass();
            wait(j10);
            ((i53) this.f37753c).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z5) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void a(boolean z5) {
        this.f37758h = z5 | this.f37758h;
        this.i = true;
        notifyAll();
    }

    public final df2 a() {
        if (!this.f37757g) {
            this.f37757g = true;
            ho0 ho0Var = (ho0) this.f37752b;
            synchronized (ho0Var) {
                if (!ho0Var.A && ho0Var.f39269j.isAlive()) {
                    ho0Var.i.a(14, this).b();
                    return this;
                }
                kh1.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                a(false);
                return this;
            }
        }
        throw new IllegalStateException();
    }
}
