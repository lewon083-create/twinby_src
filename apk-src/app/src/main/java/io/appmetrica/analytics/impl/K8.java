package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class K8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        M8 m8 = new M8();
        L8[] l8Arr = new L8[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i10 = i + 1;
            if (i < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            L8 l82 = new L8();
            l82.f22605a = (String) entry.getKey();
            l82.f22606b = (byte[]) entry.getValue();
            l8Arr[i] = l82;
            i = i10;
        }
        m8.f22669a = l8Arr;
        return MessageNano.toByteArray(m8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        L8[] l8Arr = ((M8) MessageNano.mergeFrom(new M8(), bArr)).f22669a;
        int iB = kotlin.collections.i0.b(l8Arr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (L8 l82 : l8Arr) {
            linkedHashMap.put(l82.f22605a, l82.f22606b);
        }
        return linkedHashMap;
    }
}
