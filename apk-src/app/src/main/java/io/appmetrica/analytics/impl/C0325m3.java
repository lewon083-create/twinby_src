package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0325m3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0481sa f24330a;

    public C0325m3() {
        this(new C0481sa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull List<String> list) {
        Ln lnA = this.f24330a.a((List<Object>) list);
        C0178g8 c0178g8 = new C0178g8();
        c0178g8.f23925a = StringUtils.getUTF8Bytes((List<String>) lnA.f22635a);
        InterfaceC0070c3 interfaceC0070c3 = lnA.f22636b;
        int i = ((C0376o4) interfaceC0070c3).f23478a;
        return new Ci(c0178g8, interfaceC0070c3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0325m3(@NonNull C0481sa c0481sa) {
        this.f24330a = c0481sa;
    }

    @NonNull
    public final List<String> a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
