package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0333mb implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nc f24360a;

    public C0333mb() {
        this(new Nc(new Qn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Pn pn) {
        return MessageNano.toByteArray((MessageNano) this.f24360a.f22734a.fromModel(pn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0333mb(Nc nc2) {
        this.f24360a = nc2;
    }

    @NonNull
    public final Pn a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
