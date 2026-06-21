package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jk fromModel(@NotNull Map<String, byte[]> map) {
        Jk jk2 = new Jk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Kk kk2 = new Kk();
            kk2.f22583a = entry.getKey().getBytes(Charsets.UTF_8);
            kk2.f22584b = entry.getValue();
            arrayList.add(kk2);
        }
        Object[] array = arrayList.toArray(new Kk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        jk2.f22540a = (Kk[]) array;
        return jk2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull Jk jk2) {
        Kk[] kkArr = jk2.f22540a;
        int iB = kotlin.collections.i0.b(kkArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Kk kk2 : kkArr) {
            linkedHashMap.put(new String(kk2.f22583a, Charsets.UTF_8), kk2.f22584b);
        }
        return linkedHashMap;
    }
}
