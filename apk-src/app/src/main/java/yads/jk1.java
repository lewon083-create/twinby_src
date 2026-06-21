package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class jk1 extends qa0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39885b;

    public jk1(IllegalStateException illegalStateException, kk1 kk1Var) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(kk1Var == null ? null : kk1Var.f40227a);
        super(sb2.toString(), illegalStateException);
        this.f39885b = lb3.f40466a >= 21 ? a(illegalStateException) : null;
    }

    public static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
