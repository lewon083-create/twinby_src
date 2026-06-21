package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0053bc implements InterfaceC0200h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0200h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0550v4 a(@NotNull Context context, @NotNull C0123e5 c0123e5, @NotNull Q3 q32, @NotNull C0426q4 c0426q4) {
        C0625y4 c0625y4;
        C0575w4 c0575w4 = new C0575w4(q32.f22856b);
        C0650z4 c0650z4 = new C0650z4();
        synchronized (c0123e5) {
            c0625y4 = (C0625y4) c0123e5.a(c0575w4, c0426q4, c0650z4, c0123e5.f23730b);
        }
        return new C0550v4(context, c0625y4, c0426q4);
    }
}
