package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0410pd implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0591wk f24576a = C0382oa.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0468rm[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C0468rm c0468rm;
        Map<String, Yc> mapC = this.f24576a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Yc yc2 = mapC.get(key);
            if (yc2 == null || value == null) {
                c0468rm = null;
            } else {
                c0468rm = new C0468rm();
                c0468rm.f24693a = key;
                c0468rm.f24694b = (byte[]) yc2.f23328c.fromModel(value);
            }
            if (c0468rm != null) {
                arrayList.add(c0468rm);
            }
        }
        Object[] array = arrayList.toArray(new C0468rm[0]);
        if (array != null) {
            return (C0468rm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull C0468rm[] c0468rmArr) {
        Map<String, Yc> mapC = this.f24576a.c();
        ArrayList arrayList = new ArrayList();
        for (C0468rm c0468rm : c0468rmArr) {
            Yc yc2 = mapC.get(c0468rm.f24693a);
            Pair pair = yc2 != null ? new Pair(c0468rm.f24693a, yc2.f23328c.toModel(c0468rm.f24694b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.j0.k(arrayList);
    }
}
