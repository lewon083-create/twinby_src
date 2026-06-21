package x5;

import m3.w;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f35925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f35926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35931h;
    public long i;

    public o(int i) {
        this.f35924a = i;
        switch (i) {
            case 1:
                this.f35925b = new w(0L);
                this.f35930g = -9223372036854775807L;
                this.f35931h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f35926c = new m3.p();
                break;
            default:
                this.f35925b = new w(0L);
                this.f35930g = -9223372036854775807L;
                this.f35931h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f35926c = new m3.p();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(m3.p pVar) {
        int i = pVar.f28590b;
        if (pVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        pVar.k(bArr, 0, 9);
        pVar.M(i);
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

    public final void a(q4.l lVar) {
        switch (this.f35924a) {
            case 0:
                byte[] bArr = z.f28609b;
                m3.p pVar = this.f35926c;
                pVar.getClass();
                pVar.K(bArr.length, bArr);
                this.f35927d = true;
                lVar.L();
                break;
            default:
                byte[] bArr2 = z.f28609b;
                m3.p pVar2 = this.f35926c;
                pVar2.getClass();
                pVar2.K(bArr2.length, bArr2);
                this.f35927d = true;
                lVar.L();
                break;
        }
    }
}
