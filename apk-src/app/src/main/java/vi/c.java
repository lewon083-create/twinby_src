package vi;

import com.google.android.gms.internal.consent_sdk.k;
import ii.w;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f34865a = new HashMap();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        ArrayList arrayList;
        switch (b2) {
            case -127:
                return new b((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (a) readValueOfType(byteBuffer.get(), byteBuffer));
            case -126:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                Object valueOfType = readValueOfType(byteBuffer.get(), byteBuffer);
                if (valueOfType == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (valueOfType instanceof List) {
                        for (Object obj : (List) valueOfType) {
                            if (obj instanceof String) {
                                arrayList2.add((String) obj);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                return new a(num, arrayList);
            case -125:
                return this.f34865a.get((Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num2 = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                return new yc.e(num2.intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            default:
                return super.readValueOfType(b2, byteBuffer);
        }
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof b) {
            byteArrayOutputStream.write(-127);
            b bVar = (b) obj;
            writeValue(byteArrayOutputStream, bVar.f34863a);
            writeValue(byteArrayOutputStream, bVar.f34864b);
            return;
        }
        if (obj instanceof a) {
            byteArrayOutputStream.write(-126);
            a aVar = (a) obj;
            writeValue(byteArrayOutputStream, aVar.f34861a);
            writeValue(byteArrayOutputStream, aVar.f34862b);
            return;
        }
        if (obj instanceof k) {
            byteArrayOutputStream.write(-125);
            writeValue(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            if (!(obj instanceof yc.e)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-124);
            yc.e eVar = (yc.e) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(eVar.f45612a));
            writeValue(byteArrayOutputStream, eVar.f45613b);
        }
    }
}
