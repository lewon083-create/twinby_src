package s9;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.kt;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.yk;
import ob.h4;
import ob.z;
import q9.s;
import t9.c0;
import t9.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kt implements mh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdOverlayInfoParcel f32800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f32801d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32805h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32802e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32803f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32804g = false;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32806j = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        boolean z5 = false;
        this.f32800c = adOverlayInfoParcel;
        this.f32801d = activity;
        wk wkVar = al.f3269x5;
        s sVar = s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if ((((Boolean) ykVar.a(wkVar)).booleanValue() || ((Boolean) ykVar2.a(al.f3284y5)).booleanValue() || ((Boolean) ykVar2.a(al.C5)).booleanValue()) && (eVar = adOverlayInfoParcel.f2544b) != null && eVar.f32838k && Build.MANUFACTURER.matches((String) ykVar2.a(al.A5)) && Build.MODEL.matches((String) ykVar2.a(al.B5))) {
            z5 = true;
        }
        this.f32805h = z5;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void K() {
        if (this.f32801d.isFinishing()) {
            l4();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void T3(Bundle bundle) {
        l lVar;
        wk wkVar = al.f2973da;
        s sVar = s.f31967e;
        boolean zBooleanValue = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue();
        Activity activity = this.f32801d;
        if (zBooleanValue && !this.f32804g) {
            activity.requestWindowFeature(1);
        }
        boolean z5 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z5 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32800c;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z5) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            q9.a aVar = adOverlayInfoParcel.f2545c;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            v80 v80Var = adOverlayInfoParcel.f2563v;
            if (v80Var != null) {
                v80Var.J();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lVar = adOverlayInfoParcel.f2546d) != null) {
                lVar.m();
            }
        }
        if (this.f32805h) {
            if (((Boolean) sVar.f31970c.a(al.C5)).booleanValue()) {
                p9.k.C.f31301g.v(this);
            }
        }
        e eVar = adOverlayInfoParcel.f2544b;
        c cVar = adOverlayInfoParcel.f2551j;
        z zVar = p9.k.C.f31295a;
        a aVar2 = eVar.f32837j;
        Activity activity2 = this.f32801d;
        if (z.c(activity2, eVar, cVar, aVar2, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void W(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f32802e);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void c() {
        l lVar = this.f32800c.f2546d;
        if (lVar != null) {
            lVar.d3();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void e() {
        this.i = false;
        l lVar = this.f32800c.f2546d;
        if (lVar != null) {
            lVar.L1();
        }
        if (this.f32801d.isFinishing()) {
            l4();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final boolean k() {
        return ((Boolean) s.f31967e.f31970c.a(al.f3284y5)).booleanValue() && this.f32805h && this.i;
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void l0(boolean z5) {
        if (!z5) {
            this.f32806j = true;
        } else if (this.f32806j) {
            u9.i.c("Foregrounded: finishing activity from LauncherOverlay");
            this.f32801d.finish();
        }
    }

    public final synchronized void l4() {
        try {
            if (!this.f32803f) {
                l lVar = this.f32800c.f2546d;
                if (lVar != null) {
                    lVar.E0(4);
                }
                this.f32803f = true;
                if (this.f32805h) {
                    if (((Boolean) s.f31967e.f31970c.a(al.C5)).booleanValue()) {
                        p9.k.C.f31301g.x(this);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void n() {
        if (this.f32802e) {
            c0.m("LauncherOverlay finishing activity");
            this.f32801d.finish();
            return;
        }
        this.f32802e = true;
        this.i = true;
        l lVar = this.f32800c.f2546d;
        if (lVar != null) {
            lVar.i2();
        }
        if (this.f32805h) {
            if (((Boolean) s.f31967e.f31970c.a(al.f3269x5)).booleanValue()) {
                g0.f33596l.postDelayed(new h4(9, this), ((Integer) r1.f31970c.a(al.z5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void v() {
        this.f32804g = true;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void y() {
        if (this.f32801d.isFinishing()) {
            l4();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void L(xa.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void k1(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void s1(int i, int i10, Intent intent) {
    }
}
