package t9;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.ef0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.wk;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33626a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33627b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33628c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33629d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33630e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33631f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ff0 f33632g;

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", p9.k.C.f31297c.F(context, str2));
        s sVarA = new u(context).a(0, str, map, null);
        try {
            return (String) sVarA.f6961b.get(((Integer) q9.s.f31967e.f31970c.a(al.M5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            u9.i.f("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e3);
            sVarA.cancel(true);
            return null;
        } catch (TimeoutException e7) {
            u9.i.f("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e7);
            sVarA.cancel(true);
            return null;
        } catch (Exception e10) {
            u9.i.f("Error retrieving a response from: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    public final void a(Context context) {
        ff0 ff0Var;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3229ua)).booleanValue() || (ff0Var = this.f33632g) == null) {
            return;
        }
        ff0Var.e(new j(this, context), ef0.f4933e);
    }

    public final boolean b(Context context, String str, String str2) {
        wk wkVar = al.K5;
        q9.s sVar = q9.s.f31967e;
        String strJ = j(context, k(context, (String) sVar.f31970c.a(wkVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            u9.i.c("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) sVar.f31970c.a(al.f3229ua)).booleanValue()) {
                e0 e0VarG = p9.k.C.f31302h.g();
                if (true != zEquals) {
                    str = "";
                }
                e0VarG.f(str);
            }
            return zEquals;
        } catch (JSONException e3) {
            u9.i.i("Fail to get debug mode response json.", e3);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        g0 g0Var = p9.k.C.f31297c;
        g0.v(context, k(context, (String) q9.s.f31967e.f31970c.a(al.I5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        u9.i.c("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) q9.s.f31967e.f31970c.a(al.L5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        g0 g0Var = p9.k.C.f31297c;
        new x(context, str, builderBuildUpon.build().toString(), null).B();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f33626a
            monitor-enter(r0)
            r3.f33630e = r4     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.f3229ua     // Catch: java.lang.Throwable -> L45
            q9.s r2 = q9.s.f31967e     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            p9.k r1 = p9.k.C     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.bx r1 = r1.f31302h     // Catch: java.lang.Throwable -> L45
            t9.e0 r1 = r1.g()     // Catch: java.lang.Throwable -> L45
            r1.e(r4)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.ff0 r1 = r3.f33632g     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            boolean r2 = r1.f5357u     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L30
            if (r4 == 0) goto L3b
            r1.j()     // Catch: java.lang.Throwable -> L45
            goto L32
        L30:
            if (r4 == 0) goto L3b
        L32:
            boolean r4 = r1.f5355s     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L37
            goto L3b
        L37:
            r1.k()     // Catch: java.lang.Throwable -> L45
            goto L47
        L3b:
            boolean r4 = r1.f()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            r1.l()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r4 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l.f(boolean):void");
    }

    public final boolean g() {
        boolean z5;
        synchronized (this.f33626a) {
            z5 = this.f33630e;
        }
        return z5;
    }

    public final boolean h() {
        boolean z5;
        synchronized (this.f33626a) {
            z5 = this.f33629d;
        }
        return z5;
    }

    public final void i(Context context, String str, boolean z5, boolean z10) {
        if (context instanceof Activity) {
            g0.f33596l.post(new k(this, context, str, z5, z10));
        } else {
            u9.i.g("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003b, B:14:0x0043, B:16:0x0054, B:19:0x0066, B:11:0x0034, B:20:0x006b, B:21:0x006d), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri k(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f33626a
            monitor-enter(r0)
            java.lang.String r1 = r5.f33627b     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6b
            p9.k r1 = p9.k.C     // Catch: java.lang.Throwable -> L32
            t9.g0 r1 = r1.f31297c     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4 = 1
            ua.b.e(r1, r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L3b
        L32:
            r6 = move-exception
            goto L82
        L34:
            java.lang.String r1 = "Error reading from internal storage."
            u9.i.c(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = ""
        L3b:
            r5.f33627b = r2     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6b
            p9.k r1 = p9.k.C     // Catch: java.lang.Throwable -> L32
            t9.g0 r1 = r1.f31297c     // Catch: java.lang.Throwable -> L32
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r5.f33627b = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            r6.write(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            r6.close()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L65
            goto L6b
        L65:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            u9.i.f(r1, r6)     // Catch: java.lang.Throwable -> L32
        L6b:
            java.lang.String r6 = r5.f33627b     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.l.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
