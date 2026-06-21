package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0481sa f22422a;

    public Hf() {
        this(new C0481sa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull List<String> list) {
        Ln lnA = this.f22422a.a((List<Object>) list);
        List list2 = (List) lnA.f22635a;
        C0405p8[] c0405p8Arr = new C0405p8[0];
        if (list2 != null) {
            c0405p8Arr = new C0405p8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C0405p8 c0405p8 = new C0405p8();
                c0405p8Arr[i] = c0405p8;
                c0405p8.f24569a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        lnA.f22636b.getBytesTruncated();
        return new Ci(c0405p8Arr, lnA.f22636b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hf(@NonNull C0481sa c0481sa) {
        this.f22422a = c0481sa;
    }

    @NonNull
    public final List<String> a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
