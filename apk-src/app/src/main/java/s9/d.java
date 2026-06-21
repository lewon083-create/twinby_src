package s9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.kt;
import com.google.android.gms.internal.ads.l80;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.sd0;
import com.google.android.gms.internal.ads.sh0;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.tt0;
import com.google.android.gms.internal.ads.ut0;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.vh0;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.yk;
import com.google.android.gms.internal.ads.yt0;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.ads.zw;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import ob.h4;
import org.json.JSONException;
import org.json.JSONObject;
import q9.s;
import t9.c0;
import t9.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kt {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f32807z = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f32808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdOverlayInfoParcel f32809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sz f32810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public la.m f32811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f32812g;
    public FrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f32814j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f32817m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h4 f32821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f32822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f32823s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Toolbar f32827w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f32829y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32813h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32815k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32816l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32818n = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f32828x = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f32819o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.google.android.material.datepicker.l f32820p = new com.google.android.material.datepicker.l(2, this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f32824t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f32825u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f32826v = true;

    public d(Activity activity, int i) {
        this.f32829y = i;
        this.f32808c = activity;
    }

    public static final void p4(View view, wh0 wh0Var) {
        if (wh0Var == null || view == null) {
            return;
        }
        if (((Boolean) s.f31967e.f31970c.a(al.f2955c6)).booleanValue() && ((tt0) wh0Var.f11812b.f7136h) == tt0.HTML) {
            return;
        }
        l80 l80Var = p9.k.C.f31317x;
        ut0 ut0Var = wh0Var.f11811a;
        l80Var.getClass();
        l80.m(ut0Var, view);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void K() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f2546d) != null) {
            lVar.T0();
        }
        if (((Boolean) s.f31967e.f31970c.a(al.Q5)).booleanValue() && this.f32810e != null && (!this.f32808c.isFinishing() || this.f32811f == null)) {
            this.f32810e.onPause();
        }
        l4();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void L(xa.a aVar) {
        n4((Configuration) xa.b.X1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.lt
    public void T3(Bundle bundle) {
        l lVar;
        switch (this.f32829y) {
            case 4:
                c0.m("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f32828x = 4;
                this.f32808c.finish();
                return;
            default:
                if (!this.f32823s) {
                    this.f32808c.requestWindowFeature(1);
                }
                this.f32815k = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    Activity activity = this.f32808c;
                    AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
                    this.f32809d = adOverlayInfoParcelA;
                    if (adOverlayInfoParcelA == null) {
                        throw new g("Could not get info for ad overlay.");
                    }
                    if (adOverlayInfoParcelA.f2565x) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.setShowWhenLocked(true);
                        } else {
                            activity.getWindow().addFlags(524288);
                        }
                    }
                    if (this.f32809d.f2555n.f34367d > 7500000) {
                        this.f32828x = 4;
                    }
                    if (activity.getIntent() != null) {
                        this.f32826v = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
                    p9.f fVar = adOverlayInfoParcel.f2557p;
                    if (fVar != null) {
                        boolean z5 = fVar.f31278b;
                        this.f32816l = z5;
                        if (z5) {
                            if (adOverlayInfoParcel.f2553l != 5 && fVar.f31283g != -1) {
                                new zw(this).B();
                            }
                        }
                    } else if (adOverlayInfoParcel.f2553l == 5) {
                        this.f32816l = true;
                        if (adOverlayInfoParcel.f2553l != 5) {
                            new zw(this).B();
                        }
                    } else {
                        this.f32816l = false;
                    }
                    if (bundle == null) {
                        if (this.f32826v) {
                            o60 o60Var = this.f32809d.f2562u;
                            if (o60Var != null) {
                                synchronized (o60Var) {
                                    ScheduledFuture scheduledFuture = o60Var.f8619e;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            l lVar2 = this.f32809d.f2546d;
                            if (lVar2 != null) {
                                lVar2.m();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f32809d;
                        if (adOverlayInfoParcel2.f2553l != 1) {
                            q9.a aVar = adOverlayInfoParcel2.f2545c;
                            if (aVar != null) {
                                aVar.onAdClicked();
                            }
                            v80 v80Var = this.f32809d.f2563v;
                            if (v80Var != null) {
                                v80Var.J();
                            }
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f32809d;
                    if (adOverlayInfoParcel3 != null && (lVar = adOverlayInfoParcel3.f2546d) != null) {
                        lVar.w1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f32809d;
                    h hVar = new h(activity, adOverlayInfoParcel4.f2556o, adOverlayInfoParcel4.f2555n.f34365b, adOverlayInfoParcel4.f2561t);
                    this.f32817m = hVar;
                    hVar.setId(1000);
                    p9.k.C.f31300f.o(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.f32809d;
                    int i = adOverlayInfoParcel5.f2553l;
                    if (i == 1) {
                        t4(false);
                        return;
                    }
                    if (i == 2) {
                        this.f32811f = new la.m(adOverlayInfoParcel5.f2547e);
                        t4(false);
                        return;
                    } else if (i == 3) {
                        t4(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new g("Could not determine ad overlay type.");
                        }
                        t4(false);
                        return;
                    }
                } catch (g e3) {
                    u9.i.h(e3.getMessage());
                    this.f32828x = 4;
                    this.f32808c.finish();
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void W(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f32815k);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void c() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f2546d) == null) {
            return;
        }
        lVar.d3();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void d() {
        l lVar;
        if (((Boolean) s.f31967e.f31970c.a(al.Q5)).booleanValue()) {
            sz szVar = this.f32810e;
            if (szVar == null || szVar.A0()) {
                u9.i.h("The webview does not exist. Ignoring action.");
            } else {
                this.f32810e.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f2546d) == null) {
            return;
        }
        lVar.X1();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void e() {
        l lVar;
        h();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f2546d) != null) {
            lVar.L1();
        }
        if (!((Boolean) s.f31967e.f31970c.a(al.Q5)).booleanValue() && this.f32810e != null && (!this.f32808c.isFinishing() || this.f32811f == null)) {
            this.f32810e.onPause();
        }
        l4();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void f() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f2546d) == null) {
            return;
        }
        lVar.D0();
    }

    public final void h() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel != null && this.f32813h) {
            s4(adOverlayInfoParcel.f2552k);
        }
        if (this.i != null) {
            this.f32808c.setContentView(this.f32817m);
            this.f32823s = true;
            this.i.removeAllViews();
            this.i = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f32814j;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f32814j = null;
        }
        this.f32813h = false;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void i() {
        this.f32828x = 1;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final boolean k() {
        this.f32828x = 1;
        if (this.f32810e == null) {
            return true;
        }
        if (((Boolean) s.f31967e.f31970c.a(al.fa)).booleanValue() && this.f32810e.canGoBack()) {
            this.f32810e.goBack();
            return false;
        }
        boolean zR1 = this.f32810e.r1();
        if (!zR1) {
            this.f32810e.c("onbackblocked", Collections.EMPTY_MAP);
        }
        return zR1;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void k1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f32808c;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
            try {
                adOverlayInfoParcel.f2564w.M2(strArr, iArr, new xa.b(new jh0(activity, adOverlayInfoParcel.f2553l == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void l4() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        l lVar;
        if (!this.f32808c.isFinishing() || this.f32824t) {
            return;
        }
        this.f32824t = true;
        sz szVar = this.f32810e;
        if (szVar != null) {
            szVar.c1(this.f32828x - 1);
            synchronized (this.f32819o) {
                try {
                    if (!this.f32822r && this.f32810e.k1()) {
                        wk wkVar = al.O5;
                        s sVar = s.f31967e;
                        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && !this.f32825u && (adOverlayInfoParcel = this.f32809d) != null && (lVar = adOverlayInfoParcel.f2546d) != null) {
                            lVar.A2();
                        }
                        h4 h4Var = new h4(10, this);
                        this.f32821q = h4Var;
                        g0.f33596l.postDelayed(h4Var, ((Long) sVar.f31970c.a(al.v1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        m4();
    }

    public final void m4() {
        sz szVar;
        l lVar;
        if (this.f32825u) {
            return;
        }
        this.f32825u = true;
        sz szVar2 = this.f32810e;
        if (szVar2 != null) {
            this.f32817m.removeView(szVar2.i0());
            la.m mVar = this.f32811f;
            if (mVar != null) {
                this.f32810e.L0((Context) mVar.f28099d);
                this.f32810e.q1(false);
                if (((Boolean) s.f31967e.f31970c.a(al.Td)).booleanValue() && this.f32810e.getParent() != null) {
                    ((ViewGroup) this.f32810e.getParent()).removeView(this.f32810e.i0());
                }
                ViewGroup viewGroup = (ViewGroup) this.f32811f.f28101f;
                View viewI0 = this.f32810e.i0();
                la.m mVar2 = this.f32811f;
                viewGroup.addView(viewI0, mVar2.f28098c, (ViewGroup.LayoutParams) mVar2.f28100e);
                this.f32811f = null;
            } else {
                Activity activity = this.f32808c;
                if (activity.getApplicationContext() != null) {
                    this.f32810e.L0(activity.getApplicationContext());
                }
            }
            this.f32810e = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f2546d) != null) {
            lVar.E0(this.f32828x);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f32809d;
        if (adOverlayInfoParcel2 == null || (szVar = adOverlayInfoParcel2.f2547e) == null) {
            return;
        }
        p4(this.f32809d.f2547e.i0(), szVar.g0());
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void n() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f2546d) != null) {
            lVar.i2();
        }
        n4(this.f32808c.getResources().getConfiguration());
        if (((Boolean) s.f31967e.f31970c.a(al.Q5)).booleanValue()) {
            return;
        }
        sz szVar = this.f32810e;
        if (szVar == null || szVar.A0()) {
            u9.i.h("The webview does not exist. Ignoring action.");
        } else {
            this.f32810e.onResume();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n4(android.content.res.Configuration r15) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.d.n4(android.content.res.Configuration):void");
    }

    public final void o4(View view) {
        wh0 wh0VarG0;
        vh0 vh0VarN0;
        sz szVar = this.f32810e;
        if (szVar == null) {
            return;
        }
        wk wkVar = al.f2969d6;
        s sVar = s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && (vh0VarN0 = szVar.N0()) != null) {
            synchronized (vh0VarN0) {
                yt0 yt0Var = vh0VarN0.f11386f;
                if (yt0Var != null) {
                    p9.k.C.f31317x.getClass();
                    l80.s(new th0(0, yt0Var, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) sVar.f31970c.a(al.f2955c6)).booleanValue() && (wh0VarG0 = szVar.g0()) != null && ((tt0) wh0VarG0.f11812b.f7136h) == tt0.HTML) {
            l80 l80Var = p9.k.C.f31317x;
            ut0 ut0Var = wh0VarG0.f11811a;
            l80Var.getClass();
            l80.s(new sh0(ut0Var, view, 0));
        }
    }

    public final void q4(boolean z5) {
        if (this.f32809d.f2565x) {
            return;
        }
        wk wkVar = al.T5;
        s sVar = s.f31967e;
        int iIntValue = ((Integer) sVar.f31970c.a(wkVar)).intValue();
        boolean z10 = ((Boolean) sVar.f31970c.a(al.y1)).booleanValue() || z5;
        nl0 nl0Var = new nl0();
        nl0Var.f8356a = 0;
        nl0Var.f8357b = 0;
        nl0Var.f8358c = 0;
        nl0Var.f8359d = 50;
        nl0Var.f8356a = true != z10 ? 0 : iIntValue;
        nl0Var.f8357b = true != z10 ? iIntValue : 0;
        nl0Var.f8358c = iIntValue;
        this.f32812g = new m(this.f32808c, nl0Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        r4(z5, this.f32809d.f2550h);
        this.f32817m.addView(this.f32812g, layoutParams);
        o4(this.f32812g);
    }

    public final void r4(boolean z5, boolean z10) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        p9.f fVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        p9.f fVar2;
        wk wkVar = al.f3249w1;
        s sVar = s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        boolean zBooleanValue = ((Boolean) ykVar.a(wkVar)).booleanValue();
        boolean z11 = true;
        boolean z12 = zBooleanValue && (adOverlayInfoParcel2 = this.f32809d) != null && (fVar2 = adOverlayInfoParcel2.f2557p) != null && fVar2.i;
        boolean z13 = ((Boolean) ykVar2.a(al.f3265x1)).booleanValue() && (adOverlayInfoParcel = this.f32809d) != null && (fVar = adOverlayInfoParcel.f2557p) != null && fVar.f31285j;
        if (z5 && z10 && z12 && !z13) {
            sz szVar = this.f32810e;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (szVar != null) {
                    szVar.h("onError", jSONObjectPut);
                }
            } catch (JSONException e3) {
                u9.i.f("Error occurred while dispatching error event.", e3);
            }
        }
        m mVar = this.f32812g;
        if (mVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            ImageButton imageButton = mVar.f32856b;
            if (!z11) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) ykVar2.a(al.A1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void s1(int i, int i10, Intent intent) {
        sd0 sd0Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            wk wkVar = al.f3187re;
            s sVar = s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i10);
                c0.m(sb2.toString());
                sz szVar = this.f32810e;
                if (szVar == null || szVar.q0() == null || (sd0Var = szVar.q0().A) == null || (adOverlayInfoParcel = this.f32809d) == null || !((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    return;
                }
                zd1 zd1VarA = sd0Var.a();
                zd1VarA.v("action", "hilca");
                String str = adOverlayInfoParcel.f2559r;
                if (str == null) {
                    str = "";
                }
                zd1VarA.v("gqi", str);
                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length());
                sb3.append(i10);
                zd1VarA.v("hilr", sb3.toString());
                if (i10 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zd1VarA.v("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zd1VarA.v("hills", stringExtra2);
                    }
                }
                zd1VarA.y();
            }
        }
    }

    public final void s4(int i) {
        int i10;
        Activity activity = this.f32808c;
        int i11 = activity.getApplicationInfo().targetSdkVersion;
        wk wkVar = al.L6;
        s sVar = s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (i11 < ((Integer) ykVar.a(wkVar)).intValue() || activity.getApplicationInfo().targetSdkVersion > ((Integer) ykVar2.a(al.M6)).intValue() || (i10 = Build.VERSION.SDK_INT) < ((Integer) ykVar2.a(al.N6)).intValue() || i10 > ((Integer) ykVar2.a(al.O6)).intValue()) {
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable th2) {
                p9.k.C.f31302h.e("AdOverlay.setRequestedOrientation", th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t4(boolean r44) throws s9.g {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.d.t4(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void v() {
        this.f32823s = true;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void y() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f2546d) != null) {
            lVar.p1();
        }
        sz szVar = this.f32810e;
        if (szVar != null) {
            try {
                this.f32817m.removeView(szVar.i0());
            } catch (NullPointerException unused) {
            }
        }
        l4();
    }

    public final void z() {
        this.f32828x = 3;
        Activity activity = this.f32808c;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f32809d;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f2553l != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        sz szVar = this.f32810e;
        if (szVar != null) {
            szVar.j1(null);
        }
    }
}
