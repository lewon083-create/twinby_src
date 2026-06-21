package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0250j3 implements InterfaceC0075c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0275k3 f24129a;

    public C0250j3() {
        this(new C0275k3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ci> fromModel(@NonNull C0225i3 c0225i3) {
        C0554v8 c0554v8 = new C0554v8();
        c0554v8.f24890e = new C0126e8();
        Ci ciFromModel = this.f24129a.fromModel(c0225i3.f24041b);
        c0554v8.f24890e.f23750a = (C0152f8) ciFromModel.f22216a;
        c0554v8.f24886a = c0225i3.f24040a;
        return Collections.singletonList(new Ci(c0554v8, new C0044b3(C0044b3.b(ciFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0250j3(C0275k3 c0275k3) {
        this.f24129a = c0275k3;
    }

    @NonNull
    public final C0225i3 a(@NonNull List<Ci> list) {
        throw new UnsupportedOperationException();
    }
}
