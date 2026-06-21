package q;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31536b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Parcelable f31539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31540f;

    public e(SystemForegroundService systemForegroundService, int i, Notification notification, int i10) {
        this.f31540f = systemForegroundService;
        this.f31537c = i;
        this.f31539e = notification;
        this.f31538d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31536b) {
            case 0:
                ((f) this.f31540f).f31542c.c(this.f31537c, this.f31538d, (Bundle) this.f31539e);
                break;
            default:
                Notification notification = (Notification) this.f31539e;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f31540f;
                int i = Build.VERSION.SDK_INT;
                int i10 = this.f31537c;
                if (i < 29) {
                    systemForegroundService.startForeground(i10, notification);
                } else {
                    systemForegroundService.startForeground(i10, notification, this.f31538d);
                }
                break;
        }
    }

    public e(f fVar, int i, int i10, Bundle bundle) {
        this.f31540f = fVar;
        this.f31537c = i;
        this.f31538d = i10;
        this.f31539e = bundle;
    }
}
