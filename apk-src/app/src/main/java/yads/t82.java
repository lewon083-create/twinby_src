package yads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t82 {
    public static h82 a(ro2 ro2Var, long j10, List list) {
        lr lrVar = ro2Var.f42671p;
        if (lrVar == null) {
            return new h82(304, null, h82.a(list), list, true);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((r01) it.next()).f42435a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = lrVar.f40645h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (r01 r01Var : lrVar.f40645h) {
                    if (!treeSet.contains(r01Var.f42435a)) {
                        arrayList.add(r01Var);
                    }
                }
            }
        } else if (!lrVar.f40644g.isEmpty()) {
            for (Map.Entry entry : lrVar.f40644g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new h82(304, lrVar.f40638a, h82.a(arrayList), arrayList, true);
    }

    public static byte[] a(InputStream inputStream, int i, gr grVar) throws Throwable {
        byte[] bArrA;
        eg2 eg2Var = new eg2(grVar, i);
        try {
            bArrA = grVar.a(1024);
            while (true) {
                try {
                    int i10 = inputStream.read(bArrA);
                    if (i10 == -1) {
                        break;
                    }
                    eg2Var.write(bArrA, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z5 = om3.f41652a;
                    }
                    grVar.a(bArrA);
                    eg2Var.close();
                    throw th;
                }
            }
            byte[] byteArray = eg2Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z10 = om3.f41652a;
            }
            grVar.a(bArrA);
            eg2Var.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }
}
