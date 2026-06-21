package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class u extends t {
    public static String b(String str) {
        int length;
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listG = ek.u.g(new ek.p(3, str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (!StringsKt.D((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listG.size();
        int iE = kotlin.collections.s.e(listG);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listG) {
            int i = length + 1;
            if (length < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iE) && StringsKt.D(str3)) {
                str3 = null;
            } else {
                String line = e0.u(iIntValue, str3);
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        CollectionsKt___CollectionsKt.t(arrayList3, sb2, "\n", "", "", null);
        return sb2.toString();
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.D("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listG = ek.u.g(new ek.p(3, str));
        int length = str.length();
        listG.size();
        int iE = kotlin.collections.s.e(listG);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listG) {
            int i10 = i + 1;
            String line = null;
            if (i < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iE) || !StringsKt.D(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && a0.m(i11, str2, "|", false)) {
                    line = str2.substring("|".length() + i11);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        CollectionsKt___CollectionsKt.t(arrayList, sb2, "\n", "", "", null);
        return sb2.toString();
    }
}
