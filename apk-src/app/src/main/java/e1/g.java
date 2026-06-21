package e1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f15963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f15964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.h f15965d;

    public g(i iVar) {
        MediaCodec.BufferInfo bufferInfoP = iVar.p();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoP.size, bufferInfoP.presentationTimeUs, bufferInfoP.flags);
        this.f15964c = bufferInfo;
        ByteBuffer byteBufferY = iVar.y();
        MediaCodec.BufferInfo bufferInfoP2 = iVar.p();
        byteBufferY.position(bufferInfoP2.offset);
        byteBufferY.limit(bufferInfoP2.offset + bufferInfoP2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoP2.size);
        byteBufferAllocate.order(byteBufferY.order());
        byteBufferAllocate.put(byteBufferY);
        byteBufferAllocate.flip();
        this.f15963b = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        i0.o.w(new f(atomicReference, 0));
        j1.h hVar = (j1.h) atomicReference.get();
        hVar.getClass();
        this.f15965d = hVar;
    }

    @Override // e1.i
    public final long B() {
        return this.f15964c.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15965d.b(null);
    }

    @Override // e1.i
    public final MediaCodec.BufferInfo p() {
        return this.f15964c;
    }

    @Override // e1.i
    public final boolean r() {
        return (this.f15964c.flags & 1) != 0;
    }

    @Override // e1.i
    public final long size() {
        return this.f15964c.size;
    }

    @Override // e1.i
    public final ByteBuffer y() {
        return this.f15963b;
    }
}
