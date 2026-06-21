package n1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28987m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f28980e = 2;
        } else {
            this.f28980e = 3;
        }
    }

    @Override // n1.e
    public final void d(int i) {
        if (this.f28984j) {
            return;
        }
        this.f28984j = true;
        this.f28982g = i;
        for (d dVar : this.f28985k) {
            dVar.a(dVar);
        }
    }
}
