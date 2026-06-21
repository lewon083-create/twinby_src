package x5;

import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.r9;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f35776a = new b("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.p f35777b = new m3.p(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35778c;

    @Override // q4.k
    public final int a(q4.l lVar, e2 e2Var) {
        m3.p pVar = this.f35777b;
        int i = lVar.read(pVar.f28589a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        pVar.M(0);
        pVar.L(i);
        boolean z5 = this.f35778c;
        b bVar = this.f35776a;
        if (!z5) {
            bVar.f35792o = 0L;
            this.f35778c = true;
        }
        bVar.c(pVar);
        return 0;
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        this.f35776a.e(mVar, new r9(0, 1));
        mVar.G();
        mVar.j(new q4.o(-9223372036854775807L));
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        q4.h hVar;
        int iH;
        m3.p pVar = new m3.p(10);
        int i = 0;
        while (true) {
            hVar = (q4.h) lVar;
            hVar.y(pVar.f28589a, 0, 10, false);
            pVar.M(0);
            if (pVar.C() != 4801587) {
                break;
            }
            pVar.N(3);
            int iY = pVar.y();
            i += iY + 10;
            hVar.a(iY, false);
        }
        hVar.f31741g = 0;
        hVar.a(i, false);
        int i10 = 0;
        int i11 = i;
        while (true) {
            hVar.y(pVar.f28589a, 0, 6, false);
            pVar.M(0);
            if (pVar.G() != 2935) {
                hVar.f31741g = 0;
                i11++;
                if (i11 - i >= 8192) {
                    break;
                }
                hVar.a(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = pVar.f28589a;
                if (bArr.length < 6) {
                    iH = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iH = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    iH = q4.b.h((b2 & 192) >> 6, b2 & 63);
                }
                if (iH == -1) {
                    break;
                }
                hVar.a(iH - 6, false);
            }
        }
        return false;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f35778c = false;
        this.f35776a.a();
    }

    @Override // q4.k
    public final void release() {
    }
}
