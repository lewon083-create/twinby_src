package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.twinby.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vx extends FrameLayout implements rx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sz f11505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f11506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f11507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final el f11508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ux f11509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sx f11511h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f11518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Bitmap f11519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f11520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11521s;

    public vx(Context context, sz szVar, int i, boolean z5, el elVar, cy cyVar, sd0 sd0Var) {
        sx qxVar;
        sx ozVar;
        super(context);
        this.f11505b = szVar;
        this.f11508e = elVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11506c = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        pa.c0.i(szVar.n());
        Object obj = szVar.n().f27978c;
        dy dyVar = new dy(context, szVar.v(), szVar.p(), elVar, szVar.f());
        if (i == 3) {
            ozVar = new oz(context, dyVar);
        } else {
            if (i == 2) {
                szVar.m0().getClass();
                qxVar = new jy(context, dyVar, szVar, z5, cyVar, sd0Var);
            } else {
                qxVar = new qx(context, szVar, z5, szVar.m0().b(), new dy(context, szVar.v(), szVar.p(), elVar, szVar.f()), sd0Var);
            }
            ozVar = qxVar;
        }
        this.f11511h = ozVar;
        View view = new View(context);
        this.f11507d = view;
        view.setBackgroundColor(0);
        frameLayout.addView(ozVar, new FrameLayout.LayoutParams(-1, -1, 17));
        wk wkVar = al.f3010g0;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) sVar.f31970c.a(al.f2963d0)).booleanValue()) {
            a();
        }
        this.f11520r = new ImageView(context);
        this.f11510g = ((Long) sVar.f31970c.a(al.f3041i0)).longValue();
        boolean zBooleanValue = ((Boolean) sVar.f31970c.a(al.f2994f0)).booleanValue();
        this.f11514l = zBooleanValue;
        elVar.c("spinner_used", true != zBooleanValue ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        this.f11509f = new ux(this);
        ozVar.e(this);
    }

    public final void a() {
        sx sxVar = this.f11511h;
        if (sxVar == null) {
            return;
        }
        TextView textView = new TextView(sxVar.getContext());
        Resources resourcesC = p9.k.C.f31302h.c();
        textView.setText(String.valueOf(resourcesC == null ? "AdMob - " : resourcesC.getString(R.string.watermark_label_prefix)).concat(sxVar.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f11506c;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        sx sxVar = this.f11511h;
        if (sxVar == null) {
            return;
        }
        long jK = sxVar.k();
        if (this.f11515m == jK || jK <= 0) {
            return;
        }
        float f10 = jK / 1000.0f;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(sxVar.s());
            String strValueOf3 = String.valueOf(sxVar.r());
            String strValueOf4 = String.valueOf(sxVar.q());
            String strValueOf5 = String.valueOf(sxVar.t());
            p9.k.C.f31304k.getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f10));
        }
        this.f11515m = jK;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        sx sxVar = this.f11511h;
        Integer numZ = sxVar != null ? sxVar.z() : null;
        if (numZ != null) {
            map.put("playerId", numZ.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f11505b.c("onVideoEvent", map);
    }

    public final void d() {
        sz szVar = this.f11505b;
        if (szVar.d() == null || !this.f11512j || this.f11513k) {
            return;
        }
        szVar.d().getWindow().clearFlags(128);
        this.f11512j = false;
    }

    public final void e() {
        sx sxVar = this.f11511h;
        if (sxVar != null && this.f11516n == 0) {
            c("canplaythrough", "duration", String.valueOf(sxVar.j() / 1000.0f), "videoWidth", String.valueOf(sxVar.n()), "videoHeight", String.valueOf(sxVar.p()));
        }
    }

    public final void f() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3147p2)).booleanValue()) {
            ux uxVar = this.f11509f;
            uxVar.f11124d = false;
            t9.d0 d0Var = t9.g0.f33596l;
            d0Var.removeCallbacks(uxVar);
            d0Var.postDelayed(uxVar, 250L);
        }
        sz szVar = this.f11505b;
        if (szVar.d() != null && !this.f11512j) {
            boolean z5 = (szVar.d().getWindow().getAttributes().flags & 128) != 0;
            this.f11513k = z5;
            if (!z5) {
                szVar.d().getWindow().addFlags(128);
                this.f11512j = true;
            }
        }
        this.i = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.f11509f.a();
            sx sxVar = this.f11511h;
            if (sxVar != null) {
                hx.f6284f.execute(new s(19, sxVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c("pause", new String[0]);
        d();
        this.i = false;
    }

    public final void h() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3147p2)).booleanValue()) {
            this.f11509f.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.f11521s && this.f11519q != null) {
            ImageView imageView = this.f11520r;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f11519q);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f11506c;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f11509f.a();
        this.f11516n = this.f11515m;
        t9.g0.f33596l.post(new tx(this, 1));
    }

    public final void j(int i, int i10) {
        if (this.f11514l) {
            wk wkVar = al.h0;
            q9.s sVar = q9.s.f31967e;
            int iMax = Math.max(i / ((Integer) sVar.f31970c.a(wkVar)).intValue(), 1);
            int iMax2 = Math.max(i10 / ((Integer) sVar.f31970c.a(wkVar)).intValue(), 1);
            Bitmap bitmap = this.f11519q;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f11519q.getHeight() == iMax2) {
                return;
            }
            this.f11519q = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f11521s = false;
        }
    }

    public final void k() {
        this.f11507d.setVisibility(4);
        t9.g0.f33596l.post(new tx(this, 2));
    }

    public final void l(int i, int i10, int i11, int i12) {
        if (t9.c0.o()) {
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i10).length() + 3 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length());
            om1.u(sb2, "Set video bounds to x:", i, ";y:", i10);
            sb2.append(";w:");
            sb2.append(i11);
            sb2.append(";h:");
            sb2.append(i12);
            t9.c0.m(sb2.toString());
        }
        if (i11 == 0 || i12 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.setMargins(i, i10, 0, 0);
        this.f11506c.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        ux uxVar = this.f11509f;
        if (z5) {
            uxVar.f11124d = false;
            t9.d0 d0Var = t9.g0.f33596l;
            d0Var.removeCallbacks(uxVar);
            d0Var.postDelayed(uxVar, 250L);
        } else {
            uxVar.a();
            this.f11516n = this.f11515m;
        }
        t9.g0.f33596l.post(new ux(this, z5, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z5 = false;
        ux uxVar = this.f11509f;
        if (i == 0) {
            uxVar.f11124d = false;
            t9.d0 d0Var = t9.g0.f33596l;
            d0Var.removeCallbacks(uxVar);
            d0Var.postDelayed(uxVar, 250L);
            z5 = true;
        } else {
            uxVar.a();
            this.f11516n = this.f11515m;
        }
        t9.g0.f33596l.post(new ux(this, z5, 0));
    }
}
