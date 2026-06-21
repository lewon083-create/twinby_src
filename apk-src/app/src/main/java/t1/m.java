package t1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void b(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void c(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void d(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void e(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void f(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void g(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
