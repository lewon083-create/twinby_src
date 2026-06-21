package com.yandex.varioqub.config.impl;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.varioqub.config.impl.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0003c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f15364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0001a f15365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f15366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f15369h = new HashMap();
    public String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15370j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15371k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f15372l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15373m;

    public C0003c(i iVar, long j10, t tVar, C0001a c0001a, u uVar) {
        this.f15362a = iVar;
        this.f15363b = j10;
        this.f15364c = tVar;
        this.f15365d = c0001a;
        this.f15366e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.c0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map] */
    public final void a() throws JSONException {
        ?? D;
        ConfigValue configValue;
        if (this.f15372l.compareAndSet(false, true)) {
            this.f15367f = m.a().getLong("last_fetched_time_ms_key", 0L);
            this.f15368g = m.a().getLong("last_successful_fetched_time_ms_key", 0L);
            String string = m.a().getString("experiments", "");
            if (string == null) {
                string = "";
            }
            this.f15370j = string;
            String string2 = m.a().getString(ViewHierarchyNode.JsonKeys.IDENTIFIER, "");
            if (string2 == null) {
                string2 = "";
            }
            this.i = string2;
            String string3 = m.a().getString("fetched_config_key", "");
            if (string3 == null || string3.length() == 0) {
                D = j0.d();
            } else {
                JSONObject jSONObject = new JSONObject(string3);
                D = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string4 = jSONObject.getString(next);
                    if (string4 == null || string4.length() == 0) {
                        configValue = null;
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string4);
                        configValue = new ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    D.put(next, configValue);
                }
            }
            this.f15369h = new HashMap((Map) D);
            Context context = AbstractC0004d.f15374a;
            if (context == null) {
                Intrinsics.g("appContext");
                throw null;
            }
            this.f15373m = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getBoolean("should_notify_adapter", false);
        }
    }
}
