package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h53 implements fk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f39032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f39033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f39034c;

    public h53(MediaCodec mediaCodec) {
        this.f39032a = mediaCodec;
        if (lb3.f40466a < 21) {
            this.f39033b = mediaCodec.getInputBuffers();
            this.f39034c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // yads.fk1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f39032a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && lb3.f40466a < 21) {
                this.f39034c = this.f39032a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // yads.fk1
    public final int b() {
        return this.f39032a.dequeueInputBuffer(0L);
    }

    @Override // yads.fk1
    public final void flush() {
        this.f39032a.flush();
    }

    @Override // yads.fk1
    public final void release() {
        this.f39033b = null;
        this.f39034c = null;
        this.f39032a.release();
    }

    @Override // yads.fk1
    public final void setVideoScalingMode(int i) {
        this.f39032a.setVideoScalingMode(i);
    }

    @Override // yads.fk1
    public final ByteBuffer b(int i) {
        return lb3.f40466a >= 21 ? this.f39032a.getOutputBuffer(i) : this.f39034c[i];
    }

    @Override // yads.fk1
    public final MediaFormat a() {
        return this.f39032a.getOutputFormat();
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
        this.f39032a.queueInputBuffer(i, 0, i10, j10, i11);
    }

    @Override // yads.fk1
    public final void a(int i, m20 m20Var, long j10) {
        this.f39032a.queueSecureInputBuffer(i, 0, m20Var.i, j10, 0);
    }

    @Override // yads.fk1
    public final void a(int i, long j10) {
        this.f39032a.releaseOutputBuffer(i, j10);
    }

    @Override // yads.fk1
    public final void a(boolean z5, int i) {
        this.f39032a.releaseOutputBuffer(i, z5);
    }

    @Override // yads.fk1
    public final void a(ek1 ek1Var, Handler handler) {
        this.f39032a.setOnFrameRenderedListener(new zl.q(this, ek1Var, 0), handler);
    }

    @Override // yads.fk1
    public final void a(Surface surface) {
        this.f39032a.setOutputSurface(surface);
    }

    @Override // yads.fk1
    public final void a(Bundle bundle) {
        this.f39032a.setParameters(bundle);
    }

    @Override // yads.fk1
    public final ByteBuffer a(int i) {
        if (lb3.f40466a >= 21) {
            return this.f39032a.getInputBuffer(i);
        }
        return this.f39033b[i];
    }
}
