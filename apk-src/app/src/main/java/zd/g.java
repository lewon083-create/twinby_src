package zd;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.g f46263a;

    public g(sb.g gVar) {
        this.f46263a = gVar;
    }

    @Override // zd.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // zd.i
    public final boolean b(ae.b bVar) {
        int i = bVar.f912b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f46263a.d(bVar.f911a);
        return true;
    }
}
