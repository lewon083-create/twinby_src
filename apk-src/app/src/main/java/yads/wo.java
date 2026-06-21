package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wo extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f44435a;

    public /* synthetic */ wo(Context context) {
        this(context, null);
    }

    public final String a(String str) {
        return gf.a.k(str, b(), "<body style='margin:0; padding:0;'>");
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        this.f44435a.put(str, obj);
    }

    public String b() {
        return "";
    }

    public void c() {
        nl3.a((ViewGroup) this);
        Iterator it = this.f44435a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.f44435a.clear();
        destroy();
        getClass().toString();
    }

    public final void d() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (ub.a(11)) {
            settings.setAllowContentAccess(false);
            if (ub.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (ub.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }

    public final void setDisplayZoomControls(boolean z5) {
        if (ub.a(11)) {
            getSettings().setDisplayZoomControls(z5);
        }
    }

    public wo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44435a = new LinkedHashMap();
        d();
    }
}
