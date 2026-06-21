package x5;

import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.r9;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements q4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f35793a = new b(0, 1, null, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.p f35794b = new m3.p(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35795c;

    @Override // q4.k
    public final int a(q4.l lVar, e2 e2Var) {
        m3.p pVar = this.f35794b;
        int i = lVar.read(pVar.f28589a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        pVar.M(0);
        pVar.L(i);
        boolean z5 = this.f35795c;
        b bVar = this.f35793a;
        if (!z5) {
            bVar.f35792o = 0L;
            this.f35795c = true;
        }
        bVar.c(pVar);
        return 0;
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        this.f35793a.e(mVar, new r9(0, 1));
        mVar.G();
        mVar.j(new q4.o(-9223372036854775807L));
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        q4.h hVar;
        int i;
        m3.p pVar = new m3.p(10);
        int i10 = 0;
        while (true) {
            hVar = (q4.h) lVar;
            hVar.y(pVar.f28589a, 0, 10, false);
            pVar.M(0);
            if (pVar.C() != 4801587) {
                break;
            }
            pVar.N(3);
            int iY = pVar.y();
            i10 += iY + 10;
            hVar.a(iY, false);
        }
        hVar.f31741g = 0;
        hVar.a(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            hVar.y(pVar.f28589a, 0, 7, false);
            pVar.M(0);
            int iG = pVar.G();
            if (iG == 44096 || iG == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = pVar.f28589a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iG == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    break;
                }
                hVar.a(i - 7, false);
            } else {
                hVar.f31741g = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                hVar.a(i12, false);
                i11 = 0;
            }
        }
        return false;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f35795c = false;
        this.f35793a.a();
    }

    @Override // q4.k
    public final void release() {
    }
}
