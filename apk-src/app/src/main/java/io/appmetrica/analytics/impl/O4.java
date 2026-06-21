package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0626y5 f22768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f22769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fc f22770c;

    public O4(@NotNull M6 m62, @NotNull Pg pg) {
        C0510te c0510te = new C0510te(m62);
        this.f22768a = new C0626y5(m62);
        this.f22769b = new Fc(c0510te, new N4(pg));
        this.f22770c = new Fc(c0510te, M4.f22650a);
    }

    @NotNull
    public final List<G8> a() {
        return kotlin.collections.s.f(this.f22768a, this.f22769b);
    }

    @NotNull
    public final List<G8> b() {
        return kotlin.collections.r.c(this.f22770c);
    }
}
