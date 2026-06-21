package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ng extends gz2 {
    @Override // yads.gz2
    public final vs1 a(ys1 ys1Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            kb2 kb2Var = new kb2(byteBuffer.limit(), byteBuffer.array());
            kb2Var.c(12);
            int iC = (kb2Var.c() + kb2Var.a(12)) - 4;
            kb2Var.c(44);
            kb2Var.d(kb2Var.a(12));
            kb2Var.c(16);
            ArrayList arrayList = new ArrayList();
            while (kb2Var.c() < iC) {
                kb2Var.c(48);
                int iA = kb2Var.a(8);
                kb2Var.c(4);
                int iC2 = kb2Var.c() + kb2Var.a(12);
                String strA = null;
                String strA2 = null;
                while (kb2Var.c() < iC2) {
                    int iA2 = kb2Var.a(8);
                    int iA3 = kb2Var.a(8);
                    int iC3 = kb2Var.c() + iA3;
                    if (iA2 == 2) {
                        int iA4 = kb2Var.a(16);
                        kb2Var.c(8);
                        if (iA4 == 3) {
                            while (kb2Var.c() < iC3) {
                                strA = kb2Var.a(kb2Var.a(8), bu.f37144a);
                                int iA5 = kb2Var.a(8);
                                for (int i = 0; i < iA5; i++) {
                                    kb2Var.d(kb2Var.a(8));
                                }
                            }
                        }
                    } else if (iA2 == 21) {
                        strA2 = kb2Var.a(iA3, bu.f37144a);
                    }
                    kb2Var.b(iC3 * 8);
                }
                kb2Var.b(iC2 * 8);
                if (strA != null && strA2 != null) {
                    arrayList.add(new mg(iA, strA.concat(strA2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new vs1(arrayList);
            }
        }
        return null;
    }
}
