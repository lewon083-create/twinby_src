package x4;

import com.google.android.gms.ads.identifier.c;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.h5;
import j3.b0;
import j3.c0;
import j3.d0;
import j3.n;
import m3.p;
import q4.a0;
import q4.h;
import q4.k;
import q4.l;
import q4.m;
import q4.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f35766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f35767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f35768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k5.l f35769e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35772h;
    public int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f35765a = new p(16);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f35773j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35770f = 0;

    @Override // q4.k
    public final int a(l lVar, e2 e2Var) throws d0 {
        while (true) {
            int i = this.f35770f;
            if (i == 0) {
                int i10 = this.i;
                p pVar = this.f35765a;
                if (i10 == 0) {
                    if (!lVar.h(pVar.f28589a, 0, 8, true)) {
                        m mVar = this.f35766b;
                        mVar.getClass();
                        mVar.G();
                        this.f35766b.j(new o(-9223372036854775807L));
                        this.f35770f = 4;
                        return -1;
                    }
                    this.i = 8;
                    pVar.M(0);
                    this.f35772h = pVar.B();
                    this.f35771g = pVar.m();
                }
                if (this.f35772h == 1) {
                    lVar.readFully(pVar.f28589a, 8, 8);
                    this.i += 8;
                    this.f35772h = pVar.F();
                }
                if (this.f35771g == 1836086884) {
                    long position = lVar.getPosition();
                    this.f35773j = position;
                    long j10 = this.i;
                    z4.b bVar = new z4.b(0L, position - j10, -9223372036854775807L, position, this.f35772h - j10);
                    m mVar2 = this.f35766b;
                    mVar2.getClass();
                    a0 a0VarP = mVar2.P(1024, 4);
                    n nVar = new n();
                    nVar.f26291l = c0.n("image/heic");
                    nVar.f26290k = new b0(bVar);
                    pe.a.q(nVar, a0VarP);
                    this.f35770f = 2;
                } else {
                    this.f35770f = 1;
                }
            } else if (i == 1) {
                lVar.M((int) (this.f35772h - ((long) this.i)));
                this.i = 0;
                this.f35770f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f35768d == null || lVar != this.f35767c) {
                        this.f35767c = lVar;
                        this.f35768d = new c(lVar, this.f35773j);
                    }
                    k5.l lVar2 = this.f35769e;
                    lVar2.getClass();
                    int iA = lVar2.a(this.f35768d, e2Var);
                    if (iA == 1) {
                        e2Var.f4793b += this.f35773j;
                    }
                    return iA;
                }
                if (this.f35769e == null) {
                    this.f35769e = new k5.l(n5.k.U1, 8);
                }
                c cVar = new c(lVar, this.f35773j);
                this.f35768d = cVar;
                if (this.f35769e.d(cVar)) {
                    k5.l lVar3 = this.f35769e;
                    long j11 = this.f35773j;
                    m mVar3 = this.f35766b;
                    mVar3.getClass();
                    lVar3.b(new c(j11, mVar3, 12));
                    this.f35770f = 3;
                } else {
                    m mVar4 = this.f35766b;
                    mVar4.getClass();
                    mVar4.G();
                    this.f35766b.j(new o(-9223372036854775807L));
                    this.f35770f = 4;
                }
            }
        }
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f35766b = mVar;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        return h5.C((h) lVar, true);
    }

    @Override // q4.k
    public final void release() {
        k5.l lVar = this.f35769e;
        if (lVar != null) {
            lVar.getClass();
            this.f35769e = null;
        }
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        if (j10 != 0) {
            if (this.f35770f == 3) {
                k5.l lVar = this.f35769e;
                lVar.getClass();
                lVar.seek(j10, j11);
                return;
            }
            return;
        }
        this.f35770f = 0;
        this.i = 0;
        this.f35773j = -1L;
        if (this.f35769e != null) {
            this.f35769e = null;
        }
    }
}
