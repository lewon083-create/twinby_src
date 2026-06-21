package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(@NotNull a0 a0Var) {
        P p6 = new P();
        p6.f25440a = a0Var.f25464a;
        p6.f25441b = a0Var.f25465b;
        return p6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p6 = (P) obj;
        return new a0(p6.f25440a, p6.f25441b);
    }

    @NotNull
    public final a0 a(@NotNull P p6) {
        return new a0(p6.f25440a, p6.f25441b);
    }
}
