package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    public static SharedPreferences a() {
        Context context = AbstractC0004d.f15374a;
        if (context == null) {
            Intrinsics.g("appContext");
            throw null;
        }
        return context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0);
    }

    public static void b(HashMap map) throws JSONException {
        SharedPreferences.Editor editorEdit = a().edit();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ConfigValue configValue = (ConfigValue) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        editorEdit.putString("fetched_config_key", jSONObject.toString()).apply();
    }

    public static void c(String str) {
        a().edit().putString(ViewHierarchyNode.JsonKeys.IDENTIFIER, str).apply();
    }

    public static void a(long j10) {
        a().edit().putLong("last_fetched_time_ms_key", j10).apply();
    }

    public static void a(HashMap map) throws JSONException {
        SharedPreferences.Editor editorEdit = a().edit();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ConfigValue configValue = (ConfigValue) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        editorEdit.putString("activated_config_key", jSONObject.toString()).apply();
    }

    public static void b(String str) {
        a().edit().putString("etag", str).apply();
    }

    public static LinkedHashSet b() {
        Set<String> stringSet = a().getStringSet("varioqub_testids", new LinkedHashSet());
        if (stringSet == null) {
            stringSet = d0.f27478b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = stringSet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return linkedHashSet;
    }

    public static void a(boolean z5) {
        a().edit().putBoolean("should_notify_adapter", z5).apply();
    }

    public static void a(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(String.valueOf(((Number) it.next()).longValue()));
        }
        a().edit().putStringSet("varioqub_testids", linkedHashSet).apply();
    }

    public static void b(long j10) {
        a().edit().putLong("last_successful_fetched_time_ms_key", j10).apply();
    }

    public static void a(String str) {
        a().edit().putString("config_version", str).apply();
    }
}
