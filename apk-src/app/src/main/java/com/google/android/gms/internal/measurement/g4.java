package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f13754j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f13755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f13756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f13757c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Map f13761g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.auth.i f13758d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f13759e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13760f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f13762h = new ArrayList();

    public g4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f13755a = contentResolver;
        this.f13756b = uri;
        this.f13757c = runnable;
    }

    public static g4 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        g4 g4Var = (g4) i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.f4
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new g4(contentResolver, uri, runnable);
            }
        });
        try {
            if (!g4Var.f13759e) {
                return g4Var;
            }
            synchronized (g4Var) {
                try {
                    if (g4Var.f13759e) {
                        com.google.android.gms.internal.auth.i iVar = new com.google.android.gms.internal.auth.i(2, g4Var);
                        g4Var.f13755a.registerContentObserver(g4Var.f13756b, false, iVar);
                        g4Var.f13758d = iVar;
                        g4Var.f13759e = false;
                    }
                } finally {
                }
            }
            return g4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            g4 g4Var = (g4) it.next();
            synchronized (g4Var) {
                try {
                    if (g4Var.f13759e) {
                        g4Var.f13759e = false;
                    } else {
                        com.google.android.gms.internal.auth.i iVar = g4Var.f13758d;
                        if (iVar != null) {
                            g4Var.f13755a.unregisterContentObserver(iVar);
                            g4Var.f13758d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f13761g
            if (r0 != 0) goto L4f
            java.lang.Object r1 = r5.f13760f
            monitor-enter(r1)
            java.util.Map r0 = r5.f13761g     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L4b
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.measurement.z5 r2 = new com.google.android.gms.internal.measurement.z5     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.a()     // Catch: java.lang.SecurityException -> L19 java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L24
        L19:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L24:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r0 = move-exception
            goto L4d
        L2c:
            r2 = move-exception
            goto L47
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2c
            goto L26
        L43:
            r5.f13761g = r2     // Catch: java.lang.Throwable -> L2a
            r0 = r2
            goto L4b
        L47:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L4f:
            if (r0 == 0) goto L52
            return r0
        L52:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g4.b():java.util.Map");
    }
}
