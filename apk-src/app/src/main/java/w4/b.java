package w4;

import m3.p;
import q4.h;
import q4.j;
import q4.k;
import q4.l;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f35101a = new p(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f35102b = new p(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f35103c = new p(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f35104d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f35105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f35106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35108h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f35114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f35115p;

    public b() {
        c cVar = new c(new j());
        cVar.f35116c = -9223372036854775807L;
        cVar.f35117d = new long[0];
        cVar.f35118e = new long[0];
        this.f35105e = cVar;
        this.f35107g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r30, com.google.android.gms.internal.ads.e2 r31) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 1127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.b.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f35106f = mVar;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        p pVar = this.f35101a;
        h hVar = (h) lVar;
        hVar.y(pVar.f28589a, 0, 3, false);
        pVar.M(0);
        if (pVar.C() == 4607062) {
            hVar.y(pVar.f28589a, 0, 2, false);
            pVar.M(0);
            if ((pVar.G() & 250) == 0) {
                hVar.y(pVar.f28589a, 0, 4, false);
                pVar.M(0);
                int iM = pVar.m();
                hVar.f31741g = 0;
                hVar.a(iM, false);
                hVar.y(pVar.f28589a, 0, 4, false);
                pVar.M(0);
                if (pVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final p e(l lVar) {
        int i = this.f35111l;
        p pVar = this.f35104d;
        byte[] bArr = pVar.f28589a;
        if (i > bArr.length) {
            pVar.K(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            pVar.M(0);
        }
        pVar.L(this.f35111l);
        lVar.readFully(pVar.f28589a, 0, this.f35111l);
        return pVar;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f35107g = 1;
            this.f35108h = false;
        } else {
            this.f35107g = 3;
        }
        this.f35109j = 0;
    }

    @Override // q4.k
    public final void release() {
    }
}
