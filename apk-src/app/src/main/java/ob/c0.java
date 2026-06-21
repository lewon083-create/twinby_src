package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f29975f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f29977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29979d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f29980e = null;

    public /* synthetic */ c0(String str, Object obj, w wVar) {
        this.f29976a = str;
        this.f29978c = obj;
        this.f29977b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f29979d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L7
            return r4
        L7:
            l7.b r4 = ob.y1.f30552k
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f29978c
            return r4
        Le:
            java.lang.Object r4 = ob.c0.f29975f
            monitor-enter(r4)
            boolean r0 = l7.b.e()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f29980e     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f29978c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L64
        L20:
            java.lang.Object r0 = r3.f29980e     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = ob.d0.f29996a     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            ob.c0 r0 = (ob.c0) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = l7.b.e()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            ob.w r2 = r0.f29977b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.h()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = ob.c0.f29975f     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.f29980e = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
            ob.w r4 = r3.f29977b
            if (r4 != 0) goto L5f
        L5c:
            java.lang.Object r4 = r3.f29978c
            goto L63
        L5f:
            java.lang.Object r4 = r4.h()     // Catch: java.lang.Throwable -> L5c
        L63:
            return r4
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L66:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.c0.a(java.lang.Object):java.lang.Object");
    }
}
