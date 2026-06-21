package y8;

import io.sentry.clientreport.DiscardedEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f36533a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f36534b = new rd.c("eventsDroppedCount", pe.a.m(pe.a.l(ud.e.class, new ud.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f36535c = new rd.c(DiscardedEvent.JsonKeys.REASON, pe.a.m(pe.a.l(ud.e.class, new ud.a(3))));

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        b9.d dVar = (b9.d) obj;
        rd.e eVar = (rd.e) obj2;
        eVar.a(f36534b, dVar.f2004a);
        eVar.c(f36535c, dVar.f2005b);
    }
}
