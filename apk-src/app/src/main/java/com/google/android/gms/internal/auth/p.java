package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.internal.measurement.h5;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f13271g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile h f13272h;
    public static final AtomicInteger i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f13276d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f13277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13278f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ p(q qVar, String str, Object obj, int i10) {
        this.f13278f = i10;
        if (qVar.f13280a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f13273a = qVar;
        this.f13274b = str;
        this.f13275c = obj;
    }

    public static void c(Context context) {
        Context context2;
        if (f13272h != null || context == null) {
            return;
        }
        Object obj = f13271g;
        synchronized (obj) {
            try {
                if (f13272h == null) {
                    synchronized (obj) {
                        try {
                            h hVar = f13272h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (hVar == null || hVar.f13225a != context) {
                                j.b();
                                s.a();
                                synchronized (l.class) {
                                    l lVar = l.f13254c;
                                    if (lVar != null && (context2 = (Context) lVar.f13255a) != null && ((e) lVar.f13256b) != null) {
                                        context2.getContentResolver().unregisterContentObserver((e) l.f13254c.f13256b);
                                    }
                                    l.f13254c = null;
                                }
                                f13272h = new h(context, h5.H(new w0(2, context)));
                                i.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        } finally {
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        android.util.Log.e("PhenotypeFlag", "Invalid double value for " + r2.f13274b + ": " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        android.util.Log.e("PhenotypeFlag", "Invalid long value for " + r2.f13274b + ": " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.e("PhenotypeFlag", "Invalid byte[] value for " + r2.f13274b + ": " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r2.f13278f
            switch(r0) {
                case 0: goto L93;
                case 1: goto L56;
                case 2: goto L2e;
                default: goto L5;
            }
        L5:
            r0 = 3
            byte[] r0 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.auth.z1 r3 = com.google.android.gms.internal.auth.z1.j(r0)     // Catch: java.lang.Throwable -> Lf
            goto L2d
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid byte[] value for "
            r0.<init>(r1)
            java.lang.String r1 = r2.f13274b
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r3)
            r3 = 0
        L2d:
            return r3
        L2e:
            double r0 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L37
            java.lang.Double r3 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L37
            goto L55
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid double value for "
            r0.<init>(r1)
            java.lang.String r1 = r2.f13274b
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r3)
            r3 = 0
        L55:
            return r3
        L56:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.auth.f.f13197b
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L65
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L92
        L65:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.auth.f.f13198c
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L74
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L92
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid boolean value for "
            r0.<init>(r1)
            java.lang.String r1 = r2.f13274b
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r3)
            r3 = 0
        L92:
            return r3
        L93:
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L9c
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L9c
            goto Lba
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid long value for "
            r0.<init>(r1)
            java.lang.String r1 = r2.f13274b
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r3)
            r3 = 0
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.p.a(java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[PHI: r2
      0x0056: PHI (r2v1 com.google.android.gms.internal.auth.u) = 
      (r2v0 com.google.android.gms.internal.auth.u)
      (r2v5 com.google.android.gms.internal.auth.u)
      (r2v5 com.google.android.gms.internal.auth.u)
     binds: [B:8:0x0014, B:10:0x0022, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0035, B:17:0x0046, B:23:0x005b, B:25:0x0061, B:27:0x0069, B:28:0x0077, B:43:0x0095, B:45:0x009d, B:48:0x00a7, B:50:0x00ad, B:51:0x00b1, B:63:0x00d0, B:67:0x00da, B:69:0x00e0, B:66:0x00d8, B:72:0x00e6, B:74:0x00e9, B:76:0x00ed, B:79:0x00f5, B:80:0x00f8, B:81:0x00fc, B:40:0x0091, B:82:0x0101, B:83:0x0103, B:84:0x0104, B:85:0x0109, B:86:0x010a, B:52:0x00b2, B:54:0x00b6, B:56:0x00be, B:60:0x00cb, B:59:0x00c6, B:61:0x00cd, B:62:0x00cf, B:29:0x0078, B:31:0x0082, B:32:0x0087, B:37:0x008e), top: B:94:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0035, B:17:0x0046, B:23:0x005b, B:25:0x0061, B:27:0x0069, B:28:0x0077, B:43:0x0095, B:45:0x009d, B:48:0x00a7, B:50:0x00ad, B:51:0x00b1, B:63:0x00d0, B:67:0x00da, B:69:0x00e0, B:66:0x00d8, B:72:0x00e6, B:74:0x00e9, B:76:0x00ed, B:79:0x00f5, B:80:0x00f8, B:81:0x00fc, B:40:0x0091, B:82:0x0101, B:83:0x0103, B:84:0x0104, B:85:0x0109, B:86:0x010a, B:52:0x00b2, B:54:0x00b6, B:56:0x00be, B:60:0x00cb, B:59:0x00c6, B:61:0x00cd, B:62:0x00cf, B:29:0x0078, B:31:0x0082, B:32:0x0087, B:37:0x008e), top: B:94:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.p.b():java.lang.Object");
    }
}
