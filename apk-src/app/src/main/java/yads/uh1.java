package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uh1 {
    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return null;
        }
        try {
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.containsKey(str)) {
                return null;
            }
            Object obj = bundle.get(str);
            if (obj == null) {
                return null;
            }
            return obj;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Boolean b(Context context) {
        return (Boolean) a(context, vh1.f44036e.f44042b);
    }

    public static boolean c(Context context) {
        Boolean bool = (Boolean) a(context, vh1.f44040j.f44042b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Boolean a(Context context) {
        return (Boolean) a(context, vh1.f44035d.f44042b);
    }
}
