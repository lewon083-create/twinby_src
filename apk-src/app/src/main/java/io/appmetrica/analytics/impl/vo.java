package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo f24950a;

    public vo(Ye ye2, C0077ca c0077ca) {
        this.f24950a = new xo(ye2, c0077ca, new ig.a(17));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(VKApiCodes.PARAM_DEVICE_ID, JsonUtils.optStringOrNullable(jSONObject2, VKApiCodes.PARAM_DEVICE_ID, JsonUtils.optStringOrNull(jSONObject, VKApiCodes.PARAM_DEVICE_ID)));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC0207hb.a(jSONObject2, "last_migration_api_level", AbstractC0207hb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        xo xoVar = this.f24950a;
        xoVar.a(xoVar.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f24950a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        xo xoVar = this.f24950a;
        xoVar.a(xoVar.a().put("referrer_checked", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized io.appmetrica.analytics.impl.C0338mg b() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.impl.xo r0 = r2.f24950a     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r0 = r0.a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "referrer"
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L26
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L26
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            int r1 = r0.length     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L20
            goto L26
        L20:
            io.appmetrica.analytics.impl.mg r1 = new io.appmetrica.analytics.impl.mg     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = 0
        L27:
            monitor-exit(r2)
            return r1
        L29:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.vo.b():io.appmetrica.analytics.impl.mg");
    }

    public final synchronized void a(String str) {
        xo xoVar = this.f24950a;
        xoVar.a(xoVar.a().put(VKApiCodes.PARAM_DEVICE_ID, str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f24950a.a(), "device_id_hash");
    }

    public final synchronized void a(C0338mg c0338mg) {
        try {
            xo xoVar = this.f24950a;
            xoVar.a(xoVar.a().put("referrer", c0338mg != null ? new String(Base64.encode(c0338mg.a(), 0), Charsets.UTF_8) : null));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
