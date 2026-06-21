package x5;

import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.y2;
import j3.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q4.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f35798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y2 f35799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q4.m f35800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35801f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35803h;
    public boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f35796a = new e(0, null, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.p f35797b = new m3.p(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35802g = -1;

    public d(int i) {
        m3.p pVar = new m3.p(10);
        this.f35798c = pVar;
        byte[] bArr = pVar.f28589a;
        this.f35799d = new y2(bArr.length, bArr);
    }

    @Override // q4.k
    public final int a(q4.l lVar, e2 e2Var) throws d0 {
        this.f35800e.getClass();
        lVar.getLength();
        m3.p pVar = this.f35797b;
        int i = lVar.read(pVar.f28589a, 0, 2048);
        boolean z5 = i == -1;
        if (!this.i) {
            this.f35800e.j(new q4.o(-9223372036854775807L));
            this.i = true;
        }
        if (z5) {
            return -1;
        }
        pVar.M(0);
        pVar.L(i);
        boolean z10 = this.f35803h;
        e eVar = this.f35796a;
        if (!z10) {
            eVar.f35824u = this.f35801f;
            this.f35803h = true;
        }
        eVar.c(pVar);
        return 0;
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        this.f35800e = mVar;
        this.f35796a.e(mVar, new r9(0, 1));
        mVar.G();
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        int i = 0;
        while (true) {
            m3.p pVar = this.f35798c;
            lVar.V(pVar.f28589a, 0, 10);
            pVar.M(0);
            if (pVar.C() != 4801587) {
                break;
            }
            pVar.N(3);
            int iY = pVar.y();
            i += iY + 10;
            lVar.B(iY);
        }
        lVar.L();
        lVar.B(i);
        if (this.f35802g == -1) {
            this.f35802g = i;
        }
        int i10 = i;
        int i11 = 0;
        int i12 = 0;
        do {
            m3.p pVar2 = this.f35798c;
            q4.h hVar = (q4.h) lVar;
            hVar.y(pVar2.f28589a, 0, 2, false);
            pVar2.M(0);
            if ((pVar2.G() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.y(pVar2.f28589a, 0, 4, false);
                y2 y2Var = this.f35799d;
                y2Var.q(14);
                int i13 = y2Var.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f31741g = 0;
                    hVar.a(i10, false);
                } else {
                    hVar.a(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f31741g = 0;
                hVar.a(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i < 8192);
        return false;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f35803h = false;
        this.f35796a.a();
        this.f35801f = j11;
    }

    @Override // q4.k
    public final void release() {
    }
}
