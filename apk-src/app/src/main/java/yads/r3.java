package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r3 extends WebChromeClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f42449b = {wb.a(r3.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f42450a;

    public r3(Context context) {
        this.f42450a = om2.a(context);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        nm2 nm2Var = this.f42450a;
        dk.i iVar = f42449b[0];
        Object obj = (Context) nm2Var.f41294a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            t1 t1Var = (t1) t3Var;
            int i10 = i * 100;
            t1Var.i.setProgress(i10);
            if (10000 > i10) {
                t1Var.a(0);
            } else {
                t1Var.f43154h.setText(webView.getTitle());
                t1Var.a(8);
            }
        }
    }
}
