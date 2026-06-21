package t1;

import android.app.Notification;
import com.google.firebase.messaging.y;
import e1.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f33354c;

    @Override // e1.d0
    public final void s(y yVar) {
        new Notification.BigTextStyle((Notification.Builder) yVar.f14900c).setBigContentTitle(null).bigText(this.f33354c);
    }

    @Override // e1.d0
    public final String t() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
