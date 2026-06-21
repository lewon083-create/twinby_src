package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ph extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ya f9052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9055h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9062p;

    public ph() {
        ya yaVar = new ya(4, false);
        this.f9049b = false;
        this.f9050c = false;
        this.f9052e = yaVar;
        this.f9051d = new Object();
        this.f9054g = ((Long) tl.f10653d.r()).intValue();
        this.f9055h = ((Long) tl.f10650a.r()).intValue();
        this.i = ((Long) tl.f10654e.r()).intValue();
        this.f9056j = ((Long) tl.f10652c.r()).intValue();
        wk wkVar = al.f3204t0;
        q9.s sVar = q9.s.f31967e;
        this.f9057k = ((Integer) sVar.f31970c.a(wkVar)).intValue();
        wk wkVar2 = al.f3221u0;
        yk ykVar = sVar.f31970c;
        this.f9058l = ((Integer) ykVar.a(wkVar2)).intValue();
        this.f9059m = ((Integer) ykVar.a(al.f3235v0)).intValue();
        this.f9053f = ((Long) tl.f10655f.r()).intValue();
        this.f9060n = (String) ykVar.a(al.f3264x0);
        this.f9061o = ((Boolean) ykVar.a(al.f3280y0)).booleanValue();
        this.f9062p = ((Boolean) ykVar.a(al.f3295z0)).booleanValue();
        ((Boolean) ykVar.a(al.A0)).getClass();
        setName("ContentFetchTask");
    }

    public final c3 a(View view, kh khVar) {
        if (view == null) {
            return new c3(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new c3(this, 0, 0);
            }
            khVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new c3(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof sz)) {
            WebView webView = (WebView) view;
            synchronized (khVar.f7221g) {
                khVar.f7226m++;
            }
            webView.post(new d1(this, khVar, webView, globalVisibleRect));
            return new c3(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new c3(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            c3 c3VarA = a(viewGroup.getChildAt(i11), khVar);
            i += c3VarA.f4005a;
            i10 += c3VarA.f4006b;
        }
        return new c3(this, i, i10);
    }

    public final void b() {
        synchronized (this.f9051d) {
            this.f9050c = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = true");
            u9.i.c(sb2.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r4.importance != 100) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r3.inKeyguardRestrictedInputMode() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r0.isScreenOn() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        r0 = p9.k.C.f31301g.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        u9.i.c("ContentFetchThread: no activity. Sleeping.");
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r0.getWindow() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        r2 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        p9.k.C.f31302h.d("ContentFetchTask.extractContent", r0);
        u9.i.c("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        u9.i.f("Error in ContentFetchTask", r0);
        p9.k.C.f31302h.d("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        u9.i.f("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9 A[Catch: Exception -> 0x007c, InterruptedException -> 0x007e, TryCatch #7 {InterruptedException -> 0x007e, Exception -> 0x007c, blocks: (B:33:0x0069, B:35:0x0073, B:58:0x00d1, B:50:0x00b1, B:48:0x00a1, B:57:0x00c9, B:56:0x00c0, B:41:0x0080, B:43:0x0086, B:45:0x0090, B:2:0x0000, B:3:0x0006, B:15:0x001b, B:18:0x002f, B:20:0x0035, B:21:0x0039, B:23:0x003f, B:25:0x004d, B:27:0x0053, B:29:0x0059, B:31:0x0063, B:55:0x00bf, B:4:0x0007, B:6:0x000e, B:7:0x0010, B:11:0x0015), top: B:85:0x0069, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1 A[EXC_TOP_SPLITTER, LOOP:2: B:83:0x00f1->B:92:0x00f1, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ph.run():void");
    }
}
