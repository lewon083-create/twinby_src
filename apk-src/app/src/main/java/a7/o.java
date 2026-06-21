package a7;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.d4;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, String str2, int i) {
        super(str, str2, 2);
        this.f493e = i;
    }

    @Override // a7.c
    public final boolean b() {
        PackageInfo packageInfoA;
        switch (this.f493e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = z6.b.f46197a;
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        packageInfoA = z6.b.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfoA = null;
                    }
                    break;
                } else {
                    packageInfoA = WebView.getCurrentWebViewPackage();
                }
                if (packageInfoA == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? c2.f.d(packageInfoA) : (long) packageInfoA.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !d4.m("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = z6.b.f46197a;
                if (p.f496c.b()) {
                    return r.f504a.getStatics().isMultiProcessEnabled();
                }
                throw p.a();
            default:
                if (d4.m("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
