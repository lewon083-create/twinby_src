package ma;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import io.sentry.SentryBaseEvent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f28778b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f28779c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28781e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f28777a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f28780d = new AtomicBoolean();

    public static void a(Context context) throws h, i {
        g gVar = g.f28775b;
        int iC = gVar.c(context, 8400000);
        if (iC != 0) {
            Intent intentB = gVar.b(context, "e", iC);
            StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iC);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentB != null) {
                throw new i(iC, intentB);
            }
            throw new h();
        }
    }

    public static boolean b(Context context) {
        try {
            if (!f28779c) {
                try {
                    PackageInfo packageInfoD = wa.b.a(context).d(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    k.b(context);
                    if (packageInfoD == null || k.d(packageInfoD, false) || !k.d(packageInfoD, true)) {
                        f28778b = false;
                    } else {
                        f28778b = true;
                    }
                    f28779c = true;
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
                    f28779c = true;
                }
            }
            return f28778b || !SentryBaseEvent.JsonKeys.USER.equals(Build.TYPE);
        } catch (Throwable th2) {
            f28779c = true;
            throw th2;
        }
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
