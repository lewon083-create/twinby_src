package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 extends k00 {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        d00 d00Var = this.f7056b;
        if (d00Var.f4410d.compareAndSet(false, true)) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3056j1)).booleanValue()) {
                return false;
            }
            g00 g00Var = d00Var.f4408b;
            if (g00Var.getParent() instanceof ViewGroup) {
                ((ViewGroup) g00Var.getParent()).removeView(g00Var);
            }
            g00Var.destroy();
            f00 f00Var = new f00(zDidCrash, iRendererPriorityAtExit);
            si siVar = g00Var.f5563b0;
            siVar.a(f00Var);
            siVar.b(10003);
        }
        return true;
    }
}
