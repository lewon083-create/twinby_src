package w4;

import e1.d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f35116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f35117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f35118e;

    public static Serializable D(int i, p pVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(pVar.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(pVar.z() == 1);
        }
        if (i == 2) {
            return F(pVar);
        }
        if (i != 3) {
            if (i == 8) {
                return E(pVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(pVar.t()));
                pVar.N(2);
                return date;
            }
            int iD = pVar.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i10 = 0; i10 < iD; i10++) {
                Serializable serializableD = D(pVar.z(), pVar);
                if (serializableD != null) {
                    arrayList.add(serializableD);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strF = F(pVar);
            int iZ = pVar.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableD2 = D(iZ, pVar);
            if (serializableD2 != null) {
                map.put(strF, serializableD2);
            }
        }
    }

    public static HashMap E(p pVar) {
        int iD = pVar.D();
        HashMap map = new HashMap(iD);
        for (int i = 0; i < iD; i++) {
            String strF = F(pVar);
            Serializable serializableD = D(pVar.z(), pVar);
            if (serializableD != null) {
                map.put(strF, serializableD);
            }
        }
        return map;
    }

    public static String F(p pVar) {
        int iG = pVar.G();
        int i = pVar.f28590b;
        pVar.N(iG);
        return new String(pVar.f28589a, i, iG);
    }
}
