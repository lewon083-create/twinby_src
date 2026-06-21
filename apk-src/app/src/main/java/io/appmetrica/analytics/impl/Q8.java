package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q8 implements ProtobufConverter {
    public static C0555v9 a(P8 p82) {
        C0555v9 c0555v9 = new C0555v9();
        c0555v9.f24896d = new int[p82.f22830b.size()];
        Iterator it = p82.f22830b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c0555v9.f24896d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        c0555v9.f24895c = p82.f22832d;
        c0555v9.f24894b = p82.f22831c;
        c0555v9.f24893a = p82.f22829a;
        return c0555v9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((P8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0555v9 c0555v9 = (C0555v9) obj;
        return new P8(c0555v9.f24893a, c0555v9.f24894b, c0555v9.f24895c, CollectionUtils.hashSetFromIntArray(c0555v9.f24896d));
    }
}
