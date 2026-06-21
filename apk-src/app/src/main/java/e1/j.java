package e1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec f15966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f15967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f15969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1.k f15970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1.h f15971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f15972h = new AtomicBoolean(false);

    public j(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f15966b = mediaCodec;
        this.f15968d = i;
        this.f15969e = mediaCodec.getOutputBuffer(i);
        this.f15967c = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f15970f = i0.o.w(new f(atomicReference, 1));
        j1.h hVar = (j1.h) atomicReference.get();
        hVar.getClass();
        this.f15971g = hVar;
    }

    @Override // e1.i
    public final long B() {
        return this.f15967c.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        j1.h hVar = this.f15971g;
        if (this.f15972h.getAndSet(true)) {
            return;
        }
        try {
            this.f15966b.releaseOutputBuffer(this.f15968d, false);
            hVar.b(null);
        } catch (IllegalStateException e3) {
            hVar.d(e3);
        }
    }

    @Override // e1.i
    public final MediaCodec.BufferInfo p() {
        return this.f15967c;
    }

    @Override // e1.i
    public final boolean r() {
        return (this.f15967c.flags & 1) != 0;
    }

    @Override // e1.i
    public final long size() {
        return this.f15967c.size;
    }

    @Override // e1.i
    public final ByteBuffer y() {
        if (this.f15972h.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f15967c;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f15969e;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }
}
