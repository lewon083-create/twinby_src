package a7;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f492d;

    public n() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f492d = Pattern.compile("\\A\\d+");
    }

    @Override // a7.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // a7.c
    public final boolean b() {
        int i;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        WeakHashMap weakHashMap = z6.b.f46197a;
        if (i >= 26) {
            packageInfoA = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoA = z6.b.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA != null) {
            Matcher matcher = this.f492d.matcher(packageInfoA.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
