package v7;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34768a = l7.n.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z5) {
        String str = f34768a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z5 ? 1 : 2, 1);
            l7.n.g().e(str, cls.getName() + " " + (z5 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e3) {
            l7.n.g().e(str, gf.a.k(cls.getName(), " could not be ", z5 ? "enabled" : "disabled"), e3);
        }
    }
}
