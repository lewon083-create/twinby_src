package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f37087a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    zk a(zk zkVar);

    void a(ByteBuffer byteBuffer);

    void b();

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
