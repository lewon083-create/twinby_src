package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f25432a;

    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(@NotNull J j10) {
        S s10 = new S();
        s10.f25447a = j10.f25427a;
        W w10 = j10.f25428b;
        s10.f25448b = w10 != null ? this.f25432a.fromModel(w10) : null;
        return s10;
    }

    public M(@NotNull Y y7) {
        this.f25432a = y7;
    }

    public /* synthetic */ M(Y y7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            y7 = new Y(null, null, null, 7, null);
        }
        this(y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull S s10) {
        return new J(s10.f25447a, this.f25432a.toModel(s10.f25448b));
    }
}
