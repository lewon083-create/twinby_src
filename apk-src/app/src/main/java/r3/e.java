package r3;

import com.google.android.gms.internal.ads.cp1;
import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.ads.om1;
import j3.o;
import j3.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e extends kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f32190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cp1 f32191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f32192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f32194h;
    public ByteBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f32195j;

    static {
        y.a("media3.decoder");
    }

    public e(int i) {
        super(3);
        this.f32191e = new cp1(1);
        this.f32195j = i;
    }

    public void r() {
        this.f7316c = 0;
        ByteBuffer byteBuffer = this.f32192f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f32193g = false;
    }

    public final ByteBuffer s(int i) {
        int i10 = this.f32195j;
        if (i10 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f32192f;
        throw new d(om1.j("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void t(int i) {
        ByteBuffer byteBuffer = this.f32192f;
        if (byteBuffer == null) {
            this.f32192f = s(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i + iPosition;
        if (iCapacity >= i10) {
            this.f32192f = byteBuffer;
            return;
        }
        ByteBuffer byteBufferS = s(i10);
        byteBufferS.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferS.put(byteBuffer);
        }
        this.f32192f = byteBufferS;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.f32192f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
