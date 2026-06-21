package v3;

import android.os.Handler;
import com.google.android.gms.internal.ads.sn0;
import i4.a1;
import j3.b0;
import j3.d0;
import j3.o;
import m3.p;
import q4.a0;
import q4.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f34724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3.b f34725b = new r3.b(2, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4.a f34726c = new z4.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34727d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f34728e;

    public k(l lVar, bb.e eVar) {
        this.f34728e = lVar;
        this.f34724a = new a1(eVar, null, null);
    }

    @Override // q4.a0
    public final void a(o oVar) {
        this.f34724a.a(oVar);
    }

    @Override // q4.a0
    public final void e(p pVar, int i, int i10) {
        this.f34724a.e(pVar, i, 0);
    }

    @Override // q4.a0
    public final void f(long j10, int i, int i10, int i11, z zVar) {
        long jI;
        long jP;
        this.f34724a.f(j10, i, i10, i11, zVar);
        while (this.f34724a.x(false)) {
            z4.a aVar = this.f34726c;
            aVar.r();
            if (this.f34724a.C(this.f34725b, aVar, 0, false) == -4) {
                aVar.u();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f32194h;
                b0 b0VarL = this.f34728e.f34731d.l(aVar);
                if (b0VarL != null) {
                    b5.a aVar2 = (b5.a) b0VarL.f26216a[0];
                    String str = aVar2.f1969a;
                    String str2 = aVar2.f1970b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jP = m3.z.P(m3.z.p(aVar2.f1973e));
                        } catch (d0 unused) {
                            jP = -9223372036854775807L;
                        }
                        if (jP != -9223372036854775807L) {
                            j jVar = new j(j11, jP);
                            Handler handler = this.f34728e.f34732e;
                            handler.sendMessage(handler.obtainMessage(1, jVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f34724a;
        sn0 sn0Var = a1Var.f20833a;
        synchronized (a1Var) {
            int i12 = a1Var.f20850s;
            jI = i12 == 0 ? -1L : a1Var.i(i12);
        }
        sn0Var.a(jI);
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) {
        return this.f34724a.g(hVar, i, z5);
    }
}
