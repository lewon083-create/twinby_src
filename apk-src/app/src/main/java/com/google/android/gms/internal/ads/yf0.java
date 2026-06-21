package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cloneable f12614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12615h;
    public final Object i;

    public yf0(p2.h adQualityDataStore, xo0 coroutineScopeProvider, dd0 dataPinger, mp0 clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.i = dataPinger;
        this.f12610c = hk.c0.a(new hk.w0((ExecutorService) coroutineScopeProvider.f12221c));
        this.f12611d = new pk.c();
        this.f12612e = new pk.c();
        this.f12613f = new pk.c();
        this.f12615h = adQualityDataStore;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (this.f12608a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f12613f).add(new m3.m(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        m3.v vVar = (m3.v) this.f12611d;
        ArrayDeque arrayDeque = (ArrayDeque) this.f12614g;
        f();
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f12615h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((m3.l) this.f12612e) != null) {
            vVar.getClass();
            Handler handler = vVar.f28601a;
            if (!handler.hasMessages(1)) {
                m3.u uVarB = m3.v.b();
                Message messageObtainMessage = handler.obtainMessage(1);
                uVarB.f28599a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                uVarB.a();
            }
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void c(int i, m3.k kVar) {
        f();
        ((ArrayDeque) this.f12615h).add(new d.l(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f12613f), i, kVar, 4));
    }

    public void d() {
        f();
        synchronized (this.i) {
            this.f12608a = true;
        }
        for (m3.m mVar : (CopyOnWriteArraySet) this.f12613f) {
            m3.l lVar = (m3.l) this.f12612e;
            mVar.f28575d = true;
            if (lVar != null && mVar.f28574c) {
                mVar.f28574c = false;
                lVar.b(mVar.f28572a, mVar.f28573b.b());
            }
        }
        ((CopyOnWriteArraySet) this.f12613f).clear();
    }

    public void e(int i, m3.k kVar) {
        c(i, kVar);
        b();
    }

    public void f() {
        if (this.f12609b) {
            com.google.android.gms.internal.measurement.h5.r(Thread.currentThread() == ((Thread) this.f12610c));
        }
    }

    public void g(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (this.f12608a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f12613f).add(new oe0(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(Object obj) {
        n();
        CopyOnWriteArraySet<oe0> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f12613f;
        for (oe0 oe0Var : copyOnWriteArraySet) {
            if (oe0Var.f8672a.equals(obj)) {
                be0 be0Var = (be0) this.f12612e;
                oe0Var.f8675d = true;
                if (be0Var != null && oe0Var.f8674c) {
                    oe0Var.f8674c = false;
                    be0Var.f(oe0Var.f8672a, oe0Var.f8673b.d());
                }
                copyOnWriteArraySet.remove(oe0Var);
            }
        }
    }

    public void i(int i, td0 td0Var) {
        n();
        ((ArrayDeque) this.f12615h).add(new af0(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f12613f), i, td0Var, 0));
    }

    public void j() {
        n();
        ArrayDeque arrayDeque = (ArrayDeque) this.f12615h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (((be0) this.f12612e) != null) {
            lo0 lo0Var = (lo0) this.f12611d;
            lo0Var.getClass();
            Handler handler = lo0Var.f7588a;
            if (!handler.hasMessages(1)) {
                go0 go0VarG = lo0.g();
                Message messageObtainMessage = handler.obtainMessage(1);
                go0VarG.f5884a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                go0VarG.f5884a = null;
                lo0.f(go0VarG);
            }
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f12614g;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public void k() {
        n();
        synchronized (this.i) {
            this.f12608a = true;
        }
        CopyOnWriteArraySet<oe0> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f12613f;
        for (oe0 oe0Var : copyOnWriteArraySet) {
            be0 be0Var = (be0) this.f12612e;
            oe0Var.f8675d = true;
            if (be0Var != null && oe0Var.f8674c) {
                oe0Var.f8674c = false;
                be0Var.f(oe0Var.f8672a, oe0Var.f8673b.d());
            }
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (u(r2) == r3) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.yf0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(oj.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.l(oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.String r7, oj.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.bx0
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.bx0 r0 = (com.google.android.gms.internal.ads.bx0) r0
            int r1 = r0.f3959p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3959p = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.bx0 r0 = new com.google.android.gms.internal.ads.bx0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f3957n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f3959p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f3956m
            pk.c r7 = r0.f3955l
            java.lang.String r0 = r0.f3960q
            com.google.android.gms.internal.measurement.h5.E(r8)
            goto L51
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.lang.Object r8 = r6.f12611d
            pk.c r8 = (pk.c) r8
            long r4 = java.lang.System.currentTimeMillis()
            r0.f3960q = r7
            r0.f3955l = r8
            r0.f3956m = r4
            r0.f3959p = r3
            java.lang.Object r0 = r8.c(r0)
            if (r0 == r1) goto L8f
            r0 = r7
            r7 = r8
            r1 = r4
        L51:
            r8 = 0
            boolean r4 = r6.f12608a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L5e
            kotlin.Unit r0 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L5c
            r7.e(r8)
            return r0
        L5c:
            r0 = move-exception
            goto L8b
        L5e:
            r6.f12608a = r3     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.nw0 r3 = com.google.android.gms.internal.ads.nw0.Q()     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.qn1 r3 = r3.r()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "toBuilder(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.mw0 r3 = (com.google.android.gms.internal.ads.mw0) r3     // Catch: java.lang.Throwable -> L5c
            r6.f12614g = r3     // Catch: java.lang.Throwable -> L5c
            r3.b()     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.sn1 r4 = r3.f9560c     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.nw0 r4 = (com.google.android.gms.internal.ads.nw0) r4     // Catch: java.lang.Throwable -> L5c
            r4.R(r0)     // Catch: java.lang.Throwable -> L5c
            r3.b()     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.sn1 r0 = r3.f9560c     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.nw0 r0 = (com.google.android.gms.internal.ads.nw0) r0     // Catch: java.lang.Throwable -> L5c
            r0.X(r1)     // Catch: java.lang.Throwable -> L5c
            r7.e(r8)
            kotlin.Unit r7 = kotlin.Unit.f27471a
            return r7
        L8b:
            r7.e(r8)
            throw r0
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.m(java.lang.String, oj.c):java.lang.Object");
    }

    public void n() {
        if (this.f12609b) {
            ix.k0(Thread.currentThread() == ((Thread) this.f12610c));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (w(r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #0 {all -> 0x00b6, blocks: (B:33:0x0087, B:35:0x008d, B:43:0x00b0, B:44:0x00b5), top: B:51:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #0 {all -> 0x00b6, blocks: (B:33:0x0087, B:35:0x008d, B:43:0x00b0, B:44:0x00b5), top: B:51:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(oj.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.yw0
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.yw0 r0 = (com.google.android.gms.internal.ads.yw0) r0
            int r1 = r0.f12779p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12779p = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.yw0 r0 = new com.google.android.gms.internal.ads.yw0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f12777n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f12779p
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            com.google.android.gms.internal.measurement.h5.E(r11)
            goto Lad
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            com.google.android.gms.internal.measurement.h5.E(r11)
            goto La4
        L3e:
            long r5 = r0.f12776m
            pk.c r2 = r0.f12775l
            com.google.android.gms.internal.measurement.h5.E(r11)
            goto L87
        L46:
            pk.c r2 = r0.f12775l
            com.google.android.gms.internal.measurement.h5.E(r11)
            goto L5e
        L4c:
            com.google.android.gms.internal.measurement.h5.E(r11)
            java.lang.Object r11 = r10.f12612e
            r2 = r11
            pk.c r2 = (pk.c) r2
            r0.f12775l = r2
            r0.f12779p = r6
            java.lang.Object r11 = r2.c(r0)
            if (r11 == r1) goto Lbf
        L5e:
            boolean r11 = r10.f12609b     // Catch: java.lang.Throwable -> L68
            if (r11 == 0) goto L6a
            kotlin.Unit r11 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L68
            r2.e(r7)
            return r11
        L68:
            r11 = move-exception
            goto Lbb
        L6a:
            r10.f12609b = r6     // Catch: java.lang.Throwable -> L68
            kotlin.Unit r11 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L68
            r2.e(r7)
            java.lang.Object r11 = r10.f12611d
            r2 = r11
            pk.c r2 = (pk.c) r2
            long r8 = java.lang.System.currentTimeMillis()
            r0.f12775l = r2
            r0.f12776m = r8
            r0.f12779p = r5
            java.lang.Object r11 = r2.c(r0)
            if (r11 == r1) goto Lbf
            r5 = r8
        L87:
            java.lang.Cloneable r11 = r10.f12614g     // Catch: java.lang.Throwable -> Lb6
            com.google.android.gms.internal.ads.mw0 r11 = (com.google.android.gms.internal.ads.mw0) r11     // Catch: java.lang.Throwable -> Lb6
            if (r11 == 0) goto Lb0
            r11.b()     // Catch: java.lang.Throwable -> Lb6
            com.google.android.gms.internal.ads.sn1 r11 = r11.f9560c     // Catch: java.lang.Throwable -> Lb6
            com.google.android.gms.internal.ads.nw0 r11 = (com.google.android.gms.internal.ads.nw0) r11     // Catch: java.lang.Throwable -> Lb6
            r11.a0(r5)     // Catch: java.lang.Throwable -> Lb6
            r2.e(r7)
            r0.f12775l = r7
            r0.f12779p = r4
            java.lang.Object r11 = r10.v(r5, r0)
            if (r11 == r1) goto Lbf
        La4:
            r0.f12779p = r3
            java.lang.Object r11 = r10.w(r0)
            if (r11 != r1) goto Lad
            goto Lbf
        Lad:
            kotlin.Unit r11 = kotlin.Unit.f27471a
            return r11
        Lb0:
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.g(r11)     // Catch: java.lang.Throwable -> Lb6
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r11 = move-exception
            r2.e(r7)
            throw r11
        Lbb:
            r2.e(r7)
            throw r11
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.o(oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ec, blocks: (B:30:0x007a, B:33:0x0082, B:36:0x008e, B:38:0x0094, B:40:0x00ba, B:42:0x00ca, B:44:0x00d0, B:45:0x00e4, B:46:0x00e7, B:47:0x00e8, B:48:0x00eb, B:51:0x00ef, B:52:0x00f2, B:53:0x00f3, B:55:0x00f9, B:57:0x0103, B:59:0x0109, B:61:0x012f, B:62:0x0143, B:63:0x0146, B:64:0x0147, B:65:0x014a, B:66:0x014b, B:68:0x0151, B:71:0x0161, B:72:0x0164, B:73:0x0165, B:74:0x0168, B:75:0x0169, B:76:0x016c), top: B:83:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169 A[Catch: all -> 0x00ec, TryCatch #1 {all -> 0x00ec, blocks: (B:30:0x007a, B:33:0x0082, B:36:0x008e, B:38:0x0094, B:40:0x00ba, B:42:0x00ca, B:44:0x00d0, B:45:0x00e4, B:46:0x00e7, B:47:0x00e8, B:48:0x00eb, B:51:0x00ef, B:52:0x00f2, B:53:0x00f3, B:55:0x00f9, B:57:0x0103, B:59:0x0109, B:61:0x012f, B:62:0x0143, B:63:0x0146, B:64:0x0147, B:65:0x014a, B:66:0x014b, B:68:0x0151, B:71:0x0161, B:72:0x0164, B:73:0x0165, B:74:0x0168, B:75:0x0169, B:76:0x016c), top: B:83:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(oj.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.p(oj.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (t(r14, r1) == r2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0109, TRY_ENTER, TryCatch #1 {all -> 0x0109, blocks: (B:35:0x0091, B:38:0x0099, B:40:0x00a9, B:42:0x00c2, B:44:0x00d2, B:57:0x010b, B:58:0x010e, B:59:0x010f, B:60:0x0112, B:61:0x0113, B:62:0x0116, B:63:0x0117, B:64:0x011a), top: B:71:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117 A[Catch: all -> 0x0109, TryCatch #1 {all -> 0x0109, blocks: (B:35:0x0091, B:38:0x0099, B:40:0x00a9, B:42:0x00c2, B:44:0x00d2, B:57:0x010b, B:58:0x010e, B:59:0x010f, B:60:0x0112, B:61:0x0113, B:62:0x0116, B:63:0x0117, B:64:0x011a), top: B:71:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(oj.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.q(oj.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
    
        if (t(r14, r1) == r2) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0119, TRY_ENTER, TryCatch #1 {all -> 0x0119, blocks: (B:35:0x0091, B:38:0x0099, B:40:0x00a9, B:42:0x00c2, B:44:0x00d2, B:46:0x00e2, B:59:0x011b, B:60:0x011e, B:61:0x011f, B:62:0x0122, B:63:0x0123, B:64:0x0126, B:65:0x0127, B:66:0x012a, B:67:0x012b, B:68:0x012e), top: B:75:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b A[Catch: all -> 0x0119, TryCatch #1 {all -> 0x0119, blocks: (B:35:0x0091, B:38:0x0099, B:40:0x00a9, B:42:0x00c2, B:44:0x00d2, B:46:0x00e2, B:59:0x011b, B:60:0x011e, B:61:0x011f, B:62:0x0122, B:63:0x0123, B:64:0x0126, B:65:0x0127, B:66:0x012a, B:67:0x012b, B:68:0x012e), top: B:75:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(oj.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.r(oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(oj.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.dx0
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.gms.internal.ads.dx0 r0 = (com.google.android.gms.internal.ads.dx0) r0
            int r1 = r0.f4711p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4711p = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.dx0 r0 = new com.google.android.gms.internal.ads.dx0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f4709n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f4711p
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r1 = r0.f4707l
            pk.c r0 = r0.f4708m
            com.google.android.gms.internal.measurement.h5.E(r7)
            goto L4c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            com.google.android.gms.internal.measurement.h5.E(r7)
            java.lang.Object r7 = r6.f12611d
            pk.c r7 = (pk.c) r7
            long r4 = java.lang.System.currentTimeMillis()
            r0.f4708m = r7
            r0.f4707l = r4
            r0.f4711p = r3
            java.lang.Object r0 = r7.c(r0)
            if (r0 == r1) goto L6e
            r0 = r7
            r1 = r4
        L4c:
            r7 = 0
            java.lang.Cloneable r3 = r6.f12614g     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.mw0 r3 = (com.google.android.gms.internal.ads.mw0) r3     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L63
            r3.b()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.sn1 r3 = r3.f9560c     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.nw0 r3 = (com.google.android.gms.internal.ads.nw0) r3     // Catch: java.lang.Throwable -> L69
            r3.A(r1)     // Catch: java.lang.Throwable -> L69
            r0.e(r7)
            kotlin.Unit r7 = kotlin.Unit.f27471a
            return r7
        L63:
            java.lang.String r1 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.g(r1)     // Catch: java.lang.Throwable -> L69
            throw r7     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            r0.e(r7)
            throw r1
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.s(oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object t(java.lang.String r9, oj.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.uw0
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.uw0 r0 = (com.google.android.gms.internal.ads.uw0) r0
            int r1 = r0.f11120p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11120p = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.uw0 r0 = new com.google.android.gms.internal.ads.uw0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11118n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f11120p
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f11116l
            pk.a r9 = (pk.a) r9
            com.google.android.gms.internal.measurement.h5.E(r10)     // Catch: java.lang.Throwable -> L2f
            goto L71
        L2f:
            r10 = move-exception
            goto L7f
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            pk.c r9 = r0.f11117m
            java.lang.Object r2 = r0.f11116l
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.measurement.h5.E(r10)
            r10 = r9
            r9 = r2
            goto L58
        L45:
            com.google.android.gms.internal.measurement.h5.E(r10)
            java.lang.Object r10 = r8.f12613f
            pk.c r10 = (pk.c) r10
            r0.f11116l = r9
            r0.f11117m = r10
            r0.f11120p = r4
            java.lang.Object r2 = r10.c(r0)
            if (r2 == r1) goto L85
        L58:
            java.lang.Object r2 = r8.f12615h     // Catch: java.lang.Throwable -> L7b
            p2.h r2 = (p2.h) r2     // Catch: java.lang.Throwable -> L7b
            aj.i r4 = new aj.i     // Catch: java.lang.Throwable -> L7b
            r6 = 1
            r4.<init>(r9, r5, r6)     // Catch: java.lang.Throwable -> L7b
            r0.f11116l = r10     // Catch: java.lang.Throwable -> L7b
            r0.f11117m = r5     // Catch: java.lang.Throwable -> L7b
            r0.f11120p = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L7b
            if (r9 == r1) goto L85
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            com.google.android.gms.internal.ads.qw0 r10 = (com.google.android.gms.internal.ads.qw0) r10     // Catch: java.lang.Throwable -> L2f
            pk.c r9 = (pk.c) r9
            r9.e(r5)
            kotlin.Unit r9 = kotlin.Unit.f27471a
            return r9
        L7b:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7f:
            pk.c r9 = (pk.c) r9
            r9.e(r5)
            throw r10
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.t(java.lang.String, oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(oj.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.ww0
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.ww0 r0 = (com.google.android.gms.internal.ads.ww0) r0
            int r1 = r0.f11915o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11915o = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.ww0 r0 = new com.google.android.gms.internal.ads.ww0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f11913m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f11915o
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            pk.a r0 = r0.f11912l
            com.google.android.gms.internal.measurement.h5.E(r9)     // Catch: java.lang.Throwable -> L2d
            goto L66
        L2d:
            r9 = move-exception
            goto L74
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            pk.a r2 = r0.f11912l
            com.google.android.gms.internal.measurement.h5.E(r9)
            r9 = r2
            goto L4f
        L3e:
            com.google.android.gms.internal.measurement.h5.E(r9)
            java.lang.Object r9 = r8.f12613f
            pk.c r9 = (pk.c) r9
            r0.f11912l = r9
            r0.f11915o = r3
            java.lang.Object r2 = r9.c(r0)
            if (r2 == r1) goto L7a
        L4f:
            java.lang.Object r2 = r8.f12615h     // Catch: java.lang.Throwable -> L70
            p2.h r2 = (p2.h) r2     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.xw0 r3 = new com.google.android.gms.internal.ads.xw0     // Catch: java.lang.Throwable -> L70
            r6 = 0
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L70
            r0.f11912l = r9     // Catch: java.lang.Throwable -> L70
            r0.f11915o = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == r1) goto L7a
            r7 = r0
            r0 = r9
            r9 = r7
        L66:
            com.google.android.gms.internal.ads.qw0 r9 = (com.google.android.gms.internal.ads.qw0) r9     // Catch: java.lang.Throwable -> L2d
            pk.c r0 = (pk.c) r0
            r0.e(r5)
            kotlin.Unit r9 = kotlin.Unit.f27471a
            return r9
        L70:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L74:
            pk.c r0 = (pk.c) r0
            r0.e(r5)
            throw r9
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.u(oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(long r6, oj.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.vw0
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.vw0 r0 = (com.google.android.gms.internal.ads.vw0) r0
            int r1 = r0.f11504p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11504p = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.vw0 r0 = new com.google.android.gms.internal.ads.vw0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f11502n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f11504p
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r6 = r0.f11500l
            pk.c r0 = r0.f11501m
            com.google.android.gms.internal.measurement.h5.E(r8)
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.lang.Object r8 = r5.f12611d
            pk.c r8 = (pk.c) r8
            r0.f11501m = r8
            r0.f11500l = r6
            r0.f11504p = r3
            java.lang.Object r0 = r8.c(r0)
            if (r0 == r1) goto L86
            r0 = r8
        L47:
            r8 = 0
            java.lang.Cloneable r1 = r5.f12614g     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.mw0 r1 = (com.google.android.gms.internal.ads.mw0) r1     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L7e
            com.google.android.gms.internal.ads.sn1 r3 = r1.f9560c     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.nw0 r3 = (com.google.android.gms.internal.ads.nw0) r3     // Catch: java.lang.Throwable -> L78
            long r3 = r3.I()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r3
            java.lang.Cloneable r3 = r5.f12614g     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.mw0 r3 = (com.google.android.gms.internal.ads.mw0) r3     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.sn1 r2 = r3.f9560c     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.nw0 r2 = (com.google.android.gms.internal.ads.nw0) r2     // Catch: java.lang.Throwable -> L78
            long r2 = r2.H()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r2
            r1.b()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.sn1 r1 = r1.f9560c     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.nw0 r1 = (com.google.android.gms.internal.ads.nw0) r1     // Catch: java.lang.Throwable -> L78
            r1.S(r6)     // Catch: java.lang.Throwable -> L78
            r0.e(r8)
            kotlin.Unit r6 = kotlin.Unit.f27471a
            return r6
        L78:
            r6 = move-exception
            goto L82
        L7a:
            kotlin.jvm.internal.Intrinsics.g(r2)     // Catch: java.lang.Throwable -> L78
            throw r8     // Catch: java.lang.Throwable -> L78
        L7e:
            kotlin.jvm.internal.Intrinsics.g(r2)     // Catch: java.lang.Throwable -> L78
            throw r8     // Catch: java.lang.Throwable -> L78
        L82:
            r0.e(r8)
            throw r6
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.v(long, oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(oj.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.ax0
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.ax0 r0 = (com.google.android.gms.internal.ads.ax0) r0
            int r1 = r0.f3453p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3453p = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.ax0 r0 = new com.google.android.gms.internal.ads.ax0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f3451n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f3453p
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f3449l
            pk.a r0 = (pk.a) r0
            com.google.android.gms.internal.measurement.h5.E(r9)     // Catch: java.lang.Throwable -> L32
            goto L9a
        L32:
            r9 = move-exception
            goto La6
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            pk.c r2 = r0.f3450m
            java.lang.Object r4 = r0.f3449l
            com.google.android.gms.internal.ads.nw0 r4 = (com.google.android.gms.internal.ads.nw0) r4
            com.google.android.gms.internal.measurement.h5.E(r9)
            goto L83
        L47:
            java.lang.Object r2 = r0.f3449l
            pk.a r2 = (pk.a) r2
            com.google.android.gms.internal.measurement.h5.E(r9)
            goto L61
        L4f:
            com.google.android.gms.internal.measurement.h5.E(r9)
            java.lang.Object r9 = r8.f12611d
            r2 = r9
            pk.c r2 = (pk.c) r2
            r0.f3449l = r2
            r0.f3453p = r5
            java.lang.Object r9 = r2.c(r0)
            if (r9 == r1) goto Lba
        L61:
            java.lang.Cloneable r9 = r8.f12614g     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.mw0 r9 = (com.google.android.gms.internal.ads.mw0) r9     // Catch: java.lang.Throwable -> Lac
            if (r9 == 0) goto Lae
            com.google.android.gms.internal.ads.sn1 r9 = r9.d()     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.nw0 r9 = (com.google.android.gms.internal.ads.nw0) r9     // Catch: java.lang.Throwable -> Lac
            pk.c r2 = (pk.c) r2
            r2.e(r6)
            java.lang.Object r2 = r8.f12613f
            pk.c r2 = (pk.c) r2
            r0.f3449l = r9
            r0.f3450m = r2
            r0.f3453p = r4
            java.lang.Object r4 = r2.c(r0)
            if (r4 == r1) goto Lba
            r4 = r9
        L83:
            java.lang.Object r9 = r8.f12615h     // Catch: java.lang.Throwable -> La4
            p2.h r9 = (p2.h) r9     // Catch: java.lang.Throwable -> La4
            aj.i r5 = new aj.i     // Catch: java.lang.Throwable -> La4
            r7 = 2
            r5.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> La4
            r0.f3449l = r2     // Catch: java.lang.Throwable -> La4
            r0.f3450m = r6     // Catch: java.lang.Throwable -> La4
            r0.f3453p = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r9 = r9.a(r5, r0)     // Catch: java.lang.Throwable -> La4
            if (r9 == r1) goto Lba
            r0 = r2
        L9a:
            com.google.android.gms.internal.ads.qw0 r9 = (com.google.android.gms.internal.ads.qw0) r9     // Catch: java.lang.Throwable -> L32
            pk.c r0 = (pk.c) r0
            r0.e(r6)
            kotlin.Unit r9 = kotlin.Unit.f27471a
            return r9
        La4:
            r9 = move-exception
            r0 = r2
        La6:
            pk.c r0 = (pk.c) r0
            r0.e(r6)
            throw r9
        Lac:
            r9 = move-exception
            goto Lb4
        Lae:
            java.lang.String r9 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Throwable -> Lac
            throw r6     // Catch: java.lang.Throwable -> Lac
        Lb4:
            pk.c r2 = (pk.c) r2
            r2.e(r6)
            throw r9
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.w(oj.c):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yf0(Thread thread, int i) {
        this(new CopyOnWriteArraySet(), (Looper) null, thread, (c6) null, (be0) null, true);
        switch (i) {
            case 2:
                this(new CopyOnWriteArraySet(), (Looper) null, thread, (m3.t) null, (m3.l) null, true);
                break;
            default:
                break;
        }
    }

    public yf0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, c6 c6Var, be0 be0Var, boolean z5) {
        this.f12610c = thread;
        this.f12613f = copyOnWriteArraySet;
        this.f12612e = be0Var;
        this.i = new Object();
        this.f12614g = new ArrayDeque();
        this.f12615h = new ArrayDeque();
        this.f12611d = (looper == null || c6Var == null || be0Var == null) ? null : c6Var.y(looper, new of0(0, this));
        this.f12609b = z5;
    }

    public yf0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, m3.t tVar, m3.l lVar, boolean z5) {
        this.f12610c = thread;
        this.f12613f = copyOnWriteArraySet;
        this.f12612e = lVar;
        this.i = new Object();
        this.f12614g = new ArrayDeque();
        this.f12615h = new ArrayDeque();
        if (looper != null && tVar != null && lVar != null) {
            this.f12611d = tVar.a(looper, new m3.j(0, this));
        } else {
            this.f12611d = null;
        }
        this.f12609b = z5;
    }
}
