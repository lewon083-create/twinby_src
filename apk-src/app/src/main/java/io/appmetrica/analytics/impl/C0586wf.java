package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0586wf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f24977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0611xf f24978b;

    public C0586wf() {
        this(new Y(), new C0611xf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull C0636yf c0636yf) {
        int bytesTruncated;
        C0355n8 c0355n8 = new C0355n8();
        Ci ciFromModel = this.f24977a.fromModel(c0636yf.f25095a);
        c0355n8.f24422a = (C0101d8) ciFromModel.f22216a;
        Ln lnA = this.f24978b.a(c0636yf.f25096b);
        if (ko.a((Collection) lnA.f22635a)) {
            bytesTruncated = 0;
        } else {
            c0355n8.f24423b = new C0101d8[((List) lnA.f22635a).size()];
            bytesTruncated = 0;
            for (int i = 0; i < ((List) lnA.f22635a).size(); i++) {
                Ci ciFromModel2 = this.f24977a.fromModel((Z) ((List) lnA.f22635a).get(i));
                c0355n8.f24423b[i] = (C0101d8) ciFromModel2.f22216a;
                bytesTruncated += ciFromModel2.f22217b.getBytesTruncated();
            }
        }
        return new Ci(c0355n8, new C0044b3(C0044b3.b(ciFromModel, lnA, new C0044b3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0586wf(Y y7, C0611xf c0611xf) {
        this.f24977a = y7;
        this.f24978b = c0611xf;
    }

    @NonNull
    public final C0636yf a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
