package k3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f26866a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    h e(h hVar);

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();

    default long d(long j10) {
        return j10;
    }
}
