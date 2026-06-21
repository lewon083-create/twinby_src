package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jy extends sx implements TextureView.SurfaceTextureListener, wx {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sz f6989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dy f6990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cy f6991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sd0 f6992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vx f6993h;
    public Surface i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jz f6994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f6995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f6996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ay f6999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f7005u;

    public jy(Context context, dy dyVar, sz szVar, boolean z5, cy cyVar, sd0 sd0Var) {
        super(context);
        this.f6998n = 1;
        this.f6989d = szVar;
        this.f6990e = dyVar;
        this.f7000p = z5;
        this.f6991f = cyVar;
        dyVar.a(this);
        this.f6992g = sd0Var;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        l7.o.t(sb2, str, "/", canonicalName, StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f6996l = new String[]{str};
        } else {
            this.f6996l = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f6995k;
        boolean z5 = false;
        if (this.f6991f.f4380k && str2 != null && !str.equals(str2) && this.f6998n == 4) {
            z5 = true;
        }
        this.f6995k = str;
        F(z5, num);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void B(int i) {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            ez ezVar = jzVar.f7011c;
            synchronized (ezVar) {
                ezVar.f5145b = ((long) i) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void C(int i) {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            ez ezVar = jzVar.f7011c;
            synchronized (ezVar) {
                ezVar.f5146c = ((long) i) * 1000;
            }
        }
    }

    public final boolean D() {
        jz jzVar = this.f6994j;
        return (jzVar == null || jzVar.f7016h == null || this.f6997m) ? false : true;
    }

    public final boolean E() {
        return D() && this.f6998n != 1;
    }

    public final void F(boolean z5, Integer num) {
        jz jzVar = this.f6994j;
        if (jzVar != null && !z5) {
            jzVar.f7025r = num;
            return;
        }
        if (this.f6995k == null || this.i == null) {
            return;
        }
        if (z5) {
            if (!D()) {
                u9.i.h("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            vu1 vu1Var = jzVar.f7016h;
            vu1Var.f11492e.b();
            vu1Var.f11491d.r();
            G();
        }
        if (this.f6995k.startsWith("cache:")) {
            xy xyVarJ0 = this.f6989d.j0(this.f6995k);
            if (xyVarJ0 instanceof bz) {
                bz bzVar = (bz) xyVarJ0;
                synchronized (bzVar) {
                    bzVar.f3971h = true;
                    bzVar.notify();
                }
                jz jzVar2 = bzVar.f3968e;
                jzVar2.f7018k = null;
                bzVar.f3968e = null;
                this.f6994j = jzVar2;
                jzVar2.f7025r = num;
                if (jzVar2.f7016h == null) {
                    u9.i.h("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(xyVarJ0 instanceof az)) {
                    u9.i.h("Stream cache miss: ".concat(String.valueOf(this.f6995k)));
                    return;
                }
                az azVar = (az) xyVarJ0;
                sz szVar = this.f6989d;
                p9.k.C.f31297c.F(szVar.getContext(), szVar.v().f34365b);
                synchronized (azVar.f3492l) {
                    try {
                        ByteBuffer byteBuffer = azVar.f3490j;
                        if (byteBuffer != null && !azVar.f3491k) {
                            byteBuffer.flip();
                            azVar.f3491k = true;
                        }
                        azVar.f3488g = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ByteBuffer byteBuffer2 = azVar.f3490j;
                boolean z10 = azVar.f3495o;
                String str = azVar.f3486e;
                if (str == null) {
                    u9.i.h("Stream cache URL is null.");
                    return;
                }
                cy cyVar = this.f6991f;
                sz szVar2 = this.f6989d;
                jz jzVar3 = new jz(szVar2.getContext(), cyVar, szVar2, num);
                u9.i.g("ExoPlayerAdapter initialized.");
                this.f6994j = jzVar3;
                jzVar3.u(new Uri[]{Uri.parse(str)}, byteBuffer2, z10);
            }
        } else {
            cy cyVar2 = this.f6991f;
            sz szVar3 = this.f6989d;
            jz jzVar4 = new jz(szVar3.getContext(), cyVar2, szVar3, num);
            u9.i.g("ExoPlayerAdapter initialized.");
            this.f6994j = jzVar4;
            sz szVar4 = this.f6989d;
            p9.k.C.f31297c.F(szVar4.getContext(), szVar4.v().f34365b);
            Uri[] uriArr = new Uri[this.f6996l.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f6996l;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            jz jzVar5 = this.f6994j;
            jzVar5.getClass();
            jzVar5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f6994j.f7018k = this;
        H(this.i);
        vu1 vu1Var2 = this.f6994j.f7016h;
        if (vu1Var2 != null) {
            int iC0 = vu1Var2.c0();
            this.f6998n = iC0;
            if (iC0 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.f6994j != null) {
            H(null);
            jz jzVar = this.f6994j;
            if (jzVar != null) {
                jzVar.f7018k = null;
                vu1 vu1Var = jzVar.f7016h;
                if (vu1Var != null) {
                    vu1Var.f11492e.b();
                    vu1Var.f11491d.H1(jzVar);
                    vu1 vu1Var2 = jzVar.f7016h;
                    vu1Var2.f11492e.b();
                    vu1Var2.f11491d.I1();
                    jzVar.f7016h = null;
                    jz.f7009w.decrementAndGet();
                }
                this.f6994j = null;
            }
            this.f6998n = 1;
            this.f6997m = false;
            this.f7001q = false;
            this.f7002r = false;
        }
    }

    public final void H(Surface surface) {
        jz jzVar = this.f6994j;
        if (jzVar == null) {
            u9.i.h("Trying to set surface before player is initialized.");
            return;
        }
        try {
            vu1 vu1Var = jzVar.f7016h;
            if (vu1Var != null) {
                vu1Var.f11492e.b();
                ot1 ot1Var = vu1Var.f11491d;
                ot1Var.J0();
                ot1Var.U1(surface);
                int i = surface == null ? 0 : -1;
                ot1Var.V1(i, i);
            }
        } catch (IOException e3) {
            u9.i.i("", e3);
        }
    }

    public final void I() {
        if (this.f7001q) {
            return;
        }
        this.f7001q = true;
        t9.g0.f33596l.post(new gy(this, 0));
        o();
        dy dyVar = this.f6990e;
        if (dyVar.i && !dyVar.f4732j) {
            c80.g(dyVar.f4728e, dyVar.f4727d, "vfr2");
            dyVar.f4732j = true;
        }
        if (this.f7002r) {
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void Y(int i) {
        jz jzVar;
        if (this.f6998n != i) {
            this.f6998n = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f6991f.f4371a && (jzVar = this.f6994j) != null) {
                jzVar.s(false);
            }
            this.f6990e.f4735m = false;
            fy fyVar = this.f10425c;
            fyVar.f5503d = false;
            fyVar.a();
            t9.g0.f33596l.post(new gy(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void a(int i) {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            ez ezVar = jzVar.f7011c;
            synchronized (ezVar) {
                ezVar.f5147d = ((long) i) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void b(int i) {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            ez ezVar = jzVar.f7011c;
            synchronized (ezVar) {
                ezVar.f5148e = ((long) i) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void c(int i) {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            Iterator it = jzVar.f7028u.iterator();
            while (it.hasNext()) {
                dz dzVar = (dz) ((WeakReference) it.next()).get();
                if (dzVar != null) {
                    dzVar.f4765s = i;
                    for (Socket socket : dzVar.f4766t) {
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(dzVar.f4765s);
                            } catch (SocketException e3) {
                                u9.i.i("Failed to update receive buffer size.", e3);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String d() {
        return "ExoPlayer/2".concat(true != this.f7000p ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void e(vx vxVar) {
        this.f6993h = vxVar;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void g() {
        if (D()) {
            vu1 vu1Var = this.f6994j.f7016h;
            vu1Var.f11492e.b();
            vu1Var.f11491d.r();
            G();
        }
        dy dyVar = this.f6990e;
        dyVar.f4735m = false;
        fy fyVar = this.f10425c;
        fyVar.f5503d = false;
        fyVar.a();
        dyVar.b();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void h() {
        jz jzVar;
        if (!E()) {
            this.f7002r = true;
            return;
        }
        if (this.f6991f.f4371a && (jzVar = this.f6994j) != null) {
            jzVar.s(true);
        }
        vu1 vu1Var = this.f6994j.f7016h;
        vu1Var.f11492e.b();
        vu1Var.f11491d.Y1(true);
        this.f6990e.d();
        fy fyVar = this.f10425c;
        fyVar.f5503d = true;
        fyVar.a();
        this.f10424b.f12369c = true;
        t9.g0.f33596l.post(new gy(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void i() {
        jz jzVar;
        if (E()) {
            if (this.f6991f.f4371a && (jzVar = this.f6994j) != null) {
                jzVar.s(false);
            }
            vu1 vu1Var = this.f6994j.f7016h;
            vu1Var.f11492e.b();
            vu1Var.f11491d.Y1(false);
            this.f6990e.f4735m = false;
            fy fyVar = this.f10425c;
            fyVar.f5503d = false;
            fyVar.a();
            t9.g0.f33596l.post(new gy(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int j() {
        if (E()) {
            return (int) this.f6994j.f7016h.F1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int k() {
        if (E()) {
            return (int) this.f6994j.f7016h.B1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void l(int i) {
        if (E()) {
            long j10 = i;
            vu1 vu1Var = this.f6994j.f7016h;
            vu1Var.V(vu1Var.z1(), j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void m(float f10, float f11) {
        ay ayVar = this.f6999o;
        if (ayVar != null) {
            ayVar.c(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int n() {
        return this.f7003s;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void o() {
        t9.g0.f33596l.post(new gy(this, 7));
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.f7005u;
        if (f10 != 0.0f && this.f6999o == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        ay ayVar = this.f6999o;
        if (ayVar != null) {
            ayVar.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        jz jzVar;
        float f10;
        int i11;
        SurfaceTexture surfaceTexture2;
        sd0 sd0Var;
        if (this.f7000p) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3292ye)).booleanValue() && (sd0Var = this.f6992g) != null) {
                zd1 zd1VarA = sd0Var.a();
                zd1VarA.v("action", "svp_aepv");
                zd1VarA.w();
            }
            ay ayVar = new ay(getContext());
            this.f6999o = ayVar;
            ayVar.f3465n = i;
            ayVar.f3464m = i10;
            ayVar.f3467p = surfaceTexture;
            ayVar.start();
            if (ayVar.f3467p == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    ayVar.f3472u.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = ayVar.f3466o;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f6999o.b();
                this.f6999o = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.i = surface;
        if (this.f6994j == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f6991f.f4371a && (jzVar = this.f6994j) != null) {
                jzVar.s(true);
            }
        }
        int i12 = this.f7003s;
        if (i12 == 0 || (i11 = this.f7004t) == 0) {
            f10 = i10 > 0 ? i / i10 : 1.0f;
            if (this.f7005u != f10) {
                this.f7005u = f10;
                requestLayout();
            }
        } else {
            f10 = i11 > 0 ? i12 / i11 : 1.0f;
            if (this.f7005u != f10) {
                this.f7005u = f10;
                requestLayout();
            }
        }
        t9.g0.f33596l.post(new gy(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        ay ayVar = this.f6999o;
        if (ayVar != null) {
            ayVar.b();
            this.f6999o = null;
        }
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            if (jzVar != null) {
                jzVar.s(false);
            }
            Surface surface = this.i;
            if (surface != null) {
                surface.release();
            }
            this.i = null;
            H(null);
        }
        t9.g0.f33596l.post(new gy(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        ay ayVar = this.f6999o;
        if (ayVar != null) {
            ayVar.a(i, i10);
        }
        t9.g0.f33596l.post(new px(this, i, i10, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f6990e.c(this);
        this.f10424b.a(surfaceTexture, this.f6993h);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i);
        t9.c0.m(sb2.toString());
        t9.g0.f33596l.post(new pf(this, i, 4));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int p() {
        return this.f7004t;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long q() {
        jz jzVar = this.f6994j;
        if (jzVar == null) {
            return -1L;
        }
        if (jzVar.f7027t == null || !jzVar.f7027t.f5516q) {
            return jzVar.f7019l;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long r() {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            return jzVar.p();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long s() {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            return jzVar.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int t() {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            return jzVar.f7020m;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void u() {
        t9.g0.f33596l.post(new gy(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void v(long j10, boolean z5) {
        if (this.f6989d != null) {
            hx.f6284f.execute(new iy(this, z5, j10, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void w(int i, int i10) {
        this.f7003s = i;
        this.f7004t = i10;
        float f10 = i10 > 0 ? i / i10 : 1.0f;
        if (this.f7005u != f10) {
            this.f7005u = f10;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void x(String str, Exception exc) {
        jz jzVar;
        String strJ = J(str, exc);
        u9.i.h("ExoPlayerAdapter error: ".concat(strJ));
        this.f6997m = true;
        if (this.f6991f.f4371a && (jzVar = this.f6994j) != null) {
            jzVar.s(false);
        }
        t9.g0.f33596l.post(new hy(this, strJ, 1));
        p9.k.C.f31302h.e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void y(IOException iOException) {
        String strJ = J("onLoadException", iOException);
        u9.i.h("ExoPlayerAdapter exception: ".concat(strJ));
        p9.k.C.f31302h.e("AdExoPlayerView.onException", iOException);
        t9.g0.f33596l.post(new hy(this, strJ, 0));
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final Integer z() {
        jz jzVar = this.f6994j;
        if (jzVar != null) {
            return jzVar.f7025r;
        }
        return null;
    }
}
