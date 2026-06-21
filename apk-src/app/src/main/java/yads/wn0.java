package yads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wn0 {
    public static af2 a(Context context, ao0 ao0Var, boolean z5) {
        MediaMetricsManager mediaMetricsManagerI = t3.h.i(context.getSystemService("media_metrics"));
        om1 om1Var = mediaMetricsManagerI == null ? null : new om1(context, mediaMetricsManagerI.createPlaybackSession());
        if (om1Var == null) {
            kh1.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new af2(new ze2(LogSessionId.LOG_SESSION_ID_NONE));
        }
        if (z5) {
            ao0Var.getClass();
            kb0 kb0Var = (kb0) ao0Var.f36809o;
            kb0Var.getClass();
            rf1 rf1Var = kb0Var.f40141f;
            if (!rf1Var.f42592g) {
                rf1Var.f42589d.add(new qf1(om1Var));
            }
        }
        return new af2(new ze2(om1Var.f41629c.getSessionId()));
    }
}
