package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0578w7 f23274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0506ta f23275b;

    public Y() {
        this(new C0578w7(), new C0506ta(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull Z z5) {
        C0101d8 c0101d8 = new C0101d8();
        c0101d8.f23677b = this.f23274a.fromModel(z5.f23360a);
        Ln lnA = this.f23275b.a(z5.f23361b);
        c0101d8.f23676a = StringUtils.getUTF8Bytes((String) lnA.f22635a);
        return new Ci(c0101d8, new C0044b3(C0044b3.b(lnA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(C0578w7 c0578w7, C0506ta c0506ta) {
        this.f23274a = c0578w7;
        this.f23275b = c0506ta;
    }

    @NonNull
    public final Z a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
