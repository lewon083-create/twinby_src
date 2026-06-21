package me;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f28872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28873b;

    public a(int i, int i10, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.f28873b = arrayList;
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f28872a = cls;
            Locale locale = Locale.US;
            arrayList.add(DateFormat.getDateTimeInstance(i, i10, locale));
            if (!Locale.getDefault().equals(locale)) {
                arrayList.add(DateFormat.getDateTimeInstance(i, i10));
            }
            if (oe.f.f30652a >= 9) {
                arrayList.add(oe.d.i(i, i10));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r4 = pe.b.b(r4, new java.text.ParsePosition(0));
     */
    @Override // me.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(re.b r4) {
        /*
            r3 = this;
            int r0 = r4.s()
            r1 = 9
            if (r0 != r1) goto Ld
            r4.nextNull()
            r4 = 0
            return r4
        Ld:
            java.lang.String r4 = r4.nextString()
            java.util.ArrayList r0 = r3.f28873b
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f28873b     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        L1a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L2c
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L1a java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            goto L39
        L2c:
            r4 = move-exception
            goto L6b
        L2e:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.lang.Throwable -> L2c java.text.ParseException -> L64
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.text.ParseException -> L64
            java.util.Date r4 = pe.b.b(r4, r1)     // Catch: java.lang.Throwable -> L2c java.text.ParseException -> L64
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
        L39:
            java.lang.Class r0 = r3.f28872a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L40
            goto L5d
        L40:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L4f
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L4d:
            r4 = r0
            goto L5d
        L4f:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L5e
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L4d
        L5d:
            return r4
        L5e:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L64:
            r1 = move-exception
            me.q r2 = new me.q     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.a(re.b):java.lang.Object");
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            cVar.i();
            return;
        }
        synchronized (this.f28873b) {
            cVar.s(((DateFormat) this.f28873b.get(0)).format(date));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f28873b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
