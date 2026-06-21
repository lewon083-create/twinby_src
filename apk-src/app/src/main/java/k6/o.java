package k6;

import a0.o2;
import g0.s2;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f27143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f27144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f27145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f27146g;

    /* JADX WARN: Multi-variable type inference failed */
    public o(a0.b1 b1Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        n nVar;
        int i10;
        this.f27143d = arrayList;
        this.f27144e = iArr;
        this.f27145f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f27146g = b1Var;
        c cVar = (c) b1Var.f45c;
        int size = ((List) cVar.f27046d).size();
        this.f27140a = size;
        int size2 = ((List) cVar.f27047e).size();
        this.f27142c = size2;
        this.f27141b = true;
        n nVar2 = arrayList.isEmpty() ? null : (n) arrayList.get(0);
        if (nVar2 == null || nVar2.f27136a != 0 || nVar2.f27137b != 0) {
            arrayList.add(0, new n(0, 0, 0));
        }
        arrayList.add(new n(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar3 = (n) it.next();
            for (int i11 = 0; i11 < nVar3.f27138c; i11++) {
                int i12 = nVar3.f27136a + i11;
                int i13 = nVar3.f27137b + i11;
                int i14 = b1Var.o(i12, i13) ? 1 : 2;
                iArr[i12] = (i13 << 4) | i14;
                iArr2[i13] = (i12 << 4) | i14;
            }
        }
        if (this.f27141b) {
            Iterator it2 = arrayList.iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                n nVar4 = (n) it2.next();
                while (true) {
                    i = nVar4.f27136a;
                    if (i15 < i) {
                        if (iArr[i15] == 0) {
                            int size3 = arrayList.size();
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                if (i16 < size3) {
                                    nVar = (n) arrayList.get(i16);
                                    while (true) {
                                        i10 = nVar.f27137b;
                                        if (i17 < i10) {
                                            if (iArr2[i17] == 0 && b1Var.p(i15, i17)) {
                                                int i18 = b1Var.o(i15, i17) ? 8 : 4;
                                                iArr[i15] = (i17 << 4) | i18;
                                                iArr2[i17] = i18 | (i15 << 4);
                                            } else {
                                                i17++;
                                            }
                                        }
                                    }
                                }
                                i17 = nVar.f27138c + i10;
                                i16++;
                            }
                        }
                        i15++;
                    }
                }
                i15 = nVar4.f27138c + i;
            }
        }
    }

    public static q a(ArrayDeque arrayDeque, int i, boolean z5) {
        q qVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            qVar = (q) it.next();
            if (qVar.f27153a == i && qVar.f27155c == z5) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            q qVar2 = (q) it.next();
            if (z5) {
                qVar2.f27154b--;
            } else {
                qVar2.f27154b++;
            }
        }
        return qVar;
    }

    public o(x0.b0 b0Var, o2 o2Var, s2 s2Var, boolean z5, int i) {
        this.f27146g = b0Var;
        this.f27141b = false;
        this.f27142c = 0;
        this.f27145f = null;
        this.f27143d = o2Var;
        this.f27144e = s2Var;
        b0Var.f35544j0 = z5;
        this.f27140a = i;
    }
}
