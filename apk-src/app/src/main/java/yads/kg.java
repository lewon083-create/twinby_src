package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg0 f40187b;

    public kg(Context context, jg0 jg0Var) {
        this.f40186a = context;
        this.f40187b = jg0Var;
    }

    public final m50 a() {
        PackageManager packageManager = this.f40186a.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i >= 33 ? packageManager.getPackageInfo(this.f40186a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(this.f40186a.getPackageName(), 0);
        this.f40187b.getClass();
        String strB = jg0.b();
        if (strB == null) {
            strB = "Undefined";
        }
        String strConcat = "Android ".concat(strB);
        String strI = l7.o.i(i, "API ");
        String str = packageInfo.packageName;
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = "";
        }
        return new m50(str, str2, strConcat, strI);
    }
}
