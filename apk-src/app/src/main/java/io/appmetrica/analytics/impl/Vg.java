package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vg extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo f23150b;

    public Vg(@NonNull Y4 y42) {
        this(y42, y42.u());
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        Y4 y42 = this.f22888a;
        if (this.f23150b.c()) {
            return false;
        }
        if (!this.f23150b.d()) {
            C0306l9 c0306l9 = y42.f23294n;
            c0306l9.f24280c.b(Q5.a(q5, EnumC0078cb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        wo woVar = this.f23150b;
        synchronized (woVar) {
            xo xoVar = woVar.f24991a;
            xoVar.a(xoVar.a().put("first_event_done", true));
        }
        return false;
    }

    public Vg(Y4 y42, wo woVar) {
        super(y42);
        this.f23150b = woVar;
    }
}
