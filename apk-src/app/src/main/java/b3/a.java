package b3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FloatBuffer f1800f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f1801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f1802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f1805e;

    static {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f1800f = floatBufferAsFloatBuffer;
    }

    public a(g gVar, int i, int i10) {
        float[] fArr = new float[8];
        this.f1801a = fArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.f1802b = floatBufferAsFloatBuffer;
        this.f1805e = gVar;
        this.f1803c = i;
        this.f1804d = i10;
    }
}
