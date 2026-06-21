package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0668zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Am f25129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f25130b;

    public C0668zm(@NotNull Am am) {
        this.f25129a = am;
    }

    @NotNull
    public final Context b() {
        return this.f25129a.f22083a;
    }

    @Nullable
    public final synchronized NetworkTask c() throws Throwable {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f25130b;
                    if (networkTask == null || networkTask.isRemoved()) {
                        C0037am c0037amD = d();
                        Vd vd2 = Vd.f23132a;
                        Wl wl2 = new Wl(new C0184ge(), C0382oa.I.p());
                        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c0037amD);
                        try {
                            NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0427q5(this.f25129a.f22083a), new AllHostsExponentialBackoffPolicy(Vd.f23132a.a(Td.STARTUP)), new C0618xm(this, new Ql(), new FullUrlFormer(wl2, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), kotlin.collections.b0.f27475b, Vd.f23134c);
                            this.f25130b = networkTask2;
                            networkTask = networkTask2;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @NotNull
    public final C0037am d() {
        return (C0037am) this.f25129a.f22093l.a();
    }

    @NotNull
    public final C0140em e() {
        C0140em c0140em;
        Hl hl2 = this.f25129a.f22093l;
        synchronized (hl2) {
            c0140em = hl2.f24563c.f22651a;
        }
        return c0140em;
    }

    public final void f() {
        C0140em c0140em;
        Hl hl2 = this.f25129a.f22093l;
        synchronized (hl2) {
            c0140em = hl2.f24563c.f22651a;
        }
        C0243im c0243im = c0140em.f23787c;
        C0218hm c0218hmA = c0243im.a(c0243im.f24104m);
        String strA = c0140em.f23785a;
        String str = c0140em.f23786b;
        oo ooVar = this.f25129a.f22095n;
        String str2 = c0140em.f23788d;
        ooVar.getClass();
        if (!oo.a(str2)) {
            c0218hmA.f23999a = this.f25129a.f22094m.a().f25138id;
        }
        String str3 = c0140em.f23785a;
        if (str3 == null || str3.length() == 0) {
            strA = this.f25129a.f22090h.a();
            str = "";
        }
        List<String> list = this.f25129a.f22085c.f23358e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        c0218hmA.f24005g = list;
        C0140em c0140em2 = new C0140em(strA, str, new C0243im(c0218hmA));
        b(c0140em2);
        a(c0140em2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[PHI: r2
      0x006a: PHI (r2v4 boolean) = (r2v3 boolean), (r2v7 boolean), (r2v7 boolean) binds: [B:17:0x0033, B:26:0x0065, B:27:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean g() {
        /*
            r8 = this;
            monitor-enter(r8)
            io.appmetrica.analytics.impl.oa r0 = io.appmetrica.analytics.impl.C0382oa.I     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.F6 r0 = r0.h()     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.isRestrictedForSdk()     // Catch: java.lang.Throwable -> L30
            r1 = 0
            if (r0 == 0) goto L10
            monitor-exit(r8)
            return r1
        L10:
            io.appmetrica.analytics.impl.em r0 = r8.e()     // Catch: java.lang.Throwable -> L30
            java.util.Set r2 = io.appmetrica.analytics.impl.AbstractC0063bm.f23522a     // Catch: java.lang.Throwable -> L30
            boolean r2 = r0.f23806w     // Catch: java.lang.Throwable -> L30
            r3 = 1
            if (r2 != 0) goto L32
            long r4 = r0.f23798o     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.Bm r2 = r0.f23809z     // Catch: java.lang.Throwable -> L30
            int r2 = r2.f22162a     // Catch: java.lang.Throwable -> L30
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L30
            long r4 = r4 + r6
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r2 = io.appmetrica.analytics.impl.AbstractC0063bm.f23523b     // Catch: java.lang.Throwable -> L30
            long r6 = r2.currentTimeSeconds()     // Catch: java.lang.Throwable -> L30
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2e
            goto L32
        L2e:
            r2 = r1
            goto L33
        L30:
            r0 = move-exception
            goto L6d
        L32:
            r2 = r3
        L33:
            if (r2 != 0) goto L6a
            java.lang.String r2 = r0.f23788d     // Catch: java.lang.Throwable -> L30
            boolean r2 = io.appmetrica.analytics.impl.AbstractC0063bm.a(r2)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L4e
            java.lang.String r2 = r0.f23785a     // Catch: java.lang.Throwable -> L30
            boolean r2 = io.appmetrica.analytics.impl.AbstractC0063bm.a(r2)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L4e
            java.lang.String r2 = r0.f23786b     // Catch: java.lang.Throwable -> L30
            boolean r2 = io.appmetrica.analytics.impl.AbstractC0063bm.a(r2)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L4e
            r1 = r3
        L4e:
            r2 = r1 ^ 1
            io.appmetrica.analytics.impl.Am r4 = r8.f25129a     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.D3 r4 = r4.f22092k     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.am r5 = r8.d()     // Catch: java.lang.Throwable -> L30
            java.util.Map r5 = r5.f23455h     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.Am r6 = r8.f25129a     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.A3 r6 = r6.f22091j     // Catch: java.lang.Throwable -> L30
            r4.getClass()     // Catch: java.lang.Throwable -> L30
            boolean r0 = io.appmetrica.analytics.impl.D3.a(r5, r0, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r3 = r2
        L6b:
            monitor-exit(r8)
            return r3
        L6d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0668zm.g():boolean");
    }

    public final synchronized void h() {
        this.f25130b = null;
    }

    @NotNull
    public final R4 a() {
        return this.f25129a.f22088f;
    }

    public final synchronized void b(C0140em c0140em) {
        this.f25129a.f22093l.a(c0140em);
        C0115dm c0115dm = this.f25129a.f22089g;
        c0115dm.f23708b.a(c0140em.f23785a);
        c0115dm.f23708b.b(c0140em.f23786b);
        c0115dm.f23707a.save(c0140em.f23787c);
        this.f25129a.f22087e.a(c0140em);
    }

    public final synchronized boolean a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC0063bm.a(e(), list, map, new C0643ym(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C0140em a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C0089cm r9, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C0037am r10, long r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0668zm.a(io.appmetrica.analytics.impl.cm, io.appmetrica.analytics.impl.am, long):io.appmetrica.analytics.impl.em");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:14:0x0037, B:16:0x003e), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C0089cm r4, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C0037am r5, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.ko.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            boolean r0 = io.appmetrica.analytics.impl.ko.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            r0 = 0
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.util.Date r6 = r0.parse(r6)     // Catch: java.lang.Throwable -> L34
            long r0 = r6.getTime()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L34
            goto L35
        L32:
            r4 = move-exception
            goto L56
        L34:
            r6 = 0
        L35:
            if (r6 == 0) goto L3c
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L32
            goto L3e
        L3c:
            r0 = 0
        L3e:
            java.lang.Long r6 = r4.f23629l     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.Wj r2 = io.appmetrica.analytics.impl.Vj.f23155a     // Catch: java.lang.Throwable -> L32
            r2.a(r0, r6)     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.em r4 = r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            r3.h()     // Catch: java.lang.Throwable -> L32
            r3.b(r4)     // Catch: java.lang.Throwable -> L32
            kotlin.Unit r5 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            r3.a(r4)
            return
        L56:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0668zm.a(io.appmetrica.analytics.impl.cm, io.appmetrica.analytics.impl.am, java.util.Map):void");
    }

    public final void a(C0140em c0140em) {
        ArrayList arrayList;
        Am am = this.f25129a;
        El el2 = am.f22086d;
        String str = am.f22084b;
        synchronized (el2.f22306a.f22400b) {
            try {
                Gl gl2 = el2.f22306a;
                gl2.f22401c = c0140em;
                Collection collection = (Collection) gl2.f22399a.f24625a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).a(c0140em);
        }
    }

    public final void a(@NotNull Il il2) {
        synchronized (this) {
            this.f25130b = null;
        }
        Am am = this.f25129a;
        am.f22086d.a(am.f22088f.f22909a, il2, e());
    }

    public final synchronized void a(@NotNull Yl yl2) {
        try {
            this.f25129a.f22093l.a(yl2);
            C0037am c0037amD = d();
            if (c0037amD.f23457k) {
                List list = c0037amD.f23456j;
                if (list != null && !list.isEmpty()) {
                    if (!ko.a(list, c0037amD.f23452e)) {
                        C0140em c0140emE = e();
                        C0243im c0243im = c0140emE.f23787c;
                        C0218hm c0218hmA = c0243im.a(c0243im.f24104m);
                        String str = c0140emE.f23785a;
                        String str2 = c0140emE.f23786b;
                        c0218hmA.f24005g = list;
                        C0140em c0140em = new C0140em(str, str2, new C0243im(c0218hmA));
                        b(c0140em);
                        a(c0140em);
                    }
                } else {
                    if (c0037amD.f23452e != null && (!r5.isEmpty())) {
                        C0140em c0140emE2 = e();
                        C0243im c0243im2 = c0140emE2.f23787c;
                        C0218hm c0218hmA2 = c0243im2.a(c0243im2.f24104m);
                        String str3 = c0140emE2.f23785a;
                        String str4 = c0140emE2.f23786b;
                        c0218hmA2.f24005g = null;
                        C0140em c0140em2 = new C0140em(str3, str4, new C0243im(c0218hmA2));
                        b(c0140em2);
                        a(c0140em2);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
