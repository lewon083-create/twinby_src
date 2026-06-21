package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bh implements InterfaceC0200h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4 f22153a;

    public Bh(@NotNull Z4 z42) {
        this.f22153a = z42;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0662zg a(@NotNull Context context, @NotNull C0123e5 c0123e5, @NotNull Q3 q32, @NotNull C0426q4 c0426q4) {
        Ag ag2;
        R4 r42 = new R4(q32.f22856b, q32.f22855a);
        Bg bg2 = new Bg(this.f22153a);
        synchronized (c0123e5) {
            ag2 = (Ag) c0123e5.a(r42, c0426q4, bg2, c0123e5.f23729a);
        }
        return new C0662zg(context, ag2);
    }
}
