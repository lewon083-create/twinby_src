package ej;

import a0.u;
import a1.e;
import cj.h;
import cj.j;
import fe.c;
import j3.o;
import j3.y0;
import java.util.ArrayList;
import java.util.Objects;
import s3.l;
import s3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16387d;

    public a(l lVar, c cVar, boolean z5) {
        super(lVar, cVar);
        this.f16387d = z5;
    }

    @Override // cj.h
    public final void c() {
        y yVar = (y) this.f2333b;
        yVar.n0();
        y0 y0Var = yVar.h0;
        int i = y0Var.f26416a;
        int i10 = y0Var.f26417b;
        int iA = 1;
        if (i != 0 && i10 != 0 && !this.f16387d) {
            yVar.n0();
            o oVar = yVar.S;
            Objects.requireNonNull(oVar);
            try {
                iA = u.a(oVar.f26347z);
            } catch (IllegalArgumentException unused) {
            }
        }
        long jO = yVar.O();
        int iB = u.b(iA);
        e eVar = (e) this.f2334c.f16785c;
        ((ArrayList) eVar.f324d).add(new j(jO, i, i10, iB));
        eVar.O();
    }
}
