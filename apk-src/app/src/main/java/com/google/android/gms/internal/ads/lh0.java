package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.webkit.WebView;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7520b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f7521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7523e;

    public lh0(ph0 ph0Var, AlertDialog alertDialog, Timer timer, s9.d dVar) {
        this.f7522d = alertDialog;
        this.f7521c = timer;
        this.f7523e = dVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f7520b;
        Timer timer = this.f7521c;
        Object obj = this.f7522d;
        Object obj2 = this.f7523e;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                s9.d dVar = (s9.d) obj2;
                if (dVar != null) {
                    dVar.z();
                    return;
                }
                return;
            default:
                WebView webView = ((yt0) obj2).f12738b;
                WeakHashMap weakHashMap = z6.b.f46197a;
                if (!a7.p.f497d.b()) {
                    throw a7.p.a();
                }
                z6.b.b(webView).f505a.removeWebMessageListener("omidJsSessionService");
                g00 g00Var = ((d00) ((ox0) obj).f8851c).f4408b;
                t9.d0 d0Var = t9.g0.f33596l;
                Objects.requireNonNull(g00Var);
                d0Var.post(new c00(g00Var, 0));
                timer.cancel();
                return;
        }
    }

    public lh0(yt0 yt0Var, ox0 ox0Var, Timer timer) {
        this.f7522d = ox0Var;
        this.f7521c = timer;
        Objects.requireNonNull(yt0Var);
        this.f7523e = yt0Var;
    }
}
