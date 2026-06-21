package x8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f36013a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f36014b = rd.c.a("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f36015c = rd.c.a("mobileSubtype");

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        rd.e eVar = (rd.e) obj2;
        n nVar = (n) ((v) obj);
        eVar.c(f36014b, nVar.f36043a);
        eVar.c(f36015c, nVar.f36044b);
    }
}
