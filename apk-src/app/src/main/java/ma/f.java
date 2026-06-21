package ma;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import pa.c0;
import z2.h0;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class f extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28772c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f28773d = new f();

    public static AlertDialog e(Activity activity, int i, pa.t tVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(pa.q.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.twinby.R.string.common_google_play_services_enable_button) : resources.getString(com.twinby.R.string.common_google_play_services_update_button) : resources.getString(com.twinby.R.string.common_google_play_services_install_button);
        if (string != null) {
            if (tVar == null) {
                tVar = null;
            }
            builder.setPositiveButton(string, tVar);
        }
        String strA = pa.q.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", l7.o.i(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof w) {
                h0 h0VarI = ((w) activity).i();
                l lVar = new l();
                c0.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                lVar.f28785l0 = alertDialog;
                if (onCancelListener != null) {
                    lVar.f28786m0 = onCancelListener;
                }
                lVar.f45931i0 = false;
                lVar.f45932j0 = true;
                h0VarI.getClass();
                z2.a aVar = new z2.a(h0VarI);
                aVar.f45798o = true;
                aVar.e(0, lVar, str, 1);
                aVar.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        c0.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f28765b = alertDialog;
        if (onCancelListener != null) {
            cVar.f28766c = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, pa.t.b(googleApiActivity, super.b(googleApiActivity, "d", i), 2), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        h(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, oa.h hVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, pa.t.c(hVar, super.b(activity, "d", i), 2), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        h(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", a0.u.k(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new m(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? pa.q.e(context, "common_google_play_services_resolution_required_title") : pa.q.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.twinby.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? pa.q.d(context, "common_google_play_services_resolution_required_text", pa.q.c(context)) : pa.q.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        c0.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        t1.l lVar = new t1.l(context, null);
        lVar.f33366m = true;
        lVar.c(16, true);
        lVar.f33359e = t1.l.b(strE);
        t1.k kVar = new t1.k();
        kVar.f33354c = t1.l.b(strD);
        lVar.e(kVar);
        PackageManager packageManager = context.getPackageManager();
        if (ua.b.f34404c == null) {
            ua.b.f34404c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = ua.b.f34404c.booleanValue();
        int i11 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            lVar.f33372s.icon = i11;
            lVar.f33363j = 2;
            if (ua.b.l(context)) {
                lVar.f33356b.add(new t1.h(resources.getString(com.twinby.R.string.common_open_on_phone), pendingIntent));
            } else {
                lVar.f33361g = pendingIntent;
            }
        } else {
            lVar.f33372s.icon = R.drawable.stat_sys_warning;
            lVar.f33372s.tickerText = t1.l.b(resources.getString(com.twinby.R.string.common_google_play_services_notification_ticker));
            lVar.f33372s.when = System.currentTimeMillis();
            lVar.f33361g = pendingIntent;
            lVar.f33360f = t1.l.b(strD);
        }
        if (ua.b.h()) {
            c0.l(ua.b.h());
            synchronized (f28772c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.twinby.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(e.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            lVar.f33370q = "com.google.android.gms.availability";
        }
        Notification notificationA = lVar.a();
        if (i == 1 || i == 2 || i == 3) {
            j.f28777a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationA);
    }
}
