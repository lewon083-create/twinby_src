package yads;

import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ff {
    public static void a(ProgressBar progressBar, long j10, long j11) {
        progressBar.clearAnimation();
        if (j10 > 0) {
            progressBar.setMax((int) j10);
            gj2 gj2Var = new gj2(progressBar, progressBar.getProgress(), (int) j11);
            gj2Var.setDuration(200L);
            progressBar.startAnimation(gj2Var);
        }
    }
}
