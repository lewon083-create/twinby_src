package pi;

import com.vk.api.sdk.exceptions.VKApiCodes;
import ii.w;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f31503a = new k();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            if (b2 != -126) {
                return super.readValueOfType(b2, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            f fVar = new f();
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            fVar.f31495a = str;
            e eVar = (e) arrayList.get(1);
            if (eVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            fVar.f31496b = eVar;
            fVar.f31497c = (Boolean) arrayList.get(2);
            Map map = (Map) arrayList.get(3);
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            fVar.f31498d = map;
            return fVar;
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        e eVar2 = new e();
        String str2 = (String) arrayList2.get(0);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        eVar2.f31482a = str2;
        String str3 = (String) arrayList2.get(1);
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        eVar2.f31483b = str3;
        String str4 = (String) arrayList2.get(2);
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        eVar2.f31484c = str4;
        String str5 = (String) arrayList2.get(3);
        if (str5 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        eVar2.f31485d = str5;
        eVar2.f31486e = (String) arrayList2.get(4);
        eVar2.f31487f = (String) arrayList2.get(5);
        eVar2.f31488g = (String) arrayList2.get(6);
        eVar2.f31489h = (String) arrayList2.get(7);
        eVar2.i = (String) arrayList2.get(8);
        eVar2.f31490j = (String) arrayList2.get(9);
        eVar2.f31491k = (String) arrayList2.get(10);
        eVar2.f31492l = (String) arrayList2.get(11);
        eVar2.f31493m = (String) arrayList2.get(12);
        eVar2.f31494n = (String) arrayList2.get(13);
        return eVar2;
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof e)) {
            if (!(obj instanceof f)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(130);
            f fVar = (f) obj;
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(fVar.f31495a);
            arrayList.add(fVar.f31496b);
            arrayList.add(fVar.f31497c);
            arrayList.add(fVar.f31498d);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
        e eVar = (e) obj;
        ArrayList arrayList2 = new ArrayList(14);
        arrayList2.add(eVar.f31482a);
        arrayList2.add(eVar.f31483b);
        arrayList2.add(eVar.f31484c);
        arrayList2.add(eVar.f31485d);
        arrayList2.add(eVar.f31486e);
        arrayList2.add(eVar.f31487f);
        arrayList2.add(eVar.f31488g);
        arrayList2.add(eVar.f31489h);
        arrayList2.add(eVar.i);
        arrayList2.add(eVar.f31490j);
        arrayList2.add(eVar.f31491k);
        arrayList2.add(eVar.f31492l);
        arrayList2.add(eVar.f31493m);
        arrayList2.add(eVar.f31494n);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
