package z6;

import a7.p;
import a7.r;
import a7.s;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f46197a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f46197a = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static s b(WebView webView) {
        if (!p.i.b()) {
            return new s(r.f504a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f46197a;
        s sVar = (s) weakHashMap.get(webView);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(r.f504a.createWebView(webView));
        weakHashMap.put(webView, sVar2);
        return sVar2;
    }

    public static String c() {
        if (p.f499f.b()) {
            return r.f504a.getStatics().getVariationsHeader();
        }
        throw p.a();
    }

    public static WebViewClient d(WebView webView) {
        a7.b bVar = p.f495b;
        if (bVar.a()) {
            return webView.getWebViewClient();
        }
        if (!bVar.b()) {
            throw p.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        return b(webView).f505a.getWebViewClient();
    }
}
