package b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1811b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1812c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1813d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1814e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1815f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f1817h;

    public d(e eVar, boolean z5) {
        this.f1817h = eVar;
        this.f1810a = z5;
    }

    public final void a() {
        if (this.f1816g) {
            return;
        }
        long j10 = this.f1813d;
        e eVar = this.f1817h;
        if (j10 < 0) {
            long j11 = this.f1811b;
            if (j11 >= 0 && this.f1812c >= j11) {
                long j12 = this.f1814e;
                if (j12 < 0) {
                    eVar.f1820d.post(new ac.g(3, this));
                    this.f1816g = true;
                    return;
                }
                this.f1813d = j12;
            }
        }
        long j13 = this.f1813d;
        if (j13 < 0 || j13 > this.f1815f) {
            return;
        }
        eVar.f1820d.post(new ac.g(3, this));
        this.f1816g = true;
    }

    public final synchronized boolean b(long j10, long j11) {
        boolean z5;
        try {
            long j12 = this.f1811b;
            z5 = j12 < 0 || j10 <= j12;
            if (z5) {
                this.f1814e = j11;
            }
            this.f1812c = j10;
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return z5;
    }
}
