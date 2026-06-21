package e4;

import a0.d1;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f16216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f16217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f16218d;

    public y(z zVar, OutputStream outputStream) {
        this.f16216b = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f16217c = handlerThread;
        handlerThread.start();
        this.f16218d = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HandlerThread handlerThread = this.f16217c;
        Objects.requireNonNull(handlerThread);
        this.f16218d.post(new d1(16, handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
