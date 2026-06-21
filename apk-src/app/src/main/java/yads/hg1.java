package yads;

import android.os.Looper;
import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hg1 implements ig1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bg1 f39171d = new bg1(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bg1 f39172e = new bg1(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f39173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cg1 f39174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f39175c;

    public hg1(String str) {
        this.f39173a = lb3.d("ExoPlayer:Loader:".concat(str));
    }

    @Override // yads.ig1
    public final void a() throws IOException {
        a(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
    }

    public final boolean b() {
        return this.f39174b != null;
    }

    public final void a(int i) throws IOException {
        IOException iOException = this.f39175c;
        if (iOException != null) {
            throw iOException;
        }
        cg1 cg1Var = this.f39174b;
        if (cg1Var != null) {
            if (i == Integer.MIN_VALUE) {
                i = cg1Var.f37382b;
            }
            IOException iOException2 = cg1Var.f37386f;
            if (iOException2 != null && cg1Var.f37387g > i) {
                throw iOException2;
            }
        }
    }

    public final void a(eg1 eg1Var) {
        cg1 cg1Var = this.f39174b;
        if (cg1Var != null) {
            cg1Var.a(true);
        }
        if (eg1Var != null) {
            this.f39173a.execute(new fg1(eg1Var));
        }
        this.f39173a.shutdown();
    }

    public final long a(dg1 dg1Var, ag1 ag1Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f39175c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            cg1 cg1Var = new cg1(this, looperMyLooper, dg1Var, ag1Var, i, jElapsedRealtime);
            if (this.f39174b == null) {
                this.f39174b = cg1Var;
                cg1Var.f37386f = null;
                this.f39173a.execute(cg1Var);
                return jElapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
