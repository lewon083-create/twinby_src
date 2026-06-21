package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qj implements fk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f42310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj f42311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj f42312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42315f = 0;

    public qj(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z5) {
        this.f42310a = mediaCodec;
        this.f42311b = new uj(handlerThread);
        this.f42312c = new tj(mediaCodec, handlerThread2);
        this.f42313d = z5;
    }

    @Override // yads.fk1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f42311b.a(bufferInfo);
    }

    @Override // yads.fk1
    public final int b() {
        uj ujVar = this.f42311b;
        synchronized (ujVar.f43683a) {
            try {
                int i = -1;
                if (ujVar.f43692k <= 0 && !ujVar.f43693l) {
                    IllegalStateException illegalStateException = ujVar.f43694m;
                    if (illegalStateException != null) {
                        ujVar.f43694m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = ujVar.f43691j;
                    if (codecException != null) {
                        ujVar.f43691j = null;
                        throw codecException;
                    }
                    ub1 ub1Var = ujVar.f43686d;
                    int i10 = ub1Var.f43623c;
                    if (i10 != 0) {
                        if (i10 == 0) {
                            throw new NoSuchElementException();
                        }
                        int[] iArr = ub1Var.f43624d;
                        int i11 = ub1Var.f43621a;
                        i = iArr[i11];
                        ub1Var.f43621a = (i11 + 1) & ub1Var.f43625e;
                        ub1Var.f43623c = i10 - 1;
                    }
                    return i;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void c() {
        if (this.f42313d) {
            try {
                tj tjVar = this.f42312c;
                vy vyVar = tjVar.f43340e;
                synchronized (vyVar) {
                    vyVar.f44222a = false;
                }
                rj rjVar = tjVar.f43338c;
                rjVar.getClass();
                rjVar.obtainMessage(2).sendToTarget();
                tjVar.f43340e.a();
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    @Override // yads.fk1
    public final void flush() {
        this.f42312c.a();
        this.f42310a.flush();
        this.f42311b.a();
        this.f42310a.start();
    }

    @Override // yads.fk1
    public final void release() {
        try {
            if (this.f42315f == 1) {
                tj tjVar = this.f42312c;
                if (tjVar.f43341f) {
                    tjVar.a();
                    tjVar.f43337b.quit();
                }
                tjVar.f43341f = false;
                uj ujVar = this.f42311b;
                synchronized (ujVar.f43683a) {
                    try {
                        ujVar.f43693l = true;
                        ujVar.f43684b.quit();
                        if (!ujVar.f43689g.isEmpty()) {
                            ujVar.i = (MediaFormat) ujVar.f43689g.getLast();
                        }
                        ub1 ub1Var = ujVar.f43686d;
                        ub1Var.f43621a = 0;
                        ub1Var.f43622b = -1;
                        ub1Var.f43623c = 0;
                        ub1 ub1Var2 = ujVar.f43687e;
                        ub1Var2.f43621a = 0;
                        ub1Var2.f43622b = -1;
                        ub1Var2.f43623c = 0;
                        ujVar.f43688f.clear();
                        ujVar.f43689g.clear();
                        ujVar.f43691j = null;
                    } finally {
                    }
                }
            }
            this.f42315f = 2;
            if (this.f42314e) {
                return;
            }
            this.f42310a.release();
            this.f42314e = true;
        } catch (Throwable th2) {
            if (!this.f42314e) {
                this.f42310a.release();
                this.f42314e = true;
            }
            throw th2;
        }
    }

    @Override // yads.fk1
    public final void setVideoScalingMode(int i) {
        c();
        this.f42310a.setVideoScalingMode(i);
    }

    @Override // yads.fk1
    public final ByteBuffer a(int i) {
        return this.f42310a.getInputBuffer(i);
    }

    @Override // yads.fk1
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        uj ujVar = this.f42311b;
        synchronized (ujVar.f43683a) {
            try {
                mediaFormat = ujVar.f43690h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f42311b.a(this.f42310a);
        g73.a("configureCodec");
        this.f42310a.configure(mediaFormat, surface, mediaCrypto, 0);
        g73.a();
        tj tjVar = this.f42312c;
        if (!tjVar.f43341f) {
            tjVar.f43337b.start();
            tjVar.f43338c = new rj(tjVar, tjVar.f43337b.getLooper());
            tjVar.f43341f = true;
        }
        g73.a("startCodec");
        this.f42310a.start();
        g73.a();
        this.f42315f = 1;
    }

    @Override // yads.fk1
    public final ByteBuffer b(int i) {
        return this.f42310a.getOutputBuffer(i);
    }

    public final void a(ek1 ek1Var, MediaCodec mediaCodec, long j10, long j11) {
        cl1 cl1Var = (cl1) ek1Var;
        cl1Var.getClass();
        if (lb3.f40466a < 30) {
            cl1Var.f37425b.sendMessageAtFrontOfQueue(Message.obtain(cl1Var.f37425b, 0, (int) (j10 >> 32), (int) j10));
            return;
        }
        dl1 dl1Var = cl1Var.f37426c;
        if (cl1Var != dl1Var.f37814n1) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            dl1Var.f41590z0 = true;
            return;
        }
        try {
            dl1Var.b(j10);
            dl1Var.D();
            dl1Var.B0.f41855e++;
            dl1Var.V0 = true;
            if (!dl1Var.T0) {
                dl1Var.T0 = true;
                dl1Var.I0.a(dl1Var.P0);
                dl1Var.R0 = true;
            }
            dl1Var.a(j10);
        } catch (qn0 e3) {
            cl1Var.f37426c.A0 = e3;
        }
    }

    @Override // yads.fk1
    public final void a(int i, int i10, long j10, int i11) {
        tj tjVar = this.f42312c;
        RuntimeException runtimeException = (RuntimeException) tjVar.f43339d.getAndSet(null);
        if (runtimeException == null) {
            sj sjVarB = tj.b();
            sjVarB.f42946a = i;
            sjVarB.f42947b = 0;
            sjVarB.f42948c = i10;
            sjVarB.f42950e = j10;
            sjVarB.f42951f = i11;
            rj rjVar = tjVar.f43338c;
            int i12 = lb3.f40466a;
            rjVar.obtainMessage(0, sjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // yads.fk1
    public final void a(int i, m20 m20Var, long j10) {
        this.f42312c.a(i, m20Var, j10);
    }

    @Override // yads.fk1
    public final void a(int i, long j10) {
        this.f42310a.releaseOutputBuffer(i, j10);
    }

    @Override // yads.fk1
    public final void a(boolean z5, int i) {
        this.f42310a.releaseOutputBuffer(i, z5);
    }

    @Override // yads.fk1
    public final void a(ek1 ek1Var, Handler handler) {
        c();
        this.f42310a.setOnFrameRenderedListener(new zl.q(this, ek1Var, 1), handler);
    }

    @Override // yads.fk1
    public final void a(Surface surface) {
        c();
        this.f42310a.setOutputSurface(surface);
    }

    @Override // yads.fk1
    public final void a(Bundle bundle) {
        c();
        this.f42310a.setParameters(bundle);
    }
}
