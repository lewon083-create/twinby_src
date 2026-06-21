package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0275k3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ff f24194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0578w7 f24195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0586wf f24196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0160fg f24197d;

    public C0275k3() {
        this(new Ff(), new C0578w7(), new C0586wf(), new C0160fg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull C0300l3 c0300l3) {
        Ci ciA;
        C0152f8 c0152f8 = new C0152f8();
        Ci ciA2 = this.f24194a.fromModel(c0300l3.f24260a);
        c0152f8.f23842a = (C0380o8) ciA2.f22216a;
        c0152f8.f23844c = this.f24195b.fromModel(c0300l3.f24261b);
        Ci ciA3 = this.f24196c.fromModel(c0300l3.f24262c);
        c0152f8.f23845d = (C0355n8) ciA3.f22216a;
        C0587wg c0587wg = c0300l3.f24263d;
        if (c0587wg != null) {
            ciA = this.f24197d.fromModel(c0587wg);
            c0152f8.f23843b = (C0430q8) ciA.f22216a;
        } else {
            ciA = null;
        }
        return new Ci(c0152f8, new C0044b3(C0044b3.b(ciA2, ciA3, ciA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0275k3(Ff ff2, C0578w7 c0578w7, C0586wf c0586wf, C0160fg c0160fg) {
        this.f24194a = ff2;
        this.f24195b = c0578w7;
        this.f24196c = c0586wf;
        this.f24197d = c0160fg;
    }

    @NonNull
    public final C0300l3 a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
