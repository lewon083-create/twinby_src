package d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f15437c;

    public /* synthetic */ b(n nVar, int i) {
        this.f15436b = i;
        this.f15437c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15436b) {
            case 0:
                n.g(this.f15437c);
                break;
            default:
                this.f15437c.invalidateMenu();
                break;
        }
    }
}
