package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l f13254c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13256b;

    public l() {
        this.f13255a = null;
        this.f13256b = null;
    }

    public Object a() {
        l lVar = (l) this.f13255a;
        String str = (String) this.f13256b;
        ContentResolver contentResolver = ((Context) lVar.f13255a).getContentResolver();
        Uri uri = f.f13196a;
        synchronized (f.class) {
            try {
                int i = 0;
                String str2 = null;
                byte b2 = 0;
                if (f.f13200e == null) {
                    f.f13199d.set(false);
                    f.f13200e = new HashMap(16, 1.0f);
                    f.f13204j = new Object();
                    contentResolver.registerContentObserver(f.f13196a, true, new e(b2 == true ? 1 : 0, i));
                } else if (f.f13199d.getAndSet(false)) {
                    f.f13200e.clear();
                    f.f13201f.clear();
                    f.f13202g.clear();
                    f.f13203h.clear();
                    f.i.clear();
                    f.f13204j = new Object();
                }
                Object obj = f.f13204j;
                if (f.f13200e.containsKey(str)) {
                    String str3 = (String) f.f13200e.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                int length = f.f13205k.length;
                Cursor cursorQuery = contentResolver.query(f.f13196a, null, null, new String[]{str}, null);
                if (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            synchronized (f.class) {
                                try {
                                    if (obj == f.f13204j) {
                                        f.f13200e.put(str, null);
                                    }
                                } finally {
                                }
                            }
                            return null;
                        }
                        String string = cursorQuery.getString(1);
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (f.class) {
                            try {
                                if (obj == f.f13204j) {
                                    f.f13200e.put(str, string);
                                }
                            } finally {
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                    } finally {
                        cursorQuery.close();
                    }
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        if (r6 == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f13255a
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L92
            boolean r2 = com.google.android.gms.internal.auth.g.f13211b
            if (r2 == 0) goto Lc
            goto L5d
        Lc:
            java.lang.Class<com.google.android.gms.internal.auth.g> r2 = com.google.android.gms.internal.auth.g.class
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.internal.auth.g.f13211b     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L18
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            goto L5d
        L15:
            r9 = move-exception
            goto L90
        L18:
            r3 = 1
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.auth.g.f13210a     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.g.f13210a = r5     // Catch: java.lang.Throwable -> L15
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.auth.g.f13210a     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L32
            r6 = r3
            goto L55
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L51
        L42:
            r6 = r3
            goto L51
        L44:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.g.f13210a = r1     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + 1
            goto L1a
        L51:
            if (r6 == 0) goto L55
            com.google.android.gms.internal.auth.g.f13210a = r1     // Catch: java.lang.Throwable -> L15
        L55:
            if (r6 == 0) goto L59
            com.google.android.gms.internal.auth.g.f13211b = r3     // Catch: java.lang.Throwable -> L15
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L5d
            goto L92
        L5d:
            com.google.android.gms.internal.auth.l r0 = new com.google.android.gms.internal.auth.l     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
            java.lang.Object r0 = r0.a()     // Catch: java.lang.SecurityException -> L67 java.lang.NullPointerException -> L75 java.lang.IllegalStateException -> L79
            goto L72
        L67:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L7b
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
        L72:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
            return r0
        L75:
            r0 = move-exception
            goto L80
        L77:
            r0 = move-exception
            goto L80
        L79:
            r0 = move-exception
            goto L80
        L7b:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
            throw r0     // Catch: java.lang.NullPointerException -> L75 java.lang.SecurityException -> L77 java.lang.IllegalStateException -> L79
        L80:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r3 = "GservicesLoader"
            java.lang.String r9 = r2.concat(r9)
            android.util.Log.e(r3, r9, r0)
            return r1
        L90:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r9
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.l.b(java.lang.String):java.lang.String");
    }

    public /* synthetic */ l(l lVar, String str) {
        this.f13255a = lVar;
        this.f13256b = str;
    }

    public l(Context context) {
        this.f13255a = context;
        e eVar = new e(null, 1);
        this.f13256b = eVar;
        context.getContentResolver().registerContentObserver(f.f13196a, true, eVar);
    }
}
