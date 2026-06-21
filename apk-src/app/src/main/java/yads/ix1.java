package yads;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ix1 {
    public static double a(List list) {
        Object next;
        List listC;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            double d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            if (!zHasNext) {
                break;
            }
            w41 w41Var = (w41) it.next();
            int i = w41Var.f44274b;
            if (i != 0) {
                d10 = ((double) w41Var.f44273a) / ((double) i);
            }
            arrayList.add(Double.valueOf(d10));
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(yj.b.a(((Number) it2.next()).doubleValue() * ((double) 1000))));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int iIntValue = 1;
            if (!it3.hasNext()) {
                break;
            }
            int iIntValue2 = ((Number) it3.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int iIntValue3 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int iIntValue4 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue3 < iIntValue4) {
                        next = next2;
                        iIntValue3 = iIntValue4;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int iIntValue5 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && iIntValue5 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList3.add(Double.valueOf(((double) ((Number) ((Map.Entry) it5.next()).getKey()).intValue()) / ((double) 1000)));
        }
        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
        if (arrayList3.size() <= 1) {
            listC = CollectionsKt.R(arrayList3);
        } else {
            Object[] array = arrayList3.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            Intrinsics.checkNotNullParameter(comparableArr, "<this>");
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            listC = kotlin.collections.o.c(array);
        }
        int size = listC.size();
        int i10 = size / 2;
        if (arrayList3.isEmpty()) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        int i11 = size % 2;
        if (i11 + ((((i11 ^ 2) & ((-i11) | i11)) >> 31) & 2) == 1) {
            return ((Number) listC.get(i10)).doubleValue();
        }
        return (((Number) listC.get(i10 - 1)).doubleValue() + ((Number) listC.get(i10)).doubleValue()) / ((double) 2);
    }
}
