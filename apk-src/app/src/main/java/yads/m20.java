package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f40752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f40754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f40755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40758h;
    public final MediaCodec.CryptoInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l20 f40759j;

    public m20() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f40759j = lb3.f40466a >= 24 ? new l20(cryptoInfo) : null;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.f40756f = i;
        this.f40754d = iArr;
        this.f40755e = iArr2;
        this.f40752b = bArr;
        this.f40751a = bArr2;
        this.f40753c = i10;
        this.f40757g = i11;
        this.f40758h = i12;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (lb3.f40466a >= 24) {
            l20 l20Var = this.f40759j;
            l20Var.getClass();
            l20Var.a(i11, i12);
        }
    }
}
