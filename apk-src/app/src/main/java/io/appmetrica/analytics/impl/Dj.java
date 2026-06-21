package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Dj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sj f22258a;

    public Dj(Sj sj2) {
        this.f22258a = sj2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        Rj rjA = ((C0131ed) this.f22258a).a();
        if (rjA != null) {
            sa.reportEvent(rjA.f22920a, rjA.f22921b);
        }
    }
}
