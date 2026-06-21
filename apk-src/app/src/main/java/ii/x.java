package ii;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f21321b = new x(w.INSTANCE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f21322a;

    public x(w wVar) {
        this.f21322a = wVar;
    }

    @Override // ii.r
    public final n a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        w wVar = this.f21322a;
        Object value = wVar.readValue(byteBuffer);
        Object value2 = wVar.readValue(byteBuffer);
        if (!(value instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new n((String) value, value2);
    }

    @Override // ii.r
    public final ByteBuffer b(Object obj) throws IOException {
        v vVar = new v();
        vVar.write(0);
        this.f21322a.writeValue(vVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // ii.r
    public final ByteBuffer c(String str, String str2) throws IOException {
        v vVar = new v();
        vVar.write(1);
        w wVar = this.f21322a;
        wVar.writeValue(vVar, "error");
        wVar.writeValue(vVar, str);
        wVar.writeValue(vVar, null);
        wVar.writeValue(vVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // ii.r
    public final ByteBuffer d(String str, String str2, Object obj) throws IOException {
        v vVar = new v();
        vVar.write(1);
        w wVar = this.f21322a;
        wVar.writeValue(vVar, str);
        wVar.writeValue(vVar, str2);
        if (obj instanceof Throwable) {
            wVar.writeValue(vVar, Log.getStackTraceString((Throwable) obj));
        } else {
            wVar.writeValue(vVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // ii.r
    public final Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        w wVar = this.f21322a;
        if (b2 != 0) {
            if (b2 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object value = wVar.readValue(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return value;
        }
        Object value2 = wVar.readValue(byteBuffer);
        Object value3 = wVar.readValue(byteBuffer);
        Object value4 = wVar.readValue(byteBuffer);
        if ((value2 instanceof String) && ((value3 == null || (value3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new j((String) value2, (String) value3, value4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // ii.r
    public final ByteBuffer f(n nVar) {
        v vVar = new v();
        String str = nVar.f21315a;
        w wVar = this.f21322a;
        wVar.writeValue(vVar, str);
        wVar.writeValue(vVar, nVar.f21316b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(vVar.size());
        byteBufferAllocateDirect.put(vVar.a(), 0, vVar.size());
        return byteBufferAllocateDirect;
    }
}
