package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0010d implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0011e f21970a;

    public C0010d(@NotNull C0011e c0011e) {
        this.f21970a = c0011e;
    }

    @NotNull
    public final byte[] a(@NotNull IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f21970a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f21970a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull byte[] bArr) {
        return this.f21970a.toModel((m) MessageNano.mergeFrom(new m(), bArr));
    }
}
