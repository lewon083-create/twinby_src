package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f40414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f40415b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public l20(MediaCodec.CryptoInfo cryptoInfo) {
        this.f40414a = cryptoInfo;
    }

    public final void a(int i, int i10) {
        this.f40415b.set(i, i10);
        this.f40414a.setPattern(this.f40415b);
    }
}
