package w7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = h.f35195h;
        }
        if (!h.f35194g.d(this, null, obj)) {
            return false;
        }
        h.d(this);
        return true;
    }

    public final boolean k(Throwable th2) {
        if (!h.f35194g.d(this, null, new b(th2))) {
            return false;
        }
        h.d(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(ed.d r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f35196b
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = w7.h.g(r6)
            wa.a r0 = w7.h.f35194g
            boolean r6 = r0.d(r5, r3, r6)
            if (r6 == 0) goto L4f
            w7.h.d(r5)
            return r2
        L20:
            w7.e r0 = new w7.e
            r0.<init>(r5, r6)
            wa.a r4 = w7.h.f35194g
            boolean r3 = r4.d(r5, r3, r0)
            if (r3 == 0) goto L42
            w7.i r1 = w7.i.f35199b     // Catch: java.lang.Throwable -> L33
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            w7.b r1 = new w7.b     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            w7.b r1 = w7.b.f35176b
        L3c:
            wa.a r6 = w7.h.f35194g
            r6.d(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f35196b
        L44:
            boolean r2 = r0 instanceof w7.a
            if (r2 == 0) goto L4f
            w7.a r0 = (w7.a) r0
            boolean r0 = r0.f35174a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.j.l(ed.d):boolean");
    }
}
