package jh;

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
    public static final c f26627a = new c();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        Long lValueOf = null;
        if (b2 == -128) {
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            a aVar = new a();
            aVar.f26622a = (String) arrayList.get(0);
            Object obj = arrayList.get(1);
            if (obj != null) {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.f26623b = lValueOf;
            return aVar;
        }
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        d dVar = new d();
        dVar.f26628a = (String) arrayList2.get(0);
        dVar.f26629b = (String) arrayList2.get(1);
        Object obj2 = arrayList2.get(2);
        if (obj2 != null) {
            lValueOf = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        dVar.f26630c = lValueOf;
        dVar.f26631d = (Map) arrayList2.get(3);
        dVar.f26632e = (Boolean) arrayList2.get(4);
        dVar.f26633f = (Boolean) arrayList2.get(5);
        return dVar;
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof a) {
            byteArrayOutputStream.write(128);
            a aVar = (a) obj;
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(aVar.f26622a);
            arrayList.add(aVar.f26623b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof d)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
        d dVar = (d) obj;
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(dVar.f26628a);
        arrayList2.add(dVar.f26629b);
        arrayList2.add(dVar.f26630c);
        arrayList2.add(dVar.f26631d);
        arrayList2.add(dVar.f26632e);
        arrayList2.add(dVar.f26633f);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
