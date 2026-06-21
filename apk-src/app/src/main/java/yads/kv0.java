package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f40354g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40355h;

    public final boolean a() {
        return this.f40351d > 15 && this.f40355h == 0;
    }

    public final void a(long j10) {
        long j11 = this.f40351d;
        if (j11 == 0) {
            this.f40348a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f40348a;
            this.f40349b = j12;
            this.f40353f = j12;
            this.f40352e = 1L;
        } else {
            long j13 = j10 - this.f40350c;
            int i = (int) (j11 % 15);
            if (Math.abs(j13 - this.f40349b) <= 1000000) {
                this.f40352e++;
                this.f40353f += j13;
                boolean[] zArr = this.f40354g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f40355h--;
                }
            } else {
                boolean[] zArr2 = this.f40354g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f40355h++;
                }
            }
        }
        this.f40351d++;
        this.f40350c = j10;
    }
}
