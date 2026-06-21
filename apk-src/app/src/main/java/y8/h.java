package y8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f36543a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f36544b = new rd.c("startMs", pe.a.m(pe.a.l(ud.e.class, new ud.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f36545c = new rd.c("endMs", pe.a.m(pe.a.l(ud.e.class, new ud.a(2))));

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        b9.g gVar = (b9.g) obj;
        rd.e eVar = (rd.e) obj2;
        eVar.a(f36544b, gVar.f2011a);
        eVar.a(f36545c, gVar.f2012b);
    }
}
