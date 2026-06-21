package yads;

import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zi3 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk3 f45428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff f45429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a20 f45430c;

    public /* synthetic */ zi3(gk3 gk3Var) {
        this(gk3Var, new ff(), new a20());
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        h72 h72Var = (h72) this.f45428a.b();
        if (h72Var != null) {
            il1 il1Var = h72Var.f39052c.f41822b;
            ProgressBar videoProgress = il1Var != null ? il1Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.f45429b.getClass();
                ff.a(videoProgress, j10, j11);
            }
            il1 il1Var2 = h72Var.f39052c.f41822b;
            TextView countDownProgress = il1Var2 != null ? il1Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.f45430c.f36610a.getClass();
                countDownProgress.setText(qj2.a(j10 - j11));
            }
        }
    }

    public zi3(gk3 gk3Var, ff ffVar, a20 a20Var) {
        this.f45428a = gk3Var;
        this.f45429b = ffVar;
        this.f45430c = a20Var;
    }
}
