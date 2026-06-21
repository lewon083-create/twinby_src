package a7;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;
import android.media.MediaMuxer;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ NotificationChannel C(String str) {
        return new NotificationChannel("geolocator_channel_01", str, 0);
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannel f(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* synthetic */ MediaMuxer l() {
        return new MediaMuxer((FileDescriptor) null, 3);
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
