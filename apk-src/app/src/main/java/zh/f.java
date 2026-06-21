package zh;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements ii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f46285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f46287c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i) {
        this.f46285a = flutterJNI;
        this.f46286b = i;
    }

    @Override // ii.e
    public final void a(ByteBuffer byteBuffer) throws Throwable {
        if (this.f46287c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i = this.f46286b;
        FlutterJNI flutterJNI = this.f46285a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i, byteBuffer, byteBuffer.position());
        }
    }
}
