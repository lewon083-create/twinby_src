package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0676g f25456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f25457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f25458c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(@NotNull W w10) {
        Q q2 = new Q();
        C0674e c0674e = w10.f25450a;
        q2.f25443a = c0674e != null ? this.f25456a.fromModel(c0674e) : null;
        a0 a0Var = w10.f25451b;
        q2.f25444b = a0Var != null ? this.f25457b.fromModel(a0Var) : null;
        C0685p c0685p = w10.f25452c;
        q2.f25445c = c0685p != null ? this.f25458c.fromModel(c0685p) : null;
        return q2;
    }

    public Y(@NotNull C0676g c0676g, @NotNull c0 c0Var, @NotNull r rVar) {
        this.f25456a = c0676g;
        this.f25457b = c0Var;
        this.f25458c = rVar;
    }

    public /* synthetic */ Y(C0676g c0676g, c0 c0Var, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0676g() : c0676g, (i & 2) != 0 ? new c0() : c0Var, (i & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(@NotNull Q q2) {
        C0674e c0674e;
        a0 a0Var;
        N n10 = q2.f25443a;
        if (n10 != null) {
            this.f25456a.getClass();
            c0674e = new C0674e(n10.f25434a);
        } else {
            c0674e = null;
        }
        P p6 = q2.f25444b;
        if (p6 != null) {
            this.f25457b.getClass();
            a0Var = new a0(p6.f25440a, p6.f25441b);
        } else {
            a0Var = null;
        }
        O o2 = q2.f25445c;
        return new W(c0674e, a0Var, o2 != null ? this.f25458c.toModel(o2) : null);
    }
}
