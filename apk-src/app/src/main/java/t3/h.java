package t3;

import android.graphics.fonts.Font;
import android.media.AudioProfile;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ Font.Builder d(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ AudioProfile g(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager i(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }
}
