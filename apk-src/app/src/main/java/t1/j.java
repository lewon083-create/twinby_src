package t1;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.y;
import e1.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconCompat f33351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IconCompat f33352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33353e;

    @Override // e1.d0
    public final void s(y yVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) yVar.f14900c;
        Context context = (Context) yVar.f14899b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f33351c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f33351c;
                int i = iconCompat2.f1322a;
                if (i == -1) {
                    Object obj = iconCompat2.f1323b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.f1323b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f1323b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f33353e) {
            IconCompat iconCompat3 = this.f33352d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            i.c(bigContentTitle, false);
            i.b(bigContentTitle, null);
        }
    }

    @Override // e1.d0
    public final String t() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
