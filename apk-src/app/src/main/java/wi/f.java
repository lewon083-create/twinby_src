package wi;

import com.vk.api.sdk.exceptions.VKApiCodes;
import ii.w;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f35269a = new f();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        switch (b2) {
            case -127:
                Object value = readValue(byteBuffer);
                if (value == null) {
                    return null;
                }
                return g.values()[((Long) value).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                e eVar = new e();
                List list = (List) arrayList.get(0);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"scopes\" is null.");
                }
                eVar.f35262a = list;
                g gVar = (g) arrayList.get(1);
                if (gVar == null) {
                    throw new IllegalStateException("Nonnull field \"signInType\" is null.");
                }
                eVar.f35263b = gVar;
                eVar.f35264c = (String) arrayList.get(2);
                eVar.f35265d = (String) arrayList.get(3);
                eVar.f35266e = (String) arrayList.get(4);
                Boolean bool = (Boolean) arrayList.get(5);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
                }
                eVar.f35267f = bool;
                eVar.f35268g = (String) arrayList.get(6);
                return eVar;
            case -125:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                h hVar = new h();
                hVar.f35272a = (String) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"email\" is null.");
                }
                hVar.f35273b = str;
                String str2 = (String) arrayList2.get(2);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                hVar.f35274c = str2;
                hVar.f35275d = (String) arrayList2.get(3);
                hVar.f35276e = (String) arrayList2.get(4);
                hVar.f35277f = (String) arrayList2.get(5);
                return hVar;
            default:
                return super.readValueOfType(b2, byteBuffer);
        }
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof g) {
            byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
            writeValue(byteArrayOutputStream, Integer.valueOf(((g) obj).f35271b));
            return;
        }
        if (obj instanceof e) {
            byteArrayOutputStream.write(130);
            e eVar = (e) obj;
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(eVar.f35262a);
            arrayList.add(eVar.f35263b);
            arrayList.add(eVar.f35264c);
            arrayList.add(eVar.f35265d);
            arrayList.add(eVar.f35266e);
            arrayList.add(eVar.f35267f);
            arrayList.add(eVar.f35268g);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof h)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(131);
        h hVar = (h) obj;
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(hVar.f35272a);
        arrayList2.add(hVar.f35273b);
        arrayList2.add(hVar.f35274c);
        arrayList2.add(hVar.f35275d);
        arrayList2.add(hVar.f35276e);
        arrayList2.add(hVar.f35277f);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
