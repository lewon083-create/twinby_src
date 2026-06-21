package io.flutter.plugins.urllauncher;

import af.b;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import bj.g;
import bj.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25779f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f25782d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f25780b = new g(0, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f25781c = new b(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IntentFilter f25783e = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f25782d = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map2 = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map2.put(str, bundleExtra.getString(str));
            }
            map = map2;
        }
        this.f25782d.loadUrl(stringExtra, map);
        this.f25782d.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f25782d.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f25782d.setWebViewClient(this.f25781c);
        this.f25782d.getSettings().setSupportMultipleWindows(true);
        this.f25782d.setWebChromeClient(new i(this));
        t1.b.d(this, this.f25780b, this.f25783e);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f25780b);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f25782d.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f25782d.goBack();
        return true;
    }
}
