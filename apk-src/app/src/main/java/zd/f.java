package zd;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f46261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.g f46262b;

    public f(j jVar, sb.g gVar) {
        this.f46261a = jVar;
        this.f46262b = gVar;
    }

    @Override // zd.i
    public final boolean a(Exception exc) {
        this.f46262b.c(exc);
        return true;
    }

    @Override // zd.i
    public final boolean b(ae.b bVar) {
        if (bVar.f912b != 4 || this.f46261a.a(bVar)) {
            return false;
        }
        String str = bVar.f913c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f46262b.b(new a(str, bVar.f915e, bVar.f916f));
        return true;
    }
}
