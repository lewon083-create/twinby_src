package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 implements e80, k81, uh0, o31 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ku0 f7311d = new ku0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f7313c;

    public /* synthetic */ ku0() {
        this.f7312b = 0;
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        ((t60) obj).j(this.f7313c);
    }

    @Override // com.google.android.gms.internal.ads.uh0
    public Object h() {
        switch (this.f7312b) {
            case 4:
                y5 y5Var = nz.A;
                if (y5Var.f12499c) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f7313c.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!y5Var.f12499c) {
                    y5Var.f12499c = true;
                    lu0 lu0VarB = lu0.b();
                    lu0VarB.getClass();
                    lu0VarB.f7629b = new cu0(new Handler(), applicationContext, lu0VarB);
                    boolean z5 = applicationContext instanceof Application;
                    if (z5) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(eu0.f5068e);
                    }
                    gr.f5890c = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = su0.f10392a;
                    su0.f10394c = applicationContext.getResources().getDisplayMetrics().density;
                    su0.f10392a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new tu0(0 == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    f7311d.f7313c = applicationContext.getApplicationContext();
                    du0 du0Var = du0.f4673e;
                    if (!du0Var.f4674a) {
                        hu0 hu0Var = (hu0) du0Var.f4677d;
                        if (z5) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(hu0Var);
                        }
                        hu0Var.f6264d = du0Var;
                        hu0Var.f6262b = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        hu0Var.f6263c = runningAppProcessInfo.importance == 100;
                        du0Var.f4675b = hu0Var.f6263c;
                        du0Var.f4674a = true;
                    }
                    mu0.f8023d.f8024a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new bj.g(), intentFilter);
                }
                return Boolean.valueOf(y5Var.f12499c);
            default:
                new x1();
                return new bw1(this.f7313c);
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void mo6i(Object obj) {
        if (((Boolean) ul.f10975j.r()).booleanValue()) {
            pn1.z(this.f7313c);
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        if (((Boolean) ul.f10974h.r()).booleanValue() && (th2 instanceof t9.n)) {
            pn1.z(this.f7313c);
        }
    }

    public /* synthetic */ ku0(Context context, int i) {
        this.f7312b = i;
        this.f7313c = context;
    }
}
