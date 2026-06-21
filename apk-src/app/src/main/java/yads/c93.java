package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37316a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f37319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37322g;

    public final void a(p73 p73Var, long j10, int i, int i10, int i11, o73 o73Var) {
        if (!(this.f37322g <= i10 + i11)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f37317b) {
            int i12 = this.f37318c;
            int i13 = i12 + 1;
            this.f37318c = i13;
            if (i12 == 0) {
                this.f37319d = j10;
                this.f37320e = i;
                this.f37321f = 0;
            }
            int i14 = this.f37321f + i10;
            this.f37321f = i14;
            this.f37322g = i11;
            if (i13 < 16 || i13 <= 0) {
                return;
            }
            p73Var.a(this.f37319d, this.f37320e, i14, i11, o73Var);
            this.f37318c = 0;
        }
    }

    public final void a(oq0 oq0Var) {
        if (this.f37317b) {
            return;
        }
        oq0Var.a(this.f37316a, 0, 10);
        oq0Var.b();
        byte[] bArr = this.f37316a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f37317b = true;
        }
    }
}
