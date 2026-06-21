package ti;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends j implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k9.j f33806c;

    public d0(int i, ka.k kVar, String str, s sVar, y yVar, b bVar) {
        super(i);
        kVar.getClass();
        str.getClass();
        sVar.getClass();
        yVar.getClass();
        this.f33805b = kVar;
    }

    @Override // ti.l
    public final void a() {
        k9.j jVar = this.f33806c;
        if (jVar != null) {
            this.f33805b.L(this.f33834a, jVar.getResponseInfo());
        }
    }

    @Override // ti.j
    public final void b() {
        k9.j jVar = this.f33806c;
        if (jVar != null) {
            jVar.a();
            this.f33806c = null;
        }
    }

    @Override // ti.j
    public final io.flutter.plugin.platform.f c() {
        k9.j jVar = this.f33806c;
        if (jVar == null) {
            return null;
        }
        return new ef.d(jVar, 2);
    }
}
