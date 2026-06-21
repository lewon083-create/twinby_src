package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f9364a = Collections.EMPTY_LIST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public List a(ya yaVar) {
        String str;
        int i;
        List listSingletonList;
        tk0 tk0Var = new tk0((byte[]) yaVar.f12557d);
        ArrayList arrayList = this.f9364a;
        while (tk0Var.B() > 0) {
            int iK = tk0Var.K();
            int iK2 = tk0Var.f10642b + tk0Var.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = tk0Var.K() & 31;
                for (int i10 = 0; i10 < iK3; i10++) {
                    String strK = tk0Var.k(3, StandardCharsets.UTF_8);
                    int iK4 = tk0Var.K();
                    boolean z5 = (iK4 & 128) != 0;
                    if (z5) {
                        i = iK4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bK = (byte) tk0Var.K();
                    tk0Var.G(1);
                    if (z5) {
                        int i11 = bK & 64;
                        byte[] bArr = ea0.f4892a;
                        listSingletonList = Collections.singletonList(i11 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    ow1 ow1Var = new ow1();
                    ow1Var.e(str);
                    ow1Var.f8825d = strK;
                    ow1Var.I = i;
                    ow1Var.f8835o = listSingletonList;
                    arrayList.add(new jx1(ow1Var));
                }
            }
            tk0Var.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
