package d8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.ads.jw1;
import com.google.android.gms.internal.play_billing.b5;
import com.google.android.gms.internal.play_billing.c5;
import com.google.android.gms.internal.play_billing.e5;
import com.google.android.gms.internal.play_billing.g5;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.p5;
import com.google.android.gms.internal.play_billing.q5;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.v4;
import com.google.android.gms.internal.play_billing.w4;
import com.google.android.gms.internal.play_billing.y1;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import ob.p1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    public final fd.b A;
    public final boolean B;
    public ExecutorService C;
    public volatile y1 D;
    public final Long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f15595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f15597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile jw1 f15598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f15599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a1.e f15600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.d f15601h;
    public volatile z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15618z;

    public e(Context context) {
        this.f15594a = new Object();
        this.f15595b = 0;
        this.f15597d = new Handler(Looper.getMainLooper());
        this.f15604l = 0;
        long jNextLong = new Random().nextLong();
        this.E = Long.valueOf(jNextLong);
        String strP = p();
        this.f15596c = strP;
        this.f15599f = context.getApplicationContext();
        b5 b5VarR = c5.r();
        b5VarR.d();
        c5.q((c5) b5VarR.f14184c, strP);
        String packageName = this.f15599f.getPackageName();
        b5VarR.d();
        c5.p((c5) b5VarR.f14184c, packageName);
        b5VarR.d();
        c5.o((c5) b5VarR.f14184c, jNextLong);
        this.f15600g = new a1.e(this.f15599f, (c5) b5VarR.b());
        this.f15599f.getPackageName();
    }

    public static Future m(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new k0.i(6, futureSubmit, runnable), (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e3) {
            o1.h("BillingClient", "Async task throws exception!", e3);
            return null;
        }
    }

    public static String p() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final void A(yi.f0 f0Var, j jVar, int i, Exception exc) {
        I(i, 14, jVar, l0.a(exc));
        ((jh.b) f0Var.f45657c).e(ya.e.h(jVar));
    }

    public final void B(s3.q qVar, j jVar, int i, String str, Exception exc) {
        o1.h("BillingClient", str, exc);
        I(i, 4, jVar, l0.a(exc));
        ((jh.b) qVar.f32631c).e(ya.e.h(jVar));
    }

    public final void C(s3.q qVar, j jVar, int i, Exception exc) {
        I(i, 15, jVar, l0.a(exc));
        qVar.f(jVar);
    }

    public final Handler D() {
        return Looper.myLooper() == null ? this.f15597d : new Handler(Looper.myLooper());
    }

    public final j E() {
        o1.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        t4 t4VarQ = u4.q();
        t4VarQ.d();
        u4.p((u4) t4VarQ.f14184c, 6);
        p5 p5VarO = q5.o();
        p5VarO.d();
        q5.n((q5) p5VarO.f14184c);
        t4VarQ.d();
        u4.o((u4) t4VarQ.f14184c, (q5) p5VarO.b());
        s((u4) t4VarQ.b());
        return n0.f15668j;
    }

    public final void F(yi.f0 f0Var, j jVar, int i, Exception exc) {
        o1.h("BillingClient", "getBillingConfig got an exception.", exc);
        I(i, 13, jVar, l0.a(exc));
        f0Var.c(jVar);
    }

    public final void G(yi.f0 f0Var, j jVar, int i, Exception exc) {
        I(i, 16, jVar, l0.a(exc));
        ((jh.b) f0Var.f45657c).e(ya.e.h(jVar));
    }

    public final void H(int i, int i10, j jVar) {
        try {
            r(l0.b(i, i10, jVar));
        } catch (Throwable th2) {
            o1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void I(int i, int i10, j jVar, String str) {
        try {
            r(l0.c(i, i10, jVar, str));
        } catch (Throwable th2) {
            o1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void J(int i) {
        try {
            s(l0.d(i));
        } catch (Throwable th2) {
            o1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void K(j jVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f15597d.post(new k0.i(8, this, jVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // d8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r5 = this;
            r0 = 12
            r5.J(r0)
            java.lang.Object r0 = r5.f15594a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.jw1 r1 = r5.f15598e     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L29
            com.google.android.gms.internal.ads.jw1 r1 = r5.f15598e     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r1.f6959f     // Catch: java.lang.Throwable -> L21
            d8.o0 r2 = (d8.o0) r2     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r1.f6954a     // Catch: java.lang.Throwable -> L21
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L21
            r2.c(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.f6960g     // Catch: java.lang.Throwable -> L21
            d8.o0 r1 = (d8.o0) r1     // Catch: java.lang.Throwable -> L21
            r1.c(r3)     // Catch: java.lang.Throwable -> L21
            goto L29
        L21:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            com.google.android.gms.internal.play_billing.o1.h(r2, r3, r1)     // Catch: java.lang.Throwable -> L52
        L29:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            com.google.android.gms.internal.play_billing.o1.f(r1, r2)     // Catch: java.lang.Throwable -> L34
            r5.u()     // Catch: java.lang.Throwable -> L34
            goto L3c
        L34:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            com.google.android.gms.internal.play_billing.o1.h(r2, r3, r1)     // Catch: java.lang.Throwable -> L52
        L3c:
            r1 = 3
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.ExecutorService r2 = r5.C     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L4a
            r2.shutdownNow()     // Catch: java.lang.Throwable -> L4c
            r2 = 0
            r5.C = r2     // Catch: java.lang.Throwable -> L4c
            r5.D = r2     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
            goto L4e
        L4c:
            r2 = move-exception
            goto L54
        L4e:
            r5.t(r1)     // Catch: java.lang.Throwable -> L52
            goto L5f
        L52:
            r1 = move-exception
            goto L66
        L54:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            throw r2     // Catch: java.lang.Throwable -> L56
        L56:
            r2 = move-exception
            java.lang.String r3 = "BillingClient"
            java.lang.String r4 = "There was an exception while shutting down the executor service while ending connection!"
            com.google.android.gms.internal.play_billing.o1.h(r3, r4, r2)     // Catch: java.lang.Throwable -> L61
            goto L4e
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return
        L61:
            r2 = move-exception
            r5.t(r1)     // Catch: java.lang.Throwable -> L52
            throw r2     // Catch: java.lang.Throwable -> L52
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e.a():void");
    }

    @Override // d8.d
    public final boolean b() {
        boolean z5;
        synchronized (this.f15594a) {
            try {
                z5 = false;
                if (this.f15595b == 2 && this.f15601h != null && this.i != null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // d8.d
    public void c(fe.c cVar, p pVar) {
        if (!b()) {
            j jVar = n0.f15669k;
            H(2, 7, jVar);
            pVar.onProductDetailsResponse(jVar, new ArrayList());
        } else {
            if (!this.f15612t) {
                o1.g("BillingClient", "Querying product details is not supported.");
                j jVar2 = n0.f15678t;
                H(20, 7, jVar2);
                pVar.onProductDetailsResponse(jVar2, new ArrayList());
                return;
            }
            if (m(new aa.e(this, cVar, pVar, 5), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new ed.c(8, this, pVar), D(), q()) == null) {
                j jVarN = n();
                H(25, 7, jVarN);
                pVar.onProductDetailsResponse(jVarN, new ArrayList());
            }
        }
    }

    @Override // d8.d
    public final void d(ba.a aVar, r rVar) {
        String str = aVar.f2013a;
        if (!b()) {
            j jVar = n0.f15669k;
            H(2, 9, jVar);
            com.google.android.gms.internal.play_billing.z zVar = com.google.android.gms.internal.play_billing.c0.f14146c;
            rVar.onQueryPurchasesResponse(jVar, r0.f14290f);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            o1.g("BillingClient", "Please provide a valid product type.");
            j jVar2 = n0.f15665f;
            H(50, 9, jVar2);
            com.google.android.gms.internal.play_billing.z zVar2 = com.google.android.gms.internal.play_billing.c0.f14146c;
            rVar.onQueryPurchasesResponse(jVar2, r0.f14290f);
            return;
        }
        if (m(new aa.e(this, str, (Object) rVar, 6), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(5, this, rVar), D(), q()) == null) {
            j jVarN = n();
            H(25, 9, jVarN);
            com.google.android.gms.internal.play_billing.z zVar3 = com.google.android.gms.internal.play_billing.c0.f14146c;
            rVar.onQueryPurchasesResponse(jVarN, r0.f14290f);
        }
    }

    public void e(b bVar, s3.q qVar) {
        if (!b()) {
            j jVar = n0.f15669k;
            H(2, 3, jVar);
            qVar.e(jVar);
            return;
        }
        if (TextUtils.isEmpty(bVar.f15582a)) {
            o1.g("BillingClient", "Please provide a valid purchase token.");
            j jVar2 = n0.f15667h;
            H(26, 3, jVar2);
            qVar.e(jVar2);
            return;
        }
        if (!this.f15607o) {
            j jVar3 = n0.f15661b;
            H(27, 3, jVar3);
            qVar.e(jVar3);
        } else if (m(new aa.e(this, qVar, bVar, 9), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(9, this, qVar), D(), q()) == null) {
            j jVarN = n();
            H(25, 3, jVarN);
            qVar.e(jVarN);
        }
    }

    public void f(k kVar, s3.q qVar) {
        jh.b bVar = (jh.b) qVar.f32631c;
        if (!b()) {
            j jVar = n0.f15669k;
            H(2, 4, jVar);
            bVar.e(ya.e.h(jVar));
        } else if (m(new aa.e(this, kVar, qVar, 4), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new ed.c(this, qVar, kVar), D(), q()) == null) {
            j jVarN = n();
            H(25, 4, jVarN);
            bVar.e(ya.e.h(jVarN));
        }
    }

    public final void g(s3.q qVar) {
        if (!b()) {
            C(qVar, n0.f15669k, 2, null);
            return;
        }
        if (!this.f15616x) {
            o1.g("BillingClient", "Current client doesn't support alternative billing only.");
            C(qVar, n0.C, 66, null);
        } else if (m(new aa.x(4, this, qVar), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(10, this, qVar), D(), q()) == null) {
            C(qVar, n(), 25, null);
        }
    }

    public final void h(yi.f0 f0Var) {
        if (!b()) {
            o1.g("BillingClient", "Service disconnected.");
            j jVar = n0.f15669k;
            H(2, 13, jVar);
            f0Var.c(jVar);
            return;
        }
        if (!this.f15613u) {
            o1.g("BillingClient", "Current client doesn't support get billing config.");
            j jVar2 = n0.f15683y;
            H(32, 13, jVar2);
            f0Var.c(jVar2);
            return;
        }
        if (m(new aa.x(3, this, f0Var), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new ed.c(10, this, f0Var), D(), q()) == null) {
            j jVarN = n();
            H(25, 13, jVarN);
            f0Var.c(jVarN);
        }
    }

    public final void i(yi.f0 f0Var) {
        if (!b()) {
            A(f0Var, n0.f15669k, 2, null);
            return;
        }
        if (!this.f15616x) {
            o1.g("BillingClient", "Current client doesn't support alternative billing only.");
            A(f0Var, n0.C, 66, null);
        } else if (m(new aa.x(2, this, f0Var), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new ed.c(6, this, f0Var), D(), q()) == null) {
            A(f0Var, n(), 25, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d8.j j(android.app.Activity r29, final com.google.android.gms.internal.ads.i0 r30) {
        /*
            Method dump skipped, instruction units count: 1719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e.j(android.app.Activity, com.google.android.gms.internal.ads.i0):d8.j");
    }

    public final j k(Activity activity, yi.f0 f0Var) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!b()) {
            j jVar = n0.f15669k;
            H(2, 16, jVar);
            return jVar;
        }
        if (!this.f15616x) {
            o1.g("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            j jVar2 = n0.C;
            H(66, 16, jVar2);
            return jVar2;
        }
        Handler handler = this.f15597d;
        if (m(new p1(this, f0Var, activity, new y(this, handler, f0Var)), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new ed.c(9, this, f0Var), handler, q()) != null) {
            return n0.f15668j;
        }
        j jVarN = n();
        H(25, 16, jVarN);
        return jVarN;
    }

    public void l(f fVar) {
        j jVarE;
        synchronized (this.f15594a) {
            try {
                if (b()) {
                    jVarE = E();
                } else if (this.f15595b == 1) {
                    o1.g("BillingClient", "Client is already in the process of connecting to billing service.");
                    jVarE = n0.f15664e;
                    H(37, 6, jVarE);
                } else if (this.f15595b == 3) {
                    o1.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    jVarE = n0.f15669k;
                    H(38, 6, jVarE);
                } else {
                    t(1);
                    u();
                    o1.f("BillingClient", "Starting in-app billing setup.");
                    this.i = new z(this, fVar);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f15599f.getPackageManager().queryIntentServices(intent, 0);
                    int i = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        t(0);
                        o1.f("BillingClient", "Billing service unavailable on device.");
                        jVarE = n0.f15662c;
                        H(i, 6, jVarE);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                o1.g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f15596c);
                                synchronized (this.f15594a) {
                                    try {
                                        if (this.f15595b == 2) {
                                            jVarE = E();
                                        } else if (this.f15595b != 1) {
                                            o1.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            jVarE = n0.f15669k;
                                            H(117, 6, jVarE);
                                        } else {
                                            z zVar = this.i;
                                            if (this.f15599f.bindService(intent2, zVar, 1)) {
                                                o1.f("BillingClient", "Service was bonded successfully.");
                                                jVarE = null;
                                            } else {
                                                o1.g("BillingClient", "Connection to Billing service is blocked.");
                                                i = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            o1.g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        t(0);
                        o1.f("BillingClient", "Billing service unavailable on device.");
                        jVarE = n0.f15662c;
                        H(i, 6, jVarE);
                    }
                }
            } finally {
            }
        }
        if (jVarE != null) {
            fVar.onBillingSetupFinished(jVarE);
        }
    }

    public final j n() {
        int[] iArr = {0, 3};
        synchronized (this.f15594a) {
            for (int i = 0; i < 2; i++) {
                if (this.f15595b == iArr[i]) {
                    return n0.f15669k;
                }
            }
            return n0.i;
        }
    }

    public final void o() {
        if (TextUtils.isEmpty(null)) {
            this.f15599f.getPackageName();
        }
    }

    public final synchronized ExecutorService q() {
        try {
            if (this.C == null) {
                this.C = Executors.newFixedThreadPool(o1.f14257a, new x());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.C;
    }

    public final void r(s4 s4Var) {
        try {
            this.f15600g.X(s4Var, this.f15604l);
        } catch (Throwable th2) {
            o1.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void s(u4 u4Var) {
        try {
            a1.e eVar = this.f15600g;
            int i = this.f15604l;
            eVar.getClass();
            try {
                b5 b5Var = (b5) ((c5) eVar.f323c).g();
                b5Var.d();
                c5.n((c5) b5Var.f14184c, i);
                eVar.f323c = (c5) b5Var.b();
                eVar.Y(u4Var);
            } catch (Throwable th2) {
                o1.h("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            o1.h("BillingClient", "Unable to log.", th3);
        }
    }

    public final void t(int i) {
        synchronized (this.f15594a) {
            try {
                if (this.f15595b == 3) {
                    return;
                }
                int i10 = this.f15595b;
                o1.f("BillingClient", "Setting clientState from " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f15595b = i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        synchronized (this.f15594a) {
            if (this.i != null) {
                try {
                    this.f15599f.unbindService(this.i);
                } catch (Throwable th2) {
                    try {
                        o1.h("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f15601h = null;
                        this.i = null;
                    } finally {
                        this.f15601h = null;
                        this.i = null;
                    }
                }
            }
        }
    }

    public final ad.m0 v(j jVar, int i, String str, Exception exc) {
        o1.h("BillingClient", str, exc);
        I(i, 7, jVar, l0.a(exc));
        return new ad.m0(jVar.f15636a, jVar.f15637b, new ArrayList());
    }

    public final c0 w(j jVar, int i, String str, Exception exc) {
        o1.h("BillingClient", str, exc);
        I(i, 11, jVar, l0.a(exc));
        return new c0(jVar, null);
    }

    public final c0 x(j jVar, int i, String str, Exception exc) {
        I(i, 9, jVar, l0.a(exc));
        o1.h("BillingClient", str, exc);
        return new c0(jVar, null);
    }

    public final void y(int i, int i10, j jVar) {
        u4 u4Var = null;
        s4 s4Var = null;
        if (jVar.f15636a == 0) {
            int i11 = l0.f15647a;
            try {
                t4 t4VarQ = u4.q();
                t4VarQ.d();
                u4.p((u4) t4VarQ.f14184c, 5);
                e5 e5VarO = g5.o();
                e5VarO.d();
                g5.n((g5) e5VarO.f14184c, i10);
                g5 g5Var = (g5) e5VarO.b();
                t4VarQ.d();
                u4.n((u4) t4VarQ.f14184c, g5Var);
                u4Var = (u4) t4VarQ.b();
            } catch (Exception e3) {
                o1.h("BillingLogger", "Unable to create logging payload", e3);
            }
            s(u4Var);
            return;
        }
        int i12 = l0.f15647a;
        try {
            r4 r4VarR = s4.r();
            v4 v4VarR = w4.r();
            v4VarR.e(jVar.f15636a);
            String str = jVar.f15637b;
            v4VarR.d();
            w4.o((w4) v4VarR.f14184c, str);
            v4VarR.f(i);
            r4VarR.e(v4VarR);
            r4VarR.f(5);
            e5 e5VarO2 = g5.o();
            e5VarO2.d();
            g5.n((g5) e5VarO2.f14184c, i10);
            g5 g5Var2 = (g5) e5VarO2.b();
            r4VarR.d();
            s4.p((s4) r4VarR.f14184c, g5Var2);
            s4Var = (s4) r4VarR.b();
        } catch (Exception e7) {
            o1.h("BillingLogger", "Unable to create logging payload", e7);
        }
        r(s4Var);
    }

    public final void z(s3.q qVar, j jVar, int i, Exception exc) {
        o1.h("BillingClient", "Error in acknowledge purchase!", exc);
        I(i, 3, jVar, l0.a(exc));
        qVar.e(jVar);
    }

    public e(fd.b bVar, Context context) {
        this.f15594a = new Object();
        this.f15595b = 0;
        this.f15597d = new Handler(Looper.getMainLooper());
        this.f15604l = 0;
        long jNextLong = new Random().nextLong();
        this.E = Long.valueOf(jNextLong);
        this.f15596c = p();
        this.f15599f = context.getApplicationContext();
        b5 b5VarR = c5.r();
        String strP = p();
        b5VarR.d();
        c5.q((c5) b5VarR.f14184c, strP);
        String packageName = this.f15599f.getPackageName();
        b5VarR.d();
        c5.p((c5) b5VarR.f14184c, packageName);
        b5VarR.d();
        c5.o((c5) b5VarR.f14184c, jNextLong);
        this.f15600g = new a1.e(this.f15599f, (c5) b5VarR.b());
        o1.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f15598e = new jw1(this.f15599f, null, null, this.f15600g);
        this.A = bVar;
        this.f15599f.getPackageName();
    }

    public e(fd.b bVar, Context context, s sVar) {
        String strP = p();
        this.f15594a = new Object();
        this.f15595b = 0;
        this.f15597d = new Handler(Looper.getMainLooper());
        this.f15604l = 0;
        long jNextLong = new Random().nextLong();
        this.E = Long.valueOf(jNextLong);
        this.f15596c = strP;
        this.f15599f = context.getApplicationContext();
        b5 b5VarR = c5.r();
        b5VarR.d();
        c5.q((c5) b5VarR.f14184c, strP);
        String packageName = this.f15599f.getPackageName();
        b5VarR.d();
        c5.p((c5) b5VarR.f14184c, packageName);
        b5VarR.d();
        c5.o((c5) b5VarR.f14184c, jNextLong);
        this.f15600g = new a1.e(this.f15599f, (c5) b5VarR.b());
        if (sVar == null) {
            o1.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f15598e = new jw1(this.f15599f, sVar, null, this.f15600g);
        this.A = bVar;
        this.B = false;
        this.f15599f.getPackageName();
    }

    public e(fd.b bVar, Context context, s sVar, oi.i iVar) {
        String strP = p();
        this.f15594a = new Object();
        this.f15595b = 0;
        this.f15597d = new Handler(Looper.getMainLooper());
        this.f15604l = 0;
        long jNextLong = new Random().nextLong();
        this.E = Long.valueOf(jNextLong);
        this.f15596c = strP;
        this.f15599f = context.getApplicationContext();
        b5 b5VarR = c5.r();
        b5VarR.d();
        c5.q((c5) b5VarR.f14184c, strP);
        String packageName = this.f15599f.getPackageName();
        b5VarR.d();
        c5.p((c5) b5VarR.f14184c, packageName);
        b5VarR.d();
        c5.o((c5) b5VarR.f14184c, jNextLong);
        this.f15600g = new a1.e(this.f15599f, (c5) b5VarR.b());
        if (sVar == null) {
            o1.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f15598e = new jw1(this.f15599f, sVar, iVar, this.f15600g);
        this.A = bVar;
        this.B = iVar != null;
    }
}
