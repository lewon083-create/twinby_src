package t9;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.d00;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.si;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends h0 {
    @Override // t9.h0
    public final k00 j(d00 d00Var, si siVar, boolean z5, ph0 ph0Var) {
        return new m00(d00Var, siVar, z5, ph0Var);
    }

    @Override // t9.h0
    public final int k(Context context, TelephonyManager telephonyManager) {
        g0 g0Var = p9.k.C.f31297c;
        return (g0.d(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }

    @Override // t9.h0
    public final void l(Context context) {
        g8.a.n();
        NotificationChannel notificationChannelB = ma.e.b(((Integer) q9.s.f31967e.f31970c.a(al.D9)).intValue());
        notificationChannelB.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelB);
    }

    @Override // t9.h0
    public final boolean m(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // t9.h0
    public final Intent n(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
