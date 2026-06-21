package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class gz2 {
    public final vs1 a(ys1 ys1Var) {
        ByteBuffer byteBuffer = ys1Var.f42864d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (ys1Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
            return null;
        }
        return a(ys1Var, byteBuffer);
    }

    public abstract vs1 a(ys1 ys1Var, ByteBuffer byteBuffer);
}
