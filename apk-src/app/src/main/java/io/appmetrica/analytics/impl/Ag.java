package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ag implements Pl, Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f22075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S4 f22076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0668zm f22077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Qa f22078e;

    public Ag(@NotNull Context context, @NotNull R4 r42, @NotNull C0426q4 c0426q4, @NotNull Z4 z42, @NotNull S4 s42, @NotNull Gl gl2) {
        this.f22074a = context;
        this.f22075b = r42;
        this.f22076c = s42;
        C0668zm c0668zmA = gl2.a(context, r42, c0426q4.f24612a);
        this.f22077d = c0668zmA;
        this.f22078e = z42.a(context, r42, c0426q4.f24613b, c0668zmA);
        gl2.a(r42, this);
    }

    @NotNull
    public final R4 a() {
        return this.f22075b;
    }

    @NotNull
    public final Context b() {
        return this.f22074a;
    }

    public final void a(@NotNull InterfaceC0174g4 interfaceC0174g4) {
        this.f22076c.f22943a.add(interfaceC0174g4);
    }

    public final void b(@NotNull InterfaceC0174g4 interfaceC0174g4) {
        this.f22076c.f22943a.remove(interfaceC0174g4);
    }

    @Override // io.appmetrica.analytics.impl.Pl
    public final void a(@NotNull C0140em c0140em) {
        ((Y4) this.f22078e).a(c0140em);
    }

    @Override // io.appmetrica.analytics.impl.Pl
    public final void a(@NotNull Il il2, @Nullable C0140em c0140em) {
        ((Y4) this.f22078e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(@NotNull C0426q4 c0426q4) {
        this.f22077d.a(c0426q4.f24612a);
        this.f22078e.a(c0426q4.f24613b);
    }

    public Ag(@NotNull Context context, @NotNull R4 r42, @NotNull C0426q4 c0426q4, @NotNull Z4 z42) {
        this(context, r42, c0426q4, z42, new S4(), Gl.a());
    }

    public final void a(@NotNull Q5 q5, @NotNull C0426q4 c0426q4) {
        if (!AbstractC0605x9.f25012c.contains(EnumC0078cb.a(q5.f22863d))) {
            this.f22078e.a(c0426q4.f24613b);
        }
        ((Y4) this.f22078e).a(q5);
    }
}
