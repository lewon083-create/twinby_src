package b3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f1843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1845e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaMuxer f1847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f1848h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1851l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ac.c f1846f = new ac.c();
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f1852m = new ArrayList();

    public f(String str, int i, int i10, int i11) {
        MediaFormat.createVideoFormat("image/vnd.android.heic", i, i10);
        this.f1844d = 1;
        this.f1842b = 2;
        this.f1845e = 1;
        HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f1843c = handler;
        this.f1847g = str != null ? new MediaMuxer(str, 3) : a7.d.l();
        this.f1848h = new e(i, i10, i11, handler, new ac.c(this));
    }

    public final void a() {
        MediaMuxer mediaMuxer = this.f1847g;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f1847g.release();
            this.f1847g = null;
        }
        e eVar = this.f1848h;
        if (eVar != null) {
            eVar.close();
            synchronized (this) {
                this.f1848h = null;
            }
        }
    }

    public final void b() {
        Pair pair;
        if (!this.i.get()) {
            return;
        }
        while (true) {
            synchronized (this.f1852m) {
                try {
                    if (this.f1852m.isEmpty()) {
                        return;
                    } else {
                        pair = (Pair) this.f1852m.remove(0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((ByteBuffer) pair.second).position(), ((ByteBuffer) pair.second).remaining(), 0L, 16);
            this.f1847g.writeSampleData(this.f1849j[((Integer) pair.first).intValue()], (ByteBuffer) pair.second, bufferInfo);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1843c.postAtFrontOfQueue(new ac.g(4, this));
    }
}
