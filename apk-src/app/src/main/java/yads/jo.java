package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jo extends cu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f39922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f39923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public lo f39924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f39925n;

    public jo(p30 p30Var, u30 u30Var, nx0 nx0Var, int i, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(p30Var, u30Var, 1, nx0Var, i, obj, j10, j11);
        nx0Var.getClass();
        this.f39921j = j14;
        this.f39922k = j12;
        this.f39923l = j13;
    }

    public final int a(int i) {
        int[] iArr = this.f39925n;
        if (iArr != null) {
            return iArr[i];
        }
        throw new IllegalStateException();
    }

    public long c() {
        long j10 = this.f39921j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean d();
}
