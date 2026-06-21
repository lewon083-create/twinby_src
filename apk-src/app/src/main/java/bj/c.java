package bj;

import com.vk.api.sdk.exceptions.VKApiCodes;
import ii.w;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2163a = new c();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            if (b2 != -126) {
                return super.readValueOfType(b2, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            a aVar = new a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            aVar.f2161a = bool;
            return aVar;
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        e eVar = new e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        eVar.f2166a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        eVar.f2167b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        eVar.f2168c = map;
        return eVar;
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof e) {
            byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
            e eVar = (e) obj;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f2166a);
            arrayList.add(eVar.f2167b);
            arrayList.add(eVar.f2168c);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof a)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(130);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(((a) obj).f2161a);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
