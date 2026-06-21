package ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.ft1;
import com.google.android.gms.internal.ads.ur;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f30066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0 f30067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Boolean f30068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z2 f30069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f30070h;
    public final com.google.android.gms.ads.identifier.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f30071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z2 f30072k;

    public d3(l1 l1Var) {
        super(l1Var);
        this.f30071j = new ArrayList();
        this.i = new com.google.android.gms.ads.identifier.c(l1Var.f30269l);
        this.f30066d = new c3(this);
        this.f30069g = new z2(this, l1Var, 0);
        this.f30072k = new z2(this, l1Var, 1);
    }

    @Override // ob.f0
    public final boolean F() {
        return false;
    }

    public final void G(AtomicReference atomicReference) {
        C();
        D();
        Q(new aa.y(this, atomicReference, S(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.C()
            r7.D()
            ob.u r4 = new ob.u
            r4.<init>(r8)
            r7.O()
            java.lang.Object r0 = r7.f15951b
            ob.l1 r0 = (ob.l1) r0
            ob.g r1 = r0.f30263e
            r2 = 0
            ob.c0 r3 = ob.d0.f30001b1
            boolean r1 = r1.M(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            ob.n0 r0 = r0.m()
            java.lang.Object r1 = r0.f15951b
            ob.l1 r1 = (ob.l1) r1
            ob.e4 r3 = r1.f30267j
            ob.s0 r1 = r1.f30265g
            ob.l1.h(r3)
            byte[] r3 = ob.e4.f0(r4)
            if (r3 != 0) goto L3f
            ob.l1.k(r1)
            com.google.android.gms.internal.ads.ur r0 = r1.f30412h
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.f(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            ob.l1.k(r1)
            com.google.android.gms.internal.ads.ur r0 = r1.f30412h
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.f(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.J(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            ob.g4 r2 = r7.S(r2)
            ob.b2 r0 = new ob.b2
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.Q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d3.H(android.os.Bundle):void");
    }

    public final void I() {
        C();
        D();
        if (T()) {
            return;
        }
        if (J()) {
            c3 c3Var = this.f30066d;
            d3 d3Var = c3Var.f29987d;
            d3Var.C();
            Context context = ((l1) d3Var.f15951b).f30260b;
            synchronized (c3Var) {
                try {
                    if (c3Var.f29985b) {
                        s0 s0Var = ((l1) c3Var.f29987d.f15951b).f30265g;
                        l1.k(s0Var);
                        s0Var.f30418o.f("Connection attempt already in progress");
                        return;
                    } else {
                        if (c3Var.f29986c != null && (c3Var.f29986c.s() || c3Var.f29986c.r())) {
                            s0 s0Var2 = ((l1) c3Var.f29987d.f15951b).f30265g;
                            l1.k(s0Var2);
                            s0Var2.f30418o.f("Already awaiting connection attempt");
                            return;
                        }
                        c3Var.f29986c = new p0(context, Looper.getMainLooper(), 93, c3Var, c3Var);
                        s0 s0Var3 = ((l1) c3Var.f29987d.f15951b).f30265g;
                        l1.k(s0Var3);
                        s0Var3.f30418o.f("Connecting to remote service");
                        c3Var.f29985b = true;
                        pa.c0.i(c3Var.f29986c);
                        c3Var.f29986c.d();
                        return;
                    }
                } finally {
                }
            }
        }
        l1 l1Var = (l1) this.f15951b;
        if (l1Var.f30263e.F()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = l1Var.f30260b.getPackageManager().queryIntentServices(new Intent().setClassName(l1Var.f30260b, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            s0 s0Var4 = l1Var.f30265g;
            l1.k(s0Var4);
            s0Var4.f30411g.f("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(l1Var.f30260b, "com.google.android.gms.measurement.AppMeasurementService"));
        c3 c3Var2 = this.f30066d;
        d3 d3Var2 = c3Var2.f29987d;
        d3Var2.C();
        Context context2 = ((l1) d3Var2.f15951b).f30260b;
        ta.a aVarB = ta.a.b();
        synchronized (c3Var2) {
            try {
                if (c3Var2.f29985b) {
                    s0 s0Var5 = ((l1) c3Var2.f29987d.f15951b).f30265g;
                    l1.k(s0Var5);
                    s0Var5.f30418o.f("Connection attempt already in progress");
                } else {
                    d3 d3Var3 = c3Var2.f29987d;
                    s0 s0Var6 = ((l1) d3Var3.f15951b).f30265g;
                    l1.k(s0Var6);
                    s0Var6.f30418o.f("Using local app measurement service");
                    c3Var2.f29985b = true;
                    aVarB.a(context2, intent, d3Var3.f30066d, VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d3.J():boolean");
    }

    public final void K() {
        C();
        D();
        c3 c3Var = this.f30066d;
        if (c3Var.f29986c != null && (c3Var.f29986c.r() || c3Var.f29986c.s())) {
            c3Var.f29986c.f();
        }
        c3Var.f29986c = null;
        try {
            ta.a.b().c(((l1) this.f15951b).f30260b, c3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f30067e = null;
    }

    public final boolean L() {
        C();
        D();
        if (!J()) {
            return true;
        }
        e4 e4Var = ((l1) this.f15951b).f30267j;
        l1.h(e4Var);
        return e4Var.h0() >= ((Integer) d0.J0.a(null)).intValue();
    }

    public final boolean M() {
        C();
        D();
        if (!J()) {
            return true;
        }
        e4 e4Var = ((l1) this.f15951b).f30267j;
        l1.h(e4Var);
        return e4Var.h0() >= 241200;
    }

    public final void N(ComponentName componentName) {
        C();
        if (this.f30067e != null) {
            this.f30067e = null;
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30418o.g(componentName, "Disconnected from device MeasurementService");
            C();
            I();
        }
    }

    public final void O() {
        ((l1) this.f15951b).getClass();
    }

    public final void P() {
        C();
        com.google.android.gms.ads.identifier.c cVar = this.i;
        ((ua.a) cVar.f2535d).getClass();
        cVar.f2534c = SystemClock.elapsedRealtime();
        ((l1) this.f15951b).getClass();
        this.f30069g.b(((Long) d0.Y.a(null)).longValue());
    }

    public final void Q(Runnable runnable) {
        C();
        if (T()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f30071j;
        long size = arrayList.size();
        l1 l1Var = (l1) this.f15951b;
        l1Var.getClass();
        if (size >= 1000) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f30072k.b(60000L);
            I();
        }
    }

    public final void R() {
        C();
        l1 l1Var = (l1) this.f15951b;
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        ur urVar = s0Var.f30418o;
        ArrayList arrayList = this.f30071j;
        urVar.g(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e3) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.g(e3, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f30072k.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.g4 S(boolean r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d3.S(boolean):ob.g4");
    }

    public final boolean T() {
        C();
        D();
        return this.f30067e != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #58 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:418:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c A[PHI: r5 r6 r24 r25 r27 r37 r38
      0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(ob.g0 r67, qa.a r68, ob.g4 r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d3.U(ob.g0, qa.a, ob.g4):void");
    }

    public final void V(e eVar) {
        boolean zJ;
        C();
        D();
        l1 l1Var = (l1) this.f15951b;
        l1Var.getClass();
        n0 n0VarM = l1Var.m();
        l1 l1Var2 = (l1) n0VarM.f15951b;
        l1.h(l1Var2.f30267j);
        byte[] bArrF0 = e4.f0(eVar);
        if (bArrF0.length > 131072) {
            s0 s0Var = l1Var2.f30265g;
            l1.k(s0Var);
            s0Var.f30412h.f("Conditional user property too long for local database. Sending directly to service");
            zJ = false;
        } else {
            zJ = n0VarM.J(2, bArrF0);
        }
        Q(new ft1(this, S(true), zJ, new e(eVar)));
    }
}
