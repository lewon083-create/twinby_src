package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.internal.ads.zz;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f13430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f13431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f13432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f13434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f13435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dialog f13436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f13437h;
    public final AtomicBoolean i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f13438j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f13439k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f13440l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13441m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13442n = false;

    public k(Application application, s sVar, g gVar, p pVar, n nVar, a0 a0Var) {
        this.f13430a = application;
        this.f13431b = sVar;
        this.f13432c = gVar;
        this.f13433d = pVar;
        this.f13434e = nVar;
        this.f13435f = a0Var;
    }

    public final void a(Activity activity, yc.a aVar) {
        f0.a();
        ((Queue) this.f13435f.f13321h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.i.compareAndSet(false, true)) {
            n1 n1Var = new n1(3, true != this.f13441m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(n1Var);
            aVar.a(n1Var.a());
            return;
        }
        r rVar = this.f13437h;
        zz zzVar = rVar.f13535c;
        Objects.requireNonNull(zzVar);
        rVar.f13534b.post(new q(zzVar, 0));
        i iVar = new i(this, activity);
        this.f13430a.registerActivityLifecycleCallbacks(iVar);
        this.f13440l.set(iVar);
        this.f13431b.f13545a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f13437h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            n1 n1Var2 = new n1(3, "Activity with null windows is passed in.");
            d(n1Var2);
            aVar.a(n1Var2.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        com.google.android.gms.internal.auth.m.v(window, false);
        this.f13439k.set(aVar);
        dialog.show();
        this.f13436g = dialog;
        this.f13437h.a("UMP_messagePresented", "");
        d(null);
    }

    public final void b(yc.g gVar, yc.f fVar) {
        n nVar = this.f13434e;
        s sVar = (s) ((g7) nVar.f13492b).j();
        Handler handler = f0.f13385a;
        h0.c(handler);
        this.f13437h = new r(sVar, handler, ((t.x1) nVar.f13493c).j());
        boolean z5 = this.f13441m;
        a0 a0Var = this.f13435f;
        if (!z5) {
            ((Queue) a0Var.f13322j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        r rVar = this.f13437h;
        rVar.setBackgroundColor(0);
        rVar.getSettings().setJavaScriptEnabled(true);
        rVar.getSettings().setAllowFileAccess(false);
        rVar.getSettings().setAllowContentAccess(false);
        rVar.setWebViewClient(new bj.h(rVar));
        if (!this.f13441m) {
            a0Var.a((Queue) a0Var.f13322j.get(), 3, 2, null);
        }
        this.f13438j.set(new j(gVar, fVar));
        r rVar2 = this.f13437h;
        p pVar = this.f13433d;
        rVar2.loadDataWithBaseURL(pVar.f13511a, pVar.f13512b, "text/html", "UTF-8", null);
        handler.postDelayed(new h(0, this), 10000L);
    }

    public final void c(n1 n1Var) {
        j jVar = (j) this.f13438j.getAndSet(null);
        if (jVar == null) {
            return;
        }
        if (!this.f13441m) {
            String message = n1Var.getMessage();
            boolean z5 = this.f13442n;
            a0 a0Var = this.f13435f;
            if (z5) {
                a0Var.a((Queue) a0Var.i.get(), 10, 11, message);
            } else {
                a0Var.a((Queue) a0Var.f13320g.get(), 4, 5, message);
            }
        }
        jVar.a(n1Var.a());
    }

    public final void d(n1 n1Var) {
        if (this.f13441m) {
            return;
        }
        String message = n1Var == null ? null : n1Var.getMessage();
        boolean z5 = this.f13442n;
        a0 a0Var = this.f13435f;
        if (z5) {
            a0Var.a((Queue) a0Var.i.get(), 10, 11, message);
        } else {
            a0Var.a((Queue) a0Var.f13321h.get(), 6, 7, message);
        }
    }
}
