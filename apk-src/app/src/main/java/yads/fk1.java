package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface fk1 {
    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    ByteBuffer a(int i);

    void a(int i, int i10, long j10, int i11);

    void a(int i, long j10);

    void a(int i, m20 m20Var, long j10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(ek1 ek1Var, Handler handler);

    void a(boolean z5, int i);

    int b();

    ByteBuffer b(int i);

    void flush();

    void release();

    void setVideoScalingMode(int i);
}
