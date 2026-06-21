package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0642yl extends AbstractC0407pa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qg f25104b;

    public C0642yl(C0440qi c0440qi, Qg qg2) {
        super(c0440qi);
        this.f25104b = qg2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0407pa
    public final void a(@NonNull List<Qg> list) {
        list.add(this.f25104b);
    }
}
