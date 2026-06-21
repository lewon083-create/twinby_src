package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0021a6 fromModel(@NonNull Cl cl2) {
        C0021a6 c0021a6 = new C0021a6();
        c0021a6.f23403a = (String) WrapUtils.getOrDefault(cl2.f22231a, c0021a6.f23403a);
        c0021a6.f23404b = (String) WrapUtils.getOrDefault(cl2.f22232b, c0021a6.f23404b);
        c0021a6.f23405c = ((Integer) WrapUtils.getOrDefault(cl2.f22233c, Integer.valueOf(c0021a6.f23405c))).intValue();
        c0021a6.f23408f = ((Integer) WrapUtils.getOrDefault(cl2.f22234d, Integer.valueOf(c0021a6.f23408f))).intValue();
        c0021a6.f23406d = (String) WrapUtils.getOrDefault(cl2.f22235e, c0021a6.f23406d);
        c0021a6.f23407e = ((Boolean) WrapUtils.getOrDefault(cl2.f22236f, Boolean.valueOf(c0021a6.f23407e))).booleanValue();
        return c0021a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Cl a(@NonNull C0021a6 c0021a6) {
        throw new UnsupportedOperationException();
    }
}
