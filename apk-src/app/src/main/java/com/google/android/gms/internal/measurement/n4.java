package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f13887g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile e4 f13888h;
    public static final AtomicInteger i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.q f13889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f13892d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f13893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13894f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ n4(com.google.android.gms.internal.auth.q qVar, String str, Object obj, int i10) {
        this.f13894f = i10;
        if (qVar.f13280a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f13889a = qVar;
        this.f13890b = str;
        this.f13891c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f13894f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.f13890b;
                    Log.e("PhenotypeFlag", om1.n(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
                }
                break;
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!a4.f13650b.matcher(str2).matches()) {
                            if (a4.f13651c.matcher(str2).matches()) {
                            }
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.f13890b;
                    Log.e("PhenotypeFlag", om1.n(new StringBuilder(str3.length() + 28 + string2.length()), "Invalid boolean value for ", str3, ": ", string2));
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.f13890b;
                        Log.e("PhenotypeFlag", om1.n(new StringBuilder(str4.length() + 27 + string3.length()), "Invalid double value for ", str4, ": ", string3));
                    }
                }
                break;
            default:
                if (obj instanceof String) {
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 zc.f) = (r2v0 zc.f), (r2v0 zc.f), (r2v4 zc.f), (r2v4 zc.f) binds: [B:8:0x0014, B:10:0x0018, B:12:0x0024, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0034, B:19:0x0048, B:26:0x005e, B:28:0x0069, B:30:0x0071, B:33:0x0081, B:35:0x008f, B:47:0x00b4, B:50:0x00bc, B:51:0x00bf, B:52:0x00c3, B:39:0x0098, B:41:0x009c, B:43:0x00aa, B:45:0x00b0, B:53:0x00c8, B:54:0x00ca, B:16:0x0041, B:55:0x00cb), top: B:61:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0034, B:19:0x0048, B:26:0x005e, B:28:0x0069, B:30:0x0071, B:33:0x0081, B:35:0x008f, B:47:0x00b4, B:50:0x00bc, B:51:0x00bf, B:52:0x00c3, B:39:0x0098, B:41:0x009c, B:43:0x00aa, B:45:0x00b0, B:53:0x00c8, B:54:0x00ca, B:16:0x0041, B:55:0x00cb), top: B:61:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n4.b():java.lang.Object");
    }
}
