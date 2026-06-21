package aa;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.wd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f598a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f599b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wd0 f601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f602e;

    public i0(Context context, wd0 wd0Var, gx gxVar) {
        this.f600c = context;
        this.f601d = wd0Var;
        this.f602e = gxVar;
    }

    public final synchronized void a(Object obj, da.a aVar) {
        p9.k.C.f31304k.getClass();
        hx.f6284f.execute(new y(this, obj, new Pair(aVar, Long.valueOf(System.currentTimeMillis())), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0074, B:30:0x0078, B:32:0x007e, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(boolean r10, aa.k0 r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f598a     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            aa.k0 r2 = (aa.k0) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            p9.k r5 = p9.k.C     // Catch: java.lang.Throwable -> L30
            ua.a r5 = r5.f31304k     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.f619c     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            v7.f r2 = r2.f617a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            v7.f r2 = r11.f617a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L8a
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            v7.f r0 = r11.f617a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.gm.f5859f     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            com.google.android.gms.internal.ads.ya r0 = com.google.android.gms.internal.ads.gm.f5860g     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            v7.f r0 = r11.f617a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            com.google.android.gms.internal.ads.fx r0 = com.google.android.gms.internal.ads.hx.f6282d     // Catch: java.lang.Throwable -> L30
            aa.g0 r2 = new aa.g0     // Catch: java.lang.Throwable -> L30
            r7 = 0
            r2.<init>(r7, r9, r10, r3)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.f599b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L74
            goto L88
        L74:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L78:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L88
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L30
            r9.e(r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L78
        L88:
            monitor-exit(r9)
            return
        L8a:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.i0.b(boolean, aa.k0):void");
    }

    public final void c(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        HashMap map = this.f599b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f602e.submit(new h0(0, this, z5));
    }

    public final synchronized void d(boolean z5, boolean z10) {
        Throwable th2;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z5);
            HashMap map = this.f598a;
            Boolean boolValueOf = Boolean.valueOf(z5);
            k0 k0Var = (k0) map.get(boolValueOf);
            int i = 0;
            if (z10 && k0Var != null) {
                try {
                    i = k0Var.f620d + 1;
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            }
            k0 k0Var2 = (k0) map.get(boolValueOf);
            j0 j0Var = new j0(this, z5, i, k0Var2 == null ? null : Boolean.valueOf(k0Var2.f621e.get()), this.f601d);
            k9.g gVar = new k9.g((k9.f) new k9.f(2).r(bundle, AdMobAdapter.class));
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3141oc)).booleanValue()) {
                this.f602e.submit(new e(this, gVar, j0Var, 2));
            } else {
                v7.f.n(this.f600c, gVar, j0Var);
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final void e(k0 k0Var, Pair pair, boolean z5) {
        k0Var.f621e.set(true);
        v7.f fVar = k0Var.f617a;
        if (fVar != null) {
            ((da.a) pair.first).b(fVar);
        } else {
            ((da.a) pair.first).a(k0Var.f618b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        p9.k.C.f31304k.getClass();
        hl.l.z(this.f601d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z5)), new Pair("sgpc_rs", Boolean.toString(fVar != null)));
    }
}
