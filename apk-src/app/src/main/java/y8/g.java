package y8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f36540a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f36541b = new rd.c("currentCacheSizeBytes", pe.a.m(pe.a.l(ud.e.class, new ud.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f36542c = new rd.c("maxCacheSizeBytes", pe.a.m(pe.a.l(ud.e.class, new ud.a(2))));

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        b9.f fVar = (b9.f) obj;
        rd.e eVar = (rd.e) obj2;
        eVar.a(f36541b, fVar.f2009a);
        eVar.a(f36542c, fVar.f2010b);
    }
}
