package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0334mc implements InterfaceC0200h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0200h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0359nc a(@NotNull Context context, @NotNull C0123e5 c0123e5, @NotNull Q3 q32, @NotNull C0426q4 c0426q4) {
        Ag ag2;
        C0384oc c0384oc = new C0384oc(q32.f22856b, q32.f22855a);
        Bg bg2 = new Bg(new C0458rc());
        synchronized (c0123e5) {
            ag2 = (Ag) c0123e5.a(c0384oc, c0426q4, bg2, c0123e5.f23729a);
        }
        return new C0359nc(context, ag2);
    }
}
