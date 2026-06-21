package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import com.google.android.gms.internal.ads.p5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9.o f33082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f33083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.i f33084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0.d f33085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g1 f33086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k6.t0 f33087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1.k f33088h;
    public j1.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k0.d f33089j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0.d f33094o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f33096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k0.m f33097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p5 f33098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m4.d f33099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ac.c f33100u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fd.b f33101v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33081a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f33090k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33091l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33092m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f33093n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f33095p = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f33102w = new AtomicBoolean(false);

    public h2(g0.a2 a2Var, g0.a2 a2Var2, q9.o oVar, j0.i iVar, j0.d dVar, Handler handler) {
        this.f33082b = oVar;
        this.f33083c = handler;
        this.f33084d = iVar;
        this.f33085e = dVar;
        p5 p5Var = new p5();
        p5Var.f8926a = a2Var2.h(TextureViewIsClosedQuirk.class);
        p5Var.f8927b = a2Var.h(PreviewOrientationIncorrectQuirk.class);
        p5Var.f8928c = a2Var.h(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f33098s = p5Var;
        this.f33100u = new ac.c(a2Var.h(CaptureSessionStuckQuirk.class) || a2Var.h(IncorrectCaptureStateQuirk.class));
        this.f33099t = new m4.d(a2Var2, 21);
        this.f33101v = new fd.b(a2Var2, 8);
        this.f33094o = dVar;
    }

    @Override // t.e2
    public final void a(h2 h2Var) {
        Objects.requireNonNull(this.f33086f);
        this.f33086f.a(h2Var);
    }

    @Override // t.e2
    public final void b(h2 h2Var) {
        Objects.requireNonNull(this.f33086f);
        this.f33086f.b(h2Var);
    }

    @Override // t.e2
    public final void c(h2 h2Var) {
        j1.k kVar;
        synchronized (this.f33095p) {
            this.f33098s.b(this.f33096q);
        }
        k("onClosed()");
        synchronized (this.f33081a) {
            try {
                if (this.f33091l) {
                    kVar = null;
                } else {
                    this.f33091l = true;
                    f2.g.g(this.f33088h, "Need to call openCaptureSession before using this API.");
                    kVar = this.f33088h;
                }
            } finally {
            }
        }
        synchronized (this.f33081a) {
            try {
                List list = this.f33090k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((g0.a1) it.next()).b();
                    }
                    this.f33090k = null;
                }
            } finally {
            }
        }
        this.f33100u.s();
        if (kVar != null) {
            kVar.f26173c.a(new f2(this, h2Var, 0), hl.d.j());
        }
    }

    @Override // t.e2
    public final void d(h2 h2Var) {
        h2 h2Var2;
        Objects.requireNonNull(this.f33086f);
        synchronized (this.f33081a) {
            try {
                List list = this.f33090k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((g0.a1) it.next()).b();
                    }
                    this.f33090k = null;
                }
            } finally {
            }
        }
        this.f33100u.s();
        q9.o oVar = this.f33082b;
        Iterator it2 = oVar.m().iterator();
        while (it2.hasNext() && (h2Var2 = (h2) it2.next()) != this) {
            synchronized (h2Var2.f33081a) {
                try {
                    List list2 = h2Var2.f33090k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((g0.a1) it3.next()).b();
                        }
                        h2Var2.f33090k = null;
                    }
                } finally {
                }
            }
            h2Var2.f33100u.s();
        }
        synchronized (oVar.f31947b) {
            ((LinkedHashSet) oVar.f31950e).remove(this);
        }
        this.f33086f.d(h2Var);
    }

    @Override // t.e2
    public final void e(h2 h2Var) {
        ArrayList arrayList;
        h2 h2Var2;
        h2 h2Var3;
        h2 h2Var4;
        k("Session onConfigured()");
        m4.d dVar = this.f33099t;
        q9.o oVar = this.f33082b;
        synchronized (oVar.f31947b) {
            arrayList = new ArrayList((LinkedHashSet) oVar.f31950e);
        }
        ArrayList arrayListL = this.f33082b.l();
        if (((CaptureSessionOnClosedNotCalledQuirk) dVar.f28630b) != null) {
            LinkedHashSet<h2> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (h2Var4 = (h2) it.next()) != h2Var) {
                linkedHashSet.add(h2Var4);
            }
            for (h2 h2Var5 : linkedHashSet) {
                h2Var5.getClass();
                h2Var5.d(h2Var5);
            }
        }
        Objects.requireNonNull(this.f33086f);
        q9.o oVar2 = this.f33082b;
        synchronized (oVar2.f31947b) {
            ((LinkedHashSet) oVar2.f31948c).add(this);
            ((LinkedHashSet) oVar2.f31950e).remove(this);
        }
        Iterator it2 = oVar2.m().iterator();
        while (it2.hasNext() && (h2Var3 = (h2) it2.next()) != this) {
            synchronized (h2Var3.f33081a) {
                try {
                    List list = h2Var3.f33090k;
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((g0.a1) it3.next()).b();
                        }
                        h2Var3.f33090k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            h2Var3.f33100u.s();
        }
        this.f33086f.e(h2Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) dVar.f28630b) != null) {
            LinkedHashSet<h2> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayListL.iterator();
            while (it4.hasNext() && (h2Var2 = (h2) it4.next()) != h2Var) {
                linkedHashSet2.add(h2Var2);
            }
            for (h2 h2Var6 : linkedHashSet2) {
                h2Var6.getClass();
                h2Var6.c(h2Var6);
            }
        }
    }

    @Override // t.e2
    public final void f(h2 h2Var) {
        Objects.requireNonNull(this.f33086f);
        this.f33086f.f(h2Var);
    }

    @Override // t.e2
    public final void g(h2 h2Var) {
        j1.k kVar;
        synchronized (this.f33081a) {
            try {
                if (this.f33093n) {
                    kVar = null;
                } else {
                    this.f33093n = true;
                    f2.g.g(this.f33088h, "Need to call openCaptureSession before using this API.");
                    kVar = this.f33088h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kVar != null) {
            kVar.f26173c.a(new f2(this, h2Var, 1), hl.d.j());
        }
    }

    @Override // t.e2
    public final void h(h2 h2Var, Surface surface) {
        Objects.requireNonNull(this.f33086f);
        this.f33086f.h(h2Var, surface);
    }

    public final void i() {
        if (!this.f33102w.compareAndSet(false, true)) {
            k("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f33101v.f16748a) {
            try {
                k("Call abortCaptures() before closing session.");
                f2.g.g(this.f33087g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((r3.b) this.f33087g.f27180c).f32188c).abortCaptures();
            } catch (Exception e3) {
                k("Exception when calling abortCaptures()" + e3);
            }
        }
        k("Session call close()");
        this.f33100u.e().a(new g2(this, 1), this.f33084d);
    }

    public final void j(CameraCaptureSession cameraCaptureSession) {
        if (this.f33087g == null) {
            this.f33087g = new k6.t0(cameraCaptureSession, this.f33083c);
        }
    }

    public final void k(String str) {
        com.google.android.gms.internal.auth.g.e("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final boolean l() {
        boolean z5;
        synchronized (this.f33081a) {
            z5 = this.f33088h != null;
        }
        return z5;
    }

    public final ed.d m(CameraDevice cameraDevice, v.s sVar, List list) {
        ed.d dVarF;
        synchronized (this.f33095p) {
            try {
                ArrayList<h2> arrayListL = this.f33082b.l();
                ArrayList arrayList = new ArrayList();
                for (h2 h2Var : arrayListL) {
                    arrayList.add(i0.o.w(new e9.g(h2Var.f33100u.e(), h2Var.f33094o, 1500L, 3)));
                }
                k0.m mVarI = k0.j.i(arrayList);
                this.f33097r = mVarI;
                dVarF = k0.j.f(k0.j.j(k0.d.b(mVarI), new l4.d(this, cameraDevice, sVar, list), this.f33084d));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarF;
    }

    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackC = this.f33100u.c(captureCallback);
        f2.g.g(this.f33087g, "Need to call openCaptureSession before using this API.");
        return ((r3.b) this.f33087g.f27180c).H(captureRequest, this.f33084d, captureCallbackC);
    }

    public final ed.d o(ArrayList arrayList) {
        synchronized (this.f33081a) {
            try {
                if (this.f33092m) {
                    return new k0.l(1, new CancellationException("Opener is disabled"));
                }
                k0.b bVarJ = k0.j.j(k0.d.b(rl.b.t(arrayList, this.f33084d, this.f33085e)), new oi.i(17, this, arrayList), this.f33084d);
                this.f33089j = bVarJ;
                return k0.j.f(bVarJ);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p() {
        boolean z5;
        synchronized (this.f33095p) {
            try {
                if (l()) {
                    this.f33098s.b(this.f33096q);
                } else {
                    k0.m mVar = this.f33097r;
                    if (mVar != null) {
                        mVar.cancel(true);
                    }
                }
                try {
                    synchronized (this.f33081a) {
                        try {
                            if (!this.f33092m) {
                                k0.d dVar = this.f33089j;
                                dVar = dVar != null ? dVar : null;
                                this.f33092m = true;
                            }
                            z5 = !l();
                        } finally {
                        }
                    }
                } finally {
                    if (dVar != null) {
                        dVar.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z5;
    }

    public final k6.t0 q() {
        this.f33087g.getClass();
        return this.f33087g;
    }
}
