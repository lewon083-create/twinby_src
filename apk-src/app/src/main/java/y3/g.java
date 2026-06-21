package y3;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l4.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36318g;

    @Override // l4.r
    public final int c() {
        return this.f36318g;
    }

    @Override // l4.r
    public final int m() {
        return 0;
    }

    @Override // l4.r
    public final Object p() {
        return null;
    }

    @Override // l4.r
    public final void s(long j10, long j11, long j12, List list, j4.n[] nVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.f36318g, jElapsedRealtime)) {
            for (int i = this.f27826b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.f36318g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
