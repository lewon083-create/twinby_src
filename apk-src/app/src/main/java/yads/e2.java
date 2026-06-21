package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37970b = "com.yandex.mobile.ads.common.AdActivity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37971c = "There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f37972a = new v1();

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f37970b), 0);
            this.f37972a.getClass();
            v1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f37971c;
            throw new wb1(str, str);
        }
    }
}
