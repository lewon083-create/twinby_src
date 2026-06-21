package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0062bl implements InterfaceC0075c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xi f23520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ff f23521b;

    public C0062bl() {
        this(new Xi(), new Ff());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ci> fromModel(@NonNull C0036al c0036al) {
        C0554v8 c0554v8 = new C0554v8();
        c0554v8.f24886a = 2;
        c0554v8.f24888c = new C0479s8();
        Ci ciFromModel = this.f23520a.fromModel(c0036al.f23449b);
        c0554v8.f24888c.f24735b = (C0454r8) ciFromModel.f22216a;
        Ci ciFromModel2 = this.f23521b.fromModel(c0036al.f23448a);
        c0554v8.f24888c.f24734a = (C0380o8) ciFromModel2.f22216a;
        return Collections.singletonList(new Ci(c0554v8, new C0044b3(C0044b3.b(ciFromModel, ciFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0062bl(Xi xi2, Ff ff2) {
        this.f23520a = xi2;
        this.f23521b = ff2;
    }

    @NonNull
    public final C0036al a(@NonNull List<Ci> list) {
        throw new UnsupportedOperationException();
    }
}
