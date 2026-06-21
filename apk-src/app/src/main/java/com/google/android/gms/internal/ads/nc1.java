package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nc1 extends vv {
    public static final wl1 N(mm1 mm1Var) throws IOException {
        String strJ;
        int iH = mm1Var.h();
        wl1 wl1VarP = P(mm1Var, iH);
        if (wl1VarP == null) {
            return O(mm1Var, iH);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iA = mm1Var.f7923h;
            if (iA == 0) {
                iA = mm1Var.a();
            }
            String str = null;
            if (iA == 2 || iA == 4 || iA == 17) {
                if (wl1VarP instanceof vl1) {
                    int iA2 = mm1Var.f7923h;
                    if (iA2 == 0) {
                        iA2 = mm1Var.a();
                    }
                    if (iA2 != 4) {
                        throw mm1Var.K("END_ARRAY");
                    }
                    int i = mm1Var.f7926l;
                    mm1Var.f7926l = i - 1;
                    int[] iArr = mm1Var.f7928n;
                    int i10 = i - 2;
                    iArr[i10] = iArr[i10] + 1;
                    mm1Var.f7923h = 0;
                } else {
                    int iA3 = mm1Var.f7923h;
                    if (iA3 == 0) {
                        iA3 = mm1Var.a();
                    }
                    if (iA3 != 2) {
                        throw mm1Var.K("END_OBJECT");
                    }
                    int i11 = mm1Var.f7926l;
                    int i12 = i11 - 1;
                    mm1Var.f7926l = i12;
                    mm1Var.f7927m[i12] = null;
                    int[] iArr2 = mm1Var.f7928n;
                    int i13 = i11 - 2;
                    iArr2[i13] = iArr2[i13] + 1;
                    mm1Var.f7923h = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return wl1VarP;
                }
                wl1VarP = (wl1) arrayDeque.removeLast();
            } else {
                if (wl1VarP instanceof yl1) {
                    int iA4 = mm1Var.f7923h;
                    if (iA4 == 0) {
                        iA4 = mm1Var.a();
                    }
                    if (iA4 == 14) {
                        strJ = mm1Var.k();
                    } else if (iA4 == 12) {
                        strJ = mm1Var.j('\'');
                    } else {
                        if (iA4 != 13) {
                            throw mm1Var.K("a name");
                        }
                        strJ = mm1Var.j('\"');
                    }
                    str = strJ;
                    mm1Var.f7923h = 0;
                    mm1Var.f7927m[mm1Var.f7926l - 1] = str;
                    if (!vv.p(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iH2 = mm1Var.h();
                wl1 wl1VarP2 = P(mm1Var, iH2);
                wl1 wl1VarO = wl1VarP2 == null ? O(mm1Var, iH2) : wl1VarP2;
                if (wl1VarP instanceof vl1) {
                    ((vl1) wl1VarP).f11418b.add(wl1VarO);
                } else {
                    yl1 yl1Var = (yl1) wl1VarP;
                    if (yl1Var.f12663b.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    yl1Var.f12663b.put(str, wl1VarO);
                }
                if (wl1VarP2 != null) {
                    arrayDeque.addLast(wl1VarP);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    wl1VarP = wl1VarO;
                } else {
                    continue;
                }
            }
        }
    }

    public static final wl1 O(mm1 mm1Var, int i) throws IOException {
        int i10 = i - 1;
        if (i10 == 5) {
            String strB = mm1Var.b();
            if (vv.p(strB)) {
                return new am1(strB);
            }
            throw new IOException("illegal characters in string");
        }
        if (i10 == 6) {
            return new am1(new oc1(mm1Var.b()));
        }
        boolean z5 = true;
        if (i10 != 7) {
            if (i10 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(ix.e(i)));
            }
            int iA = mm1Var.f7923h;
            if (iA == 0) {
                iA = mm1Var.a();
            }
            if (iA != 7) {
                throw mm1Var.K("null");
            }
            mm1Var.f7923h = 0;
            int[] iArr = mm1Var.f7928n;
            int i11 = mm1Var.f7926l - 1;
            iArr[i11] = iArr[i11] + 1;
            return xl1.f12197b;
        }
        int iA2 = mm1Var.f7923h;
        if (iA2 == 0) {
            iA2 = mm1Var.a();
        }
        if (iA2 == 5) {
            mm1Var.f7923h = 0;
            int[] iArr2 = mm1Var.f7928n;
            int i12 = mm1Var.f7926l - 1;
            iArr2[i12] = iArr2[i12] + 1;
        } else {
            if (iA2 != 6) {
                throw mm1Var.K("a boolean");
            }
            mm1Var.f7923h = 0;
            int[] iArr3 = mm1Var.f7928n;
            int i13 = mm1Var.f7926l - 1;
            iArr3[i13] = iArr3[i13] + 1;
            z5 = false;
        }
        return new am1(Boolean.valueOf(z5));
    }

    public static final wl1 P(mm1 mm1Var, int i) throws IOException {
        int i10 = i - 1;
        if (i10 == 0) {
            int iA = mm1Var.f7923h;
            if (iA == 0) {
                iA = mm1Var.a();
            }
            if (iA != 3) {
                throw mm1Var.K("BEGIN_ARRAY");
            }
            mm1Var.l(1);
            mm1Var.f7928n[mm1Var.f7926l - 1] = 0;
            mm1Var.f7923h = 0;
            return new vl1();
        }
        if (i10 != 2) {
            return null;
        }
        int iA2 = mm1Var.f7923h;
        if (iA2 == 0) {
            iA2 = mm1Var.a();
        }
        if (iA2 != 1) {
            throw mm1Var.K("BEGIN_OBJECT");
        }
        mm1Var.l(3);
        mm1Var.f7923h = 0;
        return new yl1();
    }
}
