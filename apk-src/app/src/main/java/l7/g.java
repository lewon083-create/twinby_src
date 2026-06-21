package l7;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f28027c;

    public g(int i, Notification notification, int i10) {
        this.f28025a = i;
        this.f28027c = notification;
        this.f28026b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f28025a == gVar.f28025a && this.f28026b == gVar.f28026b) {
            return this.f28027c.equals(gVar.f28027c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28027c.hashCode() + (((this.f28025a * 31) + this.f28026b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f28025a + ", mForegroundServiceType=" + this.f28026b + ", mNotification=" + this.f28027c + '}';
    }
}
