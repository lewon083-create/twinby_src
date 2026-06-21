package yads;

import android.os.SystemClock;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zb2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc2 f45340b;

    public zb2(bc2 bc2Var) {
        this.f45340b = bc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bc2 bc2Var = this.f45340b;
        bc2Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - bc2Var.f36993h;
        bc2Var.f36993h = jElapsedRealtime;
        long j11 = bc2Var.f36991f - j10;
        bc2Var.f36991f = j11;
        Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, j11);
        this.f45340b.c();
    }
}
