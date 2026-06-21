package y8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36536a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f36537b = new rd.c("logSource", pe.a.m(pe.a.l(ud.e.class, new ud.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f36538c = new rd.c("logEventDropped", pe.a.m(pe.a.l(ud.e.class, new ud.a(2))));

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        b9.e eVar = (b9.e) obj;
        rd.e eVar2 = (rd.e) obj2;
        eVar2.c(f36537b, eVar.f2007a);
        eVar2.c(f36538c, eVar.f2008b);
    }
}
