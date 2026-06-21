package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ao f25050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ao f25051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo f25052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f25053d;

    public xo(Ao ao, Ao ao2, yo yoVar) {
        this.f25050a = ao;
        this.f25051b = ao2;
        this.f25052c = yoVar;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f25053d == null) {
                JSONObject jSONObjectA = this.f25052c.a(a(this.f25050a), a(this.f25051b));
                this.f25053d = jSONObjectA;
                a(jSONObjectA);
            }
            jSONObject = this.f25053d;
            if (jSONObject == null) {
                Intrinsics.g("fileContents");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public static JSONObject a(Ao ao) {
        try {
            String strA = ao.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f25050a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f25051b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
