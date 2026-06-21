package g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19652a;

    public l2() {
        this.f19652a = new ArrayList();
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    iArr[i10] = i11;
                    b(arrayList, i, iArr, i10 + 1);
                    break;
                } else if (i11 == iArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
        }
    }

    public final void a(p2 p2Var) {
        this.f19652a.add(p2Var);
    }

    public final List c(List list) {
        k2 k2Var;
        k2 k2Var2;
        k2 k2Var3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f19652a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z5 = false;
        b(arrayList2, size2, new int[size2], 0);
        p2[] p2VarArr = new p2[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z10 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    p2 p2Var = (p2) arrayList.get(i);
                    p2 other = (p2) list.get(iArr[i]);
                    p2Var.getClass();
                    Intrinsics.checkNotNullParameter(other, "other");
                    z10 &= other.f19718b.f19674b <= p2Var.f19718b.f19674b && other.f19717a == p2Var.f19717a && ((k2Var = p2Var.f19719c) == (k2Var2 = k2.f19634c) || (k2Var3 = other.f19719c) == k2Var2 || k2Var3 == k2Var);
                    if (!z10) {
                        break;
                    }
                    p2VarArr[iArr[i]] = (p2) arrayList.get(i);
                }
            }
            if (z10) {
                z5 = true;
                break;
            }
        }
        if (z5) {
            return Arrays.asList(p2VarArr);
        }
        return null;
    }

    public l2(p2... p2VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f19652a = arrayList;
        Collections.addAll(arrayList, p2VarArr);
    }
}
