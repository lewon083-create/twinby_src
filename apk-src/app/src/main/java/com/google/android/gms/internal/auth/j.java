package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h1.e f13237g = new h1.e(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f13238h = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f13239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f13240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f13241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Map f13243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f13244f;

    public j(ContentResolver contentResolver, Uri uri) {
        i iVar = new i(0, this);
        this.f13241c = iVar;
        this.f13242d = new Object();
        this.f13244f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f13239a = contentResolver;
        this.f13240b = uri;
        contentResolver.registerContentObserver(uri, false, iVar);
    }

    public static synchronized void b() {
        try {
            for (j jVar : (h1.d) f13237g.values()) {
                jVar.f13239a.unregisterContentObserver(jVar.f13241c);
            }
            f13237g.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object a(String str) {
        Map map;
        ?? r02;
        Object objH;
        Map map2 = this.f13243e;
        ?? r03 = map2;
        if (map2 == null) {
            synchronized (this.f13242d) {
                ?? r04 = this.f13243e;
                if (r04 != 0) {
                    r02 = r04;
                } else {
                    try {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            w0 w0Var = new w0(1, this);
                            try {
                                objH = w0Var.h();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objH = w0Var.h();
                                } finally {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                }
                            }
                            map = (Map) objH;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f13243e = map;
                        r02 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(r04);
                        throw th2;
                    }
                }
            }
            r03 = r02;
        }
        if (r03 == 0) {
            r03 = Collections.EMPTY_MAP;
        }
        return (String) r03.get(str);
    }
}
