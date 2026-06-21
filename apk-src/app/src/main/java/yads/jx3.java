package yads;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jx3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f40010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx3 f40012d;

    public jx3(lx3 lx3Var, WebView webView, String str) {
        this.f40012d = lx3Var;
        this.f40010b = webView;
        this.f40011c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lx3 lx3Var = this.f40012d;
        WebView webView = this.f40010b;
        String str = this.f40011c;
        lx3Var.getClass();
        lx3.a(webView, str);
    }
}
