package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W3 extends Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ue f23195a;

    public W3(@NonNull Context context) {
        this(new Ue(C0071c4.l().c(context).b(context)));
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i) {
        this.f23195a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        return (int) this.f23195a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        return new SparseArray<>();
    }

    public W3(Ue ue) {
        this.f23195a = ue;
    }
}
