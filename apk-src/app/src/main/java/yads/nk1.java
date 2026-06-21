package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nk1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kk1 f41275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41276e;

    public nk1(int i, nx0 nx0Var, tk1 tk1Var, boolean z5) {
        this("Decoder init failed: [" + i + "], " + nx0Var, tk1Var, nx0Var.f41375m, z5, null, a(i));
    }

    public static String a(int i) {
        return "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
    }

    public nk1(String str, Throwable th2, String str2, boolean z5, kk1 kk1Var, String str3) {
        super(str, th2);
        this.f41273b = str2;
        this.f41274c = z5;
        this.f41275d = kk1Var;
        this.f41276e = str3;
    }

    public static String a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
        }
        return null;
    }
}
