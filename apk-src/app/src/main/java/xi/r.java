package xi;

import com.vk.api.sdk.exceptions.VKApiCodes;
import ii.w;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f36256a = new r();

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        switch (b2) {
            case -127:
                Object value = readValue(byteBuffer);
                if (value == null) {
                    return null;
                }
                return s.values()[((Long) value).intValue()];
            case -126:
                Object value2 = readValue(byteBuffer);
                if (value2 == null) {
                    return null;
                }
                return u.values()[((Long) value2).intValue()];
            case -125:
                Object value3 = readValue(byteBuffer);
                if (value3 == null) {
                    return null;
                }
                return l.values()[((Long) value3).intValue()];
            case -124:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                n nVar = new n();
                Boolean bool = (Boolean) arrayList.get(0);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
                }
                nVar.f36247a = bool;
                Boolean bool2 = (Boolean) arrayList.get(1);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
                }
                nVar.f36248b = bool2;
                nVar.f36249c = (Long) arrayList.get(2);
                return nVar;
            case -123:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                p pVar = new p();
                pVar.f36252a = (Double) arrayList2.get(0);
                pVar.f36253b = (Double) arrayList2.get(1);
                Long l10 = (Long) arrayList2.get(2);
                if (l10 == null) {
                    throw new IllegalStateException("Nonnull field \"quality\" is null.");
                }
                pVar.f36254c = l10;
                return pVar;
            case -122:
                ArrayList arrayList3 = (ArrayList) readValue(byteBuffer);
                q qVar = new q();
                p pVar2 = (p) arrayList3.get(0);
                if (pVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
                }
                qVar.f36255a = pVar2;
                return qVar;
            case -121:
                ArrayList arrayList4 = (ArrayList) readValue(byteBuffer);
                v vVar = new v();
                vVar.f36263a = (Long) arrayList4.get(0);
                return vVar;
            case -120:
                ArrayList arrayList5 = (ArrayList) readValue(byteBuffer);
                t tVar = new t();
                u uVar = (u) arrayList5.get(0);
                if (uVar == null) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                tVar.f36259a = uVar;
                tVar.f36260b = (s) arrayList5.get(1);
                return tVar;
            case -119:
                ArrayList arrayList6 = (ArrayList) readValue(byteBuffer);
                j jVar = new j();
                String str = (String) arrayList6.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"code\" is null.");
                }
                jVar.f36237a = str;
                jVar.f36238b = (String) arrayList6.get(1);
                return jVar;
            case -118:
                ArrayList arrayList7 = (ArrayList) readValue(byteBuffer);
                k kVar = new k();
                l lVar = (l) arrayList7.get(0);
                if (lVar == null) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                kVar.f36239a = lVar;
                kVar.f36240b = (j) arrayList7.get(1);
                List list = (List) arrayList7.get(2);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"paths\" is null.");
                }
                kVar.f36241c = list;
                return kVar;
            default:
                return super.readValueOfType(b2, byteBuffer);
        }
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof s) {
            byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
            writeValue(byteArrayOutputStream, Integer.valueOf(((s) obj).f36258b));
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, Integer.valueOf(((u) obj).f36262b));
            return;
        }
        if (obj instanceof l) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, Integer.valueOf(((l) obj).f36245b));
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(132);
            n nVar = (n) obj;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(nVar.f36247a);
            arrayList.add(nVar.f36248b);
            arrayList.add(nVar.f36249c);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof p) {
            byteArrayOutputStream.write(133);
            p pVar = (p) obj;
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(pVar.f36252a);
            arrayList2.add(pVar.f36253b);
            arrayList2.add(pVar.f36254c);
            writeValue(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof q) {
            byteArrayOutputStream.write(134);
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(((q) obj).f36255a);
            writeValue(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof v) {
            byteArrayOutputStream.write(135);
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(((v) obj).f36263a);
            writeValue(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(136);
            t tVar = (t) obj;
            ArrayList arrayList5 = new ArrayList(2);
            arrayList5.add(tVar.f36259a);
            arrayList5.add(tVar.f36260b);
            writeValue(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(137);
            j jVar = (j) obj;
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(jVar.f36237a);
            arrayList6.add(jVar.f36238b);
            writeValue(byteArrayOutputStream, arrayList6);
            return;
        }
        if (!(obj instanceof k)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(138);
        k kVar = (k) obj;
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add(kVar.f36239a);
        arrayList7.add(kVar.f36240b);
        arrayList7.add(kVar.f36241c);
        writeValue(byteArrayOutputStream, arrayList7);
    }
}
