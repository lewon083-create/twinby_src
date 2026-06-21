package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.g f21053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he.e f21054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.a f21055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final le.a f21056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21057e;

    public w0(p3.g gVar, q4.i iVar) {
        he.e eVar = new he.e(3, iVar);
        m7.a aVar = new m7.a(28);
        le.a aVar2 = new le.a(1);
        this.f21053a = gVar;
        this.f21054b = eVar;
        this.f21055c = aVar;
        this.f21056d = aVar2;
        this.f21057e = 1048576;
    }

    @Override // i4.b0
    public final a d(j3.x xVar) {
        xVar.f26407b.getClass();
        return new x0(xVar, this.f21053a, this.f21054b, this.f21055c.n(xVar), this.f21056d, this.f21057e, null);
    }
}
