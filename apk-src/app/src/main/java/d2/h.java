package d2;

import j3.c0;
import j3.n;
import j3.o;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import la.m;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15547b;

    public h(int i, List list) {
        this.f15546a = i;
        this.f15547b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x5.v a(int r6, la.m r7) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.h.a(int, la.m):x5.v");
    }

    public List b(m mVar) {
        String str;
        int i;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.f15547b;
        if (zC) {
            return list;
        }
        p pVar = new p((byte[]) mVar.f28101f);
        while (pVar.a() > 0) {
            int iZ = pVar.z();
            int iZ2 = pVar.f28590b + pVar.z();
            if (iZ == 134) {
                ArrayList arrayList = new ArrayList();
                int iZ3 = pVar.z() & 31;
                for (int i10 = 0; i10 < iZ3; i10++) {
                    String strX = pVar.x(3, StandardCharsets.UTF_8);
                    int iZ4 = pVar.z();
                    boolean z5 = (iZ4 & 128) != 0;
                    if (z5) {
                        i = iZ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZ = (byte) pVar.z();
                    pVar.N(1);
                    if (z5) {
                        boolean z10 = (bZ & 64) != 0;
                        byte[] bArr = m3.d.f28554a;
                        listSingletonList = Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    n nVar = new n();
                    nVar.f26292m = c0.n(str);
                    nVar.f26284d = strX;
                    nVar.J = i;
                    nVar.f26295p = listSingletonList;
                    arrayList.add(new o(nVar));
                }
                list = arrayList;
            }
            pVar.M(iZ2);
        }
        return list;
    }

    public boolean c(int i) {
        return (i & this.f15546a) != 0;
    }

    public h() {
        this.f15546a = 1;
        this.f15547b = Collections.singletonList(null);
    }

    public h(ArrayList arrayList) {
        this.f15546a = 0;
        this.f15547b = arrayList;
    }
}
