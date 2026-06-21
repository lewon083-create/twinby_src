package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uj extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f43684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f43685c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f43690h;
    public MediaFormat i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f43691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f43692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f43693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f43694m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43683a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub1 f43686d = new ub1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ub1 f43687e = new ub1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f43688f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f43689g = new ArrayDeque();

    public uj(HandlerThread handlerThread) {
        this.f43684b = handlerThread;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f43683a) {
            try {
                if (this.f43692k <= 0 && !this.f43693l) {
                    IllegalStateException illegalStateException = this.f43694m;
                    if (illegalStateException != null) {
                        this.f43694m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = this.f43691j;
                    if (codecException != null) {
                        this.f43691j = null;
                        throw codecException;
                    }
                    ub1 ub1Var = this.f43687e;
                    int i = ub1Var.f43623c;
                    if (i == 0) {
                        return -1;
                    }
                    if (i == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = ub1Var.f43624d;
                    int i10 = ub1Var.f43621a;
                    int i11 = iArr[i10];
                    ub1Var.f43621a = (i10 + 1) & ub1Var.f43625e;
                    ub1Var.f43623c = i - 1;
                    if (i11 >= 0) {
                        if (this.f43690h == null) {
                            throw new IllegalStateException();
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f43688f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i11 == -2) {
                        this.f43690h = (MediaFormat) this.f43689g.remove();
                    }
                    return i11;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f43683a) {
            try {
                if (this.f43693l) {
                    return;
                }
                long j10 = this.f43692k - 1;
                this.f43692k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.f43689g.isEmpty()) {
                    this.i = (MediaFormat) this.f43689g.getLast();
                }
                ub1 ub1Var = this.f43686d;
                ub1Var.f43621a = 0;
                ub1Var.f43622b = -1;
                ub1Var.f43623c = 0;
                ub1 ub1Var2 = this.f43687e;
                ub1Var2.f43621a = 0;
                ub1Var2.f43622b = -1;
                ub1Var2.f43623c = 0;
                this.f43688f.clear();
                this.f43689g.clear();
                this.f43691j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f43683a) {
            this.f43691j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f43683a) {
            this.f43686d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f43683a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f43687e.a(-2);
                    this.f43689g.add(mediaFormat);
                    this.i = null;
                }
                this.f43687e.a(i);
                this.f43688f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f43683a) {
            this.f43687e.a(-2);
            this.f43689g.add(mediaFormat);
            this.i = null;
        }
    }

    public final void a() {
        synchronized (this.f43683a) {
            this.f43692k++;
            Handler handler = this.f43685c;
            int i = lb3.f40466a;
            handler.post(new zl.a1(1, this));
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f43685c == null) {
            this.f43684b.start();
            Handler handler = new Handler(this.f43684b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f43685c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.f43683a) {
            this.f43694m = illegalStateException;
        }
    }
}
