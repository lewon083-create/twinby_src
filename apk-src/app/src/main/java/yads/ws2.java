package yads;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ws2 extends q53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f44459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f44460d;

    public ws2() {
        super(new bl0());
        this.f44458b = -9223372036854775807L;
        this.f44459c = new long[0];
        this.f44460d = new long[0];
    }

    public static String b(lb2 lb2Var) {
        int iR = lb2Var.r();
        int i = lb2Var.f40464b;
        lb2Var.e(i + iR);
        return new String(lb2Var.f40463a, i, iR);
    }

    public final boolean a(long j10, lb2 lb2Var) {
        if (lb2Var.m() != 2 || !"onMetaData".equals(b(lb2Var)) || lb2Var.f40465c - lb2Var.f40464b == 0 || lb2Var.m() != 8) {
            return false;
        }
        HashMap mapA = a(lb2Var);
        Object obj = mapA.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > ConfigValue.DOUBLE_DEFAULT_VALUE) {
                this.f44458b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapA.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f44459c = new long[size];
                this.f44460d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f44459c = new long[0];
                        this.f44460d = new long[0];
                        break;
                    }
                    this.f44459c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f44460d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public static Serializable a(int i, lb2 lb2Var) {
        if (i == 8) {
            return a(lb2Var);
        }
        if (i == 10) {
            int iP = lb2Var.p();
            ArrayList arrayList = new ArrayList(iP);
            for (int i10 = 0; i10 < iP; i10++) {
                Serializable serializableA = a(lb2Var.m(), lb2Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(lb2Var.i()));
            lb2Var.e(lb2Var.f40464b + 2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(lb2Var.i()));
        }
        if (i == 1) {
            return Boolean.valueOf(lb2Var.m() == 1);
        }
        if (i == 2) {
            return b(lb2Var);
        }
        if (i != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            String strB = b(lb2Var);
            int iM = lb2Var.m();
            if (iM == 9) {
                return map;
            }
            Serializable serializableA2 = a(iM, lb2Var);
            if (serializableA2 != null) {
                map.put(strB, serializableA2);
            }
        }
    }

    public static HashMap a(lb2 lb2Var) {
        int iP = lb2Var.p();
        HashMap map = new HashMap(iP);
        for (int i = 0; i < iP; i++) {
            String strB = b(lb2Var);
            Serializable serializableA = a(lb2Var.m(), lb2Var);
            if (serializableA != null) {
                map.put(strB, serializableA);
            }
        }
        return map;
    }
}
