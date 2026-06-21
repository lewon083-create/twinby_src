package dj;

import a0.u;
import cj.h;
import cj.j;
import j3.o;
import java.util.ArrayList;
import java.util.Objects;
import s3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends h {
    @Override // cj.h
    public final void c() {
        y yVar = (y) this.f2333b;
        yVar.n0();
        o oVar = yVar.S;
        Objects.requireNonNull(oVar);
        int iA = u.a(oVar.f26347z);
        int i = oVar.f26342u;
        int i10 = oVar.f26343v;
        if (iA == 2 || iA == 4) {
            iA = u.a(0);
            i = i10;
            i10 = i;
        }
        long jO = yVar.O();
        int iB = u.b(iA);
        a1.e eVar = (a1.e) this.f2334c.f16785c;
        ((ArrayList) eVar.f324d).add(new j(jO, i, i10, iB));
        eVar.O();
    }
}
