package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ie implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        U5[] u5Arr = new U5[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            u5Arr[i10] = new U5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            U5 u5 = u5Arr[i];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            u5.f23062a = key.getBytes(charset);
            u5Arr[i].f23063b = entry.getValue().getBytes(charset);
            i++;
        }
        return u5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Map<String, String> a(@NotNull U5[] u5Arr) {
        throw new UnsupportedOperationException();
    }
}
