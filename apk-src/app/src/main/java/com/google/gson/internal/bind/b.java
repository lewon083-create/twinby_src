package com.google.gson.internal.bind;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f14945b = new x() { // from class: com.google.gson.internal.bind.DateTypeAdapter$1
        @Override // me.x
        public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new b();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14946a;

    public b() {
        ArrayList arrayList = new ArrayList();
        this.f14946a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (oe.f.f30652a >= 9) {
            arrayList.add(oe.d.i(2, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r3 = pe.b.b(r3, new java.text.ParsePosition(0));
     */
    @Override // me.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(re.b r3) {
        /*
            r2 = this;
            int r0 = r3.s()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.nextNull()
            r3 = 0
            return r3
        Ld:
            java.lang.String r3 = r3.nextString()
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.f14946a     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L2a
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L2a
            monitor-exit(r2)
            goto L37
        L2a:
            r3 = move-exception
            goto L3f
        L2c:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            java.util.Date r3 = pe.b.b(r3, r0)     // Catch: java.lang.Throwable -> L2a java.text.ParseException -> L38
            monitor-exit(r2)
        L37:
            return r3
        L38:
            r0 = move-exception
            me.q r1 = new me.q     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.b.a(re.b):java.lang.Object");
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.i();
            } else {
                cVar.s(((DateFormat) this.f14946a.get(0)).format(date));
            }
        }
    }
}
