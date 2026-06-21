package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0577w6 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dg f24958a;

    public C0577w6() {
        this(new Dg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull C0552v6 c0552v6) {
        Y5 y5FromModel = this.f24958a.fromModel(c0552v6.f24875a);
        y5FromModel.f23314g = 1;
        X5 x52 = new X5();
        y5FromModel.f23315h = x52;
        x52.f23241a = StringUtils.correctIllFormedString(c0552v6.f24876b);
        return y5FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0577w6(Dg dg) {
        this.f24958a = dg;
    }

    @NonNull
    public final C0552v6 a(@NonNull Y5 y52) {
        throw new UnsupportedOperationException();
    }
}
