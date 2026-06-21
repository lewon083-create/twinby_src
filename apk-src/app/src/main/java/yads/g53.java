package yads;

import android.media.MediaCodec;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g53 implements dk1 {
    public static MediaCodec b(ck1 ck1Var) throws IOException {
        ck1Var.f37415a.getClass();
        String str = ck1Var.f37415a.f40227a;
        g73.a("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        g73.a();
        return mediaCodecCreateByCodecName;
    }

    @Override // yads.dk1
    public final fk1 a(ck1 ck1Var) {
        MediaCodec mediaCodecB = null;
        try {
            mediaCodecB = b(ck1Var);
            g73.a("configureCodec");
            mediaCodecB.configure(ck1Var.f37416b, ck1Var.f37418d, ck1Var.f37419e, 0);
            g73.a();
            g73.a("startCodec");
            mediaCodecB.start();
            g73.a();
            return new h53(mediaCodecB);
        } catch (IOException | RuntimeException e3) {
            if (mediaCodecB != null) {
                mediaCodecB.release();
            }
            throw e3;
        }
    }
}
