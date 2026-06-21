package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0602x6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0394om[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C0394om[] c0394omArr = new C0394om[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i10 = i + 1;
            if (i < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0394om c0394om = new C0394om();
            c0394om.f24529a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0394om.f24530b = (String[]) array;
            c0394omArr[i] = c0394om;
            i = i10;
        }
        return c0394omArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull C0394om[] c0394omArr) {
        int iB = kotlin.collections.i0.b(c0394omArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (C0394om c0394om : c0394omArr) {
            linkedHashMap.put(c0394om.f24529a, kotlin.collections.p.v(c0394om.f24530b));
        }
        return linkedHashMap;
    }
}
