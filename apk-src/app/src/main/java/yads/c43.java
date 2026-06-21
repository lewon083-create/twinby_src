package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p73 f37280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qq0 f37281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r92 f37282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f37284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f37285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37286h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f37288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37290m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p92 f37279a = new p92();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a43 f37287j = new a43();

    public abstract long a(lb2 lb2Var);

    public void a(long j10) {
        this.f37285g = j10;
    }

    public abstract boolean a(lb2 lb2Var, long j10, a43 a43Var);

    public void a(boolean z5) {
        if (z5) {
            this.f37287j = new a43();
            this.f37284f = 0L;
            this.f37286h = 0;
        } else {
            this.f37286h = 1;
        }
        this.f37283e = -1L;
        this.f37285g = 0L;
    }
}
