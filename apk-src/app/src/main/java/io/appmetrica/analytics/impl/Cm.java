package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Cm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0518tm fromModel(@NotNull Bm bm) {
        C0518tm c0518tm = new C0518tm();
        c0518tm.f24815a = bm.f22162a;
        return c0518tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Bm(((C0518tm) obj).f24815a);
    }

    @NotNull
    public final Bm a(@NotNull C0518tm c0518tm) {
        return new Bm(c0518tm.f24815a);
    }
}
