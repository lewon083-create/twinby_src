package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bg implements P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4 f22152a;

    public Bg(@NonNull Z4 z42) {
        this.f22152a = z42;
    }

    @Override // io.appmetrica.analytics.impl.P7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ag a(@NonNull Context context, @NonNull R4 r42, @NonNull C0426q4 c0426q4) {
        return new Ag(context, r42, c0426q4, this.f22152a, new S4(), Gl.a());
    }

    @NonNull
    public final Z4 a() {
        return this.f22152a;
    }
}
