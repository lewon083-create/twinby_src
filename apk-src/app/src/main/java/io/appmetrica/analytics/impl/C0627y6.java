package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0627y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sl f25085a = new Sl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f25086b = kotlin.collections.j0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f25087c = kotlin.collections.j0.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IdentifiersResult f25088d;

    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map mapD;
        RandomAccess randomAccessA;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.f25088d;
            String str2 = identifiersResult2 != null ? identifiersResult2.f25138id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.f25138id) != null && str.length() != 0)) {
                this.f25088d = identifiersResult;
                String str3 = identifiersResult.f25138id;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                ArrayList arrayListA = AbstractC0207hb.a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListA != null) {
                                    map.put(next, arrayListA);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    mapD = new LinkedHashMap(kotlin.collections.i0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        mapD.put(key, new IdentifiersResult(String.valueOf(ko.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    mapD = kotlin.collections.j0.d();
                }
                this.f25087c = mapD;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.i0.b(mapD.size()));
                for (Map.Entry entry2 : mapD.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).f25138id;
                    if (str4 == null) {
                        randomAccessA = null;
                    } else {
                        try {
                            randomAccessA = AbstractC0207hb.a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                            randomAccessA = null;
                        }
                    }
                    if (randomAccessA == null) {
                        randomAccessA = kotlin.collections.b0.f27475b;
                    }
                    linkedHashMap.put(key2, randomAccessA);
                }
                this.f25086b = linkedHashMap;
            }
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f25086b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Sl sl = this.f25085a;
            String strA = AbstractC0207hb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f25088d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", sl.a(new IdentifiersResult(strA, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
