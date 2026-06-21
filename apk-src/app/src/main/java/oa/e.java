package oa;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.om1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import pa.p0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f29833q = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f29834r = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f29835s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static e f29836t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pa.o f29839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ra.b f29840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f29841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ma.f f29842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l6.i f29843h;
    public final AtomicInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f29844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f29845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f29846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1.f f29847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1.f f29848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kw0 f29849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f29850p;

    public e(Context context, Looper looper) {
        ma.f fVar = ma.f.f28773d;
        this.f29837b = 10000L;
        this.f29838c = false;
        this.i = new AtomicInteger(1);
        this.f29844j = new AtomicInteger(0);
        this.f29845k = new ConcurrentHashMap(5, 0.75f, 1);
        this.f29846l = null;
        this.f29847m = new h1.f(0);
        this.f29848n = new h1.f(0);
        this.f29850p = true;
        this.f29841f = context;
        kw0 kw0Var = new kw0(looper, this, 2);
        Looper.getMainLooper();
        this.f29849o = kw0Var;
        this.f29842g = fVar;
        this.f29843h = new l6.i(23);
        PackageManager packageManager = context.getPackageManager();
        if (ua.b.f34408g == null) {
            ua.b.f34408g = Boolean.valueOf(ua.b.h() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (ua.b.f34408g.booleanValue()) {
            this.f29850p = false;
        }
        kw0Var.sendMessage(kw0Var.obtainMessage(6));
    }

    public static Status c(a aVar, ma.b bVar) {
        String str = (String) aVar.f29816b.f27979d;
        String strValueOf = String.valueOf(bVar);
        return new Status(17, om1.n(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), bVar.f28762d, bVar);
    }

    public static e d(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (f29835s) {
            if (f29836t == null) {
                synchronized (p0.f31420g) {
                    try {
                        handlerThread = p0.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            p0.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = p0.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ma.f.f28772c;
                f29836t = new e(applicationContext, looper);
            }
            eVar = f29836t;
        }
        return eVar;
    }

    public final p a(na.f fVar) {
        a aVar = fVar.f29195g;
        ConcurrentHashMap concurrentHashMap = this.f29845k;
        p pVar = (p) concurrentHashMap.get(aVar);
        if (pVar == null) {
            pVar = new p(this, fVar);
            concurrentHashMap.put(aVar, pVar);
        }
        if (pVar.f29871c.c()) {
            this.f29848n.add(aVar);
        }
        pVar.n();
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(sb.g r9, int r10, na.f r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L78
            oa.a r3 = r11.f29195g
            boolean r11 = r8.f()
            if (r11 != 0) goto Lb
            goto L48
        Lb:
            pa.m r11 = pa.m.b()
            java.lang.Object r11 = r11.f31398b
            pa.n r11 = (pa.n) r11
            r0 = 1
            if (r11 == 0) goto L4b
            boolean r1 = r11.f31404c
            if (r1 == 0) goto L48
            boolean r11 = r11.f31405d
            java.util.concurrent.ConcurrentHashMap r1 = r8.f29845k
            java.lang.Object r1 = r1.get(r3)
            oa.p r1 = (oa.p) r1
            if (r1 == 0) goto L46
            na.c r2 = r1.f29871c
            boolean r4 = r2 instanceof pa.e
            if (r4 == 0) goto L48
            pa.e r2 = (pa.e) r2
            pa.k0 r4 = r2.f31348w
            if (r4 == 0) goto L46
            boolean r4 = r2.s()
            if (r4 != 0) goto L46
            pa.g r11 = f4.j.d(r1, r2, r10)
            if (r11 == 0) goto L48
            int r2 = r1.f29880m
            int r2 = r2 + r0
            r1.f29880m = r2
            boolean r0 = r11.f31356d
            goto L4b
        L46:
            r0 = r11
            goto L4b
        L48:
            r10 = 0
            r1 = r8
            goto L65
        L4b:
            f4.j r11 = new f4.j
            r1 = 0
            if (r0 == 0) goto L56
            long r4 = java.lang.System.currentTimeMillis()
            goto L57
        L56:
            r4 = r1
        L57:
            if (r0 == 0) goto L5d
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5d:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L65:
            if (r10 == 0) goto L79
            sb.m r9 = r9.f32858a
            com.google.android.gms.internal.ads.kw0 r11 = r1.f29849o
            java.util.Objects.requireNonNull(r11)
            c2.e r0 = new c2.e
            r2 = 1
            r0.<init>(r11, r2)
            r9.b(r0, r10)
            return
        L78:
            r1 = r8
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.e.b(sb.g, int, na.f):void");
    }

    public final void e(n nVar) {
        synchronized (f29835s) {
            try {
                if (this.f29846l != nVar) {
                    this.f29846l = nVar;
                    this.f29847m.clear();
                }
                this.f29847m.addAll(nVar.f29867g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f() {
        int i;
        if (this.f29838c) {
            return false;
        }
        pa.n nVar = (pa.n) pa.m.b().f31398b;
        if (nVar != null && !nVar.f31404c) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f29843h.f27978c;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean g(ma.b bVar, int i) {
        ma.f fVar = this.f29842g;
        fVar.getClass();
        Context context = this.f29841f;
        if (!wa.a.s(context)) {
            int i10 = bVar.f28761c;
            PendingIntent activity = bVar.f28762d;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = fVar.b(context, null, i10);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f2625c;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                fVar.g(context, i10, PendingIntent.getActivity(context, 0, intent, db.c.f15737a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final void h(ma.b bVar, int i) {
        if (g(bVar, i)) {
            return;
        }
        kw0 kw0Var = this.f29849o;
        kw0Var.sendMessage(kw0Var.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0339  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.e.handleMessage(android.os.Message):boolean");
    }
}
