package io.appmetrica.analytics.impl;

import io.sentry.SentryReplayEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0631ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f25093a;

    static {
        HashSet hashSet = new HashSet();
        f25093a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return AbstractC0207hb.a(jSONObjectOptJSONObject.getJSONArray(SentryReplayEvent.JsonKeys.URLS));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
