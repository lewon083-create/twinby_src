package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0114dl implements InterfaceC0075c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ff f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0160fg f23706b;

    public C0114dl() {
        this(new Ff(), new C0160fg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ci> fromModel(@NonNull C0088cl c0088cl) {
        Ci ciFromModel;
        C0554v8 c0554v8 = new C0554v8();
        c0554v8.f24886a = 3;
        c0554v8.f24889d = new C0504t8();
        Ci ciFromModel2 = this.f23705a.fromModel(c0088cl.f23616a);
        c0554v8.f24889d.f24762a = (C0380o8) ciFromModel2.f22216a;
        C0587wg c0587wg = c0088cl.f23617b;
        if (c0587wg != null) {
            ciFromModel = this.f23706b.fromModel(c0587wg);
            c0554v8.f24889d.f24763b = (C0430q8) ciFromModel.f22216a;
        } else {
            ciFromModel = null;
        }
        return Collections.singletonList(new Ci(c0554v8, new C0044b3(C0044b3.b(ciFromModel2, ciFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0114dl(Ff ff2, C0160fg c0160fg) {
        this.f23705a = ff2;
        this.f23706b = c0160fg;
    }

    @NonNull
    public final C0088cl a(@NonNull List<Ci> list) {
        throw new UnsupportedOperationException();
    }
}
