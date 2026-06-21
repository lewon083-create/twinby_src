package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class D9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0419pm fromModel(@Nullable C9 c9) {
        C0419pm c0419pm = new C0419pm();
        if (c9 != null) {
            c0419pm.f24594a = c9.f22198a;
        }
        return c0419pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C9(((C0419pm) obj).f24594a);
    }

    @NotNull
    public final C9 a(@NotNull C0419pm c0419pm) {
        return new C9(c0419pm.f24594a);
    }
}
