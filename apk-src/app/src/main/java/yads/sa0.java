package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class sa0 extends sq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m20 f42863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f42864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f42867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42868h;
    public final int i;

    static {
        io0.a("goog.exo.decoder");
    }

    public sa0(int i) {
        this(i, 0);
    }

    public static sa0 d() {
        return new sa0(0, 0);
    }

    public void b() {
        this.f43049b = 0;
        ByteBuffer byteBuffer = this.f42864d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f42867g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f42865e = false;
    }

    public final void c(int i) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2;
        int i10 = i + this.i;
        ByteBuffer byteBuffer = this.f42864d;
        if (byteBuffer == null) {
            int i11 = this.f42868h;
            if (i11 == 1) {
                byteBufferAllocateDirect2 = ByteBuffer.allocate(i10);
            } else {
                if (i11 != 2) {
                    throw new ra0(byteBuffer != null ? byteBuffer.capacity() : 0, i10);
                }
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i10);
            }
            this.f42864d = byteBufferAllocateDirect2;
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i10 + iPosition;
        if (iCapacity >= i12) {
            this.f42864d = byteBuffer;
            return;
        }
        int i13 = this.f42868h;
        if (i13 == 1) {
            byteBufferAllocateDirect = ByteBuffer.allocate(i12);
        } else {
            if (i13 != 2) {
                ByteBuffer byteBuffer2 = this.f42864d;
                throw new ra0(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i12);
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(i12);
        }
        byteBufferAllocateDirect.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferAllocateDirect.put(byteBuffer);
        }
        this.f42864d = byteBufferAllocateDirect;
    }

    public sa0(int i, int i10) {
        this.f42863c = new m20();
        this.f42868h = i;
        this.i = 0;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f42864d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f42867g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
