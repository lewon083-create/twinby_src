package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f25429a;

    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull J j10) {
        return MessageNano.toByteArray(this.f25429a.fromModel(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f25429a.fromModel((J) obj));
    }

    public K(@NotNull M m8) {
        this.f25429a = m8;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull byte[] bArr) {
        S s10;
        try {
            s10 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s10 = new S();
        }
        return this.f25429a.toModel(s10);
    }

    public /* synthetic */ K(M m8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new M(null, 1, null) : m8);
    }
}
