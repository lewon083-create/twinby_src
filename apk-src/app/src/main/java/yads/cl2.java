package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cl2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37431e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b73 f37427a = new b73(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f37432f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f37433g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f37434h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f37428b = new lb2();

    public static long a(lb2 lb2Var) {
        int i = lb2Var.f40464b;
        if (lb2Var.f40465c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        lb2Var.a(bArr, 0, 9);
        lb2Var.e(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b2;
                    long j11 = b10;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
