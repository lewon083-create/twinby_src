package m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28416h;

    public final void a(int i, int i10) {
        this.f28411c = i;
        this.f28412d = i10;
        this.f28416h = true;
        if (this.f28415g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f28409a = i10;
            }
            if (i != Integer.MIN_VALUE) {
                this.f28410b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f28409a = i;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f28410b = i10;
        }
    }
}
