package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0180ga implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0336me f23933a;

    public C0180ga() {
        this(new Rl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0444qm fromModel(@NonNull C0326m4 c0326m4) {
        C0444qm c0444qm = new C0444qm();
        c0444qm.f24663b = c0326m4.f24332b;
        c0444qm.f24662a = c0326m4.f24331a;
        c0444qm.f24664c = c0326m4.f24333c;
        c0444qm.f24665d = c0326m4.f24334d;
        c0444qm.f24666e = c0326m4.f24335e;
        c0444qm.f24667f = this.f23933a.a(c0326m4.f24336f);
        return c0444qm;
    }

    public C0180ga(Rl rl2) {
        this.f23933a = rl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0326m4 toModel(@NonNull C0444qm c0444qm) {
        C0276k4 c0276k4 = new C0276k4();
        c0276k4.f24201d = c0444qm.f24665d;
        c0276k4.f24200c = c0444qm.f24664c;
        c0276k4.f24199b = c0444qm.f24663b;
        c0276k4.f24198a = c0444qm.f24662a;
        c0276k4.f24202e = c0444qm.f24666e;
        c0276k4.f24203f = this.f23933a.a(c0444qm.f24667f);
        return new C0326m4(c0276k4);
    }
}
