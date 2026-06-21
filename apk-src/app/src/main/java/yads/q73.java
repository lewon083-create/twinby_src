package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f42203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f42205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f42206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f42208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f42209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f42210h;

    public q73(h73 h73Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j10) {
        ni.a(iArr.length == jArr2.length);
        ni.a(jArr.length == jArr2.length);
        ni.a(iArr2.length == jArr2.length);
        this.f42203a = h73Var;
        this.f42205c = jArr;
        this.f42206d = iArr;
        this.f42207e = i;
        this.f42208f = jArr2;
        this.f42209g = iArr2;
        this.f42210h = j10;
        this.f42204b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int iA = lb3.a(this.f42208f, j10, true); iA < this.f42208f.length; iA++) {
            if ((this.f42209g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
