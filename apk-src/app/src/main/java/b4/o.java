package b4;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class o extends tp1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1906b;

    public o(IllegalStateException illegalStateException, p pVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(pVar == null ? null : pVar.f1907a);
        super(sb2.toString(), illegalStateException);
        boolean z5 = illegalStateException instanceof MediaCodec.CodecException;
        if (z5) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f1906b = z5 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
