package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo0 f6755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f6756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6762h;

    public j9(int i) {
        switch (i) {
            case 1:
                this.f6755a = new yo0();
                this.f6760f = -9223372036854775807L;
                this.f6761g = -9223372036854775807L;
                this.f6762h = -9223372036854775807L;
                this.f6756b = new tk0();
                break;
            default:
                this.f6755a = new yo0();
                this.f6760f = -9223372036854775807L;
                this.f6761g = -9223372036854775807L;
                this.f6762h = -9223372036854775807L;
                this.f6756b = new tk0();
                break;
        }
    }

    public static long a(tk0 tk0Var) {
        int i = tk0Var.f10642b;
        if (tk0Var.B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tk0Var.H(bArr, 0, 9);
        tk0Var.E(i);
        byte b2 = bArr[0];
        if ((b2 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b2;
        long j11 = b10;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(a2 a2Var) {
        byte[] bArr = cq0.f4294b;
        int length = bArr.length;
        this.f6756b.z(0, bArr);
        this.f6757c = true;
        a2Var.e();
    }
}
