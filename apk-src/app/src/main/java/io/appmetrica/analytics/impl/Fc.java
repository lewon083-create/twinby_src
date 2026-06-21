package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Fc implements G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0535ue f22328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f22329b;

    public Fc(@NotNull InterfaceC0535ue interfaceC0535ue, @NotNull Function0<Integer> function0) {
        this.f22328a = interfaceC0535ue;
        this.f22329b = function0;
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return ((C0510te) this.f22328a).f24786b.get() >= ((long) ((Number) this.f22329b.invoke()).intValue());
    }
}
