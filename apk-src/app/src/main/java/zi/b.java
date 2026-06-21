package zi;

import com.vk.api.sdk.exceptions.VKApiCodes;
import ii.w;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46303a = new b();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        Object value = readValue(byteBuffer);
        if (value == null) {
            return null;
        }
        return c.values()[((Long) value).intValue()];
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof c)) {
            super.writeValue(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
            writeValue(byteArrayOutputStream, Integer.valueOf(((c) obj).f46305b));
        }
    }
}
