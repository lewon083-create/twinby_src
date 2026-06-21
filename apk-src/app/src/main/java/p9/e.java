package p9;

import aa.h0;
import aa.x;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.dv0;
import com.google.android.gms.internal.ads.ev0;
import com.google.android.gms.internal.ads.fd;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gk0;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.oq0;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.ads.se;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.wf;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xc;
import com.google.android.gms.internal.ads.yk;
import com.google.android.gms.internal.ads.yv0;
import com.google.android.gms.internal.measurement.i4;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import q9.r;
import q9.s;
import t9.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable, ve {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f31263q = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f31270h;
    public final dv0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f31271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f31272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u9.a f31273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u9.a f31274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f31275n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31277p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vector f31264b = new Vector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f31265c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f31266d = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CountDownLatch f31276o = new CountDownLatch(1);

    public e(Context context, u9.a aVar) {
        this.f31271j = context;
        this.f31272k = context;
        this.f31273l = aVar;
        this.f31274m = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f31270h = executorServiceNewCachedThreadPool;
        wk wkVar = al.V2;
        s sVar = s.f31967e;
        boolean zBooleanValue = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue();
        this.f31275n = zBooleanValue;
        this.i = dv0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        wk wkVar2 = al.S2;
        yk ykVar = sVar.f31970c;
        this.f31268f = ((Boolean) ykVar.a(wkVar2)).booleanValue();
        this.f31269g = ((Boolean) ykVar.a(al.W2)).booleanValue();
        if (((Boolean) ykVar.a(al.U2)).booleanValue()) {
            this.f31277p = 2;
        } else {
            this.f31277p = 1;
        }
        if (!((Boolean) ykVar.a(al.f2998f4)).booleanValue()) {
            this.f31267e = l();
        }
        if (((Boolean) ykVar.a(al.Y3)).booleanValue()) {
            hx.f6279a.execute(this);
            return;
        }
        u9.d dVar = r.f31959g.f31960a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hx.f6279a.execute(this);
        } else {
            run();
        }
    }

    public static final se p(Context context, u9.a aVar, boolean z5, boolean z10) {
        se seVarM;
        wc wcVarD = xc.D();
        wcVarD.b();
        ((xc) wcVarD.f9560c).F(z5);
        String str = aVar.f34365b;
        wcVarD.b();
        ((xc) wcVarD.f9560c).E(str);
        xc xcVar = (xc) wcVarD.d();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (se.class) {
            ev0 ev0Var = new ev0();
            ev0Var.f5075b = false;
            byte b2 = (byte) (ev0Var.f5079f | 1);
            ev0Var.f5076c = true;
            ev0Var.f5077d = 100L;
            ev0Var.f5078e = 300L;
            ev0Var.f5079f = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
            String strZ = xcVar.z();
            if (strZ == null) {
                throw new NullPointerException("Null clientVersion");
            }
            ev0Var.f5074a = strZ;
            ev0Var.f5075b = xcVar.A();
            ev0Var.f5079f = (byte) (ev0Var.f5079f | 1);
            seVarM = se.m(context, Executors.newCachedThreadPool(), ev0Var.a(), z10);
        }
        return seVarM;
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void a(int i, int i10, int i11) {
        ve veVarO = o();
        if (veVarO == null) {
            this.f31264b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11)});
        } else {
            m();
            try {
                veVarO.a(i, i10, i11);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void b(MotionEvent motionEvent) {
        ve veVarO = o();
        if (veVarO == null) {
            this.f31264b.add(new Object[]{motionEvent});
            return;
        }
        m();
        try {
            veVarO.b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String c(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        ve veVarO = o();
        if (((Boolean) s.f31967e.f31970c.a(al.Sb)).booleanValue()) {
            g0 g0Var = k.C.f31297c;
            g0.k(view, 4);
        }
        if (veVarO == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return veVarO.c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String d(Context context) {
        try {
            return (String) vv.B(new x(8, this, context), this.f31270h).get(((Integer) s.f31967e.f31970c.a(al.f3105m3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f31274m.f34365b;
            long j10 = f31263q;
            try {
                be beVarZ = ce.z();
                beVarZ.b();
                ((ce) beVarZ.f9560c).B(str);
                beVarZ.b();
                ((ce) beVarZ.f9560c).A("0.825731049");
                String packageName = context.getPackageName();
                beVarZ.b();
                ((ce) beVarZ.f9560c).D(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
                beVarZ.b();
                ((ce) beVarZ.f9560c).F(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                beVarZ.b();
                ((ce) beVarZ.f9560c).C(jCurrentTimeMillis2);
                try {
                    long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    beVarZ.b();
                    ((ce) beVarZ.f9560c).E(j11);
                } catch (PackageManager.NameNotFoundException unused3) {
                    beVarZ.b();
                    ((ce) beVarZ.f9560c).E(-1L);
                }
                fe feVarB = le.b(null, ((ce) beVarZ.d()).b());
                feVarB.b();
                ((ge) feVarB.f9560c).C(5);
                feVarB.b();
                ((ge) feVarB.f9560c).D(2);
                return Base64.encodeToString(((ge) feVarB.d()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void e(StackTraceElement[] stackTraceElementArr) {
        ve veVarO;
        ve veVarO2;
        if (((Boolean) s.f31967e.f31970c.a(al.f3207t3)).booleanValue()) {
            if (this.f31276o.getCount() != 0 || (veVarO2 = o()) == null) {
                return;
            }
            try {
                veVarO2.e(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!j() || (veVarO = o()) == null) {
            return;
        }
        try {
            veVarO.e(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String f(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final void g(View view) {
        ve veVarO = o();
        if (veVarO != null) {
            try {
                veVarO.g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.ve
    public final String i(Context context, View view, Activity activity) {
        wk wkVar = al.Rb;
        s sVar = s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        try {
            if (!((Boolean) ykVar.a(wkVar)).booleanValue()) {
                ve veVarO = o();
                if (((Boolean) ykVar2.a(al.Sb)).booleanValue()) {
                    g0 g0Var = k.C.f31297c;
                    g0.k(view, 2);
                }
                return veVarO != null ? veVarO.i(context, view, activity) : "";
            }
            if (!j()) {
                return "";
            }
            ve veVarO2 = o();
            if (((Boolean) ykVar2.a(al.Sb)).booleanValue()) {
                g0 g0Var2 = k.C.f31297c;
                g0.k(view, 2);
            }
            return veVarO2 != null ? veVarO2.i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() {
        try {
            this.f31276o.await();
            return true;
        } catch (InterruptedException e3) {
            u9.i.i("Interrupted during GADSignals creation.", e3);
            return false;
        }
    }

    public final String k(Context context) {
        ve veVarO;
        if (!j() || (veVarO = o()) == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return veVarO.f(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean l() {
        Context context = this.f31271j;
        ni.i iVar = new ni.i(6, this);
        yv0 yv0Var = new yv0(context, fs1.s(context, this.i), iVar, ((Boolean) s.f31967e.f31970c.a(al.T2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (yv0.f12752g) {
            try {
                sg sgVarR = yv0Var.r(1);
                if (sgVarR == null) {
                    yv0Var.p(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileI = yv0Var.i(sgVarR.z());
                if (!new File(fileI, "pcam.jar").exists()) {
                    yv0Var.p(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileI, "pcbc").exists()) {
                    yv0Var.p(5019, jCurrentTimeMillis);
                    return true;
                }
                yv0Var.p(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        ve veVarO = o();
        Vector<Object[]> vector = this.f31264b;
        if (vector.isEmpty() || veVarO == null) {
            return;
        }
        for (Object[] objArr : vector) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    veVarO.b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    veVarO.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void n(boolean z5) {
        String str = this.f31273l.f34365b;
        Context context = this.f31271j;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        wc wcVarD = xc.D();
        wcVarD.b();
        ((xc) wcVarD.f9560c).F(z5);
        wcVarD.b();
        ((xc) wcVarD.f9560c).E(str);
        xc xcVar = (xc) wcVarD.d();
        i4 i4Var = new i4();
        i4Var.f13782c = xcVar.z();
        i4Var.f13781b = xcVar.A();
        i4Var.f13783d = xcVar.B();
        xcVar.C();
        synchronized (we.class) {
            try {
                if (!we.A) {
                    we.B = System.currentTimeMillis() / 1000;
                    we.f11757y = we.p(context, i4Var.f13781b);
                    wk wkVar = al.f2920a4;
                    s sVar = s.f31967e;
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        we.C = cf.m(context);
                    }
                    ExecutorService executorService = we.f11757y.f9476b;
                    if (((Boolean) sVar.f31970c.a(al.f2936b4)).booleanValue() && executorService != null) {
                        we.D = wf.a(context, executorService);
                    }
                    if (((Boolean) sVar.f31970c.a(al.f3058j3)).booleanValue()) {
                        we.E = new p1();
                    }
                    if (((Boolean) sVar.f31970c.a(al.f3148p3)).booleanValue() || ((fd) i4Var.f13783d).D()) {
                        we.G = new gk0(context, executorService);
                    }
                    if (((Boolean) sVar.f31970c.a(al.f3074k3)).booleanValue() || ((fd) i4Var.f13783d).B()) {
                        we.F = new oq0(context, executorService, (fd) i4Var.f13783d, we.G);
                    }
                    we.A = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31265c.set(new we(context, i4Var));
    }

    public final ve o() {
        return ((!this.f31268f || this.f31267e) ? this.f31277p : 1) == 2 ? (ve) this.f31266d.get() : (ve) this.f31265c.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        try {
            wk wkVar = al.f2998f4;
            s sVar = s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                this.f31267e = l();
            }
            boolean z10 = this.f31273l.f34368e;
            boolean z11 = false;
            if (!((Boolean) sVar.f31970c.a(al.f3222u1)).booleanValue() && z10) {
                z11 = true;
            }
            if (((!this.f31268f || this.f31267e) ? this.f31277p : 1) == 1) {
                n(z11);
                if (this.f31277p == 2) {
                    this.f31270h.execute(new h0(5, this, z11));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    se seVarP = p(this.f31271j, this.f31273l, z11, this.f31275n);
                    this.f31266d.set(seVarP);
                    if (this.f31269g) {
                        synchronized (seVarP) {
                            z5 = seVarP.f10266r;
                        }
                        if (!z5) {
                            this.f31277p = 1;
                            n(z11);
                        }
                    }
                } catch (NullPointerException e3) {
                    this.f31277p = 1;
                    n(z11);
                    this.i.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e3);
                }
            }
            this.f31276o.countDown();
            this.f31271j = null;
            this.f31273l = null;
        } catch (Throwable th2) {
            this.f31276o.countDown();
            this.f31271j = null;
            this.f31273l = null;
            throw th2;
        }
    }
}
