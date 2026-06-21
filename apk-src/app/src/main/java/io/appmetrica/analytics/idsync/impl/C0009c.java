package io.appmetrica.analytics.idsync.impl;

import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0009c implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0011e f21955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21956b = "id_sync";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21957c = "id_sync";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21958d = "launch_delay_seconds";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21959e = "requests";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21960f = "type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21961g = "url";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21962h = "headers";
    public final String i = "resend_interval_for_valid_response";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f21963j = "resend_interval_for_invalid_response";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f21964k = "valid_response_codes";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f21965l = "preconditions";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f21966m = "network";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f21967n = "cell";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f21968o = "report_event_enabled";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f21969p = "report_url";

    public C0009c(@NotNull C0011e c0011e) {
        this.f21955a = c0011e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(@NotNull JSONObject jSONObject) {
        k[] kVarArr;
        JSONArray jSONArray;
        i[] iVarArr;
        JSONArray jSONArray2;
        byte[][] bArr;
        int[] iArr;
        int[] iArrQ;
        int i;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f21957c);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        m mVar = new m();
        mVar.f22001a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f21956b, mVar.f22001a);
        l lVar = new l();
        lVar.f21996a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject, this.f21958d, lVar.f21996a);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f21959e);
        int i10 = 0;
        if (jSONArrayOptJSONArray == null) {
            kVarArr = new k[0];
        } else {
            int length = jSONArrayOptJSONArray.length();
            k[] kVarArr2 = new k[length];
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i11);
                k kVar = new k();
                if (jSONObjectOptJSONObject2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                    i = i10;
                } else {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f21960f);
                    Charset charset = Charsets.UTF_8;
                    kVar.f21987a = strOptString.getBytes(charset);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(this.f21965l);
                    j jVar = new j();
                    if (jSONObjectOptJSONObject3 != null && Intrinsics.a(jSONObjectOptJSONObject3.optString(this.f21966m), this.f21967n)) {
                        jVar.f21985a = 1;
                    }
                    kVar.f21988b = jVar;
                    kVar.f21989c = jSONObjectOptJSONObject2.optString(this.f21961g).getBytes(charset);
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(this.f21962h);
                    if (jSONObjectOptJSONObject4 == null) {
                        iVarArr = new i[i10];
                        jSONArray = jSONArrayOptJSONArray;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> itKeys = jSONObjectOptJSONObject4.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            i iVar = new i();
                            iVar.f21982a = next.getBytes(Charsets.UTF_8);
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                bArr = new byte[i10][];
                                jSONArray2 = jSONArrayOptJSONArray;
                            } else {
                                int length2 = jSONArrayOptJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = jSONArrayOptJSONArray;
                                int i12 = 0;
                                while (i12 < length2) {
                                    byte[][] bArr3 = bArr2;
                                    int i13 = i12;
                                    bArr3[i13] = jSONArrayOptJSONArray2.optString(i12).getBytes(Charsets.UTF_8);
                                    i12 = i13 + 1;
                                    bArr2 = bArr3;
                                }
                                bArr = bArr2;
                            }
                            iVar.f21983b = bArr;
                            arrayList.add(iVar);
                            jSONArrayOptJSONArray = jSONArray2;
                            i10 = 0;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        Object[] array = arrayList.toArray(new i[i10]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (i[]) array;
                    }
                    kVar.f21990d = iVarArr;
                    kVar.f21991e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.i, kVar.f21991e);
                    kVar.f21992f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f21963j, kVar.f21992f);
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray(this.f21964k);
                    if (jSONArrayOptJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = jSONArrayOptJSONArray3.length();
                        int[] iArr2 = new int[length3];
                        for (int i14 = 0; i14 < length3; i14++) {
                            iArr2[i14] = jSONArrayOptJSONArray3.optInt(i14);
                        }
                        iArr = iArr2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i15 : iArr) {
                        if (i15 != 0) {
                            arrayList2.add(Integer.valueOf(i15));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArrQ = CollectionsKt.Q(arrayList2);
                        i = 0;
                    } else {
                        i = 0;
                        iArrQ = new int[]{VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM};
                    }
                    kVar.f21993g = iArrQ;
                    kVar.f21994h = jSONObjectOptJSONObject2.optBoolean(this.f21968o, kVar.f21994h);
                    kVar.i = jSONObjectOptJSONObject2.optString(this.f21969p);
                }
                kVarArr2[i11] = kVar;
                i11++;
                i10 = i;
                jSONArrayOptJSONArray = jSONArray;
            }
            kVarArr = kVarArr2;
        }
        lVar.f21997b = kVarArr;
        mVar.f22002b = lVar;
        return this.f21955a.toModel(mVar);
    }

    @Nullable
    public final IdSyncConfig b(@NotNull JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
