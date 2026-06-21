package yads;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph1 f40995a;

    public mr0(ph1 ph1Var) {
        this.f40995a = ph1Var;
    }

    public final void a(su1 su1Var, tu1 tu1Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ph1 ph1Var = this.f40995a;
        ph1Var.f41927a.post(new io.sentry.android.core.n(jElapsedRealtime, su1Var, tu1Var));
    }

    public static final void a(long j10, Function0 function0, Function0 function02) {
        if (SystemClock.elapsedRealtime() - j10 <= 5000) {
            function0.invoke();
        } else {
            function02.invoke();
        }
    }
}
