package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21946a = "request_state";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21947b = "type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21948c = "last_attempt";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21949d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.b0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(@Nullable List<E> list) throws JSONException {
        ?? arrayList;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f21946a;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            for (E e3 : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f21947b, e3.f21943a);
                    jSONObject.put(this.f21948c, e3.f21944b);
                    jSONObject.put(this.f21949d, z.a(e3.f21945c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
        } else {
            arrayList = b0.f27475b;
        }
        jSONObject2.put(str, new JSONArray((Collection) arrayList));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(@Nullable String str) {
        JSONArray jSONArrayOptJSONArray;
        E e3;
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(this.f21946a)) == null) {
                return arrayList;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    try {
                        String string = jSONObjectOptJSONObject.getString(this.f21947b);
                        long j10 = jSONObjectOptJSONObject.getLong(this.f21948c);
                        String string2 = jSONObjectOptJSONObject.getString(this.f21949d);
                        int[] iArrB = A.b(4);
                        int length2 = iArrB.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length2) {
                                i = 0;
                                break;
                            }
                            i = iArrB[i11];
                            if (Intrinsics.a(z.a(i), string2)) {
                                break;
                            }
                            i11++;
                        }
                        if (i == 0) {
                            i = 1;
                        }
                        e3 = new E(string, j10, i);
                    } catch (Throwable unused) {
                        e3 = null;
                    }
                    if (e3 != null) {
                        arrayList.add(e3);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return b0.f27475b;
        }
    }
}
