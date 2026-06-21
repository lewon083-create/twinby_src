package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0105dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg f23683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0480s9 f23684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0401p4 f23685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ve f23686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O4 f23687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0583wc f23688f = new C0583wc();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ij.g f23689g = ij.h.b(new C0079cc(this));

    public C0105dc(@NotNull M6 m62, @NotNull Pg pg, @NotNull InterfaceC0480s9 interfaceC0480s9, @NotNull C0401p4 c0401p4, @NotNull Ve ve2) {
        this.f23683a = pg;
        this.f23684b = interfaceC0480s9;
        this.f23685c = c0401p4;
        this.f23686d = ve2;
        this.f23687e = new O4(m62, pg);
    }

    @NotNull
    public final List<G8> a() {
        return this.f23687e.a();
    }

    @NotNull
    public final List<G8> b() {
        return CollectionsKt.L(kotlin.collections.r.c(this.f23687e.f22770c), kotlin.collections.r.c((G8) this.f23689g.getValue()));
    }
}
