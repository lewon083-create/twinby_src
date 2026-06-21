package yads;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class as2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f36850a = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    public static boolean a() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            String[] strArr = f36850a;
            boolean z5 = false;
            for (int i = 0; i < 8; i++) {
                z5 = z5 || (Build.VERSION.SDK_INT < 31 && new File(strArr[i]).exists());
            }
            if (z5) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
