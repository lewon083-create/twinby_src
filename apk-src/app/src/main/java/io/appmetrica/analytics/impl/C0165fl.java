package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0165fl implements InterfaceC0075c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xi f23891a;

    public C0165fl() {
        this(new Xi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ci> fromModel(@NonNull C0139el c0139el) {
        C0554v8 c0554v8 = new C0554v8();
        c0554v8.f24886a = 1;
        c0554v8.f24887b = new C0529u8();
        Ci ciFromModel = this.f23891a.fromModel(c0139el.f23783a);
        c0554v8.f24887b.f24840a = (C0454r8) ciFromModel.f22216a;
        C0044b3 c0044b3 = new C0044b3(C0044b3.b(ciFromModel));
        ciFromModel.f22217b.getBytesTruncated();
        return Collections.singletonList(new Ci(c0554v8, c0044b3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0165fl(Xi xi2) {
        this.f23891a = xi2;
    }

    @NonNull
    public final C0139el a(@NonNull List<Ci> list) {
        throw new UnsupportedOperationException();
    }
}
