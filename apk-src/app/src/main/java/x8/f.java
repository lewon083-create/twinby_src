package x8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f36005a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f36006b = rd.c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f36007c = rd.c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rd.c f36008d = rd.c.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rd.c f36009e = rd.c.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rd.c f36010f = rd.c.a("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rd.c f36011g = rd.c.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rd.c f36012h = rd.c.a("qosTier");

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        rd.e eVar = (rd.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.a(f36006b, lVar.f36036a);
        eVar.a(f36007c, lVar.f36037b);
        eVar.c(f36008d, lVar.f36038c);
        eVar.c(f36009e, lVar.f36039d);
        eVar.c(f36010f, lVar.f36040e);
        eVar.c(f36011g, lVar.f36041f);
        eVar.c(f36012h, w.f36051b);
    }
}
