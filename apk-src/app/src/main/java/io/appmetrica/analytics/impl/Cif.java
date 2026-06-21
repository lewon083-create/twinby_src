package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Cif implements Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24073b = "content://" + a() + "/preload_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24074c = "tracking_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24075d = "additional_parameters";

    public Cif(@NotNull Context context) {
        this.f24072a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x00a1, TryCatch #1 {all -> 0x00a1, blocks: (B:8:0x002a, B:10:0x0030, B:20:0x0060, B:22:0x0066, B:25:0x006d, B:26:0x0075, B:19:0x005a, B:29:0x0090, B:30:0x0098, B:12:0x0046, B:15:0x004d, B:17:0x0054), top: B:38:0x0028, inners: #2 }] */
    @Override // io.appmetrica.analytics.impl.Ti, kotlin.jvm.functions.Function0
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C0412pf invoke() {
        /*
            r10 = this;
            android.content.Context r0 = r10.f24072a
            java.lang.String r1 = "com.yandex.preinstallsatellite.appmetrica.provider"
            boolean r0 = io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.hasContentProvider(r0, r1)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Satellite content provider with preload info was not found."
            io.appmetrica.analytics.impl.AbstractC0137ej.a(r2, r0)
            return r1
        L14:
            android.content.Context r0 = r10.f24072a     // Catch: java.lang.Throwable -> La0
            android.content.ContentResolver r3 = r0.getContentResolver()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r10.f24073b     // Catch: java.lang.Throwable -> La0
            android.net.Uri r4 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> La0
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L98
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L90
            java.lang.String r3 = r10.f24074c     // Catch: java.lang.Throwable -> La1
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r10.f24075d     // Catch: java.lang.Throwable -> La1
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L54
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L4d
            goto L54
        L4d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5a
        L52:
            r6 = r4
            goto L60
        L54:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            goto L52
        L5a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La1
            r4.<init>()     // Catch: java.lang.Throwable -> La1
            goto L52
        L60:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L75
            java.lang.Long r3 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r5)     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L6d
            goto L75
        L6d:
            java.lang.String r3 = "Tracking id from Satellite is not a number."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La1
            io.appmetrica.analytics.impl.AbstractC0137ej.a(r3, r2)     // Catch: java.lang.Throwable -> La1
            goto La1
        L75:
            java.lang.String r2 = "Preload info from Satellite: {tracking id = %s, additional parameters = %s}"
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Throwable -> La1
            io.appmetrica.analytics.impl.AbstractC0137ej.a(r2, r3)     // Catch: java.lang.Throwable -> La1
            io.appmetrica.analytics.impl.pf r4 = new io.appmetrica.analytics.impl.pf     // Catch: java.lang.Throwable -> La1
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La1
            r7 = r2 ^ 1
            io.appmetrica.analytics.impl.T7 r9 = io.appmetrica.analytics.impl.T7.f23006d     // Catch: java.lang.Throwable -> La1
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La1
            io.appmetrica.analytics.impl.ko.a(r0)
            return r4
        L90:
            java.lang.String r3 = "No Preload Info data in Satellite content provider"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La1
            io.appmetrica.analytics.impl.AbstractC0137ej.a(r3, r2)     // Catch: java.lang.Throwable -> La1
            goto La1
        L98:
            java.lang.String r3 = "No Satellite content provider found"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La1
            io.appmetrica.analytics.impl.AbstractC0137ej.a(r3, r2)     // Catch: java.lang.Throwable -> La1
            goto La1
        La0:
            r0 = r1
        La1:
            io.appmetrica.analytics.impl.ko.a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Cif.invoke():io.appmetrica.analytics.impl.pf");
    }
}
