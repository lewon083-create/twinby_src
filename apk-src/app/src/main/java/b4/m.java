package b4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.cp1;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface m {
    void B(o4.h hVar, Handler handler);

    ByteBuffer D(int i);

    void F(Surface surface);

    ByteBuffer H(int i);

    void K(ArrayList arrayList);

    void L(ArrayList arrayList);

    void a(Bundle bundle);

    void d(int i, cp1 cp1Var, long j10, int i10);

    void f(int i, int i10, long j10, int i11);

    void flush();

    void g(int i);

    default boolean l(a7.l lVar) {
        return false;
    }

    MediaFormat o();

    void p();

    void release();

    void s(int i, long j10);

    void setVideoScalingMode(int i);

    int t();

    int w(MediaCodec.BufferInfo bufferInfo);

    default void z(a0.d dVar) {
        dVar.run();
    }
}
