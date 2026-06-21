package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y81 f5820c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pj0 f5823f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5825h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final oj0 f5826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xp0 f5827k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5818a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5819b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5821d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f5822e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5824g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5828l = false;

    public gj0(eq0 eq0Var, oj0 oj0Var, y81 y81Var) {
        this.i = ((zp0) eq0Var.f5033b.f4348d).f13071r;
        this.f5826j = oj0Var;
        this.f5820c = y81Var;
        this.f5825h = sj0.b(eq0Var);
        List list = (List) eq0Var.f5033b.f4347c;
        for (int i = 0; i < list.size(); i++) {
            this.f5818a.put((xp0) list.get(i), Integer.valueOf(i));
        }
        this.f5819b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.f12267v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.f5828l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.f5821d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.xp0) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.xp0 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.d()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.ArrayList r1 = r6.f5819b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.xp0 r2 = (com.google.android.gms.internal.ads.xp0) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.f12263t0     // Catch: java.lang.Throwable -> L2b
            java.util.HashSet r4 = r6.f5822e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.f12267v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.f5828l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.ArrayList r3 = r6.f5821d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.xp0 r0 = (com.google.android.gms.internal.ads.xp0) r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r0
        L43:
            monitor-exit(r6)
            r0 = 0
            return r0
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj0.a():com.google.android.gms.internal.ads.xp0");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[Catch: all -> 0x0018, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0009, B:7:0x0010, B:9:0x0013, B:14:0x001a, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:23:0x0037, B:25:0x003b, B:26:0x0042, B:27:0x0048, B:34:0x0057, B:41:0x005f, B:38:0x005b, B:47:0x0067, B:50:0x006a, B:6:0x000a, B:29:0x004a, B:31:0x0050), top: B:55:0x0002, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(com.google.android.gms.internal.ads.pj0 r5, com.google.android.gms.internal.ads.xp0 r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.f5828l = r0     // Catch: java.lang.Throwable -> L18
            java.util.ArrayList r1 = r4.f5821d     // Catch: java.lang.Throwable -> L18
            r1.remove(r6)     // Catch: java.lang.Throwable -> L18
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.y81 r1 = r4.f5820c     // Catch: java.lang.Throwable -> L68
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            r5.p()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return
        L18:
            r5 = move-exception
            goto L6b
        L1a:
            java.util.HashMap r1 = r4.f5818a     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L29
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L18
            goto L2c
        L29:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L2c:
            int r2 = r4.f5824g     // Catch: java.lang.Throwable -> L18
            if (r1 <= r2) goto L37
            com.google.android.gms.internal.ads.oj0 r5 = r4.f5826j     // Catch: java.lang.Throwable -> L18
            r5.c(r6)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return
        L37:
            com.google.android.gms.internal.ads.pj0 r2 = r4.f5823f     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L42
            com.google.android.gms.internal.ads.oj0 r2 = r4.f5826j     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.xp0 r3 = r4.f5827k     // Catch: java.lang.Throwable -> L18
            r2.c(r3)     // Catch: java.lang.Throwable -> L18
        L42:
            r4.f5824g = r1     // Catch: java.lang.Throwable -> L18
            r4.f5823f = r5     // Catch: java.lang.Throwable -> L18
            r4.f5827k = r6     // Catch: java.lang.Throwable -> L18
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L18
            r5 = 1
            boolean r6 = r4.e(r5)     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L5b
            boolean r6 = r4.f()     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L57
            goto L5b
        L57:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            goto L5d
        L59:
            r5 = move-exception
            goto L66
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            r0 = r5
        L5d:
            if (r0 != 0) goto L64
            r4.g()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)
            return
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r5     // Catch: java.lang.Throwable -> L18
        L68:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L18
        L6b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj0.b(com.google.android.gms.internal.ads.pj0, com.google.android.gms.internal.ads.xp0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[Catch: all -> 0x0036, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0002, B:5:0x0010, B:7:0x0017, B:9:0x001a, B:16:0x0029, B:23:0x0031, B:20:0x002d, B:29:0x0039, B:34:0x003e, B:11:0x001c, B:13:0x0022, B:6:0x0011), top: B:37:0x0002, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(com.google.android.gms.internal.ads.xp0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.f5828l = r0     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r1 = r2.f5821d     // Catch: java.lang.Throwable -> L36
            r1.remove(r3)     // Catch: java.lang.Throwable -> L36
            java.util.HashSet r1 = r2.f5822e     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r3.f12263t0     // Catch: java.lang.Throwable -> L36
            r1.remove(r3)     // Catch: java.lang.Throwable -> L36
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.y81 r3 = r2.f5820c     // Catch: java.lang.Throwable -> L3c
            boolean r3 = r3.isDone()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L3a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L36
            r3 = 1
            boolean r1 = r2.e(r3)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            boolean r1 = r2.f()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L29
            goto L2d
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            goto L2f
        L2b:
            r3 = move-exception
            goto L38
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            r0 = r3
        L2f:
            if (r0 != 0) goto L3a
            r2.g()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            return
        L36:
            r3 = move-exception
            goto L3f
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L36
        L3a:
            monitor-exit(r2)
            return
        L3c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r3     // Catch: java.lang.Throwable -> L36
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj0.c(com.google.android.gms.internal.ads.xp0):void");
    }

    public final synchronized boolean d() {
        if (this.f5828l) {
            return false;
        }
        ArrayList arrayList = this.f5819b;
        if (!arrayList.isEmpty() && ((xp0) arrayList.get(0)).f12267v0 && !this.f5821d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f5820c.isDone()) {
                ArrayList arrayList2 = this.f5821d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z5) {
        try {
            for (xp0 xp0Var : this.f5819b) {
                Integer num = (Integer) this.f5818a.get(xp0Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z5 || !this.f5822e.contains(xp0Var.f12263t0)) {
                    int i = this.f5824g;
                    if (iIntValue < i) {
                        return true;
                    }
                    if (iIntValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean f() {
        try {
            Iterator it = this.f5821d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f5818a.get((xp0) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f5824g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        oj0 oj0Var = this.f5826j;
        xp0 xp0Var = this.f5827k;
        synchronized (oj0Var) {
            try {
                oj0Var.f8698a.getClass();
                oj0Var.f8705h = SystemClock.elapsedRealtime() - oj0Var.i;
                if (xp0Var != null) {
                    oj0Var.f8703f.a(xp0Var);
                }
                oj0Var.f8704g = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        pj0 pj0Var = this.f5823f;
        if (pj0Var != null) {
            this.f5820c.e(pj0Var);
        } else {
            this.f5820c.f(new rj0(3, this.f5825h));
        }
    }
}
