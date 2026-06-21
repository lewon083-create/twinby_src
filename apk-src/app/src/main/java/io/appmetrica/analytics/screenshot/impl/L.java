package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f25430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f25431b;

    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(@NotNull JSONObject jSONObject) {
        N n10;
        P p6;
        Q q2;
        boolean zExtractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC0684o.f25504a);
        Y y7 = this.f25430a;
        X x10 = this.f25431b;
        x10.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screenshot");
        if (jSONObjectOptJSONObject == null) {
            q2 = new Q();
            q2.f25443a = new N();
            q2.f25444b = new P();
            O o2 = new O();
            o2.f25438c = AbstractC0684o.f25505b;
            q2.f25445c = o2;
        } else {
            Q q5 = new Q();
            x10.f25453a.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("api_captor_config");
            O o10 = null;
            if (jSONObjectOptJSONObject2 == null) {
                n10 = null;
            } else {
                n10 = new N();
                Boolean boolOptBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject2, "enabled");
                if (boolOptBooleanOrNull != null) {
                    n10.f25434a = boolOptBooleanOrNull.booleanValue();
                }
            }
            if (n10 != null) {
                q5.f25443a = n10;
            }
            x10.f25454b.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("service_captor_config");
            if (jSONObjectOptJSONObject3 == null) {
                p6 = null;
            } else {
                p6 = new P();
                Boolean boolOptBooleanOrNull2 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject3, "enabled");
                if (boolOptBooleanOrNull2 != null) {
                    p6.f25440a = boolOptBooleanOrNull2.booleanValue();
                }
                Long lOptLongOrNull = JsonUtils.optLongOrNull(jSONObjectOptJSONObject3, "delay_seconds");
                if (lOptLongOrNull != null) {
                    p6.f25441b = lOptLongOrNull.longValue();
                }
            }
            if (p6 != null) {
                q5.f25444b = p6;
            }
            x10.f25455c.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("content_observer_captor_config");
            if (jSONObjectOptJSONObject4 != null) {
                o10 = new O();
                Boolean boolOptBooleanOrNull3 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject4, "enabled");
                if (boolOptBooleanOrNull3 != null) {
                    o10.f25436a = boolOptBooleanOrNull3.booleanValue();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("media_store_column_names");
                if (jSONArrayOptJSONArray != null) {
                    IntRange intRangeE = ck.o.e(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.j(intRangeE, 10));
                    ck.g it = intRangeE.iterator();
                    while (it.f2383d) {
                        arrayList.add(jSONArrayOptJSONArray.getString(it.nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o10.f25438c = (String[]) array;
                }
                Long lOptLongOrNull2 = JsonUtils.optLongOrNull(jSONObjectOptJSONObject4, "detect_window_seconds");
                if (lOptLongOrNull2 != null) {
                    o10.f25437b = lOptLongOrNull2.longValue();
                }
            }
            if (o10 != null) {
                q5.f25445c = o10;
            }
            q2 = q5;
        }
        return new J(zExtractFeature, y7.toModel(q2));
    }

    @Nullable
    public final J b(@NotNull JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(@NotNull Y y7, @NotNull X x10) {
        this.f25430a = y7;
        this.f25431b = x10;
    }

    public /* synthetic */ L(Y y7, X x10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Y(null, null, null, 7, null) : y7, (i & 2) != 0 ? new X() : x10);
    }
}
