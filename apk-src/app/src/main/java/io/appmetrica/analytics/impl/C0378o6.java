package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0378o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0051ba f24466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0176g6 f24467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f24468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0025aa f24469d;

    public C0378o6(Context context) {
        this(context, new C0051ba(), new C0176g6(), C0025aa.a(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.appmetrica.analytics.impl.C0538uh r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f24468c
            java.io.File r0 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getCrashesDirectory(r0)
            io.appmetrica.analytics.impl.g6 r1 = r6.f24467b
            r1.getClass()
            if (r0 != 0) goto Lf
            goto Laf
        Lf:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L27
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1c
            goto L2d
        L1c:
            boolean r1 = r0.delete()
            if (r1 == 0) goto Laf
            boolean r1 = r0.mkdir()
            goto L2b
        L27:
            boolean r1 = r0.mkdir()
        L2b:
            if (r1 == 0) goto Laf
        L2d:
            io.appmetrica.analytics.impl.Eh r1 = r7.f24851e
            io.appmetrica.analytics.impl.Af r1 = r1.f22438a
            android.content.ContentValues r2 = r1.f22072a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_ID"
            java.lang.Integer r2 = r2.getAsInteger(r3)
            android.content.ContentValues r1 = r1.f22072a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_SESSION_ID"
            java.lang.String r1 = r1.getAsString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "-"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            io.appmetrica.analytics.impl.aa r2 = r6.f24469d
            io.appmetrica.analytics.impl.y9 r2 = r2.b(r1)
            java.util.concurrent.locks.ReentrantLock r3 = r2.f25091a     // Catch: java.lang.Throwable -> La3
            r3.lock()     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.Z9 r3 = r2.f25092b     // Catch: java.lang.Throwable -> La3
            r3.a()     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.ba r3 = r6.f24466a     // Catch: java.lang.Throwable -> La3
            r3.getClass()     // Catch: java.lang.Throwable -> La3
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La3
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> La3
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> La3
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> La3
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La3
            r5.<init>(r3)     // Catch: java.lang.Throwable -> La3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La3
            r0.<init>(r4)     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.kb r3 = new io.appmetrica.analytics.impl.kb     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.Q5 r4 = r7.f24847a     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.Eh r5 = r7.f24851e     // Catch: java.lang.Throwable -> La4
            java.util.HashMap r7 = r7.f24850d     // Catch: java.lang.Throwable -> La4
            r3.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = r3.k()     // Catch: java.lang.Throwable -> La4
            r0.write(r7)     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.ko.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.aa r7 = r6.f24469d
            monitor-enter(r7)
            java.util.HashMap r0 = r7.f23426b     // Catch: java.lang.Throwable -> La0
            r0.remove(r1)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r7)
            return
        La0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        La3:
            r0 = 0
        La4:
            io.appmetrica.analytics.impl.ko.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.aa r7 = r6.f24469d
            r7.a(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0378o6.a(io.appmetrica.analytics.impl.uh):void");
    }

    public C0378o6(Context context, C0051ba c0051ba, C0176g6 c0176g6, C0025aa c0025aa) {
        this.f24468c = context;
        this.f24466a = c0051ba;
        this.f24467b = c0176g6;
        this.f24469d = c0025aa;
    }
}
